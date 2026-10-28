package jp1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bs1.C3590i;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fp1.C14676d;
import gb1.AbstractC15673b0;
import hp1.AbstractC17546f;
import hp1.C17549i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
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
import p026b2.C2305k;
import p026b2.C2314t;
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
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30792k;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: jp1.r */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lhp1/i;", "viewState", "Lkotlin/Function1;", "Lhp1/f;", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lhp1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21866r {
    /* JADX WARN: Code duplicated, block: B:101:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:102:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:110:0x0300 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0306  */
    /* JADX WARN: Code duplicated, block: B:115:0x0319  */
    /* JADX WARN: Code duplicated, block: B:118:0x0322  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0170  */
    /* JADX WARN: Code duplicated, block: B:60:0x0174  */
    /* JADX WARN: Code duplicated, block: B:67:0x0193  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:79:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0286  */
    /* JADX WARN: Code duplicated, block: B:90:0x028f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0292  */
    /* JADX WARN: Code duplicated, block: B:94:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:95:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c6  */
    /* JADX INFO: renamed from: h */
    public static final void m61961h(C17549i viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
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
        int iHashCode2;
        float f13;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        float f14;
        boolean z14;
        Object objM87133R5;
        C28676v0 c28676v1;
        Function1 function5;
        Function1 function6;
        boolean z15;
        Object objM87133R6;
        Function1 function7;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-89120179);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
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
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C21650c(26);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getCurrentName());
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
                TextResource textResourceM49921c = viewState.getNavigationTitle();
                TextResource textResourceM49920b = viewState.getNavigationSubtitle();
                C38072d c38072d = C38072d.f163053a;
                int iM125595a = AbstractC39383f.m125595a(c38072d);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C21860l(function3, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                int i18 = TextResource.$stable;
                int i19 = i18 << 3;
                function4 = function3;
                AbstractC21865q.m61949e(textResourceM49921c, textResourceM49920b, iM125595a, null, null, (InterfaceC4339a) objM87133R2, c28655q, i18 | i19, 24);
                float f15 = 3;
                float f16 = 8 * f15;
                float f17 = 2;
                Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f16, f17, f16, f16);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
                float f18 = 4;
                AbstractC18489d0.m53380u(f17, f18, c2314t, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                C33252i c33252iM105489e = AbstractC33253j.m105489e(f18 * f15);
                TextResource textResourceM21278l = AbstractC8693b.m21278l((String) interfaceC28601c1.getValue());
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C21864p(2);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R4 = new C13921a0(27, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                }
                InterfaceC28601c1 interfaceC28601c3 = interfaceC28601c2;
                AbstractC30792k.m94678l(layoutWeightElement, textResourceM21278l, null, null, null, null, null, null, textResourceM21267a, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, false, null, null, c33252iM105489e, null, null, null, null, interfaceC4339a, (Function1) objM87133R4, c28655q, i19 | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i18 << 24), 24576, 0, 54, 1040170716, 0);
                c28655q = c28655q;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f14, true));
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM21274h = AbstractC8693b.m21274h(viewState.getSaveButton(), c28655q, i18);
                long jM125399i0 = c38072d.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep();
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z14) {
                    c28676v1 = c28676v0;
                } else {
                    c28676v1 = c28676v0;
                    if (objM87133R5 == c28676v1) {
                        function5 = function4;
                    }
                    function6 = function5;
                    AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h, false, jM125399i0, null, false, (InterfaceC4339a) objM87133R5, c28655q, 54, 104);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i16 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (!z15 || objM87133R6 == c28676v1) {
                        function7 = function6;
                        objM87133R6 = new C21860l(function7, 2);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function7 = function6;
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                    function2 = function7;
                }
                function5 = function4;
                objM87133R5 = new C3590i(function5, interfaceC28601c3, 21);
                c28655q.m87172p0(objM87133R5);
                function6 = function5;
                AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h, false, jM125399i0, null, false, (InterfaceC4339a) objM87133R5, c28655q, 54, 104);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z15) {
                    function7 = function6;
                    objM87133R6 = new C21860l(function7, 2);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function7 = function6;
                    objM87133R6 = new C21860l(function7, 2);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                function2 = function7;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function2, i14, 7);
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
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C21650c(26);
                    c28655q.m87172p0(objM87133R7);
                }
                function3 = (Function1) objM87133R7;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(viewState.getCurrentName());
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
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
            TextResource textResourceM49921c2 = viewState.getNavigationTitle();
            TextResource textResourceM49920b2 = viewState.getNavigationSubtitle();
            C38072d c38072d2 = C38072d.f163053a;
            int iM125595a2 = AbstractC39383f.m125595a(c38072d2);
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C21860l(function3, 1);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C21860l(function3, 1);
                c28655q.m87172p0(objM87133R2);
            }
            int i110 = TextResource.$stable;
            int i111 = i110 << 3;
            function4 = function3;
            AbstractC21865q.m61949e(textResourceM49921c2, textResourceM49920b2, iM125595a2, null, null, (InterfaceC4339a) objM87133R2, c28655q, i110 | i111, 24);
            float f19 = 3;
            float f110 = 8 * f19;
            float f111 = 2;
            Modifier modifierM3397s2 = AbstractC1099a.m3397s(c2314t2, f110, f111, f110, f110);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            float f112 = 4;
            AbstractC18489d0.m53380u(f111, f112, c2314t2, c28655q);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f13, true);
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f112 * f19);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l((String) interfaceC28601c1.getValue());
            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C21864p(2);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R4 = new C13921a0(27, interfaceC28601c2);
                c28655q.m87172p0(objM87133R4);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
            }
            InterfaceC28601c1 interfaceC28601c4 = interfaceC28601c2;
            AbstractC30792k.m94678l(layoutWeightElement2, textResourceM21278l2, null, null, null, null, null, null, textResourceM21267a2, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, false, null, null, c33252iM105489e2, null, null, null, null, interfaceC4339a2, (Function1) objM87133R4, c28655q, i111 | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i110 << 24), 24576, 0, 54, 1040170716, 0);
            c28655q = c28655q;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f14 = Float.MAX_VALUE;
            } else {
                f14 = 1.0f;
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f14, true));
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getSaveButton(), c28655q, i110);
            long jM125399i1 = c38072d2.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep();
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R5 = c28655q.m87133R();
            if (z14) {
                c28676v1 = c28676v0;
                if (objM87133R5 == c28676v1) {
                    function5 = function4;
                }
                function6 = function5;
                AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h2, false, jM125399i1, null, false, (InterfaceC4339a) objM87133R5, c28655q, 54, 104);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z15) {
                    function7 = function6;
                    objM87133R6 = new C21860l(function7, 2);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function7 = function6;
                    objM87133R6 = new C21860l(function7, 2);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                function2 = function7;
            } else {
                c28676v1 = c28676v0;
            }
            function5 = function4;
            objM87133R5 = new C3590i(function5, interfaceC28601c4, 21);
            c28655q.m87172p0(objM87133R5);
            function6 = function5;
            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h2, false, jM125399i1, null, false, (InterfaceC4339a) objM87133R5, c28655q, 54, 104);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R6 = c28655q.m87133R();
            if (z15) {
                function7 = function6;
                objM87133R6 = new C21860l(function7, 2);
                c28655q.m87172p0(objM87133R6);
            } else {
                function7 = function6;
                objM87133R6 = new C21860l(function7, 2);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
            function2 = function7;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function2, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m61962i(AbstractC17546f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m61963j(Function1 function1) {
        function1.invoke(AbstractC17546f.b.f67871a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m61964k() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m61965l(InterfaceC28601c1 interfaceC28601c1, String text) {
        AbstractC22676k.m65750j(text, "text");
        interfaceC28601c1.setValue(text);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m61966m(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(new AbstractC17546f.c(null, new C14676d(null, null, null, false, (String) interfaceC28601c1.getValue(), 0, null, null, null, null, MessageListItemViewType.TYPING_INDICATOR, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m61967n(Function1 function1) {
        function1.invoke(AbstractC17546f.b.f67871a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m61968o(C17549i c17549i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m61961h(c17549i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
