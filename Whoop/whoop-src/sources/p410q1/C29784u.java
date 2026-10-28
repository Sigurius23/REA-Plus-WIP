package p410q1;

import b83.C2813i;
import java.util.ArrayList;
import m83.AbstractC25260n;
import p390p1.AbstractC28622h2;
import p390p1.AbstractC28659r;
import p390p1.C28591a;
import p390p1.C28626i2;
import p390p1.InterfaceC28599c;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C29784u extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public static final C29784u f121798d = new C29784u(1, 0, 2);

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        C28591a c28591a;
        int iM87058c;
        int iM7995b = c2813i.m7995b(0);
        if (c28626i2.f115794n != 0) {
            AbstractC28659r.m87192c("Cannot move a group while inserting");
        }
        if (iM7995b < 0) {
            AbstractC28659r.m87192c("Parameter offset is out of bounds");
        }
        if (iM7995b == 0) {
            return;
        }
        int i13 = c28626i2.f115800t;
        int i14 = c28626i2.f115802v;
        int i15 = c28626i2.f115801u;
        int i16 = i13;
        while (iM7995b > 0) {
            i16 += c28626i2.f115782b[(c28626i2.m87072r(i16) * 5) + 3];
            if (i16 > i15) {
                AbstractC28659r.m87192c("Parameter offset is out of bounds");
            }
            iM7995b--;
        }
        int i17 = c28626i2.f115782b[(c28626i2.m87072r(i16) * 5) + 3];
        int iM87062g = c28626i2.m87062g(c28626i2.f115782b, c28626i2.m87072r(c28626i2.f115800t));
        int iM87062g2 = c28626i2.m87062g(c28626i2.f115782b, c28626i2.m87072r(i16));
        int i18 = i16 + i17;
        int iM87062g3 = c28626i2.m87062g(c28626i2.f115782b, c28626i2.m87072r(i18));
        int i19 = iM87062g3 - iM87062g2;
        c28626i2.m87077w(i19, Math.max(c28626i2.f115800t - 1, 0));
        c28626i2.m87076v(i17);
        int[] iArr = c28626i2.f115782b;
        int iM87072r = c28626i2.m87072r(i18) * 5;
        AbstractC25260n.m74064e0(c28626i2.m87072r(i13) * 5, iM87072r, iArr, iArr, (i17 * 5) + iM87072r);
        if (i19 > 0) {
            Object[] objArr = c28626i2.f115783c;
            int iM87063h = c28626i2.m87063h(iM87062g2 + i19);
            System.arraycopy(objArr, iM87063h, objArr, iM87062g, c28626i2.m87063h(iM87062g3 + i19) - iM87063h);
        }
        int i24 = iM87062g2 + i19;
        int i25 = i24 - iM87062g;
        int i26 = c28626i2.f115791k;
        int i27 = c28626i2.f115792l;
        int length = c28626i2.f115783c.length;
        int i28 = c28626i2.f115793m;
        int i29 = i13 + i17;
        int i34 = i13;
        while (i34 < i29) {
            int iM87072r2 = c28626i2.m87072r(i34);
            int i35 = i25;
            int[] iArr2 = iArr;
            iArr2[(iM87072r2 * 5) + 4] = C28626i2.m87034i(C28626i2.m87034i(c28626i2.m87062g(iArr, iM87072r2) - i35, i28 < iM87072r2 ? 0 : i26, i27, length), c28626i2.f115791k, c28626i2.f115792l, c28626i2.f115783c.length);
            i34++;
            i25 = i35;
            iArr = iArr2;
            i26 = i26;
        }
        int i36 = i18 + i17;
        int iM87070p = c28626i2.m87070p();
        int iM87027b = AbstractC28622h2.m87027b(c28626i2.f115784d, i18, iM87070p);
        ArrayList arrayList = new ArrayList();
        if (iM87027b >= 0) {
            while (iM87027b < c28626i2.f115784d.size() && (iM87058c = c28626i2.m87058c((c28591a = (C28591a) c28626i2.f115784d.get(iM87027b)))) >= i18 && iM87058c < i36) {
                arrayList.add(c28591a);
            }
        }
        int i37 = i13 - i18;
        int size = arrayList.size();
        for (int i38 = 0; i38 < size; i38++) {
            C28591a c28591a2 = (C28591a) arrayList.get(i38);
            int iM87058c2 = c28626i2.m87058c(c28591a2) + i37;
            if (iM87058c2 >= c28626i2.f115787g) {
                c28591a2.f115705a = -(iM87070p - iM87058c2);
            } else {
                c28591a2.f115705a = iM87058c2;
            }
            c28626i2.f115784d.add(AbstractC28622h2.m87027b(c28626i2.f115784d, iM87058c2, iM87070p), c28591a2);
        }
        if (c28626i2.m87043H(i18, i17)) {
            AbstractC28659r.m87192c("Unexpectedly removed anchors");
        }
        c28626i2.m87067m(i14, c28626i2.f115801u, i13);
        if (i19 > 0) {
            c28626i2.m87044I(i24, i19, i18 - 1);
        }
    }
}
