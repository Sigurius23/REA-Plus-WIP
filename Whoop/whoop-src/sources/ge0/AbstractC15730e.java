package ge0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.profile.view.C9810f;
import eg2.C13168a;
import f02.C13917c;
import g40.C15449y1;
import h11.AbstractC16611f;
import h11.C16613h;
import i11.C17858a;
import i11.C17863f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ge0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lge0/f;", "viewState", "Lkotlin/Function1;", "Lge0/b;", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Lge0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "u", "(Lge0/f;)Ljava/lang/Long;", "", "Lge0/a;", "id", "t", "(Ljava/util/List;J)Lge0/a;", "Ly3/f;", "a", "F", "horizontalContentPadding", "selectedPillId", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15730e {

    /* JADX INFO: renamed from: a */
    private static final float f59245a = 3 * 8;

    /* JADX WARN: Code duplicated, block: B:100:0x0282  */
    /* JADX WARN: Code duplicated, block: B:103:0x0287  */
    /* JADX WARN: Code duplicated, block: B:104:0x028a  */
    /* JADX WARN: Code duplicated, block: B:109:0x02da  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:122:0x032c  */
    /* JADX WARN: Code duplicated, block: B:123:0x032e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0335 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x033b  */
    /* JADX WARN: Code duplicated, block: B:132:0x036c  */
    /* JADX WARN: Code duplicated, block: B:134:0x037a  */
    /* JADX WARN: Code duplicated, block: B:135:0x037f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0383  */
    /* JADX WARN: Code duplicated, block: B:138:0x038d  */
    /* JADX WARN: Code duplicated, block: B:140:0x039c  */
    /* JADX WARN: Code duplicated, block: B:141:0x039e  */
    /* JADX WARN: Code duplicated, block: B:144:0x03a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:160:0x0407  */
    /* JADX WARN: Code duplicated, block: B:162:0x0425  */
    /* JADX WARN: Code duplicated, block: B:163:0x0427  */
    /* JADX WARN: Code duplicated, block: B:166:0x042e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0430  */
    /* JADX WARN: Code duplicated, block: B:172:0x044c  */
    /* JADX WARN: Code duplicated, block: B:174:0x045d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0467  */
    /* JADX WARN: Code duplicated, block: B:179:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x016a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0187  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x023e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0242  */
    /* JADX WARN: Code duplicated, block: B:93:0x0261  */
    /* JADX WARN: Code duplicated, block: B:96:0x0279  */
    /* JADX WARN: Code duplicated, block: B:97:0x027b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX INFO: renamed from: i */
    public static final void m44324i(Modifier modifier, C15731f viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        Modifier modifier3;
        Function1 function5;
        int iHashCode2;
        Long lM44326k;
        C15726a c15726aM44335t;
        String strM44308f;
        InterfaceC28601c1 interfaceC28601c2;
        C0209i c0209i3;
        boolean z13;
        C0209i c0209i4;
        C2314t c2314t2;
        float f13;
        int iHashCode3;
        int i16;
        boolean z14;
        Object objM87133R2;
        C28676v0 c28676v1;
        Function1 function6;
        float f14;
        ArrayList arrayList;
        Iterator it;
        ?? r10;
        boolean z15;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Function1 function7;
        Long lM44326k2;
        InterfaceC25312u interfaceC25312uM44306d;
        boolean z16;
        Object objM87133R4;
        Long lM44326k3;
        C15726a c15726aM44335t2;
        List<InterfaceC25312u> listM44307e;
        boolean z17;
        Object objM87133R5;
        C15726a c15726aM44335t3;
        Object next;
        int i17;
        Long lM44326k4;
        boolean z18;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(910932633);
        int i18 = i14 & 1;
        if (i18 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C15449y1(23);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(m44336u(viewState));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                modifier3 = modifier2;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f59245a, 0.0f, 2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                function5 = function4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                lM44326k = m44326k(interfaceC28601c1);
                if (lM44326k == null) {
                    c28655q.m87150e0(1227394322);
                    z13 = false;
                    c28655q.m87173q(false);
                    c0209i3 = c0209i;
                    interfaceC28601c2 = interfaceC28601c1;
                    c2314t2 = c2314t;
                    c0209i4 = c0209i2;
                    f13 = 1.0f;
                } else {
                    c28655q.m87150e0(1227394323);
                    c15726aM44335t = m44335t(viewState.m44340e(), lM44326k.longValue());
                    if (c15726aM44335t != null || (strM44308f = c15726aM44335t.getSelectionDisplay()) == null) {
                        strM44308f = "";
                    }
                    String strM21275i = AbstractC8693b.m21275i(strM44308f, c28655q, 0);
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    C2886a c2886aM8420a = c38072d.m121952e(c28655q, i24).getB1();
                    interfaceC28601c2 = interfaceC28601c1;
                    c0209i3 = c0209i;
                    z13 = false;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    f13 = 1.0f;
                    AbstractC30795n.m94707h(strM21275i, null, c38072d.m121949b(c28655q, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(f13, true, c28655q);
                Modifier modifierM3424u = AbstractC1102d.m3424u(30 * 4, c2314t2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z13);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3424u);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                C17858a c17858a = new C17858a();
                C17863f c17863fM44339c = viewState.getDateSelectorState();
                i16 = i15 & 896;
                if (i16 == 256) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                objM87133R2 = c28655q.m87133R();
                if (!z14) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        function6 = function5;
                    }
                    c17858a.Compose(c2314t2, c17863fM44339c, (Function1) objM87133R2, c28655q, (C17863f.f69516k << 3) | 6 | (C17858a.f69479a << 9));
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    f14 = 8;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(3 * f14, c2314t2));
                    List<C15726a> listM44340e = viewState.m44340e();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM44340e, 10));
                    it = listM44340e.iterator();
                    r10 = z13;
                    while (true) {
                        if (it.hasNext()) {
                            if (i16 == 256) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (!z15 || objM87133R3 == c28676v1) {
                                interfaceC28601c3 = interfaceC28601c2;
                                objM87133R3 = new C9810f(function6, interfaceC28601c3);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                interfaceC28601c3 = interfaceC28601c2;
                            }
                            C28655q c28655q2 = c28655q;
                            function7 = function6;
                            AbstractC16611f.m47150h(null, arrayList, (InterfaceC4351m) objM87133R3, null, null, null, null, null, c28655q2, 0, 249);
                            c28655q = c28655q2;
                            lM44326k2 = m44326k(interfaceC28601c3);
                            if (lM44326k2 != null) {
                                c15726aM44335t3 = m44335t(viewState.m44340e(), lM44326k2.longValue());
                                if (c15726aM44335t3 != null) {
                                    interfaceC25312uM44306d = c15726aM44335t3.getInfoCalloutState();
                                } else {
                                    interfaceC25312uM44306d = null;
                                }
                            } else {
                                interfaceC25312uM44306d = null;
                            }
                            if (interfaceC25312uM44306d == null) {
                                c28655q.m87150e0(-1177615015);
                                c28655q.m87173q(z13);
                            } else {
                                c28655q.m87150e0(-1177615014);
                                C13168a c13168a = new C13168a(28);
                                if (i16 == 256) {
                                    z16 = true;
                                } else {
                                    z16 = z13;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z16 || objM87133R4 == c28676v1) {
                                    objM87133R4 = new C15728c(function7, 2);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC25303l.m74291r(interfaceC25312uM44306d, null, c13168a, (Function1) objM87133R4, c28655q, 0, 2);
                                c28655q.m87173q(z13);
                            }
                            if (viewState.m44340e().isEmpty()) {
                                c28655q.m87150e0(-1176463457);
                                c28655q.m87173q(z13);
                            } else {
                                c28655q.m87150e0(-1177095795);
                                lM44326k3 = m44326k(interfaceC28601c3);
                                if (lM44326k3 != null) {
                                    c15726aM44335t2 = m44335t(viewState.m44340e(), lM44326k3.longValue());
                                } else {
                                    c15726aM44335t2 = null;
                                }
                                listM44307e = c15726aM44335t2 != null ? c15726aM44335t2.m44307e() : null;
                                if (listM44307e == null) {
                                    c28655q.m87150e0(-1176941385);
                                    c28655q.m87173q(z13);
                                } else {
                                    c28655q.m87150e0(-1176941384);
                                    for (InterfaceC25312u interfaceC25312u : listM44307e) {
                                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f14, c2314t2));
                                        C25307p c25307pM74678B0 = AbstractC25448c.m74678B0();
                                        C13168a c13168a2 = new C13168a(29);
                                        if (i16 == 256) {
                                            z17 = true;
                                        } else {
                                            z17 = z13;
                                        }
                                        objM87133R5 = c28655q.m87133R();
                                        if (z17 || objM87133R5 == c28676v1) {
                                            objM87133R5 = new C15728c(function7, 3);
                                            c28655q.m87172p0(objM87133R5);
                                        }
                                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B0, c13168a2, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                                    }
                                    c28655q.m87173q(z13);
                                }
                                c28655q.m87173q(z13);
                            }
                            c28655q.m87173q(true);
                            function3 = function7;
                            modifier2 = modifier3;
                            break;
                        }
                        next = it.next();
                        i17 = r10 + 1;
                        if (r10 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C16613h c16613hM44305c = ((C15726a) next).getDatePillState();
                        long j7 = (long) r10;
                        lM44326k4 = m44326k(interfaceC28601c2);
                        if (lM44326k4 == null && j7 == lM44326k4.longValue()) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        arrayList.add(c16613hM44305c.m47163a((16347 & 1) != 0 ? c16613hM44305c.dateDisplay : null, (16347 & 2) != 0 ? c16613hM44305c.multiDayCycleDateDisplay : null, (16347 & 4) != 0 ? c16613hM44305c.isSelected : z18, (16347 & 8) != 0 ? c16613hM44305c.style : null, (16347 & 16) != 0 ? c16613hM44305c.com.mapbox.common.HttpHeaders.DATE java.lang.String : null, (16347 & 32) != 0 ? c16613hM44305c.cycleId : Long.valueOf(j7), (16347 & 64) != 0 ? c16613hM44305c.icon : null, (16347 & 128) != 0 ? c16613hM44305c.showDot : false, (16347 & 256) != 0 ? c16613hM44305c.showDashBorder : false, (16347 & 512) != 0 ? c16613hM44305c.dotColorOverride : null, (16347 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c16613hM44305c.destination : null, (16347 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c16613hM44305c.interaction : null, (16347 & 4096) != 0 ? c16613hM44305c.isClickable : false, (16347 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c16613hM44305c.contentDescription : null));
                        r10 = i17;
                    }
                } else {
                    c28676v1 = c28676v0;
                }
                function6 = function5;
                objM87133R2 = new C15728c(function6, 1);
                c28655q.m87172p0(objM87133R2);
                c17858a.Compose(c2314t2, c17863fM44339c, (Function1) objM87133R2, c28655q, (C17863f.f69516k << 3) | 6 | (C17858a.f69479a << 9));
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                f14 = 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(3 * f14, c2314t2));
                List<C15726a> listM44340e2 = viewState.m44340e();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM44340e2, 10));
                it = listM44340e2.iterator();
                r10 = z13;
                while (true) {
                    if (it.hasNext()) {
                        if (i16 == 256) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            interfaceC28601c3 = interfaceC28601c2;
                            objM87133R3 = new C9810f(function6, interfaceC28601c3);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            interfaceC28601c3 = interfaceC28601c2;
                            objM87133R3 = new C9810f(function6, interfaceC28601c3);
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q3 = c28655q;
                        function7 = function6;
                        AbstractC16611f.m47150h(null, arrayList, (InterfaceC4351m) objM87133R3, null, null, null, null, null, c28655q3, 0, 249);
                        c28655q = c28655q3;
                        lM44326k2 = m44326k(interfaceC28601c3);
                        if (lM44326k2 != null) {
                            c15726aM44335t3 = m44335t(viewState.m44340e(), lM44326k2.longValue());
                            if (c15726aM44335t3 != null) {
                                interfaceC25312uM44306d = c15726aM44335t3.getInfoCalloutState();
                            } else {
                                interfaceC25312uM44306d = null;
                            }
                        } else {
                            interfaceC25312uM44306d = null;
                        }
                        if (interfaceC25312uM44306d == null) {
                            c28655q.m87150e0(-1177615015);
                            c28655q.m87173q(z13);
                        } else {
                            c28655q.m87150e0(-1177615014);
                            C13168a c13168a3 = new C13168a(28);
                            if (i16 == 256) {
                                z16 = true;
                            } else {
                                z16 = z13;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z16) {
                                objM87133R4 = new C15728c(function7, 2);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C15728c(function7, 2);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC25303l.m74291r(interfaceC25312uM44306d, null, c13168a3, (Function1) objM87133R4, c28655q, 0, 2);
                            c28655q.m87173q(z13);
                        }
                        if (viewState.m44340e().isEmpty()) {
                            c28655q.m87150e0(-1177095795);
                            lM44326k3 = m44326k(interfaceC28601c3);
                            if (lM44326k3 != null) {
                                c15726aM44335t2 = m44335t(viewState.m44340e(), lM44326k3.longValue());
                            } else {
                                c15726aM44335t2 = null;
                            }
                            if (c15726aM44335t2 != null) {
                            }
                            if (listM44307e == null) {
                                c28655q.m87150e0(-1176941385);
                                c28655q.m87173q(z13);
                            } else {
                                c28655q.m87150e0(-1176941384);
                                while (r3.hasNext()) {
                                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f14, c2314t2));
                                    C25307p c25307pM74678B1 = AbstractC25448c.m74678B0();
                                    C13168a c13168a4 = new C13168a(29);
                                    if (i16 == 256) {
                                        z17 = true;
                                    } else {
                                        z17 = z13;
                                    }
                                    objM87133R5 = c28655q.m87133R();
                                    if (z17) {
                                        objM87133R5 = new C15728c(function7, 3);
                                        c28655q.m87172p0(objM87133R5);
                                    } else {
                                        objM87133R5 = new C15728c(function7, 3);
                                        c28655q.m87172p0(objM87133R5);
                                    }
                                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B1, c13168a4, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                                }
                                c28655q.m87173q(z13);
                            }
                            c28655q.m87173q(z13);
                        } else {
                            c28655q.m87150e0(-1176463457);
                            c28655q.m87173q(z13);
                        }
                        c28655q.m87173q(true);
                        function3 = function7;
                        modifier2 = modifier3;
                        break;
                    }
                    next = it.next();
                    i17 = r10 + 1;
                    if (r10 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C16613h c16613hM44305c2 = ((C15726a) next).getDatePillState();
                    long j13 = (long) r10;
                    lM44326k4 = m44326k(interfaceC28601c2);
                    if (lM44326k4 == null) {
                        z18 = z13;
                    } else {
                        z18 = true;
                    }
                    arrayList.add(c16613hM44305c2.m47163a((16347 & 1) != 0 ? c16613hM44305c2.dateDisplay : null, (16347 & 2) != 0 ? c16613hM44305c2.multiDayCycleDateDisplay : null, (16347 & 4) != 0 ? c16613hM44305c2.isSelected : z18, (16347 & 8) != 0 ? c16613hM44305c2.style : null, (16347 & 16) != 0 ? c16613hM44305c2.com.mapbox.common.HttpHeaders.DATE java.lang.String : null, (16347 & 32) != 0 ? c16613hM44305c2.cycleId : Long.valueOf(j13), (16347 & 64) != 0 ? c16613hM44305c2.icon : null, (16347 & 128) != 0 ? c16613hM44305c2.showDot : false, (16347 & 256) != 0 ? c16613hM44305c2.showDashBorder : false, (16347 & 512) != 0 ? c16613hM44305c2.dotColorOverride : null, (16347 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c16613hM44305c2.destination : null, (16347 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c16613hM44305c2.interaction : null, (16347 & 4096) != 0 ? c16613hM44305c2.isClickable : false, (16347 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c16613hM44305c2.contentDescription : null));
                    r10 = i17;
                }
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13917c(i13, i14, 12, modifier2, function3, viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C15449y1(23);
                    c28655q.m87172p0(objM87133R6);
                }
                function4 = (Function1) objM87133R6;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(m44336u(viewState));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            C0209i c0209i7 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a2);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m4);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
            modifier3 = modifier2;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f59245a, 0.0f, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            function5 = function4;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
            lM44326k = m44326k(interfaceC28601c1);
            if (lM44326k == null) {
                c28655q.m87150e0(1227394322);
                z13 = false;
                c28655q.m87173q(false);
                c0209i3 = c0209i;
                interfaceC28601c2 = interfaceC28601c1;
                c2314t2 = c2314t;
                c0209i4 = c0209i2;
                f13 = 1.0f;
            } else {
                c28655q.m87150e0(1227394323);
                c15726aM44335t = m44335t(viewState.m44340e(), lM44326k.longValue());
                if (c15726aM44335t != null) {
                    strM44308f = "";
                } else {
                    strM44308f = "";
                }
                String strM21275i2 = AbstractC8693b.m21275i(strM44308f, c28655q, 0);
                C38072d c38072d2 = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                C2886a c2886aM8420a2 = c38072d2.m121952e(c28655q, i25).getB1();
                interfaceC28601c2 = interfaceC28601c1;
                c0209i3 = c0209i;
                z13 = false;
                c0209i4 = c0209i2;
                c2314t2 = c2314t;
                f13 = 1.0f;
                AbstractC30795n.m94707h(strM21275i2, null, c38072d2.m121949b(c28655q, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            if (f13 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(f13, true, c28655q);
            Modifier modifierM3424u2 = AbstractC1102d.m3424u(30 * 4, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z13);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3424u2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
            C17858a c17858a2 = new C17858a();
            C17863f c17863fM44339c2 = viewState.getDateSelectorState();
            i16 = i15 & 896;
            if (i16 == 256) {
                z14 = true;
            } else {
                z14 = z13;
            }
            objM87133R2 = c28655q.m87133R();
            if (!z14) {
                c28676v1 = c28676v0;
                if (objM87133R2 == c28676v1) {
                    function6 = function5;
                }
                c17858a2.Compose(c2314t2, c17863fM44339c2, (Function1) objM87133R2, c28655q, (C17863f.f69516k << 3) | 6 | (C17858a.f69479a << 9));
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                f14 = 8;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(3 * f14, c2314t2));
                List<C15726a> listM44340e3 = viewState.m44340e();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM44340e3, 10));
                it = listM44340e3.iterator();
                r10 = z13;
                while (true) {
                    if (it.hasNext()) {
                        if (i16 == 256) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            interfaceC28601c3 = interfaceC28601c2;
                            objM87133R3 = new C9810f(function6, interfaceC28601c3);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            interfaceC28601c3 = interfaceC28601c2;
                            objM87133R3 = new C9810f(function6, interfaceC28601c3);
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q4 = c28655q;
                        function7 = function6;
                        AbstractC16611f.m47150h(null, arrayList, (InterfaceC4351m) objM87133R3, null, null, null, null, null, c28655q4, 0, 249);
                        c28655q = c28655q4;
                        lM44326k2 = m44326k(interfaceC28601c3);
                        if (lM44326k2 != null) {
                            c15726aM44335t3 = m44335t(viewState.m44340e(), lM44326k2.longValue());
                            if (c15726aM44335t3 != null) {
                                interfaceC25312uM44306d = c15726aM44335t3.getInfoCalloutState();
                            } else {
                                interfaceC25312uM44306d = null;
                            }
                        } else {
                            interfaceC25312uM44306d = null;
                        }
                        if (interfaceC25312uM44306d == null) {
                            c28655q.m87150e0(-1177615015);
                            c28655q.m87173q(z13);
                        } else {
                            c28655q.m87150e0(-1177615014);
                            C13168a c13168a5 = new C13168a(28);
                            if (i16 == 256) {
                                z16 = true;
                            } else {
                                z16 = z13;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z16) {
                                objM87133R4 = new C15728c(function7, 2);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C15728c(function7, 2);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC25303l.m74291r(interfaceC25312uM44306d, null, c13168a5, (Function1) objM87133R4, c28655q, 0, 2);
                            c28655q.m87173q(z13);
                        }
                        if (viewState.m44340e().isEmpty()) {
                            c28655q.m87150e0(-1177095795);
                            lM44326k3 = m44326k(interfaceC28601c3);
                            if (lM44326k3 != null) {
                                c15726aM44335t2 = m44335t(viewState.m44340e(), lM44326k3.longValue());
                            } else {
                                c15726aM44335t2 = null;
                            }
                            if (c15726aM44335t2 != null) {
                            }
                            if (listM44307e == null) {
                                c28655q.m87150e0(-1176941385);
                                c28655q.m87173q(z13);
                            } else {
                                c28655q.m87150e0(-1176941384);
                                while (r3.hasNext()) {
                                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f14, c2314t2));
                                    C25307p c25307pM74678B2 = AbstractC25448c.m74678B0();
                                    C13168a c13168a6 = new C13168a(29);
                                    if (i16 == 256) {
                                        z17 = true;
                                    } else {
                                        z17 = z13;
                                    }
                                    objM87133R5 = c28655q.m87133R();
                                    if (z17) {
                                        objM87133R5 = new C15728c(function7, 3);
                                        c28655q.m87172p0(objM87133R5);
                                    } else {
                                        objM87133R5 = new C15728c(function7, 3);
                                        c28655q.m87172p0(objM87133R5);
                                    }
                                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B2, c13168a6, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                                }
                                c28655q.m87173q(z13);
                            }
                            c28655q.m87173q(z13);
                        } else {
                            c28655q.m87150e0(-1176463457);
                            c28655q.m87173q(z13);
                        }
                        c28655q.m87173q(true);
                        function3 = function7;
                        modifier2 = modifier3;
                        break;
                    }
                    next = it.next();
                    i17 = r10 + 1;
                    if (r10 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C16613h c16613hM44305c3 = ((C15726a) next).getDatePillState();
                    long j14 = (long) r10;
                    lM44326k4 = m44326k(interfaceC28601c2);
                    if (lM44326k4 == null) {
                        z18 = z13;
                    } else {
                        z18 = true;
                    }
                    arrayList.add(c16613hM44305c3.m47163a((16347 & 1) != 0 ? c16613hM44305c3.dateDisplay : null, (16347 & 2) != 0 ? c16613hM44305c3.multiDayCycleDateDisplay : null, (16347 & 4) != 0 ? c16613hM44305c3.isSelected : z18, (16347 & 8) != 0 ? c16613hM44305c3.style : null, (16347 & 16) != 0 ? c16613hM44305c3.com.mapbox.common.HttpHeaders.DATE java.lang.String : null, (16347 & 32) != 0 ? c16613hM44305c3.cycleId : Long.valueOf(j14), (16347 & 64) != 0 ? c16613hM44305c3.icon : null, (16347 & 128) != 0 ? c16613hM44305c3.showDot : false, (16347 & 256) != 0 ? c16613hM44305c3.showDashBorder : false, (16347 & 512) != 0 ? c16613hM44305c3.dotColorOverride : null, (16347 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c16613hM44305c3.destination : null, (16347 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c16613hM44305c3.interaction : null, (16347 & 4096) != 0 ? c16613hM44305c3.isClickable : false, (16347 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c16613hM44305c3.contentDescription : null));
                    r10 = i17;
                }
            } else {
                c28676v1 = c28676v0;
            }
            function6 = function5;
            objM87133R2 = new C15728c(function6, 1);
            c28655q.m87172p0(objM87133R2);
            c17858a2.Compose(c2314t2, c17863fM44339c2, (Function1) objM87133R2, c28655q, (C17863f.f69516k << 3) | 6 | (C17858a.f69479a << 9));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            f14 = 8;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(3 * f14, c2314t2));
            List<C15726a> listM44340e4 = viewState.m44340e();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM44340e4, 10));
            it = listM44340e4.iterator();
            r10 = z13;
            while (true) {
                if (it.hasNext()) {
                    if (i16 == 256) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        interfaceC28601c3 = interfaceC28601c2;
                        objM87133R3 = new C9810f(function6, interfaceC28601c3);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        interfaceC28601c3 = interfaceC28601c2;
                        objM87133R3 = new C9810f(function6, interfaceC28601c3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q5 = c28655q;
                    function7 = function6;
                    AbstractC16611f.m47150h(null, arrayList, (InterfaceC4351m) objM87133R3, null, null, null, null, null, c28655q5, 0, 249);
                    c28655q = c28655q5;
                    lM44326k2 = m44326k(interfaceC28601c3);
                    if (lM44326k2 != null) {
                        c15726aM44335t3 = m44335t(viewState.m44340e(), lM44326k2.longValue());
                        if (c15726aM44335t3 != null) {
                            interfaceC25312uM44306d = c15726aM44335t3.getInfoCalloutState();
                        } else {
                            interfaceC25312uM44306d = null;
                        }
                    } else {
                        interfaceC25312uM44306d = null;
                    }
                    if (interfaceC25312uM44306d == null) {
                        c28655q.m87150e0(-1177615015);
                        c28655q.m87173q(z13);
                    } else {
                        c28655q.m87150e0(-1177615014);
                        C13168a c13168a7 = new C13168a(28);
                        if (i16 == 256) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z16) {
                            objM87133R4 = new C15728c(function7, 2);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C15728c(function7, 2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC25303l.m74291r(interfaceC25312uM44306d, null, c13168a7, (Function1) objM87133R4, c28655q, 0, 2);
                        c28655q.m87173q(z13);
                    }
                    if (viewState.m44340e().isEmpty()) {
                        c28655q.m87150e0(-1177095795);
                        lM44326k3 = m44326k(interfaceC28601c3);
                        if (lM44326k3 != null) {
                            c15726aM44335t2 = m44335t(viewState.m44340e(), lM44326k3.longValue());
                        } else {
                            c15726aM44335t2 = null;
                        }
                        if (c15726aM44335t2 != null) {
                        }
                        if (listM44307e == null) {
                            c28655q.m87150e0(-1176941385);
                            c28655q.m87173q(z13);
                        } else {
                            c28655q.m87150e0(-1176941384);
                            while (r3.hasNext()) {
                                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f14, c2314t2));
                                C25307p c25307pM74678B3 = AbstractC25448c.m74678B0();
                                C13168a c13168a8 = new C13168a(29);
                                if (i16 == 256) {
                                    z17 = true;
                                } else {
                                    z17 = z13;
                                }
                                objM87133R5 = c28655q.m87133R();
                                if (z17) {
                                    objM87133R5 = new C15728c(function7, 3);
                                    c28655q.m87172p0(objM87133R5);
                                } else {
                                    objM87133R5 = new C15728c(function7, 3);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B3, c13168a8, (Function1) objM87133R5, c28655q, C25307p.f99300b << 3, 0);
                            }
                            c28655q.m87173q(z13);
                        }
                        c28655q.m87173q(z13);
                    } else {
                        c28655q.m87150e0(-1176463457);
                        c28655q.m87173q(z13);
                    }
                    c28655q.m87173q(true);
                    function3 = function7;
                    modifier2 = modifier3;
                    break;
                }
                next = it.next();
                i17 = r10 + 1;
                if (r10 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C16613h c16613hM44305c4 = ((C15726a) next).getDatePillState();
                long j15 = (long) r10;
                lM44326k4 = m44326k(interfaceC28601c2);
                if (lM44326k4 == null) {
                    z18 = z13;
                } else {
                    z18 = true;
                }
                arrayList.add(c16613hM44305c4.m47163a((16347 & 1) != 0 ? c16613hM44305c4.dateDisplay : null, (16347 & 2) != 0 ? c16613hM44305c4.multiDayCycleDateDisplay : null, (16347 & 4) != 0 ? c16613hM44305c4.isSelected : z18, (16347 & 8) != 0 ? c16613hM44305c4.style : null, (16347 & 16) != 0 ? c16613hM44305c4.com.mapbox.common.HttpHeaders.DATE java.lang.String : null, (16347 & 32) != 0 ? c16613hM44305c4.cycleId : Long.valueOf(j15), (16347 & 64) != 0 ? c16613hM44305c4.icon : null, (16347 & 128) != 0 ? c16613hM44305c4.showDot : false, (16347 & 256) != 0 ? c16613hM44305c4.showDashBorder : false, (16347 & 512) != 0 ? c16613hM44305c4.dotColorOverride : null, (16347 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c16613hM44305c4.destination : null, (16347 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c16613hM44305c4.interaction : null, (16347 & 4096) != 0 ? c16613hM44305c4.isClickable : false, (16347 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c16613hM44305c4.contentDescription : null));
                r10 = i17;
            }
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 12, modifier2, function3, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m44325j(AbstractC15727b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final Long m44326k(InterfaceC28601c1 interfaceC28601c1) {
        return (Long) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m44327l(InterfaceC28601c1 interfaceC28601c1, Long l7) {
        interfaceC28601c1.setValue(l7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m44328m(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof String) {
            function1.invoke(new AbstractC15727b.c((String) event));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m44329n(Function1 function1, InterfaceC28601c1 interfaceC28601c1, String date, Long l7) {
        AbstractC22676k.m65750j(date, "date");
        if (l7 != null) {
            m44327l(interfaceC28601c1, l7);
            function1.invoke(new AbstractC15727b.b(date));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Modifier m44330o(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-15208161);
        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(C2314t.f9131w, f59245a, 0.0f, 2), 0.0f, 2 * 8, 0.0f, 0.0f, 13);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m44331p(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new AbstractC15727b.a(event));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Modifier m44332q(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1070923509);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, f59245a, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m44333r(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new AbstractC15727b.a(event));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m44334s(Modifier modifier, C15731f c15731f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m44324i(modifier, c15731f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final C15726a m44335t(List<C15726a> list, long j7) {
        Object next;
        AbstractC22676k.m65750j(list, "<this>");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            Long cycleId = ((C15726a) next).getDatePillState().getCycleId();
            if (cycleId != null && cycleId.longValue() == j7) {
                return (C15726a) next;
            }
        }
        next = null;
        return (C15726a) next;
    }

    /* JADX INFO: renamed from: u */
    private static final Long m44336u(C15731f c15731f) {
        Object next;
        C16613h c16613hM44305c;
        C16613h c16613hM44305c2;
        Long cycleId;
        Iterator<T> it = c15731f.m44340e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((C15726a) next).getDatePillState().getIsSelected());
        C15726a c15726a = (C15726a) next;
        if (c15726a != null && (c16613hM44305c2 = c15726a.getDatePillState()) != null && (cycleId = c16613hM44305c2.getCycleId()) != null) {
            return cycleId;
        }
        C15726a c15726a2 = (C15726a) AbstractC25265s.m74100H0(c15731f.m44340e());
        if (c15726a2 == null || (c16613hM44305c = c15726a2.getDatePillState()) == null) {
            return null;
        }
        return c16613hM44305c.getCycleId();
    }
}
