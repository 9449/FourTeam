package com.quedu.fourteam.dao;

import com.quedu.fourteam.pojo.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamDao extends JpaRepository<Team,Integer> {
}
