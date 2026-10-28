package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SIPInboundRoutingRulePinConfigsResponse;", "", "customWebhookUrl", "", "pinFailedAttemptPrompt", "pinHangupPrompt", "pinPrompt", "pinSuccessPrompt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomWebhookUrl", "()Ljava/lang/String;", "getPinFailedAttemptPrompt", "getPinHangupPrompt", "getPinPrompt", "getPinSuccessPrompt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SIPInboundRoutingRulePinConfigsResponse {
    private final String customWebhookUrl;
    private final String pinFailedAttemptPrompt;
    private final String pinHangupPrompt;
    private final String pinPrompt;
    private final String pinSuccessPrompt;

    public SIPInboundRoutingRulePinConfigsResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SIPInboundRoutingRulePinConfigsResponse copy$default(SIPInboundRoutingRulePinConfigsResponse sIPInboundRoutingRulePinConfigsResponse, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sIPInboundRoutingRulePinConfigsResponse.customWebhookUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = sIPInboundRoutingRulePinConfigsResponse.pinFailedAttemptPrompt;
        }
        if ((i13 & 4) != 0) {
            str3 = sIPInboundRoutingRulePinConfigsResponse.pinHangupPrompt;
        }
        if ((i13 & 8) != 0) {
            str4 = sIPInboundRoutingRulePinConfigsResponse.pinPrompt;
        }
        if ((i13 & 16) != 0) {
            str5 = sIPInboundRoutingRulePinConfigsResponse.pinSuccessPrompt;
        }
        String str6 = str5;
        String str7 = str3;
        return sIPInboundRoutingRulePinConfigsResponse.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomWebhookUrl() {
        return this.customWebhookUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPinFailedAttemptPrompt() {
        return this.pinFailedAttemptPrompt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPinHangupPrompt() {
        return this.pinHangupPrompt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPinPrompt() {
        return this.pinPrompt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPinSuccessPrompt() {
        return this.pinSuccessPrompt;
    }

    public final SIPInboundRoutingRulePinConfigsResponse copy(@InterfaceC30731q(name = "custom_webhook_url") String customWebhookUrl, @InterfaceC30731q(name = "pin_failed_attempt_prompt") String pinFailedAttemptPrompt, @InterfaceC30731q(name = "pin_hangup_prompt") String pinHangupPrompt, @InterfaceC30731q(name = "pin_prompt") String pinPrompt, @InterfaceC30731q(name = "pin_success_prompt") String pinSuccessPrompt) {
        return new SIPInboundRoutingRulePinConfigsResponse(customWebhookUrl, pinFailedAttemptPrompt, pinHangupPrompt, pinPrompt, pinSuccessPrompt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SIPInboundRoutingRulePinConfigsResponse)) {
            return false;
        }
        SIPInboundRoutingRulePinConfigsResponse sIPInboundRoutingRulePinConfigsResponse = (SIPInboundRoutingRulePinConfigsResponse) other;
        return AbstractC22676k.m65745e(this.customWebhookUrl, sIPInboundRoutingRulePinConfigsResponse.customWebhookUrl) && AbstractC22676k.m65745e(this.pinFailedAttemptPrompt, sIPInboundRoutingRulePinConfigsResponse.pinFailedAttemptPrompt) && AbstractC22676k.m65745e(this.pinHangupPrompt, sIPInboundRoutingRulePinConfigsResponse.pinHangupPrompt) && AbstractC22676k.m65745e(this.pinPrompt, sIPInboundRoutingRulePinConfigsResponse.pinPrompt) && AbstractC22676k.m65745e(this.pinSuccessPrompt, sIPInboundRoutingRulePinConfigsResponse.pinSuccessPrompt);
    }

    public final String getCustomWebhookUrl() {
        return this.customWebhookUrl;
    }

    public final String getPinFailedAttemptPrompt() {
        return this.pinFailedAttemptPrompt;
    }

    public final String getPinHangupPrompt() {
        return this.pinHangupPrompt;
    }

    public final String getPinPrompt() {
        return this.pinPrompt;
    }

    public final String getPinSuccessPrompt() {
        return this.pinSuccessPrompt;
    }

    public int hashCode() {
        String str = this.customWebhookUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pinFailedAttemptPrompt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pinHangupPrompt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pinPrompt;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pinSuccessPrompt;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.customWebhookUrl;
        String str2 = this.pinFailedAttemptPrompt;
        String str3 = this.pinHangupPrompt;
        String str4 = this.pinPrompt;
        String str5 = this.pinSuccessPrompt;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SIPInboundRoutingRulePinConfigsResponse(customWebhookUrl=", str, ", pinFailedAttemptPrompt=", str2, ", pinHangupPrompt=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", pinPrompt=", str4, ", pinSuccessPrompt=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public SIPInboundRoutingRulePinConfigsResponse(@InterfaceC30731q(name = "custom_webhook_url") String str, @InterfaceC30731q(name = "pin_failed_attempt_prompt") String str2, @InterfaceC30731q(name = "pin_hangup_prompt") String str3, @InterfaceC30731q(name = "pin_prompt") String str4, @InterfaceC30731q(name = "pin_success_prompt") String str5) {
        this.customWebhookUrl = str;
        this.pinFailedAttemptPrompt = str2;
        this.pinHangupPrompt = str3;
        this.pinPrompt = str4;
        this.pinSuccessPrompt = str5;
    }

    public /* synthetic */ SIPInboundRoutingRulePinConfigsResponse(String str, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5);
    }
}
