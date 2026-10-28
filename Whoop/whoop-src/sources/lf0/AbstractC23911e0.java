package lf0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io2.C20769k0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import ma0.AbstractC25370d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.e0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/f0;", "state", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Llf0/f0;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23911e0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m70293b(Modifier modifier, C23915f0 state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        int i16;
        C28655q c28655q2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-467864341);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q3.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(state) : c28655q3.m87157i(state) ? 32 : 16;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q3, 54);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i4, c22994r1M66759a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N);
            float f13 = 2;
            float f14 = 8;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f13, f14, c2306l, c28655q3, 54);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N2);
            float f15 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(7 * f15, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3419p);
            c28655q3.m87158i0();
            Modifier modifier5 = modifier4;
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m3);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N3);
            AbstractC22403o profileImage = state.getProfileImage();
            int i18 = AbstractC22403o.f87638a;
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(profileImage, null, null, c28655q3, i18, 3);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q3, AbstractC25370d.f99445n);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C33252i c33252i = AbstractC33253j.f138651a;
            AbstractC29125c.m88522c(abstractC26165aM64500i, strM92103Y, AbstractC37056f.m118994r(modifierM3407d, c33252i), null, C39102j.f168199a, 0.0f, null, c28655q3, 24576, 104);
            C28655q c28655q4 = c28655q3;
            EnumC16313m0 badgeIcon = state.getBadgeIcon();
            if (badgeIcon == null) {
                c28655q4.m87150e0(-1886075448);
                i16 = 0;
                c28655q4.m87173q(false);
                c0209i3 = c0209i7;
                c0209i2 = c0209i6;
                c0209i = c0209i5;
            } else {
                Modifier modifierM3391m = AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(AbstractC18489d0.m53365f(c28655q4, -1886075447, f15, f15, c2314t), C2299e.f9106I), 1 * f14, ((float) 0.25d) * f14);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3391m, c38072d.m121949b(c28655q4, i19).getBrandBlack(), c33252i);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3358c);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC39127r0M66763d2);
                c0209i = c0209i5;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m4);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                    c0209i2 = c0209i6;
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i2);
                } else {
                    c0209i2 = c0209i6;
                }
                c0209i3 = c0209i7;
                AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N4);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(badgeIcon.toWhoopIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f13 * f15, c2314t), c38072d.m121949b(c28655q4, i19).getBrandWhite(), c28655q4, 432, 0);
                c28655q4 = c28655q4;
                c28655q4.m87173q(true);
                i16 = 0;
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, i16);
            int iHashCode5 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, c2314t);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m5);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N5);
            boolean z4 = i16;
            String supertitle = state.getSupertitle();
            C38072d c38072d2 = C38072d.f163053a;
            int i24 = C38072d.f163054b;
            C2886a b6 = c38072d2.m121952e(c28655q4, i24).getB2();
            long white70 = c38072d2.m121949b(c28655q4, i24).getWhite70();
            int i25 = C2886a.f11498d << 18;
            C28655q c28655q5 = c28655q4;
            AbstractC30795n.m94707h(supertitle, null, white70, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q5, 0, i25, 196602);
            AbstractC30795n.m94707h(state.getTitle(), null, c38072d2.m121949b(c28655q5, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q5, i24).getB2(), null, c28655q5, 0, i25, 196602);
            C28655q c28655q6 = c28655q5;
            c28655q6.m87173q(true);
            c28655q6.m87173q(true);
            AbstractC22403o signatureImage = state.getSignatureImage();
            if (signatureImage == null) {
                c28655q6.m87150e0(602132154);
                c28655q6.m87173q(z4);
                c28655q2 = c28655q6;
            } else {
                c28655q6.m87150e0(602132155);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(signatureImage, null, null, c28655q6, i18, 3), AbstractC30060g.m92103Y(c28655q6, AbstractC25370d.f99450s), AbstractC1102d.m3421r(c2314t, 15 * f15, f14 * f15), null, C39102j.f168200b, 0.0f, null, c28655q6, 24576, 104);
                C28655q c28655q7 = c28655q6;
                c28655q7.m87173q(z4);
                c28655q2 = c28655q7;
            }
            c28655q2.m87173q(true);
            modifier3 = modifier5;
            c28655q = c28655q2;
        } else {
            C28655q c28655q8 = c28655q3;
            c28655q8.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q8;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(modifier3, i13, state, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m70294c(Modifier modifier, C23915f0 c23915f0, int i13, int i14, Composer composer, int i15) {
        m70293b(modifier, c23915f0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
