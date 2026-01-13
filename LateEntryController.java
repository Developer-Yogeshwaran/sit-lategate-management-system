package com.college.lateentry.controller;

import com.college.lateentry.model.LateEntry;
import com.college.lateentry.service.LateEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/late-entry")
@CrossOrigin
public class LateEntryController {

    @Autowired
    private LateEntryService service;

    @PostMapping("/add")
    public String add(@RequestBody LateEntry entry) {
        service.save(entry);
        return "Late entry added";
    }

    @GetMapping("/all")
    public List<LateEntry> all() {
        return service.getAll();
    }
}

