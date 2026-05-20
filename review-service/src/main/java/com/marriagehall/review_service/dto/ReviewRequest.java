package com.marriagehall.review_service.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ReviewRequest {
    private UUID userId;
    private UUID hallId;
    private Integer rating;
    private String comment;

}
