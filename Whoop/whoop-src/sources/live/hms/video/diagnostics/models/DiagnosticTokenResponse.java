package live.hms.video.diagnostics.models;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/diagnostics/models/DiagnosticTokenResponse;", "", "token", "", "roomId", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getRoomId", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class DiagnosticTokenResponse {

    @SerializedName("room_id")
    private final String roomId;

    @SerializedName("token")
    private final String token;

    @SerializedName("user_id")
    private final String userId;

    public DiagnosticTokenResponse(String str, String str2, String str3) {
        this.token = str;
        this.roomId = str2;
        this.userId = str3;
    }

    public static /* synthetic */ DiagnosticTokenResponse copy$default(DiagnosticTokenResponse diagnosticTokenResponse, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = diagnosticTokenResponse.token;
        }
        if ((i13 & 2) != 0) {
            str2 = diagnosticTokenResponse.roomId;
        }
        if ((i13 & 4) != 0) {
            str3 = diagnosticTokenResponse.userId;
        }
        return diagnosticTokenResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final DiagnosticTokenResponse copy(String token, String roomId, String userId) {
        return new DiagnosticTokenResponse(token, roomId, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiagnosticTokenResponse)) {
            return false;
        }
        DiagnosticTokenResponse diagnosticTokenResponse = (DiagnosticTokenResponse) other;
        return AbstractC22676k.m65745e(this.token, diagnosticTokenResponse.token) && AbstractC22676k.m65745e(this.roomId, diagnosticTokenResponse.roomId) && AbstractC22676k.m65745e(this.userId, diagnosticTokenResponse.userId);
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("DiagnosticTokenResponse(token=");
        sb4.append(this.token);
        sb4.append(", roomId=");
        sb4.append(this.roomId);
        sb4.append(", userId=");
        return AbstractC25012a.m73377j(sb4, this.userId, ')');
    }
}
