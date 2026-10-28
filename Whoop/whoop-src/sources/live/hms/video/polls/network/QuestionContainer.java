package live.hms.video.polls.network;

import java.util.List;
import live.hms.video.polls.models.question.HMSPollQuestion;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/polls/network/QuestionContainer;", "", "questions", "", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "error", "", "<init>", "(Ljava/util/List;Ljava/lang/Throwable;)V", "getQuestions", "()Ljava/util/List;", "getError", "()Ljava/lang/Throwable;", "isSuccess", "", "()Z", "exceptionOrNull", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class QuestionContainer {
    private final Throwable error;
    private final boolean isSuccess;
    private final List<HMSPollQuestion> questions;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionContainer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionContainer copy$default(QuestionContainer questionContainer, List list, Throwable th3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = questionContainer.questions;
        }
        if ((i13 & 2) != 0) {
            th3 = questionContainer.error;
        }
        return questionContainer.copy(list, th3);
    }

    public final List<HMSPollQuestion> component1() {
        return this.questions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final QuestionContainer copy(List<HMSPollQuestion> questions, Throwable error) {
        return new QuestionContainer(questions, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionContainer)) {
            return false;
        }
        QuestionContainer questionContainer = (QuestionContainer) other;
        return AbstractC22676k.m65745e(this.questions, questionContainer.questions) && AbstractC22676k.m65745e(this.error, questionContainer.error);
    }

    public final Throwable exceptionOrNull() {
        return this.error;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final List<HMSPollQuestion> getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        List<HMSPollQuestion> list = this.questions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Throwable th3 = this.error;
        return iHashCode + (th3 != null ? th3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        return "QuestionContainer(questions=" + this.questions + ", error=" + this.error + ')';
    }

    public QuestionContainer(List<HMSPollQuestion> list, Throwable th3) {
        this.questions = list;
        this.error = th3;
        this.isSuccess = th3 == null;
    }

    public /* synthetic */ QuestionContainer(List list, Throwable th3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : th3);
    }
}
