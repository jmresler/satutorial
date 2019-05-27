package org.jmresler.sakila.auth;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

import static java.util.Collections.emptyList;

public class AuthenticationService {

	public static final long EXPIRATIONTIME = 864_000_00; // 1 day in milliseconds
	public static final String SIGNINGKEY = "SecretKey";
	public static final String PREFIX = "Bearer";

	/**
	 * 
	 * @param res
	 * @param userName
	 */
	public static void addToken(HttpServletResponse res, String userName) {
		String JwtToken = Jwts.builder()
							  .setSubject(userName)
							  .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
							  .signWith(SignatureAlgorithm.HS512, SIGNINGKEY)
							  .compact();
		
		res.addHeader("Authorization", PREFIX + " " + JwtToken);
		res.addHeader("Access-Control-Expose-Headers", "Authorization");
	}

	/**
	 * 
	 * @param request
	 * @return an authenticated user if successful, null otherwise
	 */
	public static Authentication getAuthentication(HttpServletRequest request) {
		String token = request.getHeader("Authorization");
		
		if (token != null) {
			String user = Jwts.parser()
							  .setSigningKey(SIGNINGKEY)
							  .parseClaimsJws(token.replace(PREFIX, ""))
							  .getBody()
							  .getSubject();

			if (user != null)
				return new UsernamePasswordAuthenticationToken(user, null, emptyList());
		}
		return null;
	}
}