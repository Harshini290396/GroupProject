package com.example.polls.service.impl;

import com.example.polls.dao.ProjectRepository;
import com.example.polls.model.Project;
import com.example.polls.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project findByProjectName(String projectName){
        return projectRepository.findByProjectName(projectName);
    }

    @Override
    public Project findByProjectCode(int projectCode){
        return projectRepository.findByProjectCode(projectCode);
    }

    @Override
    public void deleteByProjectCode(int projectCode){
        projectRepository.deleteByProjectCode(projectCode);
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);

    }

    @Override
    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }
}
