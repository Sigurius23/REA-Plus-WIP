package bu1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bf0.C3189a;
import bs1.C3595n;
import bs1.C3603v;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ft1.InterfaceC14768a;
import ft1.InterfaceC14770c;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import hc3.AbstractC17176i;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
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
import r21.AbstractC30888f;
import r21.EnumC30883a;
import rs1.AbstractC31794f;
import v41.AbstractC35661d0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: bu1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lft1/c$g;", "state", "Lkotlin/Function1;", "Lft1/a;", "Ll83/a0;", "onViewEvent", "", "onSharePdf", "g", "(Lft1/c$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3636b {
    /* JADX WARN: Code duplicated, block: B:100:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b  */
    /* JADX WARN: Code duplicated, block: B:65:0x016d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0197  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0201  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0221  */
    /* JADX WARN: Code duplicated, block: B:92:0x0254  */
    /* JADX WARN: Code duplicated, block: B:95:0x0285  */
    /* JADX WARN: Code duplicated, block: B:97:0x0296  */
    /* JADX INFO: renamed from: g */
    public static final void m11192g(InterfaceC14770c.g state, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f14;
        boolean z13;
        Object objM87133R;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        int iHashCode2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-368292209);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C3595n(6);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C3595n(7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    C2314t c2314t = C2314t.f9131w;
                    f13 = 4;
                    float f15 = 5 * f13;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)), f15, 0.0f, 2);
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
                    if (c28655q.f115903S) {
                        f14 = f13;
                    } else {
                        f14 = f13;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(10 * f14, c2314t));
                        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC31794f.f131678q0);
                        C38072d c38072d = C38072d.f163053a;
                        AbstractC6721d.a aVar = new AbstractC6721d.a(c8688bM21277k, null, new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2)), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13 || objM87133R == c28676v0) {
                            objM87133R = new C3189a(function7, 4);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                        boolean zM87157i = c28655q.m87157i(state);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | zM87157i;
                        objM87133R2 = c28655q.m87133R();
                        if (z15 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C3603v(state, function8, 2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function1 function9 = function7;
                        Function1 function10 = function8;
                        AbstractC6719b.m20143d(null, aVar, null, interfaceC4339a, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
                        Modifier modifierM3411h = AbstractC1102d.m3411h(270, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        String strM42355i = state.getPdfPath();
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C3595n(8);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC35661d0.m112931y(null, strM42355i, null, null, (Function1) objM87133R3, false, false, false, false, 3, null, c28655q, 806903808, 0, 1453);
                        c28655q = c28655q;
                        AbstractC17176i.m48516r(c28655q, true, c2314t, f15, c28655q);
                        if (state.getPrivacyTitle() != null || state.getPrivacyDescription() == null) {
                            c28655q.m87150e0(42109405);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(41856662);
                            TextResource textResourceM42358l = state.getPrivacyTitle();
                            TextResource textResourceM42357k = state.getPrivacyDescription();
                            EnumC30883a enumC30883a = EnumC30883a.DEFAULT;
                            int i19 = TextResource.$stable;
                            AbstractC30888f.m94953f(c2314t, textResourceM42358l, textResourceM42357k, enumC30883a, null, false, null, null, null, c28655q, (i19 << 3) | 27654 | (i19 << 6), 480);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function5 = function9;
                        function6 = function10;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(10 * f14, c2314t));
                    TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC31794f.f131678q0);
                    C38072d c38072d2 = C38072d.f163053a;
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(c8688bM21277k2, null, new C39274g(AbstractC39383f.m125595a(c38072d2), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), new C39274g(c38072d2.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2)), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C3189a(function7, 4);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3189a(function7, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    boolean zM87157i2 = c28655q.m87157i(state);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zM87157i2;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C3603v(state, function8, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3603v(state, function8, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function1 function11 = function7;
                    Function1 function12 = function8;
                    AbstractC6719b.m20143d(null, aVar2, null, interfaceC4339a2, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
                    Modifier modifierM3411h2 = AbstractC1102d.m3411h(270, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3411h2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    String strM42355i2 = state.getPdfPath();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3595n(8);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC35661d0.m112931y(null, strM42355i2, null, null, (Function1) objM87133R3, false, false, false, false, 3, null, c28655q, 806903808, 0, 1453);
                    c28655q = c28655q;
                    AbstractC17176i.m48516r(c28655q, true, c2314t, f15, c28655q);
                    if (state.getPrivacyTitle() != null) {
                        c28655q.m87150e0(42109405);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(42109405);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function11;
                    function6 = function12;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3635a(state, function5, function6, i13, i14, 0);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C3595n(6);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C3595n(7);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                C2314t c2314t2 = C2314t.f9131w;
                f13 = 4;
                float f16 = 5 * f13;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)), f16, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(10 * f14, c2314t2));
                    TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC31794f.f131678q0);
                    C38072d c38072d3 = C38072d.f163053a;
                    AbstractC6721d.a aVar3 = new AbstractC6721d.a(c8688bM21277k3, null, new C39274g(AbstractC39383f.m125595a(c38072d3), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), new C39274g(c38072d3.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2)), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C3189a(function7, 4);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3189a(function7, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    boolean zM87157i3 = c28655q.m87157i(state);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zM87157i3;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C3603v(state, function8, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3603v(state, function8, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function1 function13 = function7;
                    Function1 function14 = function8;
                    AbstractC6719b.m20143d(null, aVar3, null, interfaceC4339a3, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t2));
                    Modifier modifierM3411h3 = AbstractC1102d.m3411h(270, c2314t2);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3411h3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    String strM42355i3 = state.getPdfPath();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3595n(8);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC35661d0.m112931y(null, strM42355i3, null, null, (Function1) objM87133R3, false, false, false, false, 3, null, c28655q, 806903808, 0, 1453);
                    c28655q = c28655q;
                    AbstractC17176i.m48516r(c28655q, true, c2314t2, f16, c28655q);
                    if (state.getPrivacyTitle() != null) {
                        c28655q.m87150e0(42109405);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(42109405);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function13;
                    function6 = function14;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(10 * f14, c2314t2));
                TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC31794f.f131678q0);
                C38072d c38072d4 = C38072d.f163053a;
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(c8688bM21277k4, null, new C39274g(AbstractC39383f.m125595a(c38072d4), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), new C39274g(c38072d4.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2)), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C3189a(function7, 4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3189a(function7, 4);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                boolean zM87157i4 = c28655q.m87157i(state);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zM87157i4;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C3603v(state, function8, 2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3603v(state, function8, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function15 = function7;
                Function1 function16 = function8;
                AbstractC6719b.m20143d(null, aVar4, null, interfaceC4339a4, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t2));
                Modifier modifierM3411h4 = AbstractC1102d.m3411h(270, c2314t2);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3411h4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                String strM42355i4 = state.getPdfPath();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3595n(8);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC35661d0.m112931y(null, strM42355i4, null, null, (Function1) objM87133R3, false, false, false, false, 3, null, c28655q, 806903808, 0, 1453);
                c28655q = c28655q;
                AbstractC17176i.m48516r(c28655q, true, c2314t2, f16, c28655q);
                if (state.getPrivacyTitle() != null) {
                    c28655q.m87150e0(42109405);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(42109405);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function15;
                function6 = function16;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3635a(state, function5, function6, i13, i14, 0);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C3595n(6);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C3595n(7);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                C2314t c2314t3 = C2314t.f9131w;
                f13 = 4;
                float f17 = 5 * f13;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t3)), f17, 0.0f, 2);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a3);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(10 * f14, c2314t3));
                    TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC31794f.f131678q0);
                    C38072d c38072d5 = C38072d.f163053a;
                    AbstractC6721d.a aVar5 = new AbstractC6721d.a(c8688bM21277k5, null, new C39274g(AbstractC39383f.m125595a(c38072d5), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), new C39274g(c38072d5.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2)), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C3189a(function7, 4);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3189a(function7, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                    boolean zM87157i5 = c28655q.m87157i(state);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zM87157i5;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C3603v(state, function8, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C3603v(state, function8, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function1 function17 = function7;
                    Function1 function18 = function8;
                    AbstractC6719b.m20143d(null, aVar5, null, interfaceC4339a5, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t3));
                    Modifier modifierM3411h5 = AbstractC1102d.m3411h(270, c2314t3);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3411h5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    String strM42355i5 = state.getPdfPath();
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3595n(8);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC35661d0.m112931y(null, strM42355i5, null, null, (Function1) objM87133R3, false, false, false, false, 3, null, c28655q, 806903808, 0, 1453);
                    c28655q = c28655q;
                    AbstractC17176i.m48516r(c28655q, true, c2314t3, f17, c28655q);
                    if (state.getPrivacyTitle() != null) {
                        c28655q.m87150e0(42109405);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(42109405);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function17;
                    function6 = function18;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(10 * f14, c2314t3));
                TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC31794f.f131678q0);
                C38072d c38072d6 = C38072d.f163053a;
                AbstractC6721d.a aVar6 = new AbstractC6721d.a(c8688bM21277k6, null, new C39274g(AbstractC39383f.m125595a(c38072d6), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), new C39274g(c38072d6.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2)), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C3189a(function7, 4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3189a(function7, 4);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                boolean zM87157i6 = c28655q.m87157i(state);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zM87157i6;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C3603v(state, function8, 2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3603v(state, function8, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function19 = function7;
                Function1 function110 = function8;
                AbstractC6719b.m20143d(null, aVar6, null, interfaceC4339a6, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t3));
                Modifier modifierM3411h6 = AbstractC1102d.m3411h(270, c2314t3);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3411h6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                String strM42355i6 = state.getPdfPath();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3595n(8);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC35661d0.m112931y(null, strM42355i6, null, null, (Function1) objM87133R3, false, false, false, false, 3, null, c28655q, 806903808, 0, 1453);
                c28655q = c28655q;
                AbstractC17176i.m48516r(c28655q, true, c2314t3, f17, c28655q);
                if (state.getPrivacyTitle() != null) {
                    c28655q.m87150e0(42109405);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(42109405);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function19;
                function6 = function110;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3635a(state, function5, function6, i13, i14, 0);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C3595n(6);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C3595n(7);
                    c28655q.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            C2314t c2314t4 = C2314t.f9131w;
            f13 = 4;
            float f18 = 5 * f13;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t4)), f18, 0.0f, 2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a4);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                f14 = f13;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(10 * f14, c2314t4));
                TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC31794f.f131678q0);
                C38072d c38072d7 = C38072d.f163053a;
                AbstractC6721d.a aVar7 = new AbstractC6721d.a(c8688bM21277k7, null, new C39274g(AbstractC39383f.m125595a(c38072d7), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), new C39274g(c38072d7.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2)), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C3189a(function7, 4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3189a(function7, 4);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                boolean zM87157i7 = c28655q.m87157i(state);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zM87157i7;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C3603v(state, function8, 2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3603v(state, function8, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function111 = function7;
                Function1 function112 = function8;
                AbstractC6719b.m20143d(null, aVar7, null, interfaceC4339a7, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t4));
                Modifier modifierM3411h7 = AbstractC1102d.m3411h(270, c2314t4);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3411h7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                String strM42355i7 = state.getPdfPath();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3595n(8);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC35661d0.m112931y(null, strM42355i7, null, null, (Function1) objM87133R3, false, false, false, false, 3, null, c28655q, 806903808, 0, 1453);
                c28655q = c28655q;
                AbstractC17176i.m48516r(c28655q, true, c2314t4, f18, c28655q);
                if (state.getPrivacyTitle() != null) {
                    c28655q.m87150e0(42109405);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(42109405);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function111;
                function6 = function112;
            } else {
                f14 = f13;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N10);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(10 * f14, c2314t4));
            TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC31794f.f131678q0);
            C38072d c38072d8 = C38072d.f163053a;
            AbstractC6721d.a aVar8 = new AbstractC6721d.a(c8688bM21277k8, null, new C39274g(AbstractC39383f.m125595a(c38072d8), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), new C39274g(c38072d8.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2)), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C3189a(function7, 4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3189a(function7, 4);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R;
            boolean zM87157i8 = c28655q.m87157i(state);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | zM87157i8;
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                objM87133R2 = new C3603v(state, function8, 2);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C3603v(state, function8, 2);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function113 = function7;
            Function1 function114 = function8;
            AbstractC6719b.m20143d(null, aVar8, null, interfaceC4339a8, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t4));
            Modifier modifierM3411h8 = AbstractC1102d.m3411h(270, c2314t4);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3411h8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
            String strM42355i8 = state.getPdfPath();
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C3595n(8);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC35661d0.m112931y(null, strM42355i8, null, null, (Function1) objM87133R3, false, false, false, false, 3, null, c28655q, 806903808, 0, 1453);
            c28655q = c28655q;
            AbstractC17176i.m48516r(c28655q, true, c2314t4, f18, c28655q);
            if (state.getPrivacyTitle() != null) {
                c28655q.m87150e0(42109405);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(42109405);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function5 = function113;
            function6 = function114;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3635a(state, function5, function6, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m11193h(InterfaceC14768a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m11194i(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m11195j(Function1 function1) {
        function1.invoke(InterfaceC14768a.a.f54673a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m11196k(InterfaceC14770c.g gVar, Function1 function1) {
        String strM42355i = gVar.getPdfPath();
        if (strM42355i != null) {
            function1.invoke(strM42355i);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m11197l(Throwable it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m11198m(InterfaceC14770c.g gVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m11192g(gVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
