package live.hms.video.sdk.models;

import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import live.hms.video.sdk.SDKStore;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Llive/hms/video/sdk/models/PeerSearchResponse;", "", "Llive/hms/video/sdk/SDKStore;", "store", "", "Llive/hms/video/sdk/models/SearchPeerResponse;", "_peers", "", "eof", "", MapboxMap.QFE_OFFSET, "count", "", MapboxMap.QFE_LIMIT, "<init>", "(Llive/hms/video/sdk/SDKStore;Ljava/util/List;ZJJI)V", "sdkStore", "Llive/hms/video/sdk/models/PeerNameSearchResponse;", "peerNameSearchResponse", "(Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/models/PeerNameSearchResponse;)V", "Llive/hms/video/sdk/SDKStore;", "Ljava/util/List;", "Z", "getEof", "()Z", "J", "getOffset", "()J", "getCount", "I", "getLimit", "()I", "Llive/hms/video/sdk/models/HMSPeer;", "peers$delegate", "Ll83/h;", "getPeers", "()Ljava/util/List;", "peers", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PeerSearchResponse {
    private final List<SearchPeerResponse> _peers;
    private final long count;
    private final boolean eof;
    private final int limit;
    private final long offset;

    /* JADX INFO: renamed from: peers$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h peers;
    private final SDKStore store;

    public PeerSearchResponse(SDKStore store, List<SearchPeerResponse> _peers, boolean z4, long j7, long j13, int i13) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(_peers, "_peers");
        this.store = store;
        this._peers = _peers;
        this.eof = z4;
        this.offset = j7;
        this.count = j13;
        this.limit = i13;
        this.peers = AbstractC30060g.m92088H(new C24117a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List peers_delegate$lambda$1(PeerSearchResponse this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        List<SearchPeerResponse> list = this$0._peers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            HMSPeer peer = ((SearchPeerResponse) it.next()).toPeer(this$0.store);
            if (peer != null) {
                arrayList.add(peer);
            }
        }
        return arrayList;
    }

    public final long getCount() {
        return this.count;
    }

    public final boolean getEof() {
        return this.eof;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final List<HMSPeer> getPeers() {
        return (List) this.peers.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PeerSearchResponse(SDKStore sdkStore, PeerNameSearchResponse peerNameSearchResponse) {
        this(sdkStore, peerNameSearchResponse.getPeers(), peerNameSearchResponse.getEof(), peerNameSearchResponse.getOffset(), peerNameSearchResponse.getCount(), peerNameSearchResponse.getLimit());
        AbstractC22676k.m65750j(sdkStore, "sdkStore");
        AbstractC22676k.m65750j(peerNameSearchResponse, "peerNameSearchResponse");
    }
}
