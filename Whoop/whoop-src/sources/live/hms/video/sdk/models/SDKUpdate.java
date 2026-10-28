package live.hms.video.sdk.models;

import io.getstream.chat.android.models.CommandDefaults;
import java.util.ArrayList;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.sdk.models.role.HMSRole;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00052\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate;", "", "<init>", "()V", "Track", "Companion", "Peer", "PeerListUpdate", "Broadcast", "Room", "HMSRoleChangeRequest", "HMSPeerRemoved", "HMSTrackStateUpdate", "Llive/hms/video/sdk/models/SDKUpdate$Broadcast;", "Llive/hms/video/sdk/models/SDKUpdate$HMSPeerRemoved;", "Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;", "Llive/hms/video/sdk/models/SDKUpdate$HMSTrackStateUpdate;", "Llive/hms/video/sdk/models/SDKUpdate$Peer;", "Llive/hms/video/sdk/models/SDKUpdate$PeerListUpdate;", "Llive/hms/video/sdk/models/SDKUpdate$Room;", "Llive/hms/video/sdk/models/SDKUpdate$Track;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class SDKUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate$Broadcast;", "Llive/hms/video/sdk/models/SDKUpdate;", "message", "Llive/hms/video/sdk/models/HMSMessage;", "<init>", "(Llive/hms/video/sdk/models/HMSMessage;)V", "getMessage", "()Llive/hms/video/sdk/models/HMSMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Broadcast extends SDKUpdate {
        private final HMSMessage message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Broadcast(HMSMessage message) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Broadcast copy$default(Broadcast broadcast, HMSMessage hMSMessage, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSMessage = broadcast.message;
            }
            return broadcast.copy(hMSMessage);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSMessage getMessage() {
            return this.message;
        }

        public final Broadcast copy(HMSMessage message) {
            AbstractC22676k.m65750j(message, "message");
            return new Broadcast(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Broadcast) && AbstractC22676k.m65745e(this.message, ((Broadcast) other).message);
        }

        public final HMSMessage getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Broadcast(message=" + this.message + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate$Companion;", "", "<init>", "()V", "trackMuteUpdate", "Llive/hms/video/sdk/models/SDKUpdate$Track;", "changedTrack", "Llive/hms/video/media/tracks/HMSTrack;", "store", "Llive/hms/video/sdk/SDKStore;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Track trackMuteUpdate(HMSTrack changedTrack, SDKStore store) {
            AbstractC22676k.m65750j(changedTrack, "changedTrack");
            AbstractC22676k.m65750j(store, "store");
            HMSLocalPeer localPeer = store.getLocalPeer();
            if (localPeer == null) {
                return null;
            }
            return new Track(changedTrack.getIsMute() ? HMSTrackUpdate.TRACK_MUTED : HMSTrackUpdate.TRACK_UNMUTED, changedTrack, localPeer);
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate$HMSPeerRemoved;", "Llive/hms/video/sdk/models/SDKUpdate;", "reason", "", "removedBy", "Llive/hms/video/sdk/models/HMSPeer;", "roomWasEnded", "", "<init>", "(Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Z)V", "getReason", "()Ljava/lang/String;", "getRemovedBy", "()Llive/hms/video/sdk/models/HMSPeer;", "getRoomWasEnded", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class HMSPeerRemoved extends SDKUpdate {
        private final String reason;
        private final HMSPeer removedBy;
        private final boolean roomWasEnded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HMSPeerRemoved(String reason, HMSPeer hMSPeer, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(reason, "reason");
            this.reason = reason;
            this.removedBy = hMSPeer;
            this.roomWasEnded = z4;
        }

        public static /* synthetic */ HMSPeerRemoved copy$default(HMSPeerRemoved hMSPeerRemoved, String str, HMSPeer hMSPeer, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = hMSPeerRemoved.reason;
            }
            if ((i13 & 2) != 0) {
                hMSPeer = hMSPeerRemoved.removedBy;
            }
            if ((i13 & 4) != 0) {
                z4 = hMSPeerRemoved.roomWasEnded;
            }
            return hMSPeerRemoved.copy(str, hMSPeer, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HMSPeer getRemovedBy() {
            return this.removedBy;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getRoomWasEnded() {
            return this.roomWasEnded;
        }

        public final HMSPeerRemoved copy(String reason, HMSPeer removedBy, boolean roomWasEnded) {
            AbstractC22676k.m65750j(reason, "reason");
            return new HMSPeerRemoved(reason, removedBy, roomWasEnded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HMSPeerRemoved)) {
                return false;
            }
            HMSPeerRemoved hMSPeerRemoved = (HMSPeerRemoved) other;
            return AbstractC22676k.m65745e(this.reason, hMSPeerRemoved.reason) && AbstractC22676k.m65745e(this.removedBy, hMSPeerRemoved.removedBy) && this.roomWasEnded == hMSPeerRemoved.roomWasEnded;
        }

        public final String getReason() {
            return this.reason;
        }

        public final HMSPeer getRemovedBy() {
            return this.removedBy;
        }

        public final boolean getRoomWasEnded() {
            return this.roomWasEnded;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            HMSPeer hMSPeer = this.removedBy;
            return Boolean.hashCode(this.roomWasEnded) + ((iHashCode + (hMSPeer == null ? 0 : hMSPeer.hashCode())) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("HMSPeerRemoved(reason=");
            sb4.append(this.reason);
            sb4.append(", removedBy=");
            sb4.append(this.removedBy);
            sb4.append(", roomWasEnded=");
            return AbstractC2875y.m8305r(sb4, this.roomWasEnded, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;", "Llive/hms/video/sdk/models/SDKUpdate;", "requestedBy", "Llive/hms/video/sdk/models/HMSPeer;", "suggestedRole", "Llive/hms/video/sdk/models/role/HMSRole;", "token", "", "<init>", "(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;)V", "getRequestedBy", "()Llive/hms/video/sdk/models/HMSPeer;", "getSuggestedRole", "()Llive/hms/video/sdk/models/role/HMSRole;", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class HMSRoleChangeRequest extends SDKUpdate {
        private final HMSPeer requestedBy;
        private final HMSRole suggestedRole;
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HMSRoleChangeRequest(HMSPeer hMSPeer, HMSRole suggestedRole, String token) {
            super(null);
            AbstractC22676k.m65750j(suggestedRole, "suggestedRole");
            AbstractC22676k.m65750j(token, "token");
            this.requestedBy = hMSPeer;
            this.suggestedRole = suggestedRole;
            this.token = token;
        }

        public static /* synthetic */ HMSRoleChangeRequest copy$default(HMSRoleChangeRequest hMSRoleChangeRequest, HMSPeer hMSPeer, HMSRole hMSRole, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSPeer = hMSRoleChangeRequest.requestedBy;
            }
            if ((i13 & 2) != 0) {
                hMSRole = hMSRoleChangeRequest.suggestedRole;
            }
            if ((i13 & 4) != 0) {
                str = hMSRoleChangeRequest.token;
            }
            return hMSRoleChangeRequest.copy(hMSPeer, hMSRole, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSPeer getRequestedBy() {
            return this.requestedBy;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HMSRole getSuggestedRole() {
            return this.suggestedRole;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final HMSRoleChangeRequest copy(HMSPeer requestedBy, HMSRole suggestedRole, String token) {
            AbstractC22676k.m65750j(suggestedRole, "suggestedRole");
            AbstractC22676k.m65750j(token, "token");
            return new HMSRoleChangeRequest(requestedBy, suggestedRole, token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HMSRoleChangeRequest)) {
                return false;
            }
            HMSRoleChangeRequest hMSRoleChangeRequest = (HMSRoleChangeRequest) other;
            return AbstractC22676k.m65745e(this.requestedBy, hMSRoleChangeRequest.requestedBy) && AbstractC22676k.m65745e(this.suggestedRole, hMSRoleChangeRequest.suggestedRole) && AbstractC22676k.m65745e(this.token, hMSRoleChangeRequest.token);
        }

        public final HMSPeer getRequestedBy() {
            return this.requestedBy;
        }

        public final HMSRole getSuggestedRole() {
            return this.suggestedRole;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            HMSPeer hMSPeer = this.requestedBy;
            return this.token.hashCode() + ((this.suggestedRole.hashCode() + ((hMSPeer == null ? 0 : hMSPeer.hashCode()) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("HMSRoleChangeRequest(requestedBy=");
            sb4.append(this.requestedBy);
            sb4.append(", suggestedRole=");
            sb4.append(this.suggestedRole);
            sb4.append(", token=");
            return AbstractC25012a.m73377j(sb4, this.token, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate$HMSTrackStateUpdate;", "Llive/hms/video/sdk/models/SDKUpdate;", "track", "Llive/hms/video/media/tracks/HMSTrack;", "requestedBy", "Llive/hms/video/sdk/models/HMSPeer;", CommandDefaults.MUTE, "", "<init>", "(Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;Z)V", "getTrack", "()Llive/hms/video/media/tracks/HMSTrack;", "getRequestedBy", "()Llive/hms/video/sdk/models/HMSPeer;", "getMute", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class HMSTrackStateUpdate extends SDKUpdate {
        private final boolean mute;
        private final HMSPeer requestedBy;
        private final HMSTrack track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HMSTrackStateUpdate(HMSTrack track, HMSPeer hMSPeer, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(track, "track");
            this.track = track;
            this.requestedBy = hMSPeer;
            this.mute = z4;
        }

        public static /* synthetic */ HMSTrackStateUpdate copy$default(HMSTrackStateUpdate hMSTrackStateUpdate, HMSTrack hMSTrack, HMSPeer hMSPeer, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSTrack = hMSTrackStateUpdate.track;
            }
            if ((i13 & 2) != 0) {
                hMSPeer = hMSTrackStateUpdate.requestedBy;
            }
            if ((i13 & 4) != 0) {
                z4 = hMSTrackStateUpdate.mute;
            }
            return hMSTrackStateUpdate.copy(hMSTrack, hMSPeer, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSTrack getTrack() {
            return this.track;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HMSPeer getRequestedBy() {
            return this.requestedBy;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getMute() {
            return this.mute;
        }

        public final HMSTrackStateUpdate copy(HMSTrack track, HMSPeer requestedBy, boolean mute) {
            AbstractC22676k.m65750j(track, "track");
            return new HMSTrackStateUpdate(track, requestedBy, mute);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HMSTrackStateUpdate)) {
                return false;
            }
            HMSTrackStateUpdate hMSTrackStateUpdate = (HMSTrackStateUpdate) other;
            return AbstractC22676k.m65745e(this.track, hMSTrackStateUpdate.track) && AbstractC22676k.m65745e(this.requestedBy, hMSTrackStateUpdate.requestedBy) && this.mute == hMSTrackStateUpdate.mute;
        }

        public final boolean getMute() {
            return this.mute;
        }

        public final HMSPeer getRequestedBy() {
            return this.requestedBy;
        }

        public final HMSTrack getTrack() {
            return this.track;
        }

        public int hashCode() {
            int iHashCode = this.track.hashCode() * 31;
            HMSPeer hMSPeer = this.requestedBy;
            return Boolean.hashCode(this.mute) + ((iHashCode + (hMSPeer == null ? 0 : hMSPeer.hashCode())) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("HMSTrackStateUpdate(track=");
            sb4.append(this.track);
            sb4.append(", requestedBy=");
            sb4.append(this.requestedBy);
            sb4.append(", mute=");
            return AbstractC2875y.m8305r(sb4, this.mute, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate$Peer;", "Llive/hms/video/sdk/models/SDKUpdate;", "type", "Llive/hms/video/sdk/models/enums/HMSPeerUpdate;", "peer", "Llive/hms/video/sdk/models/HMSPeer;", "<init>", "(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V", "getType", "()Llive/hms/video/sdk/models/enums/HMSPeerUpdate;", "getPeer", "()Llive/hms/video/sdk/models/HMSPeer;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Peer extends SDKUpdate {
        private final HMSPeer peer;
        private final HMSPeerUpdate type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Peer(HMSPeerUpdate type, HMSPeer peer) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(peer, "peer");
            this.type = type;
            this.peer = peer;
        }

        public static /* synthetic */ Peer copy$default(Peer peer, HMSPeerUpdate hMSPeerUpdate, HMSPeer hMSPeer, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSPeerUpdate = peer.type;
            }
            if ((i13 & 2) != 0) {
                hMSPeer = peer.peer;
            }
            return peer.copy(hMSPeerUpdate, hMSPeer);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSPeerUpdate getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HMSPeer getPeer() {
            return this.peer;
        }

        public final Peer copy(HMSPeerUpdate type, HMSPeer peer) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(peer, "peer");
            return new Peer(type, peer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Peer)) {
                return false;
            }
            Peer peer = (Peer) other;
            return this.type == peer.type && AbstractC22676k.m65745e(this.peer, peer.peer);
        }

        public final HMSPeer getPeer() {
            return this.peer;
        }

        public final HMSPeerUpdate getType() {
            return this.type;
        }

        public int hashCode() {
            return this.peer.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "Peer(type=" + this.type + ", peer=" + this.peer + ')';
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\"\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0002\u0010\nJJ\u0010\u000f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R'\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR'\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\n¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate$PeerListUpdate;", "Llive/hms/video/sdk/models/SDKUpdate;", "peersAdded", "Lkotlin/collections/ArrayList;", "Llive/hms/video/sdk/models/HMSPeer;", "Ljava/util/ArrayList;", "peersRemoved", "<init>", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getPeersAdded", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getPeersRemoved", "component1", "component2", "copy", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)Llive/hms/video/sdk/models/SDKUpdate$PeerListUpdate;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerListUpdate extends SDKUpdate {
        private final ArrayList<HMSPeer> peersAdded;
        private final ArrayList<HMSPeer> peersRemoved;

        public PeerListUpdate(ArrayList<HMSPeer> arrayList, ArrayList<HMSPeer> arrayList2) {
            super(null);
            this.peersAdded = arrayList;
            this.peersRemoved = arrayList2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PeerListUpdate copy$default(PeerListUpdate peerListUpdate, ArrayList arrayList, ArrayList arrayList2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                arrayList = peerListUpdate.peersAdded;
            }
            if ((i13 & 2) != 0) {
                arrayList2 = peerListUpdate.peersRemoved;
            }
            return peerListUpdate.copy(arrayList, arrayList2);
        }

        public final ArrayList<HMSPeer> component1() {
            return this.peersAdded;
        }

        public final ArrayList<HMSPeer> component2() {
            return this.peersRemoved;
        }

        public final PeerListUpdate copy(ArrayList<HMSPeer> peersAdded, ArrayList<HMSPeer> peersRemoved) {
            return new PeerListUpdate(peersAdded, peersRemoved);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerListUpdate)) {
                return false;
            }
            PeerListUpdate peerListUpdate = (PeerListUpdate) other;
            return AbstractC22676k.m65745e(this.peersAdded, peerListUpdate.peersAdded) && AbstractC22676k.m65745e(this.peersRemoved, peerListUpdate.peersRemoved);
        }

        public final ArrayList<HMSPeer> getPeersAdded() {
            return this.peersAdded;
        }

        public final ArrayList<HMSPeer> getPeersRemoved() {
            return this.peersRemoved;
        }

        public int hashCode() {
            ArrayList<HMSPeer> arrayList = this.peersAdded;
            int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
            ArrayList<HMSPeer> arrayList2 = this.peersRemoved;
            return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
        }

        public String toString() {
            return "PeerListUpdate(peersAdded=" + this.peersAdded + ", peersRemoved=" + this.peersRemoved + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate$Room;", "Llive/hms/video/sdk/models/SDKUpdate;", "type", "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;", "<init>", "(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V", "getType", "()Llive/hms/video/sdk/models/enums/HMSRoomUpdate;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Room extends SDKUpdate {
        private final HMSRoomUpdate type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Room(HMSRoomUpdate type) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
        }

        public static /* synthetic */ Room copy$default(Room room, HMSRoomUpdate hMSRoomUpdate, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSRoomUpdate = room.type;
            }
            return room.copy(hMSRoomUpdate);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSRoomUpdate getType() {
            return this.type;
        }

        public final Room copy(HMSRoomUpdate type) {
            AbstractC22676k.m65750j(type, "type");
            return new Room(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Room) && this.type == ((Room) other).type;
        }

        public final HMSRoomUpdate getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "Room(type=" + this.type + ')';
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/sdk/models/SDKUpdate$Track;", "Llive/hms/video/sdk/models/SDKUpdate;", "type", "Llive/hms/video/sdk/models/enums/HMSTrackUpdate;", "track", "Llive/hms/video/media/tracks/HMSTrack;", "peer", "Llive/hms/video/sdk/models/HMSPeer;", "<init>", "(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V", "getType", "()Llive/hms/video/sdk/models/enums/HMSTrackUpdate;", "getTrack", "()Llive/hms/video/media/tracks/HMSTrack;", "getPeer", "()Llive/hms/video/sdk/models/HMSPeer;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Track extends SDKUpdate {
        private final HMSPeer peer;
        private final HMSTrack track;
        private final HMSTrackUpdate type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Track(HMSTrackUpdate type, HMSTrack track, HMSPeer peer) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(track, "track");
            AbstractC22676k.m65750j(peer, "peer");
            this.type = type;
            this.track = track;
            this.peer = peer;
        }

        public static /* synthetic */ Track copy$default(Track track, HMSTrackUpdate hMSTrackUpdate, HMSTrack hMSTrack, HMSPeer hMSPeer, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSTrackUpdate = track.type;
            }
            if ((i13 & 2) != 0) {
                hMSTrack = track.track;
            }
            if ((i13 & 4) != 0) {
                hMSPeer = track.peer;
            }
            return track.copy(hMSTrackUpdate, hMSTrack, hMSPeer);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSTrackUpdate getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HMSTrack getTrack() {
            return this.track;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final HMSPeer getPeer() {
            return this.peer;
        }

        public final Track copy(HMSTrackUpdate type, HMSTrack track, HMSPeer peer) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(track, "track");
            AbstractC22676k.m65750j(peer, "peer");
            return new Track(type, track, peer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Track)) {
                return false;
            }
            Track track = (Track) other;
            return this.type == track.type && AbstractC22676k.m65745e(this.track, track.track) && AbstractC22676k.m65745e(this.peer, track.peer);
        }

        public final HMSPeer getPeer() {
            return this.peer;
        }

        public final HMSTrack getTrack() {
            return this.track;
        }

        public final HMSTrackUpdate getType() {
            return this.type;
        }

        public int hashCode() {
            return this.peer.hashCode() + ((this.track.hashCode() + (this.type.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Track(type=" + this.type + ", track=" + this.track + ", peer=" + this.peer + ')';
        }
    }

    public /* synthetic */ SDKUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SDKUpdate() {
    }
}
