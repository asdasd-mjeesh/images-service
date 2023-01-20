package com.image_service.service.images;

import com.image_service.model.dto.request.ProductImageRequest;
import com.image_service.model.dto.response.ProductImageResponse;
import org.springframework.stereotype.Service;

@Service
public class AmazonS3ImagesCommunicationService implements ImagesCloudCommunicationService {

    @Override
    public void save(ProductImageRequest productImage) {

    }

    @Override
    public ProductImageResponse getAllFromFolder(String folderName) {
        return null;
    }
}
