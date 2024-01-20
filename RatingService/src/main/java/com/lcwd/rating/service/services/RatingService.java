package com.lcwd.rating.service.services;

import com.lcwd.rating.service.entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);

    //get all ratings

    List<Rating> getRatings();

    //get all rating by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all ratings by hotel
    List<Rating> getRatingByHotelId(String hotelId);


}
