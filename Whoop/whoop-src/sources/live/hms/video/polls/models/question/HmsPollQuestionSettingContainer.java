package live.hms.video.polls.models.question;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import live.hms.video.polls.models.answer.HMSPollQuestionAnswer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/polls/models/question/HmsPollQuestionSettingContainer;", "", "questionContainer", "Llive/hms/video/polls/models/question/HmsPollQuestionCreation;", "options", "", "Llive/hms/video/polls/models/question/HMSPollQuestionOption;", "correctAnswer", "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "<init>", "(Llive/hms/video/polls/models/question/HmsPollQuestionCreation;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;)V", "question", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "(Llive/hms/video/polls/models/question/HMSPollQuestion;)V", "getQuestionContainer", "()Llive/hms/video/polls/models/question/HmsPollQuestionCreation;", "getOptions", "()Ljava/util/List;", "getCorrectAnswer", "()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HmsPollQuestionSettingContainer {

    @SerializedName("answer")
    private final HMSPollQuestionAnswer correctAnswer;

    @SerializedName("options")
    private final List<HMSPollQuestionOption> options;

    @SerializedName("question")
    private final HmsPollQuestionCreation questionContainer;

    public HmsPollQuestionSettingContainer(HmsPollQuestionCreation questionContainer, List<HMSPollQuestionOption> list, HMSPollQuestionAnswer hMSPollQuestionAnswer) {
        AbstractC22676k.m65750j(questionContainer, "questionContainer");
        this.questionContainer = questionContainer;
        this.options = list;
        this.correctAnswer = hMSPollQuestionAnswer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HmsPollQuestionSettingContainer copy$default(HmsPollQuestionSettingContainer hmsPollQuestionSettingContainer, HmsPollQuestionCreation hmsPollQuestionCreation, List list, HMSPollQuestionAnswer hMSPollQuestionAnswer, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hmsPollQuestionCreation = hmsPollQuestionSettingContainer.questionContainer;
        }
        if ((i13 & 2) != 0) {
            list = hmsPollQuestionSettingContainer.options;
        }
        if ((i13 & 4) != 0) {
            hMSPollQuestionAnswer = hmsPollQuestionSettingContainer.correctAnswer;
        }
        return hmsPollQuestionSettingContainer.copy(hmsPollQuestionCreation, list, hMSPollQuestionAnswer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HmsPollQuestionCreation getQuestionContainer() {
        return this.questionContainer;
    }

    public final List<HMSPollQuestionOption> component2() {
        return this.options;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSPollQuestionAnswer getCorrectAnswer() {
        return this.correctAnswer;
    }

    public final HmsPollQuestionSettingContainer copy(HmsPollQuestionCreation questionContainer, List<HMSPollQuestionOption> options, HMSPollQuestionAnswer correctAnswer) {
        AbstractC22676k.m65750j(questionContainer, "questionContainer");
        return new HmsPollQuestionSettingContainer(questionContainer, options, correctAnswer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmsPollQuestionSettingContainer)) {
            return false;
        }
        HmsPollQuestionSettingContainer hmsPollQuestionSettingContainer = (HmsPollQuestionSettingContainer) other;
        return AbstractC22676k.m65745e(this.questionContainer, hmsPollQuestionSettingContainer.questionContainer) && AbstractC22676k.m65745e(this.options, hmsPollQuestionSettingContainer.options) && AbstractC22676k.m65745e(this.correctAnswer, hmsPollQuestionSettingContainer.correctAnswer);
    }

    public final HMSPollQuestionAnswer getCorrectAnswer() {
        return this.correctAnswer;
    }

    public final List<HMSPollQuestionOption> getOptions() {
        return this.options;
    }

    public final HmsPollQuestionCreation getQuestionContainer() {
        return this.questionContainer;
    }

    public int hashCode() {
        int iHashCode = this.questionContainer.hashCode() * 31;
        List<HMSPollQuestionOption> list = this.options;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        HMSPollQuestionAnswer hMSPollQuestionAnswer = this.correctAnswer;
        return iHashCode2 + (hMSPollQuestionAnswer != null ? hMSPollQuestionAnswer.hashCode() : 0);
    }

    public String toString() {
        return "HmsPollQuestionSettingContainer(questionContainer=" + this.questionContainer + ", options=" + this.options + ", correctAnswer=" + this.correctAnswer + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HmsPollQuestionSettingContainer(HMSPollQuestion question) {
        this(new HmsPollQuestionCreation(question), question.getOptions(), question.getCorrectAnswer());
        AbstractC22676k.m65750j(question, "question");
    }
}
