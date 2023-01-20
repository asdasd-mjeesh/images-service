package com.image_service.service.images;

import com.image_service.model.dto.request.ProductImageRequest;
import com.image_service.model.dto.response.ProductImageResponse;

public interface ImagesCloudCommunicationService {
    void save(ProductImageRequest productImage);

    ProductImageResponse getAllFromFolder(String folderName);
}
