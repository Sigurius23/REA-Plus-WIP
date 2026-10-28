package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013Jh\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0013R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b.\u0010\u0013¨\u0006/"}, m65681d2 = {"Lio/getstream/android/video/generated/models/MemberResponse;", "", "Ljg3/i;", "createdAt", "updatedAt", "", "userId", "", "custom", "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, "deletedAt", "role", "<init>", "(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;)V", "component1", "()Ljg3/i;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/Map;", "component5", "()Lio/getstream/android/video/generated/models/UserResponse;", "component6", "component7", "copy", "(Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;)Lio/getstream/android/video/generated/models/MemberResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getCreatedAt", "getUpdatedAt", "Ljava/lang/String;", "getUserId", "Ljava/util/Map;", "getCustom", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "getDeletedAt", "getRole", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class MemberResponse {
    private final C21682i createdAt;
    private final Map<String, Object> custom;
    private final C21682i deletedAt;
    private final String role;
    private final C21682i updatedAt;
    private final UserResponse user;
    private final String userId;

    public MemberResponse(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "deleted_at") C21682i c21682i, @InterfaceC30731q(name = "role") String str) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.userId = userId;
        this.custom = custom;
        this.user = user;
        this.deletedAt = c21682i;
        this.role = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemberResponse copy$default(MemberResponse memberResponse, C21682i c21682i, C21682i c21682i2, String str, Map map, UserResponse userResponse, C21682i c21682i3, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21682i = memberResponse.createdAt;
        }
        if ((i13 & 2) != 0) {
            c21682i2 = memberResponse.updatedAt;
        }
        if ((i13 & 4) != 0) {
            str = memberResponse.userId;
        }
        if ((i13 & 8) != 0) {
            map = memberResponse.custom;
        }
        if ((i13 & 16) != 0) {
            userResponse = memberResponse.user;
        }
        if ((i13 & 32) != 0) {
            c21682i3 = memberResponse.deletedAt;
        }
        if ((i13 & 64) != 0) {
            str2 = memberResponse.role;
        }
        C21682i c21682i4 = c21682i3;
        String str3 = str2;
        UserResponse userResponse2 = userResponse;
        String str4 = str;
        return memberResponse.copy(c21682i, c21682i2, str4, map, userResponse2, c21682i4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final Map<String, Object> component4() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C21682i getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final MemberResponse copy(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "deleted_at") C21682i deletedAt, @InterfaceC30731q(name = "role") String role) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        return new MemberResponse(createdAt, updatedAt, userId, custom, user, deletedAt, role);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberResponse)) {
            return false;
        }
        MemberResponse memberResponse = (MemberResponse) other;
        return AbstractC22676k.m65745e(this.createdAt, memberResponse.createdAt) && AbstractC22676k.m65745e(this.updatedAt, memberResponse.updatedAt) && AbstractC22676k.m65745e(this.userId, memberResponse.userId) && AbstractC22676k.m65745e(this.custom, memberResponse.custom) && AbstractC22676k.m65745e(this.user, memberResponse.user) && AbstractC22676k.m65745e(this.deletedAt, memberResponse.deletedAt) && AbstractC22676k.m65745e(this.role, memberResponse.role);
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final C21682i getDeletedAt() {
        return this.deletedAt;
    }

    public final String getRole() {
        return this.role;
    }

    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.user.hashCode() + AbstractC3855a.m11821e(this.custom, AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.updatedAt, this.createdAt.hashCode() * 31, 31), 31, this.userId), 31)) * 31;
        C21682i c21682i = this.deletedAt;
        int iHashCode2 = (iHashCode + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        String str = this.role;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        C21682i c21682i = this.createdAt;
        C21682i c21682i2 = this.updatedAt;
        String str = this.userId;
        Map<String, Object> map = this.custom;
        UserResponse userResponse = this.user;
        C21682i c21682i3 = this.deletedAt;
        String str2 = this.role;
        StringBuilder sb4 = new StringBuilder("MemberResponse(createdAt=");
        sb4.append(c21682i);
        sb4.append(", updatedAt=");
        sb4.append(c21682i2);
        sb4.append(", userId=");
        AbstractC36095b.m114695w(sb4, str, ", custom=", map, ", user=");
        sb4.append(userResponse);
        sb4.append(", deletedAt=");
        sb4.append(c21682i3);
        sb4.append(", role=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public /* synthetic */ MemberResponse(C21682i c21682i, C21682i c21682i2, String str, Map map, UserResponse userResponse, C21682i c21682i3, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21682i, c21682i2, str, (i13 & 8) != 0 ? C25272z.f99163w : map, userResponse, (i13 & 32) != 0 ? null : c21682i3, (i13 & 64) != 0 ? null : str2);
    }
}
