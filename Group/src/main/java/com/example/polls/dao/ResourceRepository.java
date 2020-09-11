package com.example.polls.dao;

import com.example.polls.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {

    Resource findByResourceName(String resource_name);
    Resource findByResourceCode(int resourceCode);
   @Transactional
    void deleteByResourceCode(int resourceCode);
}