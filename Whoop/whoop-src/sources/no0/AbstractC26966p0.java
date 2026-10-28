package no0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15674c;
import hy0.AbstractC17766l1;
import hy0.C17749h0;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import lo0.C24571b0;
import lo0.C24589k0;
import lo0.InterfaceC24615z;
import m31.C25002h;
import n72.C26439b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
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
import p717lq2.C24671c;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import sy0.AbstractC33085h;
import t11.C33308h;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: no0.p0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00152\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Llo0/b0$b$f;", "viewState", "Lkotlin/Function1;", "Llo0/z;", "Ll83/a0;", "onEvent", "k", "(Llo0/b0$b$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhy0/h0;", "image", "", "title", "subtitle", "n", "(Lhy0/h0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lt11/h;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "s", "(Lt11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Llo0/k0;", "v", "(Llo0/k0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lc31/k;", "progressState", "p", "(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26966p0 {
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:58:0x018e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d6 A[LOOP:0: B:65:0x01d0->B:67:0x01d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x021a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0226  */
    /* JADX WARN: Code duplicated, block: B:79:0x0254  */
    /* JADX WARN: Code duplicated, block: B:82:0x025e  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final void m80754k(C24571b0.b.f viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int iHashCode3;
        Iterator<T> it;
        Function1 function5;
        C24589k0 c24589k0M71750c;
        C3927k c3927kM71753f;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-884090016);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C26439b(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                c2314t = C2314t.f9131w;
                float f13 = 4;
                Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f13 * f13, 0.0f, 2)));
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66720i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM124374d);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                float f14 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC15674c.m44081e(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 10 * f14, 7), 0.0f, null, 3, null), AbstractC26973t.m80810a()), AbstractC30060g.m92099U(0, c28655q, 1), 14), 0.0f, 23 * f14, 0.0f, 6 * f14, 5);
                C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f14, c2305k, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                m80757n(viewState.getImage(), viewState.getTitle(), viewState.getSubtitle(), c28655q, C17749h0.f69004h);
                c28655q.m87150e0(1797826520);
                it = viewState.m71755h().iterator();
                while (it.hasNext()) {
                    Function1 function6 = function4;
                    m80762s((C33308h) it.next(), function6, null, c28655q, (i15 & 112) | C33308h.f138901o, 4);
                    function4 = function6;
                }
                function5 = function4;
                c28655q.m87173q(false);
                c24589k0M71750c = viewState.getCheckbox();
                if (c24589k0M71750c == null) {
                    c28655q.m87150e0(-101814591);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-101814590);
                    m80765v(c24589k0M71750c, function5, null, c28655q, i15 & 112, 4);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                c3927kM71753f = viewState.getProgressButton();
                if (c3927kM71753f == null) {
                    c28655q.m87150e0(513948562);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(513948563);
                    m80759p(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), c3927kM71753f, function3, c28655q, (C3927k.f16020r << 3) | ((i15 << 3) & 896), 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24671c(viewState, i13, function3, i14, 29);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C26439b(27);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            c2314t = C2314t.f9131w;
            float f15 = 4;
            Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f15 * f15, 0.0f, 2)));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66720i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM124374d2 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM124374d2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            float f16 = 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC15674c.m44081e(AbstractC15674c.m44085i(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 10 * f16, 7), 0.0f, null, 3, null), AbstractC26973t.m80810a()), AbstractC30060g.m92099U(0, c28655q, 1), 14), 0.0f, 23 * f16, 0.0f, 6 * f16, 5);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(2, f16, c2305k2, c28655q, 6);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            m80757n(viewState.getImage(), viewState.getTitle(), viewState.getSubtitle(), c28655q, C17749h0.f69004h);
            c28655q.m87150e0(1797826520);
            it = viewState.m71755h().iterator();
            while (it.hasNext()) {
                Function1 function7 = function4;
                m80762s((C33308h) it.next(), function7, null, c28655q, (i15 & 112) | C33308h.f138901o, 4);
                function4 = function7;
            }
            function5 = function4;
            c28655q.m87173q(false);
            c24589k0M71750c = viewState.getCheckbox();
            if (c24589k0M71750c == null) {
                c28655q.m87150e0(-101814591);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-101814590);
                m80765v(c24589k0M71750c, function5, null, c28655q, i15 & 112, 4);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function5;
            c3927kM71753f = viewState.getProgressButton();
            if (c3927kM71753f == null) {
                c28655q.m87150e0(513948562);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(513948563);
                m80759p(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H)), c3927kM71753f, function3, c28655q, (C3927k.f16020r << 3) | ((i15 << 3) & 896), 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(viewState, i13, function3, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m80755l(InterfaceC24615z it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m80756m(C24571b0.b.f fVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80754k(fVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m80757n(C17749h0 c17749h0, String str, String str2, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(225198117);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c17749h0) : c28655q.m87157i(c17749h0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c17749h0.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f13, c2314t), C2299e.f9117z, C39102j.f168200b, 0.0f, null, c28655q, 28080, 96);
            float f14 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13 * f14, 0.0f, 0.0f, 13);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8417O = c38072d.m121952e(c28655q, i16).getT2();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, modifierM3398t, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, ((i15 >> 3) & 14) | 48, i17, 196600);
            c28655q = c28655q;
            if (str2 == null) {
                c28655q.m87150e0(-370081172);
                c28655q.m87173q(false);
                z4 = true;
            } else {
                c28655q.m87150e0(-370081171);
                z4 = true;
                AbstractC30795n.m94707h(str2, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 1 * f14, 1), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, i17, 196088);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26983y(c17749h0, str, str2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m80758o(C17749h0 c17749h0, String str, String str2, int i13, Composer composer, int i14) {
        m80757n(c17749h0, str, str2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m80759p(Modifier modifier, C3927k c3927k, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-812337991);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c3927k) : c28655q.m87157i(c3927k) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 8;
            float f14 = 4 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 0.0f, 2 * f13, f14, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            boolean z4 = (i15 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C26957l(function1, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC3926j.m11931e(c3927k, (Function1) objM87133R, c28655q, C3927k.f16020r | ((i15 >> 3) & 14), 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26981x(modifier3, c3927k, function1, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m80760q(Function1 function1, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(InterfaceC24615z.o.f96242a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m80761r(Modifier modifier, C3927k c3927k, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80759p(modifier, c3927k, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:58:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    private static final void m80762s(C33308h c33308h, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        String id4;
        TextResource textResourceM105672i;
        TextResource textResourceM105668e;
        boolean z13;
        boolean z14;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1169087965);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(c33308h) : c28655q2.m87157i(c33308h) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                id4 = c33308h.getId();
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                textResourceM105672i = c33308h.getLabel();
                if (textResourceM105672i == null) {
                    textResourceM105672i = AbstractC8693b.m21267a();
                }
                TextResource textResourceM105677n = c33308h.getText();
                TextResource textResourceM105671h = c33308h.getHintText();
                textResourceM105668e = c33308h.getErrorMessage();
                if (textResourceM105668e == null) {
                    textResourceM105668e = AbstractC8693b.m21267a();
                }
                TextResource textResource = textResourceM105672i;
                int iM105673j = c33308h.getMaxCharacterCount();
                int iM105674k = c33308h.getMaxLines();
                TextResource textResource2 = textResourceM105668e;
                boolean zM105679p = c33308h.getIsError();
                boolean zM105678o = c33308h.getIsEnabled();
                z13 = false;
                boolean zM105675l = c33308h.getReadOnly();
                C2886a c2886aM105669f = c33308h.getErrorTextStyle();
                boolean zM105676m = c33308h.getRefreshText();
                boolean zM87153g = c28655q2.m87153g(id4);
                if ((i15 & 112) == 32) {
                    z13 = true;
                }
                z14 = zM87153g | z13;
                objM87133R = c28655q2.m87133R();
                if (z14 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C26941d(id4, function1, 7);
                    c28655q2.m87172p0(objM87133R);
                }
                int i17 = TextResource.$stable;
                c28655q = c28655q2;
                AbstractC17766l1.m50964e(modifierM3409f, textResource, textResourceM105677n, textResourceM105671h, textResource2, iM105673j, iM105674k, zM105679p, zM105678o, zM105675l, c2886aM105669f, zM105676m, (Function1) objM87133R, c28655q, (i17 << 12) | (i17 << 3) | (i17 << 6) | (i17 << 9), C2886a.f11498d, 0);
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 16, modifier3, c33308h, function1);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            id4 = c33308h.getId();
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            textResourceM105672i = c33308h.getLabel();
            if (textResourceM105672i == null) {
                textResourceM105672i = AbstractC8693b.m21267a();
            }
            TextResource textResourceM105677n2 = c33308h.getText();
            TextResource textResourceM105671h2 = c33308h.getHintText();
            textResourceM105668e = c33308h.getErrorMessage();
            if (textResourceM105668e == null) {
                textResourceM105668e = AbstractC8693b.m21267a();
            }
            TextResource textResource3 = textResourceM105672i;
            int iM105673j2 = c33308h.getMaxCharacterCount();
            int iM105674k2 = c33308h.getMaxLines();
            TextResource textResource4 = textResourceM105668e;
            boolean zM105679p2 = c33308h.getIsError();
            boolean zM105678o2 = c33308h.getIsEnabled();
            z13 = false;
            boolean zM105675l2 = c33308h.getReadOnly();
            C2886a c2886aM105669f2 = c33308h.getErrorTextStyle();
            boolean zM105676m2 = c33308h.getRefreshText();
            boolean zM87153g2 = c28655q2.m87153g(id4);
            if ((i15 & 112) == 32) {
                z13 = true;
            }
            z14 = zM87153g2 | z13;
            objM87133R = c28655q2.m87133R();
            if (z14) {
                objM87133R = new C26941d(id4, function1, 7);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C26941d(id4, function1, 7);
                c28655q2.m87172p0(objM87133R);
            }
            int i18 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC17766l1.m50964e(modifierM3409f2, textResource3, textResourceM105677n2, textResourceM105671h2, textResource4, iM105673j2, iM105674k2, zM105679p2, zM105678o2, zM105675l2, c2886aM105669f2, zM105676m2, (Function1) objM87133R, c28655q, (i18 << 12) | (i18 << 3) | (i18 << 6) | (i18 << 9), C2886a.f11498d, 0);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 16, modifier3, c33308h, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m80763t(String str, Function1 function1, String newText) {
        AbstractC22676k.m65750j(newText, "newText");
        if (str != null) {
            function1.invoke(new InterfaceC24615z.t(str, newText));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m80764u(C33308h c33308h, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m80762s(c33308h, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    private static final void m80765v(C24589k0 c24589k0, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int i16;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z16;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(681720668);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(c24589k0) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C26964o0(6, function1, c24589k0);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                boolean zM71806b = c24589k0.getIsSelected();
                if (i16 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z16 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C26957l(function1, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                AbstractC33085h.m104813c(null, zM71806b, (Function1) objM87133R2, false, null, AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i18).getBrandWhite(), c38072d.m121949b(c28655q, i18).getBrandWhite(), c38072d.m121949b(c28655q, i18).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, 0, 473);
                AbstractC30795n.m94707h(c24589k0.getLabel(), AbstractC1099a.m3398t(c2314t, 2 * 8, 0.0f, 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 15, modifier3, c24589k0, function1);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i15 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z13;
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z15) {
                objM87133R = new C26964o0(6, function1, c24589k0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C26964o0(6, function1, c24589k0);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            boolean zM71806b2 = c24589k0.getIsSelected();
            if (i16 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z16) {
                objM87133R2 = new C26957l(function1, 8);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C26957l(function1, 8);
                c28655q.m87172p0(objM87133R2);
            }
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            AbstractC33085h.m104813c(null, zM71806b2, (Function1) objM87133R2, false, null, AbstractC12240d.m34081r(c38072d2.m121949b(c28655q, i19).getBrandWhite(), c38072d2.m121949b(c28655q, i19).getBrandWhite(), c38072d2.m121949b(c28655q, i19).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, 0, 473);
            AbstractC30795n.m94707h(c24589k0.getLabel(), AbstractC1099a.m3398t(c2314t, 2 * 8, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i19).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 15, modifier3, c24589k0, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m80766w(Function1 function1, C24589k0 c24589k0) {
        function1.invoke(new InterfaceC24615z.p(!c24589k0.getIsSelected()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m80767x(Function1 function1, boolean z4) {
        function1.invoke(new InterfaceC24615z.p(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m80768y(C24589k0 c24589k0, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m80765v(c24589k0, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
