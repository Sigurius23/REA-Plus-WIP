package live.hms.video.sdk.models;

import com.mapbox.maps.MapboxMap;
import live.hms.video.error.HMSException;
import live.hms.video.sdk.FindPeerListener;
import live.hms.video.sdk.IPeerListIterator;
import live.hms.video.sdk.listeners.PeerListResultListener;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Llive/hms/video/sdk/models/PeerListIterator;", "", "Llive/hms/video/sdk/models/PeerListIteratorOptions;", "peerListIteratorOptions", "<init>", "(Llive/hms/video/sdk/models/PeerListIteratorOptions;)V", "", "hasNext", "()Z", "Llive/hms/video/sdk/listeners/PeerListResultListener;", "peerListResultListener", "Ll83/a0;", "next", "(Llive/hms/video/sdk/listeners/PeerListResultListener;)V", "Llive/hms/video/sdk/models/PeerListIteratorOptions;", "Llive/hms/video/sdk/IPeerListIterator;", "iteratorImpl", "Llive/hms/video/sdk/IPeerListIterator;", "getIteratorImpl$lib_release", "()Llive/hms/video/sdk/IPeerListIterator;", "setIteratorImpl$lib_release", "(Llive/hms/video/sdk/IPeerListIterator;)V", "", "iteratorId", "Ljava/lang/String;", "getIteratorId$lib_release", "()Ljava/lang/String;", "setIteratorId$lib_release", "(Ljava/lang/String;)V", "", MapboxMap.QFE_LIMIT, "I", "getLimit", "()I", "setLimit", "(I)V", "totalCount", "getTotalCount", "setTotalCount", "eof", "Z", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PeerListIterator {
    private boolean eof;
    private String iteratorId;
    private IPeerListIterator iteratorImpl;
    private int limit = 10;
    private final PeerListIteratorOptions peerListIteratorOptions;
    private int totalCount;

    public PeerListIterator(PeerListIteratorOptions peerListIteratorOptions) {
        this.peerListIteratorOptions = peerListIteratorOptions;
    }

    /* JADX INFO: renamed from: getIteratorId$lib_release, reason: from getter */
    public final String getIteratorId() {
        return this.iteratorId;
    }

    /* JADX INFO: renamed from: getIteratorImpl$lib_release, reason: from getter */
    public final IPeerListIterator getIteratorImpl() {
        return this.iteratorImpl;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final boolean hasNext() {
        return !this.eof;
    }

    public final void next(final PeerListResultListener peerListResultListener) {
        AbstractC22676k.m65750j(peerListResultListener, "peerListResultListener");
        final IPeerListIterator iPeerListIterator = this.iteratorImpl;
        if (iPeerListIterator != null) {
            String str = this.iteratorId;
            if (str == null) {
                iPeerListIterator.findPeers(this.peerListIteratorOptions, new FindPeerListener() { // from class: live.hms.video.sdk.models.PeerListIterator$next$1$1
                    @Override // live.hms.video.sdk.IErrorListener
                    public void onError(HMSException error) {
                        AbstractC22676k.m65750j(error, "error");
                        peerListResultListener.onError(error);
                    }

                    @Override // live.hms.video.sdk.FindPeerListener
                    public void onResult(FindPeerResponse result) {
                        AbstractC22676k.m65750j(result, "result");
                        this.this$0.setIteratorId$lib_release(result.getIteratorId());
                        this.this$0.eof = result.getEof();
                        this.this$0.setLimit(result.getLimit());
                        this.this$0.setTotalCount(result.getTotal());
                        peerListResultListener.onSuccess(iPeerListIterator.convertToHMSPeer(result.getPeers()));
                    }
                });
                return;
            }
            AbstractC22676k.m65747g(str);
            PeerListIteratorOptions peerListIteratorOptions = this.peerListIteratorOptions;
            iPeerListIterator.peerIteratorNext(str, peerListIteratorOptions != null ? peerListIteratorOptions.getLimit() : 10, new FindPeerListener() { // from class: live.hms.video.sdk.models.PeerListIterator$next$1$2
                @Override // live.hms.video.sdk.IErrorListener
                public void onError(HMSException error) {
                    AbstractC22676k.m65750j(error, "error");
                    peerListResultListener.onError(error);
                }

                @Override // live.hms.video.sdk.FindPeerListener
                public void onResult(FindPeerResponse result) {
                    AbstractC22676k.m65750j(result, "result");
                    this.this$0.eof = result.getEof();
                    this.this$0.setLimit(result.getLimit());
                    this.this$0.setTotalCount(result.getTotal());
                    peerListResultListener.onSuccess(iPeerListIterator.convertToHMSPeer(result.getPeers()));
                }
            });
        }
    }

    public final void setIteratorId$lib_release(String str) {
        this.iteratorId = str;
    }

    public final void setIteratorImpl$lib_release(IPeerListIterator iPeerListIterator) {
        this.iteratorImpl = iPeerListIterator;
    }

    public final void setLimit(int i13) {
        this.limit = i13;
    }

    public final void setTotalCount(int i13) {
        this.totalCount = i13;
    }
}
