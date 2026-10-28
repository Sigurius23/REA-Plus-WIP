package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.yearinreview.FooterText;
import er2.C13582d;
import hb3.AbstractC17104a0;
import java.util.List;
import jr2.AbstractC21904c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kq2.AbstractC22776b;
import l83.C23454a0;
import l83.C23465k;
import or2.AbstractC28188o1;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import ri2.C31469a;
import rm2.C31604d;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import yp2.AbstractC39706c;
import yq2.AbstractC39713a;

/* JADX INFO: renamed from: rq2.a0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrq2/y;", "step", "", "isCurrentStep", "Ll83/a0;", "e", "(Lrq2/y;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31714a0 {
    /* JADX INFO: renamed from: e */
    public static final void m98386e(C31757y step, boolean z4, Composer composer, int i13) {
        int i14;
        String strM98575n;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1102159512);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(step) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        boolean z13 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Boolean boolM98579r = step.getIsWhoopPro();
            Boolean bool = Boolean.TRUE;
            if (AbstractC22676k.m65745e(boolM98579r, bool) || AbstractC22676k.m65745e(step.getIsFoundingMember(), bool) || ((strM98575n = step.getRecoveryLevel()) != null && AbstractC28188o1.m85314d(strM98575n))) {
                z13 = true;
            }
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(-2044481122, c28655q, new C13582d(step, z13, 2)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31758z(step, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v11, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v4, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v8, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m98387f(C31757y c31757y, boolean z4, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C39077b1 c39077b1;
        boolean z13;
        C0209i c0209i4;
        ?? r14;
        C2314t c2314t;
        float f13;
        C1100b c1100b;
        C23454a0 c23454a0;
        Composer composer2;
        C1100b c1100b2;
        float f14;
        boolean z14;
        float f15;
        ?? r15;
        ?? r16;
        boolean z15;
        C2314t c2314t2;
        ?? r17;
        boolean z16;
        ?? r18;
        Composer composer3 = composer;
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C2314t c2314t3 = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t3);
        C2307m c2307m = C2299e.f9114w;
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
        C28655q c28655q = (C28655q) composer3;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer3, modifierM3407d);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i5 = C0217k.f729g;
        AbstractC28683x.m87239G(composer3, c0209i5, interfaceC39127r0M66763d);
        C0209i c0209i6 = C0217k.f728f;
        AbstractC28683x.m87239G(composer3, c0209i6, interfaceC28653p1M87165m);
        C0209i c0209i7 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i7);
        }
        C0209i c0209i8 = C0217k.f726d;
        AbstractC28683x.m87239G(composer3, c0209i8, modifierM118962N);
        AbstractC22403o abstractC22403oM98566e = c31757y.getBackgroundImage();
        C39077b1 c39077b2 = C39102j.f168200b;
        if (abstractC22403oM98566e == null) {
            c28655q.m87150e0(997872872);
            c28655q.m87173q(false);
            c0209i = c0209i5;
            c0209i2 = c0209i7;
            c0209i3 = c0209i8;
            z13 = false;
            c39077b1 = c39077b2;
        } else {
            c28655q.m87150e0(997872873);
            c0209i = c0209i5;
            c0209i2 = c0209i7;
            c0209i3 = c0209i8;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM98566e, null, null, composer3, AbstractC22403o.f87638a, 3), AbstractC30060g.m92103Y(composer3, AbstractC39706c.f170924q), AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3413j(c2314t3, 0.0f, 140 * 4, 1)), null, c39077b2, 0.0f, null, composer, 24960, 104);
            c39077b1 = c39077b2;
            composer3 = composer;
            z13 = false;
            c28655q.m87173q(false);
        }
        C2307m c2307m2 = C2299e.f9115x;
        C1100b c1100b3 = C1100b.f4583a;
        Modifier modifierMo3400a = c1100b3.mo3400a(c2314t3, c2307m2);
        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z13);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer3, modifierMo3400a);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer3, c0209i, interfaceC39127r0M66763d2);
        AbstractC28683x.m87239G(composer3, c0209i6, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            c0209i4 = c0209i2;
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
        } else {
            c0209i4 = c0209i2;
        }
        C0209i c0209i9 = c0209i3;
        AbstractC28683x.m87239G(composer3, c0209i9, modifierM118962N2);
        String strM98567f = c31757y.getDisplayNumber();
        C0209i c0209i10 = c0209i4;
        C2886a c2886aM62319g = AbstractC21904c.m62319g(AbstractC31718c0.m98418y(c31757y.getDisplayNumber()), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c31757y.getNumberColor()), new C17919x(C17919x.m51541c(0.1f, c31757y.getNumberColor()))), 0.0f, 0.0f, 14));
        Modifier modifierM3392n = AbstractC1099a.m3392n(c1100b3.mo3400a(c2314t3, c2307m2), 0.0f, AbstractC31718c0.m98417x(c31757y.getDisplayNumber(), c31757y.getLottieWrapper(), c31757y.getImage()), 1);
        int i14 = C2886a.f11498d;
        C0209i c0209i11 = c0209i;
        C2307m c2307m3 = c2307m2;
        AbstractC30795n.m94707h(strM98567f, modifierM3392n, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM62319g, null, composer, 0, i14 << 18, 196604);
        ?? r19 = c28655q;
        r19.m87173q(true);
        InterfaceC35689r0 interfaceC35689r0M98572k = c31757y.getLottieWrapper();
        C23454a0 c23454a1 = C23454a0.f92919a;
        if (interfaceC35689r0M98572k == null) {
            r19.m87150e0(999117336);
            r14 = 0;
            r19.m87173q(false);
            c23454a0 = null;
            c2314t = c2314t3;
            c1100b = c1100b3;
            f13 = 1.0f;
        } else {
            r14 = 0;
            r19.m87150e0(999117337);
            c2314t = c2314t3;
            Modifier modifierMo3400a2 = c1100b3.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m3);
            Object objM87133R = r19.m87133R();
            Object obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = new C31469a(20);
                r19.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = r19.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = new C31604d(11);
                r19.m87172p0(objM87133R2);
            }
            c2307m3 = c2307m3;
            f13 = 1.0f;
            c1100b = c1100b3;
            AbstractC35684p.m113047h(modifierMo3400a2, interfaceC35689r0M98572k, false, 0.0f, 1, interfaceC4339a, (Function1) objM87133R2, c39077b1, null, composer, 14376960, 268);
            r19.m87173q(false);
            c23454a0 = c23454a1;
        }
        if (c23454a0 == null) {
            r19.m87150e0(999551895);
            AbstractC22403o abstractC22403oM98571j = c31757y.getImage();
            if (abstractC22403oM98571j == null) {
                r19.m87150e0(999551894);
                r19.m87173q(r14);
                composer2 = composer;
                c1100b2 = c1100b;
                f14 = 0.0f;
                z14 = true;
            } else {
                r19.m87150e0(999551895);
                c1100b2 = c1100b;
                f14 = 0.0f;
                z14 = true;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM98571j, null, null, composer, AbstractC22403o.f87638a, 3), AbstractC30060g.m92103Y(composer, AbstractC39706c.f170924q), AbstractC1099a.m3392n(c1100b2.mo3400a(AbstractC1102d.m3409f(f13, c2314t), c2307m3), 0.0f, 100, 1), null, C39102j.f168202d, 0.0f, null, composer, 24576, 104);
                composer2 = composer;
                r19.m87173q(r14);
            }
            r19.m87173q(r14);
        } else {
            composer2 = composer;
            c1100b2 = c1100b;
            f14 = 0.0f;
            z14 = true;
            r19.m87150e0(1694797428);
            r19.m87173q(r14);
        }
        float f16 = 8;
        Modifier modifierMo3400a3 = c1100b2.mo3400a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(f13, c2314t), ((float) 2.5d) * f16, f14, 2), C2299e.f9105H);
        C22957g c22957g = AbstractC22977m.f90652c;
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, composer2, r14);
        int iHashCode3 = Long.hashCode(r19.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m3 = r19.m87165m();
        Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer2, modifierMo3400a3);
        r19.m87158i0();
        if (r19.f115903S) {
            r19.m87163l(c0213j);
        } else {
            r19.m87178s0();
        }
        AbstractC28683x.m87239G(composer2, c0209i11, c23010xM66775a);
        AbstractC28683x.m87239G(composer2, c0209i6, interfaceC28653p1M87165m3);
        if (r19.f115903S || !AbstractC22676k.m65745e(r19.m87133R(), Integer.valueOf(iHashCode3))) {
            AbstractC11266d.m30471y(iHashCode3, r19, iHashCode3, c0209i10);
        }
        AbstractC28683x.m87239G(composer2, c0209i9, modifierM118962N3);
        if (c31757y.m98576o().isEmpty()) {
            f15 = f16;
            r19.m87150e0(-222818058);
            Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1102d.m3409f(f13, c2314t));
            TextResource textResourceM98569h = c31757y.getFooterText();
            TextResource textResourceM98568g = c31757y.getFooterSubText();
            int i15 = TextResource.$stable;
            AbstractC22776b.m65990b(modifierM38560g, textResourceM98569h, textResourceM98568g, composer2, (i15 << 6) | (i15 << 3));
            r19.m87173q(r14);
        } else {
            r19.m87150e0(-223669597);
            List<C23465k> listM62321i = AbstractC21904c.m62321i(c31757y.m98576o());
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            int i17 = i14 << 21;
            C2314t c2314t4 = c2314t;
            f15 = f16;
            AbstractC30795n.m94704e(listM62321i, AbstractC13673n.m38560g(C2299e.f9111N, AbstractC1102d.m3409f(f13, c2314t)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(composer2, i16).getT1(), composer, 0, i17, 131068);
            composer2 = composer;
            List<FooterText> listM98570i = c31757y.m98570i();
            if (listM98570i == null) {
                r19.m87150e0(-223293444);
                r19.m87173q(false);
                r18 = r19;
                z16 = false;
                c2314t2 = c2314t4;
            } else {
                r19.m87150e0(-223293443);
                AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(2 * f15, c2314t4));
                if (listM98570i.isEmpty()) {
                    ?? r110 = r19;
                    z15 = false;
                    c2314t2 = c2314t4;
                    r110.m87150e0(1013457502);
                    r110.m87173q(false);
                    r17 = r110;
                } else {
                    r19.m87150e0(1013183772);
                    c2314t2 = c2314t4;
                    AbstractC30795n.m94704e(AbstractC21904c.m62320h(listM98570i), null, c38072d.m121949b(composer2, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(composer2, i16).getB1(), composer, 0, i17, 131066);
                    composer2 = composer;
                    ?? r111 = r19;
                    z15 = false;
                    r111.m87173q(false);
                    r17 = r111;
                }
                r17.m87173q(z15);
                r18 = r17;
                z16 = z15;
            }
            r18.m87173q(z16);
            c2314t = c2314t2;
            r16 = r18;
            r15 = z16;
        }
        if (z4) {
            r16 = r19;
            r15 = r14;
            r16.m87150e0(-222441749);
            AbstractC22953f.m66715b(composer2, AbstractC1102d.m3411h(2 * f15, c2314t));
            String strM98575n = c31757y.getRecoveryLevel();
            if (strM98575n == null) {
                strM98575n = "";
            }
            Boolean boolM98578q = c31757y.getIsFoundingMember();
            ?? BooleanValue = boolM98578q != null ? boolM98578q.booleanValue() : r15;
            Boolean boolM98579r = c31757y.getIsWhoopPro();
            AbstractC39713a.m127091c(strM98575n, BooleanValue, boolM98579r != null ? boolM98579r.booleanValue() : r15, c31757y.getRecoveryBadgeLevel(), composer2, 0);
            r16.m87173q(r15);
        } else {
            r16 = r19;
            r15 = r14;
            r16.m87150e0(-222044856);
            r16.m87173q(r15);
        }
        r16.m87173q(true);
        r16.m87173q(true);
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m98388g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m98389h(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m98390i(C31757y c31757y, boolean z4, int i13, Composer composer, int i14) {
        m98386e(c31757y, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
