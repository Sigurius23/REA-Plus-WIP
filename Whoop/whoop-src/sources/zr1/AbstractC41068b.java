package zr1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cs1.AbstractC11103c;
import ds1.AbstractC12331a;
import gy0.AbstractC16277f;
import java.util.List;
import km0.C22581e;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
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
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.Function0;
import uw0.AbstractC35302l;
import v41.AbstractC35664f;
import v71.C35766g;
import wb3.AbstractC37056f;
import wo1.C37450h;
import yo1.C39689b;
import zm1.C40893d;
import zo2.C40934e;

/* JADX INFO: renamed from: zr1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001aU\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lds1/a$a;", "bottomSheet", "Lv41/f$a;", "bottomSheetGestures", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function1;", "Lcs1/c;", "Ll83/a0;", "onViewEvent", "", "onSearchFieldFocusChanged", "i", "(Lds1/a$a;Lv41/f$a;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "", "r", "(Lds1/a$a;)Ljava/util/List;", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41068b {
    /* JADX WARN: Code duplicated, block: B:101:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x0197  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:109:0x020d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0211  */
    /* JADX WARN: Code duplicated, block: B:113:0x0224  */
    /* JADX WARN: Code duplicated, block: B:115:0x0232  */
    /* JADX WARN: Code duplicated, block: B:117:0x026c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0293  */
    /* JADX WARN: Code duplicated, block: B:120:0x0295  */
    /* JADX WARN: Code duplicated, block: B:123:0x029d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x029f  */
    /* JADX WARN: Code duplicated, block: B:127:0x02af  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:139:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:151:0x0337  */
    /* JADX WARN: Code duplicated, block: B:154:0x0343  */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1 A[PHI: r4 r5 r8
      0x00c1: PHI (r4v19 int) = (r4v14 int), (r4v11 int), (r4v21 int) binds: [B:79:0x00f0, B:65:0x00bd, B:66:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r5v22 bc3.c0) = (r5v6 bc3.c0), (r5v3 bc3.c0), (r5v3 bc3.c0) binds: [B:79:0x00f0, B:65:0x00bd, B:66:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r8v24 kotlin.jvm.functions.Function1) = (r8v4 kotlin.jvm.functions.Function1), (r8v2 kotlin.jvm.functions.Function1), (r8v2 kotlin.jvm.functions.Function1) binds: [B:79:0x00f0, B:65:0x00bd, B:66:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0117  */
    /* JADX WARN: Code duplicated, block: B:88:0x0145  */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:92:0x015c  */
    /* JADX WARN: Code duplicated, block: B:94:0x016a  */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    /* JADX WARN: Code duplicated, block: B:98:0x018e  */
    /* JADX INFO: renamed from: i */
    public static final void m133321i(AbstractC12331a.a bottomSheet, AbstractC35664f.a bottomSheetGestures, InterfaceC2994c0 interfaceC2994c0, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC2994c0 interfaceC2994c1;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        InterfaceC2994c0 interfaceC2994c2;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        int i18;
        C28676v0 c28676v0;
        Object objM87133R;
        Function1 function7;
        int i19;
        InterfaceC2994c0 interfaceC2994c3;
        Function1 function8;
        Object objM87133R2;
        Object objM87133R3;
        boolean zM34422e;
        C2314t c2314t;
        Function1 function9;
        int i24;
        boolean z13;
        Object objM87133R4;
        boolean z14;
        boolean zM87157i;
        Object objM87133R5;
        boolean z15;
        Object objM87133R6;
        boolean z16;
        Object objM87133R7;
        Function1 function10;
        Function1 function11;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean z17;
        Object objM87133R8;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        AbstractC22676k.m65750j(bottomSheetGestures, "bottomSheetGestures");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1691891060);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(bottomSheet) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(bottomSheetGestures) : c28655q.m87157i(bottomSheetGestures) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                interfaceC2994c1 = interfaceC2994c0;
                int i25 = c28655q.m87157i(interfaceC2994c1) ? 256 : 128;
                i15 |= i25;
            } else {
                interfaceC2994c1 = interfaceC2994c0;
            }
            i15 |= i25;
        } else {
            interfaceC2994c1 = interfaceC2994c0;
        }
        int i26 = i14 & 8;
        if (i26 == 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i18 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0 || c28655q.m87118C()) {
                        if ((i14 & 4) != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87262p(c28655q);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC2994c1 = (InterfaceC2994c0) objM87133R3;
                            i15 &= -897;
                        }
                        if (i26 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C40893d(7);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        }
                        if (i16 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C40893d(8);
                                c28655q.m87172p0(objM87133R);
                            }
                            function7 = (Function1) objM87133R;
                            i19 = i15;
                            interfaceC2994c3 = interfaceC2994c1;
                            function8 = function3;
                        }
                        c28655q.m87175r();
                        zM34422e = bottomSheet.getIsError();
                        c2314t = C2314t.f9131w;
                        if (zM34422e) {
                            c28655q.m87150e0(-1684983602);
                            Modifier modifierM3406c = AbstractC1102d.m3406c(0.9f, c2314t);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i2 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            Modifier modifierM3406c2 = AbstractC1102d.m3406c(0.9f, c2314t);
                            AbstractC33208p0.b bVarM105280v = Function0.m105280v();
                            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62283T1);
                            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC16277f.f62292W1);
                            if ((i19 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R8 = c28655q.m87133R();
                            if (z17 || objM87133R8 == c28676v0) {
                                objM87133R8 = new C40934e(function8, 1);
                                c28655q.m87172p0(objM87133R8);
                            }
                            int i27 = AbstractC33208p0.b.f138467h | 805306368;
                            int i28 = TextResource.C8688b.f25889c;
                            function9 = function8;
                            AbstractC33199m0.m105214F(bVarM105280v, c8688bM21277k, null, c8688bM21277k2, (InterfaceC4339a) objM87133R8, false, false, null, null, modifierM3406c2, true, false, c28655q, i27 | (i28 << 3) | (i28 << 9), 6, 2532);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            function9 = function8;
                            if (bottomSheet.getIsLoading()) {
                                c28655q.m87150e0(-1684379195);
                                Modifier modifierM3406c3 = AbstractC1102d.m3406c(0.9f, c2314t);
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3406c3);
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
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, AbstractC1102d.m3406c(0.9f, c2314t), true, false, c28655q, AbstractC33208p0.c.f138472f | 805306368 | (TextResource.$stable << 3), 6, 2556);
                                c28655q = c28655q;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-1684005149);
                                C22581e c22581eM34418a = bottomSheet.getBottomSheetViewState();
                                int iIndexOf = bottomSheet.getBottomSheetViewState().m65420e().indexOf(bottomSheet.getBottomSheetViewState().getCurrentCategory());
                                i24 = i19 & 7168;
                                if (i24 == 2048) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objM87133R4 = c28655q.m87133R();
                                if (z13 || objM87133R4 == c28676v0) {
                                    objM87133R4 = new C37450h(function9, 28);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                Function1 function12 = (Function1) objM87133R4;
                                if (i24 == 2048) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                zM87157i = c28655q.m87157i(bottomSheet) | z14;
                                objM87133R5 = c28655q.m87133R();
                                if (zM87157i || objM87133R5 == c28676v0) {
                                    objM87133R5 = new C39689b(23, function9, bottomSheet);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
                                if (i24 == 2048) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                objM87133R6 = c28655q.m87133R();
                                if (z15 || objM87133R6 == c28676v0) {
                                    objM87133R6 = new C37450h(function9, 29);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                Function1 function13 = (Function1) objM87133R6;
                                if (i24 == 2048) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objM87133R7 = c28655q.m87133R();
                                if (z16 || objM87133R7 == c28676v0) {
                                    objM87133R7 = new C41067a(function9, 0);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                function10 = function9;
                                function11 = function7;
                                AbstractC35302l.m112030o(c22581eM34418a, iIndexOf, interfaceC2994c3, bottomSheetGestures, false, true, function12, interfaceC4339a, function13, (Function1) objM87133R7, function11, c28655q, 221184 | C22581e.f88865n | (i19 & 896) | (AbstractC35664f.a.f151587c << 9) | ((i19 << 6) & 7168), (i19 >> 12) & 14, 0);
                                c28655q.m87173q(false);
                            }
                            interfaceC2994c2 = interfaceC2994c3;
                            function6 = function11;
                            function5 = function10;
                        }
                        function10 = function9;
                        function11 = function7;
                        interfaceC2994c2 = interfaceC2994c3;
                        function6 = function11;
                        function5 = function10;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 4) != 0) {
                            i15 &= -897;
                        }
                    }
                    i19 = i15;
                    interfaceC2994c3 = interfaceC2994c1;
                    function8 = function3;
                    function7 = function4;
                    c28655q.m87175r();
                    zM34422e = bottomSheet.getIsError();
                    c2314t = C2314t.f9131w;
                    if (zM34422e) {
                        c28655q.m87150e0(-1684983602);
                        Modifier modifierM3406c4 = AbstractC1102d.m3406c(0.9f, c2314t);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3406c4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        Modifier modifierM3406c5 = AbstractC1102d.m3406c(0.9f, c2314t);
                        AbstractC33208p0.b bVarM105280v2 = Function0.m105280v();
                        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC16277f.f62283T1);
                        TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC16277f.f62292W1);
                        if ((i19 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z17) {
                            objM87133R8 = new C40934e(function8, 1);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C40934e(function8, 1);
                            c28655q.m87172p0(objM87133R8);
                        }
                        int i29 = AbstractC33208p0.b.f138467h | 805306368;
                        int i210 = TextResource.C8688b.f25889c;
                        function9 = function8;
                        AbstractC33199m0.m105214F(bVarM105280v2, c8688bM21277k3, null, c8688bM21277k4, (InterfaceC4339a) objM87133R8, false, false, null, null, modifierM3406c5, true, false, c28655q, i29 | (i210 << 3) | (i210 << 9), 6, 2532);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        function9 = function8;
                        if (bottomSheet.getIsLoading()) {
                            c28655q.m87150e0(-1684379195);
                            Modifier modifierM3406c6 = AbstractC1102d.m3406c(0.9f, c2314t);
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3406c6);
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
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, AbstractC1102d.m3406c(0.9f, c2314t), true, false, c28655q, AbstractC33208p0.c.f138472f | 805306368 | (TextResource.$stable << 3), 6, 2556);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1684005149);
                            C22581e c22581eM34418a2 = bottomSheet.getBottomSheetViewState();
                            int iIndexOf2 = bottomSheet.getBottomSheetViewState().m65420e().indexOf(bottomSheet.getBottomSheetViewState().getCurrentCategory());
                            i24 = i19 & 7168;
                            if (i24 == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z13) {
                                objM87133R4 = new C37450h(function9, 28);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C37450h(function9, 28);
                                c28655q.m87172p0(objM87133R4);
                            }
                            Function1 function14 = (Function1) objM87133R4;
                            if (i24 == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            zM87157i = c28655q.m87157i(bottomSheet) | z14;
                            objM87133R5 = c28655q.m87133R();
                            if (zM87157i) {
                                objM87133R5 = new C39689b(23, function9, bottomSheet);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C39689b(23, function9, bottomSheet);
                                c28655q.m87172p0(objM87133R5);
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
                            if (i24 == 2048) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z15) {
                                objM87133R6 = new C37450h(function9, 29);
                                c28655q.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new C37450h(function9, 29);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Function1 function15 = (Function1) objM87133R6;
                            if (i24 == 2048) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z16) {
                                objM87133R7 = new C41067a(function9, 0);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                objM87133R7 = new C41067a(function9, 0);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function10 = function9;
                            function11 = function7;
                            AbstractC35302l.m112030o(c22581eM34418a2, iIndexOf2, interfaceC2994c3, bottomSheetGestures, false, true, function14, interfaceC4339a2, function15, (Function1) objM87133R7, function11, c28655q, 221184 | C22581e.f88865n | (i19 & 896) | (AbstractC35664f.a.f151587c << 9) | ((i19 << 6) & 7168), (i19 >> 12) & 14, 0);
                            c28655q.m87173q(false);
                        }
                        interfaceC2994c2 = interfaceC2994c3;
                        function6 = function11;
                        function5 = function10;
                    }
                    function10 = function9;
                    function11 = function7;
                    interfaceC2994c2 = interfaceC2994c3;
                    function6 = function11;
                    function5 = function10;
                } else {
                    c28655q.m87138X();
                    interfaceC2994c2 = interfaceC2994c1;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) bottomSheet, (Object) bottomSheetGestures, (Object) interfaceC2994c2, function5, function6, i13, i14, 14);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if ((i14 & 4) != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC2994c1 = (InterfaceC2994c0) objM87133R3;
                        i15 &= -897;
                    }
                    if (i26 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C40893d(7);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C40893d(8);
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        i19 = i15;
                        interfaceC2994c3 = interfaceC2994c1;
                        function8 = function3;
                    } else {
                        i19 = i15;
                        interfaceC2994c3 = interfaceC2994c1;
                        function8 = function3;
                        function7 = function4;
                    }
                } else {
                    if ((i14 & 4) != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC2994c1 = (InterfaceC2994c0) objM87133R3;
                        i15 &= -897;
                    }
                    if (i26 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C40893d(7);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C40893d(8);
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        i19 = i15;
                        interfaceC2994c3 = interfaceC2994c1;
                        function8 = function3;
                    } else {
                        i19 = i15;
                        interfaceC2994c3 = interfaceC2994c1;
                        function8 = function3;
                        function7 = function4;
                    }
                }
                c28655q.m87175r();
                zM34422e = bottomSheet.getIsError();
                c2314t = C2314t.f9131w;
                if (zM34422e) {
                    c28655q.m87150e0(-1684983602);
                    Modifier modifierM3406c7 = AbstractC1102d.m3406c(0.9f, c2314t);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3406c7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    Modifier modifierM3406c8 = AbstractC1102d.m3406c(0.9f, c2314t);
                    AbstractC33208p0.b bVarM105280v3 = Function0.m105280v();
                    TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC16277f.f62283T1);
                    TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC16277f.f62292W1);
                    if ((i19 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z17) {
                        objM87133R8 = new C40934e(function8, 1);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C40934e(function8, 1);
                        c28655q.m87172p0(objM87133R8);
                    }
                    int i211 = AbstractC33208p0.b.f138467h | 805306368;
                    int i212 = TextResource.C8688b.f25889c;
                    function9 = function8;
                    AbstractC33199m0.m105214F(bVarM105280v3, c8688bM21277k5, null, c8688bM21277k6, (InterfaceC4339a) objM87133R8, false, false, null, null, modifierM3406c8, true, false, c28655q, i211 | (i212 << 3) | (i212 << 9), 6, 2532);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function9 = function8;
                    if (bottomSheet.getIsLoading()) {
                        c28655q.m87150e0(-1684379195);
                        Modifier modifierM3406c9 = AbstractC1102d.m3406c(0.9f, c2314t);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3406c9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, AbstractC1102d.m3406c(0.9f, c2314t), true, false, c28655q, AbstractC33208p0.c.f138472f | 805306368 | (TextResource.$stable << 3), 6, 2556);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1684005149);
                        C22581e c22581eM34418a3 = bottomSheet.getBottomSheetViewState();
                        int iIndexOf3 = bottomSheet.getBottomSheetViewState().m65420e().indexOf(bottomSheet.getBottomSheetViewState().getCurrentCategory());
                        i24 = i19 & 7168;
                        if (i24 == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z13) {
                            objM87133R4 = new C37450h(function9, 28);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C37450h(function9, 28);
                            c28655q.m87172p0(objM87133R4);
                        }
                        Function1 function16 = (Function1) objM87133R4;
                        if (i24 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i = c28655q.m87157i(bottomSheet) | z14;
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R5 = new C39689b(23, function9, bottomSheet);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C39689b(23, function9, bottomSheet);
                            c28655q.m87172p0(objM87133R5);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                        if (i24 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z15) {
                            objM87133R6 = new C37450h(function9, 29);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C37450h(function9, 29);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function17 = (Function1) objM87133R6;
                        if (i24 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z16) {
                            objM87133R7 = new C41067a(function9, 0);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C41067a(function9, 0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = function9;
                        function11 = function7;
                        AbstractC35302l.m112030o(c22581eM34418a3, iIndexOf3, interfaceC2994c3, bottomSheetGestures, false, true, function16, interfaceC4339a3, function17, (Function1) objM87133R7, function11, c28655q, 221184 | C22581e.f88865n | (i19 & 896) | (AbstractC35664f.a.f151587c << 9) | ((i19 << 6) & 7168), (i19 >> 12) & 14, 0);
                        c28655q.m87173q(false);
                    }
                    interfaceC2994c2 = interfaceC2994c3;
                    function6 = function11;
                    function5 = function10;
                }
                function10 = function9;
                function11 = function7;
                interfaceC2994c2 = interfaceC2994c3;
                function6 = function11;
                function5 = function10;
            } else {
                c28655q.m87138X();
                interfaceC2994c2 = interfaceC2994c1;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) bottomSheet, (Object) bottomSheetGestures, (Object) interfaceC2994c2, function5, function6, i13, i14, 14);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if ((i14 & 4) != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC2994c1 = (InterfaceC2994c0) objM87133R3;
                        i15 &= -897;
                    }
                    if (i26 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C40893d(7);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C40893d(8);
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        i19 = i15;
                        interfaceC2994c3 = interfaceC2994c1;
                        function8 = function3;
                    } else {
                        i19 = i15;
                        interfaceC2994c3 = interfaceC2994c1;
                        function8 = function3;
                        function7 = function4;
                    }
                } else {
                    if ((i14 & 4) != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC2994c1 = (InterfaceC2994c0) objM87133R3;
                        i15 &= -897;
                    }
                    if (i26 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C40893d(7);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C40893d(8);
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                        i19 = i15;
                        interfaceC2994c3 = interfaceC2994c1;
                        function8 = function3;
                    } else {
                        i19 = i15;
                        interfaceC2994c3 = interfaceC2994c1;
                        function8 = function3;
                        function7 = function4;
                    }
                }
                c28655q.m87175r();
                zM34422e = bottomSheet.getIsError();
                c2314t = C2314t.f9131w;
                if (zM34422e) {
                    c28655q.m87150e0(-1684983602);
                    Modifier modifierM3406c10 = AbstractC1102d.m3406c(0.9f, c2314t);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3406c10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    Modifier modifierM3406c11 = AbstractC1102d.m3406c(0.9f, c2314t);
                    AbstractC33208p0.b bVarM105280v4 = Function0.m105280v();
                    TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC16277f.f62283T1);
                    TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC16277f.f62292W1);
                    if ((i19 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z17) {
                        objM87133R8 = new C40934e(function8, 1);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C40934e(function8, 1);
                        c28655q.m87172p0(objM87133R8);
                    }
                    int i213 = AbstractC33208p0.b.f138467h | 805306368;
                    int i214 = TextResource.C8688b.f25889c;
                    function9 = function8;
                    AbstractC33199m0.m105214F(bVarM105280v4, c8688bM21277k7, null, c8688bM21277k8, (InterfaceC4339a) objM87133R8, false, false, null, null, modifierM3406c11, true, false, c28655q, i213 | (i214 << 3) | (i214 << 9), 6, 2532);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function9 = function8;
                    if (bottomSheet.getIsLoading()) {
                        c28655q.m87150e0(-1684379195);
                        Modifier modifierM3406c12 = AbstractC1102d.m3406c(0.9f, c2314t);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3406c12);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, AbstractC1102d.m3406c(0.9f, c2314t), true, false, c28655q, AbstractC33208p0.c.f138472f | 805306368 | (TextResource.$stable << 3), 6, 2556);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1684005149);
                        C22581e c22581eM34418a4 = bottomSheet.getBottomSheetViewState();
                        int iIndexOf4 = bottomSheet.getBottomSheetViewState().m65420e().indexOf(bottomSheet.getBottomSheetViewState().getCurrentCategory());
                        i24 = i19 & 7168;
                        if (i24 == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z13) {
                            objM87133R4 = new C37450h(function9, 28);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C37450h(function9, 28);
                            c28655q.m87172p0(objM87133R4);
                        }
                        Function1 function18 = (Function1) objM87133R4;
                        if (i24 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i = c28655q.m87157i(bottomSheet) | z14;
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R5 = new C39689b(23, function9, bottomSheet);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C39689b(23, function9, bottomSheet);
                            c28655q.m87172p0(objM87133R5);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                        if (i24 == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z15) {
                            objM87133R6 = new C37450h(function9, 29);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C37450h(function9, 29);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function19 = (Function1) objM87133R6;
                        if (i24 == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z16) {
                            objM87133R7 = new C41067a(function9, 0);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C41067a(function9, 0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = function9;
                        function11 = function7;
                        AbstractC35302l.m112030o(c22581eM34418a4, iIndexOf4, interfaceC2994c3, bottomSheetGestures, false, true, function18, interfaceC4339a4, function19, (Function1) objM87133R7, function11, c28655q, 221184 | C22581e.f88865n | (i19 & 896) | (AbstractC35664f.a.f151587c << 9) | ((i19 << 6) & 7168), (i19 >> 12) & 14, 0);
                        c28655q.m87173q(false);
                    }
                    interfaceC2994c2 = interfaceC2994c3;
                    function6 = function11;
                    function5 = function10;
                }
                function10 = function9;
                function11 = function7;
                interfaceC2994c2 = interfaceC2994c3;
                function6 = function11;
                function5 = function10;
            } else {
                c28655q.m87138X();
                interfaceC2994c2 = interfaceC2994c1;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) bottomSheet, (Object) bottomSheetGestures, (Object) interfaceC2994c2, function5, function6, i13, i14, 14);
            }
        }
        i15 |= 24576;
        function4 = function2;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i18 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if ((i14 & 4) != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2994c1 = (InterfaceC2994c0) objM87133R3;
                    i15 &= -897;
                }
                if (i26 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C40893d(7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C40893d(8);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                    i19 = i15;
                    interfaceC2994c3 = interfaceC2994c1;
                    function8 = function3;
                } else {
                    i19 = i15;
                    interfaceC2994c3 = interfaceC2994c1;
                    function8 = function3;
                    function7 = function4;
                }
            } else {
                if ((i14 & 4) != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2994c1 = (InterfaceC2994c0) objM87133R3;
                    i15 &= -897;
                }
                if (i26 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C40893d(7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C40893d(8);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                    i19 = i15;
                    interfaceC2994c3 = interfaceC2994c1;
                    function8 = function3;
                } else {
                    i19 = i15;
                    interfaceC2994c3 = interfaceC2994c1;
                    function8 = function3;
                    function7 = function4;
                }
            }
            c28655q.m87175r();
            zM34422e = bottomSheet.getIsError();
            c2314t = C2314t.f9131w;
            if (zM34422e) {
                c28655q.m87150e0(-1684983602);
                Modifier modifierM3406c13 = AbstractC1102d.m3406c(0.9f, c2314t);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3406c13);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                Modifier modifierM3406c14 = AbstractC1102d.m3406c(0.9f, c2314t);
                AbstractC33208p0.b bVarM105280v5 = Function0.m105280v();
                TextResource.C8688b c8688bM21277k9 = AbstractC8693b.m21277k(AbstractC16277f.f62283T1);
                TextResource.C8688b c8688bM21277k10 = AbstractC8693b.m21277k(AbstractC16277f.f62292W1);
                if ((i19 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z17) {
                    objM87133R8 = new C40934e(function8, 1);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C40934e(function8, 1);
                    c28655q.m87172p0(objM87133R8);
                }
                int i215 = AbstractC33208p0.b.f138467h | 805306368;
                int i216 = TextResource.C8688b.f25889c;
                function9 = function8;
                AbstractC33199m0.m105214F(bVarM105280v5, c8688bM21277k9, null, c8688bM21277k10, (InterfaceC4339a) objM87133R8, false, false, null, null, modifierM3406c14, true, false, c28655q, i215 | (i216 << 3) | (i216 << 9), 6, 2532);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                function9 = function8;
                if (bottomSheet.getIsLoading()) {
                    c28655q.m87150e0(-1684379195);
                    Modifier modifierM3406c15 = AbstractC1102d.m3406c(0.9f, c2314t);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3406c15);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, AbstractC1102d.m3406c(0.9f, c2314t), true, false, c28655q, AbstractC33208p0.c.f138472f | 805306368 | (TextResource.$stable << 3), 6, 2556);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1684005149);
                    C22581e c22581eM34418a5 = bottomSheet.getBottomSheetViewState();
                    int iIndexOf5 = bottomSheet.getBottomSheetViewState().m65420e().indexOf(bottomSheet.getBottomSheetViewState().getCurrentCategory());
                    i24 = i19 & 7168;
                    if (i24 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z13) {
                        objM87133R4 = new C37450h(function9, 28);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C37450h(function9, 28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    Function1 function110 = (Function1) objM87133R4;
                    if (i24 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = c28655q.m87157i(bottomSheet) | z14;
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R5 = new C39689b(23, function9, bottomSheet);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C39689b(23, function9, bottomSheet);
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R5;
                    if (i24 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z15) {
                        objM87133R6 = new C37450h(function9, 29);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C37450h(function9, 29);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function111 = (Function1) objM87133R6;
                    if (i24 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z16) {
                        objM87133R7 = new C41067a(function9, 0);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C41067a(function9, 0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function10 = function9;
                    function11 = function7;
                    AbstractC35302l.m112030o(c22581eM34418a5, iIndexOf5, interfaceC2994c3, bottomSheetGestures, false, true, function110, interfaceC4339a5, function111, (Function1) objM87133R7, function11, c28655q, 221184 | C22581e.f88865n | (i19 & 896) | (AbstractC35664f.a.f151587c << 9) | ((i19 << 6) & 7168), (i19 >> 12) & 14, 0);
                    c28655q.m87173q(false);
                }
                interfaceC2994c2 = interfaceC2994c3;
                function6 = function11;
                function5 = function10;
            }
            function10 = function9;
            function11 = function7;
            interfaceC2994c2 = interfaceC2994c3;
            function6 = function11;
            function5 = function10;
        } else {
            c28655q.m87138X();
            interfaceC2994c2 = interfaceC2994c1;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35766g((Object) bottomSheet, (Object) bottomSheetGestures, (Object) interfaceC2994c2, function5, function6, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m133322j(AbstractC11103c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m133323k(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m133324l(Function1 function1) {
        function1.invoke(AbstractC11103c.g.f35272a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m133325m(Function1 function1, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        function1.invoke(new AbstractC11103c.o(id4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m133326n(Function1 function1, AbstractC12331a.a aVar) {
        function1.invoke(new AbstractC11103c.m(aVar.m34419b(), m133330r(aVar)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m133327o(Function1 function1, int i13) {
        function1.invoke(new AbstractC11103c.c(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m133328p(Function1 function1, String query) {
        AbstractC22676k.m65750j(query, "query");
        function1.invoke(new AbstractC11103c.r(query));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m133329q(AbstractC12331a.a aVar, AbstractC35664f.a aVar2, InterfaceC2994c0 interfaceC2994c0, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m133321i(aVar, aVar2, interfaceC2994c0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final List<Integer> m133330r(AbstractC12331a.a bottomSheet) {
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        return bottomSheet.m34421d();
    }
}
