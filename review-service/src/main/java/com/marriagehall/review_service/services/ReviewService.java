package com.marriagehall.review_service.services;

import com.marriagehall.review_service.dto.ReviewRequest;
import com.marriagehall.review_service.model.Review;
import com.marriagehall.review_service.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public Review createReview(ReviewRequest reviewRequest) {

        Review review = new Review();

        review.setUserId(reviewRequest.getUserId());
        review.setHallId(reviewRequest.getHallId());
        review.setRating(reviewRequest.getRating());
        review.setComment(reviewRequest.getComment());
        return  reviewRepository.save(review);


    }

    public List<Review> getHallReviews(UUID hallId){
        return reviewRepository.findByHallId(hallId);
    }

    public Double getAverageRating(UUID hallId){
      return reviewRepository.getAverageRating(hallId);

    }
}
