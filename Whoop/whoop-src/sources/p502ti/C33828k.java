package p502ti;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import dj.AbstractC12064i;
import p119ej.C13224a;
import p426qi.C30387i;

/* JADX INFO: renamed from: ti.k */
/* JADX INFO: loaded from: classes.dex */
public final class C33828k extends C13224a {

    /* JADX INFO: renamed from: q */
    public Path f141666q;

    /* JADX INFO: renamed from: r */
    public final C13224a f141667r;

    public C33828k(C30387i c30387i, C13224a c13224a) {
        super(c30387i, (PointF) c13224a.f45816b, (PointF) c13224a.f45817c, c13224a.f45818d, c13224a.f45819e, c13224a.f45820f, c13224a.f45821g, c13224a.f45822h);
        this.f141667r = c13224a;
        m106994d();
    }

    /* JADX INFO: renamed from: d */
    public final void m106994d() {
        Object obj;
        Object obj2 = this.f45817c;
        Object obj3 = this.f45816b;
        boolean z4 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f45817c) == null || z4) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C13224a c13224a = this.f141667r;
        PointF pointF3 = c13224a.f45829o;
        PointF pointF4 = c13224a.f45830p;
        Matrix matrix = AbstractC12064i.f40031a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f13 = pointF3.x + pointF.x;
            float f14 = pointF.y + pointF3.y;
            float f15 = pointF2.x;
            float f16 = f15 + pointF4.x;
            float f17 = pointF2.y;
            path.cubicTo(f13, f14, f16, f17 + pointF4.y, f15, f17);
        }
        this.f141666q = path;
    }
}
