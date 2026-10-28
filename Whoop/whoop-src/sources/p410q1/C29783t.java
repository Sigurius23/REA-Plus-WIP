package p410q1;

import b83.C2813i;
import p078d1.C11457j;
import p390p1.AbstractC28659r;
import p390p1.C28591a;
import p390p1.C28614f2;
import p390p1.C28626i2;
import p390p1.InterfaceC28599c;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C29783t extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public static final C29783t f121797d = new C29783t(0, 3, 1);

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        C11457j c11457j;
        C28614f2 c28614f2 = (C28614f2) c2813i.m7996c(1);
        C28591a c28591a = (C28591a) c2813i.m7996c(0);
        C29756c c29756c = (C29756c) c2813i.m7996c(2);
        C28626i2 c28626i2M87017e = c28614f2.m87017e();
        if (interfaceC29773k0 != null) {
            try {
                c11457j = new C11457j(26, interfaceC29773k0, c28626i2);
            } catch (Throwable th3) {
                c28626i2M87017e.m87060e(false);
                throw th3;
            }
        } else {
            c11457j = null;
        }
        if (!c29756c.f121760b.m91237e0()) {
            AbstractC28659r.m87192c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c29756c.f121759a.m91236d0(interfaceC28599c, c28626i2M87017e, c37822h, c11457j);
        c28626i2M87017e.m87060e(true);
        c28626i2.m87059d();
        c28591a.getClass();
        c28626i2.m87079z(c28614f2, c28614f2.m87014a(c28591a));
        c28626i2.m87065k();
    }
}
