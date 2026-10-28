package d42;

import a31.C0343e;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import az1.C2161b;
import b91.C2886a;
import c42.C4166c;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cy1.C11186b;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27269n0;
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
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: d42.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lc42/c;", "exitDialogViewState", "Lkotlin/Function0;", "Ll83/a0;", "onSharingExperience", "onSkippingSharing", "d", "(Lc42/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "pregnancy_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11686b {
    /* JADX INFO: renamed from: d */
    public static final void m31163d(C4166c exitDialogViewState, InterfaceC4339a onSharingExperience, InterfaceC4339a onSkippingSharing, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        InterfaceC4339a interfaceC4339a;
        C28655q c28655q;
        AbstractC22676k.m65750j(exitDialogViewState, "exitDialogViewState");
        AbstractC22676k.m65750j(onSharingExperience, "onSharingExperience");
        AbstractC22676k.m65750j(onSkippingSharing, "onSkippingSharing");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-735178168);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(exitDialogViewState) : c28655q2.m87157i(exitDialogViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onSharingExperience) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onSkippingSharing) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f14, AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C2307m c2307m = C2299e.f9102E;
            C1100b c1100b = C1100b.f4583a;
            Modifier modifierMo3400a = c1100b.mo3400a(c2314t, c2307m);
            float f15 = 2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14 * f15), C2299e.f9110M, c28655q2, 6);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            C38072d c38072d = C38072d.f163053a;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCheckMark(), c28655q2, 6);
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, c2314t);
            int i15 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, "", modifierM3419p, c38072d.m121949b(c28655q2, i15).getAccentAction(), c28655q2, 432, 0);
            TextResource textResourceM13027f = exitDialogViewState.getSubtitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM13027f, c28655q2, i16);
            long jM125382b1 = c38072d.m121949b(c28655q2, i15).getWhite50();
            C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i15).getH4();
            int i17 = C2886a.f11498d << 18;
            int i18 = i14;
            AbstractC30795n.m94707h(strM21274h, null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q2, 0, i17, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(exitDialogViewState.getTitle(), c28655q2, i16), null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getT2(), null, c28655q2, 0, i17, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(exitDialogViewState.getDescription(), c28655q2, i16), null, c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, i17, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(exitDialogViewState.getFeatureDescription(), c28655q2, i16), null, c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, i17, 196602);
            c28655q2.m87173q(true);
            Modifier modifierMo3400a2 = c1100b.mo3400a(c2314t, C2299e.f9105H);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3400a2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h2 = AbstractC8693b.m21274h(exitDialogViewState.getPrimaryButtonText(), c28655q2, i16);
            long jM125377a = c38072d.m121949b(c28655q2, i15).getAccentAction();
            boolean z4 = (i18 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C0343e(onSharingExperience, 18);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, jM125377a, null, false, (InterfaceC4339a) objM87133R, c28655q2, 54, 104);
            AbstractC18489d0.m53380u(f15, f13, c2314t, c28655q2);
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
            TextResource textResourceM13024c = exitDialogViewState.getDismissText();
            boolean z13 = (i18 & 896) == 256;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                interfaceC4339a = onSkippingSharing;
                objM87133R2 = new C2161b(interfaceC4339a, 14);
                c28655q2.m87172p0(objM87133R2);
            } else {
                interfaceC4339a = onSkippingSharing;
            }
            AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM13024c, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q2, (i16 << 6) | 48, 0, 4089);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            interfaceC4339a = onSkippingSharing;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(exitDialogViewState, onSharingExperience, interfaceC4339a, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m31164e(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m31165f(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m31166g(C4166c c4166c, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m31163d(c4166c, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
