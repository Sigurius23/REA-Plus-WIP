package p410q1;

import b83.C2813i;
import com.google.android.material.datepicker.C5020n;
import p078d1.C11457j;
import p390p1.C28626i2;
import p390p1.InterfaceC28599c;
import p602x1.C37818d;
import p602x1.C37822h;

/* JADX INFO: renamed from: q1.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C29762f extends AbstractC29771j0 {

    /* JADX INFO: renamed from: d */
    public static final C29762f f121766d = new C29762f(0, 2, 1);

    @Override // p410q1.AbstractC29771j0
    /* JADX INFO: renamed from: d */
    public final void mo91224d(C2813i c2813i, InterfaceC28599c interfaceC28599c, C28626i2 c28626i2, C37822h c37822h, InterfaceC29773k0 interfaceC29773k0) {
        C37818d c37818d = (C37818d) c2813i.m7996c(1);
        int i13 = c37818d != null ? c37818d.f161963a : 0;
        C29752a c29752a = (C29752a) c2813i.m7996c(0);
        if (i13 > 0) {
            interfaceC28599c = new C5020n(interfaceC28599c, i13);
        }
        c29752a.m91223c0(interfaceC28599c, c28626i2, c37822h, interfaceC29773k0 != null ? new C11457j(26, interfaceC29773k0, c28626i2) : null);
    }
}
