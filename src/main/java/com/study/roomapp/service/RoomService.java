package com.study.roomapp.service;

import com.study.roomapp.data.RoomRepository;
import com.study.roomapp.modules.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public List<Room> getAllRooms() {

        return roomRepository.findAll();
    }
}
