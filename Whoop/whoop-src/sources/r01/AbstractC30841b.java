package r01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p730qt2.C30617w;
import pf.AbstractC29125c;
import qb0.C30179a;
import qx0.C30745a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: r01.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lr01/c;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lr01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30841b {
    /* JADX WARN: Code duplicated, block: B:100:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01da  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0205  */
    /* JADX WARN: Code duplicated, block: B:82:0x020a  */
    /* JADX WARN: Code duplicated, block: B:85:0x022a  */
    /* JADX WARN: Code duplicated, block: B:86:0x022e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0249  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m94847d(Modifier modifier, C30842c state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Function1 function4;
        boolean z13;
        float f13;
        float f14;
        float f15;
        C38072d c38072d;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        Function1 function5;
        String imageUrl;
        C0209i c0209i3;
        C0209i c0209i4;
        float f16;
        C38072d c38072d2;
        ?? r10;
        C2314t c2314t2;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        C28655q c28655q2;
        int iHashCode2;
        C0209i c0209i5;
        boolean z14;
        float f17;
        int iHashCode3;
        C28655q c28655q3;
        InterfaceC25312u button;
        Object objM87133R;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(2027887073);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q4.m87153g(state) : c28655q4.m87157i(state) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q4.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if (i19 != 0) {
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C30617w(12);
                        c28655q4.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (state.getImageUrl() != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f13 = 2;
                f14 = 8 * f13;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                C2306l c2306l = C2299e.f9107J;
                f15 = 4;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, modifier2), EnumC22935a1.f90538x), 3, f15);
                c38072d = C38072d.f163053a;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q4, 6).getWhite10(), AbstractC17918w0.f69621a));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q4, 54);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i6, c22994r1M66759a);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                function5 = function4;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N);
                imageUrl = state.getImageUrl();
                if (imageUrl == null) {
                    c28655q4.m87150e0(1690352799);
                    c28655q4.m87173q(false);
                    f16 = f14;
                    c0209i4 = c0209i;
                    r10 = 0;
                    c0209i3 = c0209i2;
                    interfaceC4339a2 = interfaceC4339a;
                    c38072d2 = c38072d;
                    c2314t2 = c2314t;
                    i17 = 6;
                    c28655q2 = c28655q4;
                } else {
                    c28655q4.m87150e0(1690352800);
                    c0209i3 = c0209i2;
                    c0209i4 = c0209i;
                    f16 = f14;
                    c38072d2 = c38072d;
                    r10 = 0;
                    c2314t2 = c2314t;
                    interfaceC4339a2 = interfaceC4339a;
                    i17 = 6;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(AbstractC22404p.m64503l(imageUrl), null, null, c28655q4, 0, 3), null, AbstractC18489d0.m53364e(AbstractC1102d.m3419p(24 * f15, c2314t), f13, f15), null, C39102j.f168199a, 0.0f, null, c28655q4, 24624, 104);
                    C28655q c28655q5 = c28655q4;
                    c28655q5.m87173q(false);
                    c28655q2 = c28655q5;
                }
                Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t2);
                C22961h c22961h = AbstractC22977m.f90656g;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, i17);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3406c);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a);
                C0209i c0209i8 = c0209i4;
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i5 = c0209i3;
                } else {
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N2);
                if (z13) {
                    z14 = true;
                    f17 = 1 * f15;
                } else {
                    z14 = true;
                    f17 = f16;
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), c2305k, c28655q2, r10);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
                boolean z15 = z14;
                C38072d c38072d3 = c38072d2;
                C28655q c28655q6 = c28655q2;
                AbstractC30795n.m94707h(state.getTitle(), null, c38072d3.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i17).getT4(), null, c28655q6, 0, 0, 196602);
                AbstractC30795n.m94707h(state.getDescription(), null, c38072d3.m121949b(c28655q6, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q6, i17).getB1(), null, c28655q6, 0, 0, 196602);
                c28655q3 = c28655q6;
                c28655q3.m87173q(z15);
                button = state.getButton();
                if (button == null) {
                    c28655q3.m87150e0(52733096);
                    c28655q3.m87173q(r10);
                } else {
                    c28655q3.m87150e0(52733097);
                    AbstractC25303l.m74291r(button, null, new C30745a(5), function5, c28655q3, (i16 << 3) & 7168, 2);
                    c28655q3.m87173q(r10);
                }
                c28655q3.m87173q(z15);
                c28655q3.m87173q(z15);
                modifier2 = modifier2;
                function3 = function5;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                function3 = function2;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(i13, i14, 19, modifier2, state, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            if (i19 != 0) {
                objM87133R = c28655q4.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C30617w(12);
                    c28655q4.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            if (state.getImageUrl() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            f13 = 2;
            f14 = 8 * f13;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14);
            C2306l c2306l2 = C2299e.f9107J;
            f15 = 4;
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, modifier2), EnumC22935a1.f90538x), 3, f15);
            c38072d = C38072d.f163053a;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, AbstractC1092a.m3358c(modifierM53364e2, c38072d.m121949b(c28655q4, 6).getWhite10(), AbstractC17918w0.f69621a));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q4, 54);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i9 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i9, c22994r1M66759a2);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m4);
            c0209i2 = C0217k.f732j;
            function5 = function4;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
            }
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i10, modifierM118962N4);
            imageUrl = state.getImageUrl();
            if (imageUrl == null) {
                c28655q4.m87150e0(1690352799);
                c28655q4.m87173q(false);
                f16 = f14;
                c0209i4 = c0209i;
                r10 = 0;
                c0209i3 = c0209i2;
                interfaceC4339a2 = interfaceC4339a;
                c38072d2 = c38072d;
                c2314t2 = c2314t;
                i17 = 6;
                c28655q2 = c28655q4;
            } else {
                c28655q4.m87150e0(1690352800);
                c0209i3 = c0209i2;
                c0209i4 = c0209i;
                f16 = f14;
                c38072d2 = c38072d;
                r10 = 0;
                c2314t2 = c2314t;
                interfaceC4339a2 = interfaceC4339a;
                i17 = 6;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(AbstractC22404p.m64503l(imageUrl), null, null, c28655q4, 0, 3), null, AbstractC18489d0.m53364e(AbstractC1102d.m3419p(24 * f15, c2314t), f13, f15), null, C39102j.f168199a, 0.0f, null, c28655q4, 24624, 104);
                C28655q c28655q7 = c28655q4;
                c28655q7.m87173q(false);
                c28655q2 = c28655q7;
            }
            Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, c2314t2);
            C22961h c22961h2 = AbstractC22977m.f90656g;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22961h2, c2305k2, c28655q2, i17);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3406c2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, c23010xM66775a3);
            C0209i c0209i11 = c0209i4;
            AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S) {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i5);
            } else {
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N5);
            if (z13) {
                z14 = true;
                f17 = 1 * f15;
            } else {
                z14 = true;
                f17 = f16;
            }
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), c2305k2, c28655q2, r10);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N6);
            boolean z16 = z14;
            C38072d c38072d4 = c38072d2;
            C28655q c28655q8 = c28655q2;
            AbstractC30795n.m94707h(state.getTitle(), null, c38072d4.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i17).getT4(), null, c28655q8, 0, 0, 196602);
            AbstractC30795n.m94707h(state.getDescription(), null, c38072d4.m121949b(c28655q8, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q8, i17).getB1(), null, c28655q8, 0, 0, 196602);
            c28655q3 = c28655q8;
            c28655q3.m87173q(z16);
            button = state.getButton();
            if (button == null) {
                c28655q3.m87150e0(52733096);
                c28655q3.m87173q(r10);
            } else {
                c28655q3.m87150e0(52733097);
                AbstractC25303l.m74291r(button, null, new C30745a(5), function5, c28655q3, (i16 << 3) & 7168, 2);
                c28655q3.m87173q(r10);
            }
            c28655q3.m87173q(z16);
            c28655q3.m87173q(z16);
            modifier2 = modifier2;
            function3 = function5;
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            function3 = function2;
            c28655q = c28655q4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 19, modifier2, state, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m94848e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m94849f(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-833350017);
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m94850g(Modifier modifier, C30842c c30842c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m94847d(modifier, c30842c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
