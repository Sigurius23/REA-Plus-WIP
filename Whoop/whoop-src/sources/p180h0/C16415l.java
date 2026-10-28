package p180h0;

import c93.InterfaceC4339a;
import l83.C23465k;
import p390p1.C28617g1;
import p390p1.C28633k1;

/* JADX INFO: renamed from: h0.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16415l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63081w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16435p f63082x;

    public /* synthetic */ C16415l(C16435p c16435p, int i13) {
        this.f63081w = i13;
        this.f63082x = c16435p;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        float fM46616f;
        switch (this.f63081w) {
            case 0:
                C16435p c16435p = this.f63082x;
                C28617g1 c28617g1 = c16435p.f63154f;
                C28633k1 c28633k1 = c16435p.f63156h;
                C28633k1 c28633k2 = c16435p.f63151c;
                Object value = c28633k1.getValue();
                if (value != null) {
                    return value;
                }
                if (Float.isNaN(c28617g1.m87022x())) {
                    return c28633k2.getValue();
                }
                Object objM46646a = ((C16475x) c16435p.m46613c()).m46646a(c28617g1.m87022x());
                return objM46646a == null ? c28633k2.getValue() : objM46646a;
            case 1:
                C16435p c16435p2 = this.f63082x;
                float fM46650e = ((C16475x) c16435p2.m46613c()).m46650e(c16435p2.f63152d.getValue());
                float fM46650e2 = ((C16475x) c16435p2.m46613c()).m46650e(c16435p2.f63153e.getValue()) - fM46650e;
                float fAbs = Math.abs(fM46650e2);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fM46616f = 1.0f;
                } else {
                    fM46616f = (c16435p2.m46616f() - fM46650e) / fM46650e2;
                    if (fM46616f < 1.0E-6f) {
                        fM46616f = 0.0f;
                    } else if (fM46616f > 0.999999f) {
                        fM46616f = 1.0f;
                    }
                }
                return Float.valueOf(fM46616f);
            default:
                C16435p c16435p3 = this.f63082x;
                return new C23465k(c16435p3.m46613c(), c16435p3.f63153e.getValue());
        }
    }
}
