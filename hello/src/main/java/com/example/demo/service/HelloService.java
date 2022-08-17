package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.HelloEntity;
import com.example.demo.repository.HelloRepository;

@Service
@Transactional
public class HelloService {

    @Autowired
    HelloRepository hellorepository;


    public List<HelloEntity> findAll() {
        return hellorepository.findAll();
    }
}