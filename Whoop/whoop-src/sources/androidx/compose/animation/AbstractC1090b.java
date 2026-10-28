package androidx.compose.animation;

import al.AbstractC0954a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p007a6.C0458v;
import p026b2.C2314t;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p040c0.C3726b0;
import p040c0.C3728c;
import p040c0.C3729c0;
import p040c0.C3731d;
import p040c0.C3732d0;
import p040c0.C3733d1;
import p040c0.C3735e0;
import p040c0.C3738f0;
import p040c0.C3739f1;
import p040c0.C3744h0;
import p040c0.C3750j0;
import p040c0.C3753k0;
import p040c0.C3755l;
import p040c0.C3774r0;
import p040c0.C3780t0;
import p040c0.C3783u0;
import p040c0.C3784u1;
import p040c0.C3791y;
import p040c0.C3793z;
import p040c0.EnumC3771q0;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11351f2;
import p077d0.C11393q0;
import p077d0.C11400s1;
import p077d0.C11421z1;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p401pj.C29283q;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.animation.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1090b {
    /* JADX INFO: renamed from: a */
    public static final void m3346a(C11421z1 c11421z1, Function1 function1, Modifier modifier, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, InterfaceC4351m interfaceC4351m, Function3 function3, Composer composer, int i13) {
        int i14;
        Function3 function4;
        C28655q c28655q;
        C11421z1 c11421z2;
        C3753k0 c3753k0;
        C11400s1 c11400s1;
        C11400s1 c11400s2;
        C11400s1 c11400s3;
        C11400s1 c11400s4;
        C3753k0 c3753k1;
        C11400s1 c11400s5;
        boolean z4;
        C11400s1 c11400s6;
        C11400s1 c11400s1M30541c;
        AbstractC3736e1 abstractC3736e2;
        AbstractC3730c1 abstractC3730c2;
        boolean z13;
        Function3 function5;
        Function3 function6 = function3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1912839215);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(c11421z1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(abstractC3730c1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87153g(abstractC3736e1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4351m) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i15 = i14 | 1572864;
        if ((12582912 & i13) == 0) {
            i15 |= c28655q2.m87157i(function6) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (c28655q2.m87135U(i16 & 1, (4793491 & i16) != 4793490)) {
            C28633k1 c28633k1 = c11421z1.f36633d;
            AbstractC0954a abstractC0954a = c11421z1.f36630a;
            if (((Boolean) function1.invoke(c28633k1.getValue())).booleanValue() || ((Boolean) function1.invoke(abstractC0954a.mo2428y0())).booleanValue() || c11421z1.m30665g() || c11421z1.m30662d()) {
                c28655q2.m87150e0(-232323267);
                int i17 = i16 & 14;
                int i18 = i17 | 48;
                int i19 = i18 & 14;
                boolean z14 = ((i19 ^ 6) > 4 && c28655q2.m87153g(c11421z1)) || (i18 & 6) == 4;
                Object objM87133R = c28655q2.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = abstractC0954a.mo2428y0();
                    c28655q2.m87172p0(objM87133R);
                }
                if (c11421z1.m30665g()) {
                    objM87133R = abstractC0954a.mo2428y0();
                }
                c28655q2.m87150e0(1844425648);
                EnumC3771q0 enumC3771q0M3354i = m3354i(c11421z1, function1, objM87133R, c28655q2);
                c28655q2.m87173q(false);
                Object value = c11421z1.f36633d.getValue();
                c28655q2.m87150e0(1844425648);
                EnumC3771q0 enumC3771q0M3354i2 = m3354i(c11421z1, function1, value, c28655q2);
                c28655q2.m87173q(false);
                C11421z1 c11421z1M30540b = AbstractC11343d2.m30540b(c11421z1, enumC3771q0M3354i, enumC3771q0M3354i2, "EnterExitTransition", c28655q2, i19 | 3072);
                C28655q c28655q3 = c28655q2;
                InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(interfaceC4351m, c28655q3);
                AbstractC0954a abstractC0954a2 = c11421z1M30540b.f36630a;
                AbstractC0954a abstractC0954a3 = c11421z1M30540b.f36630a;
                C28633k1 c28633k2 = c11421z1M30540b.f36633d;
                Object objInvoke = interfaceC4351m.invoke(abstractC0954a2.mo2428y0(), c28633k2.getValue());
                boolean zM87153g = c28655q3.m87153g(c11421z1M30540b) | c28655q3.m87153g(interfaceC28601c1M87238F);
                Object objM87133R2 = c28655q3.m87133R();
                InterfaceC30057d interfaceC30057d = null;
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0458v(c11421z1M30540b, interfaceC28601c1M87238F, interfaceC30057d, 4);
                    c28655q3.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c1M87233A = AbstractC28683x.m87233A(c28655q3, (InterfaceC4351m) objM87133R2, objInvoke);
                Object objMo2428y0 = abstractC0954a3.mo2428y0();
                EnumC3771q0 enumC3771q0 = EnumC3771q0.f15394y;
                if (objMo2428y0 == enumC3771q0 && c28633k2.getValue() == enumC3771q0 && ((Boolean) interfaceC28601c1M87233A.getValue()).booleanValue()) {
                    c28655q3.m87150e0(-230155437);
                    z13 = false;
                    c28655q3.m87173q(false);
                    function5 = function6;
                } else {
                    c28655q3.m87150e0(-231293261);
                    boolean z15 = i17 == 4;
                    Object objM87133R3 = c28655q3.m87133R();
                    if (z15 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C3750j0();
                        c28655q3.m87172p0(objM87133R3);
                    }
                    C3750j0 c3750j0 = (C3750j0) objM87133R3;
                    C11351f2 c11351f2 = AbstractC3788w0.f15443a;
                    C11351f2 c11351f3 = AbstractC11348f.f36373o;
                    Object objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = C3780t0.f15421w;
                        c28655q3.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                    boolean zM87153g2 = c28655q3.m87153g(c11421z1M30540b);
                    Object objM87133R5 = c28655q3.m87133R();
                    if (zM87153g2 || objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(abstractC3730c1);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    if (abstractC0954a3.mo2428y0() == c28633k2.getValue() && abstractC0954a3.mo2428y0() == EnumC3771q0.f15393x) {
                        if (c11421z1M30540b.m30665g()) {
                            interfaceC28601c1.setValue(abstractC3730c1);
                        } else {
                            interfaceC28601c1.setValue(AbstractC3730c1.f15251a);
                        }
                    } else if (c28633k2.getValue() == EnumC3771q0.f15393x) {
                        interfaceC28601c1.setValue(((AbstractC3730c1) interfaceC28601c1.getValue()).m11562a(abstractC3730c1));
                    }
                    AbstractC3730c1 abstractC3730c3 = (AbstractC3730c1) interfaceC28601c1.getValue();
                    boolean zM87153g3 = c28655q3.m87153g(c11421z1M30540b);
                    Object objM87133R6 = c28655q3.m87133R();
                    if (zM87153g3 || objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(abstractC3736e1);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R6;
                    if (abstractC0954a3.mo2428y0() == c28633k2.getValue() && abstractC0954a3.mo2428y0() == EnumC3771q0.f15393x) {
                        if (c11421z1M30540b.m30665g()) {
                            interfaceC28601c2.setValue(abstractC3736e1);
                        } else {
                            interfaceC28601c2.setValue(AbstractC3736e1.f15289a);
                        }
                    } else if (c28633k2.getValue() != EnumC3771q0.f15393x) {
                        interfaceC28601c2.setValue(((AbstractC3736e1) interfaceC28601c2.getValue()).m11563a(abstractC3736e1));
                    }
                    AbstractC3736e1 abstractC3736e3 = (AbstractC3736e1) interfaceC28601c2.getValue();
                    C3784u1 c3784u1 = ((C3733d1) abstractC3730c3).f15271b;
                    C3753k0 c3753k2 = c3784u1.f15432c;
                    boolean z16 = (c3784u1.f15431b == null && ((C3739f1) abstractC3736e3).f15302c.f15431b == null) ? false : true;
                    boolean z17 = (c3753k2 == null && ((C3739f1) abstractC3736e3).f15302c.f15432c == null) ? false : true;
                    if (z16) {
                        c28655q3.m87150e0(133838277);
                        Object objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = "Built-in slide";
                            c28655q3.m87172p0("Built-in slide");
                        }
                        String str = (String) objM87133R7;
                        c3753k0 = c3753k2;
                        c11400s1 = null;
                        c11421z2 = c11421z1M30540b;
                        C11400s1 c11400s1M30541c2 = AbstractC11343d2.m30541c(c11421z2, c11351f3, str, c28655q3, 384, 0);
                        c28655q3.m87173q(false);
                        c11400s2 = c11400s1M30541c2;
                    } else {
                        c11421z2 = c11421z1M30540b;
                        c3753k0 = c3753k2;
                        c11400s1 = null;
                        c28655q3.m87150e0(133944080);
                        c28655q3.m87173q(false);
                        c11400s2 = null;
                    }
                    if (z17) {
                        c28655q3.m87150e0(134035871);
                        C11351f2 c11351f4 = AbstractC11348f.f36374p;
                        Object objM87133R8 = c28655q3.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = "Built-in shrink/expand";
                            c28655q3.m87172p0("Built-in shrink/expand");
                        }
                        C11400s1 c11400s1M30541c3 = AbstractC11343d2.m30541c(c11421z2, c11351f4, (String) objM87133R8, c28655q3, 384, 0);
                        c28655q3.m87173q(false);
                        c11400s3 = c11400s1M30541c3;
                    } else {
                        c28655q3.m87150e0(134146695);
                        c28655q3.m87173q(false);
                        c11400s3 = c11400s1;
                    }
                    if (z17) {
                        c28655q3.m87150e0(134220321);
                        Object objM87133R9 = c28655q3.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = "Built-in InterruptionHandlingOffset";
                            c28655q3.m87172p0("Built-in InterruptionHandlingOffset");
                        }
                        C11400s1 c11400s1M30541c4 = AbstractC11343d2.m30541c(c11421z2, c11351f3, (String) objM87133R9, c28655q3, 384, 0);
                        c28655q3.m87173q(false);
                        c11400s4 = c11400s1M30541c4;
                    } else {
                        c28655q3.m87150e0(134390727);
                        c28655q3.m87173q(false);
                        c11400s4 = c11400s1;
                    }
                    boolean z18 = ((c3753k0 == null || c3753k0.f15344d) && ((c3753k1 = ((C3739f1) abstractC3736e3).f15302c.f15432c) == null || c3753k1.f15344d) && z17) ? false : true;
                    C11351f2 c11351f5 = AbstractC11348f.f36367i;
                    boolean z19 = (c3784u1.f15430a == null && ((C3739f1) abstractC3736e3).f15302c.f15430a == null) ? false : true;
                    boolean z24 = (c3784u1.f15433d == null && ((C3739f1) abstractC3736e3).f15302c.f15433d == null) ? false : true;
                    if (z19) {
                        c28655q3.m87150e0(-703859581);
                        Object objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = "Built-in alpha";
                            c28655q3.m87172p0("Built-in alpha");
                        }
                        C11400s1 c11400s1M30541c5 = AbstractC11343d2.m30541c(c11421z2, c11351f5, (String) objM87133R10, c28655q3, 384, 0);
                        c28655q3.m87173q(false);
                        c11400s5 = c11400s1M30541c5;
                    } else {
                        c28655q3.m87150e0(-703690136);
                        c28655q3.m87173q(false);
                        c11400s5 = c11400s1;
                    }
                    if (z24) {
                        c28655q3.m87150e0(-703622493);
                        Object objM87133R11 = c28655q3.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = "Built-in scale";
                            c28655q3.m87172p0("Built-in scale");
                        }
                        C11400s1 c11400s1M30541c6 = AbstractC11343d2.m30541c(c11421z2, c11351f5, (String) objM87133R11, c28655q3, 384, 0);
                        z4 = false;
                        c28655q3.m87173q(false);
                        c11400s6 = c11400s1M30541c6;
                    } else {
                        z4 = false;
                        c28655q3.m87150e0(-703453048);
                        c28655q3.m87173q(false);
                        c11400s6 = c11400s1;
                    }
                    if (z24) {
                        c28655q3.m87150e0(-703375392);
                        c11400s1M30541c = AbstractC11343d2.m30541c(c11421z2, AbstractC3788w0.f15443a, "TransformOriginInterruptionHandling", c28655q3, 384, 0);
                        c28655q3.m87173q(z4);
                    } else {
                        c28655q3.m87150e0(-703203064);
                        c28655q3.m87173q(z4);
                        c11400s1M30541c = c11400s1;
                    }
                    boolean zM87157i = c28655q3.m87157i(c11400s5) | c28655q3.m87153g(abstractC3730c3) | c28655q3.m87153g(abstractC3736e3) | c28655q3.m87157i(c11400s6) | c28655q3.m87153g(c11421z2) | c28655q3.m87157i(c11400s1M30541c);
                    Object objM87133R12 = c28655q3.m87133R();
                    if (zM87157i || objM87133R12 == c28676v0) {
                        objM87133R12 = new C3774r0(c11400s5, c11400s6, c11421z2, abstractC3730c3, abstractC3736e3, c11400s1M30541c);
                        abstractC3736e2 = abstractC3736e3;
                        abstractC3730c2 = abstractC3730c3;
                        c28655q3.m87172p0(objM87133R12);
                    } else {
                        abstractC3730c2 = abstractC3730c3;
                        abstractC3736e2 = abstractC3736e3;
                    }
                    C3774r0 c3774r0 = (C3774r0) objM87133R12;
                    boolean zM87155h = c28655q3.m87155h(z18) | c28655q3.m87153g(interfaceC4339a);
                    Object objM87133R13 = c28655q3.m87133R();
                    if (zM87155h || objM87133R13 == c28676v0) {
                        objM87133R13 = new C3783u0(interfaceC4339a, z18);
                        c28655q3.m87172p0(objM87133R13);
                    }
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierMo3471e = AbstractC1127a.m3486a(c2314t, (Function1) objM87133R13).mo3471e(new EnterExitTransitionElement(c11421z2, c11400s3, c11400s4, c11400s2, abstractC3730c2, abstractC3736e2, interfaceC4339a, c3774r0));
                    c28655q3.m87150e0(-7429769);
                    c28655q3.m87173q(false);
                    Modifier modifierMo3471e2 = modifier.mo3471e(modifierMo3471e.mo3471e(c2314t));
                    Object objM87133R14 = c28655q3.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C3791y(c3750j0);
                        c28655q3.m87172p0(objM87133R14);
                    }
                    C3791y c3791y = (C3791y) objM87133R14;
                    int iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e2);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c3791y);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                    Function3 function7 = function3;
                    function7.invoke(c3750j0, c28655q3, Integer.valueOf((i16 >> 18) & 112));
                    c28655q3.m87173q(true);
                    z13 = false;
                    c28655q3.m87173q(false);
                    function5 = function7;
                }
                c28655q3.m87173q(z13);
                c28655q = c28655q3;
                function4 = function5;
            } else {
                c28655q2.m87150e0(-230149485);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                function4 = function6;
            }
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
            function4 = function6;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3793z(c11421z1, function1, modifier, abstractC3730c1, abstractC3736e1, interfaceC4351m, function4, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m3347b(C11393q0 c11393q0, Modifier modifier, C3733d1 c3733d1, AbstractC3736e1 abstractC3736e1, String str, C37816b c37816b, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z4;
        AbstractC3736e1 abstractC3736e2;
        String str2;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        Object objM87133R;
        int i17;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(657024243);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c11393q0) : c28655q.m87157i(c11393q0) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87153g(c3733d1)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i15 |= i18;
            }
            i16 = i15 | 27648;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(c37816b)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i17;
            }
            if ((74899 & i16) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                C3739f1 c3739f1M11563a = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11583k(null, 15));
                C11421z1 c11421z1M30543e = AbstractC11343d2.m30543e(c11393q0, "AnimatedVisibility", c28655q, (i16 & 14) | ((i16 >> 9) & 112));
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3728c.f15233G;
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function1 = (Function1) objM87133R;
                int i24 = i16 << 3;
                m3353h(c11421z1M30543e, function1, modifier4, c3733d1, c3739f1M11563a, c37816b, c28655q, (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i16 & 458752));
                str2 = "AnimatedVisibility";
                modifier3 = modifier4;
                abstractC3736e2 = c3739f1M11563a;
            } else {
                c28655q.m87138X();
                abstractC3736e2 = abstractC3736e1;
                str2 = str;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C29283q(c11393q0, modifier3, c3733d1, abstractC3736e2, str2, c37816b, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q.m87153g(c3733d1)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        i16 = i15 | 27648;
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(c37816b)) {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i17;
        }
        if ((74899 & i16) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i19 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            C3739f1 c3739f1M11563a2 = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11583k(null, 15));
            C11421z1 c11421z1M30543e2 = AbstractC11343d2.m30543e(c11393q0, "AnimatedVisibility", c28655q, (i16 & 14) | ((i16 >> 9) & 112));
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C3728c.f15233G;
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            int i25 = i16 << 3;
            m3353h(c11421z1M30543e2, function2, modifier4, c3733d1, c3739f1M11563a2, c37816b, c28655q, (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i16 & 458752));
            str2 = "AnimatedVisibility";
            modifier3 = modifier4;
            abstractC3736e2 = c3739f1M11563a2;
        } else {
            c28655q.m87138X();
            abstractC3736e2 = abstractC3736e1;
            str2 = str;
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29283q(c11393q0, modifier3, c3733d1, abstractC3736e2, str2, c37816b, i13, i14);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3348c(C11421z1 c11421z1, Function1 function1, Modifier modifier, C3733d1 c3733d1, C3739f1 c3739f1, C37816b c37816b, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1699747442);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c11421z1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14 | 384;
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(c3733d1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87153g(c3739f1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(c37816b) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            C2314t c2314t = C2314t.f9131w;
            m3353h(c11421z1, function1, c2314t, c3733d1, c3739f1, c37816b, c28655q, i15 & 524286);
            modifier2 = c2314t;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3729c0(c11421z1, function1, modifier2, c3733d1, c3739f1, c37816b, i13, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m3349d(InterfaceC23013y interfaceC23013y, C11393q0 c11393q0, Modifier modifier, C3733d1 c3733d1, AbstractC3736e1 abstractC3736e1, String str, C37816b c37816b, Composer composer, int i13, int i14) {
        int i15;
        AbstractC3736e1 abstractC3736e2;
        int i16;
        boolean z4;
        String str2;
        AbstractC3736e1 abstractC3736e3;
        Modifier modifier2;
        C28677v1 c28677v1M87180u;
        AbstractC3736e1 abstractC3736e1M11563a;
        Object objM87133R;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1238803325);
        if ((i13 & 48) == 0) {
            i15 = ((i13 & 64) == 0 ? c28655q.m87153g(c11393q0) : c28655q.m87157i(c11393q0) ? 32 : 16) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i15 | 384;
        if ((i13 & 3072) == 0) {
            i18 |= c28655q.m87153g(c3733d1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                abstractC3736e2 = abstractC3736e1;
                i18 |= c28655q.m87153g(abstractC3736e2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i18 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(c37816b)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i16 |= i17;
            }
            if ((599185 & i16) != 599184) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i19 != 0) {
                    abstractC3736e1M11563a = AbstractC3788w0.m11584l(null, null, null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                } else {
                    abstractC3736e1M11563a = abstractC3736e2;
                }
                int i24 = i16 >> 3;
                C11421z1 c11421z1M30543e = AbstractC11343d2.m30543e(c11393q0, "AnimatedVisibility", c28655q, (i24 & 14) | ((i16 >> 12) & 112));
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3728c.f15241z;
                    c28655q.m87172p0(objM87133R);
                }
                C2314t c2314t = C2314t.f9131w;
                m3353h(c11421z1M30543e, (Function1) objM87133R, c2314t, c3733d1, abstractC3736e1M11563a, c37816b, c28655q, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i24 & 458752));
                str2 = "AnimatedVisibility";
                modifier2 = c2314t;
                abstractC3736e3 = abstractC3736e1M11563a;
            } else {
                c28655q.m87138X();
                str2 = str;
                abstractC3736e3 = abstractC3736e2;
                modifier2 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3726b0(interfaceC23013y, c11393q0, modifier2, c3733d1, abstractC3736e3, str2, c37816b, i13, i14);
            }
        }
        i18 |= 24576;
        abstractC3736e2 = abstractC3736e1;
        i16 = i18 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(c37816b)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i16 |= i17;
        }
        if ((599185 & i16) != 599184) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i19 != 0) {
                abstractC3736e1M11563a = AbstractC3788w0.m11584l(null, null, null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
            } else {
                abstractC3736e1M11563a = abstractC3736e2;
            }
            int i25 = i16 >> 3;
            C11421z1 c11421z1M30543e2 = AbstractC11343d2.m30543e(c11393q0, "AnimatedVisibility", c28655q, (i25 & 14) | ((i16 >> 12) & 112));
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C3728c.f15241z;
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t2 = C2314t.f9131w;
            m3353h(c11421z1M30543e2, (Function1) objM87133R, c2314t2, c3733d1, abstractC3736e1M11563a, c37816b, c28655q, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i25 & 458752));
            str2 = "AnimatedVisibility";
            modifier2 = c2314t2;
            abstractC3736e3 = abstractC3736e1M11563a;
        } else {
            c28655q.m87138X();
            str2 = str;
            abstractC3736e3 = abstractC3736e2;
            modifier2 = modifier;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3726b0(interfaceC23013y, c11393q0, modifier2, c3733d1, abstractC3736e3, str2, c37816b, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m3350e(InterfaceC23013y interfaceC23013y, boolean z4, Modifier modifier, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, String str, Function3 function3, Composer composer, int i13, int i14) {
        int i15;
        AbstractC3730c1 abstractC3730c2;
        int i16;
        AbstractC3736e1 abstractC3736e2;
        int i17;
        int i18;
        Function3 function4;
        boolean z13;
        Modifier modifier2;
        AbstractC3736e1 abstractC3736e3;
        String str2;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        AbstractC3730c1 abstractC3730c1M11562a;
        AbstractC3736e1 abstractC3736e1M11563a;
        Object objM87133R;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1799879339);
        if ((i13 & 48) == 0) {
            i15 = (c28655q.m87155h(z4) ? 32 : 16) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                abstractC3730c2 = abstractC3730c1;
                i15 |= c28655q.m87153g(abstractC3730c2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    abstractC3736e2 = abstractC3736e1;
                    if (c28655q.m87153g(abstractC3736e2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i15 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((1572864 & i13) == 0) {
                    function4 = function3;
                    if (c28655q.m87157i(function4)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i18 |= i19;
                } else {
                    function4 = function3;
                }
                if ((599185 & i18) != 599184) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i18 & 1, z13)) {
                    if (i24 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i25 != 0) {
                        abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11576d(null, null, 15));
                    } else {
                        abstractC3730c1M11562a = abstractC3730c2;
                    }
                    if (i16 != 0) {
                        abstractC3736e1M11563a = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11584l(null, null, null, 15));
                    } else {
                        abstractC3736e1M11563a = abstractC3736e2;
                    }
                    int i26 = i18 >> 3;
                    C11421z1 c11421z1M30544f = AbstractC11343d2.m30544f(Boolean.valueOf(z4), "AnimatedVisibility", c28655q, (i26 & 14) | ((i18 >> 12) & 112), 0);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C3728c.f15232F;
                        c28655q.m87172p0(objM87133R);
                    }
                    m3353h(c11421z1M30544f, (Function1) objM87133R, modifier3, abstractC3730c1M11562a, abstractC3736e1M11563a, function4, c28655q, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i26 & 458752));
                    abstractC3736e3 = abstractC3736e1M11563a;
                    str2 = "AnimatedVisibility";
                    abstractC3730c2 = abstractC3730c1M11562a;
                    modifier2 = modifier3;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    abstractC3736e3 = abstractC3736e2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3738f0(interfaceC23013y, z4, modifier2, abstractC3730c2, abstractC3736e3, str2, function3, i13, i14);
                }
            }
            i15 |= 24576;
            abstractC3736e2 = abstractC3736e1;
            i18 = i15 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((1572864 & i13) == 0) {
                function4 = function3;
                if (c28655q.m87157i(function4)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i18 |= i19;
            } else {
                function4 = function3;
            }
            if ((599185 & i18) != 599184) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i18 & 1, z13)) {
                if (i24 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i25 != 0) {
                    abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11576d(null, null, 15));
                } else {
                    abstractC3730c1M11562a = abstractC3730c2;
                }
                if (i16 != 0) {
                    abstractC3736e1M11563a = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11584l(null, null, null, 15));
                } else {
                    abstractC3736e1M11563a = abstractC3736e2;
                }
                int i27 = i18 >> 3;
                C11421z1 c11421z1M30544f2 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), "AnimatedVisibility", c28655q, (i27 & 14) | ((i18 >> 12) & 112), 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3728c.f15232F;
                    c28655q.m87172p0(objM87133R);
                }
                m3353h(c11421z1M30544f2, (Function1) objM87133R, modifier3, abstractC3730c1M11562a, abstractC3736e1M11563a, function4, c28655q, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i27 & 458752));
                abstractC3736e3 = abstractC3736e1M11563a;
                str2 = "AnimatedVisibility";
                abstractC3730c2 = abstractC3730c1M11562a;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                abstractC3736e3 = abstractC3736e2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3738f0(interfaceC23013y, z4, modifier2, abstractC3730c2, abstractC3736e3, str2, function3, i13, i14);
            }
        }
        i15 |= 3072;
        abstractC3730c2 = abstractC3730c1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                abstractC3736e2 = abstractC3736e1;
                if (c28655q.m87153g(abstractC3736e2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i15 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((1572864 & i13) == 0) {
                function4 = function3;
                if (c28655q.m87157i(function4)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i18 |= i19;
            } else {
                function4 = function3;
            }
            if ((599185 & i18) != 599184) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i18 & 1, z13)) {
                if (i24 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (i25 != 0) {
                    abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11576d(null, null, 15));
                } else {
                    abstractC3730c1M11562a = abstractC3730c2;
                }
                if (i16 != 0) {
                    abstractC3736e1M11563a = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11584l(null, null, null, 15));
                } else {
                    abstractC3736e1M11563a = abstractC3736e2;
                }
                int i28 = i18 >> 3;
                C11421z1 c11421z1M30544f3 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), "AnimatedVisibility", c28655q, (i28 & 14) | ((i18 >> 12) & 112), 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3728c.f15232F;
                    c28655q.m87172p0(objM87133R);
                }
                m3353h(c11421z1M30544f3, (Function1) objM87133R, modifier3, abstractC3730c1M11562a, abstractC3736e1M11563a, function4, c28655q, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i28 & 458752));
                abstractC3736e3 = abstractC3736e1M11563a;
                str2 = "AnimatedVisibility";
                abstractC3730c2 = abstractC3730c1M11562a;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                abstractC3736e3 = abstractC3736e2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3738f0(interfaceC23013y, z4, modifier2, abstractC3730c2, abstractC3736e3, str2, function3, i13, i14);
            }
        }
        i15 |= 24576;
        abstractC3736e2 = abstractC3736e1;
        i18 = i15 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((1572864 & i13) == 0) {
            function4 = function3;
            if (c28655q.m87157i(function4)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i18 |= i19;
        } else {
            function4 = function3;
        }
        if ((599185 & i18) != 599184) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i18 & 1, z13)) {
            if (i24 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            if (i25 != 0) {
                abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11576d(null, null, 15));
            } else {
                abstractC3730c1M11562a = abstractC3730c2;
            }
            if (i16 != 0) {
                abstractC3736e1M11563a = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11584l(null, null, null, 15));
            } else {
                abstractC3736e1M11563a = abstractC3736e2;
            }
            int i29 = i18 >> 3;
            C11421z1 c11421z1M30544f4 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), "AnimatedVisibility", c28655q, (i29 & 14) | ((i18 >> 12) & 112), 0);
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C3728c.f15232F;
                c28655q.m87172p0(objM87133R);
            }
            m3353h(c11421z1M30544f4, (Function1) objM87133R, modifier3, abstractC3730c1M11562a, abstractC3736e1M11563a, function4, c28655q, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i29 & 458752));
            abstractC3736e3 = abstractC3736e1M11563a;
            str2 = "AnimatedVisibility";
            abstractC3730c2 = abstractC3730c1M11562a;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            abstractC3736e3 = abstractC3736e2;
            str2 = str;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3738f0(interfaceC23013y, z4, modifier2, abstractC3730c2, abstractC3736e3, str2, function3, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m3351f(boolean z4, Modifier modifier, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, String str, Function3 function3, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        AbstractC3730c1 abstractC3730c2;
        int i17;
        int i18;
        AbstractC3736e1 abstractC3736e2;
        int i19;
        int i24;
        int i25;
        boolean z13;
        Modifier modifier3;
        AbstractC3730c1 abstractC3730c3;
        AbstractC3736e1 abstractC3736e3;
        String str2;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        AbstractC3730c1 abstractC3730c1M11562a;
        AbstractC3736e1 abstractC3736e1M11563a;
        String str3;
        Object objM87133R;
        int i26;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1448730565);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    abstractC3730c2 = abstractC3730c1;
                    if (c28655q.m87153g(abstractC3730c2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        abstractC3736e2 = abstractC3736e1;
                        if (c28655q.m87153g(abstractC3736e2)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            if (c28655q.m87153g(str)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((196608 & i13) == 0) {
                            if (c28655q.m87157i(function3)) {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i26;
                        }
                        if ((74899 & i15) != 74898) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z13)) {
                            if (i27 != 0) {
                                modifier4 = C2314t.f9131w;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i16 != 0) {
                                abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                            } else {
                                abstractC3730c1M11562a = abstractC3730c2;
                            }
                            if (i18 != 0) {
                                abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                            } else {
                                abstractC3736e1M11563a = abstractC3736e2;
                            }
                            if (i24 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            C11421z1 c11421z1M30544f = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = C3731d.f15260y;
                                c28655q.m87172p0(objM87133R);
                            }
                            Function1 function1 = (Function1) objM87133R;
                            int i28 = i15 << 3;
                            AbstractC3730c1 abstractC3730c4 = abstractC3730c1M11562a;
                            m3353h(c11421z1M30544f, function1, modifier4, abstractC3730c4, abstractC3736e1M11563a, function3, c28655q, (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168) | (i15 & 458752));
                            str2 = str3;
                            modifier3 = modifier4;
                            abstractC3730c3 = abstractC3730c4;
                            abstractC3736e3 = abstractC3736e1M11563a;
                        } else {
                            c28655q.m87138X();
                            modifier3 = modifier2;
                            abstractC3730c3 = abstractC3730c2;
                            abstractC3736e3 = abstractC3736e2;
                            str2 = str;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                        }
                    }
                    i15 |= 24576;
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i26;
                    }
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        if (i27 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                        } else {
                            abstractC3730c1M11562a = abstractC3730c2;
                        }
                        if (i18 != 0) {
                            abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                        } else {
                            abstractC3736e1M11563a = abstractC3736e2;
                        }
                        if (i24 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        C11421z1 c11421z1M30544f2 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = C3731d.f15260y;
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function2 = (Function1) objM87133R;
                        int i29 = i15 << 3;
                        AbstractC3730c1 abstractC3730c5 = abstractC3730c1M11562a;
                        m3353h(c11421z1M30544f2, function2, modifier4, abstractC3730c5, abstractC3736e1M11563a, function3, c28655q, (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168) | (i15 & 458752));
                        str2 = str3;
                        modifier3 = modifier4;
                        abstractC3730c3 = abstractC3730c5;
                        abstractC3736e3 = abstractC3736e1M11563a;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        abstractC3730c3 = abstractC3730c2;
                        abstractC3736e3 = abstractC3736e2;
                        str2 = str;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                    }
                }
                i15 |= 3072;
                abstractC3736e2 = abstractC3736e1;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87153g(str)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i26;
                    }
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        if (i27 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                        } else {
                            abstractC3730c1M11562a = abstractC3730c2;
                        }
                        if (i18 != 0) {
                            abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                        } else {
                            abstractC3736e1M11563a = abstractC3736e2;
                        }
                        if (i24 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        C11421z1 c11421z1M30544f3 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = C3731d.f15260y;
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function4 = (Function1) objM87133R;
                        int i210 = i15 << 3;
                        AbstractC3730c1 abstractC3730c6 = abstractC3730c1M11562a;
                        m3353h(c11421z1M30544f3, function4, modifier4, abstractC3730c6, abstractC3736e1M11563a, function3, c28655q, (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168) | (i15 & 458752));
                        str2 = str3;
                        modifier3 = modifier4;
                        abstractC3730c3 = abstractC3730c6;
                        abstractC3736e3 = abstractC3736e1M11563a;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        abstractC3730c3 = abstractC3730c2;
                        abstractC3736e3 = abstractC3736e2;
                        str2 = str;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                    }
                }
                i15 |= 24576;
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                    } else {
                        abstractC3730c1M11562a = abstractC3730c2;
                    }
                    if (i18 != 0) {
                        abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                    } else {
                        abstractC3736e1M11563a = abstractC3736e2;
                    }
                    if (i24 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    C11421z1 c11421z1M30544f4 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C3731d.f15260y;
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function5 = (Function1) objM87133R;
                    int i211 = i15 << 3;
                    AbstractC3730c1 abstractC3730c7 = abstractC3730c1M11562a;
                    m3353h(c11421z1M30544f4, function5, modifier4, abstractC3730c7, abstractC3736e1M11563a, function3, c28655q, (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168) | (i15 & 458752));
                    str2 = str3;
                    modifier3 = modifier4;
                    abstractC3730c3 = abstractC3730c7;
                    abstractC3736e3 = abstractC3736e1M11563a;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    abstractC3730c3 = abstractC3730c2;
                    abstractC3736e3 = abstractC3736e2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                }
            }
            i15 |= 384;
            abstractC3730c2 = abstractC3730c1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    abstractC3736e2 = abstractC3736e1;
                    if (c28655q.m87153g(abstractC3736e2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87153g(str)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i26;
                    }
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        if (i27 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                        } else {
                            abstractC3730c1M11562a = abstractC3730c2;
                        }
                        if (i18 != 0) {
                            abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                        } else {
                            abstractC3736e1M11563a = abstractC3736e2;
                        }
                        if (i24 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        C11421z1 c11421z1M30544f5 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = C3731d.f15260y;
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function6 = (Function1) objM87133R;
                        int i212 = i15 << 3;
                        AbstractC3730c1 abstractC3730c8 = abstractC3730c1M11562a;
                        m3353h(c11421z1M30544f5, function6, modifier4, abstractC3730c8, abstractC3736e1M11563a, function3, c28655q, (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168) | (i15 & 458752));
                        str2 = str3;
                        modifier3 = modifier4;
                        abstractC3730c3 = abstractC3730c8;
                        abstractC3736e3 = abstractC3736e1M11563a;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        abstractC3730c3 = abstractC3730c2;
                        abstractC3736e3 = abstractC3736e2;
                        str2 = str;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                    }
                }
                i15 |= 24576;
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                    } else {
                        abstractC3730c1M11562a = abstractC3730c2;
                    }
                    if (i18 != 0) {
                        abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                    } else {
                        abstractC3736e1M11563a = abstractC3736e2;
                    }
                    if (i24 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    C11421z1 c11421z1M30544f6 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C3731d.f15260y;
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function7 = (Function1) objM87133R;
                    int i213 = i15 << 3;
                    AbstractC3730c1 abstractC3730c9 = abstractC3730c1M11562a;
                    m3353h(c11421z1M30544f6, function7, modifier4, abstractC3730c9, abstractC3736e1M11563a, function3, c28655q, (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168) | (i15 & 458752));
                    str2 = str3;
                    modifier3 = modifier4;
                    abstractC3730c3 = abstractC3730c9;
                    abstractC3736e3 = abstractC3736e1M11563a;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    abstractC3730c3 = abstractC3730c2;
                    abstractC3736e3 = abstractC3736e2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                }
            }
            i15 |= 3072;
            abstractC3736e2 = abstractC3736e1;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87153g(str)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                    } else {
                        abstractC3730c1M11562a = abstractC3730c2;
                    }
                    if (i18 != 0) {
                        abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                    } else {
                        abstractC3736e1M11563a = abstractC3736e2;
                    }
                    if (i24 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    C11421z1 c11421z1M30544f7 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C3731d.f15260y;
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function8 = (Function1) objM87133R;
                    int i214 = i15 << 3;
                    AbstractC3730c1 abstractC3730c10 = abstractC3730c1M11562a;
                    m3353h(c11421z1M30544f7, function8, modifier4, abstractC3730c10, abstractC3736e1M11563a, function3, c28655q, (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168) | (i15 & 458752));
                    str2 = str3;
                    modifier3 = modifier4;
                    abstractC3730c3 = abstractC3730c10;
                    abstractC3736e3 = abstractC3736e1M11563a;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    abstractC3730c3 = abstractC3730c2;
                    abstractC3736e3 = abstractC3736e2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                }
            }
            i15 |= 24576;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(function3)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                } else {
                    abstractC3730c1M11562a = abstractC3730c2;
                }
                if (i18 != 0) {
                    abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                } else {
                    abstractC3736e1M11563a = abstractC3736e2;
                }
                if (i24 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                C11421z1 c11421z1M30544f8 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3731d.f15260y;
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function9 = (Function1) objM87133R;
                int i215 = i15 << 3;
                AbstractC3730c1 abstractC3730c11 = abstractC3730c1M11562a;
                m3353h(c11421z1M30544f8, function9, modifier4, abstractC3730c11, abstractC3736e1M11563a, function3, c28655q, (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168) | (i15 & 458752));
                str2 = str3;
                modifier3 = modifier4;
                abstractC3730c3 = abstractC3730c11;
                abstractC3736e3 = abstractC3736e1M11563a;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                abstractC3730c3 = abstractC3730c2;
                abstractC3736e3 = abstractC3736e2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                abstractC3730c2 = abstractC3730c1;
                if (c28655q.m87153g(abstractC3730c2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    abstractC3736e2 = abstractC3736e1;
                    if (c28655q.m87153g(abstractC3736e2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87153g(str)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i26;
                    }
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        if (i27 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                        } else {
                            abstractC3730c1M11562a = abstractC3730c2;
                        }
                        if (i18 != 0) {
                            abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                        } else {
                            abstractC3736e1M11563a = abstractC3736e2;
                        }
                        if (i24 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        C11421z1 c11421z1M30544f9 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = C3731d.f15260y;
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function10 = (Function1) objM87133R;
                        int i216 = i15 << 3;
                        AbstractC3730c1 abstractC3730c12 = abstractC3730c1M11562a;
                        m3353h(c11421z1M30544f9, function10, modifier4, abstractC3730c12, abstractC3736e1M11563a, function3, c28655q, (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168) | (i15 & 458752));
                        str2 = str3;
                        modifier3 = modifier4;
                        abstractC3730c3 = abstractC3730c12;
                        abstractC3736e3 = abstractC3736e1M11563a;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        abstractC3730c3 = abstractC3730c2;
                        abstractC3736e3 = abstractC3736e2;
                        str2 = str;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                    }
                }
                i15 |= 24576;
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                    } else {
                        abstractC3730c1M11562a = abstractC3730c2;
                    }
                    if (i18 != 0) {
                        abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                    } else {
                        abstractC3736e1M11563a = abstractC3736e2;
                    }
                    if (i24 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    C11421z1 c11421z1M30544f10 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C3731d.f15260y;
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function11 = (Function1) objM87133R;
                    int i217 = i15 << 3;
                    AbstractC3730c1 abstractC3730c13 = abstractC3730c1M11562a;
                    m3353h(c11421z1M30544f10, function11, modifier4, abstractC3730c13, abstractC3736e1M11563a, function3, c28655q, (i217 & 57344) | (i217 & 896) | 48 | (i217 & 7168) | (i15 & 458752));
                    str2 = str3;
                    modifier3 = modifier4;
                    abstractC3730c3 = abstractC3730c13;
                    abstractC3736e3 = abstractC3736e1M11563a;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    abstractC3730c3 = abstractC3730c2;
                    abstractC3736e3 = abstractC3736e2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                }
            }
            i15 |= 3072;
            abstractC3736e2 = abstractC3736e1;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87153g(str)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                    } else {
                        abstractC3730c1M11562a = abstractC3730c2;
                    }
                    if (i18 != 0) {
                        abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                    } else {
                        abstractC3736e1M11563a = abstractC3736e2;
                    }
                    if (i24 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    C11421z1 c11421z1M30544f11 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C3731d.f15260y;
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function12 = (Function1) objM87133R;
                    int i218 = i15 << 3;
                    AbstractC3730c1 abstractC3730c14 = abstractC3730c1M11562a;
                    m3353h(c11421z1M30544f11, function12, modifier4, abstractC3730c14, abstractC3736e1M11563a, function3, c28655q, (i218 & 57344) | (i218 & 896) | 48 | (i218 & 7168) | (i15 & 458752));
                    str2 = str3;
                    modifier3 = modifier4;
                    abstractC3730c3 = abstractC3730c14;
                    abstractC3736e3 = abstractC3736e1M11563a;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    abstractC3730c3 = abstractC3730c2;
                    abstractC3736e3 = abstractC3736e2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                }
            }
            i15 |= 24576;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(function3)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                } else {
                    abstractC3730c1M11562a = abstractC3730c2;
                }
                if (i18 != 0) {
                    abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                } else {
                    abstractC3736e1M11563a = abstractC3736e2;
                }
                if (i24 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                C11421z1 c11421z1M30544f12 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3731d.f15260y;
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function13 = (Function1) objM87133R;
                int i219 = i15 << 3;
                AbstractC3730c1 abstractC3730c15 = abstractC3730c1M11562a;
                m3353h(c11421z1M30544f12, function13, modifier4, abstractC3730c15, abstractC3736e1M11563a, function3, c28655q, (i219 & 57344) | (i219 & 896) | 48 | (i219 & 7168) | (i15 & 458752));
                str2 = str3;
                modifier3 = modifier4;
                abstractC3730c3 = abstractC3730c15;
                abstractC3736e3 = abstractC3736e1M11563a;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                abstractC3730c3 = abstractC3730c2;
                abstractC3736e3 = abstractC3736e2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
            }
        }
        i15 |= 384;
        abstractC3730c2 = abstractC3730c1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                abstractC3736e2 = abstractC3736e1;
                if (c28655q.m87153g(abstractC3736e2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87153g(str)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i27 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                    } else {
                        abstractC3730c1M11562a = abstractC3730c2;
                    }
                    if (i18 != 0) {
                        abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                    } else {
                        abstractC3736e1M11563a = abstractC3736e2;
                    }
                    if (i24 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    C11421z1 c11421z1M30544f13 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C3731d.f15260y;
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function14 = (Function1) objM87133R;
                    int i2110 = i15 << 3;
                    AbstractC3730c1 abstractC3730c16 = abstractC3730c1M11562a;
                    m3353h(c11421z1M30544f13, function14, modifier4, abstractC3730c16, abstractC3736e1M11563a, function3, c28655q, (i2110 & 57344) | (i2110 & 896) | 48 | (i2110 & 7168) | (i15 & 458752));
                    str2 = str3;
                    modifier3 = modifier4;
                    abstractC3730c3 = abstractC3730c16;
                    abstractC3736e3 = abstractC3736e1M11563a;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    abstractC3730c3 = abstractC3730c2;
                    abstractC3736e3 = abstractC3736e2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
                }
            }
            i15 |= 24576;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(function3)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                } else {
                    abstractC3730c1M11562a = abstractC3730c2;
                }
                if (i18 != 0) {
                    abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                } else {
                    abstractC3736e1M11563a = abstractC3736e2;
                }
                if (i24 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                C11421z1 c11421z1M30544f14 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3731d.f15260y;
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function15 = (Function1) objM87133R;
                int i2111 = i15 << 3;
                AbstractC3730c1 abstractC3730c17 = abstractC3730c1M11562a;
                m3353h(c11421z1M30544f14, function15, modifier4, abstractC3730c17, abstractC3736e1M11563a, function3, c28655q, (i2111 & 57344) | (i2111 & 896) | 48 | (i2111 & 7168) | (i15 & 458752));
                str2 = str3;
                modifier3 = modifier4;
                abstractC3730c3 = abstractC3730c17;
                abstractC3736e3 = abstractC3736e1M11563a;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                abstractC3730c3 = abstractC3730c2;
                abstractC3736e3 = abstractC3736e2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
            }
        }
        i15 |= 3072;
        abstractC3736e2 = abstractC3736e1;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q.m87153g(str)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(function3)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i27 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
                } else {
                    abstractC3730c1M11562a = abstractC3730c2;
                }
                if (i18 != 0) {
                    abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
                } else {
                    abstractC3736e1M11563a = abstractC3736e2;
                }
                if (i24 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                C11421z1 c11421z1M30544f15 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3731d.f15260y;
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function16 = (Function1) objM87133R;
                int i2112 = i15 << 3;
                AbstractC3730c1 abstractC3730c18 = abstractC3730c1M11562a;
                m3353h(c11421z1M30544f15, function16, modifier4, abstractC3730c18, abstractC3736e1M11563a, function3, c28655q, (i2112 & 57344) | (i2112 & 896) | 48 | (i2112 & 7168) | (i15 & 458752));
                str2 = str3;
                modifier3 = modifier4;
                abstractC3730c3 = abstractC3730c18;
                abstractC3736e3 = abstractC3736e1M11563a;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                abstractC3730c3 = abstractC3730c2;
                abstractC3736e3 = abstractC3736e2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
            }
        }
        i15 |= 24576;
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(function3)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i26;
        }
        if ((74899 & i15) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i27 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11575c(null, 15));
            } else {
                abstractC3730c1M11562a = abstractC3730c2;
            }
            if (i18 != 0) {
                abstractC3736e1M11563a = AbstractC3788w0.m11583k(null, 15).m11563a(AbstractC3788w0.m11578f(null, 3));
            } else {
                abstractC3736e1M11563a = abstractC3736e2;
            }
            if (i24 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            C11421z1 c11421z1M30544f16 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), str3, c28655q, (i15 & 14) | ((i15 >> 9) & 112), 0);
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C3731d.f15260y;
                c28655q.m87172p0(objM87133R);
            }
            Function1 function17 = (Function1) objM87133R;
            int i2113 = i15 << 3;
            AbstractC3730c1 abstractC3730c19 = abstractC3730c1M11562a;
            m3353h(c11421z1M30544f16, function17, modifier4, abstractC3730c19, abstractC3736e1M11563a, function3, c28655q, (i2113 & 57344) | (i2113 & 896) | 48 | (i2113 & 7168) | (i15 & 458752));
            str2 = str3;
            modifier3 = modifier4;
            abstractC3730c3 = abstractC3730c19;
            abstractC3736e3 = abstractC3736e1M11563a;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            abstractC3730c3 = abstractC3730c2;
            abstractC3736e3 = abstractC3736e2;
            str2 = str;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3732d0(z4, modifier3, abstractC3730c3, abstractC3736e3, str2, function3, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m3352g(boolean z4, Modifier modifier, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, String str, C37816b c37816b, Composer composer, int i13, int i14) {
        int i15;
        AbstractC3730c1 abstractC3730c1M11562a;
        int i16;
        AbstractC3736e1 abstractC3736e2;
        int i17;
        int i18;
        boolean z13;
        Modifier modifier2;
        AbstractC3730c1 abstractC3730c2;
        AbstractC3736e1 abstractC3736e3;
        String str2;
        C28677v1 c28677v1M87180u;
        AbstractC3736e1 abstractC3736e1M11563a;
        Object objM87133R;
        int i19;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(234057107);
        if ((i13 & 48) == 0) {
            i15 = (c28655q.m87155h(z4) ? 32 : 16) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i15 | 384;
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                abstractC3730c1M11562a = abstractC3730c1;
                i24 |= c28655q.m87153g(abstractC3730c1M11562a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    abstractC3736e2 = abstractC3736e1;
                    if (c28655q.m87153g(abstractC3736e2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i24 |= i17;
                }
                i18 = i24 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(c37816b)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i18 |= i19;
                }
                if ((599185 & i18) != 599184) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i18 & 1, z13)) {
                    if (i25 != 0) {
                        abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11573a(null, null, 15));
                    }
                    AbstractC3730c1 abstractC3730c3 = abstractC3730c1M11562a;
                    if (i16 != 0) {
                        abstractC3736e1M11563a = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11581i());
                    } else {
                        abstractC3736e1M11563a = abstractC3736e2;
                    }
                    int i26 = i18 >> 3;
                    str2 = "AnimatedVisibility";
                    C11421z1 c11421z1M30544f = AbstractC11343d2.m30544f(Boolean.valueOf(z4), "AnimatedVisibility", c28655q, (i26 & 14) | ((i18 >> 12) & 112), 0);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C3728c.f15231E;
                        c28655q.m87172p0(objM87133R);
                    }
                    C2314t c2314t = C2314t.f9131w;
                    m3353h(c11421z1M30544f, (Function1) objM87133R, c2314t, abstractC3730c3, abstractC3736e1M11563a, c37816b, c28655q, (i18 & 896) | 48 | (i18 & 7168) | (i18 & 57344) | (458752 & i26));
                    modifier2 = c2314t;
                    abstractC3730c2 = abstractC3730c3;
                    abstractC3736e3 = abstractC3736e1M11563a;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    abstractC3730c2 = abstractC3730c1M11562a;
                    abstractC3736e3 = abstractC3736e2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3735e0(z4, modifier2, abstractC3730c2, abstractC3736e3, str2, c37816b, i13, i14);
                }
            }
            i24 |= 24576;
            abstractC3736e2 = abstractC3736e1;
            i18 = i24 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(c37816b)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i18 |= i19;
            }
            if ((599185 & i18) != 599184) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i18 & 1, z13)) {
                if (i25 != 0) {
                    abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11573a(null, null, 15));
                }
                AbstractC3730c1 abstractC3730c4 = abstractC3730c1M11562a;
                if (i16 != 0) {
                    abstractC3736e1M11563a = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11581i());
                } else {
                    abstractC3736e1M11563a = abstractC3736e2;
                }
                int i27 = i18 >> 3;
                str2 = "AnimatedVisibility";
                C11421z1 c11421z1M30544f2 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), "AnimatedVisibility", c28655q, (i27 & 14) | ((i18 >> 12) & 112), 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3728c.f15231E;
                    c28655q.m87172p0(objM87133R);
                }
                C2314t c2314t2 = C2314t.f9131w;
                m3353h(c11421z1M30544f2, (Function1) objM87133R, c2314t2, abstractC3730c4, abstractC3736e1M11563a, c37816b, c28655q, (i18 & 896) | 48 | (i18 & 7168) | (i18 & 57344) | (458752 & i27));
                modifier2 = c2314t2;
                abstractC3730c2 = abstractC3730c4;
                abstractC3736e3 = abstractC3736e1M11563a;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                abstractC3730c2 = abstractC3730c1M11562a;
                abstractC3736e3 = abstractC3736e2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3735e0(z4, modifier2, abstractC3730c2, abstractC3736e3, str2, c37816b, i13, i14);
            }
        }
        i24 = i15 | 3456;
        abstractC3730c1M11562a = abstractC3730c1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                abstractC3736e2 = abstractC3736e1;
                if (c28655q.m87153g(abstractC3736e2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i24 |= i17;
            }
            i18 = i24 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(c37816b)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i18 |= i19;
            }
            if ((599185 & i18) != 599184) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i18 & 1, z13)) {
                if (i25 != 0) {
                    abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11573a(null, null, 15));
                }
                AbstractC3730c1 abstractC3730c5 = abstractC3730c1M11562a;
                if (i16 != 0) {
                    abstractC3736e1M11563a = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11581i());
                } else {
                    abstractC3736e1M11563a = abstractC3736e2;
                }
                int i28 = i18 >> 3;
                str2 = "AnimatedVisibility";
                C11421z1 c11421z1M30544f3 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), "AnimatedVisibility", c28655q, (i28 & 14) | ((i18 >> 12) & 112), 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C3728c.f15231E;
                    c28655q.m87172p0(objM87133R);
                }
                C2314t c2314t3 = C2314t.f9131w;
                m3353h(c11421z1M30544f3, (Function1) objM87133R, c2314t3, abstractC3730c5, abstractC3736e1M11563a, c37816b, c28655q, (i18 & 896) | 48 | (i18 & 7168) | (i18 & 57344) | (458752 & i28));
                modifier2 = c2314t3;
                abstractC3730c2 = abstractC3730c5;
                abstractC3736e3 = abstractC3736e1M11563a;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                abstractC3730c2 = abstractC3730c1M11562a;
                abstractC3736e3 = abstractC3736e2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3735e0(z4, modifier2, abstractC3730c2, abstractC3736e3, str2, c37816b, i13, i14);
            }
        }
        i24 |= 24576;
        abstractC3736e2 = abstractC3736e1;
        i18 = i24 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(c37816b)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i18 |= i19;
        }
        if ((599185 & i18) != 599184) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i18 & 1, z13)) {
            if (i25 != 0) {
                abstractC3730c1M11562a = AbstractC3788w0.m11577e(null, 3).m11562a(AbstractC3788w0.m11573a(null, null, 15));
            }
            AbstractC3730c1 abstractC3730c6 = abstractC3730c1M11562a;
            if (i16 != 0) {
                abstractC3736e1M11563a = AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11581i());
            } else {
                abstractC3736e1M11563a = abstractC3736e2;
            }
            int i29 = i18 >> 3;
            str2 = "AnimatedVisibility";
            C11421z1 c11421z1M30544f4 = AbstractC11343d2.m30544f(Boolean.valueOf(z4), "AnimatedVisibility", c28655q, (i29 & 14) | ((i18 >> 12) & 112), 0);
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C3728c.f15231E;
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t4 = C2314t.f9131w;
            m3353h(c11421z1M30544f4, (Function1) objM87133R, c2314t4, abstractC3730c6, abstractC3736e1M11563a, c37816b, c28655q, (i18 & 896) | 48 | (i18 & 7168) | (i18 & 57344) | (458752 & i29));
            modifier2 = c2314t4;
            abstractC3730c2 = abstractC3730c6;
            abstractC3736e3 = abstractC3736e1M11563a;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            abstractC3730c2 = abstractC3730c1M11562a;
            abstractC3736e3 = abstractC3736e2;
            str2 = str;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3735e0(z4, modifier2, abstractC3730c2, abstractC3736e3, str2, c37816b, i13, i14);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m3353h(C11421z1 c11421z1, Function1 function1, Modifier modifier, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, Function3 function3, Composer composer, int i13) {
        int i14;
        AbstractC3730c1 abstractC3730c2;
        AbstractC3736e1 abstractC3736e2;
        Function3 function4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1706321816);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c11421z1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            abstractC3730c2 = abstractC3730c1;
            i14 |= c28655q.m87153g(abstractC3730c2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            abstractC3730c2 = abstractC3730c1;
        }
        if ((i13 & 24576) == 0) {
            abstractC3736e2 = abstractC3736e1;
            i14 |= c28655q.m87153g(abstractC3736e2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            abstractC3736e2 = abstractC3736e1;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            function4 = function3;
            i14 |= c28655q.m87157i(function4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            function4 = function3;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            int i15 = i14 & 112;
            int i16 = i14 & 14;
            boolean z4 = (i15 == 32) | (i16 == 4);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C3744h0(function1, c11421z1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3498b = AbstractC1131a.m3498b(modifier, (Function3) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = C3755l.f15347y;
                c28655q.m87172p0(objM87133R2);
            }
            m3346a(c11421z1, function1, modifierM3498b, abstractC3730c2, abstractC3736e2, (InterfaceC4351m) objM87133R2, function4, c28655q, 196608 | i16 | i15 | (i14 & 7168) | (57344 & i14) | ((i14 << 6) & 29360128));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3729c0(c11421z1, function1, modifier, abstractC3730c1, abstractC3736e1, function3, i13, 1);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final EnumC3771q0 m3354i(C11421z1 c11421z1, Function1 function1, Object obj, Composer composer) {
        EnumC3771q0 enumC3771q0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87144b0(-422486105, c11421z1);
        boolean zM30665g = c11421z1.m30665g();
        AbstractC0954a abstractC0954a = c11421z1.f36630a;
        if (zM30665g) {
            c28655q.m87150e0(-212146657);
            c28655q.m87173q(false);
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enumC3771q0 = EnumC3771q0.f15393x;
            } else {
                enumC3771q0 = ((Boolean) function1.invoke(abstractC0954a.mo2428y0())).booleanValue() ? EnumC3771q0.f15394y : EnumC3771q0.f15392w;
            }
        } else {
            c28655q.m87150e0(-211872524);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (((Boolean) function1.invoke(abstractC0954a.mo2428y0())).booleanValue()) {
                interfaceC28601c1.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enumC3771q0 = EnumC3771q0.f15393x;
            } else {
                enumC3771q0 = ((Boolean) interfaceC28601c1.getValue()).booleanValue() ? EnumC3771q0.f15394y : EnumC3771q0.f15392w;
            }
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return enumC3771q0;
    }
}
