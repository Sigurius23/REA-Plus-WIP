package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.MapboxMap;
import hc3.AbstractC17176i;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m65681d2 = {"Llive/hms/video/sdk/models/PeerNameSearchResponse;", "", "count", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "", "eof", "", "peers", "", "Llive/hms/video/sdk/models/SearchPeerResponse;", "<init>", "(JJIZLjava/util/List;)V", "getCount", "()J", "getOffset", "getLimit", "()I", "getEof", "()Z", "getPeers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PeerNameSearchResponse {

    @SerializedName("count")
    private final long count;

    @SerializedName("eof")
    private final boolean eof;

    @SerializedName(MapboxMap.QFE_LIMIT)
    private final int limit;

    @SerializedName(MapboxMap.QFE_OFFSET)
    private final long offset;

    @SerializedName("peers")
    private final List<SearchPeerResponse> peers;

    public PeerNameSearchResponse(long j7, long j13, int i13, boolean z4, List<SearchPeerResponse> peers) {
        AbstractC22676k.m65750j(peers, "peers");
        this.count = j7;
        this.offset = j13;
        this.limit = i13;
        this.eof = z4;
        this.peers = peers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PeerNameSearchResponse copy$default(PeerNameSearchResponse peerNameSearchResponse, long j7, long j13, int i13, boolean z4, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j7 = peerNameSearchResponse.count;
        }
        long j14 = j7;
        if ((i14 & 2) != 0) {
            j13 = peerNameSearchResponse.offset;
        }
        long j15 = j13;
        if ((i14 & 4) != 0) {
            i13 = peerNameSearchResponse.limit;
        }
        int i15 = i13;
        if ((i14 & 8) != 0) {
            z4 = peerNameSearchResponse.eof;
        }
        boolean z13 = z4;
        if ((i14 & 16) != 0) {
            list = peerNameSearchResponse.peers;
        }
        return peerNameSearchResponse.copy(j14, j15, i15, z13, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEof() {
        return this.eof;
    }

    public final List<SearchPeerResponse> component5() {
        return this.peers;
    }

    public final PeerNameSearchResponse copy(long count, long offset, int limit, boolean eof, List<SearchPeerResponse> peers) {
        AbstractC22676k.m65750j(peers, "peers");
        return new PeerNameSearchResponse(count, offset, limit, eof, peers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeerNameSearchResponse)) {
            return false;
        }
        PeerNameSearchResponse peerNameSearchResponse = (PeerNameSearchResponse) other;
        return this.count == peerNameSearchResponse.count && this.offset == peerNameSearchResponse.offset && this.limit == peerNameSearchResponse.limit && this.eof == peerNameSearchResponse.eof && AbstractC22676k.m65745e(this.peers, peerNameSearchResponse.peers);
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

    public final List<SearchPeerResponse> getPeers() {
        return this.peers;
    }

    public int hashCode() {
        return this.peers.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30451e(Long.hashCode(this.count) * 31, this.offset, 31), 31), 31, this.eof);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PeerNameSearchResponse(count=");
        sb4.append(this.count);
        sb4.append(", offset=");
        sb4.append(this.offset);
        sb4.append(", limit=");
        sb4.append(this.limit);
        sb4.append(", eof=");
        sb4.append(this.eof);
        sb4.append(", peers=");
        return AbstractC17176i.m48506h(sb4, this.peers, ')');
    }
}
