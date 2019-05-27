/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmresler.sakila.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author John
 */
@Entity
@Table(name = "film_text", catalog = "sakila", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FilmText.findAll", query = "SELECT f FROM FilmText f"),
    @NamedQuery(name = "FilmText.findByFilmId", query = "SELECT f FROM FilmText f WHERE f.filmId = :filmId"),
    @NamedQuery(name = "FilmText.findByTitle", query = "SELECT f FROM FilmText f WHERE f.title = :title")})
public class FilmText implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "film_id", nullable = false)
    private Long filmId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Lob
    @Size(max = 65535)
    @Column(name = "description", length = 65535)
    private String description;

    public FilmText() {
    }

    public FilmText(Long filmId) {
        this.filmId = filmId;
    }

    public FilmText(Long filmId, String title) {
        this.filmId = filmId;
        this.title = title;
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filmId != null ? filmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilmText)) {
            return false;
        }
        FilmText other = (FilmText) object;
        if ((this.filmId == null && other.filmId != null) || (this.filmId != null && !this.filmId.equals(other.filmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jmresler.sakila.entities.FilmText[ filmId=" + filmId + " ]";
    }
    
}
