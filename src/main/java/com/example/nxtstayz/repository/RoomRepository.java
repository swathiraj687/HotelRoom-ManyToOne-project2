/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.Room;

import com.example.nxtstayz.model.Hotel;

import java.util.ArrayList;

public interface RoomRepository {
    ArrayList<Room> getRooms();

    Room addRoom(Room room);

    Room getRoomById(int roomId);

    Room updateRoom(int roomId, Room room);

    void deleteRoom(int roomId);

    Hotel getRoomHotel(int roomId);
}