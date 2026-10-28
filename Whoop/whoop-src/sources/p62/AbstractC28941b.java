package p62;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l62.AbstractC23380a;
import l83.C23454a0;
import m62.C25115f;
import m62.InterfaceC25116g;
import nq0.C27050m;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import of2.C27900d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p62.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lm62/g$a;", "viewState", "Lkotlin/Function1;", "Ll62/a;", "Ll83/a0;", "onNavigationEvent", "f", "(Lm62/g$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "refer-a-friend_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28941b {
    /* JADX WARN: Code duplicated, block: B:115:0x0414  */
    /* JADX WARN: Code duplicated, block: B:118:0x0419  */
    /* JADX WARN: Code duplicated, block: B:119:0x041c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0444  */
    /* JADX WARN: Code duplicated, block: B:125:0x0450  */
    /* JADX WARN: Code duplicated, block: B:127:0x0462  */
    /* JADX WARN: Code duplicated, block: B:128:0x0464  */
    /* JADX WARN: Code duplicated, block: B:131:0x0470 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0472  */
    /* JADX WARN: Code duplicated, block: B:136:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:139:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:142:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:144:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:146:0x04d6  */
    /* JADX INFO: renamed from: f */
    public static final void m87859f(InterfaceC25116g.a aVar, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        C0213j c0213j;
        C0209i c0209i;
        boolean z4;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v0;
        C25115f secondaryCtaTileState;
        boolean z14;
        boolean zM87157i;
        Object objM87133R2;
        boolean z15;
        float f13;
        InterfaceC25116g.a viewState = aVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(449413905);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            AbstractC22403o.a aVar2 = new AbstractC22403o.a(viewState.getStyle().getBackgroundImage());
            int i15 = AbstractC22403o.a.f87639c;
            int i16 = i14;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(aVar2, null, null, c28655q, i15, 3), null, modifierM3409f2, null, C39102j.f168205g, 0.0f, null, c28655q, 25008, 104);
            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14));
            C2305k c2305k = C2299e.f9111N;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66723l);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            AbstractC6721d.c cVar = new AbstractC6721d.c(null, null, null, viewState.getStyle().getLeftIcon(), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), viewState.getStyle().getRightIcon(), null, null, null, null, null, null, null, 8135, null);
            int i17 = i16 & 14;
            int i18 = i16 & 112;
            boolean z16 = (i17 == 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) | (i18 == 32);
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z16 || objM87133R3 == c28676v1) {
                objM87133R3 = new C28940a(viewState, onNavigationEvent, 0);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
            boolean z17 = (i17 == 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) | (i18 == 32);
            Object objM87133R4 = c28655q.m87133R();
            if (z17 || objM87133R4 == c28676v1) {
                objM87133R4 = new C28940a(viewState, onNavigationEvent, 1);
                c28655q.m87172p0(objM87133R4);
            }
            C0209i c0209i6 = c0209i;
            C0213j c0213j3 = c0213j;
            AbstractC6719b.m20143d(null, cVar, null, interfaceC4339a, (InterfaceC4339a) objM87133R4, null, c28655q, AbstractC6721d.c.f25657p << 3, 37);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            float f14 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, 3 * f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, viewState.getStyle().getPaddingBottom(), 7);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            float f15 = 2 * f14;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(viewState.getIcon().toWhoopIcon()), null, null, c28655q, i15, 3), "", AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7), null, null, 0.0f, null, c28655q, 432, 120);
            String title = viewState.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C2886a t14 = c38072d.m121952e(c28655q, i19).getT2();
            long brandWhite = c38072d.m121949b(c28655q, i19).getBrandWhite();
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f14, 7);
            C36775k c36775k = new C36775k(3);
            int i24 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(title, modifierM3398t2, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, t14, null, c28655q, 48, i24, 196088);
            AbstractC30795n.m94707h(aVar.getSubtitle(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 4 * f14, 7), c38072d.m121949b(c28655q, i19).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB1(), null, c28655q, 48, i24, 196088);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String title2 = aVar.getPrimaryCtaTileState().getTitle();
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, f15, 7);
            boolean z18 = i18 == 32;
            if (i17 != 4) {
                if ((i16 & 8) != 0) {
                    viewState = aVar;
                    if (c28655q.m87157i(viewState)) {
                    }
                    z13 = z4 | z18;
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        c28676v0 = c28676v1;
                    } else {
                        c28676v0 = c28676v1;
                        if (objM87133R == c28676v0) {
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        function1 = onNavigationEvent;
                        AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, title2, false, 0L, null, false, interfaceC4339a2, c28655q, 54, 120);
                        c28655q = c28655q;
                        secondaryCtaTileState = viewState.getSecondaryCtaTileState();
                        if (secondaryCtaTileState == null) {
                            c28655q.m87150e0(2109929982);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(2109929983);
                            TextResource textResourceM21278l = AbstractC8693b.m21278l(secondaryCtaTileState.getTitle());
                            if (i18 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            zM87157i = c28655q.m87157i(secondaryCtaTileState) | z14;
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i || objM87133R2 == c28676v0) {
                                objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC27265l0.m82217i(null, null, textResourceM21278l, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        if (viewState.getStyle().getAddBottomSpacer()) {
                            c28655q.m87150e0(986665189);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            z15 = true;
                            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                            c28655q.m87173q(false);
                        } else {
                            z15 = true;
                            c28655q.m87150e0(986734381);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z15);
                        c28655q.m87173q(z15);
                    }
                    objM87133R = new C28940a(onNavigationEvent, viewState);
                    c28655q.m87172p0(objM87133R);
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    function1 = onNavigationEvent;
                    AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, title2, false, 0L, null, false, interfaceC4339a3, c28655q, 54, 120);
                    c28655q = c28655q;
                    secondaryCtaTileState = viewState.getSecondaryCtaTileState();
                    if (secondaryCtaTileState == null) {
                        c28655q.m87150e0(2109929982);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2109929983);
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(secondaryCtaTileState.getTitle());
                        if (i18 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i = c28655q.m87157i(secondaryCtaTileState) | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27265l0.m82217i(null, null, textResourceM21278l2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (viewState.getStyle().getAddBottomSpacer()) {
                        c28655q.m87150e0(986665189);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        z15 = true;
                        AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                        c28655q.m87173q(false);
                    } else {
                        z15 = true;
                        c28655q.m87150e0(986734381);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    c28655q.m87173q(z15);
                } else {
                    viewState = aVar;
                }
                z4 = false;
                z13 = z4 | z18;
                objM87133R = c28655q.m87133R();
                if (z13) {
                    c28676v0 = c28676v1;
                    if (objM87133R == c28676v0) {
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    function1 = onNavigationEvent;
                    AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, title2, false, 0L, null, false, interfaceC4339a4, c28655q, 54, 120);
                    c28655q = c28655q;
                    secondaryCtaTileState = viewState.getSecondaryCtaTileState();
                    if (secondaryCtaTileState == null) {
                        c28655q.m87150e0(2109929982);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2109929983);
                        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(secondaryCtaTileState.getTitle());
                        if (i18 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i = c28655q.m87157i(secondaryCtaTileState) | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27265l0.m82217i(null, null, textResourceM21278l3, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (viewState.getStyle().getAddBottomSpacer()) {
                        c28655q.m87150e0(986665189);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        z15 = true;
                        AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                        c28655q.m87173q(false);
                    } else {
                        z15 = true;
                        c28655q.m87150e0(986734381);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    c28655q.m87173q(z15);
                } else {
                    c28676v0 = c28676v1;
                }
                objM87133R = new C28940a(onNavigationEvent, viewState);
                c28655q.m87172p0(objM87133R);
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                function1 = onNavigationEvent;
                AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, title2, false, 0L, null, false, interfaceC4339a5, c28655q, 54, 120);
                c28655q = c28655q;
                secondaryCtaTileState = viewState.getSecondaryCtaTileState();
                if (secondaryCtaTileState == null) {
                    c28655q.m87150e0(2109929982);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2109929983);
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(secondaryCtaTileState.getTitle());
                    if (i18 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = c28655q.m87157i(secondaryCtaTileState) | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27265l0.m82217i(null, null, textResourceM21278l4, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (viewState.getStyle().getAddBottomSpacer()) {
                    c28655q.m87150e0(986665189);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    z15 = true;
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                    c28655q.m87173q(false);
                } else {
                    z15 = true;
                    c28655q.m87150e0(986734381);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                c28655q.m87173q(z15);
            } else {
                viewState = aVar;
            }
            z4 = true;
            z13 = z4 | z18;
            objM87133R = c28655q.m87133R();
            if (z13) {
                c28676v0 = c28676v1;
                if (objM87133R == c28676v0) {
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                function1 = onNavigationEvent;
                AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, title2, false, 0L, null, false, interfaceC4339a6, c28655q, 54, 120);
                c28655q = c28655q;
                secondaryCtaTileState = viewState.getSecondaryCtaTileState();
                if (secondaryCtaTileState == null) {
                    c28655q.m87150e0(2109929982);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2109929983);
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(secondaryCtaTileState.getTitle());
                    if (i18 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = c28655q.m87157i(secondaryCtaTileState) | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27265l0.m82217i(null, null, textResourceM21278l5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (viewState.getStyle().getAddBottomSpacer()) {
                    c28655q.m87150e0(986665189);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    z15 = true;
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                    c28655q.m87173q(false);
                } else {
                    z15 = true;
                    c28655q.m87150e0(986734381);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                c28655q.m87173q(z15);
            } else {
                c28676v0 = c28676v1;
            }
            objM87133R = new C28940a(onNavigationEvent, viewState);
            c28655q.m87172p0(objM87133R);
            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
            function1 = onNavigationEvent;
            AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, title2, false, 0L, null, false, interfaceC4339a7, c28655q, 54, 120);
            c28655q = c28655q;
            secondaryCtaTileState = viewState.getSecondaryCtaTileState();
            if (secondaryCtaTileState == null) {
                c28655q.m87150e0(2109929982);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2109929983);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(secondaryCtaTileState.getTitle());
                if (i18 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = c28655q.m87157i(secondaryCtaTileState) | z14;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C27050m(21, function1, secondaryCtaTileState);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27265l0.m82217i(null, null, textResourceM21278l6, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (viewState.getStyle().getAddBottomSpacer()) {
                c28655q.m87150e0(986665189);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                z15 = true;
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, true));
                c28655q.m87173q(false);
            } else {
                z15 = true;
                c28655q.m87150e0(986734381);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
            c28655q.m87173q(z15);
        } else {
            function1 = onNavigationEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(viewState, function1, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m87860g(InterfaceC25116g.a aVar, Function1 function1) {
        if (aVar.getStyle().getLeftIcon() != null) {
            function1.invoke(AbstractC23380a.a.f92669a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m87861h(InterfaceC25116g.a aVar, Function1 function1) {
        if (aVar.getStyle().getRightIcon() != null) {
            function1.invoke(AbstractC23380a.a.f92669a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m87862i(Function1 function1, InterfaceC25116g.a aVar) {
        function1.invoke(new AbstractC23380a.b(aVar.getPrimaryCtaTileState().getDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m87863j(Function1 function1, C25115f c25115f, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC23380a.b(c25115f.getDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m87864k(InterfaceC25116g.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m87859f(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
