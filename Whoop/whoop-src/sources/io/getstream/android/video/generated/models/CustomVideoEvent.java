package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import p000.AbstractC30802r;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010JP\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0014R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b,\u0010\u0010¨\u0006-"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CustomVideoEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "", "", "custom", "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "()Ljava/util/Map;", "component4", "()Lio/getstream/android/video/generated/models/UserResponse;", "component5", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CustomVideoEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "Ljava/util/Map;", "getCustom", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CustomVideoEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final C21682i createdAt;
    private final Map<String, Object> custom;
    private final String type;
    private final UserResponse user;

    public /* synthetic */ CustomVideoEvent(String str, C21682i c21682i, Map map, UserResponse userResponse, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, (i13 & 4) != 0 ? C25272z.f99163w : map, userResponse, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomVideoEvent copy$default(CustomVideoEvent customVideoEvent, String str, C21682i c21682i, Map map, UserResponse userResponse, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = customVideoEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = customVideoEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            map = customVideoEvent.custom;
        }
        if ((i13 & 8) != 0) {
            userResponse = customVideoEvent.user;
        }
        if ((i13 & 16) != 0) {
            str2 = customVideoEvent.type;
        }
        String str3 = str2;
        Map map2 = map;
        return customVideoEvent.copy(str, c21682i, map2, userResponse, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final Map<String, Object> component3() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CustomVideoEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        return new CustomVideoEvent(callCid, createdAt, custom, user, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomVideoEvent)) {
            return false;
        }
        CustomVideoEvent customVideoEvent = (CustomVideoEvent) other;
        return AbstractC22676k.m65745e(this.callCid, customVideoEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, customVideoEvent.createdAt) && AbstractC22676k.m65745e(this.custom, customVideoEvent.custom) && AbstractC22676k.m65745e(this.user, customVideoEvent.user) && AbstractC22676k.m65745e(this.type, customVideoEvent.type);
    }

    @Override // io.getstream.android.video.generated.models.WSCallEvent
    public String getCallCID() {
        return this.callCid;
    }

    public final String getCallCid() {
        return this.callCid;
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

    public final String getType() {
        return this.type;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.user.hashCode() + AbstractC3855a.m11821e(this.custom, AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31)) * 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        Map<String, Object> map = this.custom;
        UserResponse userResponse = this.user;
        String str2 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CustomVideoEvent(callCid=", c21682i, str, ", createdAt=", ", custom=");
        sbM94767p.append(map);
        sbM94767p.append(", user=");
        sbM94767p.append(userResponse);
        sbM94767p.append(", type=");
        return AbstractC25012a.m73376i(str2, ")", sbM94767p);
    }

    public CustomVideoEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.custom = custom;
        this.user = user;
        this.type = type;
    }
}
