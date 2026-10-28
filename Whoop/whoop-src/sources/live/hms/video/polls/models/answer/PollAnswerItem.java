package live.hms.video.polls.models.answer;

import com.google.gson.annotations.SerializedName;
import live.hms.video.error.HMSException;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/polls/models/answer/PollAnswerItem;", "", "questionIndex", "", "correct", "", "error", "Llive/hms/video/error/HMSException;", "<init>", "(IZLlive/hms/video/error/HMSException;)V", "getQuestionIndex", "()I", "getCorrect", "()Z", "getError", "()Llive/hms/video/error/HMSException;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollAnswerItem {

    @SerializedName("correct")
    private final boolean correct;

    @SerializedName("error")
    private final HMSException error;

    @SerializedName("question")
    private final int questionIndex;

    public PollAnswerItem(int i13, boolean z4, HMSException hMSException) {
        this.questionIndex = i13;
        this.correct = z4;
        this.error = hMSException;
    }

    public static /* synthetic */ PollAnswerItem copy$default(PollAnswerItem pollAnswerItem, int i13, boolean z4, HMSException hMSException, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = pollAnswerItem.questionIndex;
        }
        if ((i14 & 2) != 0) {
            z4 = pollAnswerItem.correct;
        }
        if ((i14 & 4) != 0) {
            hMSException = pollAnswerItem.error;
        }
        return pollAnswerItem.copy(i13, z4, hMSException);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getQuestionIndex() {
        return this.questionIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCorrect() {
        return this.correct;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSException getError() {
        return this.error;
    }

    public final PollAnswerItem copy(int questionIndex, boolean correct, HMSException error) {
        return new PollAnswerItem(questionIndex, correct, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollAnswerItem)) {
            return false;
        }
        PollAnswerItem pollAnswerItem = (PollAnswerItem) other;
        return this.questionIndex == pollAnswerItem.questionIndex && this.correct == pollAnswerItem.correct && AbstractC22676k.m65745e(this.error, pollAnswerItem.error);
    }

    public final boolean getCorrect() {
        return this.correct;
    }

    public final HMSException getError() {
        return this.error;
    }

    public final int getQuestionIndex() {
        return this.questionIndex;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Integer.hashCode(this.questionIndex) * 31, 31, this.correct);
        HMSException hMSException = this.error;
        return iM8289b + (hMSException == null ? 0 : hMSException.hashCode());
    }

    public String toString() {
        return "PollAnswerItem(questionIndex=" + this.questionIndex + ", correct=" + this.correct + ", error=" + this.error + ')';
    }
}
