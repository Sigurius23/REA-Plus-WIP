package uq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.TextResource;
import java.util.Iterator;
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
import p026b2.C2314t;
import p077d0.C11393q0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import tx0.C34238a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uq2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Luq2/d;", "state", "", "isCurrentStep", "Ll83/a0;", "c", "(Luq2/d;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35171h {
    /* JADX INFO: renamed from: c */
    public static final void m111307c(C35167d state, boolean z4, Composer composer, int i13) {
        int i14;
        Object obj;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1072524502);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(1315878489);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                C11393q0 c11393q0 = new C11393q0(Boolean.FALSE);
                c11393q0.m30628I0(Boolean.TRUE);
                c28655q.m87172p0(c11393q0);
                obj = c11393q0;
            }
            obj = objM87133R;
            AbstractC22813b.m66084k((C11393q0) obj, null, AbstractC37817c.m121344e(-2092004853, c28655q, new C34238a(state, 14)), c28655q, 384, 2);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1317465100);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35169f(state, z4, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m111308d(C35167d c35167d, Composer composer, int i13) {
        C28655q c28655q;
        C2305k c2305k = C2299e.f9110M;
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            float f14 = 1 * f13;
            float f15 = 5;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3395q(c2314t, 4 * f15, f14));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3413j(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), ((float) 10.5d) * f13, 0.0f, 2));
            c28655q2.m87150e0(-868274236);
            Iterator<T> it = c35167d.m111286h().iterator();
            while (it.hasNext()) {
                AbstractC35170g.m111295f((C35165b) it.next(), c28655q2, 0);
            }
            c28655q2.m87173q(false);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3413j(c2314t, f15 * f13, 0.0f, 2));
            if (c35167d.m111285g().isEmpty()) {
                c28655q = c28655q2;
                c28655q.m87150e0(-1146171809);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, 0.0f, 2).mo3471e(new HorizontalAlignElement(c2305k)), "FinaleFooterText");
                TextResource footerText = c35167d.getFooterText();
                TextResource footerSubText = c35167d.getFooterSubText();
                int i14 = TextResource.$stable;
                AbstractC22776b.m65990b(modifierM3599a, footerText, footerSubText, c28655q, (i14 << 6) | (i14 << 3));
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(-1146463643);
                AbstractC30795n.m94704e(AbstractC21904c.m62321i(c35167d.m111285g()), AbstractC1136a.m3599a(c2314t, "FinaleHighlightedText"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getT1(), c28655q2, 48, C2886a.f11498d << 21, 131068);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m111309e(C35167d c35167d, boolean z4, int i13, Composer composer, int i14) {
        m111307c(c35167d, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
