package com.kaldit.tutor.repository.level;

import com.kaldit.tutor.domain.level.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LevelRepository extends JpaRepository<Level,String> {
}
