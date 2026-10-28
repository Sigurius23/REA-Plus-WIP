package live.hms.video.sdk.models;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.models.CommandDefaults;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.polls.models.HmsPollCategory;
import live.hms.video.polls.models.HmsPollUserTrackingMode;
import live.hms.video.polls.models.PollStatsQuestions;
import live.hms.video.sdk.models.enums.HMSNotificationMethod;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sdk.peerlist.models.BeamRecordingStates;
import live.hms.video.sdk.peerlist.models.BeamStreamingStates;
import live.hms.video.sdk.peerlist.models.Recording;
import live.hms.video.sessionstore.SessionMetadataResult;
import live.hms.video.utils.GsonUtils;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 $2\u00020\u0001:3\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001f789:;<=>?@ABCDEFGHIJKLMNOPQRSTU¨\u0006V"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications;", "", "<init>", "()V", "NodeInfo", "Peer", "PeerJoin", "PeerLeave", "Track", "PeerNetworkInfoList", "PeerInfo", "TranscriptionsPeerList", "PeerList", "InitialRoom", "Streaming", "Rtmp", "Hls", "TrackMetadataPeer", "TrackMetadata", "RoleChange", "PolicyChange", "WhiteboardPermissions", "Whiteboard", "TranscriptionsPluginPermissions", "TranscriptionsPlugin", "NoiseCancellationPlugin", "Plugins", "SpeakerList", "BroadcastPeer", "BroadcastInfo", "OnBroadcast", "RoomInfo", "SessionInfo", "WhiteboardInfo", "OnRoleChangeRequest", "Unsupported", "Companion", "PeerRemoved", "TrackUpdateRequest", "ChangeTrackMuteRequest", "RtmpUpdateNotification", "RecordUpdateNotification", "HlsUpdateNotification", "HlsStartRecording", "ServerError", "OnTrackLayerUpdate", "OnSessionStoreMetadataChange", "OnPollStart", "StartedPolls", "OnPollStop", "StoppedPolls", "OnPollStats", "PollStats", "TranscriptionPeer", "OnTranscriptionUpdate", "Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;", "Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;", "Llive/hms/video/sdk/models/HMSNotifications$HlsUpdateNotification;", "Llive/hms/video/sdk/models/HMSNotifications$NodeInfo;", "Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;", "Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;", "Llive/hms/video/sdk/models/HMSNotifications$OnPollStats;", "Llive/hms/video/sdk/models/HMSNotifications$OnPollStop;", "Llive/hms/video/sdk/models/HMSNotifications$OnRoleChangeRequest;", "Llive/hms/video/sdk/models/HMSNotifications$OnSessionStoreMetadataChange;", "Llive/hms/video/sdk/models/HMSNotifications$OnTrackLayerUpdate;", "Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;", "Llive/hms/video/sdk/models/HMSNotifications$Peer;", "Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;", "Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;", "Llive/hms/video/sdk/models/HMSNotifications$PeerList;", "Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;", "Llive/hms/video/sdk/models/HMSNotifications$PeerRemoved;", "Llive/hms/video/sdk/models/HMSNotifications$PolicyChange;", "Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;", "Llive/hms/video/sdk/models/HMSNotifications$RoleChange;", "Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;", "Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;", "Llive/hms/video/sdk/models/HMSNotifications$SessionInfo;", "Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;", "Llive/hms/video/sdk/models/HMSNotifications$TrackMetadataPeer;", "Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;", "Llive/hms/video/sdk/models/HMSNotifications$Unsupported;", "Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class HMSNotifications {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;", "", "message", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class BroadcastInfo {

        @SerializedName("message")
        private final String message;

        @SerializedName("type")
        private final String type;

        public BroadcastInfo(String message, String type) {
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(type, "type");
            this.message = message;
            this.type = type;
        }

        public static /* synthetic */ BroadcastInfo copy$default(BroadcastInfo broadcastInfo, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = broadcastInfo.message;
            }
            if ((i13 & 2) != 0) {
                str2 = broadcastInfo.type;
            }
            return broadcastInfo.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final BroadcastInfo copy(String message, String type) {
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(type, "type");
            return new BroadcastInfo(message, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BroadcastInfo)) {
                return false;
            }
            BroadcastInfo broadcastInfo = (BroadcastInfo) other;
            return AbstractC22676k.m65745e(this.message, broadcastInfo.message) && AbstractC22676k.m65745e(this.type, broadcastInfo.type);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.message.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("BroadcastInfo(message=");
            sb4.append(this.message);
            sb4.append(", type=");
            return AbstractC25012a.m73377j(sb4, this.type, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;", "Llive/hms/video/sdk/models/HMSNotifications;", "peerId", "", "role", "groups", "Ljava/util/ArrayList;", "info", "Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)V", "getPeerId", "()Ljava/lang/String;", "getRole", "getGroups", "()Ljava/util/ArrayList;", "getInfo", "()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class BroadcastPeer extends HMSNotifications {

        @SerializedName("groups")
        private final ArrayList<String> groups;

        @SerializedName("info")
        private final PeerInfo info;

        @SerializedName("peer_id")
        private final String peerId;

        @SerializedName("role")
        private final String role;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BroadcastPeer(String peerId, String role, ArrayList<String> arrayList, PeerInfo info) {
            super(null);
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            this.peerId = peerId;
            this.role = role;
            this.groups = arrayList;
            this.info = info;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BroadcastPeer copy$default(BroadcastPeer broadcastPeer, String str, String str2, ArrayList arrayList, PeerInfo peerInfo, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = broadcastPeer.peerId;
            }
            if ((i13 & 2) != 0) {
                str2 = broadcastPeer.role;
            }
            if ((i13 & 4) != 0) {
                arrayList = broadcastPeer.groups;
            }
            if ((i13 & 8) != 0) {
                peerInfo = broadcastPeer.info;
            }
            return broadcastPeer.copy(str, str2, arrayList, peerInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        public final ArrayList<String> component3() {
            return this.groups;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final PeerInfo getInfo() {
            return this.info;
        }

        public final BroadcastPeer copy(String peerId, String role, ArrayList<String> groups, PeerInfo info) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            return new BroadcastPeer(peerId, role, groups, info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BroadcastPeer)) {
                return false;
            }
            BroadcastPeer broadcastPeer = (BroadcastPeer) other;
            return AbstractC22676k.m65745e(this.peerId, broadcastPeer.peerId) && AbstractC22676k.m65745e(this.role, broadcastPeer.role) && AbstractC22676k.m65745e(this.groups, broadcastPeer.groups) && AbstractC22676k.m65745e(this.info, broadcastPeer.info);
        }

        public final ArrayList<String> getGroups() {
            return this.groups;
        }

        public final PeerInfo getInfo() {
            return this.info;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final String getRole() {
            return this.role;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.peerId.hashCode() * 31, 31, this.role);
            ArrayList<String> arrayList = this.groups;
            return this.info.hashCode() + ((iM30450d + (arrayList == null ? 0 : arrayList.hashCode())) * 31);
        }

        public String toString() {
            return "BroadcastPeer(peerId=" + this.peerId + ", role=" + this.role + ", groups=" + this.groups + ", info=" + this.info + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$ChangeTrackMuteRequest;", "Llive/hms/video/sdk/models/HMSNotifications;", "peerId", "", "roles", "", "type", "source", CommandDefaults.MUTE, "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getPeerId", "()Ljava/lang/String;", "getRoles", "()Ljava/util/List;", "getType", "getSource", "getMute", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class ChangeTrackMuteRequest extends HMSNotifications {

        @SerializedName("value")
        private final boolean mute;

        @SerializedName("requested_by")
        private final String peerId;

        @SerializedName("roles")
        private final List<String> roles;

        @SerializedName("source")
        private final String source;

        @SerializedName("type")
        private final String type;

        public ChangeTrackMuteRequest(String str, List<String> list, String str2, String str3, boolean z4) {
            super(null);
            this.peerId = str;
            this.roles = list;
            this.type = str2;
            this.source = str3;
            this.mute = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChangeTrackMuteRequest copy$default(ChangeTrackMuteRequest changeTrackMuteRequest, String str, List list, String str2, String str3, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = changeTrackMuteRequest.peerId;
            }
            if ((i13 & 2) != 0) {
                list = changeTrackMuteRequest.roles;
            }
            if ((i13 & 4) != 0) {
                str2 = changeTrackMuteRequest.type;
            }
            if ((i13 & 8) != 0) {
                str3 = changeTrackMuteRequest.source;
            }
            if ((i13 & 16) != 0) {
                z4 = changeTrackMuteRequest.mute;
            }
            boolean z13 = z4;
            String str4 = str2;
            return changeTrackMuteRequest.copy(str, list, str4, str3, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        public final List<String> component2() {
            return this.roles;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getMute() {
            return this.mute;
        }

        public final ChangeTrackMuteRequest copy(String peerId, List<String> roles, String type, String source, boolean mute) {
            return new ChangeTrackMuteRequest(peerId, roles, type, source, mute);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeTrackMuteRequest)) {
                return false;
            }
            ChangeTrackMuteRequest changeTrackMuteRequest = (ChangeTrackMuteRequest) other;
            return AbstractC22676k.m65745e(this.peerId, changeTrackMuteRequest.peerId) && AbstractC22676k.m65745e(this.roles, changeTrackMuteRequest.roles) && AbstractC22676k.m65745e(this.type, changeTrackMuteRequest.type) && AbstractC22676k.m65745e(this.source, changeTrackMuteRequest.source) && this.mute == changeTrackMuteRequest.mute;
        }

        public final boolean getMute() {
            return this.mute;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final List<String> getRoles() {
            return this.roles;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.peerId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.roles;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.type;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.source;
            return Boolean.hashCode(this.mute) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("ChangeTrackMuteRequest(peerId=");
            sb4.append(this.peerId);
            sb4.append(", roles=");
            sb4.append(this.roles);
            sb4.append(", type=");
            sb4.append(this.type);
            sb4.append(", source=");
            sb4.append(this.source);
            sb4.append(", mute=");
            return AbstractC2875y.m8305r(sb4, this.mute, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/sdk/models/HMSNotifications;", "method", "", "params", "Lcom/google/gson/JsonObject;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:112:0x017e  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final HMSNotifications from(String method, JsonObject params) {
            AbstractC22676k.m65750j(method, "method");
            AbstractC22676k.m65750j(params, "params");
            GenericDeclaration genericDeclaration = TrackMetadata.class;
            switch (method.hashCode()) {
                case -2075759176:
                    if (!method.equals(HMSNotificationMethod.ON_CONNECTION_QUALITY_UPDATE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = PeerNetworkInfoList.class;
                    }
                    break;
                case -2036682366:
                    if (!method.equals(HMSNotificationMethod.ON_POLL_START)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = OnPollStart.class;
                    }
                    break;
                case -2036682305:
                    if (!method.equals(HMSNotificationMethod.ON_POLL_STATS)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = OnPollStats.class;
                    }
                    break;
                case -2028682565:
                    if (!method.equals(HMSNotificationMethod.ON_ROLE_CHANGE_REQUEST)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = OnRoleChangeRequest.class;
                    }
                    break;
                case -1856712757:
                    if (!method.equals(HMSNotificationMethod.WHITEBOARD_UPDATE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = WhiteboardInfo.class;
                    }
                    break;
                case -1826408873:
                    if (!method.equals(HMSNotificationMethod.ON_RECORD_UPDATE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = RecordUpdateNotification.class;
                    }
                    break;
                case -1418197835:
                    if (!method.equals(HMSNotificationMethod.ON_TRACK_LAYER_UPDATE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = OnTrackLayerUpdate.class;
                    }
                    break;
                case -1113893280:
                    if (!method.equals(HMSNotificationMethod.ROOM_INFO)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = RoomInfo.class;
                    }
                    break;
                case -1090158521:
                    if (!method.equals(HMSNotificationMethod.PEER_JOIN)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = PeerJoin.class;
                    }
                    break;
                case -1076391952:
                    if (!method.equals(HMSNotificationMethod.ON_CHANGE_TRACK_MUTE_REQUEST)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = ChangeTrackMuteRequest.class;
                    }
                    break;
                case -732745339:
                    if (!method.equals(HMSNotificationMethod.SESSION_INFO)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = SessionInfo.class;
                    }
                    break;
                case -524923309:
                    if (!method.equals(HMSNotificationMethod.ON_BROADCAST)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = OnBroadcast.class;
                    }
                    break;
                case -161543905:
                    if (!method.equals(HMSNotificationMethod.ROOM_STATE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = PeerList.class;
                    }
                    break;
                case 419318169:
                    if (!method.equals(HMSNotificationMethod.NODE_INFO)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = NodeInfo.class;
                    }
                    break;
                case 566366010:
                    if (!method.equals(HMSNotificationMethod.PEER_LEAVE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = PeerLeave.class;
                    }
                    break;
                case 645367974:
                    if (!method.equals(HMSNotificationMethod.ON_PEER_UPDATE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = Peer.class;
                    }
                    break;
                case 649040057:
                    if (!method.equals(HMSNotificationMethod.ON_TRACK_UPDATE)) {
                        genericDeclaration = Unsupported.class;
                    }
                    break;
                case 659247136:
                    if (!method.equals(HMSNotificationMethod.ON_METADATA_CHANGE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = OnSessionStoreMetadataChange.class;
                    }
                    break;
                case 796368251:
                    if (!method.equals(HMSNotificationMethod.ON_TRACK_UPDATE_REQUEST)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = TrackUpdateRequest.class;
                    }
                    break;
                case 861088571:
                    if (!method.equals(HMSNotificationMethod.ACTIVE_SPEAKERS)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = SpeakerList.class;
                    }
                    break;
                case 904132322:
                    if (!method.equals(HMSNotificationMethod.ON_POLL_STOP)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = OnPollStop.class;
                    }
                    break;
                case 1001146685:
                    if (!method.equals(HMSNotificationMethod.ON_POLICY_CHANGE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = PolicyChange.class;
                    }
                    break;
                case 1571293948:
                    if (!method.equals(HMSNotificationMethod.ON_PEER_REMOVED)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = PeerRemoved.class;
                    }
                    break;
                case 1788119442:
                    if (!method.equals(HMSNotificationMethod.ON_TRANSCRIPTION_UPDATE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = OnTranscriptionUpdate.class;
                    }
                    break;
                case 1822598833:
                    if (!method.equals(HMSNotificationMethod.ON_TRACK_ADD)) {
                        genericDeclaration = Unsupported.class;
                    }
                    break;
                case 1928310083:
                    if (!method.equals(HMSNotificationMethod.ON_RTMP_UPDATE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = RtmpUpdateNotification.class;
                    }
                    break;
                case 1957486869:
                    if (!method.equals(HMSNotificationMethod.ON_HLS_UPDATE)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = HlsUpdateNotification.class;
                    }
                    break;
                case 2110909993:
                    if (!method.equals(HMSNotificationMethod.PEER_LIST)) {
                        genericDeclaration = Unsupported.class;
                    } else {
                        genericDeclaration = PeerList.class;
                    }
                    break;
                default:
                    genericDeclaration = Unsupported.class;
                    break;
            }
            Object objFromJson = GsonUtils.INSTANCE.getGson().fromJson((JsonElement) params, (Class<Object>) genericDeclaration);
            AbstractC22676k.m65749i(objFromJson, "fromJson(...)");
            return (HMSNotifications) objFromJson;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Hls;", "", "enabled", "", "variants", "Ljava/util/ArrayList;", "Llive/hms/video/sdk/models/HMSHLSVariant;", "<init>", "(ZLjava/util/ArrayList;)V", "getEnabled", "()Z", "getVariants", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Hls {

        @SerializedName("enabled")
        private final boolean enabled;

        @SerializedName("variants")
        private final ArrayList<HMSHLSVariant> variants;

        public Hls(boolean z4, ArrayList<HMSHLSVariant> arrayList) {
            this.enabled = z4;
            this.variants = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Hls copy$default(Hls hls, boolean z4, ArrayList arrayList, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = hls.enabled;
            }
            if ((i13 & 2) != 0) {
                arrayList = hls.variants;
            }
            return hls.copy(z4, arrayList);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final ArrayList<HMSHLSVariant> component2() {
            return this.variants;
        }

        public final Hls copy(boolean enabled, ArrayList<HMSHLSVariant> variants) {
            return new Hls(enabled, variants);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hls)) {
                return false;
            }
            Hls hls = (Hls) other;
            return this.enabled == hls.enabled && AbstractC22676k.m65745e(this.variants, hls.variants);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final ArrayList<HMSHLSVariant> getVariants() {
            return this.variants;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.enabled) * 31;
            ArrayList<HMSHLSVariant> arrayList = this.variants;
            return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
        }

        public String toString() {
            return "Hls(enabled=" + this.enabled + ", variants=" + this.variants + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$HlsStartRecording;", "", "vod", "", "singleFilePerLayer", "<init>", "(ZZ)V", "getVod", "()Z", "getSingleFilePerLayer", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class HlsStartRecording {

        @SerializedName("single_file_per_layer")
        private final boolean singleFilePerLayer;

        @SerializedName("hls_vod")
        private final boolean vod;

        public HlsStartRecording(boolean z4, boolean z13) {
            this.vod = z4;
            this.singleFilePerLayer = z13;
        }

        public static /* synthetic */ HlsStartRecording copy$default(HlsStartRecording hlsStartRecording, boolean z4, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = hlsStartRecording.vod;
            }
            if ((i13 & 2) != 0) {
                z13 = hlsStartRecording.singleFilePerLayer;
            }
            return hlsStartRecording.copy(z4, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getVod() {
            return this.vod;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getSingleFilePerLayer() {
            return this.singleFilePerLayer;
        }

        public final HlsStartRecording copy(boolean vod, boolean singleFilePerLayer) {
            return new HlsStartRecording(vod, singleFilePerLayer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HlsStartRecording)) {
                return false;
            }
            HlsStartRecording hlsStartRecording = (HlsStartRecording) other;
            return this.vod == hlsStartRecording.vod && this.singleFilePerLayer == hlsStartRecording.singleFilePerLayer;
        }

        public final boolean getSingleFilePerLayer() {
            return this.singleFilePerLayer;
        }

        public final boolean getVod() {
            return this.vod;
        }

        public int hashCode() {
            return Boolean.hashCode(this.singleFilePerLayer) + (Boolean.hashCode(this.vod) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("HlsStartRecording(vod=");
            sb4.append(this.vod);
            sb4.append(", singleFilePerLayer=");
            return AbstractC2875y.m8305r(sb4, this.singleFilePerLayer, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$HlsUpdateNotification;", "Llive/hms/video/sdk/models/HMSNotifications;", "variants", "Ljava/util/ArrayList;", "Llive/hms/video/sdk/models/HMSHLSVariant;", "hlsStartRecording", "Llive/hms/video/sdk/models/HMSNotifications$HlsStartRecording;", "serverError", "Llive/hms/video/sdk/models/HMSNotifications$ServerError;", "<init>", "(Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$HlsStartRecording;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)V", "getVariants", "()Ljava/util/ArrayList;", "setVariants", "(Ljava/util/ArrayList;)V", "getHlsStartRecording", "()Llive/hms/video/sdk/models/HMSNotifications$HlsStartRecording;", "getServerError", "()Llive/hms/video/sdk/models/HMSNotifications$ServerError;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class HlsUpdateNotification extends HMSNotifications {

        @SerializedName("hls_recording")
        private final HlsStartRecording hlsStartRecording;

        @SerializedName("error")
        private final ServerError serverError;

        @SerializedName("variants")
        private ArrayList<HMSHLSVariant> variants;

        public HlsUpdateNotification(ArrayList<HMSHLSVariant> arrayList, HlsStartRecording hlsStartRecording, ServerError serverError) {
            super(null);
            this.variants = arrayList;
            this.hlsStartRecording = hlsStartRecording;
            this.serverError = serverError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HlsUpdateNotification copy$default(HlsUpdateNotification hlsUpdateNotification, ArrayList arrayList, HlsStartRecording hlsStartRecording, ServerError serverError, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                arrayList = hlsUpdateNotification.variants;
            }
            if ((i13 & 2) != 0) {
                hlsStartRecording = hlsUpdateNotification.hlsStartRecording;
            }
            if ((i13 & 4) != 0) {
                serverError = hlsUpdateNotification.serverError;
            }
            return hlsUpdateNotification.copy(arrayList, hlsStartRecording, serverError);
        }

        public final ArrayList<HMSHLSVariant> component1() {
            return this.variants;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HlsStartRecording getHlsStartRecording() {
            return this.hlsStartRecording;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ServerError getServerError() {
            return this.serverError;
        }

        public final HlsUpdateNotification copy(ArrayList<HMSHLSVariant> variants, HlsStartRecording hlsStartRecording, ServerError serverError) {
            return new HlsUpdateNotification(variants, hlsStartRecording, serverError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HlsUpdateNotification)) {
                return false;
            }
            HlsUpdateNotification hlsUpdateNotification = (HlsUpdateNotification) other;
            return AbstractC22676k.m65745e(this.variants, hlsUpdateNotification.variants) && AbstractC22676k.m65745e(this.hlsStartRecording, hlsUpdateNotification.hlsStartRecording) && AbstractC22676k.m65745e(this.serverError, hlsUpdateNotification.serverError);
        }

        public final HlsStartRecording getHlsStartRecording() {
            return this.hlsStartRecording;
        }

        public final ServerError getServerError() {
            return this.serverError;
        }

        public final ArrayList<HMSHLSVariant> getVariants() {
            return this.variants;
        }

        public int hashCode() {
            ArrayList<HMSHLSVariant> arrayList = this.variants;
            int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
            HlsStartRecording hlsStartRecording = this.hlsStartRecording;
            int iHashCode2 = (iHashCode + (hlsStartRecording == null ? 0 : hlsStartRecording.hashCode())) * 31;
            ServerError serverError = this.serverError;
            return iHashCode2 + (serverError != null ? serverError.hashCode() : 0);
        }

        public final void setVariants(ArrayList<HMSHLSVariant> arrayList) {
            this.variants = arrayList;
        }

        public String toString() {
            return "HlsUpdateNotification(variants=" + this.variants + ", hlsStartRecording=" + this.hlsStartRecording + ", serverError=" + this.serverError + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;", "", "roomId", "", "sessionId", "name", "startedAt", "", "recording", "Llive/hms/video/sdk/peerlist/models/Recording;", "streaming", "Llive/hms/video/sdk/models/HMSNotifications$Streaming;", "transcriptions", "", "Llive/hms/video/sdk/models/Transcriptions;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLlive/hms/video/sdk/peerlist/models/Recording;Llive/hms/video/sdk/models/HMSNotifications$Streaming;Ljava/util/List;)V", "getRoomId", "()Ljava/lang/String;", "getSessionId", "getName", "getStartedAt", "()J", "getRecording", "()Llive/hms/video/sdk/peerlist/models/Recording;", "getStreaming", "()Llive/hms/video/sdk/models/HMSNotifications$Streaming;", "getTranscriptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class InitialRoom {

        @SerializedName("name")
        private final String name;

        @SerializedName("recording")
        private final Recording recording;

        @SerializedName("room_id")
        private final String roomId;

        @SerializedName("session_id")
        private final String sessionId;

        @SerializedName("started_at")
        private final long startedAt;

        @SerializedName("streaming")
        private final Streaming streaming;

        @SerializedName("transcriptions")
        private final List<Transcriptions> transcriptions;

        public InitialRoom(String roomId, String sessionId, String name, long j7, Recording recording, Streaming streaming, List<Transcriptions> list) {
            AbstractC22676k.m65750j(roomId, "roomId");
            AbstractC22676k.m65750j(sessionId, "sessionId");
            AbstractC22676k.m65750j(name, "name");
            this.roomId = roomId;
            this.sessionId = sessionId;
            this.name = name;
            this.startedAt = j7;
            this.recording = recording;
            this.streaming = streaming;
            this.transcriptions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InitialRoom copy$default(InitialRoom initialRoom, String str, String str2, String str3, long j7, Recording recording, Streaming streaming, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = initialRoom.roomId;
            }
            if ((i13 & 2) != 0) {
                str2 = initialRoom.sessionId;
            }
            if ((i13 & 4) != 0) {
                str3 = initialRoom.name;
            }
            if ((i13 & 8) != 0) {
                j7 = initialRoom.startedAt;
            }
            if ((i13 & 16) != 0) {
                recording = initialRoom.recording;
            }
            if ((i13 & 32) != 0) {
                streaming = initialRoom.streaming;
            }
            if ((i13 & 64) != 0) {
                list = initialRoom.transcriptions;
            }
            List list2 = list;
            Recording recording2 = recording;
            long j13 = j7;
            String str4 = str3;
            return initialRoom.copy(str, str2, str4, j13, recording2, streaming, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRoomId() {
            return this.roomId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getStartedAt() {
            return this.startedAt;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Recording getRecording() {
            return this.recording;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Streaming getStreaming() {
            return this.streaming;
        }

        public final List<Transcriptions> component7() {
            return this.transcriptions;
        }

        public final InitialRoom copy(String roomId, String sessionId, String name, long startedAt, Recording recording, Streaming streaming, List<Transcriptions> transcriptions) {
            AbstractC22676k.m65750j(roomId, "roomId");
            AbstractC22676k.m65750j(sessionId, "sessionId");
            AbstractC22676k.m65750j(name, "name");
            return new InitialRoom(roomId, sessionId, name, startedAt, recording, streaming, transcriptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitialRoom)) {
                return false;
            }
            InitialRoom initialRoom = (InitialRoom) other;
            return AbstractC22676k.m65745e(this.roomId, initialRoom.roomId) && AbstractC22676k.m65745e(this.sessionId, initialRoom.sessionId) && AbstractC22676k.m65745e(this.name, initialRoom.name) && this.startedAt == initialRoom.startedAt && AbstractC22676k.m65745e(this.recording, initialRoom.recording) && AbstractC22676k.m65745e(this.streaming, initialRoom.streaming) && AbstractC22676k.m65745e(this.transcriptions, initialRoom.transcriptions);
        }

        public final String getName() {
            return this.name;
        }

        public final Recording getRecording() {
            return this.recording;
        }

        public final String getRoomId() {
            return this.roomId;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final long getStartedAt() {
            return this.startedAt;
        }

        public final Streaming getStreaming() {
            return this.streaming;
        }

        public final List<Transcriptions> getTranscriptions() {
            return this.transcriptions;
        }

        public int hashCode() {
            int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.roomId.hashCode() * 31, 31, this.sessionId), 31, this.name), this.startedAt, 31);
            Recording recording = this.recording;
            int iHashCode = (iM30451e + (recording == null ? 0 : recording.hashCode())) * 31;
            Streaming streaming = this.streaming;
            int iHashCode2 = (iHashCode + (streaming == null ? 0 : streaming.hashCode())) * 31;
            List<Transcriptions> list = this.transcriptions;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("InitialRoom(roomId=");
            sb4.append(this.roomId);
            sb4.append(", sessionId=");
            sb4.append(this.sessionId);
            sb4.append(", name=");
            sb4.append(this.name);
            sb4.append(", startedAt=");
            sb4.append(this.startedAt);
            sb4.append(", recording=");
            sb4.append(this.recording);
            sb4.append(", streaming=");
            sb4.append(this.streaming);
            sb4.append(", transcriptions=");
            return AbstractC17176i.m48506h(sb4, this.transcriptions, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$NodeInfo;", "Llive/hms/video/sdk/models/HMSNotifications;", "nodeInfo", "", "<init>", "(Ljava/lang/String;)V", "getNodeInfo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class NodeInfo extends HMSNotifications {

        @SerializedName("sfu_node_id")
        private final String nodeInfo;

        public NodeInfo(String str) {
            super(null);
            this.nodeInfo = str;
        }

        public static /* synthetic */ NodeInfo copy$default(NodeInfo nodeInfo, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = nodeInfo.nodeInfo;
            }
            return nodeInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNodeInfo() {
            return this.nodeInfo;
        }

        public final NodeInfo copy(String nodeInfo) {
            return new NodeInfo(nodeInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NodeInfo) && AbstractC22676k.m65745e(this.nodeInfo, ((NodeInfo) other).nodeInfo);
        }

        public final String getNodeInfo() {
            return this.nodeInfo;
        }

        public int hashCode() {
            String str = this.nodeInfo;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC25012a.m73377j(new StringBuilder("NodeInfo(nodeInfo="), this.nodeInfo, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;", "", "enabled", "", "<init>", "(Ljava/lang/Boolean;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class NoiseCancellationPlugin {

        @SerializedName("enabled")
        private final Boolean enabled;

        public NoiseCancellationPlugin(Boolean bool) {
            this.enabled = bool;
        }

        public static /* synthetic */ NoiseCancellationPlugin copy$default(NoiseCancellationPlugin noiseCancellationPlugin, Boolean bool, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                bool = noiseCancellationPlugin.enabled;
            }
            return noiseCancellationPlugin.copy(bool);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        public final NoiseCancellationPlugin copy(Boolean enabled) {
            return new NoiseCancellationPlugin(enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoiseCancellationPlugin) && AbstractC22676k.m65745e(this.enabled, ((NoiseCancellationPlugin) other).enabled);
        }

        public final Boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            Boolean bool = this.enabled;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "NoiseCancellationPlugin(enabled=" + this.enabled + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;", "Llive/hms/video/sdk/models/HMSNotifications;", "peer", "Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;", "private", "", "roleNames", "Ljava/util/ArrayList;", "", "timestamp", "", "info", "Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;", "messageId", "<init>", "(Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;ZLjava/util/ArrayList;JLlive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;Ljava/lang/String;)V", "getPeer", "()Llive/hms/video/sdk/models/HMSNotifications$BroadcastPeer;", "getPrivate", "()Z", "getRoleNames", "()Ljava/util/ArrayList;", "getTimestamp", "()J", "getInfo", "()Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class OnBroadcast extends HMSNotifications {

        @SerializedName("info")
        private final BroadcastInfo info;

        @SerializedName("message_id")
        private final String messageId;

        @SerializedName("peer")
        private final BroadcastPeer peer;

        @SerializedName("private")
        private final boolean private;

        @SerializedName("roles")
        private final ArrayList<String> roleNames;

        @SerializedName("timestamp")
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBroadcast(BroadcastPeer broadcastPeer, boolean z4, ArrayList<String> arrayList, long j7, BroadcastInfo info, String str) {
            super(null);
            AbstractC22676k.m65750j(info, "info");
            this.peer = broadcastPeer;
            this.private = z4;
            this.roleNames = arrayList;
            this.timestamp = j7;
            this.info = info;
            this.messageId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnBroadcast copy$default(OnBroadcast onBroadcast, BroadcastPeer broadcastPeer, boolean z4, ArrayList arrayList, long j7, BroadcastInfo broadcastInfo, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                broadcastPeer = onBroadcast.peer;
            }
            if ((i13 & 2) != 0) {
                z4 = onBroadcast.private;
            }
            if ((i13 & 4) != 0) {
                arrayList = onBroadcast.roleNames;
            }
            if ((i13 & 8) != 0) {
                j7 = onBroadcast.timestamp;
            }
            if ((i13 & 16) != 0) {
                broadcastInfo = onBroadcast.info;
            }
            if ((i13 & 32) != 0) {
                str = onBroadcast.messageId;
            }
            long j13 = j7;
            ArrayList arrayList2 = arrayList;
            return onBroadcast.copy(broadcastPeer, z4, arrayList2, j13, broadcastInfo, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BroadcastPeer getPeer() {
            return this.peer;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getPrivate() {
            return this.private;
        }

        public final ArrayList<String> component3() {
            return this.roleNames;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BroadcastInfo getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public final OnBroadcast copy(BroadcastPeer peer, boolean z4, ArrayList<String> roleNames, long timestamp, BroadcastInfo info, String messageId) {
            AbstractC22676k.m65750j(info, "info");
            return new OnBroadcast(peer, z4, roleNames, timestamp, info, messageId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBroadcast)) {
                return false;
            }
            OnBroadcast onBroadcast = (OnBroadcast) other;
            return AbstractC22676k.m65745e(this.peer, onBroadcast.peer) && this.private == onBroadcast.private && AbstractC22676k.m65745e(this.roleNames, onBroadcast.roleNames) && this.timestamp == onBroadcast.timestamp && AbstractC22676k.m65745e(this.info, onBroadcast.info) && AbstractC22676k.m65745e(this.messageId, onBroadcast.messageId);
        }

        public final BroadcastInfo getInfo() {
            return this.info;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final BroadcastPeer getPeer() {
            return this.peer;
        }

        public final boolean getPrivate() {
            return this.private;
        }

        public final ArrayList<String> getRoleNames() {
            return this.roleNames;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            BroadcastPeer broadcastPeer = this.peer;
            int iM8289b = AbstractC2875y.m8289b((broadcastPeer == null ? 0 : broadcastPeer.hashCode()) * 31, 31, this.private);
            ArrayList<String> arrayList = this.roleNames;
            int iHashCode = (this.info.hashCode() + AbstractC11266d.m30451e((iM8289b + (arrayList == null ? 0 : arrayList.hashCode())) * 31, this.timestamp, 31)) * 31;
            String str = this.messageId;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("OnBroadcast(peer=");
            sb4.append(this.peer);
            sb4.append(", private=");
            sb4.append(this.private);
            sb4.append(", roleNames=");
            sb4.append(this.roleNames);
            sb4.append(", timestamp=");
            sb4.append(this.timestamp);
            sb4.append(", info=");
            sb4.append(this.info);
            sb4.append(", messageId=");
            return AbstractC25012a.m73377j(sb4, this.messageId, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$OnPollStart;", "Llive/hms/video/sdk/models/HMSNotifications;", "version", "", "polls", "", "Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getPolls", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class OnPollStart extends HMSNotifications {

        @SerializedName("polls")
        private final List<StartedPolls> polls;

        @SerializedName("version")
        private final String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPollStart(String version, List<StartedPolls> polls) {
            super(null);
            AbstractC22676k.m65750j(version, "version");
            AbstractC22676k.m65750j(polls, "polls");
            this.version = version;
            this.polls = polls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnPollStart copy$default(OnPollStart onPollStart, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = onPollStart.version;
            }
            if ((i13 & 2) != 0) {
                list = onPollStart.polls;
            }
            return onPollStart.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final List<StartedPolls> component2() {
            return this.polls;
        }

        public final OnPollStart copy(String version, List<StartedPolls> polls) {
            AbstractC22676k.m65750j(version, "version");
            AbstractC22676k.m65750j(polls, "polls");
            return new OnPollStart(version, polls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnPollStart)) {
                return false;
            }
            OnPollStart onPollStart = (OnPollStart) other;
            return AbstractC22676k.m65745e(this.version, onPollStart.version) && AbstractC22676k.m65745e(this.polls, onPollStart.polls);
        }

        public final List<StartedPolls> getPolls() {
            return this.polls;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.polls.hashCode() + (this.version.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("OnPollStart(version=");
            sb4.append(this.version);
            sb4.append(", polls=");
            return AbstractC17176i.m48506h(sb4, this.polls, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$OnPollStats;", "Llive/hms/video/sdk/models/HMSNotifications;", "version", "", "polls", "", "Llive/hms/video/sdk/models/HMSNotifications$PollStats;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getPolls", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class OnPollStats extends HMSNotifications {

        @SerializedName("polls")
        private final List<PollStats> polls;

        @SerializedName("version")
        private final String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPollStats(String version, List<PollStats> polls) {
            super(null);
            AbstractC22676k.m65750j(version, "version");
            AbstractC22676k.m65750j(polls, "polls");
            this.version = version;
            this.polls = polls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnPollStats copy$default(OnPollStats onPollStats, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = onPollStats.version;
            }
            if ((i13 & 2) != 0) {
                list = onPollStats.polls;
            }
            return onPollStats.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final List<PollStats> component2() {
            return this.polls;
        }

        public final OnPollStats copy(String version, List<PollStats> polls) {
            AbstractC22676k.m65750j(version, "version");
            AbstractC22676k.m65750j(polls, "polls");
            return new OnPollStats(version, polls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnPollStats)) {
                return false;
            }
            OnPollStats onPollStats = (OnPollStats) other;
            return AbstractC22676k.m65745e(this.version, onPollStats.version) && AbstractC22676k.m65745e(this.polls, onPollStats.polls);
        }

        public final List<PollStats> getPolls() {
            return this.polls;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.polls.hashCode() + (this.version.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("OnPollStats(version=");
            sb4.append(this.version);
            sb4.append(", polls=");
            return AbstractC17176i.m48506h(sb4, this.polls, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$OnPollStop;", "Llive/hms/video/sdk/models/HMSNotifications;", "version", "", "polls", "", "Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getPolls", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class OnPollStop extends HMSNotifications {

        @SerializedName("polls")
        private final List<StoppedPolls> polls;

        @SerializedName("version")
        private final String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPollStop(String version, List<StoppedPolls> polls) {
            super(null);
            AbstractC22676k.m65750j(version, "version");
            AbstractC22676k.m65750j(polls, "polls");
            this.version = version;
            this.polls = polls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnPollStop copy$default(OnPollStop onPollStop, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = onPollStop.version;
            }
            if ((i13 & 2) != 0) {
                list = onPollStop.polls;
            }
            return onPollStop.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final List<StoppedPolls> component2() {
            return this.polls;
        }

        public final OnPollStop copy(String version, List<StoppedPolls> polls) {
            AbstractC22676k.m65750j(version, "version");
            AbstractC22676k.m65750j(polls, "polls");
            return new OnPollStop(version, polls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnPollStop)) {
                return false;
            }
            OnPollStop onPollStop = (OnPollStop) other;
            return AbstractC22676k.m65745e(this.version, onPollStop.version) && AbstractC22676k.m65745e(this.polls, onPollStop.polls);
        }

        public final List<StoppedPolls> getPolls() {
            return this.polls;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.polls.hashCode() + (this.version.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("OnPollStop(version=");
            sb4.append(this.version);
            sb4.append(", polls=");
            return AbstractC17176i.m48506h(sb4, this.polls, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$OnRoleChangeRequest;", "Llive/hms/video/sdk/models/HMSNotifications;", "requested_by", "", "roleName", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequested_by", "()Ljava/lang/String;", "getRoleName", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class OnRoleChangeRequest extends HMSNotifications {

        @SerializedName("requested_by")
        private final String requested_by;

        @SerializedName("role")
        private final String roleName;

        @SerializedName("token")
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRoleChangeRequest(String str, String roleName, String token) {
            super(null);
            AbstractC22676k.m65750j(roleName, "roleName");
            AbstractC22676k.m65750j(token, "token");
            this.requested_by = str;
            this.roleName = roleName;
            this.token = token;
        }

        public static /* synthetic */ OnRoleChangeRequest copy$default(OnRoleChangeRequest onRoleChangeRequest, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = onRoleChangeRequest.requested_by;
            }
            if ((i13 & 2) != 0) {
                str2 = onRoleChangeRequest.roleName;
            }
            if ((i13 & 4) != 0) {
                str3 = onRoleChangeRequest.token;
            }
            return onRoleChangeRequest.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequested_by() {
            return this.requested_by;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRoleName() {
            return this.roleName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final OnRoleChangeRequest copy(String requested_by, String roleName, String token) {
            AbstractC22676k.m65750j(roleName, "roleName");
            AbstractC22676k.m65750j(token, "token");
            return new OnRoleChangeRequest(requested_by, roleName, token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnRoleChangeRequest)) {
                return false;
            }
            OnRoleChangeRequest onRoleChangeRequest = (OnRoleChangeRequest) other;
            return AbstractC22676k.m65745e(this.requested_by, onRoleChangeRequest.requested_by) && AbstractC22676k.m65745e(this.roleName, onRoleChangeRequest.roleName) && AbstractC22676k.m65745e(this.token, onRoleChangeRequest.token);
        }

        public final String getRequested_by() {
            return this.requested_by;
        }

        public final String getRoleName() {
            return this.roleName;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            String str = this.requested_by;
            return this.token.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.roleName);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("OnRoleChangeRequest(requested_by=");
            sb4.append(this.requested_by);
            sb4.append(", roleName=");
            sb4.append(this.roleName);
            sb4.append(", token=");
            return AbstractC25012a.m73377j(sb4, this.token, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$OnSessionStoreMetadataChange;", "Llive/hms/video/sdk/models/HMSNotifications;", "values", "", "Llive/hms/video/sessionstore/SessionMetadataResult;", "<init>", "(Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class OnSessionStoreMetadataChange extends HMSNotifications {

        @SerializedName("values")
        private final List<SessionMetadataResult> values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSessionStoreMetadataChange(List<SessionMetadataResult> values) {
            super(null);
            AbstractC22676k.m65750j(values, "values");
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnSessionStoreMetadataChange copy$default(OnSessionStoreMetadataChange onSessionStoreMetadataChange, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = onSessionStoreMetadataChange.values;
            }
            return onSessionStoreMetadataChange.copy(list);
        }

        public final List<SessionMetadataResult> component1() {
            return this.values;
        }

        public final OnSessionStoreMetadataChange copy(List<SessionMetadataResult> values) {
            AbstractC22676k.m65750j(values, "values");
            return new OnSessionStoreMetadataChange(values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnSessionStoreMetadataChange) && AbstractC22676k.m65745e(this.values, ((OnSessionStoreMetadataChange) other).values);
        }

        public final List<SessionMetadataResult> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return AbstractC17176i.m48506h(new StringBuilder("OnSessionStoreMetadataChange(values="), this.values, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$OnTrackLayerUpdate;", "Llive/hms/video/sdk/models/HMSNotifications;", "tracks", "", "", "Llive/hms/video/sdk/models/TrackForLayerUpdate;", "<init>", "(Ljava/util/Map;)V", "getTracks", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class OnTrackLayerUpdate extends HMSNotifications {

        @SerializedName("tracks")
        private final Map<String, TrackForLayerUpdate> tracks;

        public OnTrackLayerUpdate(Map<String, TrackForLayerUpdate> map) {
            super(null);
            this.tracks = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnTrackLayerUpdate copy$default(OnTrackLayerUpdate onTrackLayerUpdate, Map map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                map = onTrackLayerUpdate.tracks;
            }
            return onTrackLayerUpdate.copy(map);
        }

        public final Map<String, TrackForLayerUpdate> component1() {
            return this.tracks;
        }

        public final OnTrackLayerUpdate copy(Map<String, TrackForLayerUpdate> tracks) {
            return new OnTrackLayerUpdate(tracks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnTrackLayerUpdate) && AbstractC22676k.m65745e(this.tracks, ((OnTrackLayerUpdate) other).tracks);
        }

        public final Map<String, TrackForLayerUpdate> getTracks() {
            return this.tracks;
        }

        public int hashCode() {
            Map<String, TrackForLayerUpdate> map = this.tracks;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        public String toString() {
            return AbstractC30802r.m94764m(new StringBuilder("OnTrackLayerUpdate(tracks="), this.tracks, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jn\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;", "Llive/hms/video/sdk/models/HMSNotifications;", "error", "Llive/hms/video/sdk/models/OnTranscriptionError;", "startedAt", "", "stoppedAt", "updatedAt", "initialisedAt", "state", "Llive/hms/video/sdk/models/TranscriptionState;", "mode", "Llive/hms/video/sdk/models/TranscriptionsMode;", "peer", "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;", "<init>", "(Llive/hms/video/sdk/models/OnTranscriptionError;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;)V", "getError", "()Llive/hms/video/sdk/models/OnTranscriptionError;", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStoppedAt", "getUpdatedAt", "getInitialisedAt", "getState", "()Llive/hms/video/sdk/models/TranscriptionState;", "getMode", "()Llive/hms/video/sdk/models/TranscriptionsMode;", "getPeer", "()Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Llive/hms/video/sdk/models/OnTranscriptionError;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;)Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class OnTranscriptionUpdate extends HMSNotifications {

        @SerializedName("error")
        private final OnTranscriptionError error;

        @SerializedName("initialised_at")
        private final Long initialisedAt;

        @SerializedName("mode")
        private final TranscriptionsMode mode;

        @SerializedName("peer")
        private final TranscriptionPeer peer;

        @SerializedName("started_at")
        private final Long startedAt;

        @SerializedName("state")
        private final TranscriptionState state;

        @SerializedName("stopped_at")
        private final Long stoppedAt;

        @SerializedName("updated_at")
        private final Long updatedAt;

        public OnTranscriptionUpdate(OnTranscriptionError onTranscriptionError, Long l7, Long l12, Long l13, Long l14, TranscriptionState transcriptionState, TranscriptionsMode transcriptionsMode, TranscriptionPeer transcriptionPeer) {
            super(null);
            this.error = onTranscriptionError;
            this.startedAt = l7;
            this.stoppedAt = l12;
            this.updatedAt = l13;
            this.initialisedAt = l14;
            this.state = transcriptionState;
            this.mode = transcriptionsMode;
            this.peer = transcriptionPeer;
        }

        public static /* synthetic */ OnTranscriptionUpdate copy$default(OnTranscriptionUpdate onTranscriptionUpdate, OnTranscriptionError onTranscriptionError, Long l7, Long l12, Long l13, Long l14, TranscriptionState transcriptionState, TranscriptionsMode transcriptionsMode, TranscriptionPeer transcriptionPeer, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                onTranscriptionError = onTranscriptionUpdate.error;
            }
            if ((i13 & 2) != 0) {
                l7 = onTranscriptionUpdate.startedAt;
            }
            if ((i13 & 4) != 0) {
                l12 = onTranscriptionUpdate.stoppedAt;
            }
            if ((i13 & 8) != 0) {
                l13 = onTranscriptionUpdate.updatedAt;
            }
            if ((i13 & 16) != 0) {
                l14 = onTranscriptionUpdate.initialisedAt;
            }
            if ((i13 & 32) != 0) {
                transcriptionState = onTranscriptionUpdate.state;
            }
            if ((i13 & 64) != 0) {
                transcriptionsMode = onTranscriptionUpdate.mode;
            }
            if ((i13 & 128) != 0) {
                transcriptionPeer = onTranscriptionUpdate.peer;
            }
            TranscriptionsMode transcriptionsMode2 = transcriptionsMode;
            TranscriptionPeer transcriptionPeer2 = transcriptionPeer;
            Long l15 = l14;
            TranscriptionState transcriptionState2 = transcriptionState;
            return onTranscriptionUpdate.copy(onTranscriptionError, l7, l12, l13, l15, transcriptionState2, transcriptionsMode2, transcriptionPeer2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OnTranscriptionError getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getStartedAt() {
            return this.startedAt;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getUpdatedAt() {
            return this.updatedAt;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getInitialisedAt() {
            return this.initialisedAt;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final TranscriptionState getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final TranscriptionPeer getPeer() {
            return this.peer;
        }

        public final OnTranscriptionUpdate copy(OnTranscriptionError error, Long startedAt, Long stoppedAt, Long updatedAt, Long initialisedAt, TranscriptionState state, TranscriptionsMode mode, TranscriptionPeer peer) {
            return new OnTranscriptionUpdate(error, startedAt, stoppedAt, updatedAt, initialisedAt, state, mode, peer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnTranscriptionUpdate)) {
                return false;
            }
            OnTranscriptionUpdate onTranscriptionUpdate = (OnTranscriptionUpdate) other;
            return AbstractC22676k.m65745e(this.error, onTranscriptionUpdate.error) && AbstractC22676k.m65745e(this.startedAt, onTranscriptionUpdate.startedAt) && AbstractC22676k.m65745e(this.stoppedAt, onTranscriptionUpdate.stoppedAt) && AbstractC22676k.m65745e(this.updatedAt, onTranscriptionUpdate.updatedAt) && AbstractC22676k.m65745e(this.initialisedAt, onTranscriptionUpdate.initialisedAt) && this.state == onTranscriptionUpdate.state && this.mode == onTranscriptionUpdate.mode && AbstractC22676k.m65745e(this.peer, onTranscriptionUpdate.peer);
        }

        public final OnTranscriptionError getError() {
            return this.error;
        }

        public final Long getInitialisedAt() {
            return this.initialisedAt;
        }

        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        public final TranscriptionPeer getPeer() {
            return this.peer;
        }

        public final Long getStartedAt() {
            return this.startedAt;
        }

        public final TranscriptionState getState() {
            return this.state;
        }

        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        public final Long getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            OnTranscriptionError onTranscriptionError = this.error;
            int iHashCode = (onTranscriptionError == null ? 0 : onTranscriptionError.hashCode()) * 31;
            Long l7 = this.startedAt;
            int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l12 = this.stoppedAt;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.updatedAt;
            int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.initialisedAt;
            int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
            TranscriptionState transcriptionState = this.state;
            int iHashCode6 = (iHashCode5 + (transcriptionState == null ? 0 : transcriptionState.hashCode())) * 31;
            TranscriptionsMode transcriptionsMode = this.mode;
            int iHashCode7 = (iHashCode6 + (transcriptionsMode == null ? 0 : transcriptionsMode.hashCode())) * 31;
            TranscriptionPeer transcriptionPeer = this.peer;
            return iHashCode7 + (transcriptionPeer != null ? transcriptionPeer.hashCode() : 0);
        }

        public String toString() {
            return "OnTranscriptionUpdate(error=" + this.error + ", startedAt=" + this.startedAt + ", stoppedAt=" + this.stoppedAt + ", updatedAt=" + this.updatedAt + ", initialisedAt=" + this.initialisedAt + ", state=" + this.state + ", mode=" + this.mode + ", peer=" + this.peer + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0003J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u000200J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010!J\t\u00108\u001a\u00020\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0082\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u000fHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006A"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Peer;", "Llive/hms/video/sdk/models/HMSNotifications;", "peerId", "", "isRealTime", "", "role", "groups", "Ljava/util/ArrayList;", "info", "Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "tracksMap", "Ljava/util/HashMap;", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "downlinkScore", "", "joinedAt", "", "typeSipOrRegular", "Llive/hms/video/sdk/models/HMSPeerType;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;Ljava/util/HashMap;Ljava/lang/Integer;JLlive/hms/video/sdk/models/HMSPeerType;)V", "getPeerId", "()Ljava/lang/String;", "()Z", "getRole", "getGroups", "()Ljava/util/ArrayList;", "getInfo", "()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "getTracksMap", "()Ljava/util/HashMap;", "getDownlinkScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getJoinedAt", "()J", "getTypeSipOrRegular", "()Llive/hms/video/sdk/models/HMSPeerType;", "tracks", "", "getTracks", "()[Llive/hms/video/sdk/models/HMSNotifications$Track;", "containsTrack", "trackId", "toPeerJoin", "Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;", "toPeerLeave", "Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;Ljava/util/HashMap;Ljava/lang/Integer;JLlive/hms/video/sdk/models/HMSPeerType;)Llive/hms/video/sdk/models/HMSNotifications$Peer;", "equals", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Peer extends HMSNotifications {

        @SerializedName("downlink_score")
        private final Integer downlinkScore;

        @SerializedName("groups")
        private final ArrayList<String> groups;

        @SerializedName("info")
        private final PeerInfo info;

        @SerializedName("realtime")
        private final boolean isRealTime;

        @SerializedName("joined_at")
        private final long joinedAt;

        @SerializedName("peer_id")
        private final String peerId;

        @SerializedName("role")
        private final String role;

        @SerializedName("tracks")
        private final HashMap<String, Track> tracksMap;

        @SerializedName("type")
        private final HMSPeerType typeSipOrRegular;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Peer(String peerId, boolean z4, String role, ArrayList<String> arrayList, PeerInfo info, HashMap<String, Track> map, Integer num, long j7, HMSPeerType hMSPeerType) {
            super(null);
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            this.peerId = peerId;
            this.isRealTime = z4;
            this.role = role;
            this.groups = arrayList;
            this.info = info;
            this.tracksMap = map;
            this.downlinkScore = num;
            this.joinedAt = j7;
            this.typeSipOrRegular = hMSPeerType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Peer copy$default(Peer peer, String str, boolean z4, String str2, ArrayList arrayList, PeerInfo peerInfo, HashMap map, Integer num, long j7, HMSPeerType hMSPeerType, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = peer.peerId;
            }
            if ((i13 & 2) != 0) {
                z4 = peer.isRealTime;
            }
            if ((i13 & 4) != 0) {
                str2 = peer.role;
            }
            if ((i13 & 8) != 0) {
                arrayList = peer.groups;
            }
            if ((i13 & 16) != 0) {
                peerInfo = peer.info;
            }
            if ((i13 & 32) != 0) {
                map = peer.tracksMap;
            }
            if ((i13 & 64) != 0) {
                num = peer.downlinkScore;
            }
            if ((i13 & 128) != 0) {
                j7 = peer.joinedAt;
            }
            if ((i13 & 256) != 0) {
                hMSPeerType = peer.typeSipOrRegular;
            }
            HMSPeerType hMSPeerType2 = hMSPeerType;
            long j13 = j7;
            HashMap map2 = map;
            Integer num2 = num;
            PeerInfo peerInfo2 = peerInfo;
            String str3 = str2;
            return peer.copy(str, z4, str3, arrayList, peerInfo2, map2, num2, j13, hMSPeerType2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsRealTime() {
            return this.isRealTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        public final ArrayList<String> component4() {
            return this.groups;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final PeerInfo getInfo() {
            return this.info;
        }

        public final HashMap<String, Track> component6() {
            return this.tracksMap;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Integer getDownlinkScore() {
            return this.downlinkScore;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final long getJoinedAt() {
            return this.joinedAt;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final HMSPeerType getTypeSipOrRegular() {
            return this.typeSipOrRegular;
        }

        public final boolean containsTrack(String trackId) {
            AbstractC22676k.m65750j(trackId, "trackId");
            HashMap<String, Track> map = this.tracksMap;
            if (map != null) {
                return map.containsKey(trackId);
            }
            return false;
        }

        public final Peer copy(String peerId, boolean isRealTime, String role, ArrayList<String> groups, PeerInfo info, HashMap<String, Track> tracksMap, Integer downlinkScore, long joinedAt, HMSPeerType typeSipOrRegular) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            return new Peer(peerId, isRealTime, role, groups, info, tracksMap, downlinkScore, joinedAt, typeSipOrRegular);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Peer)) {
                return false;
            }
            Peer peer = (Peer) other;
            return AbstractC22676k.m65745e(this.peerId, peer.peerId) && this.isRealTime == peer.isRealTime && AbstractC22676k.m65745e(this.role, peer.role) && AbstractC22676k.m65745e(this.groups, peer.groups) && AbstractC22676k.m65745e(this.info, peer.info) && AbstractC22676k.m65745e(this.tracksMap, peer.tracksMap) && AbstractC22676k.m65745e(this.downlinkScore, peer.downlinkScore) && this.joinedAt == peer.joinedAt && this.typeSipOrRegular == peer.typeSipOrRegular;
        }

        public final Integer getDownlinkScore() {
            return this.downlinkScore;
        }

        public final ArrayList<String> getGroups() {
            return this.groups;
        }

        public final PeerInfo getInfo() {
            return this.info;
        }

        public final long getJoinedAt() {
            return this.joinedAt;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final String getRole() {
            return this.role;
        }

        public final Track[] getTracks() {
            Collection<Track> collectionValues;
            Track[] trackArr;
            HashMap<String, Track> map = this.tracksMap;
            return (map == null || (collectionValues = map.values()) == null || (trackArr = (Track[]) collectionValues.toArray(new Track[0])) == null) ? new Track[0] : trackArr;
        }

        public final HashMap<String, Track> getTracksMap() {
            return this.tracksMap;
        }

        public final HMSPeerType getTypeSipOrRegular() {
            return this.typeSipOrRegular;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(this.peerId.hashCode() * 31, 31, this.isRealTime), 31, this.role);
            ArrayList<String> arrayList = this.groups;
            int iHashCode = (this.info.hashCode() + ((iM30450d + (arrayList == null ? 0 : arrayList.hashCode())) * 31)) * 31;
            HashMap<String, Track> map = this.tracksMap;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Integer num = this.downlinkScore;
            int iM30451e = AbstractC11266d.m30451e((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, this.joinedAt, 31);
            HMSPeerType hMSPeerType = this.typeSipOrRegular;
            return iM30451e + (hMSPeerType != null ? hMSPeerType.hashCode() : 0);
        }

        public final boolean isRealTime() {
            return this.isRealTime;
        }

        public final PeerJoin toPeerJoin() {
            return new PeerJoin(this.peerId, this.role, this.groups, this.info, this.joinedAt, 1L);
        }

        public final PeerLeave toPeerLeave() {
            return new PeerLeave(this.peerId, this.role, this.groups, this.info);
        }

        public String toString() {
            return "Peer(peerId=" + this.peerId + ", isRealTime=" + this.isRealTime + ", role=" + this.role + ", groups=" + this.groups + ", info=" + this.info + ", tracksMap=" + this.tracksMap + ", downlinkScore=" + this.downlinkScore + ", joinedAt=" + this.joinedAt + ", typeSipOrRegular=" + this.typeSipOrRegular + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "", "userName", "", "metadata", "customerUserId", "typeSipOrRegular", "Llive/hms/video/sdk/models/HMSPeerType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V", "getUserName", "()Ljava/lang/String;", "getMetadata", "getCustomerUserId", "getTypeSipOrRegular", "()Llive/hms/video/sdk/models/HMSPeerType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerInfo {

        @SerializedName("user_id")
        private final String customerUserId;

        @SerializedName("data")
        private final String metadata;

        @SerializedName("type")
        private final HMSPeerType typeSipOrRegular;

        @SerializedName("name")
        private final String userName;

        public PeerInfo(String userName, String str, String str2, HMSPeerType hMSPeerType) {
            AbstractC22676k.m65750j(userName, "userName");
            this.userName = userName;
            this.metadata = str;
            this.customerUserId = str2;
            this.typeSipOrRegular = hMSPeerType;
        }

        public static /* synthetic */ PeerInfo copy$default(PeerInfo peerInfo, String str, String str2, String str3, HMSPeerType hMSPeerType, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = peerInfo.userName;
            }
            if ((i13 & 2) != 0) {
                str2 = peerInfo.metadata;
            }
            if ((i13 & 4) != 0) {
                str3 = peerInfo.customerUserId;
            }
            if ((i13 & 8) != 0) {
                hMSPeerType = peerInfo.typeSipOrRegular;
            }
            return peerInfo.copy(str, str2, str3, hMSPeerType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMetadata() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCustomerUserId() {
            return this.customerUserId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final HMSPeerType getTypeSipOrRegular() {
            return this.typeSipOrRegular;
        }

        public final PeerInfo copy(String userName, String metadata, String customerUserId, HMSPeerType typeSipOrRegular) {
            AbstractC22676k.m65750j(userName, "userName");
            return new PeerInfo(userName, metadata, customerUserId, typeSipOrRegular);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerInfo)) {
                return false;
            }
            PeerInfo peerInfo = (PeerInfo) other;
            return AbstractC22676k.m65745e(this.userName, peerInfo.userName) && AbstractC22676k.m65745e(this.metadata, peerInfo.metadata) && AbstractC22676k.m65745e(this.customerUserId, peerInfo.customerUserId) && this.typeSipOrRegular == peerInfo.typeSipOrRegular;
        }

        public final String getCustomerUserId() {
            return this.customerUserId;
        }

        public final String getMetadata() {
            return this.metadata;
        }

        public final HMSPeerType getTypeSipOrRegular() {
            return this.typeSipOrRegular;
        }

        public final String getUserName() {
            return this.userName;
        }

        public int hashCode() {
            int iHashCode = this.userName.hashCode() * 31;
            String str = this.metadata;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customerUserId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            HMSPeerType hMSPeerType = this.typeSipOrRegular;
            return iHashCode3 + (hMSPeerType != null ? hMSPeerType.hashCode() : 0);
        }

        public String toString() {
            return "PeerInfo(userName=" + this.userName + ", metadata=" + this.metadata + ", customerUserId=" + this.customerUserId + ", typeSipOrRegular=" + this.typeSipOrRegular + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;", "Llive/hms/video/sdk/models/HMSNotifications;", "peerId", "", "role", "groups", "Ljava/util/ArrayList;", "info", "Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "joinedAt", "", "maxPeerCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;JJ)V", "getPeerId", "()Ljava/lang/String;", "getRole", "getGroups", "()Ljava/util/ArrayList;", "getInfo", "()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "getJoinedAt", "()J", "getMaxPeerCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerJoin extends HMSNotifications {

        @SerializedName("groups")
        private final ArrayList<String> groups;

        @SerializedName("info")
        private final PeerInfo info;

        @SerializedName("joined_at")
        private final long joinedAt;

        @SerializedName("maxPeerCount")
        private final long maxPeerCount;

        @SerializedName("peer_id")
        private final String peerId;

        @SerializedName("role")
        private final String role;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PeerJoin(String peerId, String role, ArrayList<String> arrayList, PeerInfo info, long j7, long j13) {
            super(null);
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            this.peerId = peerId;
            this.role = role;
            this.groups = arrayList;
            this.info = info;
            this.joinedAt = j7;
            this.maxPeerCount = j13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PeerJoin copy$default(PeerJoin peerJoin, String str, String str2, ArrayList arrayList, PeerInfo peerInfo, long j7, long j13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = peerJoin.peerId;
            }
            if ((i13 & 2) != 0) {
                str2 = peerJoin.role;
            }
            if ((i13 & 4) != 0) {
                arrayList = peerJoin.groups;
            }
            if ((i13 & 8) != 0) {
                peerInfo = peerJoin.info;
            }
            if ((i13 & 16) != 0) {
                j7 = peerJoin.joinedAt;
            }
            if ((i13 & 32) != 0) {
                j13 = peerJoin.maxPeerCount;
            }
            long j14 = j13;
            long j15 = j7;
            return peerJoin.copy(str, str2, arrayList, peerInfo, j15, j14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        public final ArrayList<String> component3() {
            return this.groups;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final PeerInfo getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getJoinedAt() {
            return this.joinedAt;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getMaxPeerCount() {
            return this.maxPeerCount;
        }

        public final PeerJoin copy(String peerId, String role, ArrayList<String> groups, PeerInfo info, long joinedAt, long maxPeerCount) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            return new PeerJoin(peerId, role, groups, info, joinedAt, maxPeerCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerJoin)) {
                return false;
            }
            PeerJoin peerJoin = (PeerJoin) other;
            return AbstractC22676k.m65745e(this.peerId, peerJoin.peerId) && AbstractC22676k.m65745e(this.role, peerJoin.role) && AbstractC22676k.m65745e(this.groups, peerJoin.groups) && AbstractC22676k.m65745e(this.info, peerJoin.info) && this.joinedAt == peerJoin.joinedAt && this.maxPeerCount == peerJoin.maxPeerCount;
        }

        public final ArrayList<String> getGroups() {
            return this.groups;
        }

        public final PeerInfo getInfo() {
            return this.info;
        }

        public final long getJoinedAt() {
            return this.joinedAt;
        }

        public final long getMaxPeerCount() {
            return this.maxPeerCount;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final String getRole() {
            return this.role;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.peerId.hashCode() * 31, 31, this.role);
            ArrayList<String> arrayList = this.groups;
            return Long.hashCode(this.maxPeerCount) + AbstractC11266d.m30451e((this.info.hashCode() + ((iM30450d + (arrayList == null ? 0 : arrayList.hashCode())) * 31)) * 31, this.joinedAt, 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PeerJoin(peerId=");
            sb4.append(this.peerId);
            sb4.append(", role=");
            sb4.append(this.role);
            sb4.append(", groups=");
            sb4.append(this.groups);
            sb4.append(", info=");
            sb4.append(this.info);
            sb4.append(", joinedAt=");
            sb4.append(this.joinedAt);
            sb4.append(", maxPeerCount=");
            return AbstractC2875y.m8302o(sb4, this.maxPeerCount, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;", "Llive/hms/video/sdk/models/HMSNotifications;", "peerId", "", "role", "groups", "Ljava/util/ArrayList;", "info", "Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)V", "getPeerId", "()Ljava/lang/String;", "getRole", "getGroups", "()Ljava/util/ArrayList;", "getInfo", "()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerLeave extends HMSNotifications {

        @SerializedName("groups")
        private final ArrayList<String> groups;

        @SerializedName("info")
        private final PeerInfo info;

        @SerializedName("peer_id")
        private final String peerId;

        @SerializedName("role")
        private final String role;

        public /* synthetic */ PeerLeave(String str, String str2, ArrayList arrayList, PeerInfo peerInfo, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? null : arrayList, peerInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PeerLeave copy$default(PeerLeave peerLeave, String str, String str2, ArrayList arrayList, PeerInfo peerInfo, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = peerLeave.peerId;
            }
            if ((i13 & 2) != 0) {
                str2 = peerLeave.role;
            }
            if ((i13 & 4) != 0) {
                arrayList = peerLeave.groups;
            }
            if ((i13 & 8) != 0) {
                peerInfo = peerLeave.info;
            }
            return peerLeave.copy(str, str2, arrayList, peerInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        public final ArrayList<String> component3() {
            return this.groups;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final PeerInfo getInfo() {
            return this.info;
        }

        public final PeerLeave copy(String peerId, String role, ArrayList<String> groups, PeerInfo info) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            return new PeerLeave(peerId, role, groups, info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerLeave)) {
                return false;
            }
            PeerLeave peerLeave = (PeerLeave) other;
            return AbstractC22676k.m65745e(this.peerId, peerLeave.peerId) && AbstractC22676k.m65745e(this.role, peerLeave.role) && AbstractC22676k.m65745e(this.groups, peerLeave.groups) && AbstractC22676k.m65745e(this.info, peerLeave.info);
        }

        public final ArrayList<String> getGroups() {
            return this.groups;
        }

        public final PeerInfo getInfo() {
            return this.info;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final String getRole() {
            return this.role;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.peerId.hashCode() * 31, 31, this.role);
            ArrayList<String> arrayList = this.groups;
            return this.info.hashCode() + ((iM30450d + (arrayList == null ? 0 : arrayList.hashCode())) * 31);
        }

        public String toString() {
            return "PeerLeave(peerId=" + this.peerId + ", role=" + this.role + ", groups=" + this.groups + ", info=" + this.info + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PeerLeave(String peerId, String role, ArrayList<String> arrayList, PeerInfo info) {
            super(null);
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            this.peerId = peerId;
            this.role = role;
            this.groups = arrayList;
            this.info = info;
        }
    }

    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$PeerList;", "Llive/hms/video/sdk/models/HMSNotifications;", "timestamp", "", "peerCount", "peersMap", "Ljava/util/HashMap;", "", "Llive/hms/video/sdk/models/HMSNotifications$Peer;", "room", "Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;", "transcriptions", "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/HashMap;Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;)V", "getTimestamp", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPeerCount", "getPeersMap", "()Ljava/util/HashMap;", "getRoom", "()Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;", "getTranscriptions", "()Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;", "peers", "", "getPeers", "()[Llive/hms/video/sdk/models/HMSNotifications$Peer;", "contains", "", "peerId", "(Ljava/lang/String;)Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/HashMap;Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;)Llive/hms/video/sdk/models/HMSNotifications$PeerList;", "equals", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerList extends HMSNotifications {

        @SerializedName("peer_count")
        private final Integer peerCount;

        @SerializedName("peers")
        private final HashMap<String, Peer> peersMap;

        @SerializedName("room")
        private final InitialRoom room;

        @SerializedName("timestamp")
        private final Integer timestamp;

        @SerializedName("transcriptions")
        private final TranscriptionsPeerList transcriptions;

        public PeerList(Integer num, Integer num2, HashMap<String, Peer> map, InitialRoom initialRoom, TranscriptionsPeerList transcriptionsPeerList) {
            super(null);
            this.timestamp = num;
            this.peerCount = num2;
            this.peersMap = map;
            this.room = initialRoom;
            this.transcriptions = transcriptionsPeerList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PeerList copy$default(PeerList peerList, Integer num, Integer num2, HashMap map, InitialRoom initialRoom, TranscriptionsPeerList transcriptionsPeerList, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                num = peerList.timestamp;
            }
            if ((i13 & 2) != 0) {
                num2 = peerList.peerCount;
            }
            if ((i13 & 4) != 0) {
                map = peerList.peersMap;
            }
            if ((i13 & 8) != 0) {
                initialRoom = peerList.room;
            }
            if ((i13 & 16) != 0) {
                transcriptionsPeerList = peerList.transcriptions;
            }
            TranscriptionsPeerList transcriptionsPeerList2 = transcriptionsPeerList;
            HashMap map2 = map;
            return peerList.copy(num, num2, map2, initialRoom, transcriptionsPeerList2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getPeerCount() {
            return this.peerCount;
        }

        public final HashMap<String, Peer> component3() {
            return this.peersMap;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final InitialRoom getRoom() {
            return this.room;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final TranscriptionsPeerList getTranscriptions() {
            return this.transcriptions;
        }

        public final Boolean contains(String peerId) {
            AbstractC22676k.m65750j(peerId, "peerId");
            HashMap<String, Peer> map = this.peersMap;
            if (map != null) {
                return Boolean.valueOf(map.containsKey(peerId));
            }
            return null;
        }

        public final PeerList copy(Integer timestamp, Integer peerCount, HashMap<String, Peer> peersMap, InitialRoom room, TranscriptionsPeerList transcriptions) {
            return new PeerList(timestamp, peerCount, peersMap, room, transcriptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerList)) {
                return false;
            }
            PeerList peerList = (PeerList) other;
            return AbstractC22676k.m65745e(this.timestamp, peerList.timestamp) && AbstractC22676k.m65745e(this.peerCount, peerList.peerCount) && AbstractC22676k.m65745e(this.peersMap, peerList.peersMap) && AbstractC22676k.m65745e(this.room, peerList.room) && AbstractC22676k.m65745e(this.transcriptions, peerList.transcriptions);
        }

        public final Integer getPeerCount() {
            return this.peerCount;
        }

        public final Peer[] getPeers() {
            Collection<Peer> collectionValues;
            Peer[] peerArr;
            HashMap<String, Peer> map = this.peersMap;
            return (map == null || (collectionValues = map.values()) == null || (peerArr = (Peer[]) collectionValues.toArray(new Peer[0])) == null) ? new Peer[0] : peerArr;
        }

        public final HashMap<String, Peer> getPeersMap() {
            return this.peersMap;
        }

        public final InitialRoom getRoom() {
            return this.room;
        }

        public final Integer getTimestamp() {
            return this.timestamp;
        }

        public final TranscriptionsPeerList getTranscriptions() {
            return this.transcriptions;
        }

        public int hashCode() {
            Integer num = this.timestamp;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.peerCount;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            HashMap<String, Peer> map = this.peersMap;
            int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            InitialRoom initialRoom = this.room;
            int iHashCode4 = (iHashCode3 + (initialRoom == null ? 0 : initialRoom.hashCode())) * 31;
            TranscriptionsPeerList transcriptionsPeerList = this.transcriptions;
            return iHashCode4 + (transcriptionsPeerList != null ? transcriptionsPeerList.hashCode() : 0);
        }

        public String toString() {
            return "PeerList(timestamp=" + this.timestamp + ", peerCount=" + this.peerCount + ", peersMap=" + this.peersMap + ", room=" + this.room + ", transcriptions=" + this.transcriptions + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;", "Llive/hms/video/sdk/models/HMSNotifications;", "peerNetworkInfoList", "", "Llive/hms/video/sdk/models/HMSNotifications$Peer;", "<init>", "(Ljava/util/List;)V", "getPeerNetworkInfoList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerNetworkInfoList extends HMSNotifications {

        @SerializedName("peers")
        private final List<Peer> peerNetworkInfoList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PeerNetworkInfoList(List<Peer> peerNetworkInfoList) {
            super(null);
            AbstractC22676k.m65750j(peerNetworkInfoList, "peerNetworkInfoList");
            this.peerNetworkInfoList = peerNetworkInfoList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PeerNetworkInfoList copy$default(PeerNetworkInfoList peerNetworkInfoList, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = peerNetworkInfoList.peerNetworkInfoList;
            }
            return peerNetworkInfoList.copy(list);
        }

        public final List<Peer> component1() {
            return this.peerNetworkInfoList;
        }

        public final PeerNetworkInfoList copy(List<Peer> peerNetworkInfoList) {
            AbstractC22676k.m65750j(peerNetworkInfoList, "peerNetworkInfoList");
            return new PeerNetworkInfoList(peerNetworkInfoList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PeerNetworkInfoList) && AbstractC22676k.m65745e(this.peerNetworkInfoList, ((PeerNetworkInfoList) other).peerNetworkInfoList);
        }

        public final List<Peer> getPeerNetworkInfoList() {
            return this.peerNetworkInfoList;
        }

        public int hashCode() {
            return this.peerNetworkInfoList.hashCode();
        }

        public String toString() {
            return AbstractC17176i.m48506h(new StringBuilder("PeerNetworkInfoList(peerNetworkInfoList="), this.peerNetworkInfoList, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$PeerRemoved;", "Llive/hms/video/sdk/models/HMSNotifications;", "reason", "", "requestedByPeerId", "timeout", "", "roomWasEnded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getReason", "()Ljava/lang/String;", "getRequestedByPeerId", "getTimeout", "()I", "getRoomWasEnded", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerRemoved extends HMSNotifications {

        @SerializedName("reason")
        private final String reason;

        @SerializedName("requested_by")
        private final String requestedByPeerId;

        @SerializedName("room_end")
        private final boolean roomWasEnded;

        @SerializedName("timeout")
        private final int timeout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PeerRemoved(String reason, String str, int i13, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(reason, "reason");
            this.reason = reason;
            this.requestedByPeerId = str;
            this.timeout = i13;
            this.roomWasEnded = z4;
        }

        public static /* synthetic */ PeerRemoved copy$default(PeerRemoved peerRemoved, String str, String str2, int i13, boolean z4, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = peerRemoved.reason;
            }
            if ((i14 & 2) != 0) {
                str2 = peerRemoved.requestedByPeerId;
            }
            if ((i14 & 4) != 0) {
                i13 = peerRemoved.timeout;
            }
            if ((i14 & 8) != 0) {
                z4 = peerRemoved.roomWasEnded;
            }
            return peerRemoved.copy(str, str2, i13, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRequestedByPeerId() {
            return this.requestedByPeerId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getTimeout() {
            return this.timeout;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getRoomWasEnded() {
            return this.roomWasEnded;
        }

        public final PeerRemoved copy(String reason, String requestedByPeerId, int timeout, boolean roomWasEnded) {
            AbstractC22676k.m65750j(reason, "reason");
            return new PeerRemoved(reason, requestedByPeerId, timeout, roomWasEnded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerRemoved)) {
                return false;
            }
            PeerRemoved peerRemoved = (PeerRemoved) other;
            return AbstractC22676k.m65745e(this.reason, peerRemoved.reason) && AbstractC22676k.m65745e(this.requestedByPeerId, peerRemoved.requestedByPeerId) && this.timeout == peerRemoved.timeout && this.roomWasEnded == peerRemoved.roomWasEnded;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getRequestedByPeerId() {
            return this.requestedByPeerId;
        }

        public final boolean getRoomWasEnded() {
            return this.roomWasEnded;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            String str = this.requestedByPeerId;
            return Boolean.hashCode(this.roomWasEnded) + AbstractC11266d.m30448b(this.timeout, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PeerRemoved(reason=");
            sb4.append(this.reason);
            sb4.append(", requestedByPeerId=");
            sb4.append(this.requestedByPeerId);
            sb4.append(", timeout=");
            sb4.append(this.timeout);
            sb4.append(", roomWasEnded=");
            return AbstractC2875y.m8305r(sb4, this.roomWasEnded, ')');
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Plugins;", "", "whiteboard", "Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;", "transcriptions", "", "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPlugin;", "noiseCancellation", "Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;", "<init>", "(Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;Ljava/util/List;Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;)V", "getWhiteboard", "()Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;", "getTranscriptions", "()Ljava/util/List;", "getNoiseCancellation", "()Llive/hms/video/sdk/models/HMSNotifications$NoiseCancellationPlugin;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Plugins {

        @SerializedName("noiseCancellation")
        private final NoiseCancellationPlugin noiseCancellation;

        @SerializedName("transcriptions")
        private final List<TranscriptionsPlugin> transcriptions;

        @SerializedName("whiteboard")
        private final Whiteboard whiteboard;

        public Plugins(Whiteboard whiteboard, List<TranscriptionsPlugin> list, NoiseCancellationPlugin noiseCancellationPlugin) {
            this.whiteboard = whiteboard;
            this.transcriptions = list;
            this.noiseCancellation = noiseCancellationPlugin;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Plugins copy$default(Plugins plugins, Whiteboard whiteboard, List list, NoiseCancellationPlugin noiseCancellationPlugin, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                whiteboard = plugins.whiteboard;
            }
            if ((i13 & 2) != 0) {
                list = plugins.transcriptions;
            }
            if ((i13 & 4) != 0) {
                noiseCancellationPlugin = plugins.noiseCancellation;
            }
            return plugins.copy(whiteboard, list, noiseCancellationPlugin);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Whiteboard getWhiteboard() {
            return this.whiteboard;
        }

        public final List<TranscriptionsPlugin> component2() {
            return this.transcriptions;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NoiseCancellationPlugin getNoiseCancellation() {
            return this.noiseCancellation;
        }

        public final Plugins copy(Whiteboard whiteboard, List<TranscriptionsPlugin> transcriptions, NoiseCancellationPlugin noiseCancellation) {
            return new Plugins(whiteboard, transcriptions, noiseCancellation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plugins)) {
                return false;
            }
            Plugins plugins = (Plugins) other;
            return AbstractC22676k.m65745e(this.whiteboard, plugins.whiteboard) && AbstractC22676k.m65745e(this.transcriptions, plugins.transcriptions) && AbstractC22676k.m65745e(this.noiseCancellation, plugins.noiseCancellation);
        }

        public final NoiseCancellationPlugin getNoiseCancellation() {
            return this.noiseCancellation;
        }

        public final List<TranscriptionsPlugin> getTranscriptions() {
            return this.transcriptions;
        }

        public final Whiteboard getWhiteboard() {
            return this.whiteboard;
        }

        public int hashCode() {
            Whiteboard whiteboard = this.whiteboard;
            int iHashCode = (whiteboard == null ? 0 : whiteboard.hashCode()) * 31;
            List<TranscriptionsPlugin> list = this.transcriptions;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            NoiseCancellationPlugin noiseCancellationPlugin = this.noiseCancellation;
            return iHashCode2 + (noiseCancellationPlugin != null ? noiseCancellationPlugin.hashCode() : 0);
        }

        public String toString() {
            return "Plugins(whiteboard=" + this.whiteboard + ", transcriptions=" + this.transcriptions + ", noiseCancellation=" + this.noiseCancellation + ')';
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$PolicyChange;", "Llive/hms/video/sdk/models/HMSNotifications;", "roleName", "", "rolesMap", "Ljava/util/HashMap;", "Llive/hms/video/sdk/models/role/HMSRole;", "plugins", "Llive/hms/video/sdk/models/HMSNotifications$Plugins;", "templateId", "<init>", "(Ljava/lang/String;Ljava/util/HashMap;Llive/hms/video/sdk/models/HMSNotifications$Plugins;Ljava/lang/String;)V", "getRoleName", "()Ljava/lang/String;", "getRolesMap", "()Ljava/util/HashMap;", "getPlugins", "()Llive/hms/video/sdk/models/HMSNotifications$Plugins;", "getTemplateId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PolicyChange extends HMSNotifications {

        @SerializedName("plugins")
        private final Plugins plugins;

        @SerializedName("name")
        private final String roleName;

        @SerializedName("known_roles")
        private final HashMap<String, HMSRole> rolesMap;

        @SerializedName("template_id")
        private final String templateId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PolicyChange(String roleName, HashMap<String, HMSRole> rolesMap, Plugins plugins, String templateId) {
            super(null);
            AbstractC22676k.m65750j(roleName, "roleName");
            AbstractC22676k.m65750j(rolesMap, "rolesMap");
            AbstractC22676k.m65750j(templateId, "templateId");
            this.roleName = roleName;
            this.rolesMap = rolesMap;
            this.plugins = plugins;
            this.templateId = templateId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PolicyChange copy$default(PolicyChange policyChange, String str, HashMap map, Plugins plugins, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = policyChange.roleName;
            }
            if ((i13 & 2) != 0) {
                map = policyChange.rolesMap;
            }
            if ((i13 & 4) != 0) {
                plugins = policyChange.plugins;
            }
            if ((i13 & 8) != 0) {
                str2 = policyChange.templateId;
            }
            return policyChange.copy(str, map, plugins, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRoleName() {
            return this.roleName;
        }

        public final HashMap<String, HMSRole> component2() {
            return this.rolesMap;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Plugins getPlugins() {
            return this.plugins;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        public final PolicyChange copy(String roleName, HashMap<String, HMSRole> rolesMap, Plugins plugins, String templateId) {
            AbstractC22676k.m65750j(roleName, "roleName");
            AbstractC22676k.m65750j(rolesMap, "rolesMap");
            AbstractC22676k.m65750j(templateId, "templateId");
            return new PolicyChange(roleName, rolesMap, plugins, templateId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PolicyChange)) {
                return false;
            }
            PolicyChange policyChange = (PolicyChange) other;
            return AbstractC22676k.m65745e(this.roleName, policyChange.roleName) && AbstractC22676k.m65745e(this.rolesMap, policyChange.rolesMap) && AbstractC22676k.m65745e(this.plugins, policyChange.plugins) && AbstractC22676k.m65745e(this.templateId, policyChange.templateId);
        }

        public final Plugins getPlugins() {
            return this.plugins;
        }

        public final String getRoleName() {
            return this.roleName;
        }

        public final HashMap<String, HMSRole> getRolesMap() {
            return this.rolesMap;
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public int hashCode() {
            int iHashCode = (this.rolesMap.hashCode() + (this.roleName.hashCode() * 31)) * 31;
            Plugins plugins = this.plugins;
            return this.templateId.hashCode() + ((iHashCode + (plugins == null ? 0 : plugins.hashCode())) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PolicyChange(roleName=");
            sb4.append(this.roleName);
            sb4.append(", rolesMap=");
            sb4.append(this.rolesMap);
            sb4.append(", plugins=");
            sb4.append(this.plugins);
            sb4.append(", templateId=");
            return AbstractC25012a.m73377j(sb4, this.templateId, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$PollStats;", "", "pollId", "", "questions", "", "Llive/hms/video/polls/models/PollStatsQuestions;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPollId", "()Ljava/lang/String;", "getQuestions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PollStats {

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("questions")
        private final List<PollStatsQuestions> questions;

        public PollStats(String pollId, List<PollStatsQuestions> questions) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(questions, "questions");
            this.pollId = pollId;
            this.questions = questions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PollStats copy$default(PollStats pollStats, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = pollStats.pollId;
            }
            if ((i13 & 2) != 0) {
                list = pollStats.questions;
            }
            return pollStats.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        public final List<PollStatsQuestions> component2() {
            return this.questions;
        }

        public final PollStats copy(String pollId, List<PollStatsQuestions> questions) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(questions, "questions");
            return new PollStats(pollId, questions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollStats)) {
                return false;
            }
            PollStats pollStats = (PollStats) other;
            return AbstractC22676k.m65745e(this.pollId, pollStats.pollId) && AbstractC22676k.m65745e(this.questions, pollStats.questions);
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final List<PollStatsQuestions> getQuestions() {
            return this.questions;
        }

        public int hashCode() {
            return this.questions.hashCode() + (this.pollId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PollStats(pollId=");
            sb4.append(this.pollId);
            sb4.append(", questions=");
            return AbstractC17176i.m48506h(sb4, this.questions, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JT\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;", "Llive/hms/video/sdk/models/HMSNotifications;", "type", "Llive/hms/video/sdk/models/RecordingType;", "startedAt", "", "updatedAt", "stoppedAt", "state", "Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;", "error", "Llive/hms/video/sdk/models/HMSNotifications$ServerError;", "<init>", "(Llive/hms/video/sdk/models/RecordingType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)V", "getType", "()Llive/hms/video/sdk/models/RecordingType;", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUpdatedAt", "getStoppedAt", "getState", "()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;", "getError", "()Llive/hms/video/sdk/models/HMSNotifications$ServerError;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Llive/hms/video/sdk/models/RecordingType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class RecordUpdateNotification extends HMSNotifications {

        @SerializedName("error")
        private final ServerError error;

        @SerializedName("started_at")
        private final Long startedAt;

        @SerializedName("state")
        private final BeamRecordingStates state;

        @SerializedName("stopped_at")
        private final Long stoppedAt;

        @SerializedName("type")
        private final RecordingType type;

        @SerializedName("updated_at")
        private final Long updatedAt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordUpdateNotification(RecordingType type, Long l7, Long l12, Long l13, BeamRecordingStates beamRecordingStates, ServerError serverError) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
            this.startedAt = l7;
            this.updatedAt = l12;
            this.stoppedAt = l13;
            this.state = beamRecordingStates;
            this.error = serverError;
        }

        public static /* synthetic */ RecordUpdateNotification copy$default(RecordUpdateNotification recordUpdateNotification, RecordingType recordingType, Long l7, Long l12, Long l13, BeamRecordingStates beamRecordingStates, ServerError serverError, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                recordingType = recordUpdateNotification.type;
            }
            if ((i13 & 2) != 0) {
                l7 = recordUpdateNotification.startedAt;
            }
            if ((i13 & 4) != 0) {
                l12 = recordUpdateNotification.updatedAt;
            }
            if ((i13 & 8) != 0) {
                l13 = recordUpdateNotification.stoppedAt;
            }
            if ((i13 & 16) != 0) {
                beamRecordingStates = recordUpdateNotification.state;
            }
            if ((i13 & 32) != 0) {
                serverError = recordUpdateNotification.error;
            }
            BeamRecordingStates beamRecordingStates2 = beamRecordingStates;
            ServerError serverError2 = serverError;
            return recordUpdateNotification.copy(recordingType, l7, l12, l13, beamRecordingStates2, serverError2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RecordingType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getStartedAt() {
            return this.startedAt;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getUpdatedAt() {
            return this.updatedAt;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BeamRecordingStates getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final ServerError getError() {
            return this.error;
        }

        public final RecordUpdateNotification copy(RecordingType type, Long startedAt, Long updatedAt, Long stoppedAt, BeamRecordingStates state, ServerError error) {
            AbstractC22676k.m65750j(type, "type");
            return new RecordUpdateNotification(type, startedAt, updatedAt, stoppedAt, state, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordUpdateNotification)) {
                return false;
            }
            RecordUpdateNotification recordUpdateNotification = (RecordUpdateNotification) other;
            return this.type == recordUpdateNotification.type && AbstractC22676k.m65745e(this.startedAt, recordUpdateNotification.startedAt) && AbstractC22676k.m65745e(this.updatedAt, recordUpdateNotification.updatedAt) && AbstractC22676k.m65745e(this.stoppedAt, recordUpdateNotification.stoppedAt) && this.state == recordUpdateNotification.state && AbstractC22676k.m65745e(this.error, recordUpdateNotification.error);
        }

        public final ServerError getError() {
            return this.error;
        }

        public final Long getStartedAt() {
            return this.startedAt;
        }

        public final BeamRecordingStates getState() {
            return this.state;
        }

        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        public final RecordingType getType() {
            return this.type;
        }

        public final Long getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            Long l7 = this.startedAt;
            int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l12 = this.updatedAt;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.stoppedAt;
            int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
            BeamRecordingStates beamRecordingStates = this.state;
            int iHashCode5 = (iHashCode4 + (beamRecordingStates == null ? 0 : beamRecordingStates.hashCode())) * 31;
            ServerError serverError = this.error;
            return iHashCode5 + (serverError != null ? serverError.hashCode() : 0);
        }

        public String toString() {
            return "RecordUpdateNotification(type=" + this.type + ", startedAt=" + this.startedAt + ", updatedAt=" + this.updatedAt + ", stoppedAt=" + this.stoppedAt + ", state=" + this.state + ", error=" + this.error + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$RoleChange;", "Llive/hms/video/sdk/models/HMSNotifications;", "role", "Llive/hms/video/sdk/models/role/HMSRole;", "<init>", "(Llive/hms/video/sdk/models/role/HMSRole;)V", "getRole", "()Llive/hms/video/sdk/models/role/HMSRole;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class RoleChange extends HMSNotifications {

        @SerializedName("role")
        private final HMSRole role;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoleChange(HMSRole role) {
            super(null);
            AbstractC22676k.m65750j(role, "role");
            this.role = role;
        }

        public static /* synthetic */ RoleChange copy$default(RoleChange roleChange, HMSRole hMSRole, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSRole = roleChange.role;
            }
            return roleChange.copy(hMSRole);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSRole getRole() {
            return this.role;
        }

        public final RoleChange copy(HMSRole role) {
            AbstractC22676k.m65750j(role, "role");
            return new RoleChange(role);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RoleChange) && AbstractC22676k.m65745e(this.role, ((RoleChange) other).role);
        }

        public final HMSRole getRole() {
            return this.role;
        }

        public int hashCode() {
            return this.role.hashCode();
        }

        public String toString() {
            return "RoleChange(role=" + this.role + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;", "Llive/hms/video/sdk/models/HMSNotifications;", "roomId", "", "roomName", "description", "maxSize", "", "largeRoomOptimizationDone", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getRoomId", "()Ljava/lang/String;", "getRoomName", "getDescription", "getMaxSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLargeRoomOptimizationDone", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;", "equals", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class RoomInfo extends HMSNotifications {

        @SerializedName("description")
        private final String description;

        @SerializedName("large_room_optimization")
        private final boolean largeRoomOptimizationDone;

        @SerializedName("max_size")
        private final Integer maxSize;

        @SerializedName("room_id")
        private final String roomId;

        @SerializedName("name")
        private final String roomName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoomInfo(String roomId, String roomName, String description, Integer num, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(roomId, "roomId");
            AbstractC22676k.m65750j(roomName, "roomName");
            AbstractC22676k.m65750j(description, "description");
            this.roomId = roomId;
            this.roomName = roomName;
            this.description = description;
            this.maxSize = num;
            this.largeRoomOptimizationDone = z4;
        }

        public static /* synthetic */ RoomInfo copy$default(RoomInfo roomInfo, String str, String str2, String str3, Integer num, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = roomInfo.roomId;
            }
            if ((i13 & 2) != 0) {
                str2 = roomInfo.roomName;
            }
            if ((i13 & 4) != 0) {
                str3 = roomInfo.description;
            }
            if ((i13 & 8) != 0) {
                num = roomInfo.maxSize;
            }
            if ((i13 & 16) != 0) {
                z4 = roomInfo.largeRoomOptimizationDone;
            }
            boolean z13 = z4;
            String str4 = str3;
            return roomInfo.copy(str, str2, str4, num, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRoomId() {
            return this.roomId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRoomName() {
            return this.roomName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getMaxSize() {
            return this.maxSize;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getLargeRoomOptimizationDone() {
            return this.largeRoomOptimizationDone;
        }

        public final RoomInfo copy(String roomId, String roomName, String description, Integer maxSize, boolean largeRoomOptimizationDone) {
            AbstractC22676k.m65750j(roomId, "roomId");
            AbstractC22676k.m65750j(roomName, "roomName");
            AbstractC22676k.m65750j(description, "description");
            return new RoomInfo(roomId, roomName, description, maxSize, largeRoomOptimizationDone);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoomInfo)) {
                return false;
            }
            RoomInfo roomInfo = (RoomInfo) other;
            return AbstractC22676k.m65745e(this.roomId, roomInfo.roomId) && AbstractC22676k.m65745e(this.roomName, roomInfo.roomName) && AbstractC22676k.m65745e(this.description, roomInfo.description) && AbstractC22676k.m65745e(this.maxSize, roomInfo.maxSize) && this.largeRoomOptimizationDone == roomInfo.largeRoomOptimizationDone;
        }

        public final String getDescription() {
            return this.description;
        }

        public final boolean getLargeRoomOptimizationDone() {
            return this.largeRoomOptimizationDone;
        }

        public final Integer getMaxSize() {
            return this.maxSize;
        }

        public final String getRoomId() {
            return this.roomId;
        }

        public final String getRoomName() {
            return this.roomName;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.roomId.hashCode() * 31, 31, this.roomName), 31, this.description);
            Integer num = this.maxSize;
            return Boolean.hashCode(this.largeRoomOptimizationDone) + ((iM30450d + (num == null ? 0 : num.hashCode())) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("RoomInfo(roomId=");
            sb4.append(this.roomId);
            sb4.append(", roomName=");
            sb4.append(this.roomName);
            sb4.append(", description=");
            sb4.append(this.description);
            sb4.append(", maxSize=");
            sb4.append(this.maxSize);
            sb4.append(", largeRoomOptimizationDone=");
            return AbstractC2875y.m8305r(sb4, this.largeRoomOptimizationDone, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Rtmp;", "", "enabled", "", "startedAt", "", "stoppedAt", "state", "Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;", "<init>", "(ZLjava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;)V", "getEnabled", "()Z", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStoppedAt", "getState", "()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;)Llive/hms/video/sdk/models/HMSNotifications$Rtmp;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Rtmp {

        @SerializedName("enabled")
        private final boolean enabled;

        @SerializedName("started_at")
        private final Long startedAt;

        @SerializedName("state")
        private final BeamStreamingStates state;

        @SerializedName("stopped_at")
        private final Long stoppedAt;

        public Rtmp(boolean z4, Long l7, Long l12, BeamStreamingStates beamStreamingStates) {
            this.enabled = z4;
            this.startedAt = l7;
            this.stoppedAt = l12;
            this.state = beamStreamingStates;
        }

        public static /* synthetic */ Rtmp copy$default(Rtmp rtmp, boolean z4, Long l7, Long l12, BeamStreamingStates beamStreamingStates, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = rtmp.enabled;
            }
            if ((i13 & 2) != 0) {
                l7 = rtmp.startedAt;
            }
            if ((i13 & 4) != 0) {
                l12 = rtmp.stoppedAt;
            }
            if ((i13 & 8) != 0) {
                beamStreamingStates = rtmp.state;
            }
            return rtmp.copy(z4, l7, l12, beamStreamingStates);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getStartedAt() {
            return this.startedAt;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final BeamStreamingStates getState() {
            return this.state;
        }

        public final Rtmp copy(boolean enabled, Long startedAt, Long stoppedAt, BeamStreamingStates state) {
            return new Rtmp(enabled, startedAt, stoppedAt, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rtmp)) {
                return false;
            }
            Rtmp rtmp = (Rtmp) other;
            return this.enabled == rtmp.enabled && AbstractC22676k.m65745e(this.startedAt, rtmp.startedAt) && AbstractC22676k.m65745e(this.stoppedAt, rtmp.stoppedAt) && this.state == rtmp.state;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final Long getStartedAt() {
            return this.startedAt;
        }

        public final BeamStreamingStates getState() {
            return this.state;
        }

        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.enabled) * 31;
            Long l7 = this.startedAt;
            int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l12 = this.stoppedAt;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            BeamStreamingStates beamStreamingStates = this.state;
            return iHashCode3 + (beamStreamingStates != null ? beamStreamingStates.hashCode() : 0);
        }

        public String toString() {
            return "Rtmp(enabled=" + this.enabled + ", startedAt=" + this.startedAt + ", stoppedAt=" + this.stoppedAt + ", state=" + this.state + ')';
        }
    }

    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;", "Llive/hms/video/sdk/models/HMSNotifications;", "startedAt", "", "stoppedAt", "updatedAt", "state", "Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;", "error", "Llive/hms/video/sdk/models/HMSNotifications$ServerError;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)V", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStoppedAt", "getUpdatedAt", "getState", "()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;", "getError", "()Llive/hms/video/sdk/models/HMSNotifications$ServerError;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class RtmpUpdateNotification extends HMSNotifications {

        @SerializedName("error")
        private final ServerError error;

        @SerializedName("started_at")
        private final Long startedAt;

        @SerializedName("state")
        private final BeamStreamingStates state;

        @SerializedName("stopped_at")
        private final Long stoppedAt;

        @SerializedName("updated_at")
        private final Long updatedAt;

        public RtmpUpdateNotification(Long l7, Long l12, Long l13, BeamStreamingStates beamStreamingStates, ServerError serverError) {
            super(null);
            this.startedAt = l7;
            this.stoppedAt = l12;
            this.updatedAt = l13;
            this.state = beamStreamingStates;
            this.error = serverError;
        }

        public static /* synthetic */ RtmpUpdateNotification copy$default(RtmpUpdateNotification rtmpUpdateNotification, Long l7, Long l12, Long l13, BeamStreamingStates beamStreamingStates, ServerError serverError, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                l7 = rtmpUpdateNotification.startedAt;
            }
            if ((i13 & 2) != 0) {
                l12 = rtmpUpdateNotification.stoppedAt;
            }
            if ((i13 & 4) != 0) {
                l13 = rtmpUpdateNotification.updatedAt;
            }
            if ((i13 & 8) != 0) {
                beamStreamingStates = rtmpUpdateNotification.state;
            }
            if ((i13 & 16) != 0) {
                serverError = rtmpUpdateNotification.error;
            }
            ServerError serverError2 = serverError;
            Long l14 = l13;
            return rtmpUpdateNotification.copy(l7, l12, l14, beamStreamingStates, serverError2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getStartedAt() {
            return this.startedAt;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getUpdatedAt() {
            return this.updatedAt;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final BeamStreamingStates getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ServerError getError() {
            return this.error;
        }

        public final RtmpUpdateNotification copy(Long startedAt, Long stoppedAt, Long updatedAt, BeamStreamingStates state, ServerError error) {
            return new RtmpUpdateNotification(startedAt, stoppedAt, updatedAt, state, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RtmpUpdateNotification)) {
                return false;
            }
            RtmpUpdateNotification rtmpUpdateNotification = (RtmpUpdateNotification) other;
            return AbstractC22676k.m65745e(this.startedAt, rtmpUpdateNotification.startedAt) && AbstractC22676k.m65745e(this.stoppedAt, rtmpUpdateNotification.stoppedAt) && AbstractC22676k.m65745e(this.updatedAt, rtmpUpdateNotification.updatedAt) && this.state == rtmpUpdateNotification.state && AbstractC22676k.m65745e(this.error, rtmpUpdateNotification.error);
        }

        public final ServerError getError() {
            return this.error;
        }

        public final Long getStartedAt() {
            return this.startedAt;
        }

        public final BeamStreamingStates getState() {
            return this.state;
        }

        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        public final Long getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            Long l7 = this.startedAt;
            int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
            Long l12 = this.stoppedAt;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.updatedAt;
            int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
            BeamStreamingStates beamStreamingStates = this.state;
            int iHashCode4 = (iHashCode3 + (beamStreamingStates == null ? 0 : beamStreamingStates.hashCode())) * 31;
            ServerError serverError = this.error;
            return iHashCode4 + (serverError != null ? serverError.hashCode() : 0);
        }

        public String toString() {
            return "RtmpUpdateNotification(startedAt=" + this.startedAt + ", stoppedAt=" + this.stoppedAt + ", updatedAt=" + this.updatedAt + ", state=" + this.state + ", error=" + this.error + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$ServerError;", "", "code", "", "message", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "toHmsException", "Llive/hms/video/error/HMSException;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Llive/hms/video/sdk/models/HMSNotifications$ServerError;", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class ServerError {

        @SerializedName("code")
        private final Integer code;

        @SerializedName("message")
        private final String message;

        public ServerError(Integer num, String str) {
            this.code = num;
            this.message = str;
        }

        public static /* synthetic */ ServerError copy$default(ServerError serverError, Integer num, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                num = serverError.code;
            }
            if ((i13 & 2) != 0) {
                str = serverError.message;
            }
            return serverError.copy(num, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final ServerError copy(Integer code, String message) {
            return new ServerError(code, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerError)) {
                return false;
            }
            ServerError serverError = (ServerError) other;
            return AbstractC22676k.m65745e(this.code, serverError.code) && AbstractC22676k.m65745e(this.message, serverError.message);
        }

        public final Integer getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            Integer num = this.code;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.message;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final HMSException toHmsException() {
            Integer num = this.code;
            int iIntValue = num != null ? num.intValue() : 0;
            String str = this.message;
            String str2 = str == null ? "" : str;
            String string = ErrorFactory.Action.NONE.toString();
            String str3 = this.message;
            return new HMSException(iIntValue, "Server Error", string, str2, str3 == null ? "" : str3, null, false, null, 224, null);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("ServerError(code=");
            sb4.append(this.code);
            sb4.append(", message=");
            return AbstractC25012a.m73377j(sb4, this.message, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$SessionInfo;", "Llive/hms/video/sdk/models/HMSNotifications;", "sessionId", "", "roomId", "peerCount", "", "trackCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSessionId", "()Ljava/lang/String;", "getRoomId", "getPeerCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackCount", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Llive/hms/video/sdk/models/HMSNotifications$SessionInfo;", "equals", "", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class SessionInfo extends HMSNotifications {

        @SerializedName("peer_count")
        private final Integer peerCount;

        @SerializedName("room_id")
        private final String roomId;

        @SerializedName("session_id")
        private final String sessionId;

        @SerializedName("track_count")
        private final Integer trackCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionInfo(String sessionId, String roomId, Integer num, Integer num2) {
            super(null);
            AbstractC22676k.m65750j(sessionId, "sessionId");
            AbstractC22676k.m65750j(roomId, "roomId");
            this.sessionId = sessionId;
            this.roomId = roomId;
            this.peerCount = num;
            this.trackCount = num2;
        }

        public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, Integer num, Integer num2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = sessionInfo.sessionId;
            }
            if ((i13 & 2) != 0) {
                str2 = sessionInfo.roomId;
            }
            if ((i13 & 4) != 0) {
                num = sessionInfo.peerCount;
            }
            if ((i13 & 8) != 0) {
                num2 = sessionInfo.trackCount;
            }
            return sessionInfo.copy(str, str2, num, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRoomId() {
            return this.roomId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getPeerCount() {
            return this.peerCount;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getTrackCount() {
            return this.trackCount;
        }

        public final SessionInfo copy(String sessionId, String roomId, Integer peerCount, Integer trackCount) {
            AbstractC22676k.m65750j(sessionId, "sessionId");
            AbstractC22676k.m65750j(roomId, "roomId");
            return new SessionInfo(sessionId, roomId, peerCount, trackCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionInfo)) {
                return false;
            }
            SessionInfo sessionInfo = (SessionInfo) other;
            return AbstractC22676k.m65745e(this.sessionId, sessionInfo.sessionId) && AbstractC22676k.m65745e(this.roomId, sessionInfo.roomId) && AbstractC22676k.m65745e(this.peerCount, sessionInfo.peerCount) && AbstractC22676k.m65745e(this.trackCount, sessionInfo.trackCount);
        }

        public final Integer getPeerCount() {
            return this.peerCount;
        }

        public final String getRoomId() {
            return this.roomId;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final Integer getTrackCount() {
            return this.trackCount;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.sessionId.hashCode() * 31, 31, this.roomId);
            Integer num = this.peerCount;
            int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.trackCount;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "SessionInfo(sessionId=" + this.sessionId + ", roomId=" + this.roomId + ", peerCount=" + this.peerCount + ", trackCount=" + this.trackCount + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;", "Llive/hms/video/sdk/models/HMSNotifications;", "speakers", "", "Llive/hms/video/sdk/models/HMSSpeakerServerResponse;", "<init>", "(Ljava/util/List;)V", "getSpeakers", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class SpeakerList extends HMSNotifications {

        @SerializedName("speaker-list")
        private final List<HMSSpeakerServerResponse> speakers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpeakerList(List<HMSSpeakerServerResponse> speakers) {
            super(null);
            AbstractC22676k.m65750j(speakers, "speakers");
            this.speakers = speakers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SpeakerList copy$default(SpeakerList speakerList, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = speakerList.speakers;
            }
            return speakerList.copy(list);
        }

        public final List<HMSSpeakerServerResponse> component1() {
            return this.speakers;
        }

        public final SpeakerList copy(List<HMSSpeakerServerResponse> speakers) {
            AbstractC22676k.m65750j(speakers, "speakers");
            return new SpeakerList(speakers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpeakerList) && AbstractC22676k.m65745e(this.speakers, ((SpeakerList) other).speakers);
        }

        public final List<HMSSpeakerServerResponse> getSpeakers() {
            return this.speakers;
        }

        public int hashCode() {
            return this.speakers.hashCode();
        }

        public String toString() {
            return AbstractC17176i.m48506h(new StringBuilder("SpeakerList(speakers="), this.speakers, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\u0087\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00102\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00067"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;", "", "pollId", "", "startedBy", "createdBy", "title", "startedAt", "", AttachmentExtensionsKt.EXTRA_DURATION, CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS, "", "eligibleVoters", "", "eligibleToViewResponses", "category", "Llive/hms/video/polls/models/HmsPollCategory;", "pollUserTrackingMode", "Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;Llive/hms/video/polls/models/HmsPollUserTrackingMode;)V", "getPollId", "()Ljava/lang/String;", "getStartedBy", "getCreatedBy", "getTitle", "getStartedAt", "()J", "getDuration", "getAnonymous", "()Z", "getEligibleVoters", "()Ljava/util/List;", "getEligibleToViewResponses", "getCategory", "()Llive/hms/video/polls/models/HmsPollCategory;", "getPollUserTrackingMode", "()Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class StartedPolls {

        @SerializedName(CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS)
        private final boolean anonymous;

        @SerializedName("type")
        private final HmsPollCategory category;

        @SerializedName("created_by")
        private final String createdBy;

        @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
        private final long duration;

        @SerializedName("responses")
        private final List<String> eligibleToViewResponses;

        @SerializedName("vote")
        private final List<String> eligibleVoters;

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("mode")
        private final HmsPollUserTrackingMode pollUserTrackingMode;

        @SerializedName("started_at")
        private final long startedAt;

        @SerializedName("started_by")
        private final String startedBy;

        @SerializedName("title")
        private final String title;

        public StartedPolls(String pollId, String str, String str2, String title, long j7, long j13, boolean z4, List<String> eligibleVoters, List<String> eligibleToViewResponses, HmsPollCategory category, HmsPollUserTrackingMode pollUserTrackingMode) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(eligibleVoters, "eligibleVoters");
            AbstractC22676k.m65750j(eligibleToViewResponses, "eligibleToViewResponses");
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(pollUserTrackingMode, "pollUserTrackingMode");
            this.pollId = pollId;
            this.startedBy = str;
            this.createdBy = str2;
            this.title = title;
            this.startedAt = j7;
            this.duration = j13;
            this.anonymous = z4;
            this.eligibleVoters = eligibleVoters;
            this.eligibleToViewResponses = eligibleToViewResponses;
            this.category = category;
            this.pollUserTrackingMode = pollUserTrackingMode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StartedPolls copy$default(StartedPolls startedPolls, String str, String str2, String str3, String str4, long j7, long j13, boolean z4, List list, List list2, HmsPollCategory hmsPollCategory, HmsPollUserTrackingMode hmsPollUserTrackingMode, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = startedPolls.pollId;
            }
            return startedPolls.copy(str, (i13 & 2) != 0 ? startedPolls.startedBy : str2, (i13 & 4) != 0 ? startedPolls.createdBy : str3, (i13 & 8) != 0 ? startedPolls.title : str4, (i13 & 16) != 0 ? startedPolls.startedAt : j7, (i13 & 32) != 0 ? startedPolls.duration : j13, (i13 & 64) != 0 ? startedPolls.anonymous : z4, (i13 & 128) != 0 ? startedPolls.eligibleVoters : list, (i13 & 256) != 0 ? startedPolls.eligibleToViewResponses : list2, (i13 & 512) != 0 ? startedPolls.category : hmsPollCategory, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? startedPolls.pollUserTrackingMode : hmsPollUserTrackingMode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final HmsPollCategory getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final HmsPollUserTrackingMode getPollUserTrackingMode() {
            return this.pollUserTrackingMode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStartedBy() {
            return this.startedBy;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedBy() {
            return this.createdBy;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getStartedAt() {
            return this.startedAt;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getAnonymous() {
            return this.anonymous;
        }

        public final List<String> component8() {
            return this.eligibleVoters;
        }

        public final List<String> component9() {
            return this.eligibleToViewResponses;
        }

        public final StartedPolls copy(String pollId, String startedBy, String createdBy, String title, long startedAt, long duration, boolean anonymous, List<String> eligibleVoters, List<String> eligibleToViewResponses, HmsPollCategory category, HmsPollUserTrackingMode pollUserTrackingMode) {
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(eligibleVoters, "eligibleVoters");
            AbstractC22676k.m65750j(eligibleToViewResponses, "eligibleToViewResponses");
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(pollUserTrackingMode, "pollUserTrackingMode");
            return new StartedPolls(pollId, startedBy, createdBy, title, startedAt, duration, anonymous, eligibleVoters, eligibleToViewResponses, category, pollUserTrackingMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartedPolls)) {
                return false;
            }
            StartedPolls startedPolls = (StartedPolls) other;
            return AbstractC22676k.m65745e(this.pollId, startedPolls.pollId) && AbstractC22676k.m65745e(this.startedBy, startedPolls.startedBy) && AbstractC22676k.m65745e(this.createdBy, startedPolls.createdBy) && AbstractC22676k.m65745e(this.title, startedPolls.title) && this.startedAt == startedPolls.startedAt && this.duration == startedPolls.duration && this.anonymous == startedPolls.anonymous && AbstractC22676k.m65745e(this.eligibleVoters, startedPolls.eligibleVoters) && AbstractC22676k.m65745e(this.eligibleToViewResponses, startedPolls.eligibleToViewResponses) && this.category == startedPolls.category && this.pollUserTrackingMode == startedPolls.pollUserTrackingMode;
        }

        public final boolean getAnonymous() {
            return this.anonymous;
        }

        public final HmsPollCategory getCategory() {
            return this.category;
        }

        public final String getCreatedBy() {
            return this.createdBy;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final List<String> getEligibleToViewResponses() {
            return this.eligibleToViewResponses;
        }

        public final List<String> getEligibleVoters() {
            return this.eligibleVoters;
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final HmsPollUserTrackingMode getPollUserTrackingMode() {
            return this.pollUserTrackingMode;
        }

        public final long getStartedAt() {
            return this.startedAt;
        }

        public final String getStartedBy() {
            return this.startedBy;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.pollId.hashCode() * 31;
            String str = this.startedBy;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.createdBy;
            return this.pollUserTrackingMode.hashCode() + ((this.category.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30450d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.title), this.startedAt, 31), this.duration, 31), 31, this.anonymous), 31, this.eligibleVoters), 31, this.eligibleToViewResponses)) * 31);
        }

        public String toString() {
            return "StartedPolls(pollId=" + this.pollId + ", startedBy=" + this.startedBy + ", createdBy=" + this.createdBy + ", title=" + this.title + ", startedAt=" + this.startedAt + ", duration=" + this.duration + ", anonymous=" + this.anonymous + ", eligibleVoters=" + this.eligibleVoters + ", eligibleToViewResponses=" + this.eligibleToViewResponses + ", category=" + this.category + ", pollUserTrackingMode=" + this.pollUserTrackingMode + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$StoppedPolls;", "", "pollId", "", "stoppedBy", "stoppedAt", "", AttachmentExtensionsKt.EXTRA_DURATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getPollId", "()Ljava/lang/String;", "getStoppedBy", "getStoppedAt", "()J", "getDuration", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class StoppedPolls {

        @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
        private final long duration;

        @SerializedName("poll_id")
        private final String pollId;

        @SerializedName("stopped_at")
        private final long stoppedAt;

        @SerializedName("stopped_by")
        private final String stoppedBy;

        public StoppedPolls(String pollId, String str, long j7, long j13) {
            AbstractC22676k.m65750j(pollId, "pollId");
            this.pollId = pollId;
            this.stoppedBy = str;
            this.stoppedAt = j7;
            this.duration = j13;
        }

        public static /* synthetic */ StoppedPolls copy$default(StoppedPolls stoppedPolls, String str, String str2, long j7, long j13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = stoppedPolls.pollId;
            }
            if ((i13 & 2) != 0) {
                str2 = stoppedPolls.stoppedBy;
            }
            if ((i13 & 4) != 0) {
                j7 = stoppedPolls.stoppedAt;
            }
            if ((i13 & 8) != 0) {
                j13 = stoppedPolls.duration;
            }
            long j14 = j13;
            return stoppedPolls.copy(str, str2, j7, j14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStoppedBy() {
            return this.stoppedBy;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getStoppedAt() {
            return this.stoppedAt;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        public final StoppedPolls copy(String pollId, String stoppedBy, long stoppedAt, long duration) {
            AbstractC22676k.m65750j(pollId, "pollId");
            return new StoppedPolls(pollId, stoppedBy, stoppedAt, duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoppedPolls)) {
                return false;
            }
            StoppedPolls stoppedPolls = (StoppedPolls) other;
            return AbstractC22676k.m65745e(this.pollId, stoppedPolls.pollId) && AbstractC22676k.m65745e(this.stoppedBy, stoppedPolls.stoppedBy) && this.stoppedAt == stoppedPolls.stoppedAt && this.duration == stoppedPolls.duration;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final long getStoppedAt() {
            return this.stoppedAt;
        }

        public final String getStoppedBy() {
            return this.stoppedBy;
        }

        public int hashCode() {
            int iHashCode = this.pollId.hashCode() * 31;
            String str = this.stoppedBy;
            return Long.hashCode(this.duration) + AbstractC11266d.m30451e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.stoppedAt, 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("StoppedPolls(pollId=");
            sb4.append(this.pollId);
            sb4.append(", stoppedBy=");
            sb4.append(this.stoppedBy);
            sb4.append(", stoppedAt=");
            sb4.append(this.stoppedAt);
            sb4.append(", duration=");
            return AbstractC2875y.m8302o(sb4, this.duration, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Streaming;", "", "rtmp", "Llive/hms/video/sdk/models/HMSNotifications$Rtmp;", "hls", "Llive/hms/video/sdk/models/HMSNotifications$Hls;", "<init>", "(Llive/hms/video/sdk/models/HMSNotifications$Rtmp;Llive/hms/video/sdk/models/HMSNotifications$Hls;)V", "getRtmp", "()Llive/hms/video/sdk/models/HMSNotifications$Rtmp;", "getHls", "()Llive/hms/video/sdk/models/HMSNotifications$Hls;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Streaming {

        @SerializedName("hls")
        private final Hls hls;

        @SerializedName("rtmp")
        private final Rtmp rtmp;

        public Streaming(Rtmp rtmp, Hls hls) {
            AbstractC22676k.m65750j(rtmp, "rtmp");
            AbstractC22676k.m65750j(hls, "hls");
            this.rtmp = rtmp;
            this.hls = hls;
        }

        public static /* synthetic */ Streaming copy$default(Streaming streaming, Rtmp rtmp, Hls hls, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                rtmp = streaming.rtmp;
            }
            if ((i13 & 2) != 0) {
                hls = streaming.hls;
            }
            return streaming.copy(rtmp, hls);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Rtmp getRtmp() {
            return this.rtmp;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Hls getHls() {
            return this.hls;
        }

        public final Streaming copy(Rtmp rtmp, Hls hls) {
            AbstractC22676k.m65750j(rtmp, "rtmp");
            AbstractC22676k.m65750j(hls, "hls");
            return new Streaming(rtmp, hls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Streaming)) {
                return false;
            }
            Streaming streaming = (Streaming) other;
            return AbstractC22676k.m65745e(this.rtmp, streaming.rtmp) && AbstractC22676k.m65745e(this.hls, streaming.hls);
        }

        public final Hls getHls() {
            return this.hls;
        }

        public final Rtmp getRtmp() {
            return this.rtmp;
        }

        public int hashCode() {
            return this.hls.hashCode() + (this.rtmp.hashCode() * 31);
        }

        public String toString() {
            return "Streaming(rtmp=" + this.rtmp + ", hls=" + this.hls + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006!"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Track;", "Llive/hms/video/sdk/models/HMSNotifications;", "isMute", "", "type", "", "source", "description", "trackId", "streamId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getType", "()Ljava/lang/String;", "getSource", "getDescription", "getTrackId", "getStreamId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Track extends HMSNotifications {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @SerializedName("description")
        private final String description;

        @SerializedName(CommandDefaults.MUTE)
        private final boolean isMute;

        @SerializedName("source")
        private final String source;

        @SerializedName("stream_id")
        private final String streamId;

        @SerializedName("track_id")
        private final String trackId;

        @SerializedName("type")
        private final String type;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Track$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "track", "Llive/hms/video/media/tracks/HMSTrack;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Track from(HMSTrack track) {
                AbstractC22676k.m65750j(track, "track");
                boolean isMute = track.getIsMute();
                String string = track.getType().toString();
                Locale locale = Locale.ROOT;
                return new Track(isMute, AbstractC31061c.m95641q(locale, "ROOT", string, locale, "toLowerCase(...)"), track.getSource(), track.getDescription(), track.getTrackId(), track.getStream().getId());
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Track(boolean z4, String type, String source, String description, String trackId, String streamId) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(trackId, "trackId");
            AbstractC22676k.m65750j(streamId, "streamId");
            this.isMute = z4;
            this.type = type;
            this.source = source;
            this.description = description;
            this.trackId = trackId;
            this.streamId = streamId;
        }

        public static /* synthetic */ Track copy$default(Track track, boolean z4, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = track.isMute;
            }
            if ((i13 & 2) != 0) {
                str = track.type;
            }
            if ((i13 & 4) != 0) {
                str2 = track.source;
            }
            if ((i13 & 8) != 0) {
                str3 = track.description;
            }
            if ((i13 & 16) != 0) {
                str4 = track.trackId;
            }
            if ((i13 & 32) != 0) {
                str5 = track.streamId;
            }
            String str6 = str4;
            String str7 = str5;
            return track.copy(z4, str, str2, str3, str6, str7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsMute() {
            return this.isMute;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTrackId() {
            return this.trackId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getStreamId() {
            return this.streamId;
        }

        public final Track copy(boolean isMute, String type, String source, String description, String trackId, String streamId) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(trackId, "trackId");
            AbstractC22676k.m65750j(streamId, "streamId");
            return new Track(isMute, type, source, description, trackId, streamId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Track)) {
                return false;
            }
            Track track = (Track) other;
            return this.isMute == track.isMute && AbstractC22676k.m65745e(this.type, track.type) && AbstractC22676k.m65745e(this.source, track.source) && AbstractC22676k.m65745e(this.description, track.description) && AbstractC22676k.m65745e(this.trackId, track.trackId) && AbstractC22676k.m65745e(this.streamId, track.streamId);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getStreamId() {
            return this.streamId;
        }

        public final String getTrackId() {
            return this.trackId;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.streamId.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.isMute) * 31, 31, this.type), 31, this.source), 31, this.description), 31, this.trackId);
        }

        public final boolean isMute() {
            return this.isMute;
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("Track(isMute=");
            sb4.append(this.isMute);
            sb4.append(", type=");
            sb4.append(this.type);
            sb4.append(", source=");
            sb4.append(this.source);
            sb4.append(", description=");
            sb4.append(this.description);
            sb4.append(", trackId=");
            sb4.append(this.trackId);
            sb4.append(", streamId=");
            return AbstractC25012a.m73377j(sb4, this.streamId, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$TrackMetadata;", "Llive/hms/video/sdk/models/HMSNotifications;", "tracksMap", "Ljava/util/HashMap;", "", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "peer", "Llive/hms/video/sdk/models/HMSNotifications$TrackMetadataPeer;", "<init>", "(Ljava/util/HashMap;Llive/hms/video/sdk/models/HMSNotifications$TrackMetadataPeer;)V", "getTracksMap", "()Ljava/util/HashMap;", "getPeer", "()Llive/hms/video/sdk/models/HMSNotifications$TrackMetadataPeer;", "tracks", "", "getTracks", "()[Llive/hms/video/sdk/models/HMSNotifications$Track;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TrackMetadata extends HMSNotifications {

        @SerializedName("peer")
        private final TrackMetadataPeer peer;

        @SerializedName("tracks")
        private final HashMap<String, Track> tracksMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackMetadata(HashMap<String, Track> tracksMap, TrackMetadataPeer peer) {
            super(null);
            AbstractC22676k.m65750j(tracksMap, "tracksMap");
            AbstractC22676k.m65750j(peer, "peer");
            this.tracksMap = tracksMap;
            this.peer = peer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrackMetadata copy$default(TrackMetadata trackMetadata, HashMap map, TrackMetadataPeer trackMetadataPeer, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                map = trackMetadata.tracksMap;
            }
            if ((i13 & 2) != 0) {
                trackMetadataPeer = trackMetadata.peer;
            }
            return trackMetadata.copy(map, trackMetadataPeer);
        }

        public final HashMap<String, Track> component1() {
            return this.tracksMap;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TrackMetadataPeer getPeer() {
            return this.peer;
        }

        public final TrackMetadata copy(HashMap<String, Track> tracksMap, TrackMetadataPeer peer) {
            AbstractC22676k.m65750j(tracksMap, "tracksMap");
            AbstractC22676k.m65750j(peer, "peer");
            return new TrackMetadata(tracksMap, peer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackMetadata)) {
                return false;
            }
            TrackMetadata trackMetadata = (TrackMetadata) other;
            return AbstractC22676k.m65745e(this.tracksMap, trackMetadata.tracksMap) && AbstractC22676k.m65745e(this.peer, trackMetadata.peer);
        }

        public final TrackMetadataPeer getPeer() {
            return this.peer;
        }

        public final Track[] getTracks() {
            Collection<Track> collectionValues = this.tracksMap.values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            return (Track[]) collectionValues.toArray(new Track[0]);
        }

        public final HashMap<String, Track> getTracksMap() {
            return this.tracksMap;
        }

        public int hashCode() {
            return this.peer.hashCode() + (this.tracksMap.hashCode() * 31);
        }

        public String toString() {
            return "TrackMetadata(tracksMap=" + this.tracksMap + ", peer=" + this.peer + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$TrackMetadataPeer;", "Llive/hms/video/sdk/models/HMSNotifications;", "peerId", "", "groups", "Ljava/util/ArrayList;", "role", "info", "Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)V", "getPeerId", "()Ljava/lang/String;", "getGroups", "()Ljava/util/ArrayList;", "getRole", "getInfo", "()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "toPeerJoin", "Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TrackMetadataPeer extends HMSNotifications {

        @SerializedName("groups")
        private final ArrayList<String> groups;

        @SerializedName("info")
        private final PeerInfo info;

        @SerializedName("peer_id")
        private final String peerId;

        @SerializedName("role")
        private final String role;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackMetadataPeer(String peerId, ArrayList<String> arrayList, String role, PeerInfo info) {
            super(null);
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            this.peerId = peerId;
            this.groups = arrayList;
            this.role = role;
            this.info = info;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrackMetadataPeer copy$default(TrackMetadataPeer trackMetadataPeer, String str, ArrayList arrayList, String str2, PeerInfo peerInfo, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = trackMetadataPeer.peerId;
            }
            if ((i13 & 2) != 0) {
                arrayList = trackMetadataPeer.groups;
            }
            if ((i13 & 4) != 0) {
                str2 = trackMetadataPeer.role;
            }
            if ((i13 & 8) != 0) {
                peerInfo = trackMetadataPeer.info;
            }
            return trackMetadataPeer.copy(str, arrayList, str2, peerInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        public final ArrayList<String> component2() {
            return this.groups;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final PeerInfo getInfo() {
            return this.info;
        }

        public final TrackMetadataPeer copy(String peerId, ArrayList<String> groups, String role, PeerInfo info) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(role, "role");
            AbstractC22676k.m65750j(info, "info");
            return new TrackMetadataPeer(peerId, groups, role, info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackMetadataPeer)) {
                return false;
            }
            TrackMetadataPeer trackMetadataPeer = (TrackMetadataPeer) other;
            return AbstractC22676k.m65745e(this.peerId, trackMetadataPeer.peerId) && AbstractC22676k.m65745e(this.groups, trackMetadataPeer.groups) && AbstractC22676k.m65745e(this.role, trackMetadataPeer.role) && AbstractC22676k.m65745e(this.info, trackMetadataPeer.info);
        }

        public final ArrayList<String> getGroups() {
            return this.groups;
        }

        public final PeerInfo getInfo() {
            return this.info;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final String getRole() {
            return this.role;
        }

        public int hashCode() {
            int iHashCode = this.peerId.hashCode() * 31;
            ArrayList<String> arrayList = this.groups;
            return this.info.hashCode() + AbstractC11266d.m30450d((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31, this.role);
        }

        public final PeerJoin toPeerJoin() {
            return new PeerJoin(this.peerId, this.role, this.groups, this.info, 0L, 1L);
        }

        public String toString() {
            return "TrackMetadataPeer(peerId=" + this.peerId + ", groups=" + this.groups + ", role=" + this.role + ", info=" + this.info + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;", "Llive/hms/video/sdk/models/HMSNotifications;", "peerId", "", "trackid", "streamId", "isMute", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getPeerId", "()Ljava/lang/String;", "getTrackid", "getStreamId", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TrackUpdateRequest extends HMSNotifications {

        @SerializedName(CommandDefaults.MUTE)
        private final boolean isMute;

        @SerializedName("requested_by")
        private final String peerId;

        @SerializedName("stream_id")
        private final String streamId;

        @SerializedName("track_id")
        private final String trackid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackUpdateRequest(String str, String trackid, String streamId, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(trackid, "trackid");
            AbstractC22676k.m65750j(streamId, "streamId");
            this.peerId = str;
            this.trackid = trackid;
            this.streamId = streamId;
            this.isMute = z4;
        }

        public static /* synthetic */ TrackUpdateRequest copy$default(TrackUpdateRequest trackUpdateRequest, String str, String str2, String str3, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = trackUpdateRequest.peerId;
            }
            if ((i13 & 2) != 0) {
                str2 = trackUpdateRequest.trackid;
            }
            if ((i13 & 4) != 0) {
                str3 = trackUpdateRequest.streamId;
            }
            if ((i13 & 8) != 0) {
                z4 = trackUpdateRequest.isMute;
            }
            return trackUpdateRequest.copy(str, str2, str3, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTrackid() {
            return this.trackid;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStreamId() {
            return this.streamId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsMute() {
            return this.isMute;
        }

        public final TrackUpdateRequest copy(String peerId, String trackid, String streamId, boolean isMute) {
            AbstractC22676k.m65750j(trackid, "trackid");
            AbstractC22676k.m65750j(streamId, "streamId");
            return new TrackUpdateRequest(peerId, trackid, streamId, isMute);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackUpdateRequest)) {
                return false;
            }
            TrackUpdateRequest trackUpdateRequest = (TrackUpdateRequest) other;
            return AbstractC22676k.m65745e(this.peerId, trackUpdateRequest.peerId) && AbstractC22676k.m65745e(this.trackid, trackUpdateRequest.trackid) && AbstractC22676k.m65745e(this.streamId, trackUpdateRequest.streamId) && this.isMute == trackUpdateRequest.isMute;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final String getStreamId() {
            return this.streamId;
        }

        public final String getTrackid() {
            return this.trackid;
        }

        public int hashCode() {
            String str = this.peerId;
            return Boolean.hashCode(this.isMute) + AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.trackid), 31, this.streamId);
        }

        public final boolean isMute() {
            return this.isMute;
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("TrackUpdateRequest(peerId=");
            sb4.append(this.peerId);
            sb4.append(", trackid=");
            sb4.append(this.trackid);
            sb4.append(", streamId=");
            sb4.append(this.streamId);
            sb4.append(", isMute=");
            return AbstractC2875y.m8305r(sb4, this.isMute, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;", "", "peerId", "", "info", "Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "<init>", "(Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)V", "getPeerId", "()Ljava/lang/String;", "getInfo", "()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TranscriptionPeer {

        @SerializedName("info")
        private final PeerInfo info;

        @SerializedName("peer_id")
        private final String peerId;

        public TranscriptionPeer(String peerId, PeerInfo info) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(info, "info");
            this.peerId = peerId;
            this.info = info;
        }

        public static /* synthetic */ TranscriptionPeer copy$default(TranscriptionPeer transcriptionPeer, String str, PeerInfo peerInfo, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = transcriptionPeer.peerId;
            }
            if ((i13 & 2) != 0) {
                peerInfo = transcriptionPeer.info;
            }
            return transcriptionPeer.copy(str, peerInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PeerInfo getInfo() {
            return this.info;
        }

        public final TranscriptionPeer copy(String peerId, PeerInfo info) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(info, "info");
            return new TranscriptionPeer(peerId, info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TranscriptionPeer)) {
                return false;
            }
            TranscriptionPeer transcriptionPeer = (TranscriptionPeer) other;
            return AbstractC22676k.m65745e(this.peerId, transcriptionPeer.peerId) && AbstractC22676k.m65745e(this.info, transcriptionPeer.info);
        }

        public final PeerInfo getInfo() {
            return this.info;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public int hashCode() {
            return this.info.hashCode() + (this.peerId.hashCode() * 31);
        }

        public String toString() {
            return "TranscriptionPeer(peerId=" + this.peerId + ", info=" + this.info + ')';
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;", "", "startedAt", "", "stoppedAt", "updatedAt", "initialisedAt", "state", "Llive/hms/video/sdk/models/TranscriptionState;", "mode", "Llive/hms/video/sdk/models/TranscriptionsMode;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;)V", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStoppedAt", "getUpdatedAt", "getInitialisedAt", "getState", "()Llive/hms/video/sdk/models/TranscriptionState;", "getMode", "()Llive/hms/video/sdk/models/TranscriptionsMode;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;)Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TranscriptionsPeerList {

        @SerializedName("initialised_at")
        private final Long initialisedAt;

        @SerializedName("mode")
        private final TranscriptionsMode mode;

        @SerializedName("started_at")
        private final Long startedAt;

        @SerializedName("state")
        private final TranscriptionState state;

        @SerializedName("stopped_at")
        private final Long stoppedAt;

        @SerializedName("updated_at")
        private final Long updatedAt;

        public TranscriptionsPeerList(Long l7, Long l12, Long l13, Long l14, TranscriptionState transcriptionState, TranscriptionsMode transcriptionsMode) {
            this.startedAt = l7;
            this.stoppedAt = l12;
            this.updatedAt = l13;
            this.initialisedAt = l14;
            this.state = transcriptionState;
            this.mode = transcriptionsMode;
        }

        public static /* synthetic */ TranscriptionsPeerList copy$default(TranscriptionsPeerList transcriptionsPeerList, Long l7, Long l12, Long l13, Long l14, TranscriptionState transcriptionState, TranscriptionsMode transcriptionsMode, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                l7 = transcriptionsPeerList.startedAt;
            }
            if ((i13 & 2) != 0) {
                l12 = transcriptionsPeerList.stoppedAt;
            }
            if ((i13 & 4) != 0) {
                l13 = transcriptionsPeerList.updatedAt;
            }
            if ((i13 & 8) != 0) {
                l14 = transcriptionsPeerList.initialisedAt;
            }
            if ((i13 & 16) != 0) {
                transcriptionState = transcriptionsPeerList.state;
            }
            if ((i13 & 32) != 0) {
                transcriptionsMode = transcriptionsPeerList.mode;
            }
            TranscriptionState transcriptionState2 = transcriptionState;
            TranscriptionsMode transcriptionsMode2 = transcriptionsMode;
            return transcriptionsPeerList.copy(l7, l12, l13, l14, transcriptionState2, transcriptionsMode2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getStartedAt() {
            return this.startedAt;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getUpdatedAt() {
            return this.updatedAt;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getInitialisedAt() {
            return this.initialisedAt;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final TranscriptionState getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        public final TranscriptionsPeerList copy(Long startedAt, Long stoppedAt, Long updatedAt, Long initialisedAt, TranscriptionState state, TranscriptionsMode mode) {
            return new TranscriptionsPeerList(startedAt, stoppedAt, updatedAt, initialisedAt, state, mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TranscriptionsPeerList)) {
                return false;
            }
            TranscriptionsPeerList transcriptionsPeerList = (TranscriptionsPeerList) other;
            return AbstractC22676k.m65745e(this.startedAt, transcriptionsPeerList.startedAt) && AbstractC22676k.m65745e(this.stoppedAt, transcriptionsPeerList.stoppedAt) && AbstractC22676k.m65745e(this.updatedAt, transcriptionsPeerList.updatedAt) && AbstractC22676k.m65745e(this.initialisedAt, transcriptionsPeerList.initialisedAt) && this.state == transcriptionsPeerList.state && this.mode == transcriptionsPeerList.mode;
        }

        public final Long getInitialisedAt() {
            return this.initialisedAt;
        }

        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        public final Long getStartedAt() {
            return this.startedAt;
        }

        public final TranscriptionState getState() {
            return this.state;
        }

        public final Long getStoppedAt() {
            return this.stoppedAt;
        }

        public final Long getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            Long l7 = this.startedAt;
            int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
            Long l12 = this.stoppedAt;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.updatedAt;
            int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.initialisedAt;
            int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
            TranscriptionState transcriptionState = this.state;
            int iHashCode5 = (iHashCode4 + (transcriptionState == null ? 0 : transcriptionState.hashCode())) * 31;
            TranscriptionsMode transcriptionsMode = this.mode;
            return iHashCode5 + (transcriptionsMode != null ? transcriptionsMode.hashCode() : 0);
        }

        public String toString() {
            return "TranscriptionsPeerList(startedAt=" + this.startedAt + ", stoppedAt=" + this.stoppedAt + ", updatedAt=" + this.updatedAt + ", initialisedAt=" + this.initialisedAt + ", state=" + this.state + ", mode=" + this.mode + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPlugin;", "", "permissions", "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPluginPermissions;", "mode", "Llive/hms/video/sdk/models/TranscriptionsMode;", "<init>", "(Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPluginPermissions;Llive/hms/video/sdk/models/TranscriptionsMode;)V", "getPermissions", "()Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPluginPermissions;", "getMode", "()Llive/hms/video/sdk/models/TranscriptionsMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TranscriptionsPlugin {

        @SerializedName("mode")
        private final TranscriptionsMode mode;

        @SerializedName("permissions")
        private final TranscriptionsPluginPermissions permissions;

        public TranscriptionsPlugin(TranscriptionsPluginPermissions transcriptionsPluginPermissions, TranscriptionsMode transcriptionsMode) {
            this.permissions = transcriptionsPluginPermissions;
            this.mode = transcriptionsMode;
        }

        public static /* synthetic */ TranscriptionsPlugin copy$default(TranscriptionsPlugin transcriptionsPlugin, TranscriptionsPluginPermissions transcriptionsPluginPermissions, TranscriptionsMode transcriptionsMode, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                transcriptionsPluginPermissions = transcriptionsPlugin.permissions;
            }
            if ((i13 & 2) != 0) {
                transcriptionsMode = transcriptionsPlugin.mode;
            }
            return transcriptionsPlugin.copy(transcriptionsPluginPermissions, transcriptionsMode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TranscriptionsPluginPermissions getPermissions() {
            return this.permissions;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        public final TranscriptionsPlugin copy(TranscriptionsPluginPermissions permissions, TranscriptionsMode mode) {
            return new TranscriptionsPlugin(permissions, mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TranscriptionsPlugin)) {
                return false;
            }
            TranscriptionsPlugin transcriptionsPlugin = (TranscriptionsPlugin) other;
            return AbstractC22676k.m65745e(this.permissions, transcriptionsPlugin.permissions) && this.mode == transcriptionsPlugin.mode;
        }

        public final TranscriptionsMode getMode() {
            return this.mode;
        }

        public final TranscriptionsPluginPermissions getPermissions() {
            return this.permissions;
        }

        public int hashCode() {
            TranscriptionsPluginPermissions transcriptionsPluginPermissions = this.permissions;
            int iHashCode = (transcriptionsPluginPermissions == null ? 0 : transcriptionsPluginPermissions.hashCode()) * 31;
            TranscriptionsMode transcriptionsMode = this.mode;
            return iHashCode + (transcriptionsMode != null ? transcriptionsMode.hashCode() : 0);
        }

        public String toString() {
            return "TranscriptionsPlugin(permissions=" + this.permissions + ", mode=" + this.mode + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPluginPermissions;", "", "admin", "", "", "<init>", "(Ljava/util/List;)V", "getAdmin", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TranscriptionsPluginPermissions {

        @SerializedName("admin")
        private final List<String> admin;

        public TranscriptionsPluginPermissions(List<String> list) {
            this.admin = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TranscriptionsPluginPermissions copy$default(TranscriptionsPluginPermissions transcriptionsPluginPermissions, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = transcriptionsPluginPermissions.admin;
            }
            return transcriptionsPluginPermissions.copy(list);
        }

        public final List<String> component1() {
            return this.admin;
        }

        public final TranscriptionsPluginPermissions copy(List<String> admin) {
            return new TranscriptionsPluginPermissions(admin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TranscriptionsPluginPermissions) && AbstractC22676k.m65745e(this.admin, ((TranscriptionsPluginPermissions) other).admin);
        }

        public final List<String> getAdmin() {
            return this.admin;
        }

        public int hashCode() {
            List<String> list = this.admin;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return AbstractC17176i.m48506h(new StringBuilder("TranscriptionsPluginPermissions(admin="), this.admin, ')');
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Unsupported;", "Llive/hms/video/sdk/models/HMSNotifications;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Unsupported extends HMSNotifications {
        public Unsupported() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$Whiteboard;", "", "permissions", "Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;", "<init>", "(Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;)V", "getPermissions", "()Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Whiteboard {

        @SerializedName("permissions")
        private final WhiteboardPermissions permissions;

        public Whiteboard(WhiteboardPermissions whiteboardPermissions) {
            this.permissions = whiteboardPermissions;
        }

        public static /* synthetic */ Whiteboard copy$default(Whiteboard whiteboard, WhiteboardPermissions whiteboardPermissions, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                whiteboardPermissions = whiteboard.permissions;
            }
            return whiteboard.copy(whiteboardPermissions);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WhiteboardPermissions getPermissions() {
            return this.permissions;
        }

        public final Whiteboard copy(WhiteboardPermissions permissions) {
            return new Whiteboard(permissions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Whiteboard) && AbstractC22676k.m65745e(this.permissions, ((Whiteboard) other).permissions);
        }

        public final WhiteboardPermissions getPermissions() {
            return this.permissions;
        }

        public int hashCode() {
            WhiteboardPermissions whiteboardPermissions = this.permissions;
            if (whiteboardPermissions == null) {
                return 0;
            }
            return whiteboardPermissions.hashCode();
        }

        public String toString() {
            return "Whiteboard(permissions=" + this.permissions + ')';
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;", "Llive/hms/video/sdk/models/HMSNotifications;", "id", "", "title", "owner", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getOwner", "getState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class WhiteboardInfo extends HMSNotifications {

        @SerializedName("id")
        private final String id;

        @SerializedName("owner")
        private final String owner;

        @SerializedName("state")
        private final String state;

        @SerializedName("title")
        private final String title;

        public /* synthetic */ WhiteboardInfo(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4);
        }

        public static /* synthetic */ WhiteboardInfo copy$default(WhiteboardInfo whiteboardInfo, String str, String str2, String str3, String str4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = whiteboardInfo.id;
            }
            if ((i13 & 2) != 0) {
                str2 = whiteboardInfo.title;
            }
            if ((i13 & 4) != 0) {
                str3 = whiteboardInfo.owner;
            }
            if ((i13 & 8) != 0) {
                str4 = whiteboardInfo.state;
            }
            return whiteboardInfo.copy(str, str2, str3, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOwner() {
            return this.owner;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final WhiteboardInfo copy(String id4, String title, String owner, String state) {
            return new WhiteboardInfo(id4, title, owner, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WhiteboardInfo)) {
                return false;
            }
            WhiteboardInfo whiteboardInfo = (WhiteboardInfo) other;
            return AbstractC22676k.m65745e(this.id, whiteboardInfo.id) && AbstractC22676k.m65745e(this.title, whiteboardInfo.title) && AbstractC22676k.m65745e(this.owner, whiteboardInfo.owner) && AbstractC22676k.m65745e(this.state, whiteboardInfo.state);
        }

        public final String getId() {
            return this.id;
        }

        public final String getOwner() {
            return this.owner;
        }

        public final String getState() {
            return this.state;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.owner;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.state;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("WhiteboardInfo(id=");
            sb4.append(this.id);
            sb4.append(", title=");
            sb4.append(this.title);
            sb4.append(", owner=");
            sb4.append(this.owner);
            sb4.append(", state=");
            return AbstractC25012a.m73377j(sb4, this.state, ')');
        }

        public WhiteboardInfo(String str, String str2, String str3, String str4) {
            super(null);
            this.id = str;
            this.title = str2;
            this.owner = str3;
            this.state = str4;
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSNotifications$WhiteboardPermissions;", "", "admin", "", "", "reader", "writer", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAdmin", "()Ljava/util/List;", "getReader", "getWriter", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class WhiteboardPermissions {

        @SerializedName("admin")
        private final List<String> admin;

        @SerializedName("reader")
        private final List<String> reader;

        @SerializedName("writer")
        private final List<String> writer;

        public WhiteboardPermissions(List<String> list, List<String> list2, List<String> list3) {
            this.admin = list;
            this.reader = list2;
            this.writer = list3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WhiteboardPermissions copy$default(WhiteboardPermissions whiteboardPermissions, List list, List list2, List list3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = whiteboardPermissions.admin;
            }
            if ((i13 & 2) != 0) {
                list2 = whiteboardPermissions.reader;
            }
            if ((i13 & 4) != 0) {
                list3 = whiteboardPermissions.writer;
            }
            return whiteboardPermissions.copy(list, list2, list3);
        }

        public final List<String> component1() {
            return this.admin;
        }

        public final List<String> component2() {
            return this.reader;
        }

        public final List<String> component3() {
            return this.writer;
        }

        public final WhiteboardPermissions copy(List<String> admin, List<String> reader, List<String> writer) {
            return new WhiteboardPermissions(admin, reader, writer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WhiteboardPermissions)) {
                return false;
            }
            WhiteboardPermissions whiteboardPermissions = (WhiteboardPermissions) other;
            return AbstractC22676k.m65745e(this.admin, whiteboardPermissions.admin) && AbstractC22676k.m65745e(this.reader, whiteboardPermissions.reader) && AbstractC22676k.m65745e(this.writer, whiteboardPermissions.writer);
        }

        public final List<String> getAdmin() {
            return this.admin;
        }

        public final List<String> getReader() {
            return this.reader;
        }

        public final List<String> getWriter() {
            return this.writer;
        }

        public int hashCode() {
            List<String> list = this.admin;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.reader;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.writer;
            return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("WhiteboardPermissions(admin=");
            sb4.append(this.admin);
            sb4.append(", reader=");
            sb4.append(this.reader);
            sb4.append(", writer=");
            return AbstractC17176i.m48506h(sb4, this.writer, ')');
        }
    }

    public /* synthetic */ HMSNotifications(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HMSNotifications() {
    }
}
