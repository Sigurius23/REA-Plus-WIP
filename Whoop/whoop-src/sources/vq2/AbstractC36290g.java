package vq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import jr2.AbstractC21904c;
import kq2.AbstractC22776b;
import kr2.AbstractC22813b;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p077d0.C11393q0;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
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
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import tx0.C34238a;
import wb3.AbstractC37056f;
import x81.C38072d;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: vq2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lvq2/c;", "stepState", "", "isCurrentStep", "Ll83/a0;", "c", "(Lvq2/c;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36290g {
    /* JADX INFO: renamed from: c */
    public static final void m116017c(C36286c stepState, boolean z4, Composer composer, int i13) {
        int i14;
        Object obj;
        AbstractC22676k.m65750j(stepState, "stepState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1672743320);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(stepState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(1809512570);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                C11393q0 c11393q0 = new C11393q0(Boolean.FALSE);
                c11393q0.m30628I0(Boolean.TRUE);
                c28655q.m87172p0(c11393q0);
                obj = c11393q0;
            }
            obj = objM87133R;
            AbstractC22813b.m66084k((C11393q0) obj, null, AbstractC37817c.m121344e(1266538525, c28655q, new C34238a(stepState, 25)), c28655q, 384, 2);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1812495514);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36288e(stepState, z4, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m116018d(C36286c c36286c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90653d;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 5;
            float f14 = 8;
            float f15 = 2 * f14;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f14, f15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            C38072d c38072d = C38072d.f163053a;
            int iM46154a = c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getBedtime();
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170911d);
            TextResource bedtimeText = c36286c.getBedtimeText();
            int i14 = TextResource.$stable;
            AbstractC36289f.m116013g(iM46154a, strM92103Y, AbstractC8693b.m21274h(bedtimeText, c28655q, i14), c28655q, 0);
            AbstractC36289f.m116013g(c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getWaketime(), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170903A), AbstractC8693b.m21274h(c36286c.getWaketimeText(), c28655q, i14), c28655q, 0);
            c28655q.m87173q(true);
            float f16 = 4;
            Modifier modifierM3412i = AbstractC1102d.m3412i(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7)), 10 * f16, 50 * f16);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC36284a.m115991h(c36286c, AbstractC11895b.m31988g(modifierM3412i, false, 1.0f), c28655q, 0, 0);
            if (c36286c.m116000i().isEmpty()) {
                c28655q.m87150e0(858569657);
                AbstractC22776b.m65990b(AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f14, 0.0f, 2).mo3471e(new HorizontalAlignElement(c2305k)), "HorizontalSleepBarFooterText"), c36286c.getFooterText(), c36286c.getFooterSubText(), c28655q, (i14 << 6) | (i14 << 3));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(857709810);
                List<C23465k> listM62321i = AbstractC21904c.m62321i(c36286c.m116000i());
                int i15 = C38072d.f163054b;
                C2886a c2886aM8416N = c38072d.m121952e(c28655q, i15).getT1();
                float f17 = f13 * f16;
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f16, 7), "HorizontalSleepBarHighlightedText");
                int i16 = C2886a.f11498d;
                AbstractC30795n.m94704e(listM62321i, modifierM3599a, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c2886aM8416N, c28655q, 48, i16 << 21, 131068);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c36286c.getSubtitleText(), c28655q, i14), AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), 0.0f, 0.0f, 0.0f, f17, 7), c38072d.m121949b(c28655q, i15).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 48, i16 << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m116019e(C36286c c36286c, boolean z4, int i13, Composer composer, int i14) {
        m116017c(c36286c, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
