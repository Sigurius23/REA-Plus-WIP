package sg2;

import a80.C0546j;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ge3.AbstractC15751g;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17903p;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p698au1.C2059d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import rg2.C31397i;
import s51.C32205b;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sg2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u000b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"", "Lm91/u;", "childItems", "Lkotlin/Function1;", "", "Ll83/a0;", "onRecentActivityClick", "Lkotlin/Function0;", "onSearchClick", "Landroidx/compose/ui/Modifier;", "modifier", "f", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrg2/i;", "state", "onClick", "j", "(Lrg2/i;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "l", "(Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32461l {
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:0x010c  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    /* JADX WARN: Code duplicated, block: B:81:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m101366f(List<? extends InterfaceC25312u> childItems, Function1 onRecentActivityClick, InterfaceC4339a onSearchClick, Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Modifier modifier5;
        C31397i c31397i;
        boolean z16;
        boolean zM87157i;
        Object objM87133R2;
        AbstractC22676k.m65750j(childItems, "childItems");
        AbstractC22676k.m65750j(onRecentActivityClick, "onRecentActivityClick");
        AbstractC22676k.m65750j(onSearchClick, "onSearchClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1053537961);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(childItems) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onRecentActivityClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onSearchClick) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(536363644);
                for (InterfaceC25312u interfaceC25312u : childItems) {
                    z13 = interfaceC25312u instanceof C31397i;
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z13) {
                        c28655q.m87150e0(-1885004571);
                        c31397i = (C31397i) interfaceC25312u;
                        if ((i15 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87157i = c28655q.m87157i(interfaceC25312u) | z16;
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            objM87133R2 = new C32460k(onRecentActivityClick, c31397i, 0);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m101370j(c31397i, (InterfaceC4339a) objM87133R2, null, c28655q, 0, 4);
                        c28655q.m87173q(false);
                        modifier5 = modifier4;
                    } else {
                        c28655q.m87150e0(-1884998465);
                        boolean zM87157i2 = c28655q.m87157i(interfaceC25312u);
                        if ((i15 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i2 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15 || objM87133R == c28676v0) {
                            objM87133R = new C0546j(interfaceC25312u, onRecentActivityClick, 26);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function1 = (Function1) objM87133R;
                        modifier5 = modifier4;
                        C28655q c28655q2 = c28655q;
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q2, 0, 6);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    modifier4 = modifier5;
                }
                c28655q.m87173q(false);
                m101372l(onSearchClick, null, c28655q, (i15 >> 6) & 14, 2);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) childItems, onRecentActivityClick, (InterfaceC23459e) onSearchClick, modifier3, i13, i14, 25);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28655q.m87150e0(536363644);
            while (r15.hasNext()) {
                z13 = interfaceC25312u instanceof C31397i;
                C28676v0 c28676v1 = C28635l.f115821a;
                if (z13) {
                    c28655q.m87150e0(-1885004571);
                    c31397i = (C31397i) interfaceC25312u;
                    if ((i15 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i = c28655q.m87157i(interfaceC25312u) | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C32460k(onRecentActivityClick, c31397i, 0);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32460k(onRecentActivityClick, c31397i, 0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m101370j(c31397i, (InterfaceC4339a) objM87133R2, null, c28655q, 0, 4);
                    c28655q.m87173q(false);
                    modifier5 = modifier4;
                } else {
                    c28655q.m87150e0(-1884998465);
                    boolean zM87157i3 = c28655q.m87157i(interfaceC25312u);
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i3 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new C0546j(interfaceC25312u, onRecentActivityClick, 26);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C0546j(interfaceC25312u, onRecentActivityClick, 26);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function2 = (Function1) objM87133R;
                    modifier5 = modifier4;
                    C28655q c28655q3 = c28655q;
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, function2, c28655q3, 0, 6);
                    c28655q = c28655q3;
                    c28655q.m87173q(false);
                }
                modifier4 = modifier5;
            }
            c28655q.m87173q(false);
            m101372l(onSearchClick, null, c28655q, (i15 >> 6) & 14, 2);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a((Object) childItems, onRecentActivityClick, (InterfaceC23459e) onSearchClick, modifier3, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m101367g(Function1 function1, InterfaceC25312u interfaceC25312u) {
        function1.invoke(((C31397i) interfaceC25312u).getInternalName());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m101368h(InterfaceC25312u interfaceC25312u, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        String str = event instanceof String ? (String) event : null;
        if (str == null) {
            C31397i c31397i = interfaceC25312u instanceof C31397i ? (C31397i) interfaceC25312u : null;
            String strM96696b = c31397i != null ? c31397i.getInternalName() : null;
            str = strM96696b == null ? "" : strM96696b;
        }
        function1.invoke(str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m101369i(List list, Function1 function1, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m101366f(list, function1, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:61:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x018d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static final void m101370j(C31397i c31397i, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        C31397i c31397i2;
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C33252i c33252iM105489e;
        long jM125370W0;
        long jM125403k0;
        long jM51541c;
        Modifier modifierM44455h;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        String strM96695a;
        String str;
        AbstractC22403o abstractC22403oM64502k;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-182387530);
        if ((i13 & 6) == 0) {
            c31397i2 = c31397i;
            i15 = (c28655q.m87153g(c31397i2) ? 4 : 2) | i13;
        } else {
            c31397i2 = c31397i;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 4;
                c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                jM125370W0 = c38072d.m121949b(c28655q, i17).getWhite10();
                jM125403k0 = c38072d.m121949b(c28655q, i17).getStrain();
                jM51541c = C17919x.m51541c(0.15f, jM125403k0);
                long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(13 * f13, modifier4), c33252iM105489e);
                if (c31397i2.getIsSelected()) {
                    jM125370W0 = jM51541c;
                }
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, jM125370W0, c33252iM105489e);
                if (c31397i2.getIsSelected()) {
                    modifierM44455h = AbstractC15751g.m44455h(c2314t, 2, jM125403k0, c33252iM105489e);
                } else {
                    modifierM44455h = c2314t;
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3362g(modifierM3358c.mo3471e(modifierM44455h), false, null, null, interfaceC4339a, 15), "pre_session_recent_" + c31397i2.getInternalName());
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
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
                strM96695a = c31397i2.getIconUrl();
                if (AbstractC39414r.m125890i0(strM96695a)) {
                    strM96695a = null;
                }
                str = strM96695a;
                if (str != null) {
                    abstractC22403oM64502k = new AbstractC22403o.c(str, 0, 0, 0, 14, null);
                } else {
                    abstractC22403oM64502k = AbstractC22404p.m64502k(AbstractC16319p0.m46430a().getActivities().getActivity());
                }
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM64502k, null, null, c28655q, AbstractC22403o.f87638a, 3);
                C17903p c17903p = new C17903p(jM125430y, 5);
                Modifier modifierM3419p = AbstractC1102d.m3419p(7 * f13, c2314t);
                modifier3 = modifier4;
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3419p, null, null, 0.0f, c17903p, c28655q, 432, 56);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b((Object) c31397i, (InterfaceC23459e) interfaceC4339a, modifier3, i13, i14, 9);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 4;
            c33252iM105489e = AbstractC33253j.m105489e(3 * f14);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            jM125370W0 = c38072d2.m121949b(c28655q, i18).getWhite10();
            jM125403k0 = c38072d2.m121949b(c28655q, i18).getStrain();
            jM51541c = C17919x.m51541c(0.15f, jM125403k0);
            long jM125430y2 = c38072d2.m121949b(c28655q, i18).getBrandWhite();
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(13 * f14, modifier4), c33252iM105489e);
            if (c31397i2.getIsSelected()) {
                jM125370W0 = jM51541c;
            }
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM118994r2, jM125370W0, c33252iM105489e);
            if (c31397i2.getIsSelected()) {
                modifierM44455h = AbstractC15751g.m44455h(c2314t, 2, jM125403k0, c33252iM105489e);
            } else {
                modifierM44455h = c2314t;
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1092a.m3362g(modifierM3358c2.mo3471e(modifierM44455h), false, null, null, interfaceC4339a, 15), "pre_session_recent_" + c31397i2.getInternalName());
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
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
            strM96695a = c31397i2.getIconUrl();
            if (AbstractC39414r.m125890i0(strM96695a)) {
                strM96695a = null;
            }
            str = strM96695a;
            if (str != null) {
                abstractC22403oM64502k = new AbstractC22403o.c(str, 0, 0, 0, 14, null);
            } else {
                abstractC22403oM64502k = AbstractC22404p.m64502k(AbstractC16319p0.m46430a().getActivities().getActivity());
            }
            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(abstractC22403oM64502k, null, null, c28655q, AbstractC22403o.f87638a, 3);
            C17903p c17903p2 = new C17903p(jM125430y2, 5);
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(7 * f14, c2314t);
            modifier3 = modifier4;
            AbstractC29125c.m88522c(abstractC26165aM64500i2, null, modifierM3419p2, null, null, 0.0f, c17903p2, c28655q, 432, 56);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b((Object) c31397i, (InterfaceC23459e) interfaceC4339a, modifier3, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m101371k(C31397i c31397i, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m101370j(c31397i, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    private static final void m101372l(InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(159795552);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(interfaceC4339a) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(13 * f13, modifier4), c33252iM105489e);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q, i17).getBlack30(), c33252iM105489e), 2, c38072d.m121949b(c28655q, i17).getWhite20(), c33252iM105489e), false, null, null, interfaceC4339a, 15), "pre_session_search_activity_square");
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
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
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SEARCH.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(7 * f13, c2314t), c38072d.m121949b(c28655q, i17).getBrandWhite(), c28655q, 432, 0);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2059d(interfaceC4339a, modifier3, i13, i14, 8);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f14);
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(13 * f14, modifier4), c33252iM105489e2);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1092a.m3362g(AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM118994r2, c38072d2.m121949b(c28655q, i18).getBlack30(), c33252iM105489e2), 2, c38072d2.m121949b(c28655q, i18).getWhite20(), c33252iM105489e2), false, null, null, interfaceC4339a, 15), "pre_session_search_activity_square");
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.SEARCH.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(7 * f14, c2314t), c38072d2.m121949b(c28655q, i18).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2059d(interfaceC4339a, modifier3, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m101373m(InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m101372l(interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
