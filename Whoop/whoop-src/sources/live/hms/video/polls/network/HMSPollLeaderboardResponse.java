package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010 Jr\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u00063"}, m65681d2 = {"Llive/hms/video/polls/network/HMSPollLeaderboardResponse;", "", "pollId", "", "last", "", "leaderboard", "", "Llive/hms/video/polls/network/LeaderboardQuestion;", "totalUsers", "", "votedUsers", "correctUsers", "avgTime", "avgScore", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)V", "getPollId", "()Ljava/lang/String;", "getLast", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLeaderboard", "()Ljava/util/List;", "getTotalUsers", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVotedUsers", "getCorrectUsers", "getAvgTime", "getAvgScore", "()Ljava/lang/Float;", "Ljava/lang/Float;", "mapToPollLeaderboardResponse", "Llive/hms/video/polls/network/PollLeaderboardResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)Llive/hms/video/polls/network/HMSPollLeaderboardResponse;", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSPollLeaderboardResponse {

    @SerializedName("avg_score")
    private final Float avgScore;

    @SerializedName("avg_time")
    private final Long avgTime;

    @SerializedName("correct_users")
    private final Long correctUsers;

    @SerializedName("last")
    private final Boolean last;

    @SerializedName("questions")
    private final List<LeaderboardQuestion> leaderboard;

    @SerializedName("poll_id")
    private final String pollId;

    @SerializedName("total_users")
    private final Long totalUsers;

    @SerializedName("voted_users")
    private final Long votedUsers;

    public HMSPollLeaderboardResponse(String pollId, Boolean bool, List<LeaderboardQuestion> list, Long l7, Long l12, Long l13, Long l14, Float f13) {
        AbstractC22676k.m65750j(pollId, "pollId");
        this.pollId = pollId;
        this.last = bool;
        this.leaderboard = list;
        this.totalUsers = l7;
        this.votedUsers = l12;
        this.correctUsers = l13;
        this.avgTime = l14;
        this.avgScore = f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMSPollLeaderboardResponse copy$default(HMSPollLeaderboardResponse hMSPollLeaderboardResponse, String str, Boolean bool, List list, Long l7, Long l12, Long l13, Long l14, Float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSPollLeaderboardResponse.pollId;
        }
        if ((i13 & 2) != 0) {
            bool = hMSPollLeaderboardResponse.last;
        }
        if ((i13 & 4) != 0) {
            list = hMSPollLeaderboardResponse.leaderboard;
        }
        if ((i13 & 8) != 0) {
            l7 = hMSPollLeaderboardResponse.totalUsers;
        }
        if ((i13 & 16) != 0) {
            l12 = hMSPollLeaderboardResponse.votedUsers;
        }
        if ((i13 & 32) != 0) {
            l13 = hMSPollLeaderboardResponse.correctUsers;
        }
        if ((i13 & 64) != 0) {
            l14 = hMSPollLeaderboardResponse.avgTime;
        }
        if ((i13 & 128) != 0) {
            f13 = hMSPollLeaderboardResponse.avgScore;
        }
        Long l15 = l14;
        Float f14 = f13;
        Long l16 = l12;
        Long l17 = l13;
        return hMSPollLeaderboardResponse.copy(str, bool, list, l7, l16, l17, l15, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getLast() {
        return this.last;
    }

    public final List<LeaderboardQuestion> component3() {
        return this.leaderboard;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTotalUsers() {
        return this.totalUsers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getVotedUsers() {
        return this.votedUsers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getCorrectUsers() {
        return this.correctUsers;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getAvgTime() {
        return this.avgTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Float getAvgScore() {
        return this.avgScore;
    }

    public final HMSPollLeaderboardResponse copy(String pollId, Boolean last, List<LeaderboardQuestion> leaderboard, Long totalUsers, Long votedUsers, Long correctUsers, Long avgTime, Float avgScore) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return new HMSPollLeaderboardResponse(pollId, last, leaderboard, totalUsers, votedUsers, correctUsers, avgTime, avgScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSPollLeaderboardResponse)) {
            return false;
        }
        HMSPollLeaderboardResponse hMSPollLeaderboardResponse = (HMSPollLeaderboardResponse) other;
        return AbstractC22676k.m65745e(this.pollId, hMSPollLeaderboardResponse.pollId) && AbstractC22676k.m65745e(this.last, hMSPollLeaderboardResponse.last) && AbstractC22676k.m65745e(this.leaderboard, hMSPollLeaderboardResponse.leaderboard) && AbstractC22676k.m65745e(this.totalUsers, hMSPollLeaderboardResponse.totalUsers) && AbstractC22676k.m65745e(this.votedUsers, hMSPollLeaderboardResponse.votedUsers) && AbstractC22676k.m65745e(this.correctUsers, hMSPollLeaderboardResponse.correctUsers) && AbstractC22676k.m65745e(this.avgTime, hMSPollLeaderboardResponse.avgTime) && AbstractC22676k.m65745e(this.avgScore, hMSPollLeaderboardResponse.avgScore);
    }

    public final Float getAvgScore() {
        return this.avgScore;
    }

    public final Long getAvgTime() {
        return this.avgTime;
    }

    public final Long getCorrectUsers() {
        return this.correctUsers;
    }

    public final Boolean getLast() {
        return this.last;
    }

    public final List<LeaderboardQuestion> getLeaderboard() {
        return this.leaderboard;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final Long getTotalUsers() {
        return this.totalUsers;
    }

    public final Long getVotedUsers() {
        return this.votedUsers;
    }

    public int hashCode() {
        int iHashCode = this.pollId.hashCode() * 31;
        Boolean bool = this.last;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<LeaderboardQuestion> list = this.leaderboard;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l7 = this.totalUsers;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.votedUsers;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.correctUsers;
        int iHashCode6 = (iHashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.avgTime;
        int iHashCode7 = (iHashCode6 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Float f13 = this.avgScore;
        return iHashCode7 + (f13 != null ? f13.hashCode() : 0);
    }

    public final PollLeaderboardResponse mapToPollLeaderboardResponse() {
        ArrayList arrayList;
        List<LeaderboardQuestion> list = this.leaderboard;
        if (list != null) {
            List<LeaderboardQuestion> list2 = list;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (LeaderboardQuestion leaderboardQuestion : list2) {
                Long position = leaderboardQuestion.getPosition();
                Float score = leaderboardQuestion.getScore();
                arrayList.add(new HMSPollLeaderboardEntry(position, score != null ? Long.valueOf((long) score.floatValue()) : null, leaderboardQuestion.getTotalResponse(), leaderboardQuestion.getCorrectResponses(), leaderboardQuestion.getDuration(), leaderboardQuestion.getPollPeer()));
            }
        } else {
            arrayList = null;
        }
        Long l7 = this.totalUsers;
        Integer numValueOf = l7 != null ? Integer.valueOf((int) l7.longValue()) : null;
        Long l12 = this.votedUsers;
        Integer numValueOf2 = l12 != null ? Integer.valueOf((int) l12.longValue()) : null;
        Long l13 = this.correctUsers;
        return new PollLeaderboardResponse(arrayList, new HMSPollLeaderboardSummary(numValueOf, numValueOf2, l13 != null ? Integer.valueOf((int) l13.longValue()) : null, this.avgTime, this.avgScore), this.last);
    }

    public String toString() {
        return "HMSPollLeaderboardResponse(pollId=" + this.pollId + ", last=" + this.last + ", leaderboard=" + this.leaderboard + ", totalUsers=" + this.totalUsers + ", votedUsers=" + this.votedUsers + ", correctUsers=" + this.correctUsers + ", avgTime=" + this.avgTime + ", avgScore=" + this.avgScore + ')';
    }
}
