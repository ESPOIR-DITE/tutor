package com.kaldit.tutor.factory.level;

import com.kaldit.tutor.domain.level.Level;

import java.util.Optional;
import java.util.UUID;

public class LevelFactory {
    private static Level level = null;
    public static Optional<Level> build(String name,String description){
        level = Level.builder().id(UUID.randomUUID().toString()).description(description).name(name).build();
        return Optional.ofNullable(level);
    }
}
