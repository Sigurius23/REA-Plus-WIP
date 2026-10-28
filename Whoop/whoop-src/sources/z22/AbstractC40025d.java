package z22;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC14983d3;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import vv2.C36537c;
import wb3.AbstractC37056f;
import wq1.C37508b;
import x22.C37864c;
import x22.InterfaceC37862a;
import yz1.C39913g;

/* JADX INFO: renamed from: z22.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lx22/c$b;", "viewState", "Lkotlin/Function1;", "Lx22/a;", "Ll83/a0;", "onEvent", "l", "(Lx22/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll0/u;", "i", "(Ll0/u;Lx22/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40025d {
    /* JADX INFO: renamed from: i */
    private static final void m128303i(InterfaceC23001u interfaceC23001u, C37864c.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1618964492);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(bVar) : c28655q.m87157i(bVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (!(bVar.getState().getType() instanceof AbstractC33208p0.b) || bVar.getBackClickEvent() == null) {
            c28655q.m87150e0(-1910824778);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1911301434);
            boolean z4 = ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(bVar))) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C40024c(function1, bVar);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 8;
            AbstractC14983d3.m43104a((InterfaceC4339a) objM87133R, AbstractC1099a.m3398t(interfaceC23001u.mo3400a(C2314t.f9131w, C2299e.f9114w), 1 * f13, 4 * f13, 0.0f, 0.0f, 12), false, C40022a.f172702a.m128289b(), c28655q, 24576, 12);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(interfaceC23001u, bVar, function1, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m128304j(Function1 function1, C37864c.b bVar) {
        function1.invoke(bVar.getBackClickEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m128305k(InterfaceC23001u interfaceC23001u, C37864c.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m128303i(interfaceC23001u, bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01df  */
    /* JADX WARN: Code duplicated, block: B:118:0x020d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0217  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131  */
    /* JADX WARN: Code duplicated, block: B:82:0x0183  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b4  */
    /* JADX INFO: renamed from: l */
    public static final void m128306l(C37864c.b viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C33211q0 state;
        int i18;
        Function1 function5;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        Function1 function6;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R3;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1485328503);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
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
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39913g(4);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                i16 = i15 & 14;
                if (i16 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i17 = i15 & 112;
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C40024c(viewState, function4, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(1909320630);
                state = viewState.getState();
                if (state.getType() instanceof AbstractC33208p0.h) {
                    TextResource textResourceM114676d = AbstractC36095b.m114676d(c28655q, -1159476030, state);
                    if (i16 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if (i17 == 32) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z27 | z28;
                    objM87133R4 = c28655q.m87133R();
                    if (z29 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C40024c(viewState, function4, 1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    i18 = i15;
                    z16 = false;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM114676d, 0L, (InterfaceC4339a) objM87133R4, 2, null), state.getSupportText(), null, null, null, false, false, null, null, null, false, state.getOverlayBackground(), c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 2044);
                    c28655q.m87173q(false);
                    function6 = function4;
                } else {
                    i18 = i15;
                    function5 = function4;
                    z16 = false;
                    c28655q.m87150e0(-1159086236);
                    C33211q0 state2 = viewState.getState();
                    if (i16 != 4 || ((i18 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i17 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objM87133R2 = c28655q.m87133R();
                    if (!z19 || objM87133R2 == c28676v0) {
                        function6 = function5;
                        objM87133R2 = new C40024c(viewState, function6, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function6 = function5;
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    if (i16 != 4 || ((i18 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (i17 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z24 | z25;
                    objM87133R3 = c28655q.m87133R();
                    if (z26 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C40024c(viewState, function6, 3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function0.m105274p(state2, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, C33211q0.f138501k, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z16);
                int i24 = i18 << 3;
                m128303i(C1100b.f4583a, viewState, function6, c28655q, (i24 & 896) | (i24 & 112) | 6);
                c28655q.m87173q(true);
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37508b(viewState, i13, function3, i14, 21);
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
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C39913g(4);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            i16 = i15 & 14;
            if (i16 != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            i17 = i15 & 112;
            if (i17 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C40024c(viewState, function4, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C40024c(viewState, function4, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28655q.m87150e0(1909320630);
            state = viewState.getState();
            if (state.getType() instanceof AbstractC33208p0.h) {
                TextResource textResourceM114676d2 = AbstractC36095b.m114676d(c28655q, -1159476030, state);
                if (i16 != 4) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                if (i17 == 32) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z27 | z28;
                objM87133R4 = c28655q.m87133R();
                if (z29) {
                    objM87133R4 = new C40024c(viewState, function4, 1);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C40024c(viewState, function4, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                i18 = i15;
                z16 = false;
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM114676d2, 0L, (InterfaceC4339a) objM87133R4, 2, null), state.getSupportText(), null, null, null, false, false, null, null, null, false, state.getOverlayBackground(), c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 2044);
                c28655q.m87173q(false);
                function6 = function4;
            } else {
                i18 = i15;
                function5 = function4;
                z16 = false;
                c28655q.m87150e0(-1159086236);
                C33211q0 state3 = viewState.getState();
                if (i16 != 4) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (i17 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    function6 = function5;
                    objM87133R2 = new C40024c(viewState, function6, 2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function6 = function5;
                    objM87133R2 = new C40024c(viewState, function6, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                if (i16 != 4) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (i17 == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z24 | z25;
                objM87133R3 = c28655q.m87133R();
                if (z26) {
                    objM87133R3 = new C40024c(viewState, function6, 3);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C40024c(viewState, function6, 3);
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m105274p(state3, interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, C33211q0.f138501k, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z16);
            int i25 = i18 << 3;
            m128303i(C1100b.f4583a, viewState, function6, c28655q, (i25 & 896) | (i25 & 112) | 6);
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(viewState, i13, function3, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m128307m(InterfaceC37862a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m128308n(C37864c.b bVar, Function1 function1) {
        InterfaceC37862a backClickEvent = bVar.getBackClickEvent();
        if (backClickEvent != null) {
            function1.invoke(backClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m128309o(C37864c.b bVar, Function1 function1) {
        InterfaceC37862a primaryClickEvent = bVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m128310p(C37864c.b bVar, Function1 function1) {
        InterfaceC37862a primaryClickEvent = bVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m128311q(C37864c.b bVar, Function1 function1) {
        InterfaceC37862a secondaryClickEvent = bVar.getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m128312r(C37864c.b bVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128306l(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
