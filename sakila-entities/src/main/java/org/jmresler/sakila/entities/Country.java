/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmresler.sakila.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author John
 */
@Entity
@Table(name = "country", catalog = "sakila", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Country.findAll", query = "SELECT c FROM Country c"),
    @NamedQuery(name = "Country.findByCountryId", query = "SELECT c FROM Country c WHERE c.countryId = :countryId"),
    @NamedQuery(name = "Country.findByCountry", query = "SELECT c FROM Country c WHERE c.country = :country"),
    @NamedQuery(name = "Country.findByLastUpdate", query = "SELECT c FROM Country c WHERE c.lastUpdate = :lastUpdate")})
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "country_id", nullable = false)
    private Long countryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "country", nullable = false, length = 50)
    private String country;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_update", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "countryId")
    private Collection<City> cityCollection;

    public Country() {
    }

    public Country(Long countryId) {
        this.countryId = countryId;
    }

    public Country(Long countryId, String country, Date lastUpdate) {
        this.countryId = countryId;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @XmlTransient
    public Collection<City> getCityCollection() {
        return cityCollection;
    }

    public void setCityCollection(Collection<City> cityCollection) {
        this.cityCollection = cityCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryId != null ? countryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Country)) {
            return false;
        }
        Country other = (Country) object;
        if ((this.countryId == null && other.countryId != null) || (this.countryId != null && !this.countryId.equals(other.countryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jmresler.sakila.entities.Country[ countryId=" + countryId + " ]";
    }
    
}
