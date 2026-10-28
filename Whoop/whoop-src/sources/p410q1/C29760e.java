package p410q1;

import b83.C2813i;
import p390p1.AbstractC28659r;
import p390p1.C28591a;
import p390p1.C28594a2;
import p390p1.C28626i2;
import p390p1.InterfaceC28599c;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C29760e extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public static final C29760e f121764d = new C29760e(0, 2, 1);

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        C28591a c28591a = (C28591a) c2813i.m7996c(0);
        Object objM7996c = c2813i.m7996c(1);
        if (objM7996c instanceof C28594a2) {
            C28594a2 c28594a2 = (C28594a2) objM7996c;
            c37822h.f161972e.m94885b(c28594a2);
            c37822h.f161971d.m136a(c28594a2);
        }
        if (c28626i2.f115794n != 0) {
            AbstractC28659r.m87192c("Can only append a slot if not current inserting");
        }
        int i13 = c28626i2.f115789i;
        int i14 = c28626i2.f115790j;
        int iM87058c = c28626i2.m87058c(c28591a);
        int iM87062g = c28626i2.m87062g(c28626i2.f115782b, c28626i2.m87072r(iM87058c + 1));
        c28626i2.f115789i = iM87062g;
        c28626i2.f115790j = iM87062g;
        c28626i2.m87077w(1, iM87058c);
        if (i13 >= iM87062g) {
            i13++;
            i14++;
        }
        c28626i2.f115783c[iM87062g] = objM7996c;
        c28626i2.f115789i = i13;
        c28626i2.f115790j = i14;
    }
}
