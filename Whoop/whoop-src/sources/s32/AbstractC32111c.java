package s32;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d41.C11678d;
import gy0.AbstractC16276e;
import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import mh.C25540h;
import ny0.C27246d;
import ny0.C27256h;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p730qt2.C30599e;
import p745y81.EnumC39333f;
import p90.C29000h;
import pf.AbstractC29125c;
import ph.C29227a;
import q11.C29793c;
import q32.C29952d;
import q32.InterfaceC29949a;
import q81.C30047e;
import q81.C30048f;
import q83.AbstractC30060g;
import qb0.C30179a;
import qz0.AbstractC30795n;
import t32.AbstractC33528a;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s32.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lq32/d$b;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "q", "(Landroidx/compose/ui/Modifier;Lq32/d$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ls32/a;", "state", "onViewEvent", "l", "(Ls32/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "image", "i", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "o", "(Landroidx/compose/runtime/Composer;I)V", "personal-records-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32111c {
    /* JADX INFO: renamed from: i */
    private static final void m99940i(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1257474862);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            float f14 = 18 * f13;
            int iMo743q0 = ((int) ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14)) * 2;
            C2314t c2314t = C2314t.f9131w;
            float f15 = ((float) 0.5d) * 8;
            float f16 = 2 * f13;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1099a.m3398t(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3424u(f14, AbstractC1102d.m3411h(14 * f13, c2314t))), f15, f15, 0.0f, f15, 4), EnumC39333f.BRAND_BLACK.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC33253j.m105489e(f16));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f16));
            boolean zM87149e = c28655q.m87149e(iMo743q0);
            Object objM87133R = c28655q.m87133R();
            if (zM87149e || objM87133R == C28635l.f115821a) {
                objM87133R = new C6494e(iMo743q0, 25);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, (Function1) objM87133R, c28655q, AbstractC22403o.f87638a | (i14 & 14), 1), null, modifierM118994r, null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m99941j(int i13, C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75120d(i13, i13);
        rememberImagePainter.f100086j = new C29227a(0, 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m99942k(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m99940i(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m99943l(C32109a c32109a, Function1 function1, Composer composer, int i13) {
        int i14;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1888041520);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c32109a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125370W0 = c38072d.m121949b(c28655q, i15).getWhite10();
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM31987f = AbstractC11895b.m31987f(3, f13, c2314t, jM125370W0);
            boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(c32109a);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C30599e(28, function1, c32109a);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3362g(modifierM31987f, false, null, null, (InterfaceC4339a) objM87133R, 15));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            m99940i(c32109a.getImage(), c28655q, AbstractC22403o.f87638a);
            float f14 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, ((float) 1.5d) * f14, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3396r, true, 1.0f);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM31988g);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            TextResource textResourceM99926b = c32109a.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM99926b, c28655q, i16);
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8421b = c38072d.m121952e(c28655q, i15).getB2();
            int i17 = C2886a.f11498d << 18;
            C0209i c0209i6 = c0209i;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM8421b, null, c28655q, 0, i17 | 3120, 186362);
            c28655q.m87173q(true);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c32109a.getValue(), c28655q, i16), AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * f13, 0.0f, 2), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getN55(), null, c28655q, 48, i17, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c32109a.getUnit(), c28655q, i16), AbstractC1099a.m3392n(c2314t, 0.0f, ((float) (-0.5d)) * f13, 1), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getN8(), null, c28655q, 0, i17, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.CARET_FORWARD.toWhoopIcon(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC33528a.f139954a), AbstractC34132o.m107879c(0.5f, AbstractC1102d.m3419p(f13 * f13, AbstractC1099a.m3396r(c2314t, 1 * f14, 0.0f, 2))), c38072d.m121949b(c28655q, i15).getBrandWhite(), c28655q, 384, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(c32109a, function1, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m99944m(Function1 function1, C32109a c32109a) {
        function1.invoke(c32109a.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m99945n(C32109a c32109a, Function1 function1, int i13, Composer composer, int i14) {
        m99943l(c32109a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m99946o(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(979452767);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13 * 4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 0.0f, 0.0f, 3 * f13, 7));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35684p.m113047h(null, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 0, 509);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m99947p(int i13, Composer composer, int i14) {
        m99946o(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m99948q(Modifier modifier, C29952d.b viewState, Function1 onEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1059553763);
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifier2, 0.0f, 1 * f13, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            Modifier modifier4 = modifier2;
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            boolean zIsEmpty = viewState.m91634a().isEmpty();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zIsEmpty) {
                c28655q.m87150e0(922709609);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(922305028);
                int i17 = 0;
                for (Object obj : viewState.m91634a()) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                    if (i17 > 0) {
                        c28655q.m87150e0(691672007);
                        AbstractC25012a.m73388u((float) 1.5d, f13, c2314t, c28655q, false);
                    } else {
                        c28655q.m87150e0(691757536);
                        c28655q.m87173q(false);
                    }
                    AbstractC22676k.m65748h(interfaceC25312u, "null cannot be cast to non-null type com.whoop.personalrecords.miniarch.view.PersonalRecordItemViewState");
                    C32109a c32109a = (C32109a) interfaceC25312u;
                    boolean z4 = (i15 & 896) == 256;
                    Object objM87133R = c28655q.m87133R();
                    if (z4 || objM87133R == c28676v0) {
                        objM87133R = new C29000h(onEvent, 24);
                        c28655q.m87172p0(objM87133R);
                    }
                    m99943l(c32109a, (Function1) objM87133R, c28655q, 0);
                    i17 = i18;
                }
                c28655q.m87173q(false);
            }
            if (!viewState.getShowMore() || viewState.getIsLoadingMore()) {
                c28655q.m87150e0(923628201);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(922797897);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f13, c2314t));
                C27246d c27246d = new C27246d();
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                boolean z13 = false ? 1 : 0;
                C27256h c27256h = new C27256h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC33528a.f139955b)), EnumC16313m0.CARET_DOWN, null, null, null, null, EnumC27272p.DEFAULT, new C9598e(null, null, null, 7, null), false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, null, z13, false, true, null, false, false, null, null, null, null, null, null, null, 33529660, null);
                boolean zM87157i = ((i15 & 896) == 256) | c28655q.m87157i(viewState);
                Object objM87133R2 = c28655q.m87133R();
                Object obj2 = objM87133R2;
                if (zM87157i || objM87133R2 == c28676v0) {
                    C29793c c29793c = new C29793c(25, onEvent, viewState);
                    c28655q.m87172p0(c29793c);
                    obj2 = c29793c;
                }
                c27246d.Compose(modifierM3409f, c27256h, (Function1) obj2, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                c28655q.m87173q(false);
            }
            if (viewState.getIsLoadingMore()) {
                c28655q.m87150e0(923670051);
                AbstractC11266d.m30469w(2, f13, c2314t, c28655q);
                m99946o(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(923768073);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 27, modifier3, viewState, onEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m99949r(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m99950s(Function1 function1, C29952d.b bVar, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C27256h) {
            function1.invoke(new InterfaceC29949a.b(bVar.getNextStartDate(), bVar.getNextEndDate(), bVar.getNextExerciseOffset()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m99951t(Modifier modifier, C29952d.b bVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m99948q(modifier, bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
