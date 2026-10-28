package p410q1;

import b83.C2813i;
import p390p1.AbstractC28659r;
import p390p1.C28591a;
import p390p1.C28626i2;
import p390p1.InterfaceC28599c;
import p602x1.C37818d;
import p602x1.C37822h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q1.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C29770j extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public static final C29770j f121774d = new C29770j(0, 2, 1);

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        int i13;
        C37818d c37818d = (C37818d) c2813i.m7996c(0);
        int iM87058c = c28626i2.m87058c((C28591a) c2813i.m7996c(1));
        if (c28626i2.f115800t >= iM87058c) {
            AbstractC28659r.m87192c("Check failed");
        }
        AbstractC37056f.m118970Y(c28626i2, interfaceC28599c, iM87058c);
        int i14 = c28626i2.f115800t;
        int iM87039D = c28626i2.f115802v;
        while (iM87039D >= 0 && !c28626i2.m87078x(iM87039D)) {
            iM87039D = c28626i2.m87039D(c28626i2.f115782b, iM87039D);
        }
        int iM87074t = iM87039D + 1;
        int iM87046K = 0;
        while (iM87074t < i14) {
            if (c28626i2.m87075u(i14, iM87074t)) {
                if (c28626i2.m87078x(iM87074t)) {
                    iM87046K = 0;
                }
                iM87074t++;
            } else {
                iM87046K += c28626i2.m87078x(iM87074t) ? 1 : c28626i2.f115782b[(c28626i2.m87072r(iM87074t) * 5) + 1] & 67108863;
                iM87074t += c28626i2.m87074t(iM87074t);
            }
        }
        while (true) {
            i13 = c28626i2.f115800t;
            if (i13 >= iM87058c) {
                break;
            }
            if (c28626i2.m87075u(iM87058c, i13)) {
                int i15 = c28626i2.f115800t;
                if (i15 < c28626i2.f115801u && (c28626i2.f115782b[(c28626i2.m87072r(i15) * 5) + 1] & 1073741824) != 0) {
                    interfaceC28599c.mo706l(c28626i2.m87038C(c28626i2.f115800t));
                    iM87046K = 0;
                }
                c28626i2.m87050O();
            } else {
                iM87046K += c28626i2.m87046K();
            }
        }
        if (i13 != iM87058c) {
            AbstractC28659r.m87192c("Check failed");
        }
        c37818d.f161963a = iM87046K;
    }
}
