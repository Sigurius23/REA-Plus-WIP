package p163g1;

import c93.InterfaceC4339a;
import l83.C23465k;
import p390p1.C28633k1;

/* JADX INFO: renamed from: g1.t */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15145t implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56804w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14947a0 f56805x;

    public /* synthetic */ C15145t(C14947a0 c14947a0, int i13) {
        this.f56804w = i13;
        this.f56805x = c14947a0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        float fM43072g;
        switch (this.f56804w) {
            case 0:
                C14947a0 c14947a0 = this.f56805x;
                C28633k1 c28633k1 = c14947a0.f55776m;
                C28633k1 c28633k2 = c14947a0.f55770g;
                Object value = c28633k1.getValue();
                if (value != null) {
                    return value;
                }
                float fM87022x = c14947a0.f55773j.m87022x();
                return !Float.isNaN(fM87022x) ? c14947a0.m43068c(fM87022x, 0.0f, c28633k2.getValue()) : c28633k2.getValue();
            case 1:
                C14947a0 c14947a1 = this.f56805x;
                C28633k1 c28633k3 = c14947a1.f55776m;
                C28633k1 c28633k4 = c14947a1.f55770g;
                Object value2 = c28633k3.getValue();
                if (value2 != null) {
                    return value2;
                }
                float fM87022x2 = c14947a1.f55773j.m87022x();
                if (Float.isNaN(fM87022x2)) {
                    return c28633k4.getValue();
                }
                Object value3 = c28633k4.getValue();
                C15059k3 c15059k3M43070e = c14947a1.m43070e();
                float fM43146d = c15059k3M43070e.m43146d(value3);
                if (fM43146d != fM87022x2 && !Float.isNaN(fM43146d)) {
                    if (fM43146d < fM87022x2) {
                        Object objM43144b = c15059k3M43070e.m43144b(fM87022x2, true);
                        if (objM43144b != null) {
                            return objM43144b;
                        }
                    } else {
                        Object objM43144b2 = c15059k3M43070e.m43144b(fM87022x2, false);
                        if (objM43144b2 != null) {
                            return objM43144b2;
                        }
                    }
                }
                return value3;
            case 2:
                C14947a0 c14947a2 = this.f56805x;
                float fM43146d2 = c14947a2.m43070e().m43146d(c14947a2.f55770g.getValue());
                float fM43146d3 = c14947a2.m43070e().m43146d(c14947a2.f55772i.getValue()) - fM43146d2;
                float fAbs = Math.abs(fM43146d3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fM43072g = 1.0f;
                } else {
                    fM43072g = (c14947a2.m43072g() - fM43146d2) / fM43146d3;
                    if (fM43072g < 1.0E-6f) {
                        fM43072g = 0.0f;
                    } else if (fM43072g > 0.999999f) {
                        fM43072g = 1.0f;
                    }
                }
                return Float.valueOf(fM43072g);
            case 3:
                return this.f56805x.m43070e();
            case 4:
                C14947a0 c14947a3 = this.f56805x;
                return new C23465k(c14947a3.m43070e(), c14947a3.f55771h.getValue());
            case 5:
                return Float.valueOf(this.f56805x.m43072g());
            default:
                Boolean bool = (Boolean) this.f56805x.f55770g.getValue();
                bool.getClass();
                return bool;
        }
    }
}
