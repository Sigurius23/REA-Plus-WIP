package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/HLSSettingsResponse;", "", "autoOn", "", "enabled", "qualityTracks", "", "", "(ZZLjava/util/List;)V", "getAutoOn", "()Z", "getEnabled", "getQualityTracks", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class HLSSettingsResponse {
    private final boolean autoOn;
    private final boolean enabled;
    private final List<String> qualityTracks;

    public HLSSettingsResponse(@InterfaceC30731q(name = "auto_on") boolean z4, @InterfaceC30731q(name = "enabled") boolean z13, @InterfaceC30731q(name = "quality_tracks") List<String> qualityTracks) {
        AbstractC22676k.m65750j(qualityTracks, "qualityTracks");
        this.autoOn = z4;
        this.enabled = z13;
        this.qualityTracks = qualityTracks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HLSSettingsResponse copy$default(HLSSettingsResponse hLSSettingsResponse, boolean z4, boolean z13, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hLSSettingsResponse.autoOn;
        }
        if ((i13 & 2) != 0) {
            z13 = hLSSettingsResponse.enabled;
        }
        if ((i13 & 4) != 0) {
            list = hLSSettingsResponse.qualityTracks;
        }
        return hLSSettingsResponse.copy(z4, z13, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAutoOn() {
        return this.autoOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<String> component3() {
        return this.qualityTracks;
    }

    public final HLSSettingsResponse copy(@InterfaceC30731q(name = "auto_on") boolean autoOn, @InterfaceC30731q(name = "enabled") boolean enabled, @InterfaceC30731q(name = "quality_tracks") List<String> qualityTracks) {
        AbstractC22676k.m65750j(qualityTracks, "qualityTracks");
        return new HLSSettingsResponse(autoOn, enabled, qualityTracks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HLSSettingsResponse)) {
            return false;
        }
        HLSSettingsResponse hLSSettingsResponse = (HLSSettingsResponse) other;
        return this.autoOn == hLSSettingsResponse.autoOn && this.enabled == hLSSettingsResponse.enabled && AbstractC22676k.m65745e(this.qualityTracks, hLSSettingsResponse.qualityTracks);
    }

    public final boolean getAutoOn() {
        return this.autoOn;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<String> getQualityTracks() {
        return this.qualityTracks;
    }

    public int hashCode() {
        return this.qualityTracks.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.autoOn) * 31, 31, this.enabled);
    }

    public String toString() {
        boolean z4 = this.autoOn;
        boolean z13 = this.enabled;
        return AbstractC3855a.m11829m(AbstractC11895b.m32002u("HLSSettingsResponse(autoOn=", ", enabled=", ", qualityTracks=", z4, z13), this.qualityTracks, ")");
    }

    public /* synthetic */ HLSSettingsResponse(boolean z4, boolean z13, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, z13, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
