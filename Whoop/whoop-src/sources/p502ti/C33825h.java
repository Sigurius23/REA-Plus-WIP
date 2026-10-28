package p502ti;

import dj.AbstractC12062g;
import p078d1.C11457j;
import p119ej.C13224a;

/* JADX INFO: renamed from: ti.h */
/* JADX INFO: loaded from: classes.dex */
public final class C33825h extends AbstractC33827j {
    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: f */
    public final Object mo106982f(C13224a c13224a, float f13) {
        return Float.valueOf(m106992m(c13224a, f13));
    }

    /* JADX INFO: renamed from: l */
    public final float m106991l() {
        return m106992m(this.f141647c.mo9719b(), m106979c());
    }

    /* JADX INFO: renamed from: m */
    public final float m106992m(C13224a c13224a, float f13) {
        float f14;
        Object obj = c13224a.f45816b;
        Object obj2 = c13224a.f45816b;
        if (obj == null || c13224a.f45817c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C11457j c11457j = this.f141649e;
        if (c11457j != null) {
            f14 = f13;
            Float f15 = (Float) c11457j.m30731A(c13224a.f45821g, c13224a.f45822h.floatValue(), (Float) obj2, (Float) c13224a.f45817c, f14, m106980d(), this.f141648d);
            if (f15 != null) {
                return f15.floatValue();
            }
        } else {
            f14 = f13;
        }
        if (c13224a.f45823i == -3987645.8f) {
            c13224a.f45823i = ((Float) obj2).floatValue();
        }
        float f16 = c13224a.f45823i;
        if (c13224a.f45824j == -3987645.8f) {
            c13224a.f45824j = ((Float) c13224a.f45817c).floatValue();
        }
        return AbstractC12062g.m33256f(f16, c13224a.f45824j, f14);
    }
}
