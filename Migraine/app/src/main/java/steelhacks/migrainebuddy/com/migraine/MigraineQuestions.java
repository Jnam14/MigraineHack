package steelhacks.migrainebuddy.com.migraine;

/**
 * Created by Jason on 2/19/2016.
 */
public class MigraineQuestions {
    public String question;
    public String answer;


    public MigraineQuestions(String mQue, String mAns){
        super();

        question = mQue;
        answer = mAns;

    }

    public String getQue() {
        return question;
    }

    public String getAns() {
        return answer;
    }

}
