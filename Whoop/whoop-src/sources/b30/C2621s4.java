package b30;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.C23016z;
import p292l1.C23089e4;
import p292l1.C23177t2;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p475s0.C32034a;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.s4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2621s4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10205E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f10206F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10207w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10208x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f10209y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10210z;

    public C2621s4(boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, C22976l1 c22976l1, C37816b c37816b) {
        this.f10207w = 0;
        C22949e c22949e = AbstractC22977m.f90650a;
        this.f10208x = z4;
        this.f10209y = z13;
        this.f10210z = interfaceC4339a;
        this.f10205E = c22976l1;
        this.f10206F = c37816b;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x0107  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        switch (this.f10207w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        Modifier modifierM3393o = AbstractC1099a.m3393o((C22976l1) this.f10205E, AbstractC37056f.m118997u(C2314t.f9131w, new C32034a(this.f10208x, this.f10209y, (InterfaceC4339a) this.f10210z)));
                        C22957g c22957g = AbstractC22977m.f90652c;
                        C37816b c37816b = (C37816b) this.f10206F;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, composer, 0);
                        iM87266t = AbstractC28683x.m87266t(composer);
                        c28655q = (C28655q) composer;
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3393o);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                            AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                        }
                        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                        c37816b.invoke(C23016z.f90757a, composer, 6);
                        c28655q.m87173q(true);
                    }
                } else {
                    Modifier modifierM3393o2 = AbstractC1099a.m3393o((C22976l1) this.f10205E, AbstractC37056f.m118997u(C2314t.f9131w, new C32034a(this.f10208x, this.f10209y, (InterfaceC4339a) this.f10210z)));
                    C22957g c22957g2 = AbstractC22977m.f90652c;
                    C37816b c37816b2 = (C37816b) this.f10206F;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, composer, 0);
                    iM87266t = AbstractC28683x.m87266t(composer);
                    c28655q = (C28655q) composer;
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3393o2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    }
                    AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N2);
                    c37816b2.invoke(C23016z.f90757a, composer, 6);
                    c28655q.m87173q(true);
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer2;
                if (c28655q3.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C15043i8.f56313a.m43131a(this.f10208x, this.f10209y, (InterfaceC21083i) this.f10210z, (C15197y1) this.f10205E, (InterfaceC17869a1) this.f10206F, 0.0f, 0.0f, c28655q3, 12582912, 96);
                } else {
                    c28655q3.m87138X();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q4 = (C28655q) composer3;
                if (c28655q4.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C23177t2.f91688a.m67140a(this.f10208x, this.f10209y, (InterfaceC21083i) this.f10210z, null, (C23089e4) this.f10205E, (InterfaceC17869a1) this.f10206F, 0.0f, 0.0f, c28655q4, 100663296, 200);
                } else {
                    c28655q4.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2621s4(boolean z4, boolean z13, InterfaceC21083i interfaceC21083i, Object obj, InterfaceC17869a1 interfaceC17869a1, int i13) {
        this.f10207w = i13;
        this.f10208x = z4;
        this.f10209y = z13;
        this.f10210z = interfaceC21083i;
        this.f10205E = obj;
        this.f10206F = interfaceC17869a1;
    }
}
