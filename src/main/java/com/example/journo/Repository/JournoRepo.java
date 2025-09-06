package com.example.journo.Repository;

import com.example.journo.Model.Journo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournoRepo extends JpaRepository <Journo,Integer>
{

}
