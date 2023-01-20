package com.image_service.api.rest_controller;

import com.image_service.model.dto.request.ProductImageRequest;
import com.image_service.service.images.ImagesCloudCommunicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product-images")
public class ProductImageControllerV1 {
    private final ImagesCloudCommunicationService imagesCloudCommunicationService;

    @PostMapping("/")
    public ResponseEntity<String> saveProductImages(@RequestBody ProductImageRequest productImage) {
        imagesCloudCommunicationService.save(productImage);
        return ResponseEntity.ok("images were saved successfully");
    }
}
