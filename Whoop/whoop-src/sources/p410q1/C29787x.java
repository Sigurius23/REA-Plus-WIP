package p410q1;

import b83.C2813i;
import java.util.Set;
import p002a0.AbstractC0015d1;
import p002a0.C0057v0;
import p390p1.C28594a2;
import p390p1.C28626i2;
import p390p1.C28677v1;
import p390p1.InterfaceC28599c;
import p602x1.C37819e;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C29787x extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public static final C29787x f121801d = new C29787x(0, 1, 1);

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        C28677v1 c28677v1 = (C28677v1) c2813i.m7996c(0);
        Set set = c37822h.f161968a;
        if (set == null) {
            return;
        }
        C37819e c37819e = new C37819e(set);
        C0057v0 c0057v0 = c37822h.f161976i;
        if (c0057v0 == null) {
            long[] jArr = AbstractC0015d1.f36a;
            c0057v0 = new C0057v0();
            c37822h.f161976i = c0057v0;
        }
        c0057v0.m135m(c28677v1, c37819e);
        c37822h.f161972e.m94885b(new C28594a2(c37819e, null));
    }
}
