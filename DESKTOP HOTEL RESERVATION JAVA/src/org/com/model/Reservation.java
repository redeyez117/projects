/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.model;

import java.sql.Date;


public class Reservation {
    private int clientID;
    private Date departTime;
    private Date returnTime;
    private int numberPersons;
    private int numberRooms;

    /**
     * @return the departTime
     */
    public Date getDepartTime() {
        return departTime;
    }

    /**
     * @param departTime the departTime to set
     */
    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    /**
     * @return the returnTime
     */
    public Date getReturnTime() {
        return returnTime;
    }

    /**
     * @param returnTime the returnTime to set
     */
    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * @return the numberPersons
     */
    public int getNumberPersons() {
        return numberPersons;
    }

    /**
     * @param numberPersons the numberPersons to set
     */
    public void setNumberPersons(int numberPersons) {
        this.numberPersons = numberPersons;
    }

    /**
     * @return the numberRooms
     */
    public int getNumberRooms() {
        return numberRooms;
    }

    /**
     * @param numberRooms the numberRooms to set
     */
    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    /**
     * @return the clientID
     */
    public int getClientID() {
        return clientID;
    }

    /**
     * @param clientID the clientID to set
     */
    public void setClientID(int clientID) {
        this.clientID = clientID;
    }
}
