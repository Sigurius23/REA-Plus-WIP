package jm1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import io2.C20769k0;
import j11.C21214q;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p01.AbstractC28586f;
import p01.C28582b;
import p01.EnumC28588h;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p251jg.C21650c;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: jm1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Ljm1/d;", "cardState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Ljm1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lb91/a;", "l", "(Ljm1/d;Landroidx/compose/runtime/Composer;I)Lb91/a;", "a", "Ljm1/d;", "calibrationTimelineZeroOfSevenPreviewState", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21792c {

    /* JADX INFO: renamed from: a */
    private static final C21793d f83938a;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("CALIBRATION TIMELINE");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("ارتدِ جهاز WHOOP الخاص بك كل ليلة قبل النوم، ثم عد إلى هنا لتتبع أنماط نومك واكتشاف رؤى جديدة.");
        C9598e c9598e = new C9598e(null, null, null, 7, null);
        EnumC28588h enumC28588h = EnumC28588h.STEPS;
        f83938a = new C21793d(textResourceM21278l, textResourceM21278l2, c9598e, UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, "/7", new C28582b(7, 0, 0.0f, "", null, null, Boolean.FALSE, null, null, null, AbstractC15673b0.m43985G0(), AbstractC15673b0.m43985G0(), 55, 12.0f, 14.0f, false, false, 0L, enumC28588h, null, 754612, null), false, 64, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m61656f(C21793d cardState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(cardState, "cardState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1051694);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(cardState) : c28655q.m87157i(cardState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            z4 = true;
            if ((i15 & 19) != 18) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21650c(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q.m87157i(cardState))) {
                    z4 = false;
                }
                z15 = z14 | z4;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C21214q(6, function4, cardState);
                    c28655q.m87172p0(objM87133R);
                }
                float f13 = 4;
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15), AbstractC33253j.m105489e(3 * f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f13, AbstractC37817c.m121344e(79931765, c28655q, new C21791b(cardState, 1)), c28655q, 1769472, 24);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(cardState, i13, function3, i14, 4);
            }
        }
        i15 |= 48;
        function2 = function1;
        z4 = true;
        if ((i15 & 19) != 18) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21650c(15);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i15 & 14) != 4) {
                z4 = false;
            }
            z15 = z14 | z4;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C21214q(6, function4, cardState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21214q(6, function4, cardState);
                c28655q.m87172p0(objM87133R);
            }
            float f14 = 4;
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15), AbstractC33253j.m105489e(3 * f14), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f14, AbstractC37817c.m121344e(79931765, c28655q, new C21791b(cardState, 1)), c28655q, 1769472, 24);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(cardState, i13, function3, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m61657g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m61658h(Function1 function1, C21793d c21793d) {
        function1.invoke(c21793d.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m61659i(C21793d c21793d, Composer composer, int i13) {
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            TextResource title = c21793d.getTitle();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(title, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8414L = c38072d.m121952e(c28655q, i15).getSh4();
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, i16, 196600);
            float f14 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1102d.m3419p(f14 * f14, c2314t), c38072d.m121949b(c28655q, i15).getWhite50(), c28655q, 432, 0);
            c28655q.m87173q(true);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String strM21274h2 = AbstractC8693b.m21274h(c21793d.getBody(), c28655q, i14);
            C2886a c2886aM8421b = c38072d.m121952e(c28655q, i15).getB2();
            long white70 = c38072d.m121949b(c28655q, i15).getWhite70();
            C0209i c0209i6 = c0209i;
            C0213j c0213j3 = c0213j;
            AbstractC30795n.m94707h(strM21274h2, layoutWeightElement2, white70, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 0, i16, 196600);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            AbstractC28586f.m86944i(null, c21793d.getCircularProgressIndicator(), c28655q, C28582b.f115652u << 3, 1);
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(1938861644, c28655q, new C21791b(c21793d, 0)), c28655q, 56);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m61660j(C21793d c21793d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21275i = AbstractC8693b.m21275i(c21793d.getCompletedStepsText(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long brandWhite = c38072d.m121949b(c28655q, i14).getBrandWhite();
            int i15 = TextResource.$stable | C9598e.f28134d | C28582b.f115652u;
            C2886a c2886aM61662l = m61662l(c21793d, c28655q, i15);
            float fM124805c = C39183o.m124805c(AbstractC35745c.m113246h(17));
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            long jM95626b = AbstractC31061c.m95626b(fM124805c, 4294967296L, (InterfaceC39171c) c28655q.m87161k(c28674u2));
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21275i, null, brandWhite, jM95626b, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM61662l, null, c28655q, 0, i16, 196594);
            AbstractC30795n.m94707h(AbstractC8693b.m21275i(c21793d.getTotalStepsText(), c28655q, 0), null, c38072d.m121949b(c28655q, i14).getWhite50(), AbstractC31061c.m95626b(C39183o.m124805c(AbstractC35745c.m113246h(17)), 4294967296L, (InterfaceC39171c) c28655q.m87161k(c28674u2)), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, m61662l(c21793d, c28655q, i15), null, c28655q, 0, i16, 196594);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m61661k(C21793d c21793d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m61656f(c21793d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final C2886a m61662l(C21793d c21793d, Composer composer, int i13) {
        if (!c21793d.getCompleted()) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1012152571);
            C2886a c2886aM8445z = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN45();
            c28655q.m87173q(false);
            return c2886aM8445z;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1012337331);
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q2, i14).getN45(), C23285v0.m67363a(c38072d.m121952e(c28655q2, i14).getN45().getStyle(), AbstractC15673b0.m43985G0(), 0L, null, null, 0L, 33554430), null, 2, null);
        c28655q2.m87173q(false);
        return c2886aM8397c;
    }
}
