package cn.ibilidi.serviceimp;

import cn.ibilidi.dao.FeedbackDao;
import cn.ibilidi.model.Feedback;
import cn.ibilidi.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class FeedbackServiceImp implements FeedbackService {
    @Autowired
    FeedbackDao feedbackDao;

    public int addFeedback(Feedback feedback) {
        return feedbackDao.insertFeedback(feedback);
    }

    public ArrayList<Feedback> getFeedbacks() {
        return feedbackDao.getFeedbacks();
    }
}
