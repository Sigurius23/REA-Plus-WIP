package wo1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
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
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32627j2;
import qz0.AbstractC30795n;
import so1.C32841y;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: wo1.w */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lso1/y;", "viewState", "Ll83/a0;", "b", "(Lso1/y;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37474w {
    /* JADX INFO: renamed from: b */
    public static final void m120154b(C32841y viewState, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        boolean z4;
        boolean z13;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1679500985);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
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
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t2), EnumC22935a1.f90537w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3388j);
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
            float f13 = 4;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, f13, 0.0f, 11);
            TextResource titleDisplay = viewState.getTitleDisplay();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(titleDisplay, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a t14 = c38072d.m121952e(c28655q, i16).getT3();
            long brandWhite = c38072d.m121949b(c28655q, i16).getBrandWhite();
            int i17 = C2886a.f11498d << 18;
            float f14 = f13;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q, 48, i17, 196600);
            c28655q = c28655q;
            if (viewState.getSubtitleDisplay() == null || !AbstractC8693b.m21270d(viewState.getSubtitleDisplay())) {
                c2314t = c2314t2;
                z4 = false;
                z13 = true;
                c28655q.m87150e0(387319617);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(386721875);
                float f15 = 2 * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t2));
                AbstractC15751g.m44449b(AbstractC1102d.m3424u(1, AbstractC1102d.m3411h(5 * f14, c2314t2)), c38072d.m121949b(c28655q, i16).getWhite10(), 0.0f, 0.0f, c28655q, 6, 12);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t2));
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, f14, 0.0f, 0.0f, 0.0f, 14);
                c2314t = c2314t2;
                f14 = f14;
                z4 = false;
                z13 = true;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitleDisplay(), c28655q, i15), modifierM3398t2, viewState.getStyle().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getT3(), null, c28655q, 48, i17, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            if (viewState.getDescriptionDisplay() != null) {
                c28655q.m87150e0(1891892685);
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescriptionDisplay(), c28655q, i15), AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q2, 48, i17, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(1892140933);
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(viewState, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m120155c(C32841y c32841y, int i13, Composer composer, int i14) {
        m120154b(c32841y, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
