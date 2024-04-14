/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.nxtstayz.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.example.nxtstayz.model.Hotel;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int roomId;
    @Column(name = "roomnumber")
    private String roomName;
    @Column(name = "type")
    private String type;
    @Column(name = "price")
    private double price;
    @ManyToOne
    @JoinColumn(name = "hotelid")
    @JsonIgnoreProperties("rooms")
    private Hotel hotel;

    public Room() {
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomName;
    }

    public void setRoomNumber(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return type;
    }

    public void setRoomType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}