package p389p0;

import b30.C2647w2;
import c93.InterfaceC4351m;
import p002a0.AbstractC0015d1;
import p002a0.C0057v0;
import p353o0.C27325i;
import p602x1.C37816b;
import p634y1.InterfaceC39030c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p0.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28506a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC39030c f115398a;

    /* JADX INFO: renamed from: b */
    public final C27325i f115399b;

    /* JADX INFO: renamed from: c */
    public final C0057v0 f115400c;

    public C28506a0(InterfaceC39030c interfaceC39030c, C27325i c27325i) {
        this.f115398a = interfaceC39030c;
        this.f115399b = c27325i;
        long[] jArr = AbstractC0015d1.f36a;
        this.f115400c = new C0057v0();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC4351m m86818a(int i13, Object obj, Object obj2) {
        C0057v0 c0057v0 = this.f115400c;
        C28562z c28562z = (C28562z) c0057v0.m129g(obj);
        if (c28562z != null && c28562z.f115566c == i13 && AbstractC22676k.m65745e(c28562z.f115565b, obj2)) {
            C37816b c37816b = c28562z.f115567d;
            if (c37816b != null) {
                return c37816b;
            }
            C37816b c37816b2 = new C37816b(new C2647w2(25, c28562z.f115568e, c28562z), true, 818252804);
            c28562z.f115567d = c37816b2;
            return c37816b2;
        }
        C28562z c28562z2 = new C28562z(this, i13, obj, obj2);
        c0057v0.m135m(obj, c28562z2);
        C37816b c37816b3 = c28562z2.f115567d;
        if (c37816b3 != null) {
            return c37816b3;
        }
        C37816b c37816b4 = new C37816b(new C2647w2(25, this, c28562z2), true, 818252804);
        c28562z2.f115567d = c37816b4;
        return c37816b4;
    }

    /* JADX INFO: renamed from: b */
    public final Object m86819b(Object obj) {
        if (obj == null) {
            return null;
        }
        C28562z c28562z = (C28562z) this.f115400c.m129g(obj);
        if (c28562z != null) {
            return c28562z.f115565b;
        }
        InterfaceC28509b0 interfaceC28509b0 = (InterfaceC28509b0) this.f115399b.invoke();
        int iMo77531b = interfaceC28509b0.mo77531b(obj);
        if (iMo77531b != -1) {
            return interfaceC28509b0.mo77530a(iMo77531b);
        }
        return null;
    }
}
