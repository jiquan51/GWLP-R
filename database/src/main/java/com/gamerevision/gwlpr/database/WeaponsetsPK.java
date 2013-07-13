/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 *
 * @author _rusty
 */
@Embeddable 
public class WeaponsetsPK implements Serializable 
{
    @Basic(optional = false)
    @Column(name = "CharacterID")
    private int characterID;
    @Basic(optional = false)
    @Column(name = "Number")
    private boolean number;

    public WeaponsetsPK() {
    }

    public WeaponsetsPK(int characterID, boolean number) {
        this.characterID = characterID;
        this.number = number;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public boolean getNumber() {
        return number;
    }

    public void setNumber(boolean number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) characterID;
        hash += (number ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WeaponsetsPK)) {
            return false;
        }
        WeaponsetsPK other = (WeaponsetsPK) object;
        if (this.characterID != other.characterID) {
            return false;
        }
        if (this.number != other.number) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gamerevision.gwlpr.database.WeaponsetsPK[ characterID=" + characterID + ", number=" + number + " ]";
    }

}
