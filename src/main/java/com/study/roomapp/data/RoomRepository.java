package com.study.roomapp.data;

import com.study.roomapp.modules.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoomRepository extends JpaRepository<Room,Long> {
}
