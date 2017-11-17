package cn.ibilidi.dao;

import cn.ibilidi.model.Feedback;

import java.util.ArrayList;

public interface FeedbackDao {
    int insertFeedback(Feedback feedback);
    ArrayList<Feedback> getFeedbacks();
}
