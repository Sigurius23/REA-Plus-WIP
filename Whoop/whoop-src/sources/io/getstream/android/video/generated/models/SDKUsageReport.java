package io.getstream.android.video.generated.models;

import java.util.Map;
import m83.C25272z;
import nh3.AbstractC26725a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SDKUsageReport;", "", "perSdkUsage", "", "", "Lio/getstream/android/video/generated/models/PerSDKUsageReport;", "(Ljava/util/Map;)V", "getPerSdkUsage", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SDKUsageReport {
    private final Map<String, PerSDKUsageReport> perSdkUsage;

    /* JADX WARN: Multi-variable type inference failed */
    public SDKUsageReport() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SDKUsageReport copy$default(SDKUsageReport sDKUsageReport, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = sDKUsageReport.perSdkUsage;
        }
        return sDKUsageReport.copy(map);
    }

    public final Map<String, PerSDKUsageReport> component1() {
        return this.perSdkUsage;
    }

    public final SDKUsageReport copy(@InterfaceC30731q(name = "per_sdk_usage") Map<String, PerSDKUsageReport> perSdkUsage) {
        AbstractC22676k.m65750j(perSdkUsage, "perSdkUsage");
        return new SDKUsageReport(perSdkUsage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SDKUsageReport) && AbstractC22676k.m65745e(this.perSdkUsage, ((SDKUsageReport) other).perSdkUsage);
    }

    public final Map<String, PerSDKUsageReport> getPerSdkUsage() {
        return this.perSdkUsage;
    }

    public int hashCode() {
        return this.perSdkUsage.hashCode();
    }

    public String toString() {
        return AbstractC26725a.m79504h("SDKUsageReport(perSdkUsage=", ")", this.perSdkUsage);
    }

    public SDKUsageReport(@InterfaceC30731q(name = "per_sdk_usage") Map<String, PerSDKUsageReport> perSdkUsage) {
        AbstractC22676k.m65750j(perSdkUsage, "perSdkUsage");
        this.perSdkUsage = perSdkUsage;
    }

    public /* synthetic */ SDKUsageReport(Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map);
    }
}
