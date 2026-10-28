package b30;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p132f0.C13825t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15027h3;
import p163g1.C14970c1;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p696zy.C41210b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.p4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2599p4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f10112E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4339a f10113F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C41210b f10114G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10115w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10116x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2535h4 f10117y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f10118z;

    public C2599p4(C2535h4 c2535h4, long j7, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, C41210b c41210b) {
        this.f10117y = c2535h4;
        this.f10118z = j7;
        this.f10116x = z4;
        this.f10112E = z13;
        this.f10113F = interfaceC4339a;
        this.f10114G = c41210b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x0105  */
    /* JADX WARN: Code duplicated, block: B:33:0x012c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0105, please report this as an issue */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        float f13;
        float f14;
        C2314t c2314t;
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        boolean z4;
        switch (this.f10115w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(C2314t.f9131w, C2299e.f9102E), "update_payment_method_remove_button"));
                        C2535h4 c2535h4 = this.f10117y;
                        Modifier modifierM3405b = AbstractC1102d.m3405b(modifierM3409f, 0.0f, c2535h4.f9845c, 1);
                        f13 = c2535h4.f9844b;
                        f14 = 2;
                        if (f13 < f14) {
                            f13 = f14;
                        }
                        C13825t c13825tM48880a = AbstractC17269i.m48880a(f13, this.f10118z);
                        AbstractC12350b.m34583d(this.f10113F, modifierM3405b, (this.f10116x || this.f10112E) ? false : true, AbstractC33253j.m105489e(c2535h4.f9843a), c13825tM48880a, null, null, AbstractC37817c.m121344e(-86515505, composer, new C2591o4(this.f10114G, 0)), composer, 805306368, 408);
                    }
                } else {
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(C1100b.f4583a.mo3400a(C2314t.f9131w, C2299e.f9102E), "update_payment_method_remove_button"));
                    C2535h4 c2535h5 = this.f10117y;
                    Modifier modifierM3405b2 = AbstractC1102d.m3405b(modifierM3409f2, 0.0f, c2535h5.f9845c, 1);
                    f13 = c2535h5.f9844b;
                    f14 = 2;
                    if (f13 < f14) {
                        f13 = f14;
                    }
                    C13825t c13825tM48880a2 = AbstractC17269i.m48880a(f13, this.f10118z);
                    AbstractC12350b.m34583d(this.f10113F, modifierM3405b2, (this.f10116x || this.f10112E) ? false : true, AbstractC33253j.m105489e(c2535h5.f9843a), c13825tM48880a2, null, null, AbstractC37817c.m121344e(-86515505, composer, new C2591o4(this.f10114G, 0)), composer, 805306368, 408);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iM87266t = AbstractC28683x.m87266t(composer2);
                        c28655q = (C28655q) composer2;
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, modifierM3409f3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                            AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                        }
                        AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N);
                        C28673u1 c28673u1Mo86977a = AbstractC15027h3.f56241a.mo86977a(Boolean.FALSE);
                        C2535h4 c2535h6 = this.f10117y;
                        long j7 = this.f10118z;
                        boolean z13 = this.f10112E;
                        z4 = this.f10116x;
                        AbstractC28683x.m87247a(c28673u1Mo86977a, AbstractC37817c.m121344e(1986889554, composer2, new C2599p4(c2535h6, j7, z13, z4, this.f10113F, this.f10114G)), composer2, 56);
                        c28655q.m87150e0(-245666818);
                        if (z4) {
                            float f15 = 8;
                            AbstractC12314q.m34325e(((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43088c(), AbstractC1136a.m3599a(AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t, C2299e.f9103F), f15, 0.0f, f15, 0.0f, 10), "REMOVE_BUTTON_LOADING"), 0, composer2, 0);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                    }
                } else {
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iM87266t = AbstractC28683x.m87266t(composer2);
                    c28655q = (C28655q) composer2;
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, modifierM3409f4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer2, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    }
                    AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N2);
                    C28673u1 c28673u1Mo86977a2 = AbstractC15027h3.f56241a.mo86977a(Boolean.FALSE);
                    C2535h4 c2535h7 = this.f10117y;
                    long j13 = this.f10118z;
                    boolean z14 = this.f10112E;
                    z4 = this.f10116x;
                    AbstractC28683x.m87247a(c28673u1Mo86977a2, AbstractC37817c.m121344e(1986889554, composer2, new C2599p4(c2535h7, j13, z14, z4, this.f10113F, this.f10114G)), composer2, 56);
                    c28655q.m87150e0(-245666818);
                    if (z4) {
                        float f16 = 8;
                        AbstractC12314q.m34325e(((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43088c(), AbstractC1136a.m3599a(AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t, C2299e.f9103F), f16, 0.0f, f16, 0.0f, 10), "REMOVE_BUTTON_LOADING"), 0, composer2, 0);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C2599p4(boolean z4, C2535h4 c2535h4, long j7, boolean z13, InterfaceC4339a interfaceC4339a, C41210b c41210b) {
        this.f10116x = z4;
        this.f10117y = c2535h4;
        this.f10118z = j7;
        this.f10112E = z13;
        this.f10113F = interfaceC4339a;
        this.f10114G = c41210b;
    }
}
