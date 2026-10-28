package xq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import java.util.Iterator;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import w71.C36891k;
import wb3.AbstractC37056f;
import wq2.AbstractC37514c;
import xl0.C38448b;

/* JADX INFO: renamed from: xq2.r */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lxq2/s;", "state", "Lm91/p;", "itemViewFactory", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lxq2/s;Lm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38587r {
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[PHI: r0 r1 r4
      0x00a6: PHI (r0v12 m91.p) = (r0v2 m91.p), (r0v0 m91.p) binds: [B:65:0x00b9, B:57:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r1v9 androidx.compose.ui.Modifier) = (r1v6 androidx.compose.ui.Modifier), (r1v11 androidx.compose.ui.Modifier) binds: [B:65:0x00b9, B:57:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r4v17 int) = (r4v13 int), (r4v18 int) binds: [B:65:0x00b9, B:57:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d A[LOOP:0: B:80:0x0147->B:82:0x014d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x016d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m123764c(Modifier modifier, C38589s state, C25307p c25307p, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C25307p c25307p2;
        C28677v1 c28677v1M87180u;
        Object objM87133R;
        C25307p c25307p3;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Iterator<T> it;
        int i16;
        C25307p c25307pM120293b = c25307p;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(135897753);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) != 0) {
                i16 = 128;
            } else {
                if ((i13 & 512) == 0 ? c28655q.m87153g(c25307pM120293b) : c28655q.m87157i(c25307pM120293b)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
            }
            i15 |= i16;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if (i17 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        c25307pM120293b = AbstractC37514c.m120293b();
                        i15 &= -897;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C38448b(6);
                            c28655q.m87172p0(objM87133R);
                        }
                        c25307p3 = c25307pM120293b;
                        function4 = (Function1) objM87133R;
                    }
                    c28655q.m87175r();
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier3), 0.0f, 3 * 8, 1);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
                    c28655q.m87150e0(-1449071380);
                    it = state.m123771a().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), c25307p3, null, function4, c28655q, (i15 & 7168) | (C25307p.f99300b << 3) | ((i15 >> 3) & 112), 4);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c25307p2 = c25307p3;
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    modifier3 = modifier2;
                }
                function4 = function2;
                c25307p3 = c25307pM120293b;
                c28655q.m87175r();
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier3), 0.0f, 3 * 8, 1);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
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
                c28655q.m87150e0(-1449071380);
                it = state.m123771a().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), c25307p3, null, function4, c28655q, (i15 & 7168) | (C25307p.f99300b << 3) | ((i15 >> 3) & 112), 4);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c25307p2 = c25307p3;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c25307p2 = c25307pM120293b;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(modifier3, (Object) state, (Object) c25307p2, (Object) function3, i13, i14, 8);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    c25307pM120293b = AbstractC37514c.m120293b();
                    i15 &= -897;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C38448b(6);
                        c28655q.m87172p0(objM87133R);
                    }
                    c25307p3 = c25307pM120293b;
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                    c25307p3 = c25307pM120293b;
                }
            } else {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    c25307pM120293b = AbstractC37514c.m120293b();
                    i15 &= -897;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C38448b(6);
                        c28655q.m87172p0(objM87133R);
                    }
                    c25307p3 = c25307pM120293b;
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                    c25307p3 = c25307pM120293b;
                }
            }
            c28655q.m87175r();
            Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier3), 0.0f, 3 * 8, 1);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
            c28655q.m87150e0(-1449071380);
            it = state.m123771a().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), c25307p3, null, function4, c28655q, (i15 & 7168) | (C25307p.f99300b << 3) | ((i15 >> 3) & 112), 4);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            c25307p2 = c25307p3;
            function3 = function4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c25307p2 = c25307pM120293b;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier3, (Object) state, (Object) c25307p2, (Object) function3, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m123765d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m123766e(Modifier modifier, C38589s c38589s, C25307p c25307p, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m123764c(modifier, c38589s, c25307p, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
