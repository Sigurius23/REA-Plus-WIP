package bm2;

import hc3.AbstractC17176i;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: bm2.n0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lbm2/n0;", "", "", "centerX", "width", "Ly81/e;", "color", "<init>", "(DDLy81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "c", "Ly81/e;", "()Ly81/e;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3463n0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double centerX;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double width;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    public C3463n0(double d3, double d14, InterfaceC39332e color) {
        AbstractC22676k.m65750j(color, "color");
        this.centerX = d3;
        this.width = d14;
        this.color = color;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getCenterX() {
        return this.centerX;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3463n0)) {
            return false;
        }
        C3463n0 c3463n0 = (C3463n0) other;
        return Double.compare(this.centerX, c3463n0.centerX) == 0 && Double.compare(this.width, c3463n0.width) == 0 && AbstractC22676k.m65745e(this.color, c3463n0.color);
    }

    public int hashCode() {
        return this.color.hashCode() + AbstractC17176i.m48499a(Double.hashCode(this.centerX) * 31, 31, this.width);
    }

    public String toString() {
        double d3 = this.centerX;
        double d14 = this.width;
        InterfaceC39332e interfaceC39332e = this.color;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("SegmentalAnalysisTrendReadingViewState(centerX=", d3, ", width=");
        sbM8306s.append(d14);
        sbM8306s.append(", color=");
        sbM8306s.append(interfaceC39332e);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }
}
