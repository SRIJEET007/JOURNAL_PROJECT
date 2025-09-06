package com.example.journo.Service;
import com.example.journo.Model.Journo;
import com.example.journo.Repository.JournoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class JournoService {

    private final JournoRepo repo;

    @Autowired
    public JournoService(JournoRepo repo)  // constructor injection of repository.
    {
        this.repo=repo;
    }


    //saving an entry
    public Journo createEntry(Journo journo)
    {
        return repo.save(journo);
    }

    //fetchin all entries
    public List<Journo> getALlEntries()
    {
        return repo.findAll();
    }

    //deleting an entry
    public void delete(int id)
    {
        repo.deleteById(id);
    }

    //get an entry by id.
    public Journo GetByid(int id) {
        Optional<Journo> journoOptional = repo.findById(id);
        return journoOptional.orElse(null);
    }

    //delete all entries.
    public void deleteall()
    {
        repo.deleteAll();
    }


}
