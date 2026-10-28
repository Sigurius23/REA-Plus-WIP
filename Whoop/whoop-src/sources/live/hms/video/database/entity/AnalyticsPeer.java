package live.hms.video.database.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013¨\u0006;"}, m65681d2 = {"Llive/hms/video/database/entity/AnalyticsPeer;", "", "peerId", "", "role", "joinedAt", "", "leftAt", "roomName", "sessionStartedAt", "userData", "userName", "templateId", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPeerId", "()Ljava/lang/String;", "setPeerId", "(Ljava/lang/String;)V", "getRole", "setRole", "getJoinedAt", "()Ljava/lang/Long;", "setJoinedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLeftAt", "setLeftAt", "getRoomName", "setRoomName", "getSessionStartedAt", "setSessionStartedAt", "getUserData", "setUserData", "getUserName", "setUserName", "getTemplateId", "setTemplateId", "getSessionId", "setSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Llive/hms/video/database/entity/AnalyticsPeer;", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AnalyticsPeer {

    @SerializedName("joined_at")
    private Long joinedAt;

    @SerializedName("left_at")
    private Long leftAt;

    @SerializedName("peer_id")
    private String peerId;

    @SerializedName("role")
    private String role;

    @SerializedName("room_name")
    private String roomName;

    @SerializedName("session_id")
    private String sessionId;

    @SerializedName("session_started_at")
    private Long sessionStartedAt;

    @SerializedName("template_id")
    private String templateId;

    @SerializedName("user_data")
    private String userData;

    @SerializedName("user_name")
    private String userName;

    public AnalyticsPeer() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ AnalyticsPeer copy$default(AnalyticsPeer analyticsPeer, String str, String str2, Long l7, Long l12, String str3, Long l13, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = analyticsPeer.peerId;
        }
        if ((i13 & 2) != 0) {
            str2 = analyticsPeer.role;
        }
        if ((i13 & 4) != 0) {
            l7 = analyticsPeer.joinedAt;
        }
        if ((i13 & 8) != 0) {
            l12 = analyticsPeer.leftAt;
        }
        if ((i13 & 16) != 0) {
            str3 = analyticsPeer.roomName;
        }
        if ((i13 & 32) != 0) {
            l13 = analyticsPeer.sessionStartedAt;
        }
        if ((i13 & 64) != 0) {
            str4 = analyticsPeer.userData;
        }
        if ((i13 & 128) != 0) {
            str5 = analyticsPeer.userName;
        }
        if ((i13 & 256) != 0) {
            str6 = analyticsPeer.templateId;
        }
        if ((i13 & 512) != 0) {
            str7 = analyticsPeer.sessionId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        Long l14 = l13;
        return analyticsPeer.copy(str, str2, l7, l12, str12, l14, str10, str11, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPeerId() {
        return this.peerId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getJoinedAt() {
        return this.joinedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getLeftAt() {
        return this.leftAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getSessionStartedAt() {
        return this.sessionStartedAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserData() {
        return this.userData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    public final AnalyticsPeer copy(String peerId, String role, Long joinedAt, Long leftAt, String roomName, Long sessionStartedAt, String userData, String userName, String templateId, String sessionId) {
        return new AnalyticsPeer(peerId, role, joinedAt, leftAt, roomName, sessionStartedAt, userData, userName, templateId, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPeer)) {
            return false;
        }
        AnalyticsPeer analyticsPeer = (AnalyticsPeer) other;
        return AbstractC22676k.m65745e(this.peerId, analyticsPeer.peerId) && AbstractC22676k.m65745e(this.role, analyticsPeer.role) && AbstractC22676k.m65745e(this.joinedAt, analyticsPeer.joinedAt) && AbstractC22676k.m65745e(this.leftAt, analyticsPeer.leftAt) && AbstractC22676k.m65745e(this.roomName, analyticsPeer.roomName) && AbstractC22676k.m65745e(this.sessionStartedAt, analyticsPeer.sessionStartedAt) && AbstractC22676k.m65745e(this.userData, analyticsPeer.userData) && AbstractC22676k.m65745e(this.userName, analyticsPeer.userName) && AbstractC22676k.m65745e(this.templateId, analyticsPeer.templateId) && AbstractC22676k.m65745e(this.sessionId, analyticsPeer.sessionId);
    }

    public final Long getJoinedAt() {
        return this.joinedAt;
    }

    public final Long getLeftAt() {
        return this.leftAt;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Long getSessionStartedAt() {
        return this.sessionStartedAt;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getUserData() {
        return this.userData;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        String str = this.peerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.role;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l7 = this.joinedAt;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.leftAt;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.roomName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l13 = this.sessionStartedAt;
        int iHashCode6 = (iHashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str4 = this.userData;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userName;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.templateId;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sessionId;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setJoinedAt(Long l7) {
        this.joinedAt = l7;
    }

    public final void setLeftAt(Long l7) {
        this.leftAt = l7;
    }

    public final void setPeerId(String str) {
        this.peerId = str;
    }

    public final void setRole(String str) {
        this.role = str;
    }

    public final void setRoomName(String str) {
        this.roomName = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setSessionStartedAt(Long l7) {
        this.sessionStartedAt = l7;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setUserData(String str) {
        this.userData = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("AnalyticsPeer(peerId=");
        sb4.append(this.peerId);
        sb4.append(", role=");
        sb4.append(this.role);
        sb4.append(", joinedAt=");
        sb4.append(this.joinedAt);
        sb4.append(", leftAt=");
        sb4.append(this.leftAt);
        sb4.append(", roomName=");
        sb4.append(this.roomName);
        sb4.append(", sessionStartedAt=");
        sb4.append(this.sessionStartedAt);
        sb4.append(", userData=");
        sb4.append(this.userData);
        sb4.append(", userName=");
        sb4.append(this.userName);
        sb4.append(", templateId=");
        sb4.append(this.templateId);
        sb4.append(", sessionId=");
        return AbstractC25012a.m73377j(sb4, this.sessionId, ')');
    }

    public AnalyticsPeer(String str, String str2, Long l7, Long l12, String str3, Long l13, String str4, String str5, String str6, String str7) {
        this.peerId = str;
        this.role = str2;
        this.joinedAt = l7;
        this.leftAt = l12;
        this.roomName = str3;
        this.sessionStartedAt = l13;
        this.userData = str4;
        this.userName = str5;
        this.templateId = str6;
        this.sessionId = str7;
    }

    public /* synthetic */ AnalyticsPeer(String str, String str2, Long l7, Long l12, String str3, Long l13, String str4, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : l7, (i13 & 8) != 0 ? null : l12, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : l13, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : str5, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? null : str7);
    }
}
