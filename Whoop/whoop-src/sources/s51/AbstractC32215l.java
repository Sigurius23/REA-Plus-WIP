package s51;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.AbstractC2890e;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j81.AbstractC21418b;
import java.util.ArrayList;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s51.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ls51/m;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "m", "(Landroidx/compose/ui/Modifier;Ls51/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ls51/i;", "dial", "onDialClicked", "j", "(Landroidx/compose/ui/Modifier;Ls51/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "f", "(Ls51/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Ls51/i;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32215l {
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    /* JADX WARN: Code duplicated, block: B:47:0x0164  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x017e  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    private static final void m100226f(C32212i c32212i, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1312655427);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c32212i) : c28655q.m87157i(c32212i) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                float f14 = 1;
                Modifier modifierM3398t = AbstractC1099a.m3398t(modifier3, 0.0f, f14 * 8, 0.0f, 0.0f, 13);
                Modifier modifier4 = modifier3;
                f13 = 4;
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f14, f13, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                String strM21274h = AbstractC8693b.m21274h(c32212i.getTitle(), c28655q, 0);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
                c28655q = c28655q;
                if (c32212i.getTitleEndIcon() != null) {
                    c28655q.m87150e0(821243014);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c32212i.getTitleEndIcon().toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(3 * f13, c2314t), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(821501833);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32214k(c32212i, modifier2, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            float f15 = 1;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifier3, 0.0f, f15 * 8, 0.0f, 0.0f, 13);
            Modifier modifier5 = modifier3;
            f13 = 4;
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(f15, f13, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            String strM21274h2 = AbstractC8693b.m21274h(c32212i.getTitle(), c28655q, 0);
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196090);
            c28655q = c28655q;
            if (c32212i.getTitleEndIcon() != null) {
                c28655q.m87150e0(821243014);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c32212i.getTitleEndIcon().toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(3 * f13, c2314t), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(821501833);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier2 = modifier5;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32214k(c32212i, modifier2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m100227g(C32212i c32212i, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m100226f(c32212i, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m100228h(Modifier modifier, C32212i c32212i, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        String strM21274h;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-670243563);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(c32212i) : c28655q2.m87157i(c32212i) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            String strM21274h2 = AbstractC8693b.m21274h(c32212i.getScoreDisplay(), c28655q2, 0);
            TextResource scoreDisplaySuffix = c32212i.getScoreDisplaySuffix();
            if (scoreDisplaySuffix == null) {
                c28655q2.m87150e0(77162004);
                c28655q2.m87173q(false);
                strM21274h = null;
            } else {
                c28655q2.m87150e0(77162005);
                strM21274h = AbstractC8693b.m21274h(scoreDisplaySuffix, c28655q2, 0);
                c28655q2.m87173q(false);
            }
            if (strM21274h == null) {
                strM21274h = "";
            }
            C38072d c38072d = C38072d.f163053a;
            ArrayList arrayListM118964P = AbstractC37056f.m118964P(new C23465k(strM21274h2, AbstractC2890e.m8451f(C23285v0.m67364b(c38072d.m121952e(c28655q2, 6).getN5().getStyle(), 0L, AbstractC35745c.m113248j(21.0f, 4294967296L), null, null, 0L, 0, 0L, null, null, 16777213), c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 0)));
            if (strM21274h.length() > 0) {
                c28655q2.m87150e0(77458148);
                arrayListM118964P.add(new C23465k(strM21274h, AbstractC2890e.m8451f(C23285v0.m67364b(c38072d.m121952e(c28655q2, 6).getN5().getStyle(), 0L, AbstractC35745c.m113248j(15.0f, 4294967296L), null, null, 0L, 0, 0L, null, null, 16777213), c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 0)));
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(77682061);
                c28655q2.m87173q(false);
            }
            c28655q = c28655q2;
            AbstractC30795n.m94704e(arrayListM118964P, modifier3, 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, null, c28655q, (i15 << 3) & 112, 0, 261628);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32214k(modifier3, c32212i, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m100229i(Modifier modifier, C32212i c32212i, int i13, int i14, Composer composer, int i15) {
        m100228h(modifier, c32212i, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m100230j(Modifier modifier, C32212i c32212i, Function1 onDialClicked, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C32212i dial = c32212i;
        AbstractC22676k.m65750j(dial, "dial");
        AbstractC22676k.m65750j(onDialClicked, "onDialClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(30056283);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(dial) : c28655q.m87157i(dial) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onDialClicked) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            int i18 = i17 & 112;
            boolean z4 = (i18 == 32 || ((i17 & 64) != 0 && c28655q.m87157i(dial))) | ((i17 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C32209f(2, dial, onDialClicked);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM5391i = AbstractC1772c1.m5391i(modifier4, false, null, (InterfaceC4339a) objM87133R, 3);
            C2307m c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM5391i);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            dial = c32212i;
            AbstractC21418b.m60229c(AbstractC1102d.m3419p(C32212i.INSTANCE.m100217a(), c2314t), C32212i.m100210i(dial, 0.0f, 0.0f, 3, null), null, c28655q, 6, 4);
            AbstractC11266d.m30469w((float) 1.5d, 8, c2314t, c28655q);
            int i19 = C9598e.f28134d;
            m100228h(null, dial, c28655q, (i19 << 3) | i18, 1);
            c28655q.m87173q(true);
            if (AbstractC8693b.m21270d(dial.getTitle())) {
                c28655q.m87150e0(1528956405);
                m100226f(dial, null, c28655q, i19 | ((i17 >> 3) & 14), 2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1529008299);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(modifier3, dial, onDialClicked, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m100231k(C32212i c32212i, Function1 function1) {
        C9598e destination = c32212i.getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m100232l(Modifier modifier, C32212i c32212i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m100230j(modifier, c32212i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m100233m(Modifier modifier, C32216m state, Function1 onEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(252267683);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            modifier3 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(-880836353);
            for (C32212i c32212i : state.m100235a()) {
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m100230j(new LayoutWeightElement(1.0f, true), c32212i, onEvent, c28655q, (i17 & 896) | (C9598e.f28134d << 3), 0);
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(modifier3, state, onEvent, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m100234n(Modifier modifier, C32216m c32216m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m100233m(modifier, c32216m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
