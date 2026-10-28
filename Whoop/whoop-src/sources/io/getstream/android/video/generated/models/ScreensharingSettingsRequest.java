package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;", "", "accessRequestEnabled", "", "enabled", "targetResolution", "Lio/getstream/android/video/generated/models/TargetResolution;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)V", "getAccessRequestEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnabled", "getTargetResolution", "()Lio/getstream/android/video/generated/models/TargetResolution;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/TargetResolution;)Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;", "equals", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ScreensharingSettingsRequest {
    private final Boolean accessRequestEnabled;
    private final Boolean enabled;
    private final TargetResolution targetResolution;

    public ScreensharingSettingsRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ScreensharingSettingsRequest copy$default(ScreensharingSettingsRequest screensharingSettingsRequest, Boolean bool, Boolean bool2, TargetResolution targetResolution, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = screensharingSettingsRequest.accessRequestEnabled;
        }
        if ((i13 & 2) != 0) {
            bool2 = screensharingSettingsRequest.enabled;
        }
        if ((i13 & 4) != 0) {
            targetResolution = screensharingSettingsRequest.targetResolution;
        }
        return screensharingSettingsRequest.copy(bool, bool2, targetResolution);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TargetResolution getTargetResolution() {
        return this.targetResolution;
    }

    public final ScreensharingSettingsRequest copy(@InterfaceC30731q(name = "access_request_enabled") Boolean accessRequestEnabled, @InterfaceC30731q(name = "enabled") Boolean enabled, @InterfaceC30731q(name = "target_resolution") TargetResolution targetResolution) {
        return new ScreensharingSettingsRequest(accessRequestEnabled, enabled, targetResolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreensharingSettingsRequest)) {
            return false;
        }
        ScreensharingSettingsRequest screensharingSettingsRequest = (ScreensharingSettingsRequest) other;
        return AbstractC22676k.m65745e(this.accessRequestEnabled, screensharingSettingsRequest.accessRequestEnabled) && AbstractC22676k.m65745e(this.enabled, screensharingSettingsRequest.enabled) && AbstractC22676k.m65745e(this.targetResolution, screensharingSettingsRequest.targetResolution);
    }

    public final Boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final TargetResolution getTargetResolution() {
        return this.targetResolution;
    }

    public int hashCode() {
        Boolean bool = this.accessRequestEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enabled;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        TargetResolution targetResolution = this.targetResolution;
        return iHashCode2 + (targetResolution != null ? targetResolution.hashCode() : 0);
    }

    public String toString() {
        return "ScreensharingSettingsRequest(accessRequestEnabled=" + this.accessRequestEnabled + ", enabled=" + this.enabled + ", targetResolution=" + this.targetResolution + ")";
    }

    public ScreensharingSettingsRequest(@InterfaceC30731q(name = "access_request_enabled") Boolean bool, @InterfaceC30731q(name = "enabled") Boolean bool2, @InterfaceC30731q(name = "target_resolution") TargetResolution targetResolution) {
        this.accessRequestEnabled = bool;
        this.enabled = bool2;
        this.targetResolution = targetResolution;
    }

    public /* synthetic */ ScreensharingSettingsRequest(Boolean bool, Boolean bool2, TargetResolution targetResolution, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : bool2, (i13 & 4) != 0 ? null : targetResolution);
    }
}
