package live.hms.video.sdk;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u0019\u001a\u00020\b2\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00162\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/sdk/HMSPreviewListener;", "Llive/hms/video/sdk/IErrorListener;", "Llive/hms/video/sdk/RequestPermissionInterface;", "Llive/hms/video/sdk/models/HMSRoom;", "room", "", "Llive/hms/video/media/tracks/HMSTrack;", "localTracks", "Ll83/a0;", "onPreview", "(Llive/hms/video/sdk/models/HMSRoom;[Llive/hms/video/media/tracks/HMSTrack;)V", "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;", "type", "hmsRoom", "onRoomUpdate", "(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V", "Llive/hms/video/sdk/models/enums/HMSPeerUpdate;", "Llive/hms/video/sdk/models/HMSPeer;", "peer", "onPeerUpdate", "(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addedPeers", "removedPeers", "peerListUpdated", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSPreviewListener extends IErrorListener, RequestPermissionInterface {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void onPermissionsRequested(HMSPreviewListener hMSPreviewListener, List<String> permissions) {
            AbstractC22676k.m65750j(permissions, "permissions");
            RequestPermissionInterface.DefaultImpls.onPermissionsRequested(hMSPreviewListener, permissions);
        }

        public static void peerListUpdated(HMSPreviewListener hMSPreviewListener, ArrayList<HMSPeer> arrayList, ArrayList<HMSPeer> arrayList2) {
        }
    }

    void onPeerUpdate(HMSPeerUpdate type, HMSPeer peer);

    void onPreview(HMSRoom room, HMSTrack[] localTracks);

    void onRoomUpdate(HMSRoomUpdate type, HMSRoom hmsRoom);

    void peerListUpdated(ArrayList<HMSPeer> addedPeers, ArrayList<HMSPeer> removedPeers);
}
