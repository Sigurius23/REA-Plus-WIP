package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallStatsMapSubscriber;", "", "isLive", "", "userId", "", "userSessionId", "name", "location", "Lio/getstream/android/video/generated/models/CallStatsLocation;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)V", "()Z", "getLocation", "()Lio/getstream/android/video/generated/models/CallStatsLocation;", "getName", "()Ljava/lang/String;", "getUserId", "getUserSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallStatsMapSubscriber {
    private final boolean isLive;
    private final CallStatsLocation location;
    private final String name;
    private final String userId;
    private final String userSessionId;

    public CallStatsMapSubscriber(@InterfaceC30731q(name = "is_live") boolean z4, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "name") String str, @InterfaceC30731q(name = "location") CallStatsLocation callStatsLocation) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        this.isLive = z4;
        this.userId = userId;
        this.userSessionId = userSessionId;
        this.name = str;
        this.location = callStatsLocation;
    }

    public static /* synthetic */ CallStatsMapSubscriber copy$default(CallStatsMapSubscriber callStatsMapSubscriber, boolean z4, String str, String str2, String str3, CallStatsLocation callStatsLocation, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = callStatsMapSubscriber.isLive;
        }
        if ((i13 & 2) != 0) {
            str = callStatsMapSubscriber.userId;
        }
        if ((i13 & 4) != 0) {
            str2 = callStatsMapSubscriber.userSessionId;
        }
        if ((i13 & 8) != 0) {
            str3 = callStatsMapSubscriber.name;
        }
        if ((i13 & 16) != 0) {
            callStatsLocation = callStatsMapSubscriber.location;
        }
        CallStatsLocation callStatsLocation2 = callStatsLocation;
        String str4 = str2;
        return callStatsMapSubscriber.copy(z4, str, str4, str3, callStatsLocation2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CallStatsLocation getLocation() {
        return this.location;
    }

    public final CallStatsMapSubscriber copy(@InterfaceC30731q(name = "is_live") boolean isLive, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "location") CallStatsLocation location) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        return new CallStatsMapSubscriber(isLive, userId, userSessionId, name, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStatsMapSubscriber)) {
            return false;
        }
        CallStatsMapSubscriber callStatsMapSubscriber = (CallStatsMapSubscriber) other;
        return this.isLive == callStatsMapSubscriber.isLive && AbstractC22676k.m65745e(this.userId, callStatsMapSubscriber.userId) && AbstractC22676k.m65745e(this.userSessionId, callStatsMapSubscriber.userSessionId) && AbstractC22676k.m65745e(this.name, callStatsMapSubscriber.name) && AbstractC22676k.m65745e(this.location, callStatsMapSubscriber.location);
    }

    public final CallStatsLocation getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.isLive) * 31, 31, this.userId), 31, this.userSessionId);
        String str = this.name;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        CallStatsLocation callStatsLocation = this.location;
        return iHashCode + (callStatsLocation != null ? callStatsLocation.hashCode() : 0);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public String toString() {
        boolean z4 = this.isLive;
        String str = this.userId;
        String str2 = this.userSessionId;
        String str3 = this.name;
        CallStatsLocation callStatsLocation = this.location;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("CallStatsMapSubscriber(isLive=", ", userId=", str, ", userSessionId=", z4);
        AbstractC11266d.m30444B(sbM38567n, str2, ", name=", str3, ", location=");
        sbM38567n.append(callStatsLocation);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public /* synthetic */ CallStatsMapSubscriber(boolean z4, String str, String str2, String str3, CallStatsLocation callStatsLocation, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, str, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : callStatsLocation);
    }
}
