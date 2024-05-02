package org.com.estatemate.services;

import java.util.List;

import org.com.estatemate.entities.Image;
import org.com.estatemate.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }

    public Image findImageById(Long id) {
        return imageRepository.findById(id).orElse(null);
    }

    public List<Image> getImagesByProperty(Long propertyId) {
        return imageRepository.findByProperty_Id(propertyId);
    }

    public void deleteImage(Long id) {
        imageRepository.deleteById(id);
    }
}
