package jp1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fp1.C14676d;
import gb1.AbstractC15673b0;
import hp1.AbstractC17546f;
import hp1.C17545e;
import if0.C18451b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import io2.C20769k0;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13921a0;
import p251jg.C21650c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x21.AbstractC37861d;
import x81.C38072d;

/* JADX INFO: renamed from: jp1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lhp1/e;", "viewState", "Lkotlin/Function1;", "Lhp1/f;", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lhp1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "selectedNumber", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21856h {
    /* JADX WARN: Code duplicated, block: B:100:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:103:0x0313  */
    /* JADX WARN: Code duplicated, block: B:104:0x0315  */
    /* JADX WARN: Code duplicated, block: B:107:0x031c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0322  */
    /* JADX WARN: Code duplicated, block: B:112:0x0336  */
    /* JADX WARN: Code duplicated, block: B:115:0x0341  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x0158  */
    /* JADX WARN: Code duplicated, block: B:67:0x018b  */
    /* JADX WARN: Code duplicated, block: B:68:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:76:0x024c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0259  */
    /* JADX WARN: Code duplicated, block: B:80:0x0263  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:84:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:87:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e0 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: h */
    public static final void m61899h(C17545e viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C17545e c17545e;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        boolean z13;
        Object objM87133R2;
        Function1 function4;
        boolean z14;
        int iHashCode2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z15;
        boolean z16;
        Object objM87133R5;
        Function1 function5;
        Function1 function6;
        boolean z17;
        Object objM87133R6;
        Function1 function7;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1268022338);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C21650c(20);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Integer.valueOf(viewState.getMinValue()));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                TextResource textResourceM49896e = viewState.getNavigationTitle();
                TextResource textResourceM49895d = viewState.getNavigationSubtitle();
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C18451b(function3, 27);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i18 = TextResource.$stable;
                function4 = function3;
                AbstractC21865q.m61949e(textResourceM49896e, textResourceM49895d, 0, null, null, (InterfaceC4339a) objM87133R2, c28655q2, i18 | (i18 << 3), 28);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q2);
                float f13 = 3;
                Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, i18);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getT1(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
                float f14 = 4 * f13;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f14, c2314t));
                int iM61901j = m61901j(interfaceC28601c1);
                int iM49894c = viewState.getMinValue();
                int iM49893b = viewState.getMaxValue();
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R3 = new C13921a0(26, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                }
                Function1 function8 = (Function1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C21650c(21);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = interfaceC28601c2;
                AbstractC37861d.m121396i(null, iM61901j, iM49894c, iM49893b, false, function8, (Function1) objM87133R4, false, false, null, null, c28655q2, 102457350, 0, 1664);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f14, c2314t));
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i18);
                long jM125399i0 = c38072d.m121949b(c28655q2, i19).getSleepLightSleep();
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i15 & 14) != 4) {
                    c17545e = viewState;
                    boolean z18 = (i15 & 8) == 0 && c28655q2.m87157i(c17545e);
                    z16 = z18 | z15;
                    objM87133R5 = c28655q2.m87133R();
                    if (!z16 || objM87133R5 == c28676v0) {
                        function5 = function4;
                        objM87133R5 = new C18656a0(function5, c17545e, interfaceC28601c3, 12);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        function5 = function4;
                    }
                    function6 = function5;
                    AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, jM125399i0, null, false, (InterfaceC4339a) objM87133R5, c28655q2, 54, 104);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i16 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (!z17 || objM87133R6 == c28676v0) {
                        function7 = function6;
                        objM87133R6 = new C18451b(function7, 28);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function7 = function6;
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                    function2 = function7;
                } else {
                    c17545e = viewState;
                }
                z16 = z18 | z15;
                objM87133R5 = c28655q2.m87133R();
                if (z16) {
                    function5 = function4;
                    objM87133R5 = new C18656a0(function5, c17545e, interfaceC28601c3, 12);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    function5 = function4;
                    objM87133R5 = new C18656a0(function5, c17545e, interfaceC28601c3, 12);
                    c28655q2.m87172p0(objM87133R5);
                }
                function6 = function5;
                AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, jM125399i0, null, false, (InterfaceC4339a) objM87133R5, c28655q2, 54, 104);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z17) {
                    function7 = function6;
                    objM87133R6 = new C18451b(function7, 28);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function7 = function6;
                    objM87133R6 = new C18451b(function7, 28);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                function2 = function7;
            } else {
                c17545e = viewState;
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(c17545e, i13, function2, i14, 6);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C21650c(20);
                    c28655q2.m87172p0(objM87133R7);
                }
                function3 = (Function1) objM87133R7;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Integer.valueOf(viewState.getMinValue()));
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            TextResource textResourceM49896e2 = viewState.getNavigationTitle();
            TextResource textResourceM49895d2 = viewState.getNavigationSubtitle();
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z13) {
                objM87133R2 = new C18451b(function3, 27);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C18451b(function3, 27);
                c28655q2.m87172p0(objM87133R2);
            }
            int i110 = TextResource.$stable;
            function4 = function3;
            AbstractC21865q.m61949e(textResourceM49896e2, textResourceM49895d2, 0, null, null, (InterfaceC4339a) objM87133R2, c28655q2, i110 | (i110 << 3), 28);
            if (1.0f > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q2);
            float f15 = 3;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(8 * f15, c2314t2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9111N, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            String strM21274h3 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h3, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d2.m121949b(c28655q2, i111).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i111).getT1(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
            float f16 = 4 * f15;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f16, c2314t2));
            int iM61901j2 = m61901j(interfaceC28601c1);
            int iM49894c2 = viewState.getMinValue();
            int iM49893b2 = viewState.getMaxValue();
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R3 = new C13921a0(26, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R3);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
            }
            Function1 function9 = (Function1) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C21650c(21);
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28601c3 = interfaceC28601c2;
            AbstractC37861d.m121396i(null, iM61901j2, iM49894c2, iM49893b2, false, function9, (Function1) objM87133R4, false, false, null, null, c28655q2, 102457350, 0, 1664);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f16, c2314t2));
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            String strM21274h4 = AbstractC8693b.m21274h(viewState.getButtonTitle(), c28655q2, i110);
            long jM125399i1 = c38072d2.m121949b(c28655q2, i111).getSleepLightSleep();
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i15 & 14) != 4) {
                c17545e = viewState;
                if ((i15 & 8) == 0) {
                }
                z16 = z18 | z15;
                objM87133R5 = c28655q2.m87133R();
                if (z16) {
                    function5 = function4;
                    objM87133R5 = new C18656a0(function5, c17545e, interfaceC28601c3, 12);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    function5 = function4;
                    objM87133R5 = new C18656a0(function5, c17545e, interfaceC28601c3, 12);
                    c28655q2.m87172p0(objM87133R5);
                }
                function6 = function5;
                AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h4, false, jM125399i1, null, false, (InterfaceC4339a) objM87133R5, c28655q2, 54, 104);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z17) {
                    function7 = function6;
                    objM87133R6 = new C18451b(function7, 28);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function7 = function6;
                    objM87133R6 = new C18451b(function7, 28);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                function2 = function7;
            } else {
                c17545e = viewState;
            }
            z16 = z18 | z15;
            objM87133R5 = c28655q2.m87133R();
            if (z16) {
                function5 = function4;
                objM87133R5 = new C18656a0(function5, c17545e, interfaceC28601c3, 12);
                c28655q2.m87172p0(objM87133R5);
            } else {
                function5 = function4;
                objM87133R5 = new C18656a0(function5, c17545e, interfaceC28601c3, 12);
                c28655q2.m87172p0(objM87133R5);
            }
            function6 = function5;
            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h4, false, jM125399i1, null, false, (InterfaceC4339a) objM87133R5, c28655q2, 54, 104);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (i16 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R6 = c28655q.m87133R();
            if (z17) {
                function7 = function6;
                objM87133R6 = new C18451b(function7, 28);
                c28655q.m87172p0(objM87133R6);
            } else {
                function7 = function6;
                objM87133R6 = new C18451b(function7, 28);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
            function2 = function7;
        } else {
            c17545e = viewState;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(c17545e, i13, function2, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m61900i(AbstractC17546f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final int m61901j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: k */
    private static final void m61902k(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m61903l(Function1 function1) {
        function1.invoke(AbstractC17546f.a.f67870a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m61904m(InterfaceC28601c1 interfaceC28601c1, int i13) {
        m61902k(interfaceC28601c1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m61905n(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m61906o(Function1 function1, C17545e c17545e, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(new AbstractC17546f.c(c17545e.getNextId(), new C14676d(null, null, null, false, null, m61901j(interfaceC28601c1), null, null, null, null, 991, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m61907p(Function1 function1) {
        function1.invoke(AbstractC17546f.a.f67870a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m61908q(C17545e c17545e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m61899h(c17545e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
