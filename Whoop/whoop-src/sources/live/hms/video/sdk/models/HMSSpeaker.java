package live.hms.video.sdk.models;

import l83.InterfaceC23457c;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.SDKStore;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001d\u001a\u00020\u0003H\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000e\u0010!\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b\"J1\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006("}, m65681d2 = {"Llive/hms/video/sdk/models/HMSSpeaker;", "", "peerId", "", "trackId", "level", "", "sdkStore", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILlive/hms/video/sdk/SDKStore;)V", "getPeerId$annotations", "()V", "getPeerId", "()Ljava/lang/String;", "getTrackId$annotations", "getTrackId", "getLevel", "()I", "getSdkStore$lib_release", "()Llive/hms/video/sdk/SDKStore;", "hmsTrack", "Llive/hms/video/media/tracks/HMSTrack;", "getHmsTrack", "()Llive/hms/video/media/tracks/HMSTrack;", "peer", "Llive/hms/video/sdk/models/HMSPeer;", "getPeer", "()Llive/hms/video/sdk/models/HMSPeer;", "toString", "component1", "component2", "component3", "component4", "component4$lib_release", "copy", "equals", "", "other", "hashCode", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSSpeaker {
    private final int level;
    private final String peerId;
    private final SDKStore sdkStore;
    private final String trackId;

    public HMSSpeaker(String peerId, String trackId, int i13, SDKStore sdkStore) {
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(sdkStore, "sdkStore");
        this.peerId = peerId;
        this.trackId = trackId;
        this.level = i13;
        this.sdkStore = sdkStore;
    }

    public static /* synthetic */ HMSSpeaker copy$default(HMSSpeaker hMSSpeaker, String str, String str2, int i13, SDKStore sDKStore, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = hMSSpeaker.peerId;
        }
        if ((i14 & 2) != 0) {
            str2 = hMSSpeaker.trackId;
        }
        if ((i14 & 4) != 0) {
            i13 = hMSSpeaker.level;
        }
        if ((i14 & 8) != 0) {
            sDKStore = hMSSpeaker.sdkStore;
        }
        return hMSSpeaker.copy(str, str2, i13, sDKStore);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getPeerId$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getTrackId$annotations() {
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

    /* JADX INFO: renamed from: component4$lib_release, reason: from getter */
    public final SDKStore getSdkStore() {
        return this.sdkStore;
    }

    public final HMSSpeaker copy(String peerId, String trackId, int level, SDKStore sdkStore) {
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(sdkStore, "sdkStore");
        return new HMSSpeaker(peerId, trackId, level, sdkStore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSSpeaker)) {
            return false;
        }
        HMSSpeaker hMSSpeaker = (HMSSpeaker) other;
        return AbstractC22676k.m65745e(this.peerId, hMSSpeaker.peerId) && AbstractC22676k.m65745e(this.trackId, hMSSpeaker.trackId) && this.level == hMSSpeaker.level && AbstractC22676k.m65745e(this.sdkStore, hMSSpeaker.sdkStore);
    }

    public final HMSTrack getHmsTrack() {
        return this.sdkStore.getNativeTrackById(this.trackId);
    }

    public final int getLevel() {
        return this.level;
    }

    public final HMSPeer getPeer() {
        return this.sdkStore.getPeerById(this.peerId);
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final SDKStore getSdkStore$lib_release() {
        return this.sdkStore;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return this.sdkStore.hashCode() + AbstractC11266d.m30448b(this.level, AbstractC11266d.m30450d(this.peerId.hashCode() * 31, 31, this.trackId), 31);
    }

    public String toString() {
        return "PeerId: " + this.peerId + ", Peer: " + getPeer() + ", TrackId: " + this.trackId + ", Level: " + this.level;
    }
}
