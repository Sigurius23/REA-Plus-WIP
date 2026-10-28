package lc0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import io2.C20769k0;
import jc0.C21604d;
import jc0.InterfaceC21601a;
import ky2.C22892a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
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
import p716lb1.C23751z2;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lc0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ljc0/d$e;", "viewState", "Lkotlin/Function1;", "Ljc0/a;", "Ll83/a0;", "onEvent", "d", "(Ljc0/d$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23824f {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x0166  */
    /* JADX WARN: Code duplicated, block: B:59:0x016f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m69959d(C21604d.e viewState, Function1 function1, Composer composer, int i13, int i14) {
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
        C21604d.c cVarM60763a;
        Object[] objArr;
        Object objM87133R;
        Function1 function5;
        boolean z13;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(826648326);
        int i16 = 2;
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(viewState) ? 4 : 2);
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
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23751z2(28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
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
                cVarM60763a = viewState.getContent();
                if (cVarM60763a instanceof C21604d.c.a) {
                    c28655q.m87150e0(-631569297);
                    AbstractC23828j.m70005o((C21604d.c.a) cVarM60763a, function4, c28655q, i15 & 112, 0);
                    c28655q.m87173q(false);
                    function5 = function4;
                    z13 = true;
                } else {
                    if (cVarM60763a == null) {
                        throw AbstractC11895b.m32003v(-1960039211, c28655q, false);
                    }
                    c28655q.m87150e0(-631375795);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, i16, 0 == true ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC16277f.f62259L1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0);
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0);
                    if ((i15 & 112) == 32) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objArr == true || objM87133R == c28676v0) {
                        objM87133R = new C22892a(function4, 17);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    int i18 = AbstractC33208p0.b.f138467h;
                    int i19 = TextResource.C8688b.f25889c;
                    function5 = function4;
                    AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, false, false, null, null, null, false, false, c28655q, i18 | (i19 << 3) | (i19 << 9), 0, 4068);
                    c28655q.m87173q(false);
                    z13 = true;
                }
                c28655q.m87173q(z13);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function3, i14, 18);
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
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23751z2(28);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM66725n2 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66725n2);
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
            cVarM60763a = viewState.getContent();
            if (cVarM60763a instanceof C21604d.c.a) {
                c28655q.m87150e0(-631569297);
                AbstractC23828j.m70005o((C21604d.c.a) cVarM60763a, function4, c28655q, i15 & 112, 0);
                c28655q.m87173q(false);
                function5 = function4;
                z13 = true;
            } else {
                if (cVarM60763a == null) {
                    throw AbstractC11895b.m32003v(-1960039211, c28655q, false);
                }
                c28655q.m87150e0(-631375795);
                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, i16, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC16277f.f62259L1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0);
                TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0);
                if ((i15 & 112) == 32) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                objM87133R = c28655q.m87133R();
                if (objArr == true) {
                    objM87133R = new C22892a(function4, 17);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C22892a(function4, 17);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                int i110 = AbstractC33208p0.b.f138467h;
                int i111 = TextResource.C8688b.f25889c;
                function5 = function4;
                AbstractC33199m0.m105214F(bVar2, c8688b3, null, c8688b4, interfaceC4339a2, false, false, null, null, null, false, false, c28655q, i110 | (i111 << 3) | (i111 << 9), 0, 4068);
                c28655q.m87173q(false);
                z13 = true;
            }
            c28655q.m87173q(z13);
            function3 = function5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function3, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69960e(InterfaceC21601a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m69961f(Function1 function1) {
        function1.invoke(InterfaceC21601a.c.f82827a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m69962g(C21604d.e eVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m69959d(eVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
