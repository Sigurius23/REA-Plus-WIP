package ck1;

import a31.C0343e;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c41.C4007d1;
import c93.InterfaceC4339a;
import cj0.C4744f;
import cj2.C4769a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import hy0.AbstractC17808z1;
import hy0.C17723a2;
import hy0.EnumC17727b2;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import java.io.IOException;
import l83.C23454a0;
import ny0.C27273p0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23245b0;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23267m0;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ck1.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lck1/n;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onDismissRequest", "Lkotlin/Function1;", "Lcom/whoop/navigation/e;", "onSecondaryButtonClick", "g", "(Lck1/n;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll3/g;", "n", "(Lck1/n;Landroidx/compose/runtime/Composer;I)Ll3/g;", "health-monitor_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4790m {
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:78:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m15128g(C4791n viewState, InterfaceC4339a onDismissRequest, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C27273p0 c27273p0M15139d;
        InterfaceC4339a interfaceC4339a;
        TextResource textResourceM82267m;
        C27273p0 c27273p0M15139d2;
        C9598e c9598eM82264j;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onDismissRequest, "onDismissRequest");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1502055235);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onDismissRequest) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4769a(14);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                C17723a2 c17723a2M51179g = AbstractC17808z1.m51179g(viewState.getTrendType(), c28655q2, 0);
                EnumC21213p enumC21213p = EnumC21213p.START_ICON;
                int i17 = TextResource.$stable;
                C23254g c23254gM15135n = m15135n(viewState, c28655q2, C27273p0.f109116o | i17 | (i15 & 14));
                c27273p0M15139d = viewState.getSecondaryButton();
                interfaceC4339a = null;
                if (c27273p0M15139d != null) {
                    textResourceM82267m = c27273p0M15139d.getText();
                } else {
                    textResourceM82267m = null;
                }
                c27273p0M15139d2 = viewState.getSecondaryButton();
                if (c27273p0M15139d2 != null) {
                    c9598eM82264j = c27273p0M15139d2.getNavigationAction();
                } else {
                    c9598eM82264j = null;
                }
                if (c9598eM82264j == null) {
                    c28655q2.m87150e0(-1536251976);
                } else {
                    c28655q2.m87150e0(-1536251975);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q2.m87157i(c9598eM82264j);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C4789l(function4, c9598eM82264j, 0);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a = (InterfaceC4339a) objM87133R;
                }
                c28655q2.m87173q(false);
                if (interfaceC4339a == null) {
                    c28655q2.m87150e0(-1536211427);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4744f(8);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a = (InterfaceC4339a) objM87133R3;
                } else {
                    c28655q2.m87150e0(366084092);
                }
                c28655q2.m87173q(false);
                InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
                z14 = (i15 & 112) == 32;
                objM87133R2 = c28655q2.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0343e(onDismissRequest, 10);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q = c28655q2;
                AbstractC21211n.m59497o(null, null, null, null, true, null, null, null, null, textResourceM82267m, null, false, false, enumC21213p, null, false, 0, null, c23254gM15135n, null, false, null, (InterfaceC4339a) objM87133R2, interfaceC4339a2, null, null, AbstractC37817c.m121344e(-1649658158, c28655q2, new C0003a0(14, viewState, c17723a2M51179g)), null, c28655q, (i17 << 27) | 24576, 12585984, 1572864, 188341743);
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(viewState, onDismissRequest, function3, i13, i14, 11);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C4769a(14);
                    c28655q2.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            C17723a2 c17723a2M51179g2 = AbstractC17808z1.m51179g(viewState.getTrendType(), c28655q2, 0);
            EnumC21213p enumC21213p2 = EnumC21213p.START_ICON;
            int i18 = TextResource.$stable;
            C23254g c23254gM15135n2 = m15135n(viewState, c28655q2, C27273p0.f109116o | i18 | (i15 & 14));
            c27273p0M15139d = viewState.getSecondaryButton();
            interfaceC4339a = null;
            if (c27273p0M15139d != null) {
                textResourceM82267m = c27273p0M15139d.getText();
            } else {
                textResourceM82267m = null;
            }
            c27273p0M15139d2 = viewState.getSecondaryButton();
            if (c27273p0M15139d2 != null) {
                c9598eM82264j = c27273p0M15139d2.getNavigationAction();
            } else {
                c9598eM82264j = null;
            }
            if (c9598eM82264j == null) {
                c28655q2.m87150e0(-1536251976);
            } else {
                c28655q2.m87150e0(-1536251975);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q2.m87157i(c9598eM82264j);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new C4789l(function4, c9598eM82264j, 0);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C4789l(function4, c9598eM82264j, 0);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R;
            }
            c28655q2.m87173q(false);
            if (interfaceC4339a == null) {
                c28655q2.m87150e0(-1536211427);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C4744f(8);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R3;
            } else {
                c28655q2.m87150e0(366084092);
            }
            c28655q2.m87173q(false);
            InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
            if ((i15 & 112) == 32) {
            }
            objM87133R2 = c28655q2.m87133R();
            if (z14) {
                objM87133R2 = new C0343e(onDismissRequest, 10);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C0343e(onDismissRequest, 10);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, null, null, null, true, null, null, null, null, textResourceM82267m, null, false, false, enumC21213p2, null, false, 0, null, c23254gM15135n2, null, false, null, (InterfaceC4339a) objM87133R2, interfaceC4339a3, null, null, AbstractC37817c.m121344e(-1649658158, c28655q2, new C0003a0(14, viewState, c17723a2M51179g2)), null, c28655q, (i18 << 27) | 24576, 12585984, 1572864, 188341743);
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(viewState, onDismissRequest, function3, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m15129h(C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m15130i(Function1 function1, C9598e c9598e) {
        function1.invoke(c9598e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m15131j() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m15132k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m15133l(C4791n c4791n, C17723a2 c17723a2, Composer composer, int i13) throws XmlPullParserException, IOException {
        ?? r10;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c4791n.getIcon(), c28655q, 6);
            Modifier modifierM3415l = AbstractC1102d.m3415l(32, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3415l, c38072d.m121949b(c28655q, i14).getWhite50(), c28655q, 432, 0);
            float f13 = 12;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (c4791n.getTrendType() != EnumC17727b2.NEUTRAL) {
                c28655q.m87150e0(-271088514);
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(24, c2314t), AbstractC33253j.m105489e(2)), c17723a2.getBackgroundColor(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                Integer numM50727f = c17723a2.getIconResource();
                if (numM50727f == null) {
                    c28655q.m87150e0(1932420212);
                    z4 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1932420213);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(numM50727f.intValue(), c28655q, 6), null, AbstractC1102d.m3415l(f13, c2314t), c17723a2.getIconColor(), c28655q, 432, 0);
                    z4 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                AbstractC25012a.m73389v(c2314t, 10, c28655q, z4);
                r10 = z4;
            } else {
                r10 = 0;
                c28655q.m87150e0(-269927626);
                c28655q.m87173q(false);
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, r10);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i14).getH4();
            TextResource textResourceM15141f = c4791n.getTrendTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM15141f, c28655q, i15);
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4791n.getTrendSubTitle(), c28655q, i15), null, c17723a2.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 0, i16, 196602);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m15134m(C4791n c4791n, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m15128g(c4791n, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final C23254g m15135n(C4791n c4791n, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(441918466);
        C23248d c23248d = new C23248d();
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        long jM125385c1 = c38072d.m121949b(c28655q, i14).getWhite70();
        C2886a c2886aM8420a = c38072d.m121952e(c28655q, i14).getB1();
        long jM125385c2 = c38072d.m121949b(c28655q, i14).getWhite70();
        C2886a c2886aM8424e = c38072d.m121952e(c28655q, i14).getB5();
        int iM67307i = c23248d.m67307i(new C23245b0(5, null, 510));
        try {
            int iM67308j = c23248d.m67308j(C23267m0.m67325a(c2886aM8420a.getStyle().f92255a, jM125385c1, null, 65534));
            try {
                c23248d.m67300b(c4791n.getDescription());
                c23248d.m67304f(iM67308j);
                c23248d.m67300b("\n\n");
                int iM67308j2 = c23248d.m67308j(C23267m0.m67325a(c2886aM8424e.getStyle().f92255a, jM125385c2, null, 65534));
                try {
                    c23248d.m67300b(c4791n.getDisclaimer());
                    c23248d.m67304f(iM67308j2);
                    c23248d.m67304f(iM67307i);
                    C23254g c23254gM67309k = c23248d.m67309k();
                    c28655q.m87173q(false);
                    return c23254gM67309k;
                } catch (Throwable th3) {
                    c23248d.m67304f(iM67308j2);
                    throw th3;
                }
            } catch (Throwable th4) {
                c23248d.m67304f(iM67308j);
                throw th4;
            }
        } catch (Throwable th5) {
            c23248d.m67304f(iM67307i);
            throw th5;
        }
    }
}
