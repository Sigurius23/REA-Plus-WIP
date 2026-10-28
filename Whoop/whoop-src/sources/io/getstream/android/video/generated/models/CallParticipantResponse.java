package io.getstream.android.video.generated.models;

import com.whoop.service.network.model.UserState;
import jg3.C21682i;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallParticipantResponse;", "", "Ljg3/i;", "joinedAt", "", "role", "userSessionId", "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, "<init>", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)V", "component1", "()Ljg3/i;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lio/getstream/android/video/generated/models/UserResponse;", "copy", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/android/video/generated/models/CallParticipantResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getJoinedAt", "Ljava/lang/String;", "getRole", "getUserSessionId", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallParticipantResponse {
    private final C21682i joinedAt;
    private final String role;
    private final UserResponse user;
    private final String userSessionId;

    public CallParticipantResponse(@InterfaceC30731q(name = "joined_at") C21682i joinedAt, @InterfaceC30731q(name = "role") String role, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user) {
        AbstractC22676k.m65750j(joinedAt, "joinedAt");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        AbstractC22676k.m65750j(user, "user");
        this.joinedAt = joinedAt;
        this.role = role;
        this.userSessionId = userSessionId;
        this.user = user;
    }

    public static /* synthetic */ CallParticipantResponse copy$default(CallParticipantResponse callParticipantResponse, C21682i c21682i, String str, String str2, UserResponse userResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21682i = callParticipantResponse.joinedAt;
        }
        if ((i13 & 2) != 0) {
            str = callParticipantResponse.role;
        }
        if ((i13 & 4) != 0) {
            str2 = callParticipantResponse.userSessionId;
        }
        if ((i13 & 8) != 0) {
            userResponse = callParticipantResponse.user;
        }
        return callParticipantResponse.copy(c21682i, str, str2, userResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getJoinedAt() {
        return this.joinedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    public final CallParticipantResponse copy(@InterfaceC30731q(name = "joined_at") C21682i joinedAt, @InterfaceC30731q(name = "role") String role, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user) {
        AbstractC22676k.m65750j(joinedAt, "joinedAt");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        AbstractC22676k.m65750j(user, "user");
        return new CallParticipantResponse(joinedAt, role, userSessionId, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallParticipantResponse)) {
            return false;
        }
        CallParticipantResponse callParticipantResponse = (CallParticipantResponse) other;
        return AbstractC22676k.m65745e(this.joinedAt, callParticipantResponse.joinedAt) && AbstractC22676k.m65745e(this.role, callParticipantResponse.role) && AbstractC22676k.m65745e(this.userSessionId, callParticipantResponse.userSessionId) && AbstractC22676k.m65745e(this.user, callParticipantResponse.user);
    }

    public final C21682i getJoinedAt() {
        return this.joinedAt;
    }

    public final String getRole() {
        return this.role;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        return this.user.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.joinedAt.hashCode() * 31, 31, this.role), 31, this.userSessionId);
    }

    public String toString() {
        return "CallParticipantResponse(joinedAt=" + this.joinedAt + ", role=" + this.role + ", userSessionId=" + this.userSessionId + ", user=" + this.user + ")";
    }
}
