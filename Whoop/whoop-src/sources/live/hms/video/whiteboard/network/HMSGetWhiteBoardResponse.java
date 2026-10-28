package live.hms.video.whiteboard.network;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JK\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;", "", "id", "", "addr", "token", "owner", "permissions", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getAddr", "getToken", "getOwner", "getPermissions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSGetWhiteBoardResponse {

    @SerializedName("addr")
    private final String addr;

    @SerializedName("id")
    private final String id;

    @SerializedName("owner")
    private final String owner;

    @SerializedName("permissions")
    private final List<String> permissions;

    @SerializedName("token")
    private final String token;

    public HMSGetWhiteBoardResponse(String str, String str2, String str3, String str4, List<String> list) {
        this.id = str;
        this.addr = str2;
        this.token = str3;
        this.owner = str4;
        this.permissions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMSGetWhiteBoardResponse copy$default(HMSGetWhiteBoardResponse hMSGetWhiteBoardResponse, String str, String str2, String str3, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSGetWhiteBoardResponse.id;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSGetWhiteBoardResponse.addr;
        }
        if ((i13 & 4) != 0) {
            str3 = hMSGetWhiteBoardResponse.token;
        }
        if ((i13 & 8) != 0) {
            str4 = hMSGetWhiteBoardResponse.owner;
        }
        if ((i13 & 16) != 0) {
            list = hMSGetWhiteBoardResponse.permissions;
        }
        List list2 = list;
        String str5 = str3;
        return hMSGetWhiteBoardResponse.copy(str, str2, str5, str4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddr() {
        return this.addr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    public final List<String> component5() {
        return this.permissions;
    }

    public final HMSGetWhiteBoardResponse copy(String id4, String addr, String token, String owner, List<String> permissions) {
        return new HMSGetWhiteBoardResponse(id4, addr, token, owner, permissions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSGetWhiteBoardResponse)) {
            return false;
        }
        HMSGetWhiteBoardResponse hMSGetWhiteBoardResponse = (HMSGetWhiteBoardResponse) other;
        return AbstractC22676k.m65745e(this.id, hMSGetWhiteBoardResponse.id) && AbstractC22676k.m65745e(this.addr, hMSGetWhiteBoardResponse.addr) && AbstractC22676k.m65745e(this.token, hMSGetWhiteBoardResponse.token) && AbstractC22676k.m65745e(this.owner, hMSGetWhiteBoardResponse.owner) && AbstractC22676k.m65745e(this.permissions, hMSGetWhiteBoardResponse.permissions);
    }

    public final String getAddr() {
        return this.addr;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final List<String> getPermissions() {
        return this.permissions;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.owner;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.permissions;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSGetWhiteBoardResponse(id=");
        sb4.append(this.id);
        sb4.append(", addr=");
        sb4.append(this.addr);
        sb4.append(", token=");
        sb4.append(this.token);
        sb4.append(", owner=");
        sb4.append(this.owner);
        sb4.append(", permissions=");
        return AbstractC17176i.m48506h(sb4, this.permissions, ')');
    }
}
