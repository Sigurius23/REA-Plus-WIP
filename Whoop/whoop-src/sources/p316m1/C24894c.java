package p316m1;

import c93.InterfaceC4339a;
import l83.C23465k;
import p390p1.C28633k1;

/* JADX INFO: renamed from: m1.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C24894c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97518w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24902g f97519x;

    public /* synthetic */ C24894c(C24902g c24902g, int i13) {
        this.f97518w = i13;
        this.f97519x = c24902g;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        float fM73010f;
        switch (this.f97518w) {
            case 0:
                C24902g c24902g = this.f97519x;
                C28633k1 c28633k1 = c24902g.f97552l;
                C28633k1 c28633k2 = c24902g.f97547g;
                Object value = c28633k1.getValue();
                if (value != null) {
                    return value;
                }
                float fM87022x = c24902g.f97550j.m87022x();
                return !Float.isNaN(fM87022x) ? c24902g.m73007c(fM87022x, 0.0f, c28633k2.getValue()) : c28633k2.getValue();
            case 1:
                C24902g c24902g2 = this.f97519x;
                C28633k1 c28633k3 = c24902g2.f97552l;
                C28633k1 c28633k4 = c24902g2.f97547g;
                Object value2 = c28633k3.getValue();
                if (value2 != null) {
                    return value2;
                }
                float fM87022x2 = c24902g2.f97550j.m87022x();
                if (Float.isNaN(fM87022x2)) {
                    return c28633k4.getValue();
                }
                Object value3 = c28633k4.getValue();
                C24893b0 c24893b0M73008d = c24902g2.m73008d();
                float fM72993d = c24893b0M73008d.m72993d(value3);
                if (fM72993d != fM87022x2 && !Float.isNaN(fM72993d)) {
                    if (fM72993d < fM87022x2) {
                        Object objM72991b = c24893b0M73008d.m72991b(fM87022x2, true);
                        if (objM72991b != null) {
                            return objM72991b;
                        }
                    } else {
                        Object objM72991b2 = c24893b0M73008d.m72991b(fM87022x2, false);
                        if (objM72991b2 != null) {
                            return objM72991b2;
                        }
                    }
                }
                return value3;
            case 2:
                C24902g c24902g3 = this.f97519x;
                float fM72993d2 = c24902g3.m73008d().m72993d(c24902g3.f97547g.getValue());
                float fM72993d3 = c24902g3.m73008d().m72993d(c24902g3.f97549i.getValue()) - fM72993d2;
                float fAbs = Math.abs(fM72993d3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fM73010f = 1.0f;
                } else {
                    fM73010f = (c24902g3.m73010f() - fM72993d2) / fM72993d3;
                    if (fM73010f < 1.0E-6f) {
                        fM73010f = 0.0f;
                    } else if (fM73010f > 0.999999f) {
                        fM73010f = 1.0f;
                    }
                }
                return Float.valueOf(fM73010f);
            case 3:
                return this.f97519x.m73008d();
            default:
                C24902g c24902g4 = this.f97519x;
                return new C23465k(c24902g4.m73008d(), c24902g4.f97548h.getValue());
        }
    }
}
