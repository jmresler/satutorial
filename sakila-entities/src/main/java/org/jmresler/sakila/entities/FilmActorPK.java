/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmresler.sakila.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author John
 */
@Embeddable
public class FilmActorPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "actor_id", nullable = false)
    private long actorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "film_id", nullable = false)
    private long filmId;

    public FilmActorPK() {
    }

    public FilmActorPK(long actorId, long filmId) {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    public long getFilmId() {
        return filmId;
    }

    public void setFilmId(long filmId) {
        this.filmId = filmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) actorId;
        hash += (int) filmId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilmActorPK)) {
            return false;
        }
        FilmActorPK other = (FilmActorPK) object;
        if (this.actorId != other.actorId) {
            return false;
        }
        if (this.filmId != other.filmId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jmresler.sakila.entities.FilmActorPK[ actorId=" + actorId + ", filmId=" + filmId + " ]";
    }
    
}
