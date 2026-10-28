package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.connection.stats.quality.HMSNetworkQuality;
import live.hms.video.diagnostics.ITransportListener;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;", "Llive/hms/video/sdk/SDKStore;", "store", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "params", "", "Llive/hms/video/sdk/models/SDKUpdate;", "manage", "(Llive/hms/video/sdk/models/HMSNotifications$PeerNetworkInfoList;)Ljava/util/List;", "Llive/hms/video/diagnostics/ITransportListener;", "listener", "Ll83/a0;", "setConnectivityCheckListener", "(Llive/hms/video/diagnostics/ITransportListener;)V", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "connectivityTestListener", "Llive/hms/video/diagnostics/ITransportListener;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OnPeerNetworkUpdateManager implements IManager<HMSNotifications.PeerNetworkInfoList> {
    private static final String TAG = "OnPeerNetworkUpdateManager";
    private ITransportListener connectivityTestListener;
    private final SDKStore store;

    public OnPeerNetworkUpdateManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    public final void setConnectivityCheckListener(ITransportListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.connectivityTestListener = listener;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.PeerNetworkInfoList params) {
        ITransportListener iTransportListener;
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        for (HMSNotifications.Peer peer : params.getPeerNetworkInfoList()) {
            HMSPeer peerById = getStore().getPeerById(peer.getPeerId());
            if (peerById != null) {
                String str = getStore().get_localPeerId();
                if (str != null && AbstractC22676k.m65745e(peerById.getPeerID(), str) && (iTransportListener = this.connectivityTestListener) != null) {
                    Integer downlinkScore = peer.getDownlinkScore();
                    iTransportListener.onNetworkQuality(downlinkScore != null ? downlinkScore.intValue() : -1);
                }
                Integer downlinkScore2 = peer.getDownlinkScore();
                if (downlinkScore2 != null) {
                    HMSNetworkQuality networkQuality = peerById.getNetworkQuality();
                    if (!downlinkScore2.equals(networkQuality != null ? Integer.valueOf(networkQuality.getDownlinkQuality()) : null)) {
                        Integer downlinkScore3 = peer.getDownlinkScore();
                        peerById.setNetworkQuality$lib_release(new HMSNetworkQuality(downlinkScore3 != null ? downlinkScore3.intValue() : -1));
                        arrayList.add(new SDKUpdate.Peer(HMSPeerUpdate.NETWORK_QUALITY_UPDATED, peerById));
                    }
                }
            }
        }
        return arrayList;
    }
}
