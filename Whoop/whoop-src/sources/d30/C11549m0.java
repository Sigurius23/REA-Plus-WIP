package d30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import h20.AbstractC16653f1;
import h20.C16629b1;
import h20.C16659g1;
import h20.C16772z0;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: d30.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11549m0 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f37248E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f37249F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C16659g1 f37250G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ String f37251H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Function3 f37252I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f37253w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f37254x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37816b f37255y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f37256z;

    public C11549m0(boolean z4, boolean z13, C37816b c37816b, String str, String str2, String str3, C16659g1 c16659g1, String str4, Function3 function3) {
        this.f37253w = z4;
        this.f37254x = z13;
        this.f37255y = c37816b;
        this.f37256z = str;
        this.f37248E = str2;
        this.f37249F = str3;
        this.f37250G = c16659g1;
        this.f37251H = str4;
        this.f37252I = function3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iM87266t;
        C28655q c28655q;
        Modifier modifierMo66772c;
        C0213j c0213j;
        C0209i c0209i;
        boolean z4;
        C23000t1 c23000t1;
        String str;
        Function3 function3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87155h(zBooleanValue) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(12), C2299e.f9108K, composer, 54);
                iM87266t = AbstractC28683x.m87266t(composer);
                c28655q = (C28655q) composer;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                modifierMo66772c = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierMo66772c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(composer, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                }
                AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                C16659g1 c16659g1 = this.f37250G;
                AbstractC16653f1 abstractC16653f1 = c16659g1.f64060w;
                z4 = abstractC16653f1 instanceof C16772z0;
                c23000t1 = C23000t1.f90727a;
                if (!z4 && !(abstractC16653f1 instanceof C16629b1)) {
                    modifierMo66772c = c23000t1.mo66772c(modifierMo66772c, true, 1.0f);
                }
                AbstractC22674j.m65726l(this.f37253w, this.f37254x, this.f37255y, this.f37256z, this.f37248E, this.f37249F, c16659g1, modifierMo66772c, composer, 0);
                c28655q.m87150e0(-2131514142);
                str = this.f37251H;
                if (str != null) {
                    AbstractC20301a.m56343k(str, null, false, false, composer, 0, 14);
                }
                c28655q.m87173q(false);
                c28655q.m87150e0(-2131511234);
                function3 = this.f37252I;
                if (function3 != null && zBooleanValue) {
                    function3.invoke(c23000t1, composer, 6);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            }
        } else {
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(12), C2299e.f9108K, composer, 54);
            iM87266t = AbstractC28683x.m87266t(composer);
            c28655q = (C28655q) composer;
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            modifierMo66772c = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierMo66772c);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(composer, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            } else {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            }
            AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N2);
            C16659g1 c16659g2 = this.f37250G;
            AbstractC16653f1 abstractC16653f2 = c16659g2.f64060w;
            z4 = abstractC16653f2 instanceof C16772z0;
            c23000t1 = C23000t1.f90727a;
            if (!z4) {
                modifierMo66772c = c23000t1.mo66772c(modifierMo66772c, true, 1.0f);
            }
            AbstractC22674j.m65726l(this.f37253w, this.f37254x, this.f37255y, this.f37256z, this.f37248E, this.f37249F, c16659g2, modifierMo66772c, composer, 0);
            c28655q.m87150e0(-2131514142);
            str = this.f37251H;
            if (str != null) {
                AbstractC20301a.m56343k(str, null, false, false, composer, 0, 14);
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(-2131511234);
            function3 = this.f37252I;
            if (function3 != null) {
                function3.invoke(c23000t1, composer, 6);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        return C23454a0.f92919a;
    }
}
