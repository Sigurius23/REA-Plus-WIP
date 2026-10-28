package p584wi;

import android.graphics.PointF;

/* JADX INFO: renamed from: wi.a */
/* JADX INFO: loaded from: classes.dex */
public final class C37301a {

    /* JADX INFO: renamed from: a */
    public final PointF f159492a;

    /* JADX INFO: renamed from: b */
    public final PointF f159493b;

    /* JADX INFO: renamed from: c */
    public final PointF f159494c;

    public C37301a() {
        this.f159492a = new PointF();
        this.f159493b = new PointF();
        this.f159494c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f159494c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f159492a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f159493b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C37301a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f159492a = pointF;
        this.f159493b = pointF2;
        this.f159494c = pointF3;
    }
}
