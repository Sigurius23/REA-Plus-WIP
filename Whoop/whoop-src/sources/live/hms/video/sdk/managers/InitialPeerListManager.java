package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/sdk/managers/InitialPeerListManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$PeerList;", "store", "Llive/hms/video/sdk/SDKStore;", "onTrackAddManager", "Llive/hms/video/sdk/managers/OnTrackAddManager;", "onPeerJoinManager", "Llive/hms/video/sdk/managers/OnPeerJoinManager;", "<init>", "(Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/managers/OnTrackAddManager;Llive/hms/video/sdk/managers/OnPeerJoinManager;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class InitialPeerListManager implements IManager<HMSNotifications.PeerList> {
    private final String TAG;
    private final OnPeerJoinManager onPeerJoinManager;
    private final OnTrackAddManager onTrackAddManager;
    private final SDKStore store;

    public InitialPeerListManager(SDKStore store, OnTrackAddManager onTrackAddManager, OnPeerJoinManager onPeerJoinManager) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(onTrackAddManager, "onTrackAddManager");
        AbstractC22676k.m65750j(onPeerJoinManager, "onPeerJoinManager");
        this.store = store;
        this.onTrackAddManager = onTrackAddManager;
        this.onPeerJoinManager = onPeerJoinManager;
        this.TAG = "InitialPeerListManager";
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.PeerList params) {
        AbstractC22676k.m65750j(params, "params");
        HashSet hashSet = new HashSet();
        String TAG = this.TAG;
        AbstractC22676k.m65749i(TAG, "TAG");
        StringBuilder sb4 = new StringBuilder("session id : ");
        HMSNotifications.InitialRoom room = params.getRoom();
        sb4.append(room != null ? room.getSessionId() : null);
        HMSLogger.m71136d(TAG, sb4.toString());
        String TAG2 = this.TAG;
        AbstractC22676k.m65749i(TAG2, "TAG");
        StringBuilder sb5 = new StringBuilder("room id : ");
        HMSNotifications.InitialRoom room2 = params.getRoom();
        sb5.append(room2 != null ? room2.getRoomId() : null);
        HMSLogger.m71136d(TAG2, sb5.toString());
        HMSRoom hMSRoom = getStore().get_room();
        if (hMSRoom != null) {
            hMSRoom.setPeerCount$lib_release(0);
        }
        hashSet.addAll(new UseCaseUpdateHmsRoom().updateHmsRoom(params.getRoom(), getStore()));
        ArrayList arrayList = new ArrayList();
        for (HMSNotifications.Peer peer : params.getPeers()) {
            arrayList.add(getStore().add(peer.toPeerJoin()));
            for (HMSNotifications.Track track : peer.getTracks()) {
                AbstractC25265s.m74139o0(hashSet, OnTrackAddManager.manageMetadata$default(this.onTrackAddManager, track, peer.getPeerId(), null, 4, null));
            }
        }
        HMSLocalPeer localPeer = getStore().getLocalPeer();
        if (localPeer != null) {
            arrayList.add(localPeer);
        }
        hashSet.add(new SDKUpdate.PeerListUpdate(arrayList, null));
        hashSet.add(PeerCountUpdateUseCaseKt.updatePeerCount(true, getStore()));
        return AbstractC25265s.m74093D1(hashSet);
    }
}
