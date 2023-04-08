package com.example.rest_api_project.repository;

import com.example.rest_api_project.entity.Club;
import com.example.rest_api_project.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface PlayerRepo extends JpaRepository<Player, Integer> {

    //public List<Player> findByClubId(int id);

}
