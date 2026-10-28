package p163g1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import g00.AbstractC14936g;
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
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C22999t0;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.C23016z;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15076m0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56443w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function3 f56444x;

    public /* synthetic */ C15076m0(int i13, Function3 function3) {
        this.f56443w = i13;
        this.f56444x = function3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        switch (this.f56443w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer;
                if (c28655q2.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, C2314t.f9131w);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9108K, c28655q2, 54);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3406c);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    this.f56444x.invoke(C23000t1.f90727a, c28655q2, 6);
                    c28655q2.m87173q(true);
                } else {
                    c28655q2.m87138X();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer2;
                if (c28655q3.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.f56444x.invoke(C23000t1.f90727a, c28655q3, 0);
                } else {
                    c28655q3.m87138X();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q4 = (C28655q) composer3;
                if (c28655q4.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c28655q4.m87150e0(-1691869137);
                    long j7 = ((C17919x) c28655q4.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    float f13 = (!((C14970c1) c28655q4.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j7)) < 0.5d : ((double) AbstractC17918w0.m51536x(j7)) > 0.5d) ? 0.87f : 1.0f;
                    c28655q4.m87173q(false);
                    AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(f13)), AbstractC37817c.m121344e(-308149173, c28655q4, new C15076m0(1, this.f56444x)), c28655q4, 56);
                } else {
                    c28655q4.m87138X();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q5 = (C28655q) composer4;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer4, 0);
                        iM87266t = AbstractC28683x.m87266t(composer4);
                        c28655q = (C28655q) composer4;
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer4, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer4, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(composer4, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                            AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                        }
                        AbstractC28683x.m87239G(composer4, C0217k.f726d, modifierM118962N2);
                        this.f56444x.invoke(C23016z.f90757a, composer4, 6);
                        c28655q.m87173q(true);
                    }
                } else {
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer4, 0);
                    iM87266t = AbstractC28683x.m87266t(composer4);
                    c28655q = (C28655q) composer4;
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer4, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer4, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(composer4, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    }
                    AbstractC28683x.m87239G(composer4, C0217k.f726d, modifierM118962N3);
                    this.f56444x.invoke(C23016z.f90757a, composer4, 6);
                    c28655q.m87173q(true);
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q6 = (C28655q) composer5;
                    if (c28655q6.m87121F()) {
                        c28655q6.m87138X();
                    } else {
                        AbstractC14936g.m43027a(null, AbstractC37817c.m121344e(-1052613098, composer5, new C15076m0(3, this.f56444x)), composer5, 48);
                    }
                } else {
                    AbstractC14936g.m43027a(null, AbstractC37817c.m121344e(-1052613098, composer5, new C15076m0(3, this.f56444x)), composer5, 48);
                }
                break;
            default:
                Composer composer6 = (Composer) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                C28655q c28655q7 = (C28655q) composer6;
                if (c28655q7.m87135U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    this.f56444x.invoke(C22999t0.f90726a, c28655q7, 6);
                } else {
                    c28655q7.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
