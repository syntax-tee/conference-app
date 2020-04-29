package com.taiye.conferenceapp.repositories;

import com.taiye.conferenceapp.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
