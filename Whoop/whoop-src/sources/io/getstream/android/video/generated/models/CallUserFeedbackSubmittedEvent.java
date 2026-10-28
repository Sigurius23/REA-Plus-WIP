package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u0016J \u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u008a\u0001\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\u001cJ\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b4\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b7\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b8\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b9\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b:\u0010\u0016R'\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010%¨\u0006="}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "", "rating", "sessionId", "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, "type", "reason", "sdk", "sdkVersion", "", "", "custom", "<init>", "(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "()I", "component4", "component5", "()Lio/getstream/android/video/generated/models/UserResponse;", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "I", "getRating", "getSessionId", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "getType", "getReason", "getSdk", "getSdkVersion", "Ljava/util/Map;", "getCustom", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallUserFeedbackSubmittedEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final C21682i createdAt;
    private final Map<String, Object> custom;
    private final int rating;
    private final String reason;
    private final String sdk;
    private final String sdkVersion;
    private final String sessionId;
    private final String type;
    private final UserResponse user;

    public /* synthetic */ CallUserFeedbackSubmittedEvent(String str, C21682i c21682i, int i13, String str2, UserResponse userResponse, String str3, String str4, String str5, String str6, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, i13, str2, userResponse, str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? C25272z.f99163w : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallUserFeedbackSubmittedEvent copy$default(CallUserFeedbackSubmittedEvent callUserFeedbackSubmittedEvent, String str, C21682i c21682i, int i13, String str2, UserResponse userResponse, String str3, String str4, String str5, String str6, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = callUserFeedbackSubmittedEvent.callCid;
        }
        if ((i14 & 2) != 0) {
            c21682i = callUserFeedbackSubmittedEvent.createdAt;
        }
        if ((i14 & 4) != 0) {
            i13 = callUserFeedbackSubmittedEvent.rating;
        }
        if ((i14 & 8) != 0) {
            str2 = callUserFeedbackSubmittedEvent.sessionId;
        }
        if ((i14 & 16) != 0) {
            userResponse = callUserFeedbackSubmittedEvent.user;
        }
        if ((i14 & 32) != 0) {
            str3 = callUserFeedbackSubmittedEvent.type;
        }
        if ((i14 & 64) != 0) {
            str4 = callUserFeedbackSubmittedEvent.reason;
        }
        if ((i14 & 128) != 0) {
            str5 = callUserFeedbackSubmittedEvent.sdk;
        }
        if ((i14 & 256) != 0) {
            str6 = callUserFeedbackSubmittedEvent.sdkVersion;
        }
        if ((i14 & 512) != 0) {
            map = callUserFeedbackSubmittedEvent.custom;
        }
        String str7 = str6;
        Map map2 = map;
        String str8 = str4;
        String str9 = str5;
        UserResponse userResponse2 = userResponse;
        String str10 = str3;
        return callUserFeedbackSubmittedEvent.copy(str, c21682i, i13, str2, userResponse2, str10, str8, str9, str7, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    public final Map<String, Object> component10() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSdk() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final CallUserFeedbackSubmittedEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "rating") int rating, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "reason") String reason, @InterfaceC30731q(name = "sdk") String sdk, @InterfaceC30731q(name = "sdk_version") String sdkVersion, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        return new CallUserFeedbackSubmittedEvent(callCid, createdAt, rating, sessionId, user, type, reason, sdk, sdkVersion, custom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallUserFeedbackSubmittedEvent)) {
            return false;
        }
        CallUserFeedbackSubmittedEvent callUserFeedbackSubmittedEvent = (CallUserFeedbackSubmittedEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callUserFeedbackSubmittedEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callUserFeedbackSubmittedEvent.createdAt) && this.rating == callUserFeedbackSubmittedEvent.rating && AbstractC22676k.m65745e(this.sessionId, callUserFeedbackSubmittedEvent.sessionId) && AbstractC22676k.m65745e(this.user, callUserFeedbackSubmittedEvent.user) && AbstractC22676k.m65745e(this.type, callUserFeedbackSubmittedEvent.type) && AbstractC22676k.m65745e(this.reason, callUserFeedbackSubmittedEvent.reason) && AbstractC22676k.m65745e(this.sdk, callUserFeedbackSubmittedEvent.sdk) && AbstractC22676k.m65745e(this.sdkVersion, callUserFeedbackSubmittedEvent.sdkVersion) && AbstractC22676k.m65745e(this.custom, callUserFeedbackSubmittedEvent.custom);
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

    public final int getRating() {
        return this.rating;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getType() {
        return this.type;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.user.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.rating, AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31), 31, this.sessionId)) * 31, 31, this.type);
        String str = this.reason;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sdk;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, Object> map = this.custom;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        int i13 = this.rating;
        String str2 = this.sessionId;
        UserResponse userResponse = this.user;
        String str3 = this.type;
        String str4 = this.reason;
        String str5 = this.sdk;
        String str6 = this.sdkVersion;
        Map<String, Object> map = this.custom;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallUserFeedbackSubmittedEvent(callCid=", c21682i, str, ", createdAt=", ", rating=");
        AbstractC11895b.m31979B(i13, ", sessionId=", str2, ", user=", sbM94767p);
        sbM94767p.append(userResponse);
        sbM94767p.append(", type=");
        sbM94767p.append(str3);
        sbM94767p.append(", reason=");
        AbstractC11266d.m30444B(sbM94767p, str4, ", sdk=", str5, ", sdkVersion=");
        return AbstractC30007c.m91842l(sbM94767p, str6, ", custom=", map, ")");
    }

    public CallUserFeedbackSubmittedEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "rating") int i13, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "reason") String str, @InterfaceC30731q(name = "sdk") String str2, @InterfaceC30731q(name = "sdk_version") String str3, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.rating = i13;
        this.sessionId = sessionId;
        this.user = user;
        this.type = type;
        this.reason = str;
        this.sdk = str2;
        this.sdkVersion = str3;
        this.custom = map;
    }
}
