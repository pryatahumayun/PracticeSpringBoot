package com.pryataLearningHub.Conferencedemo.repositories;

import com.pryataLearningHub.Conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository  extends JpaRepository <Session, Long>{
}
