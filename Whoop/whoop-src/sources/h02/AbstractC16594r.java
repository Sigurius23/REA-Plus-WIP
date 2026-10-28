package h02;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fc0.C14361e;
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
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36776l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: h02.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh02/s;", "state", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lh02/s;Landroidx/compose/runtime/Composer;II)V", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16594r {
    /* JADX INFO: renamed from: b */
    public static final void m47094b(Modifier modifier, C16595s state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        boolean z4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-331805652);
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
            i15 |= c28655q2.m87153g(state) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            float f13 = 1 * 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(state.getTitle());
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM21278l, c28655q2, i17);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            C2886a t14 = c38072d.m121952e(c28655q2, i18).getT3();
            long brandBlack = c38072d.m121949b(c28655q2, i18).getBrandBlack();
            int i19 = C2886a.f11498d << 18;
            modifier3 = modifier4;
            AbstractC30795n.m94707h(strM21274h, null, brandBlack, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q2, 0, i19, 196602);
            C28655q c28655q3 = c28655q2;
            String color = state.getColor();
            if (color == null || AbstractC39414r.m125890i0(color)) {
                z4 = false;
                c28655q3.m87150e0(-708649332);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-708842803);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getColor()), c28655q3, i17), null, c38072d.m121949b(c28655q3, i18).getBlack50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i18).getB2(), null, c28655q3, 0, i19, 196602);
                c28655q3 = c28655q3;
                z4 = false;
                c28655q3.m87173q(false);
            }
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9107J, c28655q3, 6);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
            String salePrice = state.getSalePrice();
            if (salePrice == null || AbstractC39414r.m125890i0(salePrice)) {
                c28655q3.m87150e0(-955557731);
                C28655q c28655q4 = c28655q3;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getPrice()), c28655q3, i17), null, c38072d.m121949b(c28655q3, i18).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i18).getBnM(), null, c28655q4, 0, i19, 196602);
                c28655q = c28655q4;
                c28655q.m87173q(z4);
            } else {
                c28655q3.m87150e0(-956104137);
                C28655q c28655q5 = c28655q3;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getPrice()), c28655q3, i17), null, c38072d.m121949b(c28655q3, i18).getBlack50(), 0L, null, null, null, 0L, C36776l.f157353d, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i18).getBnM(), null, c28655q5, 100663296, i19, 196346);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getSalePrice()), c28655q5, i17), null, c38072d.m121949b(c28655q5, i18).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i18).getBnM(), null, c28655q5, 0, i19, 196602);
                c28655q5.m87173q(false);
                c28655q = c28655q5;
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(modifier3, state, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m47095c(Modifier modifier, C16595s c16595s, int i13, int i14, Composer composer, int i15) {
        m47094b(modifier, c16595s, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
