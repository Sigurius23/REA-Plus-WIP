package p502ti;

import android.graphics.PointF;
import dj.AbstractC12062g;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import java.util.List;
import p031b9.AbstractC2875y;
import p078d1.C11457j;
import p119ej.C13224a;
import p119ej.C13226c;
import p649yi.C39548c;

/* JADX INFO: renamed from: ti.i */
/* JADX INFO: loaded from: classes.dex */
public final class C33826i extends AbstractC33827j {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f141664i;

    /* JADX INFO: renamed from: j */
    public final Object f141665j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33826i(List list, int i13) {
        super(list);
        this.f141664i = i13;
        switch (i13) {
            case 1:
                super(list);
                this.f141665j = new PointF();
                break;
            case 2:
                super(list);
                this.f141665j = new C13226c();
                break;
            default:
                int iMax = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    C39548c c39548c = (C39548c) ((C13224a) list.get(i14)).f45816b;
                    if (c39548c != null) {
                        iMax = Math.max(iMax, c39548c.f170133b.length);
                    }
                }
                this.f141665j = new C39548c(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: f */
    public final Object mo106982f(C13224a c13224a, float f13) {
        Object obj;
        float f14;
        switch (this.f141664i) {
            case 0:
                C39548c c39548c = (C39548c) this.f141665j;
                C39548c c39548c2 = (C39548c) c13224a.f45816b;
                C39548c c39548c3 = (C39548c) c13224a.f45817c;
                int[] iArr = c39548c.f170133b;
                float[] fArr = c39548c.f170132a;
                boolean zEquals = c39548c2.equals(c39548c3);
                int[] iArr2 = c39548c2.f170133b;
                if (zEquals || f13 <= 0.0f) {
                    c39548c.m126326a(c39548c2);
                } else if (f13 >= 1.0f) {
                    c39548c.m126326a(c39548c3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = c39548c3.f170133b;
                    if (length != iArr3.length) {
                        StringBuilder sb4 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb4.append(iArr2.length);
                        sb4.append(" vs ");
                        throw new IllegalArgumentException(AbstractC18489d0.m53371l(sb4, iArr3.length, ")"));
                    }
                    for (int i13 = 0; i13 < iArr2.length; i13++) {
                        fArr[i13] = AbstractC12062g.m33256f(c39548c2.f170132a[i13], c39548c3.f170132a[i13], f13);
                        iArr[i13] = AbstractC12889b.m36296z(f13, iArr2[i13], iArr3[i13]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return c39548c;
            case 1:
                return m106993l(c13224a, f13, f13, f13);
            default:
                C13226c c13226c = (C13226c) this.f141665j;
                Object obj2 = c13224a.f45816b;
                if (obj2 == null || (obj = c13224a.f45817c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C13226c c13226c2 = (C13226c) obj2;
                C13226c c13226c3 = (C13226c) obj;
                C11457j c11457j = this.f141649e;
                if (c11457j != null) {
                    f14 = f13;
                    C13226c c13226c4 = (C13226c) c11457j.m30731A(c13224a.f45821g, c13224a.f45822h.floatValue(), c13226c2, c13226c3, f14, m106980d(), this.f141648d);
                    if (c13226c4 != null) {
                        return c13226c4;
                    }
                } else {
                    f14 = f13;
                }
                float fM33256f = AbstractC12062g.m33256f(c13226c2.f45838a, c13226c3.f45838a, f14);
                float fM33256f2 = AbstractC12062g.m33256f(c13226c2.f45839b, c13226c3.f45839b, f14);
                c13226c.f45838a = fM33256f;
                c13226c.f45839b = fM33256f2;
                return c13226c;
        }
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ Object mo106983g(C13224a c13224a, float f13, float f14, float f15) {
        switch (this.f141664i) {
            case 1:
                return m106993l(c13224a, f13, f14, f15);
            default:
                return super.mo106983g(c13224a, f13, f14, f15);
        }
    }

    /* JADX INFO: renamed from: l */
    public PointF m106993l(C13224a c13224a, float f13, float f14, float f15) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.f141665j;
        Object obj2 = c13224a.f45816b;
        if (obj2 == null || (obj = c13224a.f45817c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        C11457j c11457j = this.f141649e;
        if (c11457j != null && (pointF = (PointF) c11457j.m30731A(c13224a.f45821g, c13224a.f45822h.floatValue(), pointF3, pointF4, f13, m106980d(), this.f141648d)) != null) {
            return pointF;
        }
        float f16 = pointF3.x;
        float fM8288a = AbstractC2875y.m8288a(pointF4.x, f16, f14, f16);
        float f17 = pointF3.y;
        pointF2.set(fM8288a, AbstractC2875y.m8288a(pointF4.y, f17, f15, f17));
        return pointF2;
    }
}
