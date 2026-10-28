package p502ti;

import android.graphics.PointF;
import dj.AbstractC12062g;
import e93.AbstractC12889b;
import java.util.List;
import p078d1.C11457j;
import p119ej.C13224a;

/* JADX INFO: renamed from: ti.e */
/* JADX INFO: loaded from: classes.dex */
public final class C33822e extends AbstractC33827j {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f141653i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33822e(List list, int i13) {
        super(list);
        this.f141653i = i13;
    }

    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: f */
    public final Object mo106982f(C13224a c13224a, float f13) {
        int i13;
        float f14;
        int iIntValue;
        switch (this.f141653i) {
            case 0:
                return Integer.valueOf(m106988l(c13224a, f13));
            default:
                Object obj = c13224a.f45816b;
                if (obj == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj2 = c13224a.f45817c;
                if (obj2 == null) {
                    if (c13224a.f45825k == 784923401) {
                        c13224a.f45825k = ((Integer) obj).intValue();
                    }
                    i13 = c13224a.f45825k;
                } else {
                    if (c13224a.f45826l == 784923401) {
                        c13224a.f45826l = ((Integer) obj2).intValue();
                    }
                    i13 = c13224a.f45826l;
                }
                C11457j c11457j = this.f141649e;
                if (c11457j != null) {
                    f14 = f13;
                    Integer num = (Integer) c11457j.m30731A(c13224a.f45821g, c13224a.f45822h.floatValue(), (Integer) obj, Integer.valueOf(i13), f14, m106980d(), this.f141648d);
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    return Integer.valueOf(iIntValue);
                }
                f14 = f13;
                if (c13224a.f45825k == 784923401) {
                    c13224a.f45825k = ((Integer) obj).intValue();
                }
                int i14 = c13224a.f45825k;
                PointF pointF = AbstractC12062g.f40002a;
                iIntValue = (int) (((i13 - i14) * f14) + i14);
                return Integer.valueOf(iIntValue);
        }
    }

    /* JADX INFO: renamed from: l */
    public int m106988l(C13224a c13224a, float f13) {
        float f14;
        Float f15;
        Object obj = c13224a.f45816b;
        Object obj2 = c13224a.f45816b;
        if (obj == null || c13224a.f45817c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C11457j c11457j = this.f141649e;
        if (c11457j == null || (f15 = c13224a.f45822h) == null) {
            f14 = f13;
        } else {
            f14 = f13;
            Integer num = (Integer) c11457j.m30731A(c13224a.f45821g, f15.floatValue(), (Integer) obj2, (Integer) c13224a.f45817c, f14, m106980d(), this.f141648d);
            if (num != null) {
                return num.intValue();
            }
        }
        return AbstractC12889b.m36296z(AbstractC12062g.m33252b(f14, 0.0f, 1.0f), ((Integer) obj2).intValue(), ((Integer) c13224a.f45817c).intValue());
    }
}
