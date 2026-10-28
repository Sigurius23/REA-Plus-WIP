package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J^\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\b\u0003\u0010\t\u001a\u00020\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b)\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b*\u0010\u0012¨\u0006+"}, m65681d2 = {"Lio/getstream/android/video/generated/models/HealthCheckEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "", "connectionId", "Ljg3/i;", "createdAt", "", "", "custom", "type", "cid", "receivedAt", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;)V", "getEventType", "()Ljava/lang/String;", "component1", "component2", "()Ljg3/i;", "component3", "()Ljava/util/Map;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/HealthCheckEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConnectionId", "Ljg3/i;", "getCreatedAt", "Ljava/util/Map;", "getCustom", "getType", "getCid", "getReceivedAt", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class HealthCheckEvent extends VideoEvent {
    private final String cid;
    private final String connectionId;
    private final C21682i createdAt;
    private final Map<String, Object> custom;
    private final C21682i receivedAt;
    private final String type;

    public /* synthetic */ HealthCheckEvent(String str, C21682i c21682i, Map map, String str2, String str3, C21682i c21682i2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, (i13 & 4) != 0 ? C25272z.f99163w : map, str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : c21682i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthCheckEvent copy$default(HealthCheckEvent healthCheckEvent, String str, C21682i c21682i, Map map, String str2, String str3, C21682i c21682i2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthCheckEvent.connectionId;
        }
        if ((i13 & 2) != 0) {
            c21682i = healthCheckEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            map = healthCheckEvent.custom;
        }
        if ((i13 & 8) != 0) {
            str2 = healthCheckEvent.type;
        }
        if ((i13 & 16) != 0) {
            str3 = healthCheckEvent.cid;
        }
        if ((i13 & 32) != 0) {
            c21682i2 = healthCheckEvent.receivedAt;
        }
        String str4 = str3;
        C21682i c21682i3 = c21682i2;
        return healthCheckEvent.copy(str, c21682i, map, str2, str4, c21682i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConnectionId() {
        return this.connectionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final Map<String, Object> component3() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C21682i getReceivedAt() {
        return this.receivedAt;
    }

    public final HealthCheckEvent copy(@InterfaceC30731q(name = QueryParams.CONNECTION_ID) String connectionId, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "cid") String cid, @InterfaceC30731q(name = "received_at") C21682i receivedAt) {
        AbstractC22676k.m65750j(connectionId, "connectionId");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(type, "type");
        return new HealthCheckEvent(connectionId, createdAt, custom, type, cid, receivedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthCheckEvent)) {
            return false;
        }
        HealthCheckEvent healthCheckEvent = (HealthCheckEvent) other;
        return AbstractC22676k.m65745e(this.connectionId, healthCheckEvent.connectionId) && AbstractC22676k.m65745e(this.createdAt, healthCheckEvent.createdAt) && AbstractC22676k.m65745e(this.custom, healthCheckEvent.custom) && AbstractC22676k.m65745e(this.type, healthCheckEvent.type) && AbstractC22676k.m65745e(this.cid, healthCheckEvent.cid) && AbstractC22676k.m65745e(this.receivedAt, healthCheckEvent.receivedAt);
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getConnectionId() {
        return this.connectionId;
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

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC3855a.m11821e(this.custom, AbstractC3855a.m11822f(this.createdAt, this.connectionId.hashCode() * 31, 31), 31), 31, this.type);
        String str = this.cid;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C21682i c21682i = this.receivedAt;
        return iHashCode + (c21682i != null ? c21682i.hashCode() : 0);
    }

    public String toString() {
        String str = this.connectionId;
        C21682i c21682i = this.createdAt;
        Map<String, Object> map = this.custom;
        String str2 = this.type;
        String str3 = this.cid;
        C21682i c21682i2 = this.receivedAt;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("HealthCheckEvent(connectionId=", c21682i, str, ", createdAt=", ", custom=");
        sbM94767p.append(map);
        sbM94767p.append(", type=");
        sbM94767p.append(str2);
        sbM94767p.append(", cid=");
        sbM94767p.append(str3);
        sbM94767p.append(", receivedAt=");
        sbM94767p.append(c21682i2);
        sbM94767p.append(")");
        return sbM94767p.toString();
    }

    public HealthCheckEvent(@InterfaceC30731q(name = QueryParams.CONNECTION_ID) String connectionId, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "cid") String str, @InterfaceC30731q(name = "received_at") C21682i c21682i) {
        AbstractC22676k.m65750j(connectionId, "connectionId");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(type, "type");
        this.connectionId = connectionId;
        this.createdAt = createdAt;
        this.custom = custom;
        this.type = type;
        this.cid = str;
        this.receivedAt = c21682i;
    }
}
