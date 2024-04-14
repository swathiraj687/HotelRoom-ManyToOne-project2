/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.Hotel;
import com.example.nxtstayz.model.Room;

import java.util.ArrayList;
import java.util.List;

public interface HotelRepository {
    ArrayList<Hotel> getHotels();

    Hotel addHotel(Hotel hotel);

    Hotel getHotelById(int hotelId);

    Hotel updateHotel(int hotelId, Hotel hotel);

    void deleteHotel(int hotelId);

    List<Room> getHotelRooms(int hotelId);

}