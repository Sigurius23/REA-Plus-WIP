package live.hms.video.sdk.models;

import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\"\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JN\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR'\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/sdk/models/PeerListIteratorOptions;", "", "byGroupName", "", "byRoleName", "byPeerIds", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", MapboxMap.QFE_LIMIT, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V", "getByGroupName", "()Ljava/lang/String;", "getByRoleName", "getByPeerIds", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getLimit", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)Llive/hms/video/sdk/models/PeerListIteratorOptions;", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PeerListIteratorOptions {
    private final String byGroupName;
    private final ArrayList<String> byPeerIds;
    private final String byRoleName;
    private final int limit;

    public PeerListIteratorOptions() {
        this(null, null, null, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PeerListIteratorOptions copy$default(PeerListIteratorOptions peerListIteratorOptions, String str, String str2, ArrayList arrayList, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = peerListIteratorOptions.byGroupName;
        }
        if ((i14 & 2) != 0) {
            str2 = peerListIteratorOptions.byRoleName;
        }
        if ((i14 & 4) != 0) {
            arrayList = peerListIteratorOptions.byPeerIds;
        }
        if ((i14 & 8) != 0) {
            i13 = peerListIteratorOptions.limit;
        }
        return peerListIteratorOptions.copy(str, str2, arrayList, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getByGroupName() {
        return this.byGroupName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getByRoleName() {
        return this.byRoleName;
    }

    public final ArrayList<String> component3() {
        return this.byPeerIds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final PeerListIteratorOptions copy(String byGroupName, String byRoleName, ArrayList<String> byPeerIds, int limit) {
        return new PeerListIteratorOptions(byGroupName, byRoleName, byPeerIds, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeerListIteratorOptions)) {
            return false;
        }
        PeerListIteratorOptions peerListIteratorOptions = (PeerListIteratorOptions) other;
        return AbstractC22676k.m65745e(this.byGroupName, peerListIteratorOptions.byGroupName) && AbstractC22676k.m65745e(this.byRoleName, peerListIteratorOptions.byRoleName) && AbstractC22676k.m65745e(this.byPeerIds, peerListIteratorOptions.byPeerIds) && this.limit == peerListIteratorOptions.limit;
    }

    public final String getByGroupName() {
        return this.byGroupName;
    }

    public final ArrayList<String> getByPeerIds() {
        return this.byPeerIds;
    }

    public final String getByRoleName() {
        return this.byRoleName;
    }

    public final int getLimit() {
        return this.limit;
    }

    public int hashCode() {
        String str = this.byGroupName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.byRoleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<String> arrayList = this.byPeerIds;
        return Integer.hashCode(this.limit) + ((iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PeerListIteratorOptions(byGroupName=");
        sb4.append(this.byGroupName);
        sb4.append(", byRoleName=");
        sb4.append(this.byRoleName);
        sb4.append(", byPeerIds=");
        sb4.append(this.byPeerIds);
        sb4.append(", limit=");
        return AbstractC11895b.m31999r(sb4, this.limit, ')');
    }

    public PeerListIteratorOptions(String str, String str2, ArrayList<String> arrayList, int i13) {
        this.byGroupName = str;
        this.byRoleName = str2;
        this.byPeerIds = arrayList;
        this.limit = i13;
    }

    public /* synthetic */ PeerListIteratorOptions(String str, String str2, ArrayList arrayList, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : arrayList, (i14 & 8) != 0 ? 10 : i13);
    }
}
