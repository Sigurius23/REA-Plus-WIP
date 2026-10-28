package lf0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.C2609r;
import c93.InterfaceC4339a;
import com.whoop.bot.settings.C6078h;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import hy0.AbstractC17755i2;
import hy0.C17736e;
import ih0.AbstractC18489d0;
import jp1.C21851c;
import js2.C21930h;
import jt1.C21937b;
import kd1.AbstractC22403o;
import kotlin.C2032u;
import l72.C23401h;
import l80.C23434k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p043c4.AbstractC3975r;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.l1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0013²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/m1;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Landroidx/compose/ui/Modifier;Llf0/m1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "width", "i", "(Llf0/m1;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "showOverlay", "", "heightPx", "widthDp", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23940l1 {
    /* JADX INFO: renamed from: i */
    public static final void m70497i(C23944m1 state, float f13, Function1 onViewEvent, Composer composer, int i13) {
        boolean z4;
        C2314t c2314t;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2028626446);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(state) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3424u = AbstractC1102d.m3424u(f13, AbstractC1102d.m3413j(AbstractC1136a.m3599a(c2314t2, "labs_test_item_dropdown_tag"), 0.0f, 224, 1));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1092a.m3358c(c2314t2, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC33253j.m105489e(12)), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            float f14 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
            float f15 = 2 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
            c28655q.m87150e0(1900302497);
            for (C23936k1 c23936k1 : state.m70528c()) {
                C17736e c17736eM70443a = c23936k1.getHeader();
                if (c17736eM70443a == null) {
                    c28655q.m87150e0(-1040536447);
                    c28655q.m87173q(false);
                    c2314t = c2314t2;
                    z4 = false;
                } else {
                    c28655q.m87150e0(-1040536446);
                    z4 = false;
                    c2314t = c2314t2;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t2, f15, 0.0f, 2), null, null, c17736eM70443a.getTitle(), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite70(), 0L, null, c28655q, (TextResource.$stable << 9) | 6, 214);
                    c28655q.m87173q(false);
                }
                c28655q.m87150e0(1900313209);
                for (C23908d1 c23908d1 : c23936k1.m70444b()) {
                    boolean z13 = (i14 & 896) == 256 ? true : z4;
                    Object objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C23434k(onViewEvent, 8);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC23904c1.m70266c(null, c23908d1, (Function1) objM87133R, c28655q, (C9598e.f28134d | AbstractC22403o.f87638a) << 3, 1);
                }
                c28655q.m87173q(z4);
                c2314t2 = c2314t;
            }
            AbstractC18489d0.m53356B(c28655q, false, c2314t2, f15, c28655q);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C6078h(state, f13, onViewEvent, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m70498j(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m70499k(C23944m1 c23944m1, float f13, Function1 function1, int i13, Composer composer, int i14) {
        m70497i(c23944m1, f13, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m70500l(Modifier modifier, C23944m1 state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        boolean z4;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1031025830);
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
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getShowOverlay()));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95646v(0, c28655q);
            }
            InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(new C39174f(0));
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            Modifier modifier5 = modifier4;
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
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "labs_test_item_tag");
            boolean zM87153g = c28655q.m87153g(interfaceC39171c);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g || objM87133R4 == c28676v0) {
                objM87133R4 = new C21930h(interfaceC39171c, interfaceC28593a1, interfaceC28601c2, 12);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3599a, (Function1) objM87133R4);
            C23908d1 c23908d1M70526a = state.getCurrentTest();
            boolean zM87157i = c28655q.m87157i(state);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new C21851c(24, state, interfaceC28601c1);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC23904c1.m70266c(modifierM3500d, c23908d1M70526a, (Function1) objM87133R5, c28655q, (C9598e.f28134d | AbstractC22403o.f87638a) << 3, 0);
            if (m70501m(interfaceC28601c1)) {
                c28655q.m87150e0(-43711494);
                long jM70504p = (((long) 0) << 32) | (((long) (m70504p(interfaceC28593a1) + ((int) interfaceC39171c.mo743q0(10)))) & 4294967295L);
                Object objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C21937b(13, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R6);
                }
                z4 = true;
                AbstractC3975r.m12005b(null, jM70504p, (InterfaceC4339a) objM87133R6, null, AbstractC37817c.m121344e(-2111173960, c28655q, new C2032u(state, onViewEvent, interfaceC28601c2, interfaceC28601c1, 21)), c28655q, 24960, 9);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                z4 = true;
                c28655q.m87150e0(-43171102);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 16, (Object) modifier3, (Object) state, onViewEvent);
        }
    }

    /* JADX INFO: renamed from: m */
    private static final boolean m70501m(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m70502n(Modifier modifier, C23944m1 c23944m1, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70500l(modifier, c23944m1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m70503o(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: p */
    private static final int m70504p(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: q */
    private static final void m70505q(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: r */
    private static final float m70506r(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39174f) interfaceC28601c1.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: s */
    private static final void m70507s(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(new C39174f(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m70508t(InterfaceC39171c interfaceC39171c, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y layoutCoordinates) {
        AbstractC22676k.m65750j(layoutCoordinates, "layoutCoordinates");
        long jMo3541n = layoutCoordinates.mo3541n();
        InterfaceC39147y interfaceC39147yMo3517V = layoutCoordinates.mo3517V();
        m70505q(interfaceC28593a1, ((int) (jMo3541n & 4294967295L)) + ((int) Float.intBitsToFloat((int) ((interfaceC39147yMo3517V != null ? interfaceC39147yMo3517V.mo3537k(layoutCoordinates, 0L) : 0L) & 4294967295L))));
        m70507s(interfaceC28601c1, interfaceC39171c.mo733e0((int) (jMo3541n >> 32)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m70509u(C23944m1 c23944m1, InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (!c23944m1.m70528c().isEmpty()) {
            m70503o(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m70510v(InterfaceC28601c1 interfaceC28601c1) {
        m70503o(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m70511w(C23944m1 c23944m1, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float fM70506r = m70506r(interfaceC28601c1);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2609r(function1, interfaceC28601c2, 19);
                c28655q.m87172p0(objM87133R);
            }
            m70497i(c23944m1, fM70506r, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m70512x(Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        m70503o(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }
}
