package io.getstream.android.video.generated.models;

import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003JY\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m65681d2 = {"Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;", "", "sipCallerNumber", "", "sipTrunkNumber", "routingNumber", "trunkId", "challenge", "Lio/getstream/android/video/generated/models/SIPChallengeRequest;", "sipHeaders", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SIPChallengeRequest;Ljava/util/Map;)V", "getChallenge", "()Lio/getstream/android/video/generated/models/SIPChallengeRequest;", "getRoutingNumber", "()Ljava/lang/String;", "getSipCallerNumber", "getSipHeaders", "()Ljava/util/Map;", "getSipTrunkNumber", "getTrunkId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ResolveSipInboundRequest {
    private final SIPChallengeRequest challenge;
    private final String routingNumber;
    private final String sipCallerNumber;
    private final Map<String, String> sipHeaders;
    private final String sipTrunkNumber;
    private final String trunkId;

    public ResolveSipInboundRequest(@InterfaceC30731q(name = "sip_caller_number") String sipCallerNumber, @InterfaceC30731q(name = "sip_trunk_number") String sipTrunkNumber, @InterfaceC30731q(name = "routing_number") String str, @InterfaceC30731q(name = "trunk_id") String str2, @InterfaceC30731q(name = "challenge") SIPChallengeRequest sIPChallengeRequest, @InterfaceC30731q(name = "sip_headers") Map<String, String> map) {
        AbstractC22676k.m65750j(sipCallerNumber, "sipCallerNumber");
        AbstractC22676k.m65750j(sipTrunkNumber, "sipTrunkNumber");
        this.sipCallerNumber = sipCallerNumber;
        this.sipTrunkNumber = sipTrunkNumber;
        this.routingNumber = str;
        this.trunkId = str2;
        this.challenge = sIPChallengeRequest;
        this.sipHeaders = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolveSipInboundRequest copy$default(ResolveSipInboundRequest resolveSipInboundRequest, String str, String str2, String str3, String str4, SIPChallengeRequest sIPChallengeRequest, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = resolveSipInboundRequest.sipCallerNumber;
        }
        if ((i13 & 2) != 0) {
            str2 = resolveSipInboundRequest.sipTrunkNumber;
        }
        if ((i13 & 4) != 0) {
            str3 = resolveSipInboundRequest.routingNumber;
        }
        if ((i13 & 8) != 0) {
            str4 = resolveSipInboundRequest.trunkId;
        }
        if ((i13 & 16) != 0) {
            sIPChallengeRequest = resolveSipInboundRequest.challenge;
        }
        if ((i13 & 32) != 0) {
            map = resolveSipInboundRequest.sipHeaders;
        }
        SIPChallengeRequest sIPChallengeRequest2 = sIPChallengeRequest;
        Map map2 = map;
        return resolveSipInboundRequest.copy(str, str2, str3, str4, sIPChallengeRequest2, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSipCallerNumber() {
        return this.sipCallerNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSipTrunkNumber() {
        return this.sipTrunkNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrunkId() {
        return this.trunkId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SIPChallengeRequest getChallenge() {
        return this.challenge;
    }

    public final Map<String, String> component6() {
        return this.sipHeaders;
    }

    public final ResolveSipInboundRequest copy(@InterfaceC30731q(name = "sip_caller_number") String sipCallerNumber, @InterfaceC30731q(name = "sip_trunk_number") String sipTrunkNumber, @InterfaceC30731q(name = "routing_number") String routingNumber, @InterfaceC30731q(name = "trunk_id") String trunkId, @InterfaceC30731q(name = "challenge") SIPChallengeRequest challenge, @InterfaceC30731q(name = "sip_headers") Map<String, String> sipHeaders) {
        AbstractC22676k.m65750j(sipCallerNumber, "sipCallerNumber");
        AbstractC22676k.m65750j(sipTrunkNumber, "sipTrunkNumber");
        return new ResolveSipInboundRequest(sipCallerNumber, sipTrunkNumber, routingNumber, trunkId, challenge, sipHeaders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolveSipInboundRequest)) {
            return false;
        }
        ResolveSipInboundRequest resolveSipInboundRequest = (ResolveSipInboundRequest) other;
        return AbstractC22676k.m65745e(this.sipCallerNumber, resolveSipInboundRequest.sipCallerNumber) && AbstractC22676k.m65745e(this.sipTrunkNumber, resolveSipInboundRequest.sipTrunkNumber) && AbstractC22676k.m65745e(this.routingNumber, resolveSipInboundRequest.routingNumber) && AbstractC22676k.m65745e(this.trunkId, resolveSipInboundRequest.trunkId) && AbstractC22676k.m65745e(this.challenge, resolveSipInboundRequest.challenge) && AbstractC22676k.m65745e(this.sipHeaders, resolveSipInboundRequest.sipHeaders);
    }

    public final SIPChallengeRequest getChallenge() {
        return this.challenge;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final String getSipCallerNumber() {
        return this.sipCallerNumber;
    }

    public final Map<String, String> getSipHeaders() {
        return this.sipHeaders;
    }

    public final String getSipTrunkNumber() {
        return this.sipTrunkNumber;
    }

    public final String getTrunkId() {
        return this.trunkId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.sipCallerNumber.hashCode() * 31, 31, this.sipTrunkNumber);
        String str = this.routingNumber;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trunkId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SIPChallengeRequest sIPChallengeRequest = this.challenge;
        int iHashCode3 = (iHashCode2 + (sIPChallengeRequest == null ? 0 : sIPChallengeRequest.hashCode())) * 31;
        Map<String, String> map = this.sipHeaders;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.sipCallerNumber;
        String str2 = this.sipTrunkNumber;
        String str3 = this.routingNumber;
        String str4 = this.trunkId;
        SIPChallengeRequest sIPChallengeRequest = this.challenge;
        Map<String, String> map = this.sipHeaders;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ResolveSipInboundRequest(sipCallerNumber=", str, ", sipTrunkNumber=", str2, ", routingNumber=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", trunkId=", str4, ", challenge=");
        sbM32001t.append(sIPChallengeRequest);
        sbM32001t.append(", sipHeaders=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ResolveSipInboundRequest(String str, String str2, String str3, String str4, SIPChallengeRequest sIPChallengeRequest, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : sIPChallengeRequest, (i13 & 32) != 0 ? C25272z.f99163w : map);
    }
}
