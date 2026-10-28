package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2626t2;
import b91.C2886a;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.yearinreview.FooterText;
import java.util.List;
import jr2.AbstractC21904c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kq2.AbstractC22776b;
import kr2.AbstractC22813b;
import kr2.EnumC22818g;
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
import p027b3.AbstractC2453v1;
import p077d0.C11393q0;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C23010x;
import p291l0.InterfaceC23001u;
import p294l3.C23277r0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import pp2.C29451o;
import q12.C29802c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r12.C30856a;
import ri2.C31469a;
import rm2.C31604d;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import yp2.AbstractC39706c;
import yq2.AbstractC39713a;

/* JADX INFO: renamed from: rq2.c0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lrq2/y;", "step", "", "isCurrentStep", "Ll83/a0;", "k", "(Lrq2/y;ZLandroidx/compose/runtime/Composer;I)V", "", "backgroundNumber", "", "y", "(Ljava/lang/String;)D", "Lv41/r0;", "lottieWrapper", "Lkd1/o;", "image", "Ly3/f;", "x", "(Ljava/lang/String;Lv41/r0;Lkd1/o;)F", "", "numberTextHeight", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31718c0 {
    /* JADX INFO: renamed from: k */
    public static final void m98404k(final C31757y step, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Object obj;
        boolean z13;
        C23454a0 c23454a0;
        boolean z14;
        String strM98575n;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1236353872);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(step) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Boolean boolM98579r = step.getIsWhoopPro();
            Boolean bool = Boolean.TRUE;
            boolean z15 = AbstractC22676k.m65745e(boolM98579r, bool) || AbstractC22676k.m65745e(step.getIsFoundingMember(), bool) || ((strM98575n = step.getRecoveryLevel()) != null && AbstractC28188o1.m85314d(strM98575n));
            if (z4) {
                c28655q2.m87150e0(1421833496);
                Object objM87133R = c28655q2.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    obj = objM87133R;
                    C11393q0 c11393q0 = new C11393q0(Boolean.FALSE);
                    c11393q0.m30628I0(bool);
                    c28655q2.m87172p0(c11393q0);
                    obj = c11393q0;
                }
                obj = objM87133R;
                C11393q0 c11393q1 = (C11393q0) obj;
                Object objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC3855a.m11831o(0.0f, c28655q2);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                C22961h c22961h = AbstractC22977m.f90656g;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, C2299e.f9110M, c28655q2, 6);
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
                C0209i c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                C0209i c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                C0209i c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM124374d);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                C2307m c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                float f13 = 4;
                final int i15 = 0;
                AbstractC22813b.m66084k(c11393q1, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3413j(c2314t, 0.0f, 140 * f13, 1)), AbstractC37817c.m121344e(-1431126237, c28655q2, new InterfaceC4351m() { // from class: rq2.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int i16 = i15;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i16) {
                            case 0:
                                return AbstractC31718c0.m98407n(step, composer2, iIntValue);
                            case 1:
                                return AbstractC31718c0.m98408o(step, composer2, iIntValue);
                            default:
                                return AbstractC31718c0.m98414u(step, composer2, iIntValue);
                        }
                    }
                }), c28655q2, 432, 0);
                C1100b c1100b = C1100b.f4583a;
                float f14 = 8;
                final int i16 = 1;
                AbstractC22813b.m66084k(c11393q1, AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m), 3 * f14, 6 * f14, 0.0f, 0.0f, 12), AbstractC37817c.m121344e(266782092, c28655q2, new InterfaceC4351m() { // from class: rq2.b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int i17 = i16;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i17) {
                            case 0:
                                return AbstractC31718c0.m98407n(step, composer2, iIntValue);
                            case 1:
                                return AbstractC31718c0.m98408o(step, composer2, iIntValue);
                            default:
                                return AbstractC31718c0.m98414u(step, composer2, iIntValue);
                        }
                    }
                }), c28655q2, 384, 0);
                C2307m c2307m2 = C2299e.f9115x;
                int i17 = 384;
                AbstractC22813b.m66084k(c11393q1, AbstractC1099a.m3396r(AbstractC1099a.m3392n(c1100b.mo3400a(c2314t, c2307m2), 0.0f, m98417x(step.getDisplayNumber(), step.getLottieWrapper(), step.getImage()), 1), 0.0f, 2 * f14, 1), AbstractC37817c.m121344e(-1377166677, c28655q2, new C29451o(9, step, interfaceC28601c1)), c28655q2, 384, 0);
                InterfaceC35689r0 interfaceC35689r0M98572k = step.getLottieWrapper();
                if (interfaceC35689r0M98572k == null) {
                    c28655q2.m87150e0(-1763025440);
                    c28655q2.m87173q(false);
                    c23454a0 = null;
                    z13 = false;
                } else {
                    c28655q2.m87150e0(-1763025439);
                    i17 = 384;
                    AbstractC22813b.m66084k(c11393q1, AbstractC1099a.m3396r(c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m2), 0.0f, f14 * f14, 1), AbstractC37817c.m121344e(1340340448, c28655q2, new C30856a(interfaceC35689r0M98572k, 8)), c28655q2, 384, 0);
                    z13 = false;
                    c28655q2.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q2.m87150e0(-1762239372);
                    if (step.getImage() == null) {
                        c28655q2.m87150e0(-1762239373);
                        c28655q2.m87173q(z13);
                        z14 = z13;
                    } else {
                        c28655q2.m87150e0(-1762239372);
                        float f15 = f14 * f14;
                        final int i18 = 2;
                        AbstractC22813b.m66084k(c11393q1, AbstractC1099a.m3396r(AbstractC1099a.m3392n(c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), c2307m2), 0.0f, m98405l(interfaceC28601c1) > 0.0f ? ((((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo734f0(m98405l(interfaceC28601c1)) / 2.0f) + m98417x(step.getDisplayNumber(), step.getLottieWrapper(), step.getImage())) - f15 : 18 * f13, 1), 0.0f, f15, 1), AbstractC37817c.m121344e(1504805594, c28655q2, new InterfaceC4351m() { // from class: rq2.b0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj2, Object obj3) {
                                int i19 = i18;
                                Composer composer2 = (Composer) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                switch (i19) {
                                    case 0:
                                        return AbstractC31718c0.m98407n(step, composer2, iIntValue);
                                    case 1:
                                        return AbstractC31718c0.m98408o(step, composer2, iIntValue);
                                    default:
                                        return AbstractC31718c0.m98414u(step, composer2, iIntValue);
                                }
                            }
                        }), c28655q2, i17, 0);
                        z14 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                } else {
                    c28655q2.m87150e0(1467149856);
                    c28655q2.m87173q(z13);
                }
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                AbstractC22813b.m66094u(c11393q1, EnumC22818g.BOTTOM, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f14, 0.0f, 2), AbstractC37817c.m121344e(-869923052, c28655q2, new C2626t2(step, z15, 8)), c28655q2, 3504, 0);
                C28655q c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                c28655q3.m87173q(false);
                c28655q = c28655q3;
            } else {
                c28655q2.m87150e0(1429730994);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            }
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31758z(step, z4, i13, 1);
        }
    }

    /* JADX INFO: renamed from: l */
    private static final float m98405l(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: m */
    private static final void m98406m(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m98407n(C31757y c31757y, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC22403o abstractC22403oM98566e = c31757y.getBackgroundImage();
            if (abstractC22403oM98566e == null) {
                c28655q.m87150e0(1458679237);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1458679238);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM98566e, null, null, c28655q, AbstractC22403o.f87638a, 3), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170924q), null, null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 108);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m98408o(C31757y c31757y, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            TextResource textResourceM98577p = c31757y.getTitle();
            if (textResourceM98577p == null) {
                c28655q.m87150e0(2015851921);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2015851922);
                String strM21274h = AbstractC8693b.m21274h(textResourceM98577p, c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m98409p(C31757y c31757y, InterfaceC23001u interfaceC23001u, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM98567f = c31757y.getDisplayNumber();
            C2886a c2886aM62319g = AbstractC21904c.m62319g(m98418y(c31757y.getDisplayNumber()), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c31757y.getNumberColor()), new C17919x(C17919x.m51541c(0.1f, c31757y.getNumberColor()))), 0.0f, 0.0f, 14));
            Modifier modifierMo3400a = interfaceC23001u.mo3400a(C2314t.f9131w, C2299e.f9115x);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C29802c(7, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC30795n.m94707h(strM98567f, modifierMo3400a, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) objM87133R, c2886aM62319g, null, c28655q, 0, (C2886a.f11498d << 18) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 163836);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m98410q(InterfaceC28601c1 interfaceC28601c1, C23277r0 textLayoutResult) {
        AbstractC22676k.m65750j(textLayoutResult, "textLayoutResult");
        m98406m(interfaceC28601c1, (int) (textLayoutResult.f92229c & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m98411r(InterfaceC35689r0 interfaceC35689r0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C31469a(21);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C31604d(12);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35684p.m113047h(null, interfaceC35689r0, false, 0.0f, 1, interfaceC4339a, (Function1) objM87133R2, C39102j.f168202d, null, c28655q, 14376960, 269);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m98412s() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m98413t(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m98414u(C31757y c31757y, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c31757y.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170924q), AbstractC1102d.m3411h(90 * 4, C2314t.f9131w), null, C39102j.f168200b, 0.0f, null, c28655q, 24960, 104);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m98415v(C31757y c31757y, boolean z4, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t2);
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
            if (c31757y.m98576o().isEmpty()) {
                i14 = 8;
                c2314t = c2314t2;
                c28655q.m87150e0(-936742818);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(new HorizontalAlignElement(c2305k)), "NumberWithImageV2FooterText");
                TextResource textResourceM98569h = c31757y.getFooterText();
                TextResource textResourceM98568g = c31757y.getFooterSubText();
                int i15 = TextResource.$stable;
                AbstractC22776b.m65990b(modifierM3599a, textResourceM98569h, textResourceM98568g, c28655q, (i15 << 6) | (i15 << 3));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-937730199);
                List<C23465k> listM62321i = AbstractC21904c.m62321i(c31757y.m98576o());
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                C2886a c2886aM8416N = c38072d.m121952e(c28655q, i16).getT1();
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2).mo3471e(new HorizontalAlignElement(C2299e.f9111N)), "NumberWithImageV2Text");
                int i17 = C2886a.f11498d << 21;
                i14 = 8;
                AbstractC30795n.m94704e(listM62321i, modifierM3599a2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c2886aM8416N, c28655q, 0, i17, 131068);
                List<FooterText> listM98570i = c31757y.m98570i();
                if (listM98570i == null) {
                    c28655q = c28655q;
                    c28655q.m87150e0(-937259992);
                    c28655q.m87173q(false);
                    c2314t = c2314t2;
                } else {
                    c28655q.m87150e0(-937259991);
                    AbstractC11266d.m30469w(2, 8, c2314t2, c28655q);
                    if (listM98570i.isEmpty()) {
                        c28655q = c28655q;
                        c2314t = c2314t2;
                        c28655q.m87150e0(682057326);
                        c28655q.m87173q(false);
                    } else {
                        c28655q = c28655q;
                        c28655q.m87150e0(681764252);
                        c2314t = c2314t2;
                        AbstractC30795n.m94704e(AbstractC21904c.m62320h(listM98570i), null, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i16).getB1(), c28655q, 0, i17, 131066);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            if (z4) {
                c28655q.m87150e0(-936261605);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * i14, c2314t));
                String strM98575n = c31757y.getRecoveryLevel();
                if (strM98575n == null) {
                    strM98575n = "";
                }
                String str = strM98575n;
                Boolean boolM98578q = c31757y.getIsFoundingMember();
                boolean zBooleanValue = boolM98578q != null ? boolM98578q.booleanValue() : false;
                Boolean boolM98579r = c31757y.getIsWhoopPro();
                AbstractC39713a.m127091c(str, zBooleanValue, boolM98579r != null ? boolM98579r.booleanValue() : false, c31757y.getRecoveryBadgeLevel(), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-935833960);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m98416w(C31757y c31757y, boolean z4, int i13, Composer composer, int i14) {
        m98404k(c31757y, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final float m98417x(String backgroundNumber, InterfaceC35689r0 interfaceC35689r0, AbstractC22403o abstractC22403o) {
        int i13;
        AbstractC22676k.m65750j(backgroundNumber, "backgroundNumber");
        if (backgroundNumber.length() == 1) {
            i13 = 0;
        } else {
            i13 = (interfaceC35689r0 == null && abstractC22403o == null) ? 160 : 55;
        }
        return i13;
    }

    /* JADX INFO: renamed from: y */
    public static final double m98418y(String backgroundNumber) {
        AbstractC22676k.m65750j(backgroundNumber, "backgroundNumber");
        switch (backgroundNumber.length()) {
            case 1:
                return 361.45d;
            case 2:
            case 3:
                return 180.0d;
            case 4:
                return 164.0d;
            case 5:
            case 6:
                return 120.0d;
            case 7:
            case 8:
            case 9:
            case 10:
                return 76.0d;
            default:
                return 46.0d;
        }
    }
}
