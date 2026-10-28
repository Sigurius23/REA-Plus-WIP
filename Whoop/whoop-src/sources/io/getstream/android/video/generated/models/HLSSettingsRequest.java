package io.getstream.android.video.generated.models;

import d13.AbstractC11478a;
import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ6\u0010\u0012\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/android/video/generated/models/HLSSettingsRequest;", "", "qualityTracks", "", "", "autoOn", "", "enabled", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAutoOn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnabled", "getQualityTracks", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/HLSSettingsRequest;", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class HLSSettingsRequest {
    private final Boolean autoOn;
    private final Boolean enabled;
    private final List<String> qualityTracks;

    public HLSSettingsRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HLSSettingsRequest copy$default(HLSSettingsRequest hLSSettingsRequest, List list, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = hLSSettingsRequest.qualityTracks;
        }
        if ((i13 & 2) != 0) {
            bool = hLSSettingsRequest.autoOn;
        }
        if ((i13 & 4) != 0) {
            bool2 = hLSSettingsRequest.enabled;
        }
        return hLSSettingsRequest.copy(list, bool, bool2);
    }

    public final List<String> component1() {
        return this.qualityTracks;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAutoOn() {
        return this.autoOn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final HLSSettingsRequest copy(@InterfaceC30731q(name = "quality_tracks") List<String> qualityTracks, @InterfaceC30731q(name = "auto_on") Boolean autoOn, @InterfaceC30731q(name = "enabled") Boolean enabled) {
        AbstractC22676k.m65750j(qualityTracks, "qualityTracks");
        return new HLSSettingsRequest(qualityTracks, autoOn, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HLSSettingsRequest)) {
            return false;
        }
        HLSSettingsRequest hLSSettingsRequest = (HLSSettingsRequest) other;
        return AbstractC22676k.m65745e(this.qualityTracks, hLSSettingsRequest.qualityTracks) && AbstractC22676k.m65745e(this.autoOn, hLSSettingsRequest.autoOn) && AbstractC22676k.m65745e(this.enabled, hLSSettingsRequest.enabled);
    }

    public final Boolean getAutoOn() {
        return this.autoOn;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final List<String> getQualityTracks() {
        return this.qualityTracks;
    }

    public int hashCode() {
        int iHashCode = this.qualityTracks.hashCode() * 31;
        Boolean bool = this.autoOn;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enabled;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.qualityTracks;
        Boolean bool = this.autoOn;
        Boolean bool2 = this.enabled;
        StringBuilder sb4 = new StringBuilder("HLSSettingsRequest(qualityTracks=");
        sb4.append(list);
        sb4.append(", autoOn=");
        sb4.append(bool);
        sb4.append(", enabled=");
        return AbstractC11478a.m30858j(sb4, bool2, ")");
    }

    public HLSSettingsRequest(@InterfaceC30731q(name = "quality_tracks") List<String> qualityTracks, @InterfaceC30731q(name = "auto_on") Boolean bool, @InterfaceC30731q(name = "enabled") Boolean bool2) {
        AbstractC22676k.m65750j(qualityTracks, "qualityTracks");
        this.qualityTracks = qualityTracks;
        this.autoOn = bool;
        this.enabled = bool2;
    }

    public /* synthetic */ HLSSettingsRequest(List list, Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : bool2);
    }
}
