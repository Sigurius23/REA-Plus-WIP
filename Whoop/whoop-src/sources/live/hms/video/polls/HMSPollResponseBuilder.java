package live.hms.video.polls;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.polls.models.HmsPoll;
import live.hms.video.polls.models.answer.HmsPollAnswer;
import live.hms.video.polls.models.question.HMSPollQuestion;
import live.hms.video.polls.models.question.HMSPollQuestionOption;
import live.hms.video.polls.models.question.HMSPollQuestionType;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0000¢\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J'\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u001bJ'\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/polls/HMSPollResponseBuilder;", "", "hmsPoll", "Llive/hms/video/polls/models/HmsPoll;", "userId", "", "<init>", "(Llive/hms/video/polls/models/HmsPoll;Ljava/lang/String;)V", "getHmsPoll", "()Llive/hms/video/polls/models/HmsPoll;", "getUserId", "()Ljava/lang/String;", "answers", "", "Llive/hms/video/polls/models/answer/HmsPollAnswer;", "getAllAnswers", "", "getAllAnswers$lib_release", "addResponse", "forQuestion", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "options", "Llive/hms/video/polls/models/question/HMSPollQuestionOption;", "durationMillis", "", "(Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/util/List;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;", "option", "(Llive/hms/video/polls/models/question/HMSPollQuestion;Llive/hms/video/polls/models/question/HMSPollQuestionOption;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;", "forOpenQuestion", "text", "(Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/lang/String;Ljava/lang/Long;)Llive/hms/video/polls/HMSPollResponseBuilder;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSPollResponseBuilder {
    private final List<HmsPollAnswer> answers;
    private final HmsPoll hmsPoll;
    private final String userId;

    public HMSPollResponseBuilder(HmsPoll hmsPoll, String str) {
        AbstractC22676k.m65750j(hmsPoll, "hmsPoll");
        this.hmsPoll = hmsPoll;
        this.userId = str;
        this.answers = new ArrayList();
    }

    public static /* synthetic */ HMSPollResponseBuilder addResponse$default(HMSPollResponseBuilder hMSPollResponseBuilder, HMSPollQuestion hMSPollQuestion, List list, Long l7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            l7 = null;
        }
        return hMSPollResponseBuilder.addResponse(hMSPollQuestion, (List<HMSPollQuestionOption>) list, l7);
    }

    public final HMSPollResponseBuilder addResponse(HMSPollQuestion forQuestion, List<HMSPollQuestionOption> options, Long durationMillis) {
        AbstractC22676k.m65750j(forQuestion, "forQuestion");
        AbstractC22676k.m65750j(options, "options");
        List<HmsPollAnswer> list = this.answers;
        int questionID = forQuestion.getQuestionID();
        HMSPollQuestionType type = forQuestion.getType();
        List<HMSPollQuestionOption> list2 = options;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((HMSPollQuestionOption) it.next()).getIndex()));
        }
        list.add(new HmsPollAnswer(questionID, type, false, 0, arrayList, null, false, durationMillis, 108, null));
        return this;
    }

    public final List<HmsPollAnswer> getAllAnswers$lib_release() {
        return this.answers;
    }

    public final HmsPoll getHmsPoll() {
        return this.hmsPoll;
    }

    public final String getUserId() {
        return this.userId;
    }

    public static /* synthetic */ HMSPollResponseBuilder addResponse$default(HMSPollResponseBuilder hMSPollResponseBuilder, HMSPollQuestion hMSPollQuestion, HMSPollQuestionOption hMSPollQuestionOption, Long l7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            l7 = null;
        }
        return hMSPollResponseBuilder.addResponse(hMSPollQuestion, hMSPollQuestionOption, l7);
    }

    public static /* synthetic */ HMSPollResponseBuilder addResponse$default(HMSPollResponseBuilder hMSPollResponseBuilder, HMSPollQuestion hMSPollQuestion, String str, Long l7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            l7 = null;
        }
        return hMSPollResponseBuilder.addResponse(hMSPollQuestion, str, l7);
    }

    public final HMSPollResponseBuilder addResponse(HMSPollQuestion forQuestion, HMSPollQuestionOption option, Long durationMillis) {
        AbstractC22676k.m65750j(forQuestion, "forQuestion");
        AbstractC22676k.m65750j(option, "option");
        this.answers.add(new HmsPollAnswer(forQuestion.getQuestionID(), forQuestion.getType(), false, option.getIndex(), null, null, false, durationMillis, 116, null));
        return this;
    }

    public final HMSPollResponseBuilder addResponse(HMSPollQuestion forOpenQuestion, String text, Long durationMillis) {
        AbstractC22676k.m65750j(forOpenQuestion, "forOpenQuestion");
        AbstractC22676k.m65750j(text, "text");
        Log.d("HMSPollResponseBuilder", String.valueOf(forOpenQuestion.getType()));
        this.answers.add(new HmsPollAnswer(forOpenQuestion.getQuestionID(), forOpenQuestion.getType(), false, 0, null, text, false, durationMillis, 92, null));
        return this;
    }
}
