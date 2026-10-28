package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ResolveSipInboundResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "credentials", "Lio/getstream/android/video/generated/models/SipInboundCredentials;", "sipRoutingRule", "Lio/getstream/android/video/generated/models/SIPInboundRoutingRuleResponse;", "sipTrunk", "Lio/getstream/android/video/generated/models/SIPTrunkResponse;", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/SipInboundCredentials;Lio/getstream/android/video/generated/models/SIPInboundRoutingRuleResponse;Lio/getstream/android/video/generated/models/SIPTrunkResponse;)V", "getCredentials", "()Lio/getstream/android/video/generated/models/SipInboundCredentials;", "getDuration", "()Ljava/lang/String;", "getSipRoutingRule", "()Lio/getstream/android/video/generated/models/SIPInboundRoutingRuleResponse;", "getSipTrunk", "()Lio/getstream/android/video/generated/models/SIPTrunkResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ResolveSipInboundResponse {
    private final SipInboundCredentials credentials;
    private final String duration;
    private final SIPInboundRoutingRuleResponse sipRoutingRule;
    private final SIPTrunkResponse sipTrunk;

    public ResolveSipInboundResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "credentials") SipInboundCredentials credentials, @InterfaceC30731q(name = "sip_routing_rule") SIPInboundRoutingRuleResponse sIPInboundRoutingRuleResponse, @InterfaceC30731q(name = "sip_trunk") SIPTrunkResponse sIPTrunkResponse) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(credentials, "credentials");
        this.duration = duration;
        this.credentials = credentials;
        this.sipRoutingRule = sIPInboundRoutingRuleResponse;
        this.sipTrunk = sIPTrunkResponse;
    }

    public static /* synthetic */ ResolveSipInboundResponse copy$default(ResolveSipInboundResponse resolveSipInboundResponse, String str, SipInboundCredentials sipInboundCredentials, SIPInboundRoutingRuleResponse sIPInboundRoutingRuleResponse, SIPTrunkResponse sIPTrunkResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = resolveSipInboundResponse.duration;
        }
        if ((i13 & 2) != 0) {
            sipInboundCredentials = resolveSipInboundResponse.credentials;
        }
        if ((i13 & 4) != 0) {
            sIPInboundRoutingRuleResponse = resolveSipInboundResponse.sipRoutingRule;
        }
        if ((i13 & 8) != 0) {
            sIPTrunkResponse = resolveSipInboundResponse.sipTrunk;
        }
        return resolveSipInboundResponse.copy(str, sipInboundCredentials, sIPInboundRoutingRuleResponse, sIPTrunkResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SipInboundCredentials getCredentials() {
        return this.credentials;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SIPInboundRoutingRuleResponse getSipRoutingRule() {
        return this.sipRoutingRule;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SIPTrunkResponse getSipTrunk() {
        return this.sipTrunk;
    }

    public final ResolveSipInboundResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "credentials") SipInboundCredentials credentials, @InterfaceC30731q(name = "sip_routing_rule") SIPInboundRoutingRuleResponse sipRoutingRule, @InterfaceC30731q(name = "sip_trunk") SIPTrunkResponse sipTrunk) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(credentials, "credentials");
        return new ResolveSipInboundResponse(duration, credentials, sipRoutingRule, sipTrunk);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolveSipInboundResponse)) {
            return false;
        }
        ResolveSipInboundResponse resolveSipInboundResponse = (ResolveSipInboundResponse) other;
        return AbstractC22676k.m65745e(this.duration, resolveSipInboundResponse.duration) && AbstractC22676k.m65745e(this.credentials, resolveSipInboundResponse.credentials) && AbstractC22676k.m65745e(this.sipRoutingRule, resolveSipInboundResponse.sipRoutingRule) && AbstractC22676k.m65745e(this.sipTrunk, resolveSipInboundResponse.sipTrunk);
    }

    public final SipInboundCredentials getCredentials() {
        return this.credentials;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final SIPInboundRoutingRuleResponse getSipRoutingRule() {
        return this.sipRoutingRule;
    }

    public final SIPTrunkResponse getSipTrunk() {
        return this.sipTrunk;
    }

    public int hashCode() {
        int iHashCode = (this.credentials.hashCode() + (this.duration.hashCode() * 31)) * 31;
        SIPInboundRoutingRuleResponse sIPInboundRoutingRuleResponse = this.sipRoutingRule;
        int iHashCode2 = (iHashCode + (sIPInboundRoutingRuleResponse == null ? 0 : sIPInboundRoutingRuleResponse.hashCode())) * 31;
        SIPTrunkResponse sIPTrunkResponse = this.sipTrunk;
        return iHashCode2 + (sIPTrunkResponse != null ? sIPTrunkResponse.hashCode() : 0);
    }

    public String toString() {
        return "ResolveSipInboundResponse(duration=" + this.duration + ", credentials=" + this.credentials + ", sipRoutingRule=" + this.sipRoutingRule + ", sipTrunk=" + this.sipTrunk + ")";
    }

    public /* synthetic */ ResolveSipInboundResponse(String str, SipInboundCredentials sipInboundCredentials, SIPInboundRoutingRuleResponse sIPInboundRoutingRuleResponse, SIPTrunkResponse sIPTrunkResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sipInboundCredentials, (i13 & 4) != 0 ? null : sIPInboundRoutingRuleResponse, (i13 & 8) != 0 ? null : sIPTrunkResponse);
    }
}
