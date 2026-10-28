package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ThumbnailsSettingsResponse;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ThumbnailsSettingsResponse {
    private final boolean enabled;

    public ThumbnailsSettingsResponse(@InterfaceC30731q(name = "enabled") boolean z4) {
        this.enabled = z4;
    }

    public static /* synthetic */ ThumbnailsSettingsResponse copy$default(ThumbnailsSettingsResponse thumbnailsSettingsResponse, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = thumbnailsSettingsResponse.enabled;
        }
        return thumbnailsSettingsResponse.copy(z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ThumbnailsSettingsResponse copy(@InterfaceC30731q(name = "enabled") boolean enabled) {
        return new ThumbnailsSettingsResponse(enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThumbnailsSettingsResponse) && this.enabled == ((ThumbnailsSettingsResponse) other).enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return AbstractC3855a.m11827k("ThumbnailsSettingsResponse(enabled=", ")", this.enabled);
    }
}
