package com.image_service.model.dto.response;

import com.image_service.model.dto.request.ImageRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductImageResponse {
    private String productName;
    private ImageRequest[] images;
}
