package com.kaldit.tutor.service.level.impl;

import com.kaldit.tutor.domain.level.Level;
import com.kaldit.tutor.repository.level.LevelRepository;
import com.kaldit.tutor.service.level.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LevelServiceImpl implements LevelService {
    private LevelRepository levelRepository;

    @Autowired
    public LevelServiceImpl(LevelRepository levelRepository) {
        this.levelRepository = levelRepository;
    }

    @Override
    public Level create(Level level) {
        return levelRepository.save(level);
    }

    @Override
    public List<Level> readAll() {
        return levelRepository.findAll();
    }

    @Override
    public Optional<Level> read(String id) {
        return levelRepository.findById(id);
    }

    @Override
    public void delete(Level level) {
        levelRepository.delete(level);
    }

    @Override
    public Level update(Level level) {
        return levelRepository.save(level);
    }
}
