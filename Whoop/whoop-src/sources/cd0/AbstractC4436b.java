package cd0;

import a01.C0089i;
import ad0.AbstractC0749c;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import bf0.C3189a;
import c62.C4273a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import uv0.AbstractC35283c;
import zc0.AbstractC40262a;

/* JADX INFO: renamed from: cd0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lad0/c;", "viewState", "Lkotlin/Function1;", "Lzc0/a;", "Ll83/a0;", "onNavigationEvent", "i", "(Lad0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "f", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4436b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    private static final void m13878f(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1896027269);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3189a(function1, 14);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m13879g(Function1 function1) {
        function1.invoke(AbstractC40262a.a.f174167a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m13880h(Function1 function1, int i13, Composer composer, int i14) {
        m13878f(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m13881i(AbstractC0749c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        Object objM87133R;
        int i16;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-932729874);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(viewState) ? 4 : 2);
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
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4273a(4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                AbstractC14874j.m42904c(viewState, "advanced_labs_mobile_scheduling_form", c28655q, (i15 & 14) | 48);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C3189a(function4, 13);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                if (viewState instanceof AbstractC0749c.b) {
                    c28655q.m87150e0(1483153116);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(false);
                    function2 = function4;
                } else {
                    function2 = function4;
                    i16 = i15;
                    if (viewState instanceof AbstractC0749c.a) {
                        c28655q.m87150e0(1483352663);
                        m13878f(function2, c28655q, (i16 >> 3) & 14);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC0749c.c) {
                            throw AbstractC11895b.m32003v(1294768006, c28655q, false);
                        }
                        c28655q.m87150e0(1483505958);
                        AbstractC22989q.m66760a(AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                }
            } else {
                c28655q.m87138X();
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(viewState, i13, function3, i14, 22);
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
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C4273a(4);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            AbstractC14874j.m42904c(viewState, "advanced_labs_mobile_scheduling_form", c28655q, (i15 & 14) | 48);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C3189a(function4, 13);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3189a(function4, 13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
            if (viewState instanceof AbstractC0749c.b) {
                c28655q.m87150e0(1483153116);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function2 = function4;
            } else {
                function2 = function4;
                i16 = i15;
                if (viewState instanceof AbstractC0749c.a) {
                    c28655q.m87150e0(1483352663);
                    m13878f(function2, c28655q, (i16 >> 3) & 14);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC0749c.c) {
                        throw AbstractC11895b.m32003v(1294768006, c28655q, false);
                    }
                    c28655q.m87150e0(1483505958);
                    AbstractC22989q.m66760a(AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))), c28655q, 0);
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q.m87138X();
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(viewState, i13, function3, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m13882j(AbstractC40262a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m13883k(Function1 function1) {
        function1.invoke(AbstractC40262a.a.f174167a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m13884l(AbstractC0749c abstractC0749c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m13881i(abstractC0749c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
