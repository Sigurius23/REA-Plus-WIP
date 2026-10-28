package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserSessionDto;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import h01.AbstractC16549p;
import h01.AbstractC16559z;
import h01.C16534a0;
import h01.C16550q;
import h01.EnumC16533a;
import kd1.AbstractC22399k;
import kd1.AbstractC22403o;
import kd1.EnumC22400l;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.j5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "k", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40369j5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final void m130101k(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(726397888);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            AbstractC22399k.m64473c("VoW Item", c28655q, 6);
            int i14 = 1912;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z4 = false;
            EnumC16533a enumC16533a = null;
            boolean z13 = false;
            EnumC16313m0 enumC16313m0 = null;
            AbstractC22403o abstractC22403o = null;
            C16534a0 c16534a0 = new C16534a0(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur."), "VOW_PRIMARY", null, z4, null, enumC16533a, AbstractC8693b.m21278l("New impact unlocked"), z13, enumC16313m0, abstractC22403o, i14, defaultConstructorMarker);
            int i15 = C16534a0.f63614l << 3;
            AbstractC16559z.m46867i(null, c16534a0, false, null, c28655q, i15, 13);
            AbstractC16559z.m46867i(null, new C16534a0("2", AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. "), "VOW_PRIMARY", 0 == true ? 1 : 0, z4, 0 == true ? 1 : 0, enumC16533a, AbstractC8693b.m21278l("New impact unlocked"), z13, enumC16313m0, abstractC22403o, i14, defaultConstructorMarker), false, null, c28655q, i15, 13);
            AbstractC22399k.m64473c("CTA - Highlighted", c28655q, 6);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("New impact unlocked");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur.");
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("BUTTON TEXT");
            EnumC22400l enumC22400l = EnumC22400l.ONBOARDING_TASK_LIST;
            AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f62152s);
            EnumC16533a enumC16533a2 = EnumC16533a.ONBOARDING;
            C16550q c16550q = new C16550q("3", textResourceM21278l2, "IMPACT_UNLOCKED", null, false, null, enumC16533a2, enumC22400l, textResourceM21278l3, aVar, textResourceM21278l, false, false, false, false, new C9598e(null, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0), false, null, null, null, null, 2062392, null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40499w1(11);
                c28655q.m87172p0(objM87133R);
            }
            int i16 = (C16550q.f63696v << 3) | 3072;
            AbstractC16549p.m46792z(null, c16550q, false, (Function1) objM87133R, c28655q, i16, 5);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("New impact unlocked");
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur.");
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l("BUTTON TEXT");
            AbstractC22403o.a aVar2 = new AbstractC22403o.a(AbstractC16272a.f62152s);
            EnumC16533a enumC16533a3 = EnumC16533a.DEFAULT;
            C16550q c16550q2 = new C16550q("4", textResourceM21278l5, "IMPACT_UNLOCKED", null, false, null, enumC16533a3, enumC22400l, textResourceM21278l6, aVar2, textResourceM21278l4, false, false, false, false, new C9598e(null, null, null, 7, null), false, null, null, null, null, 2062392, null);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C40499w1(12);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC16549p.m46792z(null, c16550q2, false, (Function1) objM87133R2, c28655q, i16, 5);
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l("New impact unlocked");
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur.");
            TextResource textResourceM21278l9 = AbstractC8693b.m21278l("BUTTON TEXT");
            AbstractC22403o.a aVar3 = new AbstractC22403o.a(AbstractC16272a.f62152s);
            EnumC16533a enumC16533a4 = EnumC16533a.ALERT;
            C16550q c16550q3 = new C16550q("5", textResourceM21278l8, "IMPACT_UNLOCKED", null, false, null, enumC16533a4, enumC22400l, textResourceM21278l9, aVar3, textResourceM21278l7, false, false, false, false, new C9598e(null, null, null, 7, null), false, null, null, null, null, 2062392, null);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40499w1(13);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC16549p.m46792z(null, c16550q3, false, (Function1) objM87133R3, c28655q, i16, 5);
            TextResource textResourceM21278l10 = AbstractC8693b.m21278l("New impact unlocked");
            TextResource textResourceM21278l11 = AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur.");
            TextResource textResourceM21278l12 = AbstractC8693b.m21278l("BUTTON TEXT");
            AbstractC22403o.a aVar4 = new AbstractC22403o.a(AbstractC16272a.f62152s);
            EnumC16533a enumC16533a5 = EnumC16533a.WARNING;
            C16550q c16550q4 = new C16550q("5", textResourceM21278l11, "IMPACT_UNLOCKED", null, false, null, enumC16533a5, enumC22400l, textResourceM21278l12, aVar4, textResourceM21278l10, false, false, false, false, new C9598e(null, null, null, 7, null), false, null, null, null, null, 2062392, null);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C40499w1(14);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC16549p.m46792z(null, c16550q4, false, (Function1) objM87133R4, c28655q, i16, 5);
            AbstractC22399k.m64473c("CTA - Not Highlighted", c28655q, 6);
            C16550q c16550q5 = new C16550q("6", AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur."), "IMPACT_UNLOCKED", null, false, null, enumC16533a2, enumC22400l, AbstractC8693b.m21278l("BUTTON TEXT"), new AbstractC22403o.a(AbstractC16272a.f62152s), AbstractC8693b.m21278l("New impact unlocked"), false, false, false, false, new C9598e(null, null, null, 7, null), false, null, null, null, null, 2058296, null);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C40499w1(15);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC16549p.m46792z(null, c16550q5, false, (Function1) objM87133R5, c28655q, i16, 5);
            C16550q c16550q6 = new C16550q("7", AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur."), "IMPACT_UNLOCKED", null, false, null, enumC16533a3, enumC22400l, AbstractC8693b.m21278l("BUTTON TEXT"), new AbstractC22403o.a(AbstractC16272a.f62152s), AbstractC8693b.m21278l("New impact unlocked"), false, false, false, false, new C9598e(null, null, null, 7, null), false, null, null, null, null, 2058296, null);
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C40499w1(16);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC16549p.m46792z(null, c16550q6, false, (Function1) objM87133R6, c28655q, i16, 5);
            C16550q c16550q7 = new C16550q("8", AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur."), "IMPACT_UNLOCKED", null, false, null, enumC16533a4, enumC22400l, AbstractC8693b.m21278l("BUTTON TEXT"), new AbstractC22403o.a(AbstractC16272a.f62152s), AbstractC8693b.m21278l("New impact unlocked"), false, false, false, false, new C9598e(null, null, null, 7, null), false, null, null, null, null, 2058296, null);
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C40499w1(17);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC16549p.m46792z(null, c16550q7, false, (Function1) objM87133R7, c28655q, i16, 5);
            C16550q c16550q8 = new C16550q("8", AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur."), "IMPACT_UNLOCKED", null, false, null, enumC16533a5, enumC22400l, AbstractC8693b.m21278l("BUTTON TEXT"), new AbstractC22403o.a(AbstractC16272a.f62152s), AbstractC8693b.m21278l("New impact unlocked"), false, false, false, false, new C9598e(null, null, null, 7, null), false, null, null, null, null, 2058296, null);
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C40499w1(18);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC16549p.m46792z(null, c16550q8, false, (Function1) objM87133R8, c28655q, i16, 5);
            AbstractC22399k.m64473c("CTA - Non-Interactive, No Navigation", c28655q, 6);
            C16550q c16550q9 = new C16550q("8", AbstractC8693b.m21278l("Lorem ipsum dolor sit amet, consetetur."), "ONBOARDING", null, false, null, EnumC16533a.LOCKED, enumC22400l, AbstractC8693b.m21267a(), new AbstractC22403o.a(AbstractC16272a.f62152s), AbstractC8693b.m21278l("New impact unlocked"), false, false, false, false, null, false, null, null, null, null, 2095160, null);
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new C40499w1(19);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC16549p.m46792z(null, c16550q9, false, (Function1) objM87133R9, c28655q, i16, 5);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m130102l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m130103m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m130104n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m130105o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m130106p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m130107q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m130108r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m130109s(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m130110t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m130111u(int i13, Composer composer, int i14) {
        m130101k(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
