package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import java.util.List;
import live.hms.video.polls.models.question.HmsPollQuestionContainer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/polls/network/PollQuestionGetResponse;", "", "last", "", "pollId", "", "version", "questions", "", "Llive/hms/video/polls/models/question/HmsPollQuestionContainer;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLast", "()Z", "getPollId", "()Ljava/lang/String;", "getVersion", "getQuestions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollQuestionGetResponse {

    @SerializedName("last")
    private final boolean last;

    @SerializedName("poll_id")
    private final String pollId;

    @SerializedName("questions")
    private final List<HmsPollQuestionContainer> questions;

    @SerializedName("version")
    private final String version;

    public PollQuestionGetResponse(boolean z4, String pollId, String version, List<HmsPollQuestionContainer> questions) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(questions, "questions");
        this.last = z4;
        this.pollId = pollId;
        this.version = version;
        this.questions = questions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollQuestionGetResponse copy$default(PollQuestionGetResponse pollQuestionGetResponse, boolean z4, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = pollQuestionGetResponse.last;
        }
        if ((i13 & 2) != 0) {
            str = pollQuestionGetResponse.pollId;
        }
        if ((i13 & 4) != 0) {
            str2 = pollQuestionGetResponse.version;
        }
        if ((i13 & 8) != 0) {
            list = pollQuestionGetResponse.questions;
        }
        return pollQuestionGetResponse.copy(z4, str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLast() {
        return this.last;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final List<HmsPollQuestionContainer> component4() {
        return this.questions;
    }

    public final PollQuestionGetResponse copy(boolean last, String pollId, String version, List<HmsPollQuestionContainer> questions) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(questions, "questions");
        return new PollQuestionGetResponse(last, pollId, version, questions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollQuestionGetResponse)) {
            return false;
        }
        PollQuestionGetResponse pollQuestionGetResponse = (PollQuestionGetResponse) other;
        return this.last == pollQuestionGetResponse.last && AbstractC22676k.m65745e(this.pollId, pollQuestionGetResponse.pollId) && AbstractC22676k.m65745e(this.version, pollQuestionGetResponse.version) && AbstractC22676k.m65745e(this.questions, pollQuestionGetResponse.questions);
    }

    public final boolean getLast() {
        return this.last;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final List<HmsPollQuestionContainer> getQuestions() {
        return this.questions;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.questions.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.last) * 31, 31, this.pollId), 31, this.version);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PollQuestionGetResponse(last=");
        sb4.append(this.last);
        sb4.append(", pollId=");
        sb4.append(this.pollId);
        sb4.append(", version=");
        sb4.append(this.version);
        sb4.append(", questions=");
        return AbstractC17176i.m48506h(sb4, this.questions, ')');
    }
}
