package com.example.polls.service;

import com.example.polls.model.ProjectScope;

import java.util.List;


public interface ProjectScopeService {

    ProjectScope findByItemId(String itemId);
    ProjectScope saveProjectScope(ProjectScope projectScope);
    List<ProjectScope> findAll();
    //void deleteByItemId(String itemId);
}



