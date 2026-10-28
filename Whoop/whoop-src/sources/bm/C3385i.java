package bm;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.C1104b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2395j3;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22989q;
import p291l0.C22998t;
import p390p1.AbstractC28683x;
import p390p1.C28606d2;
import p390p1.C28655q;
import p602x1.C37816b;
import p635y2.C39076b0;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: bm.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C3385i extends AbstractC22680m implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C3377a f13215w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37816b f13216x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3390n f13217y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f13218z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3385i(C3377a c3377a, C37816b c37816b, C3390n c3390n, int i13) {
        super(4);
        this.f13215w = c3377a;
        this.f13216x = c37816b;
        this.f13217y = c3390n;
        this.f13218z = i13;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        C28655q c28655q;
        C0213j c0213j;
        boolean z4;
        InterfaceC1103a items = (InterfaceC1103a) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        AbstractC22676k.m65750j(items, "$this$items");
        if ((iIntValue2 & 14) == 0) {
            i13 = (((C28655q) composer).m87153g(items) ? 4 : 2) | iIntValue2;
        } else {
            i13 = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i13 |= ((C28655q) composer).m87149e(iIntValue) ? 32 : 16;
        }
        if ((i13 & 731) == 146) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                Modifier modifierM3428y = AbstractC1102d.m3428y(((C1104b) items).m3432c(1.0f, AbstractC1129a.m3495a(C2314t.f9131w, this.f13215w, null)), null, false, 3);
                c28655q = (C28655q) composer;
                c28655q.m87152f0(733328855);
                C22998t c22998tM66764e = AbstractC22989q.m66764e(C2299e.f9114w, false, c28655q, 0);
                c28655q.m87152f0(-1323940314);
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                EnumC39181m enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
                InterfaceC2395j3 interfaceC2395j3 = (InterfaceC2395j3) c28655q.m87161k(AbstractC2453v1.f9580s);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                C37816b c37816b = new C37816b(new C39076b0(1, modifierM3428y), true, -2123382363);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c28655q.f115930y = false;
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22998tM66764e);
                AbstractC28683x.m87239G(c28655q, C0217k.f727e, interfaceC39171c);
                AbstractC28683x.m87239G(c28655q, C0217k.f730h, enumC39181m);
                AbstractC28683x.m87239G(c28655q, C0217k.f731i, interfaceC2395j3);
                if (c28655q.f115931z >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c28655q.f115930y = z4;
                c37816b.invoke(new C28606d2(c28655q), c28655q, 0);
                c28655q.m87152f0(2058660585);
                c28655q.m87152f0(-2137368960);
                this.f13216x.invoke(this.f13217y, Integer.valueOf(iIntValue), c28655q, Integer.valueOf((i13 & 112) | (this.f13218z & 896)));
                AbstractC2875y.m8286B(c28655q, false, false, true, false);
                c28655q.m87173q(false);
            }
        } else {
            Modifier modifierM3428y2 = AbstractC1102d.m3428y(((C1104b) items).m3432c(1.0f, AbstractC1129a.m3495a(C2314t.f9131w, this.f13215w, null)), null, false, 3);
            c28655q = (C28655q) composer;
            c28655q.m87152f0(733328855);
            C22998t c22998tM66764e2 = AbstractC22989q.m66764e(C2299e.f9114w, false, c28655q, 0);
            c28655q.m87152f0(-1323940314);
            InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            EnumC39181m enumC39181m2 = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
            InterfaceC2395j3 interfaceC2395j4 = (InterfaceC2395j3) c28655q.m87161k(AbstractC2453v1.f9580s);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            C37816b c37816b2 = new C37816b(new C39076b0(1, modifierM3428y2), true, -2123382363);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c28655q.f115930y = false;
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22998tM66764e2);
            AbstractC28683x.m87239G(c28655q, C0217k.f727e, interfaceC39171c2);
            AbstractC28683x.m87239G(c28655q, C0217k.f730h, enumC39181m2);
            AbstractC28683x.m87239G(c28655q, C0217k.f731i, interfaceC2395j4);
            if (c28655q.f115931z >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            c28655q.f115930y = z4;
            c37816b2.invoke(new C28606d2(c28655q), c28655q, 0);
            c28655q.m87152f0(2058660585);
            c28655q.m87152f0(-2137368960);
            this.f13216x.invoke(this.f13217y, Integer.valueOf(iIntValue), c28655q, Integer.valueOf((i13 & 112) | (this.f13218z & 896)));
            AbstractC2875y.m8286B(c28655q, false, false, true, false);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }
}
