package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4115s4;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16272a;
import ih0.AbstractC18489d0;
import kd1.AbstractC22399k;
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
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import t71.C33569f;
import t71.C33581r;
import t71.InterfaceC33570g;
import wb3.AbstractC37056f;
import y11.C39065r;
import y11.C39067t;

/* JADX INFO: renamed from: zc1.x3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "e", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40511x3 {
    /* JADX INFO: renamed from: e */
    public static final void m131166e(Composer composer, int i13) {
        Float fValueOf = Float.valueOf(0.61f);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1773356116);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 1;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC22399k.m64473c("Impact Activity Card Lock State", c28655q, 6);
            float f14 = 4;
            float f15 = f13 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C33581r c33581r = new C33581r();
            int i14 = 64;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i15 = 5;
            boolean z4 = true;
            boolean z13 = false;
            C33569f c33569f = new C33569f(AbstractC8693b.m21278l("IMPACT ON RECOVERY"), null, AbstractC8693b.m21278l("Log your Recovery activity at least 5 times across different days to unlock analysis."), null, new InterfaceC33570g.a(AbstractC8693b.m21278l("--"), EnumC39333f.WHITE_30, AbstractC37056f.m118959K(new C4115s4(3, i15, AbstractC16272a.f61965N, EnumC39333f.RECOVERY, EnumC39333f.NEUTRAL_15, z4, z13, i14, defaultConstructorMarker), new C4115s4(4, i15, AbstractC16272a.f62085g4, EnumC39333f.BRAND_WHITE, EnumC39333f.WHITE_10, z4, z13, i14, defaultConstructorMarker))), AbstractC8693b.m21278l("VIEW MORE IMPACTS"), 10, null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40499w1(7);
                c28655q.m87172p0(objM87133R);
            }
            int i16 = C33569f.f140060g | 48 | (C33581r.f140098a << 6);
            c33581r.Compose(c33569f, (Function1) objM87133R, c28655q, i16);
            AbstractC18489d0.m53380u(2, f14, c2314t, c28655q);
            AbstractC22399k.m64473c("Impact Activity Card Unlock State Positive", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C33581r c33581r2 = new C33581r();
            TextResource textResourceM21278l = AbstractC8693b.m21278l("IMPACT ON RECOVERY");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("After accounting for other influences, Meditation has a -11% impact on your Recovery.");
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("VIEW MORE IMPACTS");
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("+21");
            EnumC39333f enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
            C33569f c33569f2 = new C33569f(textResourceM21278l, null, textResourceM21278l2, null, new InterfaceC33570g.b(textResourceM21278l4, enumC39333f, new C39065r(0.0f, null, 0.5f, 0.79f, enumC39333f, null, new C39067t(fValueOf, AbstractC8693b.m21278l("+8%"), AbstractC8693b.m21278l("WHOOP Average")), 35, null)), textResourceM21278l3, 10, null);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C40499w1(8);
                c28655q.m87172p0(objM87133R2);
            }
            c33581r2.Compose(c33569f2, (Function1) objM87133R2, c28655q, i16);
            AbstractC22399k.m64473c("Impact Activity Card Unlock State Negative", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C33581r c33581r3 = new C33581r();
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l("IMPACT ON RECOVERY");
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l("After accounting for other influences, Meditation has a -11% impact on your Recovery.");
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l("VIEW MORE IMPACTS");
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l("-15");
            EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND;
            C33569f c33569f3 = new C33569f(textResourceM21278l5, null, textResourceM21278l6, null, new InterfaceC33570g.b(textResourceM21278l8, enumC39333f2, new C39065r(0.0f, null, 0.35f, 0.5f, enumC39333f2, null, new C39067t(fValueOf, AbstractC8693b.m21278l("+8%"), AbstractC8693b.m21278l("WHOOP Average")), 35, null)), textResourceM21278l7, 10, null);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40499w1(9);
                c28655q.m87172p0(objM87133R3);
            }
            c33581r3.Compose(c33569f3, (Function1) objM87133R3, c28655q, i16);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m131167f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m131168g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m131169h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m131170i(int i13, Composer composer, int i14) {
        m131166e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
