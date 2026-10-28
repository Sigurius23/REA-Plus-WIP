package live.hms.video.sdk;

import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.PeerListIteratorOptions;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/IPeerListIterator;", "", "Llive/hms/video/sdk/models/PeerListIteratorOptions;", "peerListIteratorOptions", "Llive/hms/video/sdk/FindPeerListener;", "peerListResultListener", "Ll83/a0;", "findPeers", "(Llive/hms/video/sdk/models/PeerListIteratorOptions;Llive/hms/video/sdk/FindPeerListener;)V", "", "iteratorID", "", MapboxMap.QFE_LIMIT, "peerIteratorNext", "(Ljava/lang/String;ILlive/hms/video/sdk/FindPeerListener;)V", "", "Llive/hms/video/sdk/models/HMSNotifications$Peer;", "peers", "Ljava/util/ArrayList;", "Llive/hms/video/sdk/models/HMSPeer;", "Lkotlin/collections/ArrayList;", "convertToHMSPeer", "(Ljava/util/List;)Ljava/util/ArrayList;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface IPeerListIterator {
    ArrayList<HMSPeer> convertToHMSPeer(List<HMSNotifications.Peer> peers);

    void findPeers(PeerListIteratorOptions peerListIteratorOptions, FindPeerListener peerListResultListener);

    void peerIteratorNext(String iteratorID, int limit, FindPeerListener peerListResultListener);
}
