package live.hms.video.sdk.managers;

import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import live.hms.video.media.tracks.HMSAudioTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSVideoTrack;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRemotePeer;
import live.hms.video.sdk.models.SDKUpdate;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/sdk/managers/ReconnectPeerListManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$PeerList;", "store", "Llive/hms/video/sdk/SDKStore;", "onTrackAddManager", "Llive/hms/video/sdk/managers/OnTrackAddManager;", "onTrackRemoveManager", "Llive/hms/video/sdk/managers/OnTrackRemoveManager;", "onPeerJoinManager", "Llive/hms/video/sdk/managers/OnPeerJoinManager;", "onPeerLeaveManager", "Llive/hms/video/sdk/managers/OnPeerLeaveManager;", "onTrackUpdateManager", "Llive/hms/video/sdk/managers/OnTrackUpdateManager;", "onPeerUpdateManager", "Llive/hms/video/sdk/managers/OnPeerUpdateManager;", "<init>", "(Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/managers/OnTrackAddManager;Llive/hms/video/sdk/managers/OnTrackRemoveManager;Llive/hms/video/sdk/managers/OnPeerJoinManager;Llive/hms/video/sdk/managers/OnPeerLeaveManager;Llive/hms/video/sdk/managers/OnTrackUpdateManager;Llive/hms/video/sdk/managers/OnPeerUpdateManager;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ReconnectPeerListManager implements IManager<HMSNotifications.PeerList> {
    private final OnPeerJoinManager onPeerJoinManager;
    private final OnPeerLeaveManager onPeerLeaveManager;
    private final OnPeerUpdateManager onPeerUpdateManager;
    private final OnTrackAddManager onTrackAddManager;
    private final OnTrackRemoveManager onTrackRemoveManager;
    private final OnTrackUpdateManager onTrackUpdateManager;
    private final SDKStore store;

    public ReconnectPeerListManager(SDKStore store, OnTrackAddManager onTrackAddManager, OnTrackRemoveManager onTrackRemoveManager, OnPeerJoinManager onPeerJoinManager, OnPeerLeaveManager onPeerLeaveManager, OnTrackUpdateManager onTrackUpdateManager, OnPeerUpdateManager onPeerUpdateManager) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(onTrackAddManager, "onTrackAddManager");
        AbstractC22676k.m65750j(onTrackRemoveManager, "onTrackRemoveManager");
        AbstractC22676k.m65750j(onPeerJoinManager, "onPeerJoinManager");
        AbstractC22676k.m65750j(onPeerLeaveManager, "onPeerLeaveManager");
        AbstractC22676k.m65750j(onTrackUpdateManager, "onTrackUpdateManager");
        AbstractC22676k.m65750j(onPeerUpdateManager, "onPeerUpdateManager");
        this.store = store;
        this.onTrackAddManager = onTrackAddManager;
        this.onTrackRemoveManager = onTrackRemoveManager;
        this.onPeerJoinManager = onPeerJoinManager;
        this.onPeerLeaveManager = onPeerLeaveManager;
        this.onTrackUpdateManager = onTrackUpdateManager;
        this.onPeerUpdateManager = onPeerUpdateManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean manage$lambda$0(HMSNotifications.PeerList params, HMSRemotePeer it) {
        AbstractC22676k.m65750j(params, "$params");
        AbstractC22676k.m65750j(it, "it");
        HashMap<String, HMSNotifications.Peer> peersMap = params.getPeersMap();
        return peersMap == null || !peersMap.containsKey(it.getPeerID());
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.PeerList params) {
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        for (HMSRemotePeer hMSRemotePeer : getStore().filterRemoterPeers(new C19962a(params, 4))) {
            arrayList.addAll(this.onPeerLeaveManager.manage(new HMSNotifications.PeerLeave(hMSRemotePeer.getPeerID(), hMSRemotePeer.getHmsRole().getName(), null, new HMSNotifications.PeerInfo(hMSRemotePeer.getName(), hMSRemotePeer.getMetadata(), "", hMSRemotePeer.getType()), 4, null)));
        }
        for (HMSNotifications.Peer peer : params.getPeers()) {
            HMSPeer peerById = getStore().getPeerById(peer.getPeerId());
            if (peerById != null) {
                ArrayList<HMSTrack> arrayList2 = new ArrayList(peerById.getAuxiliaryTracks());
                HMSAudioTrack audioTrack = peerById.getAudioTrack();
                if (audioTrack != null) {
                    arrayList2.add(audioTrack);
                }
                HMSVideoTrack videoTrack = peerById.getVideoTrack();
                if (videoTrack != null) {
                    arrayList2.add(videoTrack);
                }
                for (HMSTrack hMSTrack : arrayList2) {
                    if (!peer.containsTrack(hMSTrack.getTrackId())) {
                        arrayList.addAll(this.onTrackRemoveManager.manage(hMSTrack));
                    }
                }
                for (HMSNotifications.Track track : peer.getTracks()) {
                    if (peerById.getTrackById(track.getTrackId()) == null) {
                        AbstractC25265s.m74139o0(arrayList, OnTrackAddManager.manageMetadata$default(this.onTrackAddManager, track, peerById.getPeerID(), null, 4, null));
                    } else {
                        arrayList.addAll(OnTrackUpdateManager.manage$default(this.onTrackUpdateManager, track, peerById.getPeerID(), null, 4, null));
                    }
                }
                arrayList.addAll(this.onPeerUpdateManager.manage(peer));
            } else {
                arrayList.addAll(this.onPeerJoinManager.manage(peer.toPeerJoin()));
                for (HMSNotifications.Track track2 : peer.getTracks()) {
                    AbstractC25265s.m74139o0(arrayList, OnTrackAddManager.manageMetadata$default(this.onTrackAddManager, track2, peer.getPeerId(), null, 4, null));
                }
            }
        }
        Integer peerCount = params.getPeerCount();
        if (peerCount != null) {
            arrayList.add(PeerCountUpdateUseCaseKt.setPeerCount(peerCount.intValue(), getStore()));
        }
        arrayList.addAll(new UseCaseUpdateHmsRoom().updateHmsRoom(params.getRoom(), getStore()));
        return arrayList;
    }
}
