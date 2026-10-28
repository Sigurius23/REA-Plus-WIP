package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.TextResource;
import jr2.AbstractC21903b;
import jr2.AbstractC21904c;
import kq2.AbstractC22776b;
import kr2.AbstractC22813b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11393q0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pp2.C29451o;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: rq2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m65681d2 = {"Lrq2/a;", "step", "", "isCurrentStep", "Ll83/a0;", "c", "(Lrq2/a;ZLandroidx/compose/runtime/Composer;I)V", "", "horizontalProgress", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31721e {
    /* JADX INFO: renamed from: c */
    public static final void m98433c(C31713a step, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Object obj;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1763380143);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(step) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C28655q c28655q3 = c28655q2;
            c28655q3.m87138X();
            c28655q = c28655q3;
        } else if (z4) {
            c28655q2.m87150e0(1113076789);
            Object objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                C11393q0 c11393q0 = new C11393q0(Boolean.FALSE);
                c11393q0.m30628I0(Boolean.TRUE);
                c28655q2.m87172p0(c11393q0);
                obj = c11393q0;
            }
            obj = objM87133R;
            C11393q0 c11393q1 = (C11393q0) obj;
            AbstractC22813b.m66084k(c11393q1, null, AbstractC37817c.m121344e(284114394, c28655q2, new C29451o(8, step, AbstractC11352g.m30588b(((Boolean) c11393q1.f36534y.getValue()).booleanValue() ? step.getBarFillPercentage() : 0.0f, AbstractC11348f.m30574v(1500, 500, null, 4), null, null, c28655q2, 48, 28))), c28655q2, 384, 2);
            C28655q c28655q4 = c28655q2;
            c28655q4.m87173q(false);
            c28655q = c28655q4;
        } else {
            C28655q c28655q5 = c28655q2;
            c28655q5.m87150e0(1116703603);
            c28655q5.m87173q(false);
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31717c(step, z4, i13, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final float m98434d(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m98435e(C31713a c31713a, InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            String title = c31713a.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i14).getH4();
            long white50 = c38072d.m121949b(c28655q, i14).getWhite50();
            float f13 = 4;
            float f14 = 5 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, f14, 0.0f, 0.0f, 12);
            int i15 = C2886a.f11498d;
            int i16 = i15 << 18;
            AbstractC30795n.m94707h(title, modifierM3398t, white50, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 48, i16, 196600);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f13, c2305k), C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
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
            String mainStatValue = c31713a.getMainStatValue();
            C2886a c2886aM8440u = c38072d.m121952e(c28655q, i14).getN1();
            long brandWhite = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C39111m c39111m = AbstractC39083d.f168141b;
            C0213j c0213j3 = c0213j;
            C0209i c0209i6 = c0209i;
            AbstractC30795n.m94707h(mainStatValue, new WithAlignmentLineElement(c39111m), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8440u, null, c28655q, 0, i16, 196600);
            AbstractC30795n.m94707h(c31713a.getMainStatSuffix(), new WithAlignmentLineElement(c39111m), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH1(), null, c28655q, 0, i16, 196600);
            c28655q.m87173q(true);
            float f15 = 8;
            AbstractC30795n.m94707h(c31713a.getSubtitle(), AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, f13 * f15, 6), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getT3(), null, c28655q, 48, i16, 196600);
            C28655q c28655q2 = c28655q;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j3);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
            Modifier modifierM107879c = AbstractC34132o.m107879c(0.1f, c2314t);
            float f16 = 0 * f13;
            float f17 = 50 * f13;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1102d.m3412i(modifierM107879c, f16, f17));
            C2307m c2307m = C2299e.f9117z;
            C1100b c1100b = C1100b.f4583a;
            AbstractC22989q.m66760a(AbstractC21903b.m62312a(c1100b.mo3400a(modifierM3407d, c2307m), c31713a.getProgressBackground()), c28655q2, 0);
            AbstractC22989q.m66760a(AbstractC21903b.m62312a(c1100b.mo3400a(AbstractC1102d.m3409f(m98434d(interfaceC28670t2), AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t, f16, f17))), c2307m), c31713a.getProgressBar()), c28655q2, 0);
            c28655q2.m87173q(true);
            if (c31713a.m98375h().isEmpty()) {
                c28655q2.m87150e0(-965009729);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f15, 0.0f, 2).mo3471e(new HorizontalAlignElement(c2305k)), "HorizontalBarFooterText");
                TextResource footerText = c31713a.getFooterText();
                TextResource footerSubText = c31713a.getFooterSubText();
                int i17 = TextResource.$stable;
                AbstractC22776b.m65990b(modifierM3599a, footerText, footerSubText, c28655q2, (i17 << 6) | (i17 << 3));
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-965438180);
                AbstractC30795n.m94704e(AbstractC21904c.m62321i(c31713a.m98375h()), AbstractC1136a.m3599a(AbstractC1099a.m3397s(c2314t, f14, 10 * f13, f14, f14), "HorizontalBarHighlightedText"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q2, i14).getT1(), c28655q2, 0, i15 << 21, 131068);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m98436f(C31713a c31713a, boolean z4, int i13, Composer composer, int i14) {
        m98433c(c31713a, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
