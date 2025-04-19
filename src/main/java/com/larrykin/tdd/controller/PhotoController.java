package com.larrykin.tdd.controller;

import com.larrykin.tdd.models.Photo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/photos")
@RestController
public class PhotoController {

    @GetMapping
    public List<Photo> getAllPhotos() {
        List<Photo> photos = new ArrayList<>();
        photos.add(new Photo(1,1, "first", "https://first-url", "https://first-thumbnail"));
        photos.add(new Photo(1,1, "second", "https://second-url", "https://second-thumbnail"));
        photos.add(new Photo(1,1, "third", "https://third-url", "https://third-thumbnail"));
        return photos;
    }
}
