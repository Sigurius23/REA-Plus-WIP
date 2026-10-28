package live.hms.video.whiteboard.network;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;", "", "id", "", "owner", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getOwner", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSCreateWhiteBoardResponse {

    @SerializedName("id")
    private final String id;

    @SerializedName("owner")
    private final String owner;

    public HMSCreateWhiteBoardResponse(String str, String str2) {
        this.id = str;
        this.owner = str2;
    }

    public static /* synthetic */ HMSCreateWhiteBoardResponse copy$default(HMSCreateWhiteBoardResponse hMSCreateWhiteBoardResponse, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSCreateWhiteBoardResponse.id;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSCreateWhiteBoardResponse.owner;
        }
        return hMSCreateWhiteBoardResponse.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    public final HMSCreateWhiteBoardResponse copy(String id4, String owner) {
        return new HMSCreateWhiteBoardResponse(id4, owner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSCreateWhiteBoardResponse)) {
            return false;
        }
        HMSCreateWhiteBoardResponse hMSCreateWhiteBoardResponse = (HMSCreateWhiteBoardResponse) other;
        return AbstractC22676k.m65745e(this.id, hMSCreateWhiteBoardResponse.id) && AbstractC22676k.m65745e(this.owner, hMSCreateWhiteBoardResponse.owner);
    }

    public final String getId() {
        return this.id;
    }

    public final String getOwner() {
        return this.owner;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.owner;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSCreateWhiteBoardResponse(id=");
        sb4.append(this.id);
        sb4.append(", owner=");
        return AbstractC25012a.m73377j(sb4, this.owner, ')');
    }
}
