package live.hms.video.polls.models.question;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import live.hms.video.polls.models.answer.HMSPollQuestionAnswer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/polls/models/question/HmsPollQuestionContainer;", "", "question", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "options", "", "Llive/hms/video/polls/models/question/HMSPollQuestionOption;", "correctAnswer", "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "<init>", "(Llive/hms/video/polls/models/question/HMSPollQuestion;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;)V", "getQuestion", "()Llive/hms/video/polls/models/question/HMSPollQuestion;", "getOptions", "()Ljava/util/List;", "getCorrectAnswer", "()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HmsPollQuestionContainer {

    @SerializedName("answer")
    private final HMSPollQuestionAnswer correctAnswer;

    @SerializedName("options")
    private final List<HMSPollQuestionOption> options;

    @SerializedName("question")
    private final HMSPollQuestion question;

    public HmsPollQuestionContainer(HMSPollQuestion question, List<HMSPollQuestionOption> list, HMSPollQuestionAnswer hMSPollQuestionAnswer) {
        AbstractC22676k.m65750j(question, "question");
        this.question = question;
        this.options = list;
        this.correctAnswer = hMSPollQuestionAnswer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HmsPollQuestionContainer copy$default(HmsPollQuestionContainer hmsPollQuestionContainer, HMSPollQuestion hMSPollQuestion, List list, HMSPollQuestionAnswer hMSPollQuestionAnswer, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSPollQuestion = hmsPollQuestionContainer.question;
        }
        if ((i13 & 2) != 0) {
            list = hmsPollQuestionContainer.options;
        }
        if ((i13 & 4) != 0) {
            hMSPollQuestionAnswer = hmsPollQuestionContainer.correctAnswer;
        }
        return hmsPollQuestionContainer.copy(hMSPollQuestion, list, hMSPollQuestionAnswer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMSPollQuestion getQuestion() {
        return this.question;
    }

    public final List<HMSPollQuestionOption> component2() {
        return this.options;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSPollQuestionAnswer getCorrectAnswer() {
        return this.correctAnswer;
    }

    public final HmsPollQuestionContainer copy(HMSPollQuestion question, List<HMSPollQuestionOption> options, HMSPollQuestionAnswer correctAnswer) {
        AbstractC22676k.m65750j(question, "question");
        return new HmsPollQuestionContainer(question, options, correctAnswer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmsPollQuestionContainer)) {
            return false;
        }
        HmsPollQuestionContainer hmsPollQuestionContainer = (HmsPollQuestionContainer) other;
        return AbstractC22676k.m65745e(this.question, hmsPollQuestionContainer.question) && AbstractC22676k.m65745e(this.options, hmsPollQuestionContainer.options) && AbstractC22676k.m65745e(this.correctAnswer, hmsPollQuestionContainer.correctAnswer);
    }

    public final HMSPollQuestionAnswer getCorrectAnswer() {
        return this.correctAnswer;
    }

    public final List<HMSPollQuestionOption> getOptions() {
        return this.options;
    }

    public final HMSPollQuestion getQuestion() {
        return this.question;
    }

    public int hashCode() {
        int iHashCode = this.question.hashCode() * 31;
        List<HMSPollQuestionOption> list = this.options;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        HMSPollQuestionAnswer hMSPollQuestionAnswer = this.correctAnswer;
        return iHashCode2 + (hMSPollQuestionAnswer != null ? hMSPollQuestionAnswer.hashCode() : 0);
    }

    public String toString() {
        return "HmsPollQuestionContainer(question=" + this.question + ", options=" + this.options + ", correctAnswer=" + this.correctAnswer + ')';
    }

    public /* synthetic */ HmsPollQuestionContainer(HMSPollQuestion hMSPollQuestion, List list, HMSPollQuestionAnswer hMSPollQuestionAnswer, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMSPollQuestion, (i13 & 2) != 0 ? hMSPollQuestion.getOptions() : list, (i13 & 4) != 0 ? hMSPollQuestion.getCorrectAnswer() : hMSPollQuestionAnswer);
    }
}
