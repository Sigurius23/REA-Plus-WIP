package live.hms.video.polls.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import live.hms.video.polls.models.question.HMSPollQuestionType;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JT\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006("}, m65681d2 = {"Llive/hms/video/polls/models/PollStatsQuestions;", "", "index", "", "questionType", "Llive/hms/video/polls/models/question/HMSPollQuestionType;", "options", "", "", "correct", "skipped", "attemptedTimes", "<init>", "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/util/List;Ljava/lang/Long;JI)V", "getIndex", "()I", "getQuestionType", "()Llive/hms/video/polls/models/question/HMSPollQuestionType;", "getOptions", "()Ljava/util/List;", "getCorrect", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSkipped", "()J", "getAttemptedTimes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/util/List;Ljava/lang/Long;JI)Llive/hms/video/polls/models/PollStatsQuestions;", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollStatsQuestions {

    @SerializedName("total")
    private final int attemptedTimes;

    @SerializedName("correct")
    private final Long correct;

    @SerializedName("question")
    private final int index;

    @SerializedName("options")
    private final List<Long> options;

    @SerializedName("type")
    private final HMSPollQuestionType questionType;

    @SerializedName("skipped")
    private final long skipped;

    public PollStatsQuestions(int i13, HMSPollQuestionType questionType, List<Long> list, Long l7, long j7, int i14) {
        AbstractC22676k.m65750j(questionType, "questionType");
        this.index = i13;
        this.questionType = questionType;
        this.options = list;
        this.correct = l7;
        this.skipped = j7;
        this.attemptedTimes = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollStatsQuestions copy$default(PollStatsQuestions pollStatsQuestions, int i13, HMSPollQuestionType hMSPollQuestionType, List list, Long l7, long j7, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = pollStatsQuestions.index;
        }
        if ((i15 & 2) != 0) {
            hMSPollQuestionType = pollStatsQuestions.questionType;
        }
        if ((i15 & 4) != 0) {
            list = pollStatsQuestions.options;
        }
        if ((i15 & 8) != 0) {
            l7 = pollStatsQuestions.correct;
        }
        if ((i15 & 16) != 0) {
            j7 = pollStatsQuestions.skipped;
        }
        if ((i15 & 32) != 0) {
            i14 = pollStatsQuestions.attemptedTimes;
        }
        int i16 = i14;
        long j13 = j7;
        return pollStatsQuestions.copy(i13, hMSPollQuestionType, list, l7, j13, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSPollQuestionType getQuestionType() {
        return this.questionType;
    }

    public final List<Long> component3() {
        return this.options;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCorrect() {
        return this.correct;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSkipped() {
        return this.skipped;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAttemptedTimes() {
        return this.attemptedTimes;
    }

    public final PollStatsQuestions copy(int index, HMSPollQuestionType questionType, List<Long> options, Long correct, long skipped, int attemptedTimes) {
        AbstractC22676k.m65750j(questionType, "questionType");
        return new PollStatsQuestions(index, questionType, options, correct, skipped, attemptedTimes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollStatsQuestions)) {
            return false;
        }
        PollStatsQuestions pollStatsQuestions = (PollStatsQuestions) other;
        return this.index == pollStatsQuestions.index && this.questionType == pollStatsQuestions.questionType && AbstractC22676k.m65745e(this.options, pollStatsQuestions.options) && AbstractC22676k.m65745e(this.correct, pollStatsQuestions.correct) && this.skipped == pollStatsQuestions.skipped && this.attemptedTimes == pollStatsQuestions.attemptedTimes;
    }

    public final int getAttemptedTimes() {
        return this.attemptedTimes;
    }

    public final Long getCorrect() {
        return this.correct;
    }

    public final int getIndex() {
        return this.index;
    }

    public final List<Long> getOptions() {
        return this.options;
    }

    public final HMSPollQuestionType getQuestionType() {
        return this.questionType;
    }

    public final long getSkipped() {
        return this.skipped;
    }

    public int hashCode() {
        int iHashCode = (this.questionType.hashCode() + (Integer.hashCode(this.index) * 31)) * 31;
        List<Long> list = this.options;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l7 = this.correct;
        return Integer.hashCode(this.attemptedTimes) + AbstractC11266d.m30451e((iHashCode2 + (l7 != null ? l7.hashCode() : 0)) * 31, this.skipped, 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PollStatsQuestions(index=");
        sb4.append(this.index);
        sb4.append(", questionType=");
        sb4.append(this.questionType);
        sb4.append(", options=");
        sb4.append(this.options);
        sb4.append(", correct=");
        sb4.append(this.correct);
        sb4.append(", skipped=");
        sb4.append(this.skipped);
        sb4.append(", attemptedTimes=");
        return AbstractC11895b.m31999r(sb4, this.attemptedTimes, ')');
    }
}
