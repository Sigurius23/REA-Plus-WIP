package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/android/video/generated/models/QualityScoreReport;", "", "histogram", "", "Lio/getstream/android/video/generated/models/ReportByHistogramBucket;", "(Ljava/util/List;)V", "getHistogram", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QualityScoreReport {
    private final List<ReportByHistogramBucket> histogram;

    /* JADX WARN: Multi-variable type inference failed */
    public QualityScoreReport() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QualityScoreReport copy$default(QualityScoreReport qualityScoreReport, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = qualityScoreReport.histogram;
        }
        return qualityScoreReport.copy(list);
    }

    public final List<ReportByHistogramBucket> component1() {
        return this.histogram;
    }

    public final QualityScoreReport copy(@InterfaceC30731q(name = "histogram") List<ReportByHistogramBucket> histogram) {
        AbstractC22676k.m65750j(histogram, "histogram");
        return new QualityScoreReport(histogram);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QualityScoreReport) && AbstractC22676k.m65745e(this.histogram, ((QualityScoreReport) other).histogram);
    }

    public final List<ReportByHistogramBucket> getHistogram() {
        return this.histogram;
    }

    public int hashCode() {
        return this.histogram.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("QualityScoreReport(histogram=", ")", this.histogram);
    }

    public QualityScoreReport(@InterfaceC30731q(name = "histogram") List<ReportByHistogramBucket> histogram) {
        AbstractC22676k.m65750j(histogram, "histogram");
        this.histogram = histogram;
    }

    public /* synthetic */ QualityScoreReport(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list);
    }
}
