package x20;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.android.R;
import d13.AbstractC11478a;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15044i9;
import p163g1.C15033h9;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.InterfaceC28653p1;
import p530up.AbstractC35148d;
import p571w3.C36775k;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: x20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37833a implements Function3 {

    /* JADX INFO: renamed from: x */
    public static final C37833a f161990x = new C37833a(0);

    /* JADX INFO: renamed from: y */
    public static final C37833a f161991y = new C37833a(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f161992w;

    public /* synthetic */ C37833a(int i13) {
        this.f161992w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x023d  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f161992w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                InterfaceC22997s1 TextButton = (InterfaceC22997s1) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(TextButton, "$this$TextButton");
                if ((iIntValue & 17) != 16) {
                    AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(composer, R.string.stripe_upi_polling_cancel), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                } else {
                    C28655q c28655q = (C28655q) composer;
                    if (!c28655q.m87121F()) {
                        AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(composer, R.string.stripe_upi_polling_cancel), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                    } else {
                        c28655q.m87138X();
                    }
                }
                break;
            default:
                InterfaceC22973k1 paddingValues = (InterfaceC22973k1) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(paddingValues, "paddingValues");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C28655q) composer2).m87153g(paddingValues) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    }
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3393o = AbstractC1099a.m3393o(paddingValues, AbstractC1102d.m3407d(1.0f, c2314t));
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, composer2, 0);
                int iM87266t = AbstractC28683x.m87266t(composer2);
                C28655q c28655q3 = (C28655q) composer2;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, modifierM3393o);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a);
                C0209i c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(composer2, c0209i2, interfaceC28653p1M87165m);
                C0209i c0209i3 = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q3, iM87266t, c0209i3);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(composer2, c0209i4, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(composer2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                C2305k c2305k = C2299e.f9111N;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, AbstractC35148d.m111190u(composer2, R.dimen.stripe_paymentsheet_outer_spacing_top), 1);
                C11669n c11669n = C11671p.f37680a;
                Modifier modifierM3393o2 = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifierM3396r);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 48);
                int iM87266t2 = AbstractC28683x.m87266t(composer2);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, modifierM3393o2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(composer2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iM87266t2))) {
                    AbstractC11266d.m30471y(iM87266t2, c28655q3, iM87266t2, c0209i3);
                }
                AbstractC28683x.m87239G(composer2, c0209i4, modifierM118962N2);
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_polling_failure, composer2, 0), null, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, AbstractC37857y.f162059a, 7), null, null, 0.0f, null, composer2, 432, 120);
                String strM92103Y = AbstractC30060g.m92103Y(composer2, R.string.stripe_upi_polling_payment_failed_title);
                C28674u2 c28674u2 = AbstractC15044i9.f56319b;
                AbstractC15011f9.m43114b(strM92103Y, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, AbstractC37857y.f162060b, 7), 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, ((C15033h9) c28655q3.m87161k(c28674u2)).f56277d, composer2, 48, 0, 65020);
                String strM92103Y2 = AbstractC30060g.m92103Y(composer2, R.string.stripe_upi_polling_payment_failed_message);
                C36775k c36775k = new C36775k(3);
                long j7 = ((C15033h9) c28655q3.m87161k(c28674u2)).f56282i.f92255a.f92192b;
                AbstractC35745c.m113242a(j7);
                AbstractC15011f9.m43114b(strM92103Y2, null, 0L, 0L, null, null, null, 0L, null, c36775k, AbstractC11478a.m30852d(j7, 1095216660480L & j7, 1.3f), 0, false, 0, 0, null, null, composer2, 0, 0, 129534);
                c28655q3.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(composer2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                c28655q3.m87173q(true);
                break;
        }
        return c23454a0;
    }
}
