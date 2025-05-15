package com.nandini.springbootmongodb.service;

import com.nandini.springbootmongodb.collection.Photo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PhotoService {
    String addPhoto(String originalFilename, MultipartFile image) throws IOException, IOException;

    Photo getPhoto(String id);
}
