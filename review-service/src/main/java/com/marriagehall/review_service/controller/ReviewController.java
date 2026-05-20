package com.marriagehall.review_service.controller;

import com.marriagehall.review_service.dto.ReviewRequest;
import com.marriagehall.review_service.model.Review;
import com.marriagehall.review_service.services.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewController {

   private final ReviewService reviewService;

   @PostMapping("/add")
   public ResponseEntity<Review> createReview(@RequestBody ReviewRequest  reviewRequest){
       return ResponseEntity.ok(reviewService.createReview(reviewRequest));
   }

   @GetMapping("/{hallId}")
   public ResponseEntity<?> getReview(@PathVariable UUID id){
       return ResponseEntity.ok(reviewService.getHallReviews(id));

   }

   public ResponseEntity<?> averageRating(@PathVariable UUID hallId){
       return ResponseEntity.ok(reviewService.getAverageRating(hallId));
   }



}
