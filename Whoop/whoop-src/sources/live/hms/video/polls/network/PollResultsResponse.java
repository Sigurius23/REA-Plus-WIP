package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import java.util.List;
import live.hms.video.polls.models.PollStatsQuestions;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m65681d2 = {"Llive/hms/video/polls/network/PollResultsResponse;", "", "pollId", "", "totalResponses", "", "votingUsers", "totalDistinctUsers", "question", "", "Llive/hms/video/polls/models/PollStatsQuestions;", "<init>", "(Ljava/lang/String;JJJLjava/util/List;)V", "getPollId", "()Ljava/lang/String;", "getTotalResponses", "()J", "getVotingUsers", "getTotalDistinctUsers", "getQuestion", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollResultsResponse {

    @SerializedName("poll_id")
    private final String pollId;

    @SerializedName("questions")
    private final List<PollStatsQuestions> question;

    @SerializedName("max_user")
    private final long totalDistinctUsers;

    @SerializedName("total_response")
    private final long totalResponses;

    @SerializedName("user_count")
    private final long votingUsers;

    public PollResultsResponse(String pollId, long j7, long j13, long j14, List<PollStatsQuestions> question) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(question, "question");
        this.pollId = pollId;
        this.totalResponses = j7;
        this.votingUsers = j13;
        this.totalDistinctUsers = j14;
        this.question = question;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollResultsResponse copy$default(PollResultsResponse pollResultsResponse, String str, long j7, long j13, long j14, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pollResultsResponse.pollId;
        }
        if ((i13 & 2) != 0) {
            j7 = pollResultsResponse.totalResponses;
        }
        if ((i13 & 4) != 0) {
            j13 = pollResultsResponse.votingUsers;
        }
        if ((i13 & 8) != 0) {
            j14 = pollResultsResponse.totalDistinctUsers;
        }
        if ((i13 & 16) != 0) {
            list = pollResultsResponse.question;
        }
        List list2 = list;
        long j15 = j14;
        return pollResultsResponse.copy(str, j7, j13, j15, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalResponses() {
        return this.totalResponses;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getVotingUsers() {
        return this.votingUsers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalDistinctUsers() {
        return this.totalDistinctUsers;
    }

    public final List<PollStatsQuestions> component5() {
        return this.question;
    }

    public final PollResultsResponse copy(String pollId, long totalResponses, long votingUsers, long totalDistinctUsers, List<PollStatsQuestions> question) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(question, "question");
        return new PollResultsResponse(pollId, totalResponses, votingUsers, totalDistinctUsers, question);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollResultsResponse)) {
            return false;
        }
        PollResultsResponse pollResultsResponse = (PollResultsResponse) other;
        return AbstractC22676k.m65745e(this.pollId, pollResultsResponse.pollId) && this.totalResponses == pollResultsResponse.totalResponses && this.votingUsers == pollResultsResponse.votingUsers && this.totalDistinctUsers == pollResultsResponse.totalDistinctUsers && AbstractC22676k.m65745e(this.question, pollResultsResponse.question);
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final List<PollStatsQuestions> getQuestion() {
        return this.question;
    }

    public final long getTotalDistinctUsers() {
        return this.totalDistinctUsers;
    }

    public final long getTotalResponses() {
        return this.totalResponses;
    }

    public final long getVotingUsers() {
        return this.votingUsers;
    }

    public int hashCode() {
        return this.question.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(this.pollId.hashCode() * 31, this.totalResponses, 31), this.votingUsers, 31), this.totalDistinctUsers, 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PollResultsResponse(pollId=");
        sb4.append(this.pollId);
        sb4.append(", totalResponses=");
        sb4.append(this.totalResponses);
        sb4.append(", votingUsers=");
        sb4.append(this.votingUsers);
        sb4.append(", totalDistinctUsers=");
        sb4.append(this.totalDistinctUsers);
        sb4.append(", question=");
        return AbstractC17176i.m48506h(sb4, this.question, ')');
    }
}
