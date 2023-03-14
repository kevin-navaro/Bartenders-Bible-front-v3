package com.bartendersbible.bartendersbiblefinal.controller;

import com.bartendersbible.bartendersbiblefinal.entities.Review;
import com.bartendersbible.bartendersbiblefinal.entities.User;
import com.bartendersbible.bartendersbiblefinal.repositories.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/review")
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @GetMapping("/review")
    public List<Review> retrieveAllReviews(){
        return reviewRepository.findAll();
    }

    @GetMapping("/review/{id}")
    public Optional<Review> retrieveReview(@PathVariable long id) {
        Optional<Review> review = reviewRepository.findById(id);

        if(review.isEmpty())
            try {
                throw new UserPrincipalNotFoundException("id-" + id);
            } catch (UserPrincipalNotFoundException e) {
                throw new RuntimeException(e);
            }

        return Optional.of(review.get());

    }

    @DeleteMapping("/review/{id}")
    public void deleteReview(@PathVariable long id){
        reviewRepository.deleteById(id);
    }

    @PostMapping("/review")
    public ResponseEntity<Object> createReview(@RequestBody Review review) {
        User savedUser = reviewRepository.save(review).getUser();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/review/{id}")
    public ResponseEntity<Object> updateReview(@RequestBody Review review, @PathVariable long id) {

        Optional<Review> userOptional = reviewRepository.findById(id);

        if (userOptional.isEmpty())
            return ResponseEntity.notFound().build();

        review.setId(id);

        reviewRepository.save(review);

        return ResponseEntity.noContent().build();
    }
}
