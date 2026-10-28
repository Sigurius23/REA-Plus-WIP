package b30;

import androidx.compose.foundation.layout.AbstractC1102d;
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
import p098dt.AbstractC12350b;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.b4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2487b4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C2627t3 f9685E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ long f9686F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f9687G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC2527g4 f9688H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ boolean f9689I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ boolean f9690J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC4339a f9691K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Modifier f9692w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f9693x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2535h4 f9694y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f9695z;

    public C2487b4(Modifier modifier, InterfaceC4339a interfaceC4339a, C2535h4 c2535h4, boolean z4, C2627t3 c2627t3, long j7, String str, InterfaceC2527g4 interfaceC2527g4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a2) {
        this.f9692w = modifier;
        this.f9693x = interfaceC4339a;
        this.f9694y = c2535h4;
        this.f9695z = z4;
        this.f9685E = c2627t3;
        this.f9686F = j7;
        this.f9687G = str;
        this.f9688H = interfaceC2527g4;
        this.f9689I = z13;
        this.f9690J = z14;
        this.f9691K = interfaceC4339a2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004e  */
    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, this.f9692w);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iM87266t = AbstractC28683x.m87266t(composer);
                c28655q = (C28655q) composer;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                }
                AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(C2314t.f9131w, "PRIMARY_BUTTON_TEST_TAG"));
                C2535h4 c2535h4 = this.f9694y;
                Modifier modifierM3405b = AbstractC1102d.m3405b(modifierM3409f2, 0.0f, c2535h4.f9845c, 1);
                C33252i c33252iM105489e = AbstractC33253j.m105489e(c2535h4.f9843a);
                C13825t c13825tM48880a = AbstractC17269i.m48880a(c2535h4.f9844b, this.f9685E.f10227e);
                long j7 = this.f9686F;
                AbstractC12350b.m34583d(this.f9693x, modifierM3405b, this.f9695z, c33252iM105489e, c13825tM48880a, AbstractC15166v0.m43196a(j7, 0L, j7, 0L, composer, 0, 10), null, AbstractC37817c.m121344e(292028701, composer, new C2669z3(this.f9687G, this.f9688H, this.f9689I, this.f9690J, this.f9691K)), composer, 805306368, 280);
                c28655q.m87173q(true);
            }
        } else {
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, this.f9692w);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iM87266t = AbstractC28683x.m87266t(composer);
            c28655q = (C28655q) composer;
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3409f3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            } else {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            }
            AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N2);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(C2314t.f9131w, "PRIMARY_BUTTON_TEST_TAG"));
            C2535h4 c2535h5 = this.f9694y;
            Modifier modifierM3405b2 = AbstractC1102d.m3405b(modifierM3409f4, 0.0f, c2535h5.f9845c, 1);
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(c2535h5.f9843a);
            C13825t c13825tM48880a2 = AbstractC17269i.m48880a(c2535h5.f9844b, this.f9685E.f10227e);
            long j13 = this.f9686F;
            AbstractC12350b.m34583d(this.f9693x, modifierM3405b2, this.f9695z, c33252iM105489e2, c13825tM48880a2, AbstractC15166v0.m43196a(j13, 0L, j13, 0L, composer, 0, 10), null, AbstractC37817c.m121344e(292028701, composer, new C2669z3(this.f9687G, this.f9688H, this.f9689I, this.f9690J, this.f9691K)), composer, 805306368, 280);
            c28655q.m87173q(true);
        }
        return C23454a0.f92919a;
    }
}
