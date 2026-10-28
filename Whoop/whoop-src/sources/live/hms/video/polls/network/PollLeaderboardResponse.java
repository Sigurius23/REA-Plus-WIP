package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/polls/network/PollLeaderboardResponse;", "", "entries", "", "Llive/hms/video/polls/network/HMSPollLeaderboardEntry;", "summary", "Llive/hms/video/polls/network/HMSPollLeaderboardSummary;", "hasNext", "", "<init>", "(Ljava/util/List;Llive/hms/video/polls/network/HMSPollLeaderboardSummary;Ljava/lang/Boolean;)V", "getEntries", "()Ljava/util/List;", "getSummary", "()Llive/hms/video/polls/network/HMSPollLeaderboardSummary;", "getHasNext", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Llive/hms/video/polls/network/HMSPollLeaderboardSummary;Ljava/lang/Boolean;)Llive/hms/video/polls/network/PollLeaderboardResponse;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollLeaderboardResponse {

    @SerializedName("HMSPollLeaderboardEntry")
    private final List<HMSPollLeaderboardEntry> entries;

    @SerializedName("hasNext")
    private final Boolean hasNext;

    @SerializedName("HMSPollLeaderboardSummary")
    private final HMSPollLeaderboardSummary summary;

    public PollLeaderboardResponse(List<HMSPollLeaderboardEntry> list, HMSPollLeaderboardSummary hMSPollLeaderboardSummary, Boolean bool) {
        this.entries = list;
        this.summary = hMSPollLeaderboardSummary;
        this.hasNext = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollLeaderboardResponse copy$default(PollLeaderboardResponse pollLeaderboardResponse, List list, HMSPollLeaderboardSummary hMSPollLeaderboardSummary, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = pollLeaderboardResponse.entries;
        }
        if ((i13 & 2) != 0) {
            hMSPollLeaderboardSummary = pollLeaderboardResponse.summary;
        }
        if ((i13 & 4) != 0) {
            bool = pollLeaderboardResponse.hasNext;
        }
        return pollLeaderboardResponse.copy(list, hMSPollLeaderboardSummary, bool);
    }

    public final List<HMSPollLeaderboardEntry> component1() {
        return this.entries;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSPollLeaderboardSummary getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasNext() {
        return this.hasNext;
    }

    public final PollLeaderboardResponse copy(List<HMSPollLeaderboardEntry> entries, HMSPollLeaderboardSummary summary, Boolean hasNext) {
        return new PollLeaderboardResponse(entries, summary, hasNext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollLeaderboardResponse)) {
            return false;
        }
        PollLeaderboardResponse pollLeaderboardResponse = (PollLeaderboardResponse) other;
        return AbstractC22676k.m65745e(this.entries, pollLeaderboardResponse.entries) && AbstractC22676k.m65745e(this.summary, pollLeaderboardResponse.summary) && AbstractC22676k.m65745e(this.hasNext, pollLeaderboardResponse.hasNext);
    }

    public final List<HMSPollLeaderboardEntry> getEntries() {
        return this.entries;
    }

    public final Boolean getHasNext() {
        return this.hasNext;
    }

    public final HMSPollLeaderboardSummary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        List<HMSPollLeaderboardEntry> list = this.entries;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        HMSPollLeaderboardSummary hMSPollLeaderboardSummary = this.summary;
        int iHashCode2 = (iHashCode + (hMSPollLeaderboardSummary == null ? 0 : hMSPollLeaderboardSummary.hashCode())) * 31;
        Boolean bool = this.hasNext;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PollLeaderboardResponse(entries=" + this.entries + ", summary=" + this.summary + ", hasNext=" + this.hasNext + ')';
    }
}
