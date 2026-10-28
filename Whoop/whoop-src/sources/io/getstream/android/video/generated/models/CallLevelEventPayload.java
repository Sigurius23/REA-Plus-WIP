package io.getstream.android.video.generated.models;

import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0018\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u0018\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallLevelEventPayload;", "", "eventType", "", "timestamp", "", "userId", "payload", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V", "getEventType", "()Ljava/lang/String;", "getPayload", "()Ljava/util/Map;", "getTimestamp", "()I", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallLevelEventPayload {
    private final String eventType;
    private final Map<String, Object> payload;
    private final int timestamp;
    private final String userId;

    public CallLevelEventPayload(@InterfaceC30731q(name = "event_type") String eventType, @InterfaceC30731q(name = "timestamp") int i13, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "payload") Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(userId, "userId");
        this.eventType = eventType;
        this.timestamp = i13;
        this.userId = userId;
        this.payload = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallLevelEventPayload copy$default(CallLevelEventPayload callLevelEventPayload, String str, int i13, String str2, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = callLevelEventPayload.eventType;
        }
        if ((i14 & 2) != 0) {
            i13 = callLevelEventPayload.timestamp;
        }
        if ((i14 & 4) != 0) {
            str2 = callLevelEventPayload.userId;
        }
        if ((i14 & 8) != 0) {
            map = callLevelEventPayload.payload;
        }
        return callLevelEventPayload.copy(str, i13, str2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final Map<String, Object> component4() {
        return this.payload;
    }

    public final CallLevelEventPayload copy(@InterfaceC30731q(name = "event_type") String eventType, @InterfaceC30731q(name = "timestamp") int timestamp, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "payload") Map<String, ? extends Object> payload) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(userId, "userId");
        return new CallLevelEventPayload(eventType, timestamp, userId, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallLevelEventPayload)) {
            return false;
        }
        CallLevelEventPayload callLevelEventPayload = (CallLevelEventPayload) other;
        return AbstractC22676k.m65745e(this.eventType, callLevelEventPayload.eventType) && this.timestamp == callLevelEventPayload.timestamp && AbstractC22676k.m65745e(this.userId, callLevelEventPayload.userId) && AbstractC22676k.m65745e(this.payload, callLevelEventPayload.payload);
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.timestamp, this.eventType.hashCode() * 31, 31), 31, this.userId);
        Map<String, Object> map = this.payload;
        return iM30450d + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        String str = this.eventType;
        int i13 = this.timestamp;
        return AbstractC30007c.m91842l(AbstractC11266d.m30467u(i13, "CallLevelEventPayload(eventType=", str, ", timestamp=", ", userId="), this.userId, ", payload=", this.payload, ")");
    }

    public /* synthetic */ CallLevelEventPayload(String str, int i13, String str2, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, (i14 & 8) != 0 ? C25272z.f99163w : map);
    }
}
