/*
 * Copyright (c) 2025 Kaxxu . All Rights Reserved.
 * This code is a personal project and is not affiliated with any employer.
 */
package com.example.journo.Controller;
import com.example.journo.Model.Journo;
import com.example.journo.Service.JournoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/journly")
public class JournoController
{
    @Autowired
    JournoService service;

    @PostMapping
    public Journo newEntry(@RequestBody Journo journo)
    {
        return service.createEntry(journo);
    }

    @GetMapping()
    public List<Journo> ShowAll()
    {
        return service.getALlEntries();
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id)
    {
        service.delete(id);
    }

    @DeleteMapping
    public void clear()
    {
        service.deleteall();
    }

    @GetMapping("/{id}")
    public Journo Search(@PathVariable int id)
    {
        return service.GetByid(id);
    }
}
