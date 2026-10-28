package g71;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yy0.C39889c;

/* JADX INFO: renamed from: g71.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lg71/d;", "", "", "zoomThreshold", "", "Lyy0/c;", "axisLabels", "<init>", "(DLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15546d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double zoomThreshold;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C39889c> axisLabels;

    public C15546d(double d3, List<C39889c> axisLabels) {
        AbstractC22676k.m65750j(axisLabels, "axisLabels");
        this.zoomThreshold = d3;
        this.axisLabels = axisLabels;
    }

    /* JADX INFO: renamed from: a */
    public final List<C39889c> m43748a() {
        return this.axisLabels;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getZoomThreshold() {
        return this.zoomThreshold;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15546d)) {
            return false;
        }
        C15546d c15546d = (C15546d) other;
        return Double.compare(this.zoomThreshold, c15546d.zoomThreshold) == 0 && AbstractC22676k.m65745e(this.axisLabels, c15546d.axisLabels);
    }

    public int hashCode() {
        return this.axisLabels.hashCode() + (Double.hashCode(this.zoomThreshold) * 31);
    }

    public String toString() {
        return "XLabelBucketState(zoomThreshold=" + this.zoomThreshold + ", axisLabels=" + this.axisLabels + ")";
    }
}
