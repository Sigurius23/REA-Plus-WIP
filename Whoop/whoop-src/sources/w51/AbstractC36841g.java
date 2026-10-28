package w51;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import b91.EnumC2888c;
import bv2.C3675b;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.List;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p181h2.C16620e;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p40.C28827b;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31919h;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import t80.C33592b;
import te0.AbstractC33745d;
import um0.C35076b;
import v31.C35608d;
import w01.C36680e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: w51.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001d\u001a\u00020\u0006*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lw51/h;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Lw51/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lw51/d;", "headerViewState", "o", "(Lw51/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lw51/f;", "q", "(Lw51/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lw51/b;", "buttonViewState", "", "isExpanded", "onToggle", "t", "(Lw51/b;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lk2/e;", "", "fillWidth", "totalWidth", "height", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lk2/e;FFF)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36841g {
    /* JADX WARN: Code duplicated, block: B:102:0x0252  */
    /* JADX WARN: Code duplicated, block: B:104:0x0266  */
    /* JADX WARN: Code duplicated, block: B:107:0x0270  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:80:0x018a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0210  */
    /* JADX INFO: renamed from: i */
    public static final void m118115i(C36842h viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier3;
        float f13;
        int iHashCode2;
        List<C36840f> listM74156w1;
        int i17;
        int i18;
        Function1 function5;
        InterfaceC28601c1 interfaceC28601c2;
        C2314t c2314t2;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1017178959);
        int i19 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i19 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i19 |= i16;
                }
                if ((i19 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i19 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C36680e(9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsExpanded()));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    z13 = true;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
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
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        modifier3 = modifier2;
                    } else {
                        modifier3 = modifier2;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        m118121o(viewState.getHeader(), null, c28655q, 0, 2);
                        f13 = 2 * 8;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        if (m118117k(interfaceC28601c1)) {
                            listM74156w1 = viewState.m118132c();
                        } else {
                            listM74156w1 = AbstractC25265s.m74156w1(viewState.m118132c(), viewState.getCollapsedCount());
                        }
                        c28655q.m87150e0(-1444186949);
                        i17 = 0;
                        for (Object obj : listM74156w1) {
                            i18 = i17 + 1;
                            if (i17 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            m118123q((C36840f) obj, AbstractC1102d.m3409f(1.0f, c2314t), c28655q, 48, 0);
                            if (i17 < listM74156w1.size() - 1) {
                                AbstractC33745d.m106667z(c28655q, -1055139729, c2314t, f13, c28655q);
                                C28655q c28655q2 = c28655q;
                                interfaceC28601c2 = interfaceC28601c1;
                                function5 = function4;
                                c2314t2 = c2314t;
                                AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q2, 0, 255);
                                c28655q = c28655q2;
                                AbstractC30007c.m91851u(c2314t2, f13, c28655q, false);
                            } else {
                                function5 = function4;
                                interfaceC28601c2 = interfaceC28601c1;
                                c2314t2 = c2314t;
                                c28655q.m87150e0(-1054957139);
                                c28655q.m87173q(false);
                            }
                            listM74156w1 = listM74156w1;
                            c2314t = c2314t2;
                            function4 = function5;
                            i17 = i18;
                            interfaceC28601c1 = interfaceC28601c2;
                            z13 = true;
                        }
                        Function1 function6 = function4;
                        InterfaceC28601c1 interfaceC28601c3 = interfaceC28601c1;
                        C2314t c2314t3 = c2314t;
                        c28655q.m87173q(false);
                        if (viewState.m118132c().size() > viewState.getCollapsedCount() || viewState.getToggleButton() == null) {
                            c28655q.m87150e0(-1819038139);
                            c28655q.m87173q(false);
                        } else {
                            AbstractC33745d.m106667z(c28655q, -1819486926, c2314t3, f13, c28655q);
                            C36836b c36836bM118133e = viewState.getToggleButton();
                            boolean zM118117k = m118117k(interfaceC28601c3);
                            boolean z14 = (i19 & 896) == 256;
                            Object objM87133R3 = c28655q.m87133R();
                            if (z14 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C28827b(function6, interfaceC28601c3, 15);
                                c28655q.m87172p0(objM87133R3);
                            }
                            m118126t(c36836bM118133e, zM118117k, (Function1) objM87133R3, null, c28655q, 0, 8);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        function3 = function6;
                        modifier2 = modifier3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    m118121o(viewState.getHeader(), null, c28655q, 0, 2);
                    f13 = 2 * 8;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    if (m118117k(interfaceC28601c1)) {
                        listM74156w1 = viewState.m118132c();
                    } else {
                        listM74156w1 = AbstractC25265s.m74156w1(viewState.m118132c(), viewState.getCollapsedCount());
                    }
                    c28655q.m87150e0(-1444186949);
                    i17 = 0;
                    while (r3.hasNext()) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        m118123q((C36840f) obj, AbstractC1102d.m3409f(1.0f, c2314t), c28655q, 48, 0);
                        if (i17 < listM74156w1.size() - 1) {
                            AbstractC33745d.m106667z(c28655q, -1055139729, c2314t, f13, c28655q);
                            C28655q c28655q3 = c28655q;
                            interfaceC28601c2 = interfaceC28601c1;
                            function5 = function4;
                            c2314t2 = c2314t;
                            AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q3, 0, 255);
                            c28655q = c28655q3;
                            AbstractC30007c.m91851u(c2314t2, f13, c28655q, false);
                        } else {
                            function5 = function4;
                            interfaceC28601c2 = interfaceC28601c1;
                            c2314t2 = c2314t;
                            c28655q.m87150e0(-1054957139);
                            c28655q.m87173q(false);
                        }
                        listM74156w1 = listM74156w1;
                        c2314t = c2314t2;
                        function4 = function5;
                        i17 = i18;
                        interfaceC28601c1 = interfaceC28601c2;
                        z13 = true;
                    }
                    Function1 function7 = function4;
                    InterfaceC28601c1 interfaceC28601c4 = interfaceC28601c1;
                    C2314t c2314t4 = c2314t;
                    c28655q.m87173q(false);
                    if (viewState.m118132c().size() > viewState.getCollapsedCount()) {
                        c28655q.m87150e0(-1819038139);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1819038139);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function7;
                    modifier2 = modifier3;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35608d(i13, i14, 23, modifier2, viewState, function3);
                }
            }
            i19 |= 384;
            function2 = function1;
            if ((i19 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i19 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36680e(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsExpanded()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                z13 = true;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier3 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    m118121o(viewState.getHeader(), null, c28655q, 0, 2);
                    f13 = 2 * 8;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    if (m118117k(interfaceC28601c1)) {
                        listM74156w1 = viewState.m118132c();
                    } else {
                        listM74156w1 = AbstractC25265s.m74156w1(viewState.m118132c(), viewState.getCollapsedCount());
                    }
                    c28655q.m87150e0(-1444186949);
                    i17 = 0;
                    while (r3.hasNext()) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        m118123q((C36840f) obj, AbstractC1102d.m3409f(1.0f, c2314t), c28655q, 48, 0);
                        if (i17 < listM74156w1.size() - 1) {
                            AbstractC33745d.m106667z(c28655q, -1055139729, c2314t, f13, c28655q);
                            C28655q c28655q4 = c28655q;
                            interfaceC28601c2 = interfaceC28601c1;
                            function5 = function4;
                            c2314t2 = c2314t;
                            AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q4, 0, 255);
                            c28655q = c28655q4;
                            AbstractC30007c.m91851u(c2314t2, f13, c28655q, false);
                        } else {
                            function5 = function4;
                            interfaceC28601c2 = interfaceC28601c1;
                            c2314t2 = c2314t;
                            c28655q.m87150e0(-1054957139);
                            c28655q.m87173q(false);
                        }
                        listM74156w1 = listM74156w1;
                        c2314t = c2314t2;
                        function4 = function5;
                        i17 = i18;
                        interfaceC28601c1 = interfaceC28601c2;
                        z13 = true;
                    }
                    Function1 function8 = function4;
                    InterfaceC28601c1 interfaceC28601c5 = interfaceC28601c1;
                    C2314t c2314t5 = c2314t;
                    c28655q.m87173q(false);
                    if (viewState.m118132c().size() > viewState.getCollapsedCount()) {
                        c28655q.m87150e0(-1819038139);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1819038139);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function8;
                    modifier2 = modifier3;
                } else {
                    modifier3 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                m118121o(viewState.getHeader(), null, c28655q, 0, 2);
                f13 = 2 * 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                if (m118117k(interfaceC28601c1)) {
                    listM74156w1 = viewState.m118132c();
                } else {
                    listM74156w1 = AbstractC25265s.m74156w1(viewState.m118132c(), viewState.getCollapsedCount());
                }
                c28655q.m87150e0(-1444186949);
                i17 = 0;
                while (r3.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    m118123q((C36840f) obj, AbstractC1102d.m3409f(1.0f, c2314t), c28655q, 48, 0);
                    if (i17 < listM74156w1.size() - 1) {
                        AbstractC33745d.m106667z(c28655q, -1055139729, c2314t, f13, c28655q);
                        C28655q c28655q5 = c28655q;
                        interfaceC28601c2 = interfaceC28601c1;
                        function5 = function4;
                        c2314t2 = c2314t;
                        AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q5, 0, 255);
                        c28655q = c28655q5;
                        AbstractC30007c.m91851u(c2314t2, f13, c28655q, false);
                    } else {
                        function5 = function4;
                        interfaceC28601c2 = interfaceC28601c1;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(-1054957139);
                        c28655q.m87173q(false);
                    }
                    listM74156w1 = listM74156w1;
                    c2314t = c2314t2;
                    function4 = function5;
                    i17 = i18;
                    interfaceC28601c1 = interfaceC28601c2;
                    z13 = true;
                }
                Function1 function9 = function4;
                InterfaceC28601c1 interfaceC28601c6 = interfaceC28601c1;
                C2314t c2314t6 = c2314t;
                c28655q.m87173q(false);
                if (viewState.m118132c().size() > viewState.getCollapsedCount()) {
                    c28655q.m87150e0(-1819038139);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1819038139);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function9;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(i13, i14, 23, modifier2, viewState, function3);
            }
        }
        i19 |= 48;
        modifier2 = modifier;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i19 |= i16;
            }
            if ((i19 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i19 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36680e(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsExpanded()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier2);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                z13 = true;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a7);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier3 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    m118121o(viewState.getHeader(), null, c28655q, 0, 2);
                    f13 = 2 * 8;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    if (m118117k(interfaceC28601c1)) {
                        listM74156w1 = viewState.m118132c();
                    } else {
                        listM74156w1 = AbstractC25265s.m74156w1(viewState.m118132c(), viewState.getCollapsedCount());
                    }
                    c28655q.m87150e0(-1444186949);
                    i17 = 0;
                    while (r3.hasNext()) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        m118123q((C36840f) obj, AbstractC1102d.m3409f(1.0f, c2314t), c28655q, 48, 0);
                        if (i17 < listM74156w1.size() - 1) {
                            AbstractC33745d.m106667z(c28655q, -1055139729, c2314t, f13, c28655q);
                            C28655q c28655q6 = c28655q;
                            interfaceC28601c2 = interfaceC28601c1;
                            function5 = function4;
                            c2314t2 = c2314t;
                            AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q6, 0, 255);
                            c28655q = c28655q6;
                            AbstractC30007c.m91851u(c2314t2, f13, c28655q, false);
                        } else {
                            function5 = function4;
                            interfaceC28601c2 = interfaceC28601c1;
                            c2314t2 = c2314t;
                            c28655q.m87150e0(-1054957139);
                            c28655q.m87173q(false);
                        }
                        listM74156w1 = listM74156w1;
                        c2314t = c2314t2;
                        function4 = function5;
                        i17 = i18;
                        interfaceC28601c1 = interfaceC28601c2;
                        z13 = true;
                    }
                    Function1 function10 = function4;
                    InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c1;
                    C2314t c2314t7 = c2314t;
                    c28655q.m87173q(false);
                    if (viewState.m118132c().size() > viewState.getCollapsedCount()) {
                        c28655q.m87150e0(-1819038139);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1819038139);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function10;
                    modifier2 = modifier3;
                } else {
                    modifier3 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                m118121o(viewState.getHeader(), null, c28655q, 0, 2);
                f13 = 2 * 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                if (m118117k(interfaceC28601c1)) {
                    listM74156w1 = viewState.m118132c();
                } else {
                    listM74156w1 = AbstractC25265s.m74156w1(viewState.m118132c(), viewState.getCollapsedCount());
                }
                c28655q.m87150e0(-1444186949);
                i17 = 0;
                while (r3.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    m118123q((C36840f) obj, AbstractC1102d.m3409f(1.0f, c2314t), c28655q, 48, 0);
                    if (i17 < listM74156w1.size() - 1) {
                        AbstractC33745d.m106667z(c28655q, -1055139729, c2314t, f13, c28655q);
                        C28655q c28655q7 = c28655q;
                        interfaceC28601c2 = interfaceC28601c1;
                        function5 = function4;
                        c2314t2 = c2314t;
                        AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q7, 0, 255);
                        c28655q = c28655q7;
                        AbstractC30007c.m91851u(c2314t2, f13, c28655q, false);
                    } else {
                        function5 = function4;
                        interfaceC28601c2 = interfaceC28601c1;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(-1054957139);
                        c28655q.m87173q(false);
                    }
                    listM74156w1 = listM74156w1;
                    c2314t = c2314t2;
                    function4 = function5;
                    i17 = i18;
                    interfaceC28601c1 = interfaceC28601c2;
                    z13 = true;
                }
                Function1 function11 = function4;
                InterfaceC28601c1 interfaceC28601c8 = interfaceC28601c1;
                C2314t c2314t8 = c2314t;
                c28655q.m87173q(false);
                if (viewState.m118132c().size() > viewState.getCollapsedCount()) {
                    c28655q.m87150e0(-1819038139);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1819038139);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function11;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(i13, i14, 23, modifier2, viewState, function3);
            }
        }
        i19 |= 384;
        function2 = function1;
        if ((i19 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i19 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i15 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36680e(9);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsExpanded()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier2);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            z13 = true;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a10);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier3 = modifier2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                m118121o(viewState.getHeader(), null, c28655q, 0, 2);
                f13 = 2 * 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                if (m118117k(interfaceC28601c1)) {
                    listM74156w1 = viewState.m118132c();
                } else {
                    listM74156w1 = AbstractC25265s.m74156w1(viewState.m118132c(), viewState.getCollapsedCount());
                }
                c28655q.m87150e0(-1444186949);
                i17 = 0;
                while (r3.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    m118123q((C36840f) obj, AbstractC1102d.m3409f(1.0f, c2314t), c28655q, 48, 0);
                    if (i17 < listM74156w1.size() - 1) {
                        AbstractC33745d.m106667z(c28655q, -1055139729, c2314t, f13, c28655q);
                        C28655q c28655q8 = c28655q;
                        interfaceC28601c2 = interfaceC28601c1;
                        function5 = function4;
                        c2314t2 = c2314t;
                        AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q8, 0, 255);
                        c28655q = c28655q8;
                        AbstractC30007c.m91851u(c2314t2, f13, c28655q, false);
                    } else {
                        function5 = function4;
                        interfaceC28601c2 = interfaceC28601c1;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(-1054957139);
                        c28655q.m87173q(false);
                    }
                    listM74156w1 = listM74156w1;
                    c2314t = c2314t2;
                    function4 = function5;
                    i17 = i18;
                    interfaceC28601c1 = interfaceC28601c2;
                    z13 = true;
                }
                Function1 function12 = function4;
                InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c1;
                C2314t c2314t9 = c2314t;
                c28655q.m87173q(false);
                if (viewState.m118132c().size() > viewState.getCollapsedCount()) {
                    c28655q.m87150e0(-1819038139);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1819038139);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function12;
                modifier2 = modifier3;
            } else {
                modifier3 = modifier2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N10);
            m118121o(viewState.getHeader(), null, c28655q, 0, 2);
            f13 = 2 * 8;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
            if (m118117k(interfaceC28601c1)) {
                listM74156w1 = viewState.m118132c();
            } else {
                listM74156w1 = AbstractC25265s.m74156w1(viewState.m118132c(), viewState.getCollapsedCount());
            }
            c28655q.m87150e0(-1444186949);
            i17 = 0;
            while (r3.hasNext()) {
                i18 = i17 + 1;
                if (i17 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                m118123q((C36840f) obj, AbstractC1102d.m3409f(1.0f, c2314t), c28655q, 48, 0);
                if (i17 < listM74156w1.size() - 1) {
                    AbstractC33745d.m106667z(c28655q, -1055139729, c2314t, f13, c28655q);
                    C28655q c28655q9 = c28655q;
                    interfaceC28601c2 = interfaceC28601c1;
                    function5 = function4;
                    c2314t2 = c2314t;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q9, 0, 255);
                    c28655q = c28655q9;
                    AbstractC30007c.m91851u(c2314t2, f13, c28655q, false);
                } else {
                    function5 = function4;
                    interfaceC28601c2 = interfaceC28601c1;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-1054957139);
                    c28655q.m87173q(false);
                }
                listM74156w1 = listM74156w1;
                c2314t = c2314t2;
                function4 = function5;
                i17 = i18;
                interfaceC28601c1 = interfaceC28601c2;
                z13 = true;
            }
            Function1 function13 = function4;
            InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c1;
            C2314t c2314t10 = c2314t;
            c28655q.m87173q(false);
            if (viewState.m118132c().size() > viewState.getCollapsedCount()) {
                c28655q.m87150e0(-1819038139);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1819038139);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function13;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(i13, i14, 23, modifier2, viewState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m118116j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m118117k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m118118l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m118119m(Function1 function1, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m118118l(interfaceC28601c1, z4);
        function1.invoke(new C36837c(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m118120n(C36842h c36842h, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m118115i(c36842h, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x013a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0144  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    private static final void m118121o(C36838d c36838d, Modifier modifier, Composer composer, int i13, int i14) {
        C36838d c36838d2;
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-767494722);
        if ((i13 & 6) == 0) {
            c36838d2 = c36838d;
            i15 = i13 | (c28655q.m87153g(c36838d2) ? 4 : 2);
        } else {
            c36838d2 = c36838d;
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
                String strM21274h = AbstractC8693b.m21274h(c36838d2.getLeftText(), c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c36838d.getRightText(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(c36838d, i13, modifier3, i14, 20);
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
            String strM21274h2 = AbstractC8693b.m21274h(c36838d2.getLeftText(), c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c36838d.getRightText(), c28655q, 0), null, c38072d2.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(c36838d, i13, modifier3, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m118122p(C36838d c36838d, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m118121o(c36838d, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:53:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x0144  */
    /* JADX WARN: Code duplicated, block: B:61:0x0275  */
    /* JADX WARN: Code duplicated, block: B:62:0x0281  */
    /* JADX WARN: Code duplicated, block: B:64:0x0291  */
    /* JADX WARN: Code duplicated, block: B:65:0x029c  */
    /* JADX WARN: Code duplicated, block: B:68:0x030c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0314  */
    /* JADX WARN: Code duplicated, block: B:75:0x0332  */
    /* JADX WARN: Code duplicated, block: B:80:0x0349  */
    /* JADX WARN: Code duplicated, block: B:82:0x0355  */
    /* JADX WARN: Code duplicated, block: B:85:0x0371  */
    /* JADX WARN: Code duplicated, block: B:86:0x0373  */
    /* JADX WARN: Code duplicated, block: B:93:0x0387  */
    /* JADX WARN: Code duplicated, block: B:95:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:98:0x03ac  */
    /* JADX INFO: renamed from: q */
    public static final void m118123q(C36840f viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C36840f c36840f;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int iHashCode3;
        C38072d c38072d;
        int i16;
        EnumC39333f color;
        C17919x c17919xM31989h;
        C17919x c17919xM31989h2;
        long jM73370c;
        int iHashCode4;
        EnumC39333f color2;
        C17919x c17919x;
        boolean z13;
        boolean zM87153g;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2076515942);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
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
                if (i17 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                float f13 = 1 * 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier3), 0.0f, f13, 1);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22961h c22961h = AbstractC22977m.f90656g;
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                Modifier modifier4 = modifier3;
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(viewState.getIcon(), null, null, c28655q, 0, 3);
                c38072d = C38072d.f163053a;
                i16 = i15;
                float f14 = 4;
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1102d.m3419p(((float) 4.5d) * f14, c2314t), null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q, 6).getWhite50(), 5), c28655q, 432, 56);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getActivityName(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, EnumC2888c.INSTANCE.m8402a(EnumC2888c.H5), null, c28655q, 0, 0, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getAvgStrain(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN8(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(true);
                String strM21274h = AbstractC8693b.m21274h(viewState.getActivityCount(), c28655q, 0);
                C2886a c2886aM8405C = c38072d.m121952e(c28655q, 6).getN6();
                color = viewState.getBarStyle().getColor();
                c17919xM31989h = null;
                if (color == null) {
                    c28655q.m87150e0(35873986);
                    c28655q.m87173q(false);
                    c17919xM31989h2 = null;
                } else {
                    c28655q.m87150e0(1802272543);
                    c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
                }
                if (c17919xM31989h2 == null) {
                    jM73370c = AbstractC25012a.m73370c(c28655q, 1802273843, c38072d, c28655q, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1802271766);
                    c28655q.m87173q(false);
                    jM73370c = c17919xM31989h2.f69639a;
                }
                AbstractC30795n.m94707h(strM21274h, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C, null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                AbstractC18489d0.m53356B(c28655q, true, c2314t, f13, c28655q);
                float f15 = 2 * f14;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3411h(f15, AbstractC1102d.m3409f(1.0f, c2314t)), (float) 0.5d, f14);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM53364e);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                color2 = viewState.getBarStyle().getColor();
                if (color2 == null) {
                    c28655q.m87150e0(1359041732);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1290766045);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, color2.mo134584toComposableColorWaAFU9c(c28655q, 0));
                }
                c17919x = c17919xM31989h;
                Modifier modifierM3411h = AbstractC1102d.m3411h(f15, AbstractC1102d.m3409f(1.0f, c2314t));
                if ((i16 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87153g = c28655q.m87153g(c17919x) | z13;
                objM87133R = c28655q.m87133R();
                if (!zM87153g || objM87133R == C28635l.f115821a) {
                    c36840f = viewState;
                    objM87133R = new C35076b(20, c36840f, c17919x);
                    c28655q.m87172p0(objM87133R);
                } else {
                    c36840f = viewState;
                }
                AbstractC21478l0.m60421a(modifierM3411h, (Function1) objM87133R, c28655q, 6);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier2 = modifier4;
            } else {
                c36840f = viewState;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(c36840f, i13, modifier2, i14, 21);
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
            if (i17 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            float f16 = 1 * 8;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier3), 0.0f, f16, 1);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h2 = AbstractC22977m.f90656g;
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q, 48);
            Modifier modifier5 = modifier3;
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N7);
            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(viewState.getIcon(), null, null, c28655q, 0, 3);
            c38072d = C38072d.f163053a;
            i16 = i15;
            float f17 = 4;
            AbstractC29125c.m88522c(abstractC26165aM64500i2, null, AbstractC1102d.m3419p(((float) 4.5d) * f17, c2314t), null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q, 6).getWhite50(), 5), c28655q, 432, 56);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f16, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getActivityName(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, EnumC2888c.INSTANCE.m8402a(EnumC2888c.H5), null, c28655q, 0, 0, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f16, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getAvgStrain(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN8(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getActivityCount(), c28655q, 0);
            C2886a c2886aM8405C2 = c38072d.m121952e(c28655q, 6).getN6();
            color = viewState.getBarStyle().getColor();
            c17919xM31989h = null;
            if (color == null) {
                c28655q.m87150e0(35873986);
                c28655q.m87173q(false);
                c17919xM31989h2 = null;
            } else {
                c28655q.m87150e0(1802272543);
                c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            if (c17919xM31989h2 == null) {
                jM73370c = AbstractC25012a.m73370c(c28655q, 1802273843, c38072d, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1802271766);
                c28655q.m87173q(false);
                jM73370c = c17919xM31989h2.f69639a;
            }
            AbstractC30795n.m94707h(strM21274h2, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C2, null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            AbstractC18489d0.m53356B(c28655q, true, c2314t, f16, c28655q);
            float f18 = 2 * f17;
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3411h(f18, AbstractC1102d.m3409f(1.0f, c2314t)), (float) 0.5d, f17);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM53364e2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N8);
            color2 = viewState.getBarStyle().getColor();
            if (color2 == null) {
                c28655q.m87150e0(1359041732);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1290766045);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, color2.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            c17919x = c17919xM31989h;
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(f18, AbstractC1102d.m3409f(1.0f, c2314t));
            if ((i16 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87153g = c28655q.m87153g(c17919x) | z13;
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                c36840f = viewState;
                objM87133R = new C35076b(20, c36840f, c17919x);
                c28655q.m87172p0(objM87133R);
            } else {
                c36840f = viewState;
                objM87133R = new C35076b(20, c36840f, c17919x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3411h2, (Function1) objM87133R, c28655q, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier2 = modifier5;
        } else {
            c36840f = viewState;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(c36840f, i13, modifier2, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m118124r(C36840f c36840f, C17919x c17919x, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float fM118104d = c36840f.getBarFillPercentage() * Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        m118129w(Canvas, c17919x != null ? fM118104d : 0.0f, Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)), Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)));
        if (c17919x != null) {
            float fMo743q0 = Canvas.mo743q0(((float) 0.5d) * 4);
            InterfaceC22131e.m63374D(Canvas, c17919x.f69639a, 0L, C16620e.m47209a(fM118104d, 0.0f, Canvas.mo731d(), 2), (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), null, 0.0f, 242);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m118125s(C36840f c36840f, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m118123q(c36840f, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    private static final void m118126t(C36836b c36836b, boolean z4, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        C36836b c36836b2;
        int i15;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        EnumC16313m0 enumC16313m0M118089a;
        TextResource textResourceM118090b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1452168115);
        if ((i13 & 6) == 0) {
            c36836b2 = c36836b;
            i15 = (c28655q.m87153g(c36836b2) ? 4 : 2) | i13;
        } else {
            c36836b2 = c36836b;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C38072d c38072d = C38072d.f163053a;
                float f13 = 4;
                Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3409f, 2, f13, c38072d.m121949b(c28655q, 6).getWhite10());
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R = c28655q.m87133R();
                if (z16 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3675b(function1, z4, 14);
                    c28655q.m87172p0(objM87133R);
                }
                float f14 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1772c1.m5391i(modifierM95629e, false, null, (InterfaceC4339a) objM87133R, 3), ((float) 2.5d) * f14, ((float) 1.5d) * f14);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                if (z4) {
                    enumC16313m0M118089a = c36836b2.getExpandedIcon();
                } else {
                    enumC16313m0M118089a = c36836b2.getCollapsedIcon();
                }
                Modifier modifier5 = modifier4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M118089a.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                AbstractC38963t7.m124386p(1, f14, c2314t, c28655q);
                if (z4) {
                    textResourceM118090b = c36836b2.getExpandedTitle();
                } else {
                    textResourceM118090b = c36836b2.getCollapsedTitle();
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM118090b, c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(c36836b, z4, function1, modifier3, i13, i14, 9);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C38072d c38072d2 = C38072d.f163053a;
            float f15 = 4;
            Modifier modifierM95629e2 = AbstractC31061c.m95629e(modifierM3409f2, 2, f15, c38072d2.m121949b(c28655q, 6).getWhite10());
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i15 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objM87133R = c28655q.m87133R();
            if (z16) {
                objM87133R = new C3675b(function1, z4, 14);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3675b(function1, z4, 14);
                c28655q.m87172p0(objM87133R);
            }
            float f16 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1772c1.m5391i(modifierM95629e2, false, null, (InterfaceC4339a) objM87133R, 3), ((float) 2.5d) * f16, ((float) 1.5d) * f16);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
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
            if (z4) {
                enumC16313m0M118089a = c36836b2.getExpandedIcon();
            } else {
                enumC16313m0M118089a = c36836b2.getCollapsedIcon();
            }
            Modifier modifier6 = modifier4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M118089a.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f15 * f15, c2314t), c38072d2.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
            AbstractC38963t7.m124386p(1, f16, c2314t, c28655q);
            if (z4) {
                textResourceM118090b = c36836b2.getExpandedTitle();
            } else {
                textResourceM118090b = c36836b2.getCollapsedTitle();
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM118090b, c28655q, 0), null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(c36836b, z4, function1, modifier3, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m118127u(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m118128v(C36836b c36836b, boolean z4, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m118126t(c36836b, z4, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m118129w(InterfaceC22131e interfaceC22131e, float f13, float f14, float f15) {
        InterfaceC22131e interfaceC22131e2 = interfaceC22131e;
        float fMo743q0 = interfaceC22131e2.mo743q0(2);
        float fMo743q1 = interfaceC22131e2.mo743q0(4) + fMo743q0;
        float f16 = f15 + f14;
        float f17 = -f16;
        while (f17 < f16) {
            float fMax = Math.max(f13, f17);
            float fMin = Math.min(f14, f17 + f15);
            if (fMax < fMin) {
                interfaceC22131e2.mo732d0(AbstractC17918w0.m51517e(4283782485L), (((long) Float.floatToRawIntBits(f15 - (fMax - f17))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32), (((long) Float.floatToRawIntBits(f15 - (fMin - f17))) & 4294967295L) | (Float.floatToRawIntBits(fMin) << 32), (496 & 8) != 0 ? 0.0f : fMo743q0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
            }
            f17 += fMo743q1;
            interfaceC22131e2 = interfaceC22131e;
        }
    }
}
