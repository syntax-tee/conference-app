package com.taiye.conferenceapp.repositories;

import com.taiye.conferenceapp.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {

}
