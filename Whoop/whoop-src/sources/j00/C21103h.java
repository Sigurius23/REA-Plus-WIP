package j00;

import a33.C0352d;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import bz.EnumC3703b;
import com.stripe.android.core.exception.APIConnectionException;
import d00.C11433l;
import d33.C11636x;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import g40.C15351f3;
import g40.C15383l0;
import g40.C15384l1;
import g40.C15453z0;
import g40.C15454z1;
import iz0.C21045d;
import java.util.Set;
import java.util.regex.Pattern;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import n00.EnumC26076d;
import n53.C26318e;
import n83.C26460c;
import p098dt.AbstractC12350b;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35902e;
import p599wz.C37715f0;
import p599wz.C37718g0;
import p631xz.C38747x;
import p665yz.C39899b;
import p665yz.C39900c;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32416g;
import wb3.AbstractC37056f;
import y00.EnumC38796c2;
import y00.InterfaceC38802c8;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: j00.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C21103h extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C30765d f80012E;

    /* JADX INFO: renamed from: F */
    public final long f80013F;

    /* JADX INFO: renamed from: G */
    public final C21108k f80014G;

    /* JADX INFO: renamed from: H */
    public final C13045h2 f80015H;

    /* JADX INFO: renamed from: I */
    public final C13045h2 f80016I;

    /* JADX INFO: renamed from: J */
    public final String f80017J;

    /* JADX INFO: renamed from: K */
    public final String f80018K;

    /* JADX INFO: renamed from: L */
    public final C15351f3 f80019L;

    /* JADX INFO: renamed from: M */
    public final C15454z1 f80020M;

    /* JADX INFO: renamed from: N */
    public final C15351f3 f80021N;

    /* JADX INFO: renamed from: O */
    public final C0352d f80022O;

    /* JADX INFO: renamed from: P */
    public final C26318e f80023P;

    /* JADX INFO: renamed from: Q */
    public final C26318e f80024Q;

    /* JADX INFO: renamed from: R */
    public final C26318e f80025R;

    /* JADX INFO: renamed from: S */
    public final C13045h2 f80026S;

    /* JADX INFO: renamed from: T */
    public final C13081r1 f80027T;

    /* JADX INFO: renamed from: U */
    public boolean f80028U;

    /* JADX INFO: renamed from: w */
    public final EnumC21096d0 f80029w;

    /* JADX INFO: renamed from: x */
    public final C37718g0 f80030x;

    /* JADX INFO: renamed from: y */
    public final C38747x f80031y;

    /* JADX INFO: renamed from: z */
    public final C39899b f80032z;

    public C21103h(AbstractC21106i0 abstractC21106i0, EnumC21096d0 signupMode, Boolean bool, C37718g0 config, C38747x linkAccountManager, C39899b linkEventsReporter, C30765d logger) {
        String str;
        String str2;
        String str3;
        String str4;
        Set setM74103I1;
        String str5;
        String str6;
        String str7;
        String str8;
        AbstractC22676k.m65750j(signupMode, "signupMode");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        AbstractC22676k.m65750j(linkEventsReporter, "linkEventsReporter");
        AbstractC22676k.m65750j(logger, "logger");
        InterfaceC38802c8 interfaceC38802c8 = config.f161636w;
        boolean z4 = config.f161621U;
        boolean z13 = config.f161630d0;
        boolean z14 = config.f161629c0;
        C37715f0 c37715f0 = config.f161606F;
        this.f80029w = signupMode;
        this.f80030x = config;
        this.f80031y = linkAccountManager;
        this.f80032z = linkEventsReporter;
        this.f80012E = logger;
        this.f80013F = 1000L;
        boolean z15 = abstractC21106i0 != null;
        if (abstractC21106i0 != null) {
            if (abstractC21106i0 instanceof C21104h0) {
                str8 = ((C21104h0) abstractC21106i0).f80035w;
            } else {
                if (!(abstractC21106i0 instanceof C21102g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                str8 = ((C21102g0) abstractC21106i0).f80011w;
            }
            str = str8;
        } else {
            str = null;
        }
        if (abstractC21106i0 != null) {
            if (abstractC21106i0 instanceof C21104h0) {
                str7 = ((C21104h0) abstractC21106i0).f80036x;
            } else {
                if (!(abstractC21106i0 instanceof C21102g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                str7 = null;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        if (abstractC21106i0 != null) {
            if (abstractC21106i0 instanceof C21104h0) {
                str6 = ((C21104h0) abstractC21106i0).f80038z;
            } else {
                if (!(abstractC21106i0 instanceof C21102g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                str6 = null;
            }
            str3 = str6;
        } else {
            str3 = null;
        }
        if (abstractC21106i0 != null) {
            if (abstractC21106i0 instanceof C21104h0) {
                str5 = ((C21104h0) abstractC21106i0).f80037y;
            } else {
                if (!(abstractC21106i0 instanceof C21102g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                str5 = null;
            }
            str4 = str5;
        } else {
            str4 = null;
        }
        boolean zBooleanValue = z14 ? bool != null ? bool.booleanValue() : z13 : z15;
        boolean z16 = bool != null;
        EnumC21096d0 enumC21096d0 = EnumC21096d0.f79990x;
        boolean z17 = signupMode == enumC21096d0;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        boolean z18 = z17;
        String str9 = c37715f0.f161585x;
        boolean z19 = str9 == null || AbstractC39414r.m125890i0(str9);
        if (z18 && !z19) {
            c26460cM119000x.add(EnumC21094c0.f79981x);
            c26460cM119000x.add(EnumC21094c0.f79980w);
        } else if (z18) {
            c26460cM119000x.add(EnumC21094c0.f79980w);
            c26460cM119000x.add(EnumC21094c0.f79981x);
        } else {
            c26460cM119000x.add(EnumC21094c0.f79980w);
            c26460cM119000x.add(EnumC21094c0.f79981x);
        }
        if (AbstractC32416g.m101134C(config)) {
            c26460cM119000x.add(EnumC21094c0.f79982y);
        }
        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        int iOrdinal = signupMode.ordinal();
        if (iOrdinal == 0) {
            setM74103I1 = AbstractC25265s.m74103I1(c26460cM118988k);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            setM74103I1 = AbstractC12350b.m34604y(AbstractC25265s.m74096F0(c26460cM118988k), AbstractC25265s.m74103I1(c26460cM118988k));
        }
        boolean z24 = z4 && AbstractC22676k.m65745e(interfaceC38802c8.mo124337q(), "US") && signupMode == EnumC21096d0.f79989w;
        EnumC26076d enumC26076d = (z24 && (str == null || AbstractC39414r.m125890i0(str) || str2 == null || AbstractC39414r.m125890i0(str2))) ? EnumC26076d.f103268y : EnumC26076d.f103266w;
        String str10 = config.f161637x;
        boolean z25 = zBooleanValue || z24;
        Set set = setM74103I1;
        C21108k c21108k = new C21108k(null, str10, signupMode, c26460cM118988k, set, z4 && AbstractC22676k.m65745e(interfaceC38802c8.mo124337q(), "US") && signupMode == EnumC21096d0.f79989w, z14 && str9 != null && !AbstractC39414r.m125890i0(str9) && signupMode == EnumC21096d0.f79989w, false, z25, false, enumC26076d, z16);
        this.f80014G = c21108k;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c21108k);
        this.f80015H = c13045h2M36593c;
        this.f80016I = c13045h2M36593c;
        boolean z26 = signupMode == enumC21096d0;
        EnumC21094c0 enumC21094c0 = EnumC21094c0.f79980w;
        String str11 = set.contains(enumC21094c0) ? str9 : null;
        this.f80017J = str11;
        String str12 = c37715f0.f161586y;
        EnumC21094c0 enumC21094c1 = EnumC21094c0.f79981x;
        str12 = set.contains(enumC21094c1) ? str12 : null;
        str12 = str12 == null ? "" : str12;
        this.f80018K = str12;
        String str13 = c37715f0.f161584w;
        EnumC21094c0 enumC21094c2 = EnumC21094c0.f79982y;
        String str14 = set.contains(enumC21094c2) ? str13 : null;
        Pattern pattern = C15453z0.f58040F;
        int i13 = 1;
        C15351f3 c15351f3 = new C15351f3(new C15453z0(AbstractC25265s.m74096F0(c26460cM118988k) == enumC21094c0 && z26, 1), str != null ? str : str11, null, 4);
        this.f80019L = c15351f3;
        C15454z1 c15454z1M43593a = C15383l0.m43593a(str2 != null ? str2 : str12, 20, str4 == null ? c37715f0.f161587z : str4, AbstractC25265s.m74096F0(c26460cM118988k) == enumC21094c1 && z26, false);
        this.f80020M = c15454z1M43593a;
        C15351f3 c15351f4 = new C15351f3(new C15384l1(), str3 != null ? str3 : str14, null, 4);
        this.f80021N = c15351f4;
        this.f80022O = new C0352d(AbstractC25260n.m74077r0(new Object[]{c15351f3, c15454z1M43593a, c26460cM118988k.contains(enumC21094c2) ? c15351f4 : null}), (InterfaceC41211c) null);
        this.f80023P = AbstractC3269g.m9484M(c15351f3.f57725x, new C21045d(5));
        this.f80024Q = AbstractC3269g.m9484M(c15454z1M43593a.f58058m, new C21045d(6));
        this.f80025R = AbstractC3269g.m9484M(c15351f4.f57725x, new C21045d(7));
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this.f80026S = c13045h2M36593c2;
        this.f80027T = AbstractC13091v.m36598h(c13045h2M36593c2);
        this.f80028U = z14 ? bool != null ? bool.booleanValue() : z13 : z15;
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C21099f(this, interfaceC30057d, 0), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C21099f(this, interfaceC30057d, i13), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public static final Object m58925g(C21103h c21103h, String str, AbstractC32269c abstractC32269c) {
        C21095d c21095d;
        Object objM124160k;
        String str2;
        Object value;
        boolean z4;
        Object value2;
        Object value3;
        if (abstractC32269c instanceof C21095d) {
            c21095d = (C21095d) abstractC32269c;
            int i13 = c21095d.f79984E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c21095d.f79984E = i13 - Integer.MIN_VALUE;
            } else {
                c21095d = new C21095d(c21103h, abstractC32269c);
            }
        } else {
            c21095d = new C21095d(c21103h, abstractC32269c);
        }
        C21095d c21095d2 = c21095d;
        Object obj = c21095d2.f79987y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c21095d2.f79984E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c21103h.f80026S.m36570j(null);
            C38747x c38747x = c21103h.f80031y;
            EnumC38796c2 enumC38796c2 = EnumC38796c2.USER_ACTION;
            c21095d2.f79985w = c21103h;
            c21095d2.f79986x = str;
            c21095d2.f79984E = 1;
            objM124160k = c38747x.m124160k(str, enumC38796c2, false, null, c21095d2);
            if (objM124160k == enumC31071a) {
                return enumC31071a;
            }
            str2 = str;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c21095d2.f79986x;
            c21103h = c21095d2.f79985w;
            AbstractC34132o.m107864I(obj);
            objM124160k = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM124160k);
        if (thM68037a != null) {
            C13045h2 c13045h2 = c21103h.f80015H;
            do {
                value = c13045h2.getValue();
                z4 = thM68037a instanceof APIConnectionException;
            } while (!c13045h2.m36569i(value, C21108k.m58928a((C21108k) value, null, false, z4, EnumC26076d.f103266w, 2559)));
            if (!z4) {
                InterfaceC41211c interfaceC41211cM113429x = AbstractC35785b.m113429x(thM68037a);
                c21103h.f80012E.m94512b("Error: ", thM68037a);
                C13045h2 c13045h3 = c21103h.f80026S;
                c13045h3.getClass();
                c13045h3.m36571k(null, interfaceC41211cM113429x);
            }
        } else if (((C11433l) objM124160k) != null) {
            C13045h2 c13045h4 = c21103h.f80015H;
            do {
                value3 = c13045h4.getValue();
            } while (!c13045h4.m36569i(value3, C21108k.m58928a((C21108k) value3, new C21102g0(str2), false, false, EnumC26076d.f103266w, 2558)));
        } else {
            C13045h2 c13045h5 = c21103h.f80015H;
            do {
                value2 = c13045h5.getValue();
            } while (!c13045h5.m36569i(value2, C21108k.m58928a((C21108k) value2, null, false, false, EnumC26076d.f103268y, 2559)));
            C39899b c39899b = c21103h.f80032z;
            AbstractC35902e.m113963f0(c39899b.f172276f, EnumC3703b.f15153y);
            c39899b.m128003a(C39900c.f172287O, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public static final Object m58926j(C21103h c21103h, AbstractC32269c abstractC32269c) {
        C21097e c21097e;
        Object value;
        if (abstractC32269c instanceof C21097e) {
            c21097e = (C21097e) abstractC32269c;
            int i13 = c21097e.f79995z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c21097e.f79995z = i13 - Integer.MIN_VALUE;
            } else {
                c21097e = new C21097e(c21103h, abstractC32269c);
            }
        } else {
            c21097e = new C21097e(c21103h, abstractC32269c);
        }
        Object obj = c21097e.f79993x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c21097e.f79995z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C26318e c26318e = c21103h.f80024Q;
            C11636x c11636x = new C11636x(2, 5, null);
            c21097e.f79992w = c21103h;
            c21097e.f79995z = 1;
            if (AbstractC13091v.m36616z(c26318e, c11636x, c21097e) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21103h = c21097e.f79992w;
            AbstractC34132o.m107864I(obj);
        }
        C13045h2 c13045h2 = c21103h.f80015H;
        do {
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C21108k.m58928a((C21108k) value, null, false, false, EnumC26076d.f103268y, 3071)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public final C21104h0 m58927l(String str, String str2, String str3, boolean z4) {
        EnumC21098e0 enumC21098e0;
        C21108k c21108k = this.f80014G;
        EnumC21096d0 enumC21096d0 = c21108k.f80046c;
        boolean z13 = c21108k.f80050g;
        boolean z14 = z13 || str2 != null;
        if (str == null || !z14 || enumC21096d0 == null) {
            return null;
        }
        boolean z15 = (c21108k.f80047d.contains(EnumC21094c0.f79982y) && (str3 == null || AbstractC39414r.m125890i0(str3))) ? false : true;
        String strM43614u = this.f80020M.m43614u();
        boolean z16 = this.f80017J != null;
        boolean zM125890i0 = AbstractC39414r.m125890i0(this.f80018K);
        boolean z17 = c21108k.f80049f;
        boolean z18 = this.f80030x.f161630d0;
        int iOrdinal = enumC21096d0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (z16) {
                enumC21098e0 = EnumC21098e0.f79996E;
            } else {
                if (z16) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC21098e0 = EnumC21098e0.f80006z;
            }
        } else if (z13) {
            enumC21098e0 = (!z18 || z4) ? EnumC21098e0.f80000I : EnumC21098e0.f80001J;
        } else if (z17) {
            if (!z16 || zM125890i0) {
                enumC21098e0 = (z16 || !zM125890i0) ? EnumC21098e0.f79998G : EnumC21098e0.f79999H;
            } else {
                enumC21098e0 = EnumC21098e0.f79997F;
            }
        } else if (!z16 || zM125890i0) {
            enumC21098e0 = z16 ? EnumC21098e0.f80004x : EnumC21098e0.f80003w;
        } else {
            enumC21098e0 = EnumC21098e0.f80005y;
        }
        C21104h0 c21104h0 = new C21104h0(str, str2, strM43614u, str3, enumC21098e0, "PHONE_NUMBER");
        if (z15) {
            return c21104h0;
        }
        return null;
    }
}
