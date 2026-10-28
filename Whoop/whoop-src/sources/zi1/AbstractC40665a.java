package zi1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.io.IOException;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.C40348h6;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import ti1.AbstractC33852d;
import wb3.AbstractC37056f;
import wq1.C37508b;
import x81.C38072d;
import yi1.InterfaceC39570d;

/* JADX INFO: renamed from: zi1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lyi1/d$a;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onRetry", "c", "(Lyi1/d$a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40665a {
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0205  */
    /* JADX WARN: Code duplicated, block: B:58:0x020e  */
    /* JADX WARN: Code duplicated, block: B:60:0x021c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0226  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m131995c(InterfaceC39570d.a viewState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        InterfaceC4339a interfaceC4339a3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1427382950);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C40348h6(29);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                C2314t c2314t = C2314t.f9131w;
                float f13 = 3;
                float f14 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f13 * f14, 6 * f14);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                C27430e c27430eM107874S = AbstractC34132o.m107874S(viewState.getIcon().toWhoopIcon(), c28655q2, 6);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S, null, null, c38072d.m121949b(c28655q2, i17).getWhite20(), c28655q2, 48, 4);
                float f15 = 4;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15 * f15, c2314t));
                TextResource textResourceM126375c = viewState.getTitle();
                int i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM126375c, c28655q2, i18);
                C2886a c2886aM8436q = c38072d.m121952e(c28655q2, i17).getH3();
                long jM125430y = c38072d.m121949b(c28655q2, i17).getBrandWhite();
                C36775k c36775k = new C36775k(3);
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q2, 0, i19, 196090);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(2 * f15, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getMessage(), c28655q2, i18), null, c38072d.m121949b(c28655q2, i17).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB3(), null, c28655q2, 0, i19, 196090);
                AbstractC11266d.m30469w(f13, f15, c2314t, c28655q2);
                InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
                AbstractC27282u.m82292h(null, EnumC27284v.TextSmall, AbstractC30060g.m92103Y(c28655q2, AbstractC33852d.f141779l), false, 0L, null, false, interfaceC4339a4, c28655q2, (29360128 & (i15 << 18)) | 48, 121);
                c28655q = c28655q2;
                if (5.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(5.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 5.0f, true));
                c28655q.m87173q(true);
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37508b(viewState, i13, interfaceC4339a2, i14, 26);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40348h6(29);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            float f16 = 3;
            float f17 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t2), f16 * f17, 6 * f17);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(viewState.getIcon().toWhoopIcon(), c28655q2, 6);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S2, null, null, c38072d2.m121949b(c28655q2, i110).getWhite20(), c28655q2, 48, 4);
            float f18 = 4;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f18 * f18, c2314t2));
            TextResource textResourceM126375c2 = viewState.getTitle();
            int i111 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM126375c2, c28655q2, i111);
            C2886a c2886aM8436q2 = c38072d2.m121952e(c28655q2, i110).getH3();
            long jM125430y2 = c38072d2.m121949b(c28655q2, i110).getBrandWhite();
            C36775k c36775k2 = new C36775k(3);
            int i112 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8436q2, null, c28655q2, 0, i112, 196090);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(2 * f18, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getMessage(), c28655q2, i111), null, c38072d2.m121949b(c28655q2, i110).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i110).getB3(), null, c28655q2, 0, i112, 196090);
            AbstractC11266d.m30469w(f16, f18, c2314t2, c28655q2);
            InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
            AbstractC27282u.m82292h(null, EnumC27284v.TextSmall, AbstractC30060g.m92103Y(c28655q2, AbstractC33852d.f141779l), false, 0L, null, false, interfaceC4339a5, c28655q2, (29360128 & (i15 << 18)) | 48, 121);
            c28655q = c28655q2;
            if (5.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(5.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 5.0f, true));
            c28655q.m87173q(true);
            interfaceC4339a2 = interfaceC4339a5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(viewState, i13, interfaceC4339a2, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m131996d() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m131997e(InterfaceC39570d.a aVar, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m131995c(aVar, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
