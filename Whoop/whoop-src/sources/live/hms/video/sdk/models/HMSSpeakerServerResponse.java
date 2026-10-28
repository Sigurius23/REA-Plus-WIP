package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import live.hms.video.sdk.SDKStore;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSSpeakerServerResponse;", "", "peerId", "", "trackId", "level", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getPeerId", "()Ljava/lang/String;", "getTrackId", "getLevel", "()I", "toHmsSpeaker", "Llive/hms/video/sdk/models/HMSSpeaker;", "sdkStore", "Llive/hms/video/sdk/SDKStore;", "toHmsSpeaker$lib_release", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSSpeakerServerResponse {

    @SerializedName("level")
    private final int level;

    @SerializedName("peer_id")
    private final String peerId;

    @SerializedName("track_id")
    private final String trackId;

    public HMSSpeakerServerResponse(String peerId, String trackId, int i13) {
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(trackId, "trackId");
        this.peerId = peerId;
        this.trackId = trackId;
        this.level = i13;
    }

    public static /* synthetic */ HMSSpeakerServerResponse copy$default(HMSSpeakerServerResponse hMSSpeakerServerResponse, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = hMSSpeakerServerResponse.peerId;
        }
        if ((i14 & 2) != 0) {
            str2 = hMSSpeakerServerResponse.trackId;
        }
        if ((i14 & 4) != 0) {
            i13 = hMSSpeakerServerResponse.level;
        }
        return hMSSpeakerServerResponse.copy(str, str2, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPeerId() {
        return this.peerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    public final HMSSpeakerServerResponse copy(String peerId, String trackId, int level) {
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(trackId, "trackId");
        return new HMSSpeakerServerResponse(peerId, trackId, level);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSSpeakerServerResponse)) {
            return false;
        }
        HMSSpeakerServerResponse hMSSpeakerServerResponse = (HMSSpeakerServerResponse) other;
        return AbstractC22676k.m65745e(this.peerId, hMSSpeakerServerResponse.peerId) && AbstractC22676k.m65745e(this.trackId, hMSSpeakerServerResponse.trackId) && this.level == hMSSpeakerServerResponse.level;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return Integer.hashCode(this.level) + AbstractC11266d.m30450d(this.peerId.hashCode() * 31, 31, this.trackId);
    }

    public final HMSSpeaker toHmsSpeaker$lib_release(SDKStore sdkStore) {
        AbstractC22676k.m65750j(sdkStore, "sdkStore");
        return new HMSSpeaker(this.peerId, this.trackId, this.level, sdkStore);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSSpeakerServerResponse(peerId=");
        sb4.append(this.peerId);
        sb4.append(", trackId=");
        sb4.append(this.trackId);
        sb4.append(", level=");
        return AbstractC11895b.m31999r(sb4, this.level, ')');
    }
}
