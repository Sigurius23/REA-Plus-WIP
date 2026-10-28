package t31;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l11.C23223e;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.C33192k;
import qx0.C30745a;
import r31.C30906a;
import sg2.C32469t;
import t01.C33259e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: t31.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lt31/c;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lt31/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33526b {
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:63:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m105899e(C33527c viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z14;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(669378498);
        int i18 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i18 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i15 = i14 & 4;
            i16 = 256;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i18 |= i17;
                }
                z4 = true;
                if ((i18 & 147) != 146) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i18 & 1, z13)) {
                    if (i19 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C33192k(27);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function2;
                    }
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    c28655q.m87150e0(-1396439971);
                    for (InterfaceC25312u interfaceC25312u : viewState.m105904a()) {
                        C30745a c30745a = new C30745a(15);
                        if ((i18 & 896) == i16) {
                            z14 = z4;
                        } else {
                            z14 = false;
                        }
                        zM87157i = z14 | c28655q.m87157i(viewState);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C32469t(14, function3, viewState);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, null, c30745a, (Function1) objM87133R, c28655q, 0, 2);
                        z4 = z4;
                        i16 = 256;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(z4);
                    modifier2 = modifier3;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33259e(i13, i14, 3, modifier2, function3, (InterfaceC25312u) viewState);
                }
            }
            i18 |= 384;
            function2 = function1;
            z4 = true;
            if ((i18 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i18 & 1, z13)) {
                if (i19 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33192k(27);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                c28655q.m87150e0(-1396439971);
                while (r2.hasNext()) {
                    C30745a c30745a2 = new C30745a(15);
                    if ((i18 & 896) == i16) {
                        z14 = z4;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | c28655q.m87157i(viewState);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C32469t(14, function3, viewState);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C32469t(14, function3, viewState);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, null, c30745a2, (Function1) objM87133R, c28655q, 0, 2);
                    z4 = z4;
                    i16 = 256;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(z4);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(i13, i14, 3, modifier2, function3, (InterfaceC25312u) viewState);
            }
        }
        i18 |= 48;
        modifier2 = modifier;
        i15 = i14 & 4;
        i16 = 256;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i18 |= i17;
            }
            z4 = true;
            if ((i18 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i18 & 1, z13)) {
                if (i19 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33192k(27);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier3);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                c28655q.m87150e0(-1396439971);
                while (r2.hasNext()) {
                    C30745a c30745a3 = new C30745a(15);
                    if ((i18 & 896) == i16) {
                        z14 = z4;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | c28655q.m87157i(viewState);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C32469t(14, function3, viewState);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C32469t(14, function3, viewState);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, null, c30745a3, (Function1) objM87133R, c28655q, 0, 2);
                    z4 = z4;
                    i16 = 256;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(z4);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(i13, i14, 3, modifier2, function3, (InterfaceC25312u) viewState);
            }
        }
        i18 |= 384;
        function2 = function1;
        z4 = true;
        if ((i18 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i18 & 1, z13)) {
            if (i19 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i15 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C33192k(27);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier3);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            c28655q.m87150e0(-1396439971);
            while (r2.hasNext()) {
                C30745a c30745a4 = new C30745a(15);
                if ((i18 & 896) == i16) {
                    z14 = z4;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | c28655q.m87157i(viewState);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C32469t(14, function3, viewState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C32469t(14, function3, viewState);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u, null, c30745a4, (Function1) objM87133R, c28655q, 0, 2);
                z4 = z4;
                i16 = 256;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(z4);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(i13, i14, 3, modifier2, function3, (InterfaceC25312u) viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m105900f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m105901g(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(397828170);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m105902h(Function1 function1, C33527c c33527c, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C23223e) {
            function1.invoke(new C30906a(AbstractC37056f.m118958J(Integer.valueOf(c33527c.getSelectionId())), ((C23223e) event).getPath(), c33527c.getId()));
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m105903i(C33527c c33527c, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m105899e(c33527c, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
