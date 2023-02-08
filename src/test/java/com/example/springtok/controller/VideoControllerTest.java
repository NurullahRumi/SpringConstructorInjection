package com.example.springtok.controller;

import com.example.springtok.repository.VideoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VideoControllerTest {

    @MockBean
    private VideoRepository videoRepository;

    @Autowired
    private VideoController videoController;

    @Test
    public void contextLoads(){
        Assertions.assertNotNull(videoController);
        Assertions.assertNotNull(videoRepository);
    }
}