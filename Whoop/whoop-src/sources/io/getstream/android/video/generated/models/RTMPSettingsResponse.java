package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RTMPSettingsResponse;", "", "enabled", "", "quality", "", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getQuality", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class RTMPSettingsResponse {
    private final boolean enabled;
    private final String quality;

    public RTMPSettingsResponse(@InterfaceC30731q(name = "enabled") boolean z4, @InterfaceC30731q(name = "quality") String quality) {
        AbstractC22676k.m65750j(quality, "quality");
        this.enabled = z4;
        this.quality = quality;
    }

    public static /* synthetic */ RTMPSettingsResponse copy$default(RTMPSettingsResponse rTMPSettingsResponse, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = rTMPSettingsResponse.enabled;
        }
        if ((i13 & 2) != 0) {
            str = rTMPSettingsResponse.quality;
        }
        return rTMPSettingsResponse.copy(z4, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuality() {
        return this.quality;
    }

    public final RTMPSettingsResponse copy(@InterfaceC30731q(name = "enabled") boolean enabled, @InterfaceC30731q(name = "quality") String quality) {
        AbstractC22676k.m65750j(quality, "quality");
        return new RTMPSettingsResponse(enabled, quality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RTMPSettingsResponse)) {
            return false;
        }
        RTMPSettingsResponse rTMPSettingsResponse = (RTMPSettingsResponse) other;
        return this.enabled == rTMPSettingsResponse.enabled && AbstractC22676k.m65745e(this.quality, rTMPSettingsResponse.quality);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return this.quality.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }

    public String toString() {
        return AbstractC3855a.m11825i("RTMPSettingsResponse(enabled=", ", quality=", this.quality, ")", this.enabled);
    }
}
