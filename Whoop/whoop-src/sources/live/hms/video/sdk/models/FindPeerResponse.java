package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\fj\b\u0012\u0004\u0012\u00020\u000b`\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\fj\b\u0012\u0004\u0012\u00020\u000b`\nHÆ\u0003¢\u0006\u0002\u0010\u0017JP\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\fj\b\u0012\u0004\u0012\u00020\u000b`\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R(\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\fj\b\u0012\u0004\u0012\u00020\u000b`\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m65681d2 = {"Llive/hms/video/sdk/models/FindPeerResponse;", "", "iteratorId", "", MapboxMap.QFE_LIMIT, "", "total", "eof", "", "peers", "Lkotlin/collections/ArrayList;", "Llive/hms/video/sdk/models/HMSNotifications$Peer;", "Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;IIZLjava/util/ArrayList;)V", "getIteratorId", "()Ljava/lang/String;", "getLimit", "()I", "getTotal", "getEof", "()Z", "getPeers", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;IIZLjava/util/ArrayList;)Llive/hms/video/sdk/models/FindPeerResponse;", "equals", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class FindPeerResponse {

    @SerializedName("eof")
    private final boolean eof;

    @SerializedName("iterator")
    private final String iteratorId;

    @SerializedName(MapboxMap.QFE_LIMIT)
    private final int limit;

    @SerializedName("peers")
    private final ArrayList<HMSNotifications.Peer> peers;

    @SerializedName("total")
    private final int total;

    public FindPeerResponse(String iteratorId, int i13, int i14, boolean z4, ArrayList<HMSNotifications.Peer> peers) {
        AbstractC22676k.m65750j(iteratorId, "iteratorId");
        AbstractC22676k.m65750j(peers, "peers");
        this.iteratorId = iteratorId;
        this.limit = i13;
        this.total = i14;
        this.eof = z4;
        this.peers = peers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindPeerResponse copy$default(FindPeerResponse findPeerResponse, String str, int i13, int i14, boolean z4, ArrayList arrayList, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = findPeerResponse.iteratorId;
        }
        if ((i15 & 2) != 0) {
            i13 = findPeerResponse.limit;
        }
        if ((i15 & 4) != 0) {
            i14 = findPeerResponse.total;
        }
        if ((i15 & 8) != 0) {
            z4 = findPeerResponse.eof;
        }
        if ((i15 & 16) != 0) {
            arrayList = findPeerResponse.peers;
        }
        ArrayList arrayList2 = arrayList;
        int i16 = i14;
        return findPeerResponse.copy(str, i13, i16, z4, arrayList2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIteratorId() {
        return this.iteratorId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEof() {
        return this.eof;
    }

    public final ArrayList<HMSNotifications.Peer> component5() {
        return this.peers;
    }

    public final FindPeerResponse copy(String iteratorId, int limit, int total, boolean eof, ArrayList<HMSNotifications.Peer> peers) {
        AbstractC22676k.m65750j(iteratorId, "iteratorId");
        AbstractC22676k.m65750j(peers, "peers");
        return new FindPeerResponse(iteratorId, limit, total, eof, peers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FindPeerResponse)) {
            return false;
        }
        FindPeerResponse findPeerResponse = (FindPeerResponse) other;
        return AbstractC22676k.m65745e(this.iteratorId, findPeerResponse.iteratorId) && this.limit == findPeerResponse.limit && this.total == findPeerResponse.total && this.eof == findPeerResponse.eof && AbstractC22676k.m65745e(this.peers, findPeerResponse.peers);
    }

    public final boolean getEof() {
        return this.eof;
    }

    public final String getIteratorId() {
        return this.iteratorId;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final ArrayList<HMSNotifications.Peer> getPeers() {
        return this.peers;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return this.peers.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.total, AbstractC11266d.m30448b(this.limit, this.iteratorId.hashCode() * 31, 31), 31), 31, this.eof);
    }

    public String toString() {
        return "FindPeerResponse(iteratorId=" + this.iteratorId + ", limit=" + this.limit + ", total=" + this.total + ", eof=" + this.eof + ", peers=" + this.peers + ')';
    }
}
