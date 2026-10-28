package p410q1;

import b83.C2813i;
import p390p1.AbstractC28659r;
import p390p1.C28594a2;
import p390p1.C28626i2;
import p390p1.C28677v1;
import p390p1.InterfaceC28599c;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29761e0 extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public static final C29761e0 f121765d = new C29761e0(1, 0, 2);

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        int iM7995b = c2813i.m7995b(0);
        int i13 = c28626i2.f115802v;
        int iM87048M = c28626i2.m87048M(c28626i2.f115782b, c28626i2.m87072r(i13));
        int iM87062g = c28626i2.m87062g(c28626i2.f115782b, c28626i2.m87072r(i13 + 1));
        for (int iMax = Math.max(iM87048M, iM87062g - iM7995b); iMax < iM87062g; iMax++) {
            Object obj = c28626i2.f115783c[c28626i2.m87063h(iMax)];
            if (obj instanceof C28594a2) {
                c37822h.m121354e((C28594a2) obj);
            } else if (obj instanceof C28677v1) {
                ((C28677v1) obj).m87203d();
            }
        }
        if (iM7995b <= 0) {
            AbstractC28659r.m87192c("Check failed");
        }
        int i14 = c28626i2.f115802v;
        int iM87048M2 = c28626i2.m87048M(c28626i2.f115782b, c28626i2.m87072r(i14));
        int iM87062g2 = c28626i2.m87062g(c28626i2.f115782b, c28626i2.m87072r(i14 + 1)) - iM7995b;
        if (iM87062g2 < iM87048M2) {
            AbstractC28659r.m87192c("Check failed");
        }
        c28626i2.m87044I(iM87062g2, iM7995b, i14);
        int i15 = c28626i2.f115789i;
        if (i15 >= iM87048M2) {
            c28626i2.f115789i = i15 - iM7995b;
        }
    }
}
