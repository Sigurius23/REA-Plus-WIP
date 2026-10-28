package p00;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import g00.AbstractC14936g;
import g00.C14931b;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.C28655q;
import p490t0.AbstractC33253j;
import p490t0.C33252i;

/* JADX INFO: renamed from: p00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C28566c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C28566c f115573w = new C28566c();

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                Modifier modifierM3394p = AbstractC1099a.m3394p(16, C2314t.f9131w);
                C33252i c33252iM105489e = AbstractC33253j.m105489e(24);
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(-443512897);
                C14931b c14931b = (C14931b) c28655q2.m87161k(AbstractC14936g.f55706c);
                c28655q2.m87173q(false);
                AbstractC17269i.m48898k(modifierM3394p, c33252iM105489e, c14931b.f55663b, 0L, null, 0.0f, AbstractC28567d.f115576c, composer, 1572870, 56);
            }
        } else {
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(16, C2314t.f9131w);
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(24);
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(-443512897);
            C14931b c14931b2 = (C14931b) c28655q3.m87161k(AbstractC14936g.f55706c);
            c28655q3.m87173q(false);
            AbstractC17269i.m48898k(modifierM3394p2, c33252iM105489e2, c14931b2.f55663b, 0L, null, 0.0f, AbstractC28567d.f115576c, composer, 1572870, 56);
        }
        return C23454a0.f92919a;
    }
}
