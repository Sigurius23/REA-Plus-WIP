package io.getstream.android.video.generated.models;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ScreensharingSettingsResponse;", "", "accessRequestEnabled", "", "enabled", "targetResolution", "Lio/getstream/android/video/generated/models/TargetResolution;", "(ZZLio/getstream/android/video/generated/models/TargetResolution;)V", "getAccessRequestEnabled", "()Z", "getEnabled", "getTargetResolution", "()Lio/getstream/android/video/generated/models/TargetResolution;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ScreensharingSettingsResponse {
    private final boolean accessRequestEnabled;
    private final boolean enabled;
    private final TargetResolution targetResolution;

    public ScreensharingSettingsResponse(@InterfaceC30731q(name = "access_request_enabled") boolean z4, @InterfaceC30731q(name = "enabled") boolean z13, @InterfaceC30731q(name = "target_resolution") TargetResolution targetResolution) {
        this.accessRequestEnabled = z4;
        this.enabled = z13;
        this.targetResolution = targetResolution;
    }

    public static /* synthetic */ ScreensharingSettingsResponse copy$default(ScreensharingSettingsResponse screensharingSettingsResponse, boolean z4, boolean z13, TargetResolution targetResolution, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = screensharingSettingsResponse.accessRequestEnabled;
        }
        if ((i13 & 2) != 0) {
            z13 = screensharingSettingsResponse.enabled;
        }
        if ((i13 & 4) != 0) {
            targetResolution = screensharingSettingsResponse.targetResolution;
        }
        return screensharingSettingsResponse.copy(z4, z13, targetResolution);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TargetResolution getTargetResolution() {
        return this.targetResolution;
    }

    public final ScreensharingSettingsResponse copy(@InterfaceC30731q(name = "access_request_enabled") boolean accessRequestEnabled, @InterfaceC30731q(name = "enabled") boolean enabled, @InterfaceC30731q(name = "target_resolution") TargetResolution targetResolution) {
        return new ScreensharingSettingsResponse(accessRequestEnabled, enabled, targetResolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreensharingSettingsResponse)) {
            return false;
        }
        ScreensharingSettingsResponse screensharingSettingsResponse = (ScreensharingSettingsResponse) other;
        return this.accessRequestEnabled == screensharingSettingsResponse.accessRequestEnabled && this.enabled == screensharingSettingsResponse.enabled && AbstractC22676k.m65745e(this.targetResolution, screensharingSettingsResponse.targetResolution);
    }

    public final boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final TargetResolution getTargetResolution() {
        return this.targetResolution;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.accessRequestEnabled) * 31, 31, this.enabled);
        TargetResolution targetResolution = this.targetResolution;
        return iM8289b + (targetResolution == null ? 0 : targetResolution.hashCode());
    }

    public String toString() {
        boolean z4 = this.accessRequestEnabled;
        boolean z13 = this.enabled;
        TargetResolution targetResolution = this.targetResolution;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ScreensharingSettingsResponse(accessRequestEnabled=", ", enabled=", ", targetResolution=", z4, z13);
        sbM32002u.append(targetResolution);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ ScreensharingSettingsResponse(boolean z4, boolean z13, TargetResolution targetResolution, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, z13, (i13 & 4) != 0 ? null : targetResolution);
    }
}
