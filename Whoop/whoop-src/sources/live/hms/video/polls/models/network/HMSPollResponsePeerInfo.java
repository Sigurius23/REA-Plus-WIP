package live.hms.video.polls.models.network;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;", "", "hash", "", "peerid", "userid", "username", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHash", "()Ljava/lang/String;", "getPeerid", "getUserid", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSPollResponsePeerInfo {

    @SerializedName("hash")
    private final String hash;

    @SerializedName("peerid")
    private final String peerid;

    @SerializedName("userid")
    private final String userid;

    @SerializedName("username")
    private final String username;

    public HMSPollResponsePeerInfo(String hash, String str, String str2, String str3) {
        AbstractC22676k.m65750j(hash, "hash");
        this.hash = hash;
        this.peerid = str;
        this.userid = str2;
        this.username = str3;
    }

    public static /* synthetic */ HMSPollResponsePeerInfo copy$default(HMSPollResponsePeerInfo hMSPollResponsePeerInfo, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSPollResponsePeerInfo.hash;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSPollResponsePeerInfo.peerid;
        }
        if ((i13 & 4) != 0) {
            str3 = hMSPollResponsePeerInfo.userid;
        }
        if ((i13 & 8) != 0) {
            str4 = hMSPollResponsePeerInfo.username;
        }
        return hMSPollResponsePeerInfo.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPeerid() {
        return this.peerid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserid() {
        return this.userid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final HMSPollResponsePeerInfo copy(String hash, String peerid, String userid, String username) {
        AbstractC22676k.m65750j(hash, "hash");
        return new HMSPollResponsePeerInfo(hash, peerid, userid, username);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSPollResponsePeerInfo)) {
            return false;
        }
        HMSPollResponsePeerInfo hMSPollResponsePeerInfo = (HMSPollResponsePeerInfo) other;
        return AbstractC22676k.m65745e(this.hash, hMSPollResponsePeerInfo.hash) && AbstractC22676k.m65745e(this.peerid, hMSPollResponsePeerInfo.peerid) && AbstractC22676k.m65745e(this.userid, hMSPollResponsePeerInfo.userid) && AbstractC22676k.m65745e(this.username, hMSPollResponsePeerInfo.username);
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getPeerid() {
        return this.peerid;
    }

    public final String getUserid() {
        return this.userid;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = this.hash.hashCode() * 31;
        String str = this.peerid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userid;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.username;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSPollResponsePeerInfo(hash=");
        sb4.append(this.hash);
        sb4.append(", peerid=");
        sb4.append(this.peerid);
        sb4.append(", userid=");
        sb4.append(this.userid);
        sb4.append(", username=");
        return AbstractC25012a.m73377j(sb4, this.username, ')');
    }
}
