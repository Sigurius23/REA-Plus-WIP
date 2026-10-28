package qc2;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.Iterator;
import java.util.Locale;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no0.C26984y0;
import os0.C28308d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qc2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lqc2/c;", "state", "Ll83/a0;", "g", "(Landroidx/compose/ui/Modifier;Lqc2/c;Landroidx/compose/runtime/Composer;II)V", "Lqc2/c$a;", "i", "(Landroidx/compose/ui/Modifier;Lqc2/c$a;Landroidx/compose/runtime/Composer;II)V", "Lqc2/c$b;", "k", "(Landroidx/compose/ui/Modifier;Lqc2/c$b;Landroidx/compose/runtime/Composer;II)V", "Lqc2/a;", "content", "e", "(Lqc2/a;Landroidx/compose/runtime/Composer;I)V", "", "a", "F", "FIRST_COLUMN_WEIGHT", "b", "SECOND_COLUMN_WEIGHT", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30220b {

    /* JADX INFO: renamed from: a */
    private static final float f123754a = 0.4f;

    /* JADX INFO: renamed from: b */
    private static final float f123755b = 0.6f;

    /* JADX INFO: renamed from: e */
    public static final void m92486e(AbstractC30219a content, Composer composer, int i13) {
        int i14;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1996398811);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(content) ? 4 : 2);
        } else {
            i14 = i13;
        }
        boolean z4 = true;
        boolean z13 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            boolean z14 = content instanceof AbstractC30219a.b;
            C2314t c2314t = C2314t.f9131w;
            if (z14) {
                c28655q.m87150e0(1990279419);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(2064984775);
                Iterator<T> it = ((AbstractC30219a.b) content).m92480a().iterator();
                while (it.hasNext()) {
                    String strM21274h = AbstractC8693b.m21274h((TextResource) it.next(), c28655q, TextResource.$stable);
                    Locale locale = Locale.getDefault();
                    AbstractC22676k.m65749i(locale, "getDefault(...)");
                    String upperCase = strM21274h.toUpperCase(locale);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    C38072d c38072d = C38072d.f163053a;
                    int i15 = C38072d.f163054b;
                    C28655q c28655q2 = c28655q;
                    AbstractC30795n.m94707h(upperCase, null, c38072d.m121949b(c28655q, i15).getGreyL1(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB4(), null, c28655q2, 0, C2886a.f11498d << 18, 196090);
                    z13 = z13;
                    z4 = z4;
                    c28655q = c28655q2;
                }
                boolean z15 = z13;
                AbstractC25012a.m73392y(c28655q, z15, z4, z15);
            } else if (content instanceof AbstractC30219a.a) {
                c28655q.m87150e0(1990730841);
                AbstractC15005f3.m43107a(AbstractC22404p.m64500i(((AbstractC30219a.a) content).getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), "", null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getGreyL1(), c28655q, 48, 4);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                if (!(content instanceof AbstractC30219a.c)) {
                    throw AbstractC11895b.m32003v(1311127242, c28655q, false);
                }
                c28655q.m87150e0(1990976702);
                C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 2.5d, 8, c2305k, c28655q, 6);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                c28655q.m87150e0(1135577233);
                Iterator<T> it3 = ((AbstractC30219a.c) content).m92481a().iterator();
                while (it3.hasNext()) {
                    m92486e((AbstractC30219a) it3.next(), c28655q, 0);
                }
                AbstractC25012a.m73392y(c28655q, false, true, false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(content, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m92487f(AbstractC30219a abstractC30219a, int i13, Composer composer, int i14) {
        m92486e(abstractC30219a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m92488g(Modifier modifier, AbstractC30221c state, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1320747163);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            if (state instanceof AbstractC30221c.a) {
                c28655q.m87150e0(-2072290589);
                m92490i(modifier, (AbstractC30221c.a) state, c28655q, i15 & 126, 0);
                c28655q.m87173q(false);
            } else {
                if (!(state instanceof AbstractC30221c.b)) {
                    throw AbstractC11895b.m32003v(-2072292436, c28655q, false);
                }
                c28655q.m87150e0(-2072287482);
                m92492k(modifier, (AbstractC30221c.b) state, c28655q, i15 & 126, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier2, state, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m92489h(Modifier modifier, AbstractC30221c abstractC30221c, int i13, int i14, Composer composer, int i15) {
        m92488g(modifier, abstractC30221c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m92490i(Modifier modifier, AbstractC30221c.a state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        int i16;
        Modifier modifier4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1608426776);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i17 != 0) {
                int i18 = i15;
                modifier4 = C2314t.f9131w;
                i16 = i18;
            } else {
                i16 = i15;
                modifier4 = modifier2;
            }
            String strM21274h = AbstractC8693b.m21274h(state.getText(), c28655q2, TextResource.$stable);
            Locale locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault(...)");
            String upperCase = strM21274h.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            C38072d c38072d = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(upperCase, modifier4, c38072d.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getH5(), null, c28655q, (i16 << 3) & 112, C2886a.f11498d << 18, 196088);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier3, state, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m92491j(Modifier modifier, AbstractC30221c.a aVar, int i13, int i14, Composer composer, int i15) {
        m92490i(modifier, aVar, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m92492k(Modifier modifier, AbstractC30221c.b state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(967919928);
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
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        boolean z4 = false;
        boolean z13 = true;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            float f13 = f123754a;
            if (f13 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (f13 > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            c28655q2.m87150e0(2078462138);
            Iterator<T> it = state.m92496b().iterator();
            while (it.hasNext()) {
                String strM21274h = AbstractC8693b.m21274h((TextResource) it.next(), c28655q2, TextResource.$stable);
                Locale locale = Locale.getDefault();
                AbstractC22676k.m65749i(locale, "getDefault(...)");
                String upperCase = strM21274h.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(upperCase, null, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getH5(), null, c28655q3, 0, C2886a.f11498d << 18, 196090);
                modifier4 = modifier4;
                z4 = z4;
                c28655q2 = c28655q3;
                z13 = true;
            }
            Modifier modifier5 = modifier4;
            c28655q = c28655q2;
            boolean z14 = z4;
            c28655q.m87173q(z14);
            c28655q.m87173q(true);
            float f14 = f123755b;
            if (f14 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (f14 > Float.MAX_VALUE) {
                f14 = Float.MAX_VALUE;
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f14, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, z14 ? 1 : 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            m92486e(state.getContent(), c28655q, z14 ? 1 : 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier3, state, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m92493l(Modifier modifier, AbstractC30221c.b bVar, int i13, int i14, Composer composer, int i15) {
        m92492k(modifier, bVar, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
