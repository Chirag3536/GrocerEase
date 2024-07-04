package com.chirag.service;

import java.util.List;

import com.chirag.Exception.ReviewException;
import com.chirag.model.Review;
import com.chirag.model.User;
import com.chirag.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
