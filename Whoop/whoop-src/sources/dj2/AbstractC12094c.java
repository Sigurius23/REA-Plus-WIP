package dj2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c41.C4007d1;
import dh0.C12040a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;
import yi2.AbstractC39584a;

/* JADX INFO: renamed from: dj2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ldj2/b;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Ldj2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "strength-workout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12094c {
    /* JADX INFO: renamed from: c */
    public static final void m33419c(Modifier modifier, C12093b itemState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1819379304);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(itemState) : c28655q2.m87157i(itemState) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            if ((i14 & 4) != 0) {
                Object objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C12040a(14);
                    c28655q2.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, modifier4))));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC39584a.f170323a);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a h7 = c38072d.m121952e(c28655q2, i17).getH3();
            long brandWhite = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            C36775k c36775k = new C36775k(3);
            int i18 = C2886a.f11498d << 18;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(strM92103Y, null, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, h7, null, c28655q2, 0, i18, 196090);
            C28655q c28655q3 = c28655q2;
            if (AbstractC39414r.m125890i0(itemState.getSelectedActivityInternalName())) {
                c28655q3.m87150e0(157079412);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(156784075);
                AbstractC30795n.m94707h(itemState.getSelectedActivityInternalName(), AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f13, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q3, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i17).getP1(), null, c28655q3, 48, i18, 196088);
                c28655q3 = c28655q3;
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            c28655q = c28655q3;
            function2 = function3;
            modifier3 = modifier5;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
            modifier3 = modifier2;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(modifier3, itemState, function2, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m33420d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m33421e(Modifier modifier, C12093b c12093b, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m33419c(modifier, c12093b, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
