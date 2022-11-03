package com.pryataLearningHub.Conferencedemo.repositories;

import com.pryataLearningHub.Conferencedemo.models.Speakers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speakers,Long> {
}
