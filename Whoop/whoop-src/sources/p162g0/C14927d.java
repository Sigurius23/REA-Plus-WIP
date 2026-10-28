package p162g0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4599t;
import f01.C13857f;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.C37816b;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g0.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C14927d {

    /* JADX INFO: renamed from: a */
    public final C39967p f55628a = new C39967p();

    /* JADX INFO: renamed from: b */
    public static void m43021b(C14927d c14927d, InterfaceC4351m interfaceC4351m, C37816b c37816b, InterfaceC4339a interfaceC4339a, int i13) {
        if ((i13 & 8) != 0) {
            c37816b = null;
        }
        c14927d.f55628a.add(new C37816b(new C4599t(interfaceC4351m, c37816b, interfaceC4339a), true, 424163756));
    }

    /* JADX INFO: renamed from: a */
    public final void m43022a(C14926c c14926c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1320309496);
        int i14 = (c28655q.m87153g(c14926c) ? 4 : 2) | i13 | (c28655q.m87153g(this) ? 32 : 16);
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C39967p c39967p = this.f55628a;
            int size = c39967p.size();
            for (int i15 = 0; i15 < size; i15++) {
                ((Function3) c39967p.get(i15)).invoke(c14926c, c28655q, Integer.valueOf(i14 & 14));
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13857f(this, c14926c, i13, 9);
        }
    }
}
