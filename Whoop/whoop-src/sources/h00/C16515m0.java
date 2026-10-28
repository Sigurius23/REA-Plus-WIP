package h00;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d30.C11518b0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p048ce.AbstractC4482w;
import p098dt.AbstractC12350b;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15067l1;
import p163g1.AbstractC15166v0;
import p163g1.C14970c1;
import p163g1.C15117q1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h00.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16515m0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f63499E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f63500F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Modifier f63501w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f63502x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ EnumC16519o0 f63503y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f63504z;

    public C16515m0(Modifier modifier, InterfaceC4339a interfaceC4339a, EnumC16519o0 enumC16519o0, boolean z4, InterfaceC4339a interfaceC4339a2, String str) {
        this.f63501w = modifier;
        this.f63502x = interfaceC4339a;
        this.f63503y = enumC16519o0;
        this.f63504z = z4;
        this.f63499E = interfaceC4339a2;
        this.f63500F = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0048  */
    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:20:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        EnumC16519o0 enumC16519o0;
        EnumC16519o0 enumC16519o1;
        boolean z4;
        long j7;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iM87266t = AbstractC28683x.m87266t(composer);
                c28655q = (C28655q) composer;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, this.f63501w);
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
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(AbstractC4482w.m13981Q(composer).f55691d, C2314t.f9131w)), "PrimaryButtonTag");
                enumC16519o0 = EnumC16519o0.Enabled;
                enumC16519o1 = this.f63503y;
                if (enumC16519o1 == enumC16519o0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float f13 = 0;
                C15117q1 c15117q1M43197b = AbstractC15166v0.m43197b(f13, f13, f13, f13, f13, composer, 28086, 0);
                C33252i c33252i = AbstractC4482w.m13981Q(composer).f55690c;
                long j13 = AbstractC4482w.m13975K(composer).f55672k;
                long j14 = AbstractC4482w.m13975K(composer).f55681t;
                long j15 = AbstractC4482w.m13975K(composer).f55672k;
                long j16 = AbstractC4482w.m13975K(composer).f55681t;
                j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j7);
                } else {
                    AbstractC17918w0.m51536x(j7);
                }
                AbstractC12350b.m34578a(this.f63502x, modifierM3599a, z4, c15117q1M43197b, c33252i, null, AbstractC15166v0.m43196a(j13, j14, j15, C17919x.m51541c(0.38f, j16), composer, 0, 0), null, AbstractC37817c.m121344e(-2006276858, composer, new C11518b0(3, enumC16519o1, this.f63500F)), composer, 805306368, 328);
                AbstractC16517n0.m46672a(enumC16519o1, this.f63504z, this.f63499E, composer, 6);
                c28655q.m87173q(true);
            }
        } else {
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iM87266t = AbstractC28683x.m87266t(composer);
            c28655q = (C28655q) composer;
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, this.f63501w);
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
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(AbstractC4482w.m13981Q(composer).f55691d, C2314t.f9131w)), "PrimaryButtonTag");
            enumC16519o0 = EnumC16519o0.Enabled;
            enumC16519o1 = this.f63503y;
            if (enumC16519o1 == enumC16519o0) {
                z4 = true;
            } else {
                z4 = false;
            }
            float f14 = 0;
            C15117q1 c15117q1M43197b2 = AbstractC15166v0.m43197b(f14, f14, f14, f14, f14, composer, 28086, 0);
            C33252i c33252i2 = AbstractC4482w.m13981Q(composer).f55690c;
            long j17 = AbstractC4482w.m13975K(composer).f55672k;
            long j18 = AbstractC4482w.m13975K(composer).f55681t;
            long j19 = AbstractC4482w.m13975K(composer).f55672k;
            long j110 = AbstractC4482w.m13975K(composer).f55681t;
            j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
            if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                AbstractC17918w0.m51536x(j7);
            } else {
                AbstractC17918w0.m51536x(j7);
            }
            AbstractC12350b.m34578a(this.f63502x, modifierM3599a2, z4, c15117q1M43197b2, c33252i2, null, AbstractC15166v0.m43196a(j17, j18, j19, C17919x.m51541c(0.38f, j110), composer, 0, 0), null, AbstractC37817c.m121344e(-2006276858, composer, new C11518b0(3, enumC16519o1, this.f63500F)), composer, 805306368, 328);
            AbstractC16517n0.m46672a(enumC16519o1, this.f63504z, this.f63499E, composer, 6);
            c28655q.m87173q(true);
        }
        return C23454a0.f92919a;
    }
}
