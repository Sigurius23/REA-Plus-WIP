package p502ti;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import p078d1.C11457j;
import p119ej.C13224a;

/* JADX INFO: renamed from: ti.l */
/* JADX INFO: loaded from: classes.dex */
public final class C33829l extends AbstractC33827j {

    /* JADX INFO: renamed from: i */
    public final PointF f141668i;

    /* JADX INFO: renamed from: j */
    public final float[] f141669j;

    /* JADX INFO: renamed from: k */
    public final float[] f141670k;

    /* JADX INFO: renamed from: l */
    public final PathMeasure f141671l;

    /* JADX INFO: renamed from: m */
    public C33828k f141672m;

    public C33829l(ArrayList arrayList) {
        super(arrayList);
        this.f141668i = new PointF();
        this.f141669j = new float[2];
        this.f141670k = new float[2];
        this.f141671l = new PathMeasure();
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: f */
    public final Object mo106982f(C13224a c13224a, float f13) {
        float f14;
        C33828k c33828k = (C33828k) c13224a;
        Path path = c33828k.f141666q;
        C11457j c11457j = this.f141649e;
        if (c11457j == null || c13224a.f45822h == null) {
            f14 = f13;
        } else {
            f14 = f13;
            PointF pointF = (PointF) c11457j.m30731A(c33828k.f45821g, c33828k.f45822h.floatValue(), (PointF) c33828k.f45816b, (PointF) c33828k.f45817c, m106980d(), f14, this.f141648d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) c13224a.f45816b;
        }
        C33828k c33828k2 = this.f141672m;
        PathMeasure pathMeasure = this.f141671l;
        if (c33828k2 != c33828k) {
            pathMeasure.setPath(path, false);
            this.f141672m = c33828k;
        }
        float length = pathMeasure.getLength();
        float f15 = f14 * length;
        float[] fArr = this.f141669j;
        float[] fArr2 = this.f141670k;
        pathMeasure.getPosTan(f15, fArr, fArr2);
        float f16 = fArr[0];
        float f17 = fArr[1];
        PointF pointF2 = this.f141668i;
        pointF2.set(f16, f17);
        if (f15 < 0.0f) {
            pointF2.offset(fArr2[0] * f15, fArr2[1] * f15);
            return pointF2;
        }
        if (f15 > length) {
            float f18 = f15 - length;
            pointF2.offset(fArr2[0] * f18, fArr2[1] * f18);
        }
        return pointF2;
    }
}
