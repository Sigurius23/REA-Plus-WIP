package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJP\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0003\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b&\u0010\u000fR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b)\u0010\u000f¨\u0006*"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallModerationBlurEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "userId", "", "", "custom", "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "component4", "()Ljava/util/Map;", "component5", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallModerationBlurEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "getUserId", "Ljava/util/Map;", "getCustom", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallModerationBlurEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final C21682i createdAt;
    private final Map<String, Object> custom;
    private final String type;
    private final String userId;

    public /* synthetic */ CallModerationBlurEvent(String str, C21682i c21682i, String str2, Map map, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, str2, (i13 & 8) != 0 ? C25272z.f99163w : map, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallModerationBlurEvent copy$default(CallModerationBlurEvent callModerationBlurEvent, String str, C21682i c21682i, String str2, Map map, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callModerationBlurEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callModerationBlurEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = callModerationBlurEvent.userId;
        }
        if ((i13 & 8) != 0) {
            map = callModerationBlurEvent.custom;
        }
        if ((i13 & 16) != 0) {
            str3 = callModerationBlurEvent.type;
        }
        String str4 = str3;
        String str5 = str2;
        return callModerationBlurEvent.copy(str, c21682i, str5, map, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final Map<String, Object> component4() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CallModerationBlurEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(type, "type");
        return new CallModerationBlurEvent(callCid, createdAt, userId, custom, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallModerationBlurEvent)) {
            return false;
        }
        CallModerationBlurEvent callModerationBlurEvent = (CallModerationBlurEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callModerationBlurEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callModerationBlurEvent.createdAt) && AbstractC22676k.m65745e(this.userId, callModerationBlurEvent.userId) && AbstractC22676k.m65745e(this.custom, callModerationBlurEvent.custom) && AbstractC22676k.m65745e(this.type, callModerationBlurEvent.type);
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

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.type.hashCode() + AbstractC3855a.m11821e(this.custom, AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31, this.userId), 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        String str2 = this.userId;
        Map<String, Object> map = this.custom;
        String str3 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallModerationBlurEvent(callCid=", c21682i, str, ", createdAt=", ", userId=");
        AbstractC36095b.m114695w(sbM94767p, str2, ", custom=", map, ", type=");
        return AbstractC25012a.m73376i(str3, ")", sbM94767p);
    }

    public CallModerationBlurEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.userId = userId;
        this.custom = custom;
        this.type = type;
    }
}
