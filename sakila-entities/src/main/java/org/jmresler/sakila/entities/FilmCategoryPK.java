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
public class FilmCategoryPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "film_id", nullable = false)
    private long filmId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id", nullable = false)
    private long categoryId;

    public FilmCategoryPK() {
    }

    public FilmCategoryPK(long filmId, long categoryId) {
        this.filmId = filmId;
        this.categoryId = categoryId;
    }

    public long getFilmId() {
        return filmId;
    }

    public void setFilmId(long filmId) {
        this.filmId = filmId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) filmId;
        hash += (int) categoryId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilmCategoryPK)) {
            return false;
        }
        FilmCategoryPK other = (FilmCategoryPK) object;
        if (this.filmId != other.filmId) {
            return false;
        }
        if (this.categoryId != other.categoryId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jmresler.sakila.entities.FilmCategoryPK[ filmId=" + filmId + ", categoryId=" + categoryId + " ]";
    }
    
}
