package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011JR\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b*\u0010\u0011¨\u0006+"}, m65681d2 = {"Lio/getstream/android/video/generated/models/UserUpdatedEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Ljg3/i;", "createdAt", "", "", "", "custom", "Lio/getstream/android/video/generated/models/UserResponsePrivacyFields;", UserState.Sources.USER, "type", "receivedAt", "<init>", "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponsePrivacyFields;Ljava/lang/String;Ljg3/i;)V", "getEventType", "()Ljava/lang/String;", "component1", "()Ljg3/i;", "component2", "()Ljava/util/Map;", "component3", "()Lio/getstream/android/video/generated/models/UserResponsePrivacyFields;", "component4", "component5", "copy", "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponsePrivacyFields;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/UserUpdatedEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getCreatedAt", "Ljava/util/Map;", "getCustom", "Lio/getstream/android/video/generated/models/UserResponsePrivacyFields;", "getUser", "Ljava/lang/String;", "getType", "getReceivedAt", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UserUpdatedEvent extends VideoEvent {
    private final C21682i createdAt;
    private final Map<String, Object> custom;
    private final C21682i receivedAt;
    private final String type;
    private final UserResponsePrivacyFields user;

    public /* synthetic */ UserUpdatedEvent(C21682i c21682i, Map map, UserResponsePrivacyFields userResponsePrivacyFields, String str, C21682i c21682i2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21682i, (i13 & 2) != 0 ? C25272z.f99163w : map, userResponsePrivacyFields, str, (i13 & 16) != 0 ? null : c21682i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserUpdatedEvent copy$default(UserUpdatedEvent userUpdatedEvent, C21682i c21682i, Map map, UserResponsePrivacyFields userResponsePrivacyFields, String str, C21682i c21682i2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21682i = userUpdatedEvent.createdAt;
        }
        if ((i13 & 2) != 0) {
            map = userUpdatedEvent.custom;
        }
        if ((i13 & 4) != 0) {
            userResponsePrivacyFields = userUpdatedEvent.user;
        }
        if ((i13 & 8) != 0) {
            str = userUpdatedEvent.type;
        }
        if ((i13 & 16) != 0) {
            c21682i2 = userUpdatedEvent.receivedAt;
        }
        C21682i c21682i3 = c21682i2;
        UserResponsePrivacyFields userResponsePrivacyFields2 = userResponsePrivacyFields;
        return userUpdatedEvent.copy(c21682i, map, userResponsePrivacyFields2, str, c21682i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final Map<String, Object> component2() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserResponsePrivacyFields getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C21682i getReceivedAt() {
        return this.receivedAt;
    }

    public final UserUpdatedEvent copy(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponsePrivacyFields user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "received_at") C21682i receivedAt) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        return new UserUpdatedEvent(createdAt, custom, user, type, receivedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserUpdatedEvent)) {
            return false;
        }
        UserUpdatedEvent userUpdatedEvent = (UserUpdatedEvent) other;
        return AbstractC22676k.m65745e(this.createdAt, userUpdatedEvent.createdAt) && AbstractC22676k.m65745e(this.custom, userUpdatedEvent.custom) && AbstractC22676k.m65745e(this.user, userUpdatedEvent.user) && AbstractC22676k.m65745e(this.type, userUpdatedEvent.type) && AbstractC22676k.m65745e(this.receivedAt, userUpdatedEvent.receivedAt);
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final C21682i getReceivedAt() {
        return this.receivedAt;
    }

    public final String getType() {
        return this.type;
    }

    public final UserResponsePrivacyFields getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.user.hashCode() + AbstractC3855a.m11821e(this.custom, this.createdAt.hashCode() * 31, 31)) * 31, 31, this.type);
        C21682i c21682i = this.receivedAt;
        return iM30450d + (c21682i == null ? 0 : c21682i.hashCode());
    }

    public String toString() {
        return "UserUpdatedEvent(createdAt=" + this.createdAt + ", custom=" + this.custom + ", user=" + this.user + ", type=" + this.type + ", receivedAt=" + this.receivedAt + ")";
    }

    public UserUpdatedEvent(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponsePrivacyFields user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "received_at") C21682i c21682i) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        this.createdAt = createdAt;
        this.custom = custom;
        this.user = user;
        this.type = type;
        this.receivedAt = c21682i;
    }
}
