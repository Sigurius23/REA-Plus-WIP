package p739ui0;

import a81.C0559j;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bj0.C3328a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.C25307p;
import p720m91.C25311t;
import p733ry2.C31919h;
import ri0.C31442a;
import ri0.InterfaceC31443b;
import u71.C34569c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ui0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lri0/a;", "footerState", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "onEvent", "", "reserveCoachFabSpace", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lri0/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "Lm91/o;", "itemWrapper", "", "e", "(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35005g {
    /* JADX INFO: renamed from: e */
    private static final void m110528e(C25306o c25306o, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1649455080);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c25306o) : c28655q.m87157i(c25306o) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C34569c(25);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            AbstractC25303l.m74290q(c25306o, C25311t.f99303a.m74328b(), null, function3, c28655q, C25306o.f99297c | (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3328a(c25306o, function2, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m110529f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m110530g(C25306o c25306o, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m110528e(c25306o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:71:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:0x0152  */
    /* JADX WARN: Code duplicated, block: B:80:0x016f  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0188  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m110531h(Modifier modifier, C31442a c31442a, Function1 onEvent, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        Modifier modifier3;
        boolean z16;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        float f13;
        float f14;
        float f15;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        boolean zM87157i;
        Object objM87133R;
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(645482525);
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
            i15 |= c28655q.m87157i(c31442a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            z14 = false;
            if ((i15 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                if (i17 != 0) {
                    z13 = false;
                }
                if (c31442a == null) {
                    c28655q.m87150e0(1001536634);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1001536635);
                    if (c31442a.m96776a().isEmpty()) {
                        c28655q.m87150e0(419834836);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(418886329);
                        Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, modifier2));
                        f13 = 2;
                        float f16 = 8;
                        f14 = f13 * f16;
                        if (z13) {
                            f15 = 90;
                        } else {
                            f15 = f14;
                        }
                        Modifier modifierM3397s = AbstractC1099a.m3397s(modifierM66722k, f14, f14, f15, 1 * f16);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
                        c28655q.m87150e0(306503582);
                        for (C25306o c25306o : c31442a.m96776a()) {
                            if ((i15 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i = z17 | c28655q.m87157i(c25306o);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i || objM87133R == C28635l.f115821a) {
                                objM87133R = new C0559j(onEvent, c25306o, 4);
                                c28655q.m87172p0(objM87133R);
                            }
                            m110528e(c25306o, (Function1) objM87133R, c28655q, C25306o.f99297c, 0);
                            AbstractC11266d.m30469w(f13, 4, c2314t, c28655q);
                        }
                        z14 = false;
                        AbstractC25012a.m73392y(c28655q, false, true, false);
                    }
                    c28655q.m87173q(z14);
                }
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            z16 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(modifier3, c31442a, onEvent, z16, i13, i14);
            }
        }
        i15 |= 3072;
        z13 = z4;
        z14 = false;
        if ((i15 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            if (i17 != 0) {
                z13 = false;
            }
            if (c31442a == null) {
                c28655q.m87150e0(1001536634);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1001536635);
                if (c31442a.m96776a().isEmpty()) {
                    c28655q.m87150e0(418886329);
                    Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, modifier2));
                    f13 = 2;
                    float f17 = 8;
                    f14 = f13 * f17;
                    if (z13) {
                        f15 = 90;
                    } else {
                        f15 = f14;
                    }
                    Modifier modifierM3397s2 = AbstractC1099a.m3397s(modifierM66722k2, f14, f14, f15, 1 * f17);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
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
                    c28655q.m87150e0(306503582);
                    while (r1.hasNext()) {
                        if ((i15 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i = z17 | c28655q.m87157i(c25306o);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R = new C0559j(onEvent, c25306o, 4);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C0559j(onEvent, c25306o, 4);
                            c28655q.m87172p0(objM87133R);
                        }
                        m110528e(c25306o, (Function1) objM87133R, c28655q, C25306o.f99297c, 0);
                        AbstractC11266d.m30469w(f13, 4, c2314t, c28655q);
                    }
                    z14 = false;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                } else {
                    c28655q.m87150e0(419834836);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
            }
        } else {
            c28655q.m87138X();
        }
        modifier3 = modifier2;
        z16 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(modifier3, c31442a, onEvent, z16, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m110532i(Function1 function1, C25306o c25306o, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new InterfaceC31443b.j(event, c25306o.getState()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m110533j(Modifier modifier, C31442a c31442a, Function1 function1, boolean z4, int i13, int i14, Composer composer, int i15) {
        m110531h(modifier, c31442a, function1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
