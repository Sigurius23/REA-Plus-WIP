package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006 "}, m65681d2 = {"Lio/getstream/android/video/generated/models/ReportByHistogramBucket;", "", "category", "", "count", "", "sum", "", "lowerBound", "Lio/getstream/android/video/generated/models/Bound;", "upperBound", "(Ljava/lang/String;IFLio/getstream/android/video/generated/models/Bound;Lio/getstream/android/video/generated/models/Bound;)V", "getCategory", "()Ljava/lang/String;", "getCount", "()I", "getLowerBound", "()Lio/getstream/android/video/generated/models/Bound;", "getSum", "()F", "getUpperBound", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ReportByHistogramBucket {
    private final String category;
    private final int count;
    private final Bound lowerBound;
    private final float sum;
    private final Bound upperBound;

    public ReportByHistogramBucket(@InterfaceC30731q(name = "category") String category, @InterfaceC30731q(name = "count") int i13, @InterfaceC30731q(name = "sum") float f13, @InterfaceC30731q(name = "lower_bound") Bound bound, @InterfaceC30731q(name = "upper_bound") Bound bound2) {
        AbstractC22676k.m65750j(category, "category");
        this.category = category;
        this.count = i13;
        this.sum = f13;
        this.lowerBound = bound;
        this.upperBound = bound2;
    }

    public static /* synthetic */ ReportByHistogramBucket copy$default(ReportByHistogramBucket reportByHistogramBucket, String str, int i13, float f13, Bound bound, Bound bound2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = reportByHistogramBucket.category;
        }
        if ((i14 & 2) != 0) {
            i13 = reportByHistogramBucket.count;
        }
        if ((i14 & 4) != 0) {
            f13 = reportByHistogramBucket.sum;
        }
        if ((i14 & 8) != 0) {
            bound = reportByHistogramBucket.lowerBound;
        }
        if ((i14 & 16) != 0) {
            bound2 = reportByHistogramBucket.upperBound;
        }
        Bound bound3 = bound2;
        float f14 = f13;
        return reportByHistogramBucket.copy(str, i13, f14, bound, bound3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getSum() {
        return this.sum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bound getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Bound getUpperBound() {
        return this.upperBound;
    }

    public final ReportByHistogramBucket copy(@InterfaceC30731q(name = "category") String category, @InterfaceC30731q(name = "count") int count, @InterfaceC30731q(name = "sum") float sum, @InterfaceC30731q(name = "lower_bound") Bound lowerBound, @InterfaceC30731q(name = "upper_bound") Bound upperBound) {
        AbstractC22676k.m65750j(category, "category");
        return new ReportByHistogramBucket(category, count, sum, lowerBound, upperBound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportByHistogramBucket)) {
            return false;
        }
        ReportByHistogramBucket reportByHistogramBucket = (ReportByHistogramBucket) other;
        return AbstractC22676k.m65745e(this.category, reportByHistogramBucket.category) && this.count == reportByHistogramBucket.count && Float.compare(this.sum, reportByHistogramBucket.sum) == 0 && AbstractC22676k.m65745e(this.lowerBound, reportByHistogramBucket.lowerBound) && AbstractC22676k.m65745e(this.upperBound, reportByHistogramBucket.upperBound);
    }

    public final String getCategory() {
        return this.category;
    }

    public final int getCount() {
        return this.count;
    }

    public final Bound getLowerBound() {
        return this.lowerBound;
    }

    public final float getSum() {
        return this.sum;
    }

    public final Bound getUpperBound() {
        return this.upperBound;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.sum, AbstractC11266d.m30448b(this.count, this.category.hashCode() * 31, 31), 31);
        Bound bound = this.lowerBound;
        int iHashCode = (iM30447a + (bound == null ? 0 : bound.hashCode())) * 31;
        Bound bound2 = this.upperBound;
        return iHashCode + (bound2 != null ? bound2.hashCode() : 0);
    }

    public String toString() {
        String str = this.category;
        int i13 = this.count;
        float f13 = this.sum;
        Bound bound = this.lowerBound;
        Bound bound2 = this.upperBound;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "ReportByHistogramBucket(category=", str, ", count=", ", sum=");
        sbM30467u.append(f13);
        sbM30467u.append(", lowerBound=");
        sbM30467u.append(bound);
        sbM30467u.append(", upperBound=");
        sbM30467u.append(bound2);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public /* synthetic */ ReportByHistogramBucket(String str, int i13, float f13, Bound bound, Bound bound2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, f13, (i14 & 8) != 0 ? null : bound, (i14 & 16) != 0 ? null : bound2);
    }
}
