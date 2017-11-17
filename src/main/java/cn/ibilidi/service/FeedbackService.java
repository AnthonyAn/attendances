package cn.ibilidi.service;

import cn.ibilidi.model.Feedback;

import java.util.ArrayList;


public interface FeedbackService {
    int addFeedback(Feedback feedback);
    ArrayList<Feedback> getFeedbacks();

}
