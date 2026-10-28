package qn0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4048j0;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gn0.AbstractC16004a;
import l83.C23454a0;
import ln0.InterfaceC24522b;
import mn0.C25709c;
import mn0.InterfaceC25707a;
import no.nordicsemi.android.dfu.DfuBaseService;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
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
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import qe0.C30301b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qn0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lmn0/c;", "viewState", "", "name", "Lkotlin/Function1;", "Lmn0/a;", "Ll83/a0;", "onViewEvent", "Lln0/b;", "onNavigationEvent", "f", "(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "challenge-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30511f {
    /* JADX WARN: Code duplicated, block: B:102:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:105:0x0236  */
    /* JADX WARN: Code duplicated, block: B:107:0x0250  */
    /* JADX WARN: Code duplicated, block: B:110:0x025d  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:75:0x0178  */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0199  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m93445f(C25709c viewState, String name, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        C28655q c28655q;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        boolean zM75710d;
        C2314t c2314t;
        Function1 function8;
        C28655q c28655q2;
        Function1 function9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        boolean z13;
        int i19;
        boolean z14;
        boolean z15;
        Object objM87133R;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        C28655q c28655q3;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        Object objM87133R3;
        Object objM87133R4;
        C2307m c2307m = C2299e.f9114w;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(name, "name");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-990836057);
        if ((i13 & 6) == 0) {
            i15 = (c28655q4.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87153g(name) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q4.m87157i(function3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q4.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30301b(11);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C30301b(12);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function4;
                    }
                    zM75710d = viewState.getIsLoading();
                    c2314t = C2314t.f9131w;
                    if (zM75710d) {
                        c28655q4.m87150e0(1313525549);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j2);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i2 = C0217k.f732j;
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                        function8 = function3;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q3 = c28655q4;
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(false);
                    } else {
                        if (viewState.getIsError()) {
                            c28655q4.m87150e0(1313716137);
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
                            int i25 = 2;
                            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16004a.f60582b, null, i25, 0 == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC16004a.f60581a, 0 == true ? 1 : 0, i25, 0 == true ? 1 : 0);
                            i18 = i15 & 896;
                            if (i18 == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i19 = i15 & 112;
                            if (i19 == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | z13;
                            objM87133R = c28655q4.m87133R();
                            if (z15 || objM87133R == c28676v0) {
                                objM87133R = new C4048j0(function3, name, 10);
                                c28655q4.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                            if (i18 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (i19 == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z17 | z16;
                            objM87133R2 = c28655q4.m87133R();
                            if (z18 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C4048j0(function3, name, 11);
                                c28655q4.m87172p0(objM87133R2);
                            }
                            function8 = function3;
                            AbstractC33199m0.m105214F(bVar, textResourceM21267a, interfaceC4339a, c8688b, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4064);
                            c28655q3 = c28655q4;
                            c28655q3.m87173q(true);
                            c28655q3.m87173q(false);
                        } else {
                            function8 = function3;
                            c28655q4.m87150e0(1314465593);
                            int i26 = i15 & 8190;
                            c28655q2 = c28655q4;
                            function9 = function7;
                            AbstractC30512g.m93452b(viewState, name, function8, function9, c28655q2, i26);
                            c28655q2.m87173q(false);
                        }
                        c28655q = c28655q2;
                        function6 = function9;
                        function5 = function8;
                    }
                    c28655q2 = c28655q3;
                    function9 = function7;
                    c28655q = c28655q2;
                    function6 = function9;
                    function5 = function8;
                } else {
                    c28655q4.m87138X();
                    c28655q = c28655q4;
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27640a((Object) viewState, name, function5, function6, i13, i14, 15);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30301b(11);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C30301b(12);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function4;
                }
                zM75710d = viewState.getIsLoading();
                c2314t = C2314t.f9131w;
                if (zM75710d) {
                    c28655q4.m87150e0(1313525549);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N3);
                    function8 = function3;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q3 = c28655q4;
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(false);
                } else {
                    if (viewState.getIsError()) {
                        c28655q4.m87150e0(1313716137);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N4);
                        int i27 = 2;
                        AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16004a.f60582b, null, i27, 0 == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC16004a.f60581a, 0 == true ? 1 : 0, i27, 0 == true ? 1 : 0);
                        i18 = i15 & 896;
                        if (i18 == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i19 = i15 & 112;
                        if (i19 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13;
                        objM87133R = c28655q4.m87133R();
                        if (z15) {
                            objM87133R = new C4048j0(function3, name, 10);
                            c28655q4.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C4048j0(function3, name, 10);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        if (i18 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (i19 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | z16;
                        objM87133R2 = c28655q4.m87133R();
                        if (z18) {
                            objM87133R2 = new C4048j0(function3, name, 11);
                            c28655q4.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C4048j0(function3, name, 11);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        function8 = function3;
                        AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, interfaceC4339a2, c8688b2, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4064);
                        c28655q3 = c28655q4;
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(false);
                    } else {
                        function8 = function3;
                        c28655q4.m87150e0(1314465593);
                        int i28 = i15 & 8190;
                        c28655q2 = c28655q4;
                        function9 = function7;
                        AbstractC30512g.m93452b(viewState, name, function8, function9, c28655q2, i28);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    function6 = function9;
                    function5 = function8;
                }
                c28655q2 = c28655q3;
                function9 = function7;
                c28655q = c28655q2;
                function6 = function9;
                function5 = function8;
            } else {
                c28655q4.m87138X();
                c28655q = c28655q4;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) viewState, name, function5, function6, i13, i14, 15);
            }
        }
        i15 |= 384;
        function3 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q4.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30301b(11);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C30301b(12);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function4;
                }
                zM75710d = viewState.getIsLoading();
                c2314t = C2314t.f9131w;
                if (zM75710d) {
                    c28655q4.m87150e0(1313525549);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j2);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N5);
                    function8 = function3;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q3 = c28655q4;
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(false);
                } else {
                    if (viewState.getIsError()) {
                        c28655q4.m87150e0(1313716137);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N6);
                        int i29 = 2;
                        AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16004a.f60582b, null, i29, 0 == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC16004a.f60581a, 0 == true ? 1 : 0, i29, 0 == true ? 1 : 0);
                        i18 = i15 & 896;
                        if (i18 == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i19 = i15 & 112;
                        if (i19 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13;
                        objM87133R = c28655q4.m87133R();
                        if (z15) {
                            objM87133R = new C4048j0(function3, name, 10);
                            c28655q4.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C4048j0(function3, name, 10);
                            c28655q4.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        if (i18 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (i19 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z17 | z16;
                        objM87133R2 = c28655q4.m87133R();
                        if (z18) {
                            objM87133R2 = new C4048j0(function3, name, 11);
                            c28655q4.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C4048j0(function3, name, 11);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        function8 = function3;
                        AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, interfaceC4339a3, c8688b3, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4064);
                        c28655q3 = c28655q4;
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(false);
                    } else {
                        function8 = function3;
                        c28655q4.m87150e0(1314465593);
                        int i210 = i15 & 8190;
                        c28655q2 = c28655q4;
                        function9 = function7;
                        AbstractC30512g.m93452b(viewState, name, function8, function9, c28655q2, i210);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    function6 = function9;
                    function5 = function8;
                }
                c28655q2 = c28655q3;
                function9 = function7;
                c28655q = c28655q2;
                function6 = function9;
                function5 = function8;
            } else {
                c28655q4.m87138X();
                c28655q = c28655q4;
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) viewState, name, function5, function6, i13, i14, 15);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C30301b(11);
                    c28655q4.m87172p0(objM87133R4);
                }
                function3 = (Function1) objM87133R4;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q4.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C30301b(12);
                    c28655q4.m87172p0(objM87133R3);
                }
                function7 = (Function1) objM87133R3;
            } else {
                function7 = function4;
            }
            zM75710d = viewState.getIsLoading();
            c2314t = C2314t.f9131w;
            if (zM75710d) {
                c28655q4.m87150e0(1313525549);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N7);
                function8 = function3;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q3 = c28655q4;
                c28655q3.m87173q(true);
                c28655q3.m87173q(false);
            } else {
                if (viewState.getIsError()) {
                    c28655q4.m87150e0(1313716137);
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N8);
                    int i211 = 2;
                    AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16004a.f60582b, null, i211, 0 == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC16004a.f60581a, 0 == true ? 1 : 0, i211, 0 == true ? 1 : 0);
                    i18 = i15 & 896;
                    if (i18 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i19 = i15 & 112;
                    if (i19 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13;
                    objM87133R = c28655q4.m87133R();
                    if (z15) {
                        objM87133R = new C4048j0(function3, name, 10);
                        c28655q4.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C4048j0(function3, name, 10);
                        c28655q4.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    if (i18 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i19 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | z16;
                    objM87133R2 = c28655q4.m87133R();
                    if (z18) {
                        objM87133R2 = new C4048j0(function3, name, 11);
                        c28655q4.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4048j0(function3, name, 11);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    function8 = function3;
                    AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, interfaceC4339a4, c8688b4, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4064);
                    c28655q3 = c28655q4;
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(false);
                } else {
                    function8 = function3;
                    c28655q4.m87150e0(1314465593);
                    int i212 = i15 & 8190;
                    c28655q2 = c28655q4;
                    function9 = function7;
                    AbstractC30512g.m93452b(viewState, name, function8, function9, c28655q2, i212);
                    c28655q2.m87173q(false);
                }
                c28655q = c28655q2;
                function6 = function9;
                function5 = function8;
            }
            c28655q2 = c28655q3;
            function9 = function7;
            c28655q = c28655q2;
            function6 = function9;
            function5 = function8;
        } else {
            c28655q4.m87138X();
            c28655q = c28655q4;
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a((Object) viewState, name, function5, function6, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m93446g(InterfaceC25707a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m93447h(InterfaceC24522b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m93448i(Function1 function1, String str) {
        function1.invoke(new InterfaceC25707a.c(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m93449j(Function1 function1, String str) {
        function1.invoke(new InterfaceC25707a.c(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m93450k(C25709c c25709c, String str, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m93445f(c25709c, str, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
