package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.InterfaceC22940b2;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15066l0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56416w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC22940b2 f56417x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC22973k1 f56418y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37816b f56419z;

    public /* synthetic */ C15066l0(InterfaceC22940b2 interfaceC22940b2, InterfaceC22973k1 interfaceC22973k1, C37816b c37816b, int i13) {
        this.f56416w = i13;
        this.f56417x = interfaceC22940b2;
        this.f56418y = interfaceC22973k1;
        this.f56419z = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56416w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Modifier modifierM3411h = AbstractC1102d.m3411h(AbstractC15086n0.f56484a, AbstractC1099a.m3393o(this.f56418y, AbstractC22953f.m66727p(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), this.f56417x)));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
                    int iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    this.f56419z.invoke(C23000t1.f90727a, c28655q, 6);
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C28596b0 c28596b0 = AbstractC15047j1.f56336a;
                    long j7 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    AbstractC28683x.m87247a(c28596b0.mo86977a(Float.valueOf((!((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j7)) < 0.5d : ((double) AbstractC17918w0.m51536x(j7)) > 0.5d) ? 0.6f : 0.74f)), AbstractC37817c.m121344e(597057613, c28655q2, new C15066l0(this.f56417x, this.f56418y, this.f56419z, 0)), c28655q2, 56);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
