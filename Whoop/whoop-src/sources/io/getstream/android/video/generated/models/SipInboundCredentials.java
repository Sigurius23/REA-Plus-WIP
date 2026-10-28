package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t\u0012\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tHÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tHÆ\u0003Jk\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SipInboundCredentials;", "", "apiKey", "", "callId", "callType", "token", "userId", "callCustomData", "", "userCustomData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getApiKey", "()Ljava/lang/String;", "getCallCustomData", "()Ljava/util/Map;", "getCallId", "getCallType", "getToken", "getUserCustomData", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SipInboundCredentials {
    private final String apiKey;
    private final Map<String, Object> callCustomData;
    private final String callId;
    private final String callType;
    private final String token;
    private final Map<String, Object> userCustomData;
    private final String userId;

    public SipInboundCredentials(@InterfaceC30731q(name = "api_key") String apiKey, @InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = "token") String token, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "call_custom_data") Map<String, ? extends Object> callCustomData, @InterfaceC30731q(name = "user_custom_data") Map<String, ? extends Object> userCustomData) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(callCustomData, "callCustomData");
        AbstractC22676k.m65750j(userCustomData, "userCustomData");
        this.apiKey = apiKey;
        this.callId = callId;
        this.callType = callType;
        this.token = token;
        this.userId = userId;
        this.callCustomData = callCustomData;
        this.userCustomData = userCustomData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SipInboundCredentials copy$default(SipInboundCredentials sipInboundCredentials, String str, String str2, String str3, String str4, String str5, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sipInboundCredentials.apiKey;
        }
        if ((i13 & 2) != 0) {
            str2 = sipInboundCredentials.callId;
        }
        if ((i13 & 4) != 0) {
            str3 = sipInboundCredentials.callType;
        }
        if ((i13 & 8) != 0) {
            str4 = sipInboundCredentials.token;
        }
        if ((i13 & 16) != 0) {
            str5 = sipInboundCredentials.userId;
        }
        if ((i13 & 32) != 0) {
            map = sipInboundCredentials.callCustomData;
        }
        if ((i13 & 64) != 0) {
            map2 = sipInboundCredentials.userCustomData;
        }
        Map map3 = map;
        Map map4 = map2;
        String str6 = str5;
        String str7 = str3;
        return sipInboundCredentials.copy(str, str2, str7, str4, str6, map3, map4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCallType() {
        return this.callType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final Map<String, Object> component6() {
        return this.callCustomData;
    }

    public final Map<String, Object> component7() {
        return this.userCustomData;
    }

    public final SipInboundCredentials copy(@InterfaceC30731q(name = "api_key") String apiKey, @InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = "token") String token, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "call_custom_data") Map<String, ? extends Object> callCustomData, @InterfaceC30731q(name = "user_custom_data") Map<String, ? extends Object> userCustomData) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(callCustomData, "callCustomData");
        AbstractC22676k.m65750j(userCustomData, "userCustomData");
        return new SipInboundCredentials(apiKey, callId, callType, token, userId, callCustomData, userCustomData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SipInboundCredentials)) {
            return false;
        }
        SipInboundCredentials sipInboundCredentials = (SipInboundCredentials) other;
        return AbstractC22676k.m65745e(this.apiKey, sipInboundCredentials.apiKey) && AbstractC22676k.m65745e(this.callId, sipInboundCredentials.callId) && AbstractC22676k.m65745e(this.callType, sipInboundCredentials.callType) && AbstractC22676k.m65745e(this.token, sipInboundCredentials.token) && AbstractC22676k.m65745e(this.userId, sipInboundCredentials.userId) && AbstractC22676k.m65745e(this.callCustomData, sipInboundCredentials.callCustomData) && AbstractC22676k.m65745e(this.userCustomData, sipInboundCredentials.userCustomData);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final Map<String, Object> getCallCustomData() {
        return this.callCustomData;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getCallType() {
        return this.callType;
    }

    public final String getToken() {
        return this.token;
    }

    public final Map<String, Object> getUserCustomData() {
        return this.userCustomData;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userCustomData.hashCode() + AbstractC3855a.m11821e(this.callCustomData, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.apiKey.hashCode() * 31, 31, this.callId), 31, this.callType), 31, this.token), 31, this.userId), 31);
    }

    public String toString() {
        String str = this.apiKey;
        String str2 = this.callId;
        String str3 = this.callType;
        String str4 = this.token;
        String str5 = this.userId;
        Map<String, Object> map = this.callCustomData;
        Map<String, Object> map2 = this.userCustomData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SipInboundCredentials(apiKey=", str, ", callId=", str2, ", callType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", token=", str4, ", userId=");
        AbstractC36095b.m114695w(sbM32001t, str5, ", callCustomData=", map, ", userCustomData=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SipInboundCredentials(String str, String str2, String str3, String str4, String str5, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 32;
        C25272z c25272z = C25272z.f99163w;
        this(str, str2, str3, str4, str5, i14 != 0 ? c25272z : map, (i13 & 64) != 0 ? c25272z : map2);
    }
}
