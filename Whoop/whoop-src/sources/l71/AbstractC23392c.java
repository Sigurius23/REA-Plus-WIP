package l71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.Iterator;
import kd1.AbstractC22410v;
import l60.C23374a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
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
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll71/d;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Ll71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23392c {
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x011b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:76:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b A[LOOP:0: B:78:0x0185->B:80:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ee A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m67697e(Modifier modifier, final C23393d state, Function1 function1, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        final Modifier modifier3;
        final Function1 function3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C2314t c2314t;
        final Modifier modifier4;
        C28676v0 c28676v0;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Iterator<T> it;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-228528633);
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
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23374a(3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                if (state.m67703b().isEmpty()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i19 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: l71.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i19) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC23392c.m67699g(modifier4, state, function3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC23392c.m67701i(modifier4, state, function3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    Modifier modifier5 = modifier4;
                    Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier5), null, 3);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C23374a(4);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3478a = AbstractC1125a.m3478a(modifierM3427x, (Function1) objM87133R);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3478a);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    float f13 = 8;
                    float f14 = ((float) 2) * f13;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f14, 3 * f13);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    c28655q.m87150e0(-1240496923);
                    it = state.m67703b().iterator();
                    while (it.hasNext()) {
                        Function1 function4 = function3;
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function4, c28655q, (i16 << 3) & 7168, 6);
                        function3 = function4;
                    }
                    c28655q.m87173q(false);
                    if (Float.compare(state.getBottomContentInset(), 0) > 0) {
                        c28655q.m87150e0(199447683);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(state.getBottomContentInset(), c2314t));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(199536095);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i24 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: l71.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i24) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC23392c.m67699g(modifier3, state, function3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC23392c.m67701i(modifier3, state, function3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
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
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23374a(3);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            if (state.m67703b().isEmpty()) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i110 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: l71.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i110) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC23392c.m67699g(modifier4, state, function3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC23392c.m67701i(modifier4, state, function3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                Modifier modifier6 = modifier4;
                Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier6), null, 3);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C23374a(4);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3478a2 = AbstractC1125a.m3478a(modifierM3427x2, (Function1) objM87133R);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3478a2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                float f15 = 8;
                float f16 = ((float) 2) * f15;
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(c2314t, f16, 3 * f15);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), C2299e.f9110M, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                c28655q.m87150e0(-1240496923);
                it = state.m67703b().iterator();
                while (it.hasNext()) {
                    Function1 function5 = function3;
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function5, c28655q, (i16 << 3) & 7168, 6);
                    function3 = function5;
                }
                c28655q.m87173q(false);
                if (Float.compare(state.getBottomContentInset(), 0) > 0) {
                    c28655q.m87150e0(199447683);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(state.getBottomContentInset(), c2314t));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(199536095);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier6;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        modifier3 = modifier2;
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i25 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: l71.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i25) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC23392c.m67699g(modifier3, state, function3, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC23392c.m67701i(modifier3, state, function3, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m67698f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m67699g(Modifier modifier, C23393d c23393d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m67697e(modifier, c23393d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m67700h(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        AbstractC22410v.m64534c(drawBehind);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m67701i(Modifier modifier, C23393d c23393d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m67697e(modifier, c23393d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
