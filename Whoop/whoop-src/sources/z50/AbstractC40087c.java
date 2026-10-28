package z50;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import f50.AbstractC14089b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
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
import wb3.AbstractC37056f;
import x50.InterfaceC37986a;
import x50.InterfaceC37988c;
import yk2.C39609i;
import yo1.C39689b;
import yz1.C39913g;

/* JADX INFO: renamed from: z50.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lx50/c;", "viewState", "Lkotlin/Function1;", "Lx50/a;", "Ll83/a0;", "onEvent", "e", "(Lx50/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40087c {
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0154  */
    /* JADX WARN: Code duplicated, block: B:55:0x015a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:66:0x017c  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01da  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0201  */
    /* JADX WARN: Code duplicated, block: B:86:0x020e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0248  */
    /* JADX WARN: Code duplicated, block: B:90:0x024e  */
    /* JADX WARN: Code duplicated, block: B:92:0x025f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0267  */
    /* JADX WARN: Code duplicated, block: B:97:0x0271  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m128473e(InterfaceC37988c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        int i16;
        Function1 function6;
        boolean z13;
        Object objM87133R;
        Function1 function7;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        Function1 function8;
        boolean z17;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-718263620);
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
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39913g(11);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
                if (viewState instanceof InterfaceC37988c.e) {
                    c28655q.m87150e0(-1511259774);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                    function6 = function4;
                    z17 = true;
                } else {
                    function5 = function4;
                    i16 = i15;
                    if (viewState instanceof InterfaceC37988c.b) {
                        c28655q.m87150e0(-1511253968);
                        function6 = function5;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.d(AbstractC8693b.m21277k(AbstractC14089b.f50623b)), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.d.f138473f | (TextResource.$stable << 3), 0, 4092);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof InterfaceC37988c.a) {
                        c28655q.m87150e0(-1511244528);
                        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC14089b.f50622a);
                        if ((i16 & 14) != 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i16 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R2 = c28655q.m87133R();
                        if (!z16 || objM87133R2 == c28676v0) {
                            function8 = function5;
                            objM87133R2 = new C39689b(viewState, function8, 11);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function8 = function5;
                        }
                        function6 = function8;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k, 0L, (InterfaceC4339a) objM87133R2, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof InterfaceC37988c.d) {
                        c28655q.m87150e0(-1511227426);
                        AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC14089b.f50625d), false, null, 6, null);
                        TextResource textResourceM21267a = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC14089b.f50624c);
                        if ((i16 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (!z13 || objM87133R == c28676v0) {
                            function7 = function5;
                            objM87133R = new C39609i(function7, 11);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            function7 = function5;
                        }
                        function6 = function7;
                        AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688bM21277k2, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q.m87173q(false);
                    } else {
                        function6 = function5;
                        if (viewState instanceof InterfaceC37988c.c) {
                            throw AbstractC11895b.m32003v(-1511260473, c28655q, false);
                        }
                        c28655q.m87150e0(-1511215130);
                        c28655q.m87173q(false);
                    }
                    z17 = true;
                }
                c28655q.m87173q(z17);
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40086b(viewState, function3, i13, i14, 0);
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
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C39913g(11);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
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
            if (viewState instanceof InterfaceC37988c.e) {
                c28655q.m87150e0(-1511259774);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function6 = function4;
                z17 = true;
            } else {
                function5 = function4;
                i16 = i15;
                if (viewState instanceof InterfaceC37988c.b) {
                    c28655q.m87150e0(-1511253968);
                    function6 = function5;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.d(AbstractC8693b.m21277k(AbstractC14089b.f50623b)), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.d.f138473f | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                } else if (viewState instanceof InterfaceC37988c.a) {
                    c28655q.m87150e0(-1511244528);
                    TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC14089b.f50622a);
                    if ((i16 & 14) != 4) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if ((i16 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        function8 = function5;
                        objM87133R2 = new C39689b(viewState, function8, 11);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function8 = function5;
                        objM87133R2 = new C39689b(viewState, function8, 11);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function6 = function8;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k3, 0L, (InterfaceC4339a) objM87133R2, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                } else if (viewState instanceof InterfaceC37988c.d) {
                    c28655q.m87150e0(-1511227426);
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC14089b.f50625d), false, null, 6, null);
                    TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC14089b.f50624c);
                    if ((i16 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        function7 = function5;
                        objM87133R = new C39609i(function7, 11);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function7 = function5;
                        objM87133R = new C39609i(function7, 11);
                        c28655q.m87172p0(objM87133R);
                    }
                    function6 = function7;
                    AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688bM21277k4, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q.m87173q(false);
                } else {
                    function6 = function5;
                    if (viewState instanceof InterfaceC37988c.c) {
                        throw AbstractC11895b.m32003v(-1511260473, c28655q, false);
                    }
                    c28655q.m87150e0(-1511215130);
                    c28655q.m87173q(false);
                }
                z17 = true;
            }
            c28655q.m87173q(z17);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40086b(viewState, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m128474f(InterfaceC37986a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m128475g(InterfaceC37988c interfaceC37988c, Function1 function1) {
        C9598e c9598eM121674b = ((InterfaceC37988c.a) interfaceC37988c).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
        if (c9598eM121674b != null) {
            function1.invoke(new InterfaceC37986a.d(c9598eM121674b));
        } else {
            function1.invoke(InterfaceC37986a.b.f162646a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m128476h(Function1 function1) {
        function1.invoke(InterfaceC37986a.b.f162646a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m128477i(InterfaceC37988c interfaceC37988c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128473e(interfaceC37988c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
