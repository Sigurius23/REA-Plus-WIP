package io.getstream.android.video.generated.models;

import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;", "", "enabled", "", "defaultPin", "", "maxAttempts", "", "requiredPinDigits", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDefaultPin", "()Ljava/lang/String;", "getEnabled", "()Z", "getMaxAttempts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRequiredPinDigits", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/SIPPinProtectionConfigsResponse;", "equals", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SIPPinProtectionConfigsResponse {
    private final String defaultPin;
    private final boolean enabled;
    private final Integer maxAttempts;
    private final Integer requiredPinDigits;

    public SIPPinProtectionConfigsResponse(@InterfaceC30731q(name = "enabled") boolean z4, @InterfaceC30731q(name = "default_pin") String str, @InterfaceC30731q(name = "max_attempts") Integer num, @InterfaceC30731q(name = "required_pin_digits") Integer num2) {
        this.enabled = z4;
        this.defaultPin = str;
        this.maxAttempts = num;
        this.requiredPinDigits = num2;
    }

    public static /* synthetic */ SIPPinProtectionConfigsResponse copy$default(SIPPinProtectionConfigsResponse sIPPinProtectionConfigsResponse, boolean z4, String str, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = sIPPinProtectionConfigsResponse.enabled;
        }
        if ((i13 & 2) != 0) {
            str = sIPPinProtectionConfigsResponse.defaultPin;
        }
        if ((i13 & 4) != 0) {
            num = sIPPinProtectionConfigsResponse.maxAttempts;
        }
        if ((i13 & 8) != 0) {
            num2 = sIPPinProtectionConfigsResponse.requiredPinDigits;
        }
        return sIPPinProtectionConfigsResponse.copy(z4, str, num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultPin() {
        return this.defaultPin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getRequiredPinDigits() {
        return this.requiredPinDigits;
    }

    public final SIPPinProtectionConfigsResponse copy(@InterfaceC30731q(name = "enabled") boolean enabled, @InterfaceC30731q(name = "default_pin") String defaultPin, @InterfaceC30731q(name = "max_attempts") Integer maxAttempts, @InterfaceC30731q(name = "required_pin_digits") Integer requiredPinDigits) {
        return new SIPPinProtectionConfigsResponse(enabled, defaultPin, maxAttempts, requiredPinDigits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SIPPinProtectionConfigsResponse)) {
            return false;
        }
        SIPPinProtectionConfigsResponse sIPPinProtectionConfigsResponse = (SIPPinProtectionConfigsResponse) other;
        return this.enabled == sIPPinProtectionConfigsResponse.enabled && AbstractC22676k.m65745e(this.defaultPin, sIPPinProtectionConfigsResponse.defaultPin) && AbstractC22676k.m65745e(this.maxAttempts, sIPPinProtectionConfigsResponse.maxAttempts) && AbstractC22676k.m65745e(this.requiredPinDigits, sIPPinProtectionConfigsResponse.requiredPinDigits);
    }

    public final String getDefaultPin() {
        return this.defaultPin;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    public final Integer getRequiredPinDigits() {
        return this.requiredPinDigits;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        String str = this.defaultPin;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxAttempts;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.requiredPinDigits;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.enabled;
        String str = this.defaultPin;
        Integer num = this.maxAttempts;
        Integer num2 = this.requiredPinDigits;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("SIPPinProtectionConfigsResponse(enabled=", ", defaultPin=", str, ", maxAttempts=", z4);
        sbM38567n.append(num);
        sbM38567n.append(", requiredPinDigits=");
        sbM38567n.append(num2);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public /* synthetic */ SIPPinProtectionConfigsResponse(boolean z4, String str, Integer num, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : num2);
    }
}
