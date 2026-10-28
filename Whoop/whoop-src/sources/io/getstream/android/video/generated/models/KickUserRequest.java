package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/android/video/generated/models/KickUserRequest;", "", "userId", "", "block", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getBlock", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/KickUserRequest;", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class KickUserRequest {
    private final Boolean block;
    private final String userId;

    public KickUserRequest(@InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "block") Boolean bool) {
        AbstractC22676k.m65750j(userId, "userId");
        this.userId = userId;
        this.block = bool;
    }

    public static /* synthetic */ KickUserRequest copy$default(KickUserRequest kickUserRequest, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = kickUserRequest.userId;
        }
        if ((i13 & 2) != 0) {
            bool = kickUserRequest.block;
        }
        return kickUserRequest.copy(str, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getBlock() {
        return this.block;
    }

    public final KickUserRequest copy(@InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "block") Boolean block) {
        AbstractC22676k.m65750j(userId, "userId");
        return new KickUserRequest(userId, block);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KickUserRequest)) {
            return false;
        }
        KickUserRequest kickUserRequest = (KickUserRequest) other;
        return AbstractC22676k.m65745e(this.userId, kickUserRequest.userId) && AbstractC22676k.m65745e(this.block, kickUserRequest.block);
    }

    public final Boolean getBlock() {
        return this.block;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        Boolean bool = this.block;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "KickUserRequest(userId=" + this.userId + ", block=" + this.block + ")";
    }

    public /* synthetic */ KickUserRequest(String str, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : bool);
    }
}
