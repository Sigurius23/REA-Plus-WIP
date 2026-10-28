package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRemotePeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m65681d2 = {"Llive/hms/video/sdk/managers/OnPeerLeaveManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;", "store", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "removeFromStoreAndSendUpdates", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OnPeerLeaveManager implements IManager<HMSNotifications.PeerLeave> {
    private static final String TAG = "OnPeerLeaveManager";
    private final SDKStore store;

    public OnPeerLeaveManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    public final List<SDKUpdate> removeFromStoreAndSendUpdates(HMSNotifications.PeerLeave params) {
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        HMSPeer peerById = getStore().getPeerById(params.getPeerId());
        if (peerById == null) {
            HMSLogger.m71137e(TAG, "Received " + params + " for non-existent peer, store=" + getStore());
            return arrayList;
        }
        HMSRemotePeer hMSRemotePeer = (HMSRemotePeer) peerById;
        HMSRemoteAudioTrack audioTrack = hMSRemotePeer.getAudioTrack();
        if (audioTrack != null) {
            arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, audioTrack, peerById));
            getStore().remove(audioTrack);
        }
        HMSRemoteVideoTrack videoTrack = hMSRemotePeer.getVideoTrack();
        if (videoTrack != null) {
            arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, videoTrack, peerById));
            getStore().remove(videoTrack);
        }
        for (HMSTrack hMSTrack : peerById.getAuxiliaryTracks()) {
            arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, hMSTrack, peerById));
            getStore().remove(hMSTrack);
        }
        hMSRemotePeer.setAudioTrack$lib_release(null);
        hMSRemotePeer.setVideoTrack$lib_release(null);
        peerById.getAuxiliaryTracks().clear();
        arrayList.add(new SDKUpdate.PeerListUpdate(null, AbstractC37056f.m118980f(peerById)));
        getStore().remove(peerById);
        return arrayList;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.PeerLeave params) {
        AbstractC22676k.m65750j(params, "params");
        HMSPeer peerById = getStore().getPeerById(params.getPeerId());
        List<SDKUpdate> listRemoveFromStoreAndSendUpdates = removeFromStoreAndSendUpdates(params);
        AbstractC22676k.m65748h(listRemoveFromStoreAndSendUpdates, "null cannot be cast to non-null type java.util.ArrayList<live.hms.video.sdk.models.SDKUpdate>");
        ArrayList arrayList = (ArrayList) listRemoveFromStoreAndSendUpdates;
        if (peerById != null) {
            arrayList.add(PeerCountUpdateUseCaseKt.updatePeerCount(false, getStore()));
            arrayList.add(new SDKUpdate.Peer(HMSPeerUpdate.PEER_LEFT, peerById));
        }
        return arrayList;
    }
}
