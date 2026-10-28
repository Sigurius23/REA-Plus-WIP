package io.getstream.android.video.generated.models;

import java.util.Map;
import m83.C25272z;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/PerSDKUsageReport;", "", "total", "", "byVersion", "", "", "(ILjava/util/Map;)V", "getByVersion", "()Ljava/util/Map;", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class PerSDKUsageReport {
    private final Map<String, Integer> byVersion;
    private final int total;

    public PerSDKUsageReport(@InterfaceC30731q(name = "total") int i13, @InterfaceC30731q(name = "by_version") Map<String, Integer> byVersion) {
        AbstractC22676k.m65750j(byVersion, "byVersion");
        this.total = i13;
        this.byVersion = byVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerSDKUsageReport copy$default(PerSDKUsageReport perSDKUsageReport, int i13, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = perSDKUsageReport.total;
        }
        if ((i14 & 2) != 0) {
            map = perSDKUsageReport.byVersion;
        }
        return perSDKUsageReport.copy(i13, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final Map<String, Integer> component2() {
        return this.byVersion;
    }

    public final PerSDKUsageReport copy(@InterfaceC30731q(name = "total") int total, @InterfaceC30731q(name = "by_version") Map<String, Integer> byVersion) {
        AbstractC22676k.m65750j(byVersion, "byVersion");
        return new PerSDKUsageReport(total, byVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerSDKUsageReport)) {
            return false;
        }
        PerSDKUsageReport perSDKUsageReport = (PerSDKUsageReport) other;
        return this.total == perSDKUsageReport.total && AbstractC22676k.m65745e(this.byVersion, perSDKUsageReport.byVersion);
    }

    public final Map<String, Integer> getByVersion() {
        return this.byVersion;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return this.byVersion.hashCode() + (Integer.hashCode(this.total) * 31);
    }

    public String toString() {
        return "PerSDKUsageReport(total=" + this.total + ", byVersion=" + this.byVersion + ")";
    }

    public /* synthetic */ PerSDKUsageReport(int i13, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? C25272z.f99163w : map);
    }
}
