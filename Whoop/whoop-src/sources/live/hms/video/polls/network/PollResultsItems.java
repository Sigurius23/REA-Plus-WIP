package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import live.hms.video.error.HMSException;
import live.hms.video.polls.models.question.HMSPollQuestionType;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m65681d2 = {"Llive/hms/video/polls/network/PollResultsItems;", "", "questionIndex", "", "correct", "type", "Llive/hms/video/polls/models/question/HMSPollQuestionType;", "skipped", "total", "error", "Llive/hms/video/error/HMSException;", "<init>", "(JJLlive/hms/video/polls/models/question/HMSPollQuestionType;JJLlive/hms/video/error/HMSException;)V", "getQuestionIndex", "()J", "getCorrect", "getType", "()Llive/hms/video/polls/models/question/HMSPollQuestionType;", "getSkipped", "getTotal", "getError", "()Llive/hms/video/error/HMSException;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollResultsItems {

    @SerializedName("correct")
    private final long correct;

    @SerializedName("error")
    private final HMSException error;

    @SerializedName("question")
    private final long questionIndex;

    @SerializedName("skipped")
    private final long skipped;

    @SerializedName("total")
    private final long total;

    @SerializedName("type")
    private final HMSPollQuestionType type;

    public PollResultsItems(long j7, long j13, HMSPollQuestionType type, long j14, long j15, HMSException hMSException) {
        AbstractC22676k.m65750j(type, "type");
        this.questionIndex = j7;
        this.correct = j13;
        this.type = type;
        this.skipped = j14;
        this.total = j15;
        this.error = hMSException;
    }

    public static /* synthetic */ PollResultsItems copy$default(PollResultsItems pollResultsItems, long j7, long j13, HMSPollQuestionType hMSPollQuestionType, long j14, long j15, HMSException hMSException, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = pollResultsItems.questionIndex;
        }
        long j16 = j7;
        if ((i13 & 2) != 0) {
            j13 = pollResultsItems.correct;
        }
        return pollResultsItems.copy(j16, j13, (i13 & 4) != 0 ? pollResultsItems.type : hMSPollQuestionType, (i13 & 8) != 0 ? pollResultsItems.skipped : j14, (i13 & 16) != 0 ? pollResultsItems.total : j15, (i13 & 32) != 0 ? pollResultsItems.error : hMSException);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getQuestionIndex() {
        return this.questionIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCorrect() {
        return this.correct;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSPollQuestionType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSkipped() {
        return this.skipped;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HMSException getError() {
        return this.error;
    }

    public final PollResultsItems copy(long questionIndex, long correct, HMSPollQuestionType type, long skipped, long total, HMSException error) {
        AbstractC22676k.m65750j(type, "type");
        return new PollResultsItems(questionIndex, correct, type, skipped, total, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollResultsItems)) {
            return false;
        }
        PollResultsItems pollResultsItems = (PollResultsItems) other;
        return this.questionIndex == pollResultsItems.questionIndex && this.correct == pollResultsItems.correct && this.type == pollResultsItems.type && this.skipped == pollResultsItems.skipped && this.total == pollResultsItems.total && AbstractC22676k.m65745e(this.error, pollResultsItems.error);
    }

    public final long getCorrect() {
        return this.correct;
    }

    public final HMSException getError() {
        return this.error;
    }

    public final long getQuestionIndex() {
        return this.questionIndex;
    }

    public final long getSkipped() {
        return this.skipped;
    }

    public final long getTotal() {
        return this.total;
    }

    public final HMSPollQuestionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30451e((this.type.hashCode() + AbstractC11266d.m30451e(Long.hashCode(this.questionIndex) * 31, this.correct, 31)) * 31, this.skipped, 31), this.total, 31);
        HMSException hMSException = this.error;
        return iM30451e + (hMSException == null ? 0 : hMSException.hashCode());
    }

    public String toString() {
        return "PollResultsItems(questionIndex=" + this.questionIndex + ", correct=" + this.correct + ", type=" + this.type + ", skipped=" + this.skipped + ", total=" + this.total + ", error=" + this.error + ')';
    }
}
