package sj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import o73.C27648a;
import p292l1.AbstractC23164r1;
import p355o2.C27430e;
import p390p1.C28655q;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: sj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C32551b extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C32551b f134867w = new C32551b(2);

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                C27430e c27430eM83552C = C27648a.m83552C();
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87152f0(-412521741);
                C35035m c35035m = (C35035m) c28655q2.m87161k(AbstractC35033k.f148295a);
                c28655q2.m87173q(false);
                AbstractC23164r1.m67133b(c27430eM83552C, "Close", null, c35035m.f148359p, composer, 48, 4);
            }
        } else {
            C27430e c27430eM83552C2 = C27648a.m83552C();
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87152f0(-412521741);
            C35035m c35035m2 = (C35035m) c28655q3.m87161k(AbstractC35033k.f148295a);
            c28655q3.m87173q(false);
            AbstractC23164r1.m67133b(c27430eM83552C2, "Close", null, c35035m2.f148359p, composer, 48, 4);
        }
        return C23454a0.f92919a;
    }
}
