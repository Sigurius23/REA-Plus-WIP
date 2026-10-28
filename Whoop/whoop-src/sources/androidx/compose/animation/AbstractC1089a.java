package androidx.compose.animation;

import al.AbstractC0954a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import java.util.ListIterator;
import m83.AbstractC25260n;
import n83.C26459b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p002a0.AbstractC0015d1;
import p002a0.C0057v0;
import p005a3.AbstractC0207h1;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2316v;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p027b3.AbstractC2453v1;
import p027b3.C2404l2;
import p040c0.C3728c;
import p040c0.C3731d;
import p040c0.C3733d1;
import p040c0.C3734e;
import p040c0.C3739f1;
import p040c0.C3749j;
import p040c0.C3752k;
import p040c0.C3756l0;
import p040c0.C3761n;
import p040c0.C3775r1;
import p040c0.C3782u;
import p040c0.C3789x;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11400s1;
import p077d0.C11421z1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p636y3.EnumC39181m;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.compose.animation.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1089a {

    /* JADX INFO: renamed from: a */
    public static final long f4472a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f4473b = 0;

    static {
        long j7 = Integer.MIN_VALUE;
        f4472a = (j7 & 4294967295L) | (j7 << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final void m3343a(C11421z1 c11421z1, Modifier modifier, Function1 function1, InterfaceC2302h interfaceC2302h, Function1 function2, InterfaceC4352n interfaceC4352n, Composer composer, int i13) {
        int i14;
        Function1 function3;
        C28655q c28655q;
        C3789x c3789x;
        C39967p c39967p;
        final C3789x c3789x2;
        final C11400s1 c11400s1M30541c;
        C28655q c28655q2;
        boolean z4;
        C11421z1 c11421z2 = c11421z1;
        Function1 function4 = function1;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(511725103);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87153g(c11421z2) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87157i(function4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q3.m87153g(interfaceC2302h) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q3.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        InterfaceC4352n interfaceC4352n2 = interfaceC4352n;
        if ((196608 & i13) == 0) {
            i14 |= c28655q3.m87157i(interfaceC4352n2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q3.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            EnumC39181m enumC39181m = (EnumC39181m) c28655q3.m87161k(AbstractC2453v1.f9575n);
            int i15 = i14 & 14;
            boolean z13 = i15 == 4;
            Object objM87133R = c28655q3.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C3789x(c11421z2, interfaceC2302h, enumC39181m);
                c28655q3.m87172p0(objM87133R);
            }
            C3789x c3789x3 = (C3789x) objM87133R;
            boolean z14 = i15 == 4;
            Object objM87133R2 = c28655q3.m87133R();
            Object obj = objM87133R2;
            if (z14 || objM87133R2 == c28676v0) {
                Object[] objArr = {c11421z2.f36630a.mo2428y0()};
                C39967p c39967p2 = new C39967p();
                c39967p2.addAll(AbstractC25260n.m74049W0(objArr));
                c28655q3.m87172p0(c39967p2);
                obj = c39967p2;
            }
            C39967p c39967p3 = (C39967p) obj;
            boolean z15 = i15 == 4;
            Object objM87133R3 = c28655q3.m87133R();
            if (z15 || objM87133R3 == c28676v0) {
                long[] jArr = AbstractC0015d1.f36a;
                objM87133R3 = new C0057v0();
                c28655q3.m87172p0(objM87133R3);
            }
            C0057v0 c0057v0 = (C0057v0) objM87133R3;
            AbstractC0954a abstractC0954a = c11421z2.f36630a;
            C28633k1 c28633k1 = c11421z2.f36633d;
            if (!c39967p3.contains(abstractC0954a.mo2428y0())) {
                c39967p3.clear();
                c39967p3.add(abstractC0954a.mo2428y0());
            }
            if (AbstractC22676k.m65745e(abstractC0954a.mo2428y0(), c28633k1.getValue())) {
                if (c39967p3.size() != 1 || !AbstractC22676k.m65745e(c39967p3.get(0), abstractC0954a.mo2428y0())) {
                    c39967p3.clear();
                    c39967p3.add(abstractC0954a.mo2428y0());
                }
                if (c0057v0.f174e != 1 || c0057v0.m125c(abstractC0954a.mo2428y0())) {
                    c0057v0.m123a();
                }
                c3789x3.f15448b = interfaceC2302h;
                c3789x3.f15449c = enumC39181m;
            }
            if (!AbstractC22676k.m65745e(abstractC0954a.mo2428y0(), c28633k1.getValue()) && !c39967p3.contains(c28633k1.getValue())) {
                ListIterator listIterator = c39967p3.listIterator();
                int i16 = 0;
                while (true) {
                    C26459b c26459b = (C26459b) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!c26459b.hasNext()) {
                        i16 = -1;
                        break;
                    } else {
                        if (AbstractC22676k.m65745e(function2.invoke(c26459b.next()), function2.invoke(c28633k1.getValue()))) {
                            break;
                        }
                        i16++;
                        listIterator = listIterator2;
                    }
                }
                if (i16 == -1) {
                    c39967p3.add(c28633k1.getValue());
                } else {
                    c39967p3.set(i16, c28633k1.getValue());
                }
            }
            if (c0057v0.m125c(c28633k1.getValue()) && c0057v0.m125c(abstractC0954a.mo2428y0())) {
                c28655q3.m87150e0(1969054067);
                c28655q3.m87173q(false);
                function3 = function4;
                c3789x = c3789x3;
            } else {
                c28655q3.m87150e0(1966468977);
                c0057v0.m123a();
                int size = c39967p3.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj2 = c39967p3.get(i17);
                    C3789x c3789x4 = c3789x3;
                    c0057v0.m135m(obj2, AbstractC37817c.m121344e(-23915175, c28655q3, new C3749j(c11421z2, obj2, function4, c3789x4, c39967p3, interfaceC4352n2)));
                    c3789x3 = c3789x4;
                    i17++;
                    function4 = function4;
                    c11421z2 = c11421z1;
                    interfaceC4352n2 = interfaceC4352n;
                }
                function3 = function4;
                c3789x = c3789x3;
                c28655q3.m87173q(false);
            }
            boolean zM87153g = c28655q3.m87153g(c11421z1.m30664f()) | c28655q3.m87153g(c3789x);
            Object objM87133R4 = c28655q3.m87133R();
            if (zM87153g || objM87133R4 == c28676v0) {
                objM87133R4 = (C3756l0) function3.invoke(c3789x);
                c28655q3.m87172p0(objM87133R4);
            }
            C3756l0 c3756l0 = (C3756l0) objM87133R4;
            C11421z1 c11421z3 = c3789x.f15447a;
            boolean zM87153g2 = c28655q3.m87153g(c3789x);
            Object objM87133R5 = c28655q3.m87133R();
            if (zM87153g2 || objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
            final InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(c3756l0.f15352d, c28655q3);
            if (AbstractC22676k.m65745e(c11421z3.f36630a.mo2428y0(), c11421z3.f36633d.getValue())) {
                interfaceC28601c1.setValue(Boolean.FALSE);
            } else if (interfaceC28601c1M87238F.getValue() != null) {
                interfaceC28601c1.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Modifier modifierM118995s = C2314t.f9131w;
            if (zBooleanValue) {
                c28655q3.m87150e0(1353180665);
                C3789x c3789x5 = c3789x;
                c39967p = c39967p3;
                C28655q c28655q4 = c28655q3;
                c3789x2 = c3789x5;
                c11400s1M30541c = AbstractC11343d2.m30541c(c3789x5.f15447a, AbstractC11348f.f36374p, null, c28655q4, 0, 2);
                boolean zM87153g3 = c28655q4.m87153g(c11400s1M30541c);
                Object objM87133R6 = c28655q4.m87133R();
                if (zM87153g3 || objM87133R6 == c28676v0) {
                    C3775r1 c3775r1 = (C3775r1) interfaceC28601c1M87238F.getValue();
                    if (c3775r1 == null || c3775r1.f15408a) {
                        modifierM118995s = AbstractC37056f.m118995s(modifierM118995s);
                    }
                    c28655q4.m87172p0(modifierM118995s);
                    objM87133R6 = modifierM118995s;
                }
                modifierM118995s = (Modifier) objM87133R6;
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            } else {
                c39967p = c39967p3;
                C28655q c28655q5 = c28655q3;
                c3789x2 = c3789x;
                c28655q5.m87150e0(1353446707);
                c28655q5.m87173q(false);
                c11400s1M30541c = null;
                c3789x2.f15452f = null;
                c28655q2 = c28655q5;
            }
            Modifier modifierMo3471e = modifier.mo3471e(modifierM118995s.mo3471e(new AbstractC0207h1(c11400s1M30541c, interfaceC28601c1M87238F, c3789x2) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierElement

                /* JADX INFO: renamed from: w */
                public final C11400s1 f4460w;

                /* JADX INFO: renamed from: x */
                public final InterfaceC28601c1 f4461x;

                /* JADX INFO: renamed from: y */
                public final C3789x f4462y;

                {
                    this.f4460w = c11400s1M30541c;
                    this.f4461x = interfaceC28601c1M87238F;
                    this.f4462y = c3789x2;
                }

                @Override // p005a3.AbstractC0207h1
                public final AbstractC2316v create() {
                    C3782u c3782u = new C3782u(0);
                    c3782u.f15423P = this.f4460w;
                    c3782u.f15424Q = this.f4461x;
                    c3782u.f15425R = this.f4462y;
                    c3782u.f15426S = AbstractC1089a.f4472a;
                    return c3782u;
                }

                public final boolean equals(Object obj3) {
                    if (!(obj3 instanceof AnimatedContentTransitionScopeImpl$SizeModifierElement)) {
                        return false;
                    }
                    AnimatedContentTransitionScopeImpl$SizeModifierElement animatedContentTransitionScopeImpl$SizeModifierElement = (AnimatedContentTransitionScopeImpl$SizeModifierElement) obj3;
                    return AbstractC22676k.m65745e(animatedContentTransitionScopeImpl$SizeModifierElement.f4460w, this.f4460w) && animatedContentTransitionScopeImpl$SizeModifierElement.f4461x.equals(this.f4461x);
                }

                public final int hashCode() {
                    int iHashCode = this.f4462y.hashCode() * 31;
                    C11400s1 c11400s1 = this.f4460w;
                    return this.f4461x.hashCode() + ((iHashCode + (c11400s1 != null ? c11400s1.hashCode() : 0)) * 31);
                }

                @Override // p005a3.AbstractC0207h1
                public final void inspectableProperties(C2404l2 c2404l2) {
                    c2404l2.m7401c("sizeTransform");
                    c2404l2.m7400b().m7292c(this.f4460w, "sizeAnimation");
                    c2404l2.m7400b().m7292c(this.f4461x, "sizeTransform");
                    c2404l2.m7400b().m7292c(this.f4462y, "scope");
                }

                @Override // p005a3.AbstractC0207h1
                public final void update(AbstractC2316v abstractC2316v) {
                    C3782u c3782u = (C3782u) abstractC2316v;
                    c3782u.f15423P = this.f4460w;
                    c3782u.f15424Q = this.f4461x;
                    c3782u.f15425R = this.f4462y;
                }
            }));
            Object objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C3761n(c3789x2);
                c28655q2.m87172p0(objM87133R7);
            }
            C3761n c3761n = (C3761n) objM87133R7;
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c3761n);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q2.m87150e0(-860173498);
            int size2 = c39967p.size();
            int i18 = 0;
            while (i18 < size2) {
                C39967p c39967p4 = c39967p;
                Object obj3 = c39967p4.get(i18);
                c28655q2.m87144b0(-2026002954, function2.invoke(obj3));
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) c0057v0.m129g(obj3);
                if (interfaceC4351m == null) {
                    c28655q2.m87150e0(1618454323);
                    z4 = false;
                } else {
                    z4 = false;
                    c28655q2.m87150e0(-2026001778);
                    interfaceC4351m.invoke(c28655q2, 0);
                }
                c28655q2.m87173q(z4);
                c28655q2.m87173q(z4);
                i18++;
                c39967p = c39967p4;
            }
            c28655q2.m87173q(false);
            c28655q2.m87173q(true);
            c28655q = c28655q2;
        } else {
            function3 = function4;
            C28655q c28655q6 = c28655q3;
            c28655q6.m87138X();
            c28655q = c28655q6;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3752k(c11421z1, modifier, function3, interfaceC2302h, function2, interfaceC4352n, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m3344b(Object obj, Modifier modifier, Function1 function1, InterfaceC2302h interfaceC2302h, String str, Function1 function2, InterfaceC4352n interfaceC4352n, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        int i19;
        String str2;
        int i24;
        int i25;
        int i26;
        boolean z4;
        InterfaceC2302h interfaceC2302h2;
        Function1 function4;
        Modifier modifier3;
        Function1 function5;
        String str3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        Object objM87133R;
        Object objM87133R2;
        int i27;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1501828832);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(obj) : c28655q.m87157i(obj) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function3 = function1;
                    if (c28655q.m87157i(function3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i15 | 3072;
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        str2 = str;
                        if (c28655q.m87153g(str2)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i18 |= i24;
                    }
                    i25 = i14 & 32;
                    if (i25 != 0) {
                        if ((196608 & i13) == 0) {
                            if (c28655q.m87157i(function2)) {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i18 |= i26;
                        }
                        if ((1572864 & i13) == 0) {
                            if (c28655q.m87157i(interfaceC4352n)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i18 |= i27;
                        }
                        if ((599187 & i18) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i18 & 1, z4)) {
                            if (i28 != 0) {
                                modifier4 = C2314t.f9131w;
                            } else {
                                modifier4 = modifier2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = C3728c.f15239x;
                                    c28655q.m87172p0(objM87133R2);
                                }
                                function6 = (Function1) objM87133R2;
                            } else {
                                function6 = function3;
                            }
                            C2307m c2307m = C2299e.f9114w;
                            if (i19 != 0) {
                                str2 = "AnimatedContent";
                            }
                            if (i25 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = C3731d.f15259x;
                                    c28655q.m87172p0(objM87133R);
                                }
                                function7 = (Function1) objM87133R;
                            } else {
                                function7 = function2;
                            }
                            int i29 = i18 >> 3;
                            Function1 function8 = function7;
                            m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m, function8, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i29) | (i29 & 458752));
                            modifier3 = modifier4;
                            function5 = function6;
                            interfaceC2302h2 = c2307m;
                            function4 = function8;
                        } else {
                            c28655q.m87138X();
                            interfaceC2302h2 = interfaceC2302h;
                            function4 = function2;
                            modifier3 = modifier2;
                            function5 = function3;
                        }
                        str3 = str2;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                        }
                    }
                    i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87157i(interfaceC4352n)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i18 |= i27;
                    }
                    if ((599187 & i18) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i18 & 1, z4)) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = C3728c.f15239x;
                                c28655q.m87172p0(objM87133R2);
                            }
                            function6 = (Function1) objM87133R2;
                        } else {
                            function6 = function3;
                        }
                        C2307m c2307m2 = C2299e.f9114w;
                        if (i19 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i25 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = C3731d.f15259x;
                                c28655q.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                        } else {
                            function7 = function2;
                        }
                        int i210 = i18 >> 3;
                        Function1 function9 = function7;
                        m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m2, function9, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i210) | (i210 & 458752));
                        modifier3 = modifier4;
                        function5 = function6;
                        interfaceC2302h2 = c2307m2;
                        function4 = function9;
                    } else {
                        c28655q.m87138X();
                        interfaceC2302h2 = interfaceC2302h;
                        function4 = function2;
                        modifier3 = modifier2;
                        function5 = function3;
                    }
                    str3 = str2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                    }
                }
                i18 = i15 | 27648;
                str2 = str;
                i25 = i14 & 32;
                if (i25 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i18 |= i26;
                    }
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87157i(interfaceC4352n)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i18 |= i27;
                    }
                    if ((599187 & i18) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i18 & 1, z4)) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = C3728c.f15239x;
                                c28655q.m87172p0(objM87133R2);
                            }
                            function6 = (Function1) objM87133R2;
                        } else {
                            function6 = function3;
                        }
                        C2307m c2307m3 = C2299e.f9114w;
                        if (i19 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i25 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = C3731d.f15259x;
                                c28655q.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                        } else {
                            function7 = function2;
                        }
                        int i211 = i18 >> 3;
                        Function1 function10 = function7;
                        m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m3, function10, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i211) | (i211 & 458752));
                        modifier3 = modifier4;
                        function5 = function6;
                        interfaceC2302h2 = c2307m3;
                        function4 = function10;
                    } else {
                        c28655q.m87138X();
                        interfaceC2302h2 = interfaceC2302h;
                        function4 = function2;
                        modifier3 = modifier2;
                        function5 = function3;
                    }
                    str3 = str2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                    }
                }
                i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4352n)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i18 |= i27;
                }
                if ((599187 & i18) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = C3728c.f15239x;
                            c28655q.m87172p0(objM87133R2);
                        }
                        function6 = (Function1) objM87133R2;
                    } else {
                        function6 = function3;
                    }
                    C2307m c2307m4 = C2299e.f9114w;
                    if (i19 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C3731d.f15259x;
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    } else {
                        function7 = function2;
                    }
                    int i212 = i18 >> 3;
                    Function1 function11 = function7;
                    m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m4, function11, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i212) | (i212 & 458752));
                    modifier3 = modifier4;
                    function5 = function6;
                    interfaceC2302h2 = c2307m4;
                    function4 = function11;
                } else {
                    c28655q.m87138X();
                    interfaceC2302h2 = interfaceC2302h;
                    function4 = function2;
                    modifier3 = modifier2;
                    function5 = function3;
                }
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                }
            }
            i15 |= 384;
            function3 = function1;
            i18 = i15 | 3072;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i18 |= i24;
                }
                i25 = i14 & 32;
                if (i25 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i18 |= i26;
                    }
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87157i(interfaceC4352n)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i18 |= i27;
                    }
                    if ((599187 & i18) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i18 & 1, z4)) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = C3728c.f15239x;
                                c28655q.m87172p0(objM87133R2);
                            }
                            function6 = (Function1) objM87133R2;
                        } else {
                            function6 = function3;
                        }
                        C2307m c2307m5 = C2299e.f9114w;
                        if (i19 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i25 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = C3731d.f15259x;
                                c28655q.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                        } else {
                            function7 = function2;
                        }
                        int i213 = i18 >> 3;
                        Function1 function12 = function7;
                        m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m5, function12, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i213) | (i213 & 458752));
                        modifier3 = modifier4;
                        function5 = function6;
                        interfaceC2302h2 = c2307m5;
                        function4 = function12;
                    } else {
                        c28655q.m87138X();
                        interfaceC2302h2 = interfaceC2302h;
                        function4 = function2;
                        modifier3 = modifier2;
                        function5 = function3;
                    }
                    str3 = str2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                    }
                }
                i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4352n)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i18 |= i27;
                }
                if ((599187 & i18) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = C3728c.f15239x;
                            c28655q.m87172p0(objM87133R2);
                        }
                        function6 = (Function1) objM87133R2;
                    } else {
                        function6 = function3;
                    }
                    C2307m c2307m6 = C2299e.f9114w;
                    if (i19 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C3731d.f15259x;
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    } else {
                        function7 = function2;
                    }
                    int i214 = i18 >> 3;
                    Function1 function13 = function7;
                    m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m6, function13, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i214) | (i214 & 458752));
                    modifier3 = modifier4;
                    function5 = function6;
                    interfaceC2302h2 = c2307m6;
                    function4 = function13;
                } else {
                    c28655q.m87138X();
                    interfaceC2302h2 = interfaceC2302h;
                    function4 = function2;
                    modifier3 = modifier2;
                    function5 = function3;
                }
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                }
            }
            i18 = i15 | 27648;
            str2 = str;
            i25 = i14 & 32;
            if (i25 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i26;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4352n)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i18 |= i27;
                }
                if ((599187 & i18) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = C3728c.f15239x;
                            c28655q.m87172p0(objM87133R2);
                        }
                        function6 = (Function1) objM87133R2;
                    } else {
                        function6 = function3;
                    }
                    C2307m c2307m7 = C2299e.f9114w;
                    if (i19 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C3731d.f15259x;
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    } else {
                        function7 = function2;
                    }
                    int i215 = i18 >> 3;
                    Function1 function14 = function7;
                    m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m7, function14, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i215) | (i215 & 458752));
                    modifier3 = modifier4;
                    function5 = function6;
                    interfaceC2302h2 = c2307m7;
                    function4 = function14;
                } else {
                    c28655q.m87138X();
                    interfaceC2302h2 = interfaceC2302h;
                    function4 = function2;
                    modifier3 = modifier2;
                    function5 = function3;
                }
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                }
            }
            i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(interfaceC4352n)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i18 |= i27;
            }
            if ((599187 & i18) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = C3728c.f15239x;
                        c28655q.m87172p0(objM87133R2);
                    }
                    function6 = (Function1) objM87133R2;
                } else {
                    function6 = function3;
                }
                C2307m c2307m8 = C2299e.f9114w;
                if (i19 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C3731d.f15259x;
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                } else {
                    function7 = function2;
                }
                int i216 = i18 >> 3;
                Function1 function15 = function7;
                m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m8, function15, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i216) | (i216 & 458752));
                modifier3 = modifier4;
                function5 = function6;
                interfaceC2302h2 = c2307m8;
                function4 = function15;
            } else {
                c28655q.m87138X();
                interfaceC2302h2 = interfaceC2302h;
                function4 = function2;
                modifier3 = modifier2;
                function5 = function3;
            }
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                if (c28655q.m87157i(function3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i15 | 3072;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i18 |= i24;
                }
                i25 = i14 & 32;
                if (i25 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i18 |= i26;
                    }
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87157i(interfaceC4352n)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i18 |= i27;
                    }
                    if ((599187 & i18) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i18 & 1, z4)) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = C3728c.f15239x;
                                c28655q.m87172p0(objM87133R2);
                            }
                            function6 = (Function1) objM87133R2;
                        } else {
                            function6 = function3;
                        }
                        C2307m c2307m9 = C2299e.f9114w;
                        if (i19 != 0) {
                            str2 = "AnimatedContent";
                        }
                        if (i25 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = C3731d.f15259x;
                                c28655q.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                        } else {
                            function7 = function2;
                        }
                        int i217 = i18 >> 3;
                        Function1 function16 = function7;
                        m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m9, function16, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i217) | (i217 & 458752));
                        modifier3 = modifier4;
                        function5 = function6;
                        interfaceC2302h2 = c2307m9;
                        function4 = function16;
                    } else {
                        c28655q.m87138X();
                        interfaceC2302h2 = interfaceC2302h;
                        function4 = function2;
                        modifier3 = modifier2;
                        function5 = function3;
                    }
                    str3 = str2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                    }
                }
                i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4352n)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i18 |= i27;
                }
                if ((599187 & i18) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = C3728c.f15239x;
                            c28655q.m87172p0(objM87133R2);
                        }
                        function6 = (Function1) objM87133R2;
                    } else {
                        function6 = function3;
                    }
                    C2307m c2307m10 = C2299e.f9114w;
                    if (i19 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C3731d.f15259x;
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    } else {
                        function7 = function2;
                    }
                    int i218 = i18 >> 3;
                    Function1 function17 = function7;
                    m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m10, function17, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i218) | (i218 & 458752));
                    modifier3 = modifier4;
                    function5 = function6;
                    interfaceC2302h2 = c2307m10;
                    function4 = function17;
                } else {
                    c28655q.m87138X();
                    interfaceC2302h2 = interfaceC2302h;
                    function4 = function2;
                    modifier3 = modifier2;
                    function5 = function3;
                }
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                }
            }
            i18 = i15 | 27648;
            str2 = str;
            i25 = i14 & 32;
            if (i25 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i26;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4352n)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i18 |= i27;
                }
                if ((599187 & i18) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = C3728c.f15239x;
                            c28655q.m87172p0(objM87133R2);
                        }
                        function6 = (Function1) objM87133R2;
                    } else {
                        function6 = function3;
                    }
                    C2307m c2307m11 = C2299e.f9114w;
                    if (i19 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C3731d.f15259x;
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    } else {
                        function7 = function2;
                    }
                    int i219 = i18 >> 3;
                    Function1 function18 = function7;
                    m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m11, function18, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i219) | (i219 & 458752));
                    modifier3 = modifier4;
                    function5 = function6;
                    interfaceC2302h2 = c2307m11;
                    function4 = function18;
                } else {
                    c28655q.m87138X();
                    interfaceC2302h2 = interfaceC2302h;
                    function4 = function2;
                    modifier3 = modifier2;
                    function5 = function3;
                }
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                }
            }
            i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(interfaceC4352n)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i18 |= i27;
            }
            if ((599187 & i18) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = C3728c.f15239x;
                        c28655q.m87172p0(objM87133R2);
                    }
                    function6 = (Function1) objM87133R2;
                } else {
                    function6 = function3;
                }
                C2307m c2307m12 = C2299e.f9114w;
                if (i19 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C3731d.f15259x;
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                } else {
                    function7 = function2;
                }
                int i2110 = i18 >> 3;
                Function1 function19 = function7;
                m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m12, function19, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i2110) | (i2110 & 458752));
                modifier3 = modifier4;
                function5 = function6;
                interfaceC2302h2 = c2307m12;
                function4 = function19;
            } else {
                c28655q.m87138X();
                interfaceC2302h2 = interfaceC2302h;
                function4 = function2;
                modifier3 = modifier2;
                function5 = function3;
            }
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
            }
        }
        i15 |= 384;
        function3 = function1;
        i18 = i15 | 3072;
        i19 = i14 & 16;
        if (i19 != 0) {
            if ((i13 & 24576) == 0) {
                str2 = str;
                if (c28655q.m87153g(str2)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i18 |= i24;
            }
            i25 = i14 & 32;
            if (i25 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i26;
                }
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87157i(interfaceC4352n)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i18 |= i27;
                }
                if ((599187 & i18) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = C3728c.f15239x;
                            c28655q.m87172p0(objM87133R2);
                        }
                        function6 = (Function1) objM87133R2;
                    } else {
                        function6 = function3;
                    }
                    C2307m c2307m13 = C2299e.f9114w;
                    if (i19 != 0) {
                        str2 = "AnimatedContent";
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C3731d.f15259x;
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    } else {
                        function7 = function2;
                    }
                    int i2111 = i18 >> 3;
                    Function1 function110 = function7;
                    m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m13, function110, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i2111) | (i2111 & 458752));
                    modifier3 = modifier4;
                    function5 = function6;
                    interfaceC2302h2 = c2307m13;
                    function4 = function110;
                } else {
                    c28655q.m87138X();
                    interfaceC2302h2 = interfaceC2302h;
                    function4 = function2;
                    modifier3 = modifier2;
                    function5 = function3;
                }
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
                }
            }
            i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(interfaceC4352n)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i18 |= i27;
            }
            if ((599187 & i18) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = C3728c.f15239x;
                        c28655q.m87172p0(objM87133R2);
                    }
                    function6 = (Function1) objM87133R2;
                } else {
                    function6 = function3;
                }
                C2307m c2307m14 = C2299e.f9114w;
                if (i19 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C3731d.f15259x;
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                } else {
                    function7 = function2;
                }
                int i2112 = i18 >> 3;
                Function1 function111 = function7;
                m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m14, function111, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i2112) | (i2112 & 458752));
                modifier3 = modifier4;
                function5 = function6;
                interfaceC2302h2 = c2307m14;
                function4 = function111;
            } else {
                c28655q.m87138X();
                interfaceC2302h2 = interfaceC2302h;
                function4 = function2;
                modifier3 = modifier2;
                function5 = function3;
            }
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
            }
        }
        i18 = i15 | 27648;
        str2 = str;
        i25 = i14 & 32;
        if (i25 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(function2)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i26;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(interfaceC4352n)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i18 |= i27;
            }
            if ((599187 & i18) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = C3728c.f15239x;
                        c28655q.m87172p0(objM87133R2);
                    }
                    function6 = (Function1) objM87133R2;
                } else {
                    function6 = function3;
                }
                C2307m c2307m15 = C2299e.f9114w;
                if (i19 != 0) {
                    str2 = "AnimatedContent";
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C3731d.f15259x;
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                } else {
                    function7 = function2;
                }
                int i2113 = i18 >> 3;
                Function1 function112 = function7;
                m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m15, function112, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i2113) | (i2113 & 458752));
                modifier3 = modifier4;
                function5 = function6;
                interfaceC2302h2 = c2307m15;
                function4 = function112;
            } else {
                c28655q.m87138X();
                interfaceC2302h2 = interfaceC2302h;
                function4 = function2;
                modifier3 = modifier2;
                function5 = function3;
            }
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
            }
        }
        i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(interfaceC4352n)) {
                i27 = 1048576;
            } else {
                i27 = 524288;
            }
            i18 |= i27;
        }
        if ((599187 & i18) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i18 & 1, z4)) {
            if (i28 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = C3728c.f15239x;
                    c28655q.m87172p0(objM87133R2);
                }
                function6 = (Function1) objM87133R2;
            } else {
                function6 = function3;
            }
            C2307m c2307m16 = C2299e.f9114w;
            if (i19 != 0) {
                str2 = "AnimatedContent";
            }
            if (i25 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = C3731d.f15259x;
                    c28655q.m87172p0(objM87133R);
                }
                function7 = (Function1) objM87133R;
            } else {
                function7 = function2;
            }
            int i2114 = i18 >> 3;
            Function1 function113 = function7;
            m3343a(AbstractC11343d2.m30544f(obj, str2, c28655q, (i18 & 14) | ((i18 >> 9) & 112), 0), modifier4, function6, c2307m16, function113, interfaceC4352n, c28655q, (i18 & 8176) | (57344 & i2114) | (i2114 & 458752));
            modifier3 = modifier4;
            function5 = function6;
            interfaceC2302h2 = c2307m16;
            function4 = function113;
        } else {
            c28655q.m87138X();
            interfaceC2302h2 = interfaceC2302h;
            function4 = function2;
            modifier3 = modifier2;
            function5 = function3;
        }
        str3 = str2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3734e(obj, modifier3, function5, interfaceC2302h2, str3, function4, interfaceC4352n, i13, i14);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C3756l0 m3345c(C3733d1 c3733d1, C3739f1 c3739f1) {
        return new C3756l0(c3733d1, c3739f1, (C3775r1) null, 12);
    }
}
