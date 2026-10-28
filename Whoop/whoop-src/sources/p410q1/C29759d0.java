package p410q1;

import b83.C2813i;
import java.util.ArrayList;
import p002a0.C0057v0;
import p390p1.C28626i2;
import p390p1.C28677v1;
import p390p1.InterfaceC28599c;
import p602x1.C37819e;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29759d0 extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public static final C29759d0 f121763d = new C29759d0(0, 1, 1);

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        C28677v1 c28677v1 = (C28677v1) c2813i.m7996c(0);
        C0057v0 c0057v0 = c37822h.f161976i;
        C37819e c37819e = c0057v0 != null ? (C37819e) c0057v0.m129g(c28677v1) : null;
        if (c37819e != null) {
            ArrayList arrayList = c37822h.f161977j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c37822h.f161977j = arrayList;
            }
            arrayList.add(c37822h.f161972e);
            c37822h.f161972e = c37819e.f161965x;
        }
    }
}
