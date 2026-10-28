package live.hms.video.polls.models.question;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.polls.models.answer.HMSPollQuestionAnswer;
import live.hms.video.polls.models.answer.HmsPollAnswer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b3\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010(J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J¤\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\t\u0010J\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R$\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u00105R\u0011\u00106\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b7\u0010\"¨\u0006K"}, m65681d2 = {"Llive/hms/video/polls/models/question/HMSPollQuestion;", "", "questionID", "", "type", "Llive/hms/video/polls/models/question/HMSPollQuestionType;", "text", "", "canSkip", "", "canChangeResponse", AttachmentExtensionsKt.EXTRA_DURATION, "", "weight", "answerShortMinLength", "answerLongMinLength", "options", "", "Llive/hms/video/polls/models/question/HMSPollQuestionOption;", "correctAnswer", "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "negative", "myResponses", "", "Llive/hms/video/polls/models/answer/HmsPollAnswer;", "<init>", "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;)V", "getQuestionID", "()I", "getType", "()Llive/hms/video/polls/models/question/HMSPollQuestionType;", "getText", "()Ljava/lang/String;", "getCanSkip", "()Z", "getCanChangeResponse", "getDuration", "()J", "getWeight", "getAnswerShortMinLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnswerLongMinLength", "getOptions", "()Ljava/util/List;", "getCorrectAnswer", "()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "getNegative", "getMyResponses", "value", "total", "getTotal", "setTotal$lib_release", "(I)V", "voted", "getVoted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;ZLjava/util/List;)Llive/hms/video/polls/models/question/HMSPollQuestion;", "equals", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSPollQuestion {

    @SerializedName("answer_max_len")
    private final Long answerLongMinLength;

    @SerializedName("answer_min_len")
    private final Long answerShortMinLength;

    @SerializedName("once")
    private final boolean canChangeResponse;

    @SerializedName("skippable")
    private final boolean canSkip;

    @SerializedName("answer")
    private final HMSPollQuestionAnswer correctAnswer;

    @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
    private final long duration;
    private final List<HmsPollAnswer> myResponses;

    @SerializedName("negative")
    private final boolean negative;

    @SerializedName("options")
    private final List<HMSPollQuestionOption> options;

    @SerializedName("index")
    private final int questionID;

    @SerializedName("text")
    private final String text;
    private int total;

    @SerializedName("type")
    private final HMSPollQuestionType type;

    @SerializedName("weight")
    private final int weight;

    public HMSPollQuestion(int i13, HMSPollQuestionType type, String text, boolean z4, boolean z13, long j7, int i14, Long l7, Long l12, List<HMSPollQuestionOption> list, HMSPollQuestionAnswer hMSPollQuestionAnswer, boolean z14, List<HmsPollAnswer> myResponses) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(myResponses, "myResponses");
        this.questionID = i13;
        this.type = type;
        this.text = text;
        this.canSkip = z4;
        this.canChangeResponse = z13;
        this.duration = j7;
        this.weight = i14;
        this.answerShortMinLength = l7;
        this.answerLongMinLength = l12;
        this.options = list;
        this.correctAnswer = hMSPollQuestionAnswer;
        this.negative = z14;
        this.myResponses = myResponses;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getQuestionID() {
        return this.questionID;
    }

    public final List<HMSPollQuestionOption> component10() {
        return this.options;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final HMSPollQuestionAnswer getCorrectAnswer() {
        return this.correctAnswer;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getNegative() {
        return this.negative;
    }

    public final List<HmsPollAnswer> component13() {
        return this.myResponses;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSPollQuestionType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanSkip() {
        return this.canSkip;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCanChangeResponse() {
        return this.canChangeResponse;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getAnswerShortMinLength() {
        return this.answerShortMinLength;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getAnswerLongMinLength() {
        return this.answerLongMinLength;
    }

    public final HMSPollQuestion copy(int questionID, HMSPollQuestionType type, String text, boolean canSkip, boolean canChangeResponse, long duration, int weight, Long answerShortMinLength, Long answerLongMinLength, List<HMSPollQuestionOption> options, HMSPollQuestionAnswer correctAnswer, boolean negative, List<HmsPollAnswer> myResponses) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(myResponses, "myResponses");
        return new HMSPollQuestion(questionID, type, text, canSkip, canChangeResponse, duration, weight, answerShortMinLength, answerLongMinLength, options, correctAnswer, negative, myResponses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSPollQuestion)) {
            return false;
        }
        HMSPollQuestion hMSPollQuestion = (HMSPollQuestion) other;
        return this.questionID == hMSPollQuestion.questionID && this.type == hMSPollQuestion.type && AbstractC22676k.m65745e(this.text, hMSPollQuestion.text) && this.canSkip == hMSPollQuestion.canSkip && this.canChangeResponse == hMSPollQuestion.canChangeResponse && this.duration == hMSPollQuestion.duration && this.weight == hMSPollQuestion.weight && AbstractC22676k.m65745e(this.answerShortMinLength, hMSPollQuestion.answerShortMinLength) && AbstractC22676k.m65745e(this.answerLongMinLength, hMSPollQuestion.answerLongMinLength) && AbstractC22676k.m65745e(this.options, hMSPollQuestion.options) && AbstractC22676k.m65745e(this.correctAnswer, hMSPollQuestion.correctAnswer) && this.negative == hMSPollQuestion.negative && AbstractC22676k.m65745e(this.myResponses, hMSPollQuestion.myResponses);
    }

    public final Long getAnswerLongMinLength() {
        return this.answerLongMinLength;
    }

    public final Long getAnswerShortMinLength() {
        return this.answerShortMinLength;
    }

    public final boolean getCanChangeResponse() {
        return this.canChangeResponse;
    }

    public final boolean getCanSkip() {
        return this.canSkip;
    }

    public final HMSPollQuestionAnswer getCorrectAnswer() {
        return this.correctAnswer;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final List<HmsPollAnswer> getMyResponses() {
        return this.myResponses;
    }

    public final boolean getNegative() {
        return this.negative;
    }

    public final List<HMSPollQuestionOption> getOptions() {
        return this.options;
    }

    public final int getQuestionID() {
        return this.questionID;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTotal() {
        return this.total;
    }

    public final HMSPollQuestionType getType() {
        return this.type;
    }

    public final boolean getVoted() {
        return !this.myResponses.isEmpty();
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.weight, AbstractC11266d.m30451e(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d((this.type.hashCode() + (Integer.hashCode(this.questionID) * 31)) * 31, 31, this.text), 31, this.canSkip), 31, this.canChangeResponse), this.duration, 31), 31);
        Long l7 = this.answerShortMinLength;
        int iHashCode = (iM30448b + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.answerLongMinLength;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        List<HMSPollQuestionOption> list = this.options;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        HMSPollQuestionAnswer hMSPollQuestionAnswer = this.correctAnswer;
        return this.myResponses.hashCode() + AbstractC2875y.m8289b((iHashCode3 + (hMSPollQuestionAnswer != null ? hMSPollQuestionAnswer.hashCode() : 0)) * 31, 31, this.negative);
    }

    public final void setTotal$lib_release(int i13) {
        this.total = i13;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSPollQuestion(questionID=");
        sb4.append(this.questionID);
        sb4.append(", type=");
        sb4.append(this.type);
        sb4.append(", text=");
        sb4.append(this.text);
        sb4.append(", canSkip=");
        sb4.append(this.canSkip);
        sb4.append(", canChangeResponse=");
        sb4.append(this.canChangeResponse);
        sb4.append(", duration=");
        sb4.append(this.duration);
        sb4.append(", weight=");
        sb4.append(this.weight);
        sb4.append(", answerShortMinLength=");
        sb4.append(this.answerShortMinLength);
        sb4.append(", answerLongMinLength=");
        sb4.append(this.answerLongMinLength);
        sb4.append(", options=");
        sb4.append(this.options);
        sb4.append(", correctAnswer=");
        sb4.append(this.correctAnswer);
        sb4.append(", negative=");
        sb4.append(this.negative);
        sb4.append(", myResponses=");
        return AbstractC17176i.m48506h(sb4, this.myResponses, ')');
    }

    public /* synthetic */ HMSPollQuestion(int i13, HMSPollQuestionType hMSPollQuestionType, String str, boolean z4, boolean z13, long j7, int i14, Long l7, Long l12, List list, HMSPollQuestionAnswer hMSPollQuestionAnswer, boolean z14, List list2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, hMSPollQuestionType, str, (i15 & 8) != 0 ? false : z4, (i15 & 16) != 0 ? true : z13, (i15 & 32) != 0 ? 0L : j7, (i15 & 64) != 0 ? 0 : i14, (i15 & 128) != 0 ? 1L : l7, (i15 & 256) != 0 ? null : l12, (i15 & 512) != 0 ? null : list, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : hMSPollQuestionAnswer, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z14, (i15 & 4096) != 0 ? new ArrayList() : list2);
    }
}
