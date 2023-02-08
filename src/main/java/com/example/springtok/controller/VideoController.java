package com.example.springtok.controller;

import com.example.springtok.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

//    1. Constructor injection
//      2. Setter Injection
//      3. Field Injection



    //Field Injection
   // @Autowired
    private final  VideoRepository videoRepository;


    //Setter Injection
//    public void setVideoRepository(VideoRepository videoRepository){
//        this.videoRepository = videoRepository;
//    }

    //  Constructor injection
    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }


    public String nextVideo(){
        return "Next video";
    }
}
