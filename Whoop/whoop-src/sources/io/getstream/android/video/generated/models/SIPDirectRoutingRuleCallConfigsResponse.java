package io.getstream.android.video.generated.models;

import p031b9.AbstractC2875y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SIPDirectRoutingRuleCallConfigsResponse;", "", "callId", "", "callType", "(Ljava/lang/String;Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getCallType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SIPDirectRoutingRuleCallConfigsResponse {
    private final String callId;
    private final String callType;

    public SIPDirectRoutingRuleCallConfigsResponse(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_type") String callType) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callType, "callType");
        this.callId = callId;
        this.callType = callType;
    }

    public static /* synthetic */ SIPDirectRoutingRuleCallConfigsResponse copy$default(SIPDirectRoutingRuleCallConfigsResponse sIPDirectRoutingRuleCallConfigsResponse, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sIPDirectRoutingRuleCallConfigsResponse.callId;
        }
        if ((i13 & 2) != 0) {
            str2 = sIPDirectRoutingRuleCallConfigsResponse.callType;
        }
        return sIPDirectRoutingRuleCallConfigsResponse.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCallType() {
        return this.callType;
    }

    public final SIPDirectRoutingRuleCallConfigsResponse copy(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_type") String callType) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callType, "callType");
        return new SIPDirectRoutingRuleCallConfigsResponse(callId, callType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SIPDirectRoutingRuleCallConfigsResponse)) {
            return false;
        }
        SIPDirectRoutingRuleCallConfigsResponse sIPDirectRoutingRuleCallConfigsResponse = (SIPDirectRoutingRuleCallConfigsResponse) other;
        return AbstractC22676k.m65745e(this.callId, sIPDirectRoutingRuleCallConfigsResponse.callId) && AbstractC22676k.m65745e(this.callType, sIPDirectRoutingRuleCallConfigsResponse.callType);
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getCallType() {
        return this.callType;
    }

    public int hashCode() {
        return this.callType.hashCode() + (this.callId.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("SIPDirectRoutingRuleCallConfigsResponse(callId=", this.callId, ", callType=", this.callType, ")");
    }
}
