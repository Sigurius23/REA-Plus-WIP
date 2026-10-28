package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.role.HMSRole;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/sdk/models/SearchPeerResponse;", "", "peerId", "", "role", "name", "type", "Llive/hms/video/sdk/models/HMSPeerType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V", "getPeerId", "()Ljava/lang/String;", "getRole", "getName", "getType", "()Llive/hms/video/sdk/models/HMSPeerType;", "toPeer", "Llive/hms/video/sdk/models/HMSPeer;", "store", "Llive/hms/video/sdk/SDKStore;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class SearchPeerResponse {

    @SerializedName("name")
    private final String name;

    @SerializedName("peer_id")
    private final String peerId;

    @SerializedName("role")
    private final String role;

    @SerializedName("type")
    private final HMSPeerType type;

    public SearchPeerResponse(String str, String role, String name, HMSPeerType hMSPeerType) {
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(name, "name");
        this.peerId = str;
        this.role = role;
        this.name = name;
        this.type = hMSPeerType;
    }

    public static /* synthetic */ SearchPeerResponse copy$default(SearchPeerResponse searchPeerResponse, String str, String str2, String str3, HMSPeerType hMSPeerType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = searchPeerResponse.peerId;
        }
        if ((i13 & 2) != 0) {
            str2 = searchPeerResponse.role;
        }
        if ((i13 & 4) != 0) {
            str3 = searchPeerResponse.name;
        }
        if ((i13 & 8) != 0) {
            hMSPeerType = searchPeerResponse.type;
        }
        return searchPeerResponse.copy(str, str2, str3, hMSPeerType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPeerId() {
        return this.peerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HMSPeerType getType() {
        return this.type;
    }

    public final SearchPeerResponse copy(String peerId, String role, String name, HMSPeerType type) {
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(name, "name");
        return new SearchPeerResponse(peerId, role, name, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchPeerResponse)) {
            return false;
        }
        SearchPeerResponse searchPeerResponse = (SearchPeerResponse) other;
        return AbstractC22676k.m65745e(this.peerId, searchPeerResponse.peerId) && AbstractC22676k.m65745e(this.role, searchPeerResponse.role) && AbstractC22676k.m65745e(this.name, searchPeerResponse.name) && this.type == searchPeerResponse.type;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final String getRole() {
        return this.role;
    }

    public final HMSPeerType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.peerId;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.role), 31, this.name);
        HMSPeerType hMSPeerType = this.type;
        return iM30450d + (hMSPeerType != null ? hMSPeerType.hashCode() : 0);
    }

    public final HMSPeer toPeer(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        if (this.peerId == null) {
            return null;
        }
        boolean zM65745e = AbstractC22676k.m65745e(this.peerId, store.getLocalPeerId());
        HMSRole hMSRole = store.getRolesMap().get(this.role);
        if (zM65745e) {
            return store.getLocalPeer();
        }
        if (hMSRole == null) {
            return null;
        }
        String str = this.peerId;
        String str2 = this.name;
        HMSPeerType hMSPeerType = this.type;
        if (hMSPeerType == null) {
            hMSPeerType = HMSPeerType.REGULAR;
        }
        return new HMSRemotePeer(str, null, str2, hMSRole, 0L, null, hMSPeerType, 32, null);
    }

    public String toString() {
        return "SearchPeerResponse(peerId=" + this.peerId + ", role=" + this.role + ", name=" + this.name + ", type=" + this.type + ')';
    }
}
