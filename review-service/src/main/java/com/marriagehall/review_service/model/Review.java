package com.marriagehall.review_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    private UUID userId;
    private UUID hallId;

    @Min(1)
    @Max(5)
    private Integer rating;

    @Column(length = 100)
    private String comment;
}
