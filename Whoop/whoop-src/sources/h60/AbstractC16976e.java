package h60;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import f60.C14138c;
import f60.InterfaceC14136a;
import fc0.C14361e;
import h00.C16513l0;
import h02.C16576i;
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
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h60.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lf60/c$a;", "viewState", "Lkotlin/Function1;", "Lf60/a;", "Ll83/a0;", "onEvent", "j", "(Lf60/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll0/u;", "g", "(Ll0/u;Lf60/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16976e {
    /* JADX INFO: renamed from: g */
    private static final void m47743g(InterfaceC23001u interfaceC23001u, C14138c.a aVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(947388845);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (aVar.getState().getType() instanceof AbstractC33208p0.b) {
            c28655q.m87150e0(1431175332);
            boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(aVar)));
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C16975d(aVar, function1, 2);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 8;
            AbstractC14983d3.m43104a((InterfaceC4339a) objM87133R, AbstractC1099a.m3398t(interfaceC23001u.mo3400a(C2314t.f9131w, C2299e.f9114w), 1 * f13, 4 * f13, 0.0f, 0.0f, 12), false, C16972a.f65134a.m47736b(), c28655q, 24576, 12);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1431652949);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(interfaceC23001u, aVar, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m47744h(C14138c.a aVar, Function1 function1) {
        InterfaceC14136a backClickEvent = aVar.getBackClickEvent();
        if (backClickEvent != null) {
            function1.invoke(backClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m47745i(InterfaceC23001u interfaceC23001u, C14138c.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m47743g(interfaceC23001u, aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    /* JADX WARN: Code duplicated, block: B:84:0x018b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static final void m47746j(C14138c.a viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC33208p0 type;
        int i16;
        Function1 function5;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Function1 function6;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1382033905);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
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
                if (i17 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C16513l0(21);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
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
                type = viewState.getState().getType();
                if (type instanceof AbstractC33208p0.h) {
                    c28655q.m87150e0(-1159907675);
                    AbstractC33208p0.h hVar = (AbstractC33208p0.h) type;
                    if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i15 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objM87133R2 = c28655q.m87133R();
                    if (z18 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C16975d(viewState, function4, 0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    i16 = i15;
                    AbstractC33199m0.m105214F(AbstractC33208p0.h.m105313g(hVar, null, 0L, (InterfaceC4339a) objM87133R2, 3, null), viewState.getState().getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                    function6 = function4;
                } else {
                    i16 = i15;
                    function5 = function4;
                    c28655q.m87150e0(-1159898045);
                    C33211q0 state = viewState.getState();
                    if ((i16 & 14) != 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i16 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13;
                    objM87133R = c28655q.m87133R();
                    if (!z15 || objM87133R == c28676v0) {
                        function6 = function5;
                        objM87133R = new C16975d(viewState, function6, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                    }
                    Function0.m105274p(state, (InterfaceC4339a) objM87133R, null, c28655q, C33211q0.f138501k, 4);
                    c28655q.m87173q(false);
                }
                int i18 = i16 << 3;
                m47743g(C1100b.f4583a, viewState, function6, c28655q, (i18 & 896) | (i18 & 112) | 6);
                c28655q.m87173q(true);
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(viewState, i13, function3, i14, 14);
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
            if (i17 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C16513l0(21);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
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
            type = viewState.getState().getType();
            if (type instanceof AbstractC33208p0.h) {
                c28655q.m87150e0(-1159907675);
                AbstractC33208p0.h hVar2 = (AbstractC33208p0.h) type;
                if ((i15 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if ((i15 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    objM87133R2 = new C16975d(viewState, function4, 0);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C16975d(viewState, function4, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                i16 = i15;
                AbstractC33199m0.m105214F(AbstractC33208p0.h.m105313g(hVar2, null, 0L, (InterfaceC4339a) objM87133R2, 3, null), viewState.getState().getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function6 = function4;
            } else {
                i16 = i15;
                function5 = function4;
                c28655q.m87150e0(-1159898045);
                C33211q0 state2 = viewState.getState();
                if ((i16 & 14) != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    function6 = function5;
                    objM87133R = new C16975d(viewState, function6, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C16975d(viewState, function6, 1);
                    c28655q.m87172p0(objM87133R);
                }
                Function0.m105274p(state2, (InterfaceC4339a) objM87133R, null, c28655q, C33211q0.f138501k, 4);
                c28655q.m87173q(false);
            }
            int i19 = i16 << 3;
            m47743g(C1100b.f4583a, viewState, function6, c28655q, (i19 & 896) | (i19 & 112) | 6);
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(viewState, i13, function3, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m47747k(InterfaceC14136a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m47748l(C14138c.a aVar, Function1 function1) {
        InterfaceC14136a primaryClickEvent = aVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m47749m(C14138c.a aVar, Function1 function1) {
        InterfaceC14136a primaryClickEvent = aVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m47750n(C14138c.a aVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m47746j(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
