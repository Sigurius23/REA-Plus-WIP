package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m65681d2 = {"Llive/hms/video/polls/network/HMSPollLeaderboardSummary;", "", "totalPeersCount", "", "respondedPeersCount", "respondedCorrectlyPeersCount", "averageTime", "", "averageScore", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;)V", "getTotalPeersCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRespondedPeersCount", "getRespondedCorrectlyPeersCount", "getAverageTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAverageScore", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;)Llive/hms/video/polls/network/HMSPollLeaderboardSummary;", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSPollLeaderboardSummary {

    @SerializedName("averageScore")
    private final Float averageScore;

    @SerializedName("averageTime")
    private final Long averageTime;

    @SerializedName("respondedCorrectlyPeersCount")
    private final Integer respondedCorrectlyPeersCount;

    @SerializedName("respondedPeersCount")
    private final Integer respondedPeersCount;

    @SerializedName("totalPeersCount")
    private final Integer totalPeersCount;

    public HMSPollLeaderboardSummary(Integer num, Integer num2, Integer num3, Long l7, Float f13) {
        this.totalPeersCount = num;
        this.respondedPeersCount = num2;
        this.respondedCorrectlyPeersCount = num3;
        this.averageTime = l7;
        this.averageScore = f13;
    }

    public static /* synthetic */ HMSPollLeaderboardSummary copy$default(HMSPollLeaderboardSummary hMSPollLeaderboardSummary, Integer num, Integer num2, Integer num3, Long l7, Float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = hMSPollLeaderboardSummary.totalPeersCount;
        }
        if ((i13 & 2) != 0) {
            num2 = hMSPollLeaderboardSummary.respondedPeersCount;
        }
        if ((i13 & 4) != 0) {
            num3 = hMSPollLeaderboardSummary.respondedCorrectlyPeersCount;
        }
        if ((i13 & 8) != 0) {
            l7 = hMSPollLeaderboardSummary.averageTime;
        }
        if ((i13 & 16) != 0) {
            f13 = hMSPollLeaderboardSummary.averageScore;
        }
        Float f14 = f13;
        Integer num4 = num3;
        return hMSPollLeaderboardSummary.copy(num, num2, num4, l7, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTotalPeersCount() {
        return this.totalPeersCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getRespondedPeersCount() {
        return this.respondedPeersCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRespondedCorrectlyPeersCount() {
        return this.respondedCorrectlyPeersCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getAverageTime() {
        return this.averageTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getAverageScore() {
        return this.averageScore;
    }

    public final HMSPollLeaderboardSummary copy(Integer totalPeersCount, Integer respondedPeersCount, Integer respondedCorrectlyPeersCount, Long averageTime, Float averageScore) {
        return new HMSPollLeaderboardSummary(totalPeersCount, respondedPeersCount, respondedCorrectlyPeersCount, averageTime, averageScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSPollLeaderboardSummary)) {
            return false;
        }
        HMSPollLeaderboardSummary hMSPollLeaderboardSummary = (HMSPollLeaderboardSummary) other;
        return AbstractC22676k.m65745e(this.totalPeersCount, hMSPollLeaderboardSummary.totalPeersCount) && AbstractC22676k.m65745e(this.respondedPeersCount, hMSPollLeaderboardSummary.respondedPeersCount) && AbstractC22676k.m65745e(this.respondedCorrectlyPeersCount, hMSPollLeaderboardSummary.respondedCorrectlyPeersCount) && AbstractC22676k.m65745e(this.averageTime, hMSPollLeaderboardSummary.averageTime) && AbstractC22676k.m65745e(this.averageScore, hMSPollLeaderboardSummary.averageScore);
    }

    public final Float getAverageScore() {
        return this.averageScore;
    }

    public final Long getAverageTime() {
        return this.averageTime;
    }

    public final Integer getRespondedCorrectlyPeersCount() {
        return this.respondedCorrectlyPeersCount;
    }

    public final Integer getRespondedPeersCount() {
        return this.respondedPeersCount;
    }

    public final Integer getTotalPeersCount() {
        return this.totalPeersCount;
    }

    public int hashCode() {
        Integer num = this.totalPeersCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.respondedPeersCount;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.respondedCorrectlyPeersCount;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l7 = this.averageTime;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Float f13 = this.averageScore;
        return iHashCode4 + (f13 != null ? f13.hashCode() : 0);
    }

    public String toString() {
        return "HMSPollLeaderboardSummary(totalPeersCount=" + this.totalPeersCount + ", respondedPeersCount=" + this.respondedPeersCount + ", respondedCorrectlyPeersCount=" + this.respondedCorrectlyPeersCount + ", averageTime=" + this.averageTime + ", averageScore=" + this.averageScore + ')';
    }
}
