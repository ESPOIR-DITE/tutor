package com.kaldit.tutor.controller.level.impl;

import com.kaldit.tutor.controller.level.LevelController;
import com.kaldit.tutor.domain.level.Level;
import com.kaldit.tutor.factory.level.LevelFactory;
import com.kaldit.tutor.service.level.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kaldit-tutor/level/")
public class LevelControllerImpl implements LevelController {
    private LevelService levelService;

    @Autowired
    public LevelControllerImpl(LevelService levelService) {
        this.levelService = levelService;
    }

    @PostMapping("create")
    @Override
    public Level create(@RequestBody Level level) {
        Optional<Level> level1 = LevelFactory.build(level.getName(),level.getDescription());
        if(level1.isPresent()){
            levelService.create(level1.get());
            return level1.get();
        }
        return null;
    }

    @GetMapping("reads")
    @Override
    public List<Level> readAll() {
        return levelService.readAll();
    }

    @GetMapping("read")
    @Override
    public Level read(@RequestParam("id") String id) {
        if(levelService.read(id).isPresent())
            return levelService.read(id).get();
        return null;
    }

    @PostMapping("delete")
    @Override
    public void delete(@RequestBody Level level) {
        levelService.delete(level);
    }

    @PostMapping("update")
    @Override
    public Level update(@RequestBody Level level) {
        return levelService.update(level);
    }
}
