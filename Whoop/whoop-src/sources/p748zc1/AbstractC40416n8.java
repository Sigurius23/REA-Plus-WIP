package p748zc1;

import a31.AbstractC0344f;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import fc0.C14362f;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import java.time.Clock;
import java.time.Instant;
import k41.AbstractC22189c;
import k41.C22187a;
import k41.C22190d;
import k81.C22295e;
import k81.EnumC22291a;
import kd1.AbstractC22399k;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23149o4;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import r80.AbstractC31061c;
import vu1.AbstractC36512c;
import wb3.AbstractC37056f;
import x81.C38072d;
import xz0.C38750a;
import xz0.C38751b;
import xz0.C38755f;

/* JADX INFO: renamed from: zc1.n8 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ll83/a0;", "g", "(Landroidx/compose/runtime/Composer;I)V", "", "secsUntilPhase2", "secsUntilPhase3", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40416n8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final void m130455g(Composer composer, int i13) {
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1441127986);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(4, c28655q);
            }
            InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95646v(8, c28655q);
            }
            InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R2;
            boolean zM87149e = c28655q.m87149e(m130456h(interfaceC28593a1)) | c28655q.m87149e(m130458j(interfaceC28593a2));
            Object objM87133R3 = c28655q.m87133R();
            if (zM87149e || objM87133R3 == c28676v0) {
                Instant instant = Clock.systemUTC().instant();
                AnalyticEventModel analyticEventModel = null;
                float f13 = 0.0f;
                float f14 = 0.0f;
                float f15 = 0.0f;
                EnumC22291a enumC22291a = null;
                boolean z4 = false;
                String str = "";
                String str2 = "Phase 1";
                AnalyticEventModel analyticEventModel2 = null;
                float f16 = 0.0f;
                float f17 = 0.0f;
                float f18 = 0.0f;
                EnumC22291a enumC22291a2 = null;
                boolean z13 = false;
                String str3 = "";
                String str4 = "Phase 2";
                AnalyticEventModel analyticEventModel3 = null;
                objM87133R3 = new C22190d(AbstractC37056f.m118959K(new C22187a(instant.plusSeconds(m130456h(interfaceC28593a1)), new C25306o(new C22295e(str, str2, AbstractC2875y.m8296i(m130456h(interfaceC28593a1), "Waiting for phase 2 threshold (", "s from load)"), AbstractC37056f.m118958J(new C25306o(new C38755f(null, new C38751b(EnumC16313m0.CROSS, null, null, false, 14, null), new C17750h1(AbstractC8693b.m21278l("Upcoming"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), "Today, 8:00 - 8:30 AM EST", null, "Dr. Drake Ramoray, MD, MPH", 0 == true ? 1 : 0, null, new C38750a("Sep", "16"), null, null, 1745, null), analyticEventModel, 2, 0 == true ? 1 : 0)), f13, f14, f15, enumC22291a, z4, 496, 0 == true ? 1 : 0), analyticEventModel2, 2, 0 == true ? 1 : 0)), new C22187a(instant.plusSeconds(m130458j(interfaceC28593a2)), new C25306o(new C22295e(str3, str4, AbstractC2875y.m8296i(m130458j(interfaceC28593a2), "Waiting for phase 3 threshold (", "s from load)"), AbstractC37056f.m118958J(new C25306o(new C38755f(null, null, new C17750h1(AbstractC8693b.m21278l("Available Now"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), "Video consultation", new AbstractC22403o.a(AbstractC36512c.f156071n), "Dr. April Kepner, MD", new AbstractC22403o.a(AbstractC16272a.f62188y), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 1923, 0 == true ? 1 : 0), null, 2, 0 == true ? 1 : 0)), f16, f17, f18, enumC22291a2, z13, 496, null), analyticEventModel3, 2, 0 == true ? 1 : 0))));
                c28655q.m87172p0(objM87133R3);
            }
            C22190d c22190d = (C22190d) objM87133R3;
            C2314t c2314t = C2314t.f9131w;
            float f19 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(4 * f19, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC22399k.m64473c("Phase Thresholds (seconds from load)", c28655q, 6);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C0209i c0209i6 = c0209i;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC23149o4.m67128c("Phase 1 → 2", new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), jM125430y, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q, 6, 0, 262136);
            Integer numValueOf = Integer.valueOf(m130456h(interfaceC28593a1));
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C14362f(interfaceC28593a1, 13);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C40348h6(23);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC0344f.m877f(1, 300, numValueOf, true, function1, (InterfaceC4339a) objM87133R5, c28655q, 224310, 0);
            AbstractC18489d0.m53356B(c28655q, true, c2314t, f19, c28655q);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            long jM125430y2 = c38072d.m121949b(c28655q, i14).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC23149o4.m67128c("Phase 2 → hidden", new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), jM125430y2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q, 6, 0, 262136);
            c28655q = c28655q;
            Integer numValueOf2 = Integer.valueOf(m130458j(interfaceC28593a2));
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C14362f(interfaceC28593a2, 14);
                c28655q.m87172p0(objM87133R6);
            }
            Function1 function2 = (Function1) objM87133R6;
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C40348h6(24);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC0344f.m877f(1, 300, numValueOf2, true, function2, (InterfaceC4339a) objM87133R7, c28655q, 224310, 0);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(16, c2314t));
            AbstractC22399k.m64473c("Preview", c28655q, 6);
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C40349h7(6);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC22189c.m63538c(null, c22190d, (Function1) objM87133R8, c28655q, (C22190d.f86071b << 3) | 384, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40475t7(i13, 21);
        }
    }

    /* JADX INFO: renamed from: h */
    private static final int m130456h(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: i */
    private static final void m130457i(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: j */
    private static final int m130458j(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: k */
    private static final void m130459k(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m130460l(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m130457i(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m130461m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m130462n(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m130459k(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m130463o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m130464p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m130465q(int i13, Composer composer, int i14) {
        m130455g(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
