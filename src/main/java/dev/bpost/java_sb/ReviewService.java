package dev.bpost.java_sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

//import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
//import static org.apache.logging.log4j.util.Lazy.value;
//import static org.apache.tomcat.jni.SSLConf.apply;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
//    public Review createReview(String reviewBody, String id) {
//        Review review = reviewRepository.insert(new Review(reviewBody));
//
//        mongoTemplate.update(Movie.class)
//                .matching(Criteria.where(key: "id").is(id))
//                .apply(new Update().push(key: "reviewIds").value(review))
//                .first();
//
//        return review;
//    }
}
