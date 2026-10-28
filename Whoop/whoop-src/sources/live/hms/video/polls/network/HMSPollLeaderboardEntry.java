package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import live.hms.video.polls.models.network.HMSPollResponsePeerInfo;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, m65681d2 = {"Llive/hms/video/polls/network/HMSPollLeaderboardEntry;", "", "position", "", "score", "totalResponses", "correctResponses", AttachmentExtensionsKt.EXTRA_DURATION, "peer", "Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)V", "getPosition", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getScore", "getTotalResponses", "getCorrectResponses", "getDuration", "getPeer", "()Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)Llive/hms/video/polls/network/HMSPollLeaderboardEntry;", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSPollLeaderboardEntry {

    @SerializedName("correctResponses")
    private final Long correctResponses;

    @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
    private final Long duration;

    @SerializedName("peer")
    private final HMSPollResponsePeerInfo peer;

    @SerializedName("position")
    private final Long position;

    @SerializedName("score")
    private final Long score;

    @SerializedName("totalResponses")
    private final Long totalResponses;

    public HMSPollLeaderboardEntry(Long l7, Long l12, Long l13, Long l14, Long l15, HMSPollResponsePeerInfo hMSPollResponsePeerInfo) {
        this.position = l7;
        this.score = l12;
        this.totalResponses = l13;
        this.correctResponses = l14;
        this.duration = l15;
        this.peer = hMSPollResponsePeerInfo;
    }

    public static /* synthetic */ HMSPollLeaderboardEntry copy$default(HMSPollLeaderboardEntry hMSPollLeaderboardEntry, Long l7, Long l12, Long l13, Long l14, Long l15, HMSPollResponsePeerInfo hMSPollResponsePeerInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = hMSPollLeaderboardEntry.position;
        }
        if ((i13 & 2) != 0) {
            l12 = hMSPollLeaderboardEntry.score;
        }
        if ((i13 & 4) != 0) {
            l13 = hMSPollLeaderboardEntry.totalResponses;
        }
        if ((i13 & 8) != 0) {
            l14 = hMSPollLeaderboardEntry.correctResponses;
        }
        if ((i13 & 16) != 0) {
            l15 = hMSPollLeaderboardEntry.duration;
        }
        if ((i13 & 32) != 0) {
            hMSPollResponsePeerInfo = hMSPollLeaderboardEntry.peer;
        }
        Long l16 = l15;
        HMSPollResponsePeerInfo hMSPollResponsePeerInfo2 = hMSPollResponsePeerInfo;
        return hMSPollLeaderboardEntry.copy(l7, l12, l13, l14, l16, hMSPollResponsePeerInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTotalResponses() {
        return this.totalResponses;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCorrectResponses() {
        return this.correctResponses;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HMSPollResponsePeerInfo getPeer() {
        return this.peer;
    }

    public final HMSPollLeaderboardEntry copy(Long position, Long score, Long totalResponses, Long correctResponses, Long duration, HMSPollResponsePeerInfo peer) {
        return new HMSPollLeaderboardEntry(position, score, totalResponses, correctResponses, duration, peer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSPollLeaderboardEntry)) {
            return false;
        }
        HMSPollLeaderboardEntry hMSPollLeaderboardEntry = (HMSPollLeaderboardEntry) other;
        return AbstractC22676k.m65745e(this.position, hMSPollLeaderboardEntry.position) && AbstractC22676k.m65745e(this.score, hMSPollLeaderboardEntry.score) && AbstractC22676k.m65745e(this.totalResponses, hMSPollLeaderboardEntry.totalResponses) && AbstractC22676k.m65745e(this.correctResponses, hMSPollLeaderboardEntry.correctResponses) && AbstractC22676k.m65745e(this.duration, hMSPollLeaderboardEntry.duration) && AbstractC22676k.m65745e(this.peer, hMSPollLeaderboardEntry.peer);
    }

    public final Long getCorrectResponses() {
        return this.correctResponses;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final HMSPollResponsePeerInfo getPeer() {
        return this.peer;
    }

    public final Long getPosition() {
        return this.position;
    }

    public final Long getScore() {
        return this.score;
    }

    public final Long getTotalResponses() {
        return this.totalResponses;
    }

    public int hashCode() {
        Long l7 = this.position;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Long l12 = this.score;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.totalResponses;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.correctResponses;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.duration;
        int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        HMSPollResponsePeerInfo hMSPollResponsePeerInfo = this.peer;
        return iHashCode5 + (hMSPollResponsePeerInfo != null ? hMSPollResponsePeerInfo.hashCode() : 0);
    }

    public String toString() {
        return "HMSPollLeaderboardEntry(position=" + this.position + ", score=" + this.score + ", totalResponses=" + this.totalResponses + ", correctResponses=" + this.correctResponses + ", duration=" + this.duration + ", peer=" + this.peer + ')';
    }
}
