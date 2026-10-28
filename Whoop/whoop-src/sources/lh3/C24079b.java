package lh3;

import bh3.AbstractC3258e;
import bh3.C3257d;
import ch3.AbstractC4677d;
import ch3.C4672b;
import ch3.C4675c;
import java.util.ArrayList;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: lh3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C24079b extends AbstractC24088k {

    /* JADX INFO: renamed from: y */
    public static final Object[] f95126y = new Object[0];

    /* JADX INFO: renamed from: x */
    public final C24091n f95127x;

    public C24079b(C24091n c24091n, C24091n c24091n2) {
        super(c24091n);
        this.f95127x = c24091n2;
    }

    /* JADX INFO: renamed from: Y */
    public static C24079b m70996Y(Object obj, boolean z4) {
        C24091n c24091n = new C24091n(C24089l.f95155e);
        c24091n.f95165x = true;
        C3257d c3257d = AbstractC3258e.f12762a;
        c24091n.f95166y = c3257d;
        c24091n.f95167z = c3257d;
        c24091n.f95163E = c3257d;
        if (z4) {
            if (obj == null) {
                obj = AbstractC4677d.f19136b;
            }
            c24091n.f95164w = obj;
        }
        C24078a c24078a = new C24078a(c24091n);
        c24091n.f95167z = c24078a;
        c24091n.f95163E = c24078a;
        return new C24079b(c24091n, c24091n);
    }

    /* JADX INFO: renamed from: Z */
    public final Object m70997Z() {
        Object obj = this.f95127x.f95164w;
        if (obj == null || (obj instanceof C4675c) || obj == AbstractC4677d.f19135a) {
            return null;
        }
        return AbstractC4677d.m14746c(obj);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (this.f95127x.f95164w == null || this.f95127x.f95165x) {
            C4672b c4672b = AbstractC4677d.f19135a;
            C24091n c24091n = this.f95127x;
            c24091n.f95164w = c4672b;
            c24091n.f95165x = false;
            for (C24090m c24090m : ((C24089l) c24091n.get()).f95156a ? C24089l.f95153c : ((C24089l) c24091n.getAndSet(C24089l.f95154d)).f95157b) {
                c24090m.m71003a(c4672b);
            }
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        if (this.f95127x.f95164w == null || this.f95127x.f95165x) {
            C4675c c4675c = new C4675c(th3);
            C24091n c24091n = this.f95127x;
            c24091n.f95164w = c4675c;
            c24091n.f95165x = false;
            ArrayList arrayList = null;
            for (C24090m c24090m : ((C24089l) c24091n.get()).f95156a ? C24089l.f95153c : ((C24089l) c24091n.getAndSet(C24089l.f95154d)).f95157b) {
                try {
                    c24090m.m71003a(c4675c);
                } catch (Throwable th4) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th4);
                }
            }
            AbstractC12350b.m34572U(arrayList);
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        if (this.f95127x.f95164w == null || this.f95127x.f95165x) {
            if (obj == null) {
                obj = AbstractC4677d.f19136b;
            }
            C24091n c24091n = this.f95127x;
            c24091n.f95164w = obj;
            for (C24090m c24090m : ((C24089l) c24091n.get()).f95157b) {
                c24090m.m71003a(obj);
            }
        }
    }
}
