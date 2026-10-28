package live.hms.video.signal.init;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/signal/init/TokenRequest;", "", "roomCode", "", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoomCode", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class TokenRequest {
    private final String roomCode;
    private final String userId;

    public TokenRequest(String roomCode, String str) {
        AbstractC22676k.m65750j(roomCode, "roomCode");
        this.roomCode = roomCode;
        this.userId = str;
    }

    public static /* synthetic */ TokenRequest copy$default(TokenRequest tokenRequest, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = tokenRequest.roomCode;
        }
        if ((i13 & 2) != 0) {
            str2 = tokenRequest.userId;
        }
        return tokenRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoomCode() {
        return this.roomCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final TokenRequest copy(String roomCode, String userId) {
        AbstractC22676k.m65750j(roomCode, "roomCode");
        return new TokenRequest(roomCode, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenRequest)) {
            return false;
        }
        TokenRequest tokenRequest = (TokenRequest) other;
        return AbstractC22676k.m65745e(this.roomCode, tokenRequest.roomCode) && AbstractC22676k.m65745e(this.userId, tokenRequest.userId);
    }

    public final String getRoomCode() {
        return this.roomCode;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.roomCode.hashCode() * 31;
        String str = this.userId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("TokenRequest(roomCode=");
        sb4.append(this.roomCode);
        sb4.append(", userId=");
        return AbstractC25012a.m73377j(sb4, this.userId, ')');
    }

    public /* synthetic */ TokenRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2);
    }
}
