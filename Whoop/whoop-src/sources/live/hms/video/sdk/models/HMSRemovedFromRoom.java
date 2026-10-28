package live.hms.video.sdk.models;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSRemovedFromRoom;", "", "reason", "", "peerWhoRemoved", "Llive/hms/video/sdk/models/HMSPeer;", "roomWasEnded", "", "<init>", "(Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Z)V", "getReason", "()Ljava/lang/String;", "getPeerWhoRemoved", "()Llive/hms/video/sdk/models/HMSPeer;", "getRoomWasEnded", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRemovedFromRoom {
    private final HMSPeer peerWhoRemoved;
    private final String reason;
    private final boolean roomWasEnded;

    public HMSRemovedFromRoom(String reason, HMSPeer hMSPeer, boolean z4) {
        AbstractC22676k.m65750j(reason, "reason");
        this.reason = reason;
        this.peerWhoRemoved = hMSPeer;
        this.roomWasEnded = z4;
    }

    public static /* synthetic */ HMSRemovedFromRoom copy$default(HMSRemovedFromRoom hMSRemovedFromRoom, String str, HMSPeer hMSPeer, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSRemovedFromRoom.reason;
        }
        if ((i13 & 2) != 0) {
            hMSPeer = hMSRemovedFromRoom.peerWhoRemoved;
        }
        if ((i13 & 4) != 0) {
            z4 = hMSRemovedFromRoom.roomWasEnded;
        }
        return hMSRemovedFromRoom.copy(str, hMSPeer, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSPeer getPeerWhoRemoved() {
        return this.peerWhoRemoved;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRoomWasEnded() {
        return this.roomWasEnded;
    }

    public final HMSRemovedFromRoom copy(String reason, HMSPeer peerWhoRemoved, boolean roomWasEnded) {
        AbstractC22676k.m65750j(reason, "reason");
        return new HMSRemovedFromRoom(reason, peerWhoRemoved, roomWasEnded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRemovedFromRoom)) {
            return false;
        }
        HMSRemovedFromRoom hMSRemovedFromRoom = (HMSRemovedFromRoom) other;
        return AbstractC22676k.m65745e(this.reason, hMSRemovedFromRoom.reason) && AbstractC22676k.m65745e(this.peerWhoRemoved, hMSRemovedFromRoom.peerWhoRemoved) && this.roomWasEnded == hMSRemovedFromRoom.roomWasEnded;
    }

    public final HMSPeer getPeerWhoRemoved() {
        return this.peerWhoRemoved;
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean getRoomWasEnded() {
        return this.roomWasEnded;
    }

    public int hashCode() {
        int iHashCode = this.reason.hashCode() * 31;
        HMSPeer hMSPeer = this.peerWhoRemoved;
        return Boolean.hashCode(this.roomWasEnded) + ((iHashCode + (hMSPeer == null ? 0 : hMSPeer.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSRemovedFromRoom(reason=");
        sb4.append(this.reason);
        sb4.append(", peerWhoRemoved=");
        sb4.append(this.peerWhoRemoved);
        sb4.append(", roomWasEnded=");
        return AbstractC2875y.m8305r(sb4, this.roomWasEnded, ')');
    }
}
