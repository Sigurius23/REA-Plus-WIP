package io.getstream.android.video.generated.models;

import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/android/video/generated/models/MetricDescriptor;", "", "label", "", "description", "unit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getLabel", "getUnit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class MetricDescriptor {
    private final String description;
    private final String label;
    private final String unit;

    public MetricDescriptor(@InterfaceC30731q(name = "label") String label, @InterfaceC30731q(name = "description") String str, @InterfaceC30731q(name = "unit") String str2) {
        AbstractC22676k.m65750j(label, "label");
        this.label = label;
        this.description = str;
        this.unit = str2;
    }

    public static /* synthetic */ MetricDescriptor copy$default(MetricDescriptor metricDescriptor, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = metricDescriptor.label;
        }
        if ((i13 & 2) != 0) {
            str2 = metricDescriptor.description;
        }
        if ((i13 & 4) != 0) {
            str3 = metricDescriptor.unit;
        }
        return metricDescriptor.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final MetricDescriptor copy(@InterfaceC30731q(name = "label") String label, @InterfaceC30731q(name = "description") String description, @InterfaceC30731q(name = "unit") String unit) {
        AbstractC22676k.m65750j(label, "label");
        return new MetricDescriptor(label, description, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricDescriptor)) {
            return false;
        }
        MetricDescriptor metricDescriptor = (MetricDescriptor) other;
        return AbstractC22676k.m65745e(this.label, metricDescriptor.label) && AbstractC22676k.m65745e(this.description, metricDescriptor.description) && AbstractC22676k.m65745e(this.unit, metricDescriptor.unit);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unit;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.unit, ")", AbstractC11895b.m32001t("MetricDescriptor(label=", this.label, ", description=", this.description, ", unit="));
    }

    public /* synthetic */ MetricDescriptor(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
    }
}
