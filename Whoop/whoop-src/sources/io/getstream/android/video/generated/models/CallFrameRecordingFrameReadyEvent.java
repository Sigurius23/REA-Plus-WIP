package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.QueryParams;
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
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013Jv\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f2\b\b\u0003\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b/\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b0\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b1\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b2\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b3\u0010\u0013R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b6\u0010\u0013¨\u00067"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "capturedAt", "createdAt", "egressId", "sessionId", "trackType", QueryParams.URL, "", "Lio/getstream/android/video/generated/models/UserResponse;", "users", "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/Map;", "component9", "copy", "(Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallFrameRecordingFrameReadyEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCapturedAt", "getCreatedAt", "getEgressId", "getSessionId", "getTrackType", "getUrl", "Ljava/util/Map;", "getUsers", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallFrameRecordingFrameReadyEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final C21682i capturedAt;
    private final C21682i createdAt;
    private final String egressId;
    private final String sessionId;
    private final String trackType;
    private final String type;
    private final String url;
    private final Map<String, UserResponse> users;

    public /* synthetic */ CallFrameRecordingFrameReadyEvent(String str, C21682i c21682i, C21682i c21682i2, String str2, String str3, String str4, String str5, Map map, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, c21682i2, str2, str3, str4, str5, (i13 & 128) != 0 ? C25272z.f99163w : map, str6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallFrameRecordingFrameReadyEvent copy$default(CallFrameRecordingFrameReadyEvent callFrameRecordingFrameReadyEvent, String str, C21682i c21682i, C21682i c21682i2, String str2, String str3, String str4, String str5, Map map, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callFrameRecordingFrameReadyEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callFrameRecordingFrameReadyEvent.capturedAt;
        }
        if ((i13 & 4) != 0) {
            c21682i2 = callFrameRecordingFrameReadyEvent.createdAt;
        }
        if ((i13 & 8) != 0) {
            str2 = callFrameRecordingFrameReadyEvent.egressId;
        }
        if ((i13 & 16) != 0) {
            str3 = callFrameRecordingFrameReadyEvent.sessionId;
        }
        if ((i13 & 32) != 0) {
            str4 = callFrameRecordingFrameReadyEvent.trackType;
        }
        if ((i13 & 64) != 0) {
            str5 = callFrameRecordingFrameReadyEvent.url;
        }
        if ((i13 & 128) != 0) {
            map = callFrameRecordingFrameReadyEvent.users;
        }
        if ((i13 & 256) != 0) {
            str6 = callFrameRecordingFrameReadyEvent.type;
        }
        Map map2 = map;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        C21682i c21682i3 = c21682i2;
        return callFrameRecordingFrameReadyEvent.copy(str, c21682i, c21682i3, str2, str10, str8, str9, map2, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCapturedAt() {
        return this.capturedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEgressId() {
        return this.egressId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrackType() {
        return this.trackType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, UserResponse> component8() {
        return this.users;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CallFrameRecordingFrameReadyEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "captured_at") C21682i capturedAt, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "egress_id") String egressId, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = "track_type") String trackType, @InterfaceC30731q(name = QueryParams.URL) String url, @InterfaceC30731q(name = "users") Map<String, UserResponse> users, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(capturedAt, "capturedAt");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(egressId, "egressId");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(trackType, "trackType");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(users, "users");
        AbstractC22676k.m65750j(type, "type");
        return new CallFrameRecordingFrameReadyEvent(callCid, capturedAt, createdAt, egressId, sessionId, trackType, url, users, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallFrameRecordingFrameReadyEvent)) {
            return false;
        }
        CallFrameRecordingFrameReadyEvent callFrameRecordingFrameReadyEvent = (CallFrameRecordingFrameReadyEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callFrameRecordingFrameReadyEvent.callCid) && AbstractC22676k.m65745e(this.capturedAt, callFrameRecordingFrameReadyEvent.capturedAt) && AbstractC22676k.m65745e(this.createdAt, callFrameRecordingFrameReadyEvent.createdAt) && AbstractC22676k.m65745e(this.egressId, callFrameRecordingFrameReadyEvent.egressId) && AbstractC22676k.m65745e(this.sessionId, callFrameRecordingFrameReadyEvent.sessionId) && AbstractC22676k.m65745e(this.trackType, callFrameRecordingFrameReadyEvent.trackType) && AbstractC22676k.m65745e(this.url, callFrameRecordingFrameReadyEvent.url) && AbstractC22676k.m65745e(this.users, callFrameRecordingFrameReadyEvent.users) && AbstractC22676k.m65745e(this.type, callFrameRecordingFrameReadyEvent.type);
    }

    @Override // io.getstream.android.video.generated.models.WSCallEvent
    public String getCallCID() {
        return this.callCid;
    }

    public final String getCallCid() {
        return this.callCid;
    }

    public final C21682i getCapturedAt() {
        return this.capturedAt;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final String getEgressId() {
        return this.egressId;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTrackType() {
        return this.trackType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Map<String, UserResponse> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return this.type.hashCode() + AbstractC3855a.m11821e(this.users, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.createdAt, AbstractC3855a.m11822f(this.capturedAt, this.callCid.hashCode() * 31, 31), 31), 31, this.egressId), 31, this.sessionId), 31, this.trackType), 31, this.url), 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.capturedAt;
        C21682i c21682i2 = this.createdAt;
        String str2 = this.egressId;
        String str3 = this.sessionId;
        String str4 = this.trackType;
        String str5 = this.url;
        Map<String, UserResponse> map = this.users;
        String str6 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallFrameRecordingFrameReadyEvent(callCid=", c21682i, str, ", capturedAt=", ", createdAt=");
        sbM94767p.append(c21682i2);
        sbM94767p.append(", egressId=");
        sbM94767p.append(str2);
        sbM94767p.append(", sessionId=");
        AbstractC11266d.m30444B(sbM94767p, str3, ", trackType=", str4, ", url=");
        AbstractC36095b.m114695w(sbM94767p, str5, ", users=", map, ", type=");
        return AbstractC25012a.m73376i(str6, ")", sbM94767p);
    }

    public CallFrameRecordingFrameReadyEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "captured_at") C21682i capturedAt, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "egress_id") String egressId, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = "track_type") String trackType, @InterfaceC30731q(name = QueryParams.URL) String url, @InterfaceC30731q(name = "users") Map<String, UserResponse> users, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(capturedAt, "capturedAt");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(egressId, "egressId");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(trackType, "trackType");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(users, "users");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.capturedAt = capturedAt;
        this.createdAt = createdAt;
        this.egressId = egressId;
        this.sessionId = sessionId;
        this.trackType = trackType;
        this.url = url;
        this.users = users;
        this.type = type;
    }
}
