package d42;

import a31.C0343e;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c42.C4168e;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cy1.C11186b;
import ih0.AbstractC18489d0;
import java.io.IOException;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import u32.AbstractC34506a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: d42.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lc42/e;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onNextClicked", "onPregnancySavedExit", "d", "(Lc42/e;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "pregnancy_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11687c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: d */
    public static final void m31170d(C4168e viewState, InterfaceC4339a interfaceC4339a, InterfaceC4339a onPregnancySavedExit, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C2314t c2314t;
        C0209i c0209i;
        C2307m c2307m;
        C0209i c0209i2;
        ?? r10;
        C0209i c0209i3;
        InterfaceC4339a onNextClicked = interfaceC4339a;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNextClicked, "onNextClicked");
        AbstractC22676k.m65750j(onPregnancySavedExit, "onPregnancySavedExit");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1978383040);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNextClicked) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onPregnancySavedExit) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
            C2307m c2307m2 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
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
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            if (viewState.getBackgroundImageUrl().length() > 0) {
                c28655q.m87150e0(1687682787);
                r10 = 0;
                c0209i2 = c0209i7;
                c2314t = c2314t2;
                c2307m = c2307m2;
                c0209i = c0209i6;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(viewState.getBackgroundImageUrl(), 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), "", AbstractC1102d.m3407d(1.0f, c2314t2), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c2314t = c2314t2;
                c0209i = c0209i6;
                c2307m = c2307m2;
                c0209i2 = c0209i7;
                r10 = 0;
                c28655q.m87150e0(1687952828);
                c28655q.m87173q(false);
            }
            C2307m c2307m3 = C2299e.f9115x;
            C1100b c1100b = C1100b.f4583a;
            Modifier modifierMo3400a = c1100b.mo3400a(c2314t, c2307m3);
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21267a, null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q, AbstractC34506a.f145067i), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            ?? r14 = (i14 & 896) == 256 ? 1 : r10;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (r14 != 0 || objM87133R == c28676v0) {
                objM87133R = new C0343e(onPregnancySavedExit, 19);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierMo3400a, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            Modifier modifierMo3400a2 = c1100b.mo3400a(c2314t, C2299e.f9105H);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, r10);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3400a2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i3 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                c0209i3 = c0209i;
            }
            C0209i c0209i8 = c0209i2;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N2);
            float f13 = 4;
            Modifier modifierMo3400a3 = c1100b.mo3400a(AbstractC1099a.m3394p(8 * f13, c2314t), C2299e.f9102E);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, r10);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3400a3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N3);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q, 6);
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, c2314t);
            int i15 = C38072d.f163054b;
            C28655q c28655q2 = c28655q;
            AbstractC15005f3.m43108b(c27430eM107874S, "", modifierM3419p, c38072d.m121949b(c28655q, i15).getAccentAction(), c28655q2, 432, 0);
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f14, c2314t));
            TextResource textResourceM13038d = viewState.getSubtitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM13038d, c28655q2, i16);
            long jM125385c1 = c38072d.m121949b(c28655q2, i15).getWhite70();
            C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i15).getH4();
            int i17 = C2886a.f11498d << 18;
            int i18 = i14;
            AbstractC30795n.m94707h(strM21274h, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q2, 0, i17, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, i16), null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getT2(), null, c28655q2, 0, i17, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(2 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q2, i16), null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, i17, 196602);
            AbstractC18489d0.m53380u(19, f13, c2314t, c28655q2);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getButtonText(), c28655q2, i16);
            long jM125377a = c38072d.m121949b(c28655q2, i15).getAccentAction();
            boolean z4 = (i18 & 112) == 32;
            Object objM87133R2 = c28655q2.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                onNextClicked = interfaceC4339a;
                objM87133R2 = new C0343e(onNextClicked, 20);
                c28655q2.m87172p0(objM87133R2);
            } else {
                onNextClicked = interfaceC4339a;
            }
            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, jM125377a, null, false, (InterfaceC4339a) objM87133R2, c28655q2, 54, 104);
            c28655q = c28655q2;
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(viewState, onNextClicked, onPregnancySavedExit, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m31171e(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m31172f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m31173g(C4168e c4168e, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m31170d(c4168e, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
