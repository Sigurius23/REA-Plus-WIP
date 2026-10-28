package live.hms.video.sdk;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.error.HMSException;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.models.HMSMessage;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRemovedFromRoom;
import live.hms.video.sdk.models.HMSRoleChangeRequest;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.sdk.models.trackchangerequest.HMSChangeTrackStateRequest;
import live.hms.video.sdk.transcripts.HmsTranscripts;
import live.hms.video.sessionstore.HmsSessionStore;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H&¢\u0006\u0004\b+\u0010,JG\u00101\u001a\u00020\u00052\u001a\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010-j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`.2\u001a\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010-j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`.H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:¨\u0006;"}, m65681d2 = {"Llive/hms/video/sdk/HMSUpdateListener;", "Llive/hms/video/sdk/IErrorListener;", "Llive/hms/video/sdk/RequestPermissionInterface;", "Llive/hms/video/sdk/models/HMSRoom;", "room", "Ll83/a0;", "onJoin", "(Llive/hms/video/sdk/models/HMSRoom;)V", "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;", "type", "hmsRoom", "onRoomUpdate", "(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V", "Llive/hms/video/sdk/models/enums/HMSPeerUpdate;", "Llive/hms/video/sdk/models/HMSPeer;", "peer", "onPeerUpdate", "(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V", "Llive/hms/video/sdk/models/enums/HMSTrackUpdate;", "Llive/hms/video/media/tracks/HMSTrack;", "track", "onTrackUpdate", "(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V", "Llive/hms/video/sdk/models/HMSRoleChangeRequest;", "request", "onRoleChangeRequest", "(Llive/hms/video/sdk/models/HMSRoleChangeRequest;)V", "Llive/hms/video/sdk/models/HMSMessage;", "message", "onMessageReceived", "(Llive/hms/video/sdk/models/HMSMessage;)V", "Llive/hms/video/error/HMSException;", "error", "onReconnecting", "(Llive/hms/video/error/HMSException;)V", "onReconnected", "()V", "Llive/hms/video/sdk/models/HMSRemovedFromRoom;", "notification", "onRemovedFromRoom", "(Llive/hms/video/sdk/models/HMSRemovedFromRoom;)V", "Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;", "details", "onChangeTrackStateRequest", "(Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addedPeers", "removedPeers", "peerListUpdated", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "Llive/hms/video/sessionstore/HmsSessionStore;", "sessionStore", "onSessionStoreAvailable", "(Llive/hms/video/sessionstore/HmsSessionStore;)V", "Llive/hms/video/sdk/transcripts/HmsTranscripts;", "transcripts", "onTranscripts", "(Llive/hms/video/sdk/transcripts/HmsTranscripts;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSUpdateListener extends IErrorListener, RequestPermissionInterface {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void onPermissionsRequested(HMSUpdateListener hMSUpdateListener, List<String> permissions) {
            AbstractC22676k.m65750j(permissions, "permissions");
            RequestPermissionInterface.DefaultImpls.onPermissionsRequested(hMSUpdateListener, permissions);
        }

        public static void onReconnected(HMSUpdateListener hMSUpdateListener) {
        }

        public static void onReconnecting(HMSUpdateListener hMSUpdateListener, HMSException error) {
            AbstractC22676k.m65750j(error, "error");
        }

        public static void onRemovedFromRoom(HMSUpdateListener hMSUpdateListener, HMSRemovedFromRoom notification) {
            AbstractC22676k.m65750j(notification, "notification");
        }

        public static void onSessionStoreAvailable(HMSUpdateListener hMSUpdateListener, HmsSessionStore sessionStore) {
            AbstractC22676k.m65750j(sessionStore, "sessionStore");
        }

        public static void onTranscripts(HMSUpdateListener hMSUpdateListener, HmsTranscripts transcripts) {
            AbstractC22676k.m65750j(transcripts, "transcripts");
        }

        public static void peerListUpdated(HMSUpdateListener hMSUpdateListener, ArrayList<HMSPeer> arrayList, ArrayList<HMSPeer> arrayList2) {
        }
    }

    void onChangeTrackStateRequest(HMSChangeTrackStateRequest details);

    void onJoin(HMSRoom room);

    void onMessageReceived(HMSMessage message);

    void onPeerUpdate(HMSPeerUpdate type, HMSPeer peer);

    void onReconnected();

    void onReconnecting(HMSException error);

    void onRemovedFromRoom(HMSRemovedFromRoom notification);

    void onRoleChangeRequest(HMSRoleChangeRequest request);

    void onRoomUpdate(HMSRoomUpdate type, HMSRoom hmsRoom);

    void onSessionStoreAvailable(HmsSessionStore sessionStore);

    void onTrackUpdate(HMSTrackUpdate type, HMSTrack track, HMSPeer peer);

    void onTranscripts(HmsTranscripts transcripts);

    void peerListUpdated(ArrayList<HMSPeer> addedPeers, ArrayList<HMSPeer> removedPeers);
}
