package p203hy;

import a30.C0286e0;
import a30.C0307l0;
import a30.C0330v0;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import e00.C12500w;
import h20.C16671i1;
import java.util.List;
import k20.C22136a;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import my.C26027a;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p599wz.C37715f0;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v00.C35459c0;
import v00.C35484p;
import y00.C38865j1;
import y00.C38903n1;
import y00.C38912o1;
import y00.C38921p1;
import y00.C38939r1;
import y00.C38966u1;
import y00.EnumC38930q1;
import y00.EnumC38948s1;
import y00.InterfaceC38875k1;
import z20.C40014h;

/* JADX INFO: renamed from: hy.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C17714c {

    /* JADX INFO: renamed from: a */
    public final C22136a f68862a;

    /* JADX INFO: renamed from: b */
    public final C12500w f68863b;

    /* JADX INFO: renamed from: c */
    public final String f68864c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30063j f68865d;

    /* JADX INFO: renamed from: e */
    public final C0286e0 f68866e;

    /* JADX INFO: renamed from: f */
    public final C37734l1 f68867f;

    /* JADX INFO: renamed from: g */
    public final EventReporter$Mode f68868g;

    /* JADX INFO: renamed from: h */
    public final C30765d f68869h;

    public C17714c(C22136a eventReporter, C12500w linkDisabledApiRepository, String mobileSessionId, InterfaceC30063j workContext, C0286e0 retrieveCustomerEmail, C37734l1 linkConfigurationCoordinator, EventReporter$Mode mode, C30765d logger) {
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(linkDisabledApiRepository, "linkDisabledApiRepository");
        AbstractC22676k.m65750j(mobileSessionId, "mobileSessionId");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(retrieveCustomerEmail, "retrieveCustomerEmail");
        AbstractC22676k.m65750j(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(logger, "logger");
        this.f68862a = eventReporter;
        this.f68863b = linkDisabledApiRepository;
        this.f68864c = mobileSessionId;
        this.f68865d = workContext;
        this.f68866e = retrieveCustomerEmail;
        this.f68867f = linkConfigurationCoordinator;
        this.f68868g = mode;
        this.f68869h = logger;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0156  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c  */
    /* JADX WARN: Code duplicated, block: B:78:0x015f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    /* JADX WARN: Code duplicated, block: B:82:0x016a  */
    /* JADX WARN: Code duplicated, block: B:95:0x018a  */
    /* JADX INFO: renamed from: a */
    public static final Object m50708a(C17714c c17714c, C38966u1 c38966u1, C0330v0 c0330v0, List list, AbstractC32269c abstractC32269c) throws Throwable {
        C17713b c17713b;
        C38939r1 c38939r1;
        Object objM818a;
        Object obj;
        C17714c c17714c2;
        List list2;
        C37718g0 c37718g0;
        C37715f0 c37715f0;
        String str;
        C17716e c17716e;
        List<EnumC38930q1> list3;
        C38966u1 c38966u2;
        String str2;
        C17716e c17716e2;
        C0330v0 c0330v1;
        C38939r1 c38939r2;
        C17714c c17714c3;
        boolean z4;
        C17716e c17716e3;
        C0307l0 c0307l0;
        boolean z13;
        EnumC17715d enumC17715d;
        EnumC17715d enumC17715d2;
        boolean z14;
        String str3;
        C38921p1 c38921p1;
        boolean z15;
        boolean z16;
        boolean z17;
        C38939r1 c38939r3;
        String str4;
        C38912o1 c38912o1;
        C38903n1 c38903n1;
        C37718g0 c37718g1;
        C38966u1 c38966u3 = c38966u1;
        C0330v0 c0330v2 = c0330v0;
        c17714c.getClass();
        if (abstractC32269c instanceof C17713b) {
            c17713b = (C17713b) abstractC32269c;
            int i13 = c17713b.f68857J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17713b.f68857J = i13 - Integer.MIN_VALUE;
            } else {
                c17713b = new C17713b(c17714c, abstractC32269c);
            }
        } else {
            c17713b = new C17713b(c17714c, abstractC32269c);
        }
        Object obj2 = c17713b.f68855H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c17713b.f68857J;
        InterfaceC38875k1 interfaceC38875k1 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            if (!AbstractC22676k.m65745e(c38966u3.f167721F.get(EnumC38948s1.ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP), Boolean.TRUE)) {
                c38939r1 = c38966u3.f167722G;
                if (c38939r1 == null) {
                    throw new IllegalArgumentException("Experiments data required to log exposures");
                }
                c17713b.f68858w = c17714c;
                c17713b.f68859x = c38966u3;
                c17713b.f68860y = c0330v2;
                c17713b.f68861z = list;
                c17713b.f68852E = c38939r1;
                c17713b.f68857J = 1;
                C35459c0 c35459c0 = c0330v2.f1156E;
                C0307l0 c0307l1 = c35459c0.f150995l0;
                if (c0307l1 == null || (c37718g0 = c0307l1.f1058w) == null || (c37715f0 = c37718g0.f161606F) == null || (objM818a = c37715f0.f161585x) == null) {
                    C0286e0 c0286e0 = c17714c.f68866e;
                    C26027a c26027a = c0330v2.f1157w;
                    C35484p c35484p = c35459c0.f150973P;
                    objM818a = c0286e0.m818a(c26027a, c35484p != null ? new C40014h(c35484p.f151059w, c35484p.f151060x, c35484p.f151061y) : null, c17713b);
                }
                if (objM818a != enumC31071a) {
                    obj = objM818a;
                    c17714c2 = c17714c;
                    list2 = list;
                }
                return enumC31071a;
            }
            return C23454a0.f92919a;
        }
        if (i14 == 1) {
            C38939r1 c38939r4 = c17713b.f68852E;
            List list4 = c17713b.f68861z;
            c0330v2 = c17713b.f68860y;
            C38966u1 c38966u4 = c17713b.f68859x;
            c17714c2 = c17713b.f68858w;
            AbstractC34132o.m107864I(obj2);
            c38939r1 = c38939r4;
            list2 = list4;
            c38966u3 = c38966u4;
            obj = obj2;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c17716e2 = c17713b.f68854G;
            str2 = c17713b.f68853F;
            c38939r2 = c17713b.f68852E;
            list3 = c17713b.f68861z;
            c0330v1 = c17713b.f68860y;
            c38966u2 = c17713b.f68859x;
            c17714c3 = c17713b.f68858w;
            AbstractC34132o.m107864I(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            c17716e3 = c17716e2;
            z4 = true;
        } else {
            c17716e = c17716e2;
            c38939r1 = c38939r2;
            c17714c2 = c17714c3;
            list2 = list3;
            c0330v2 = c0330v1;
            str = str2;
            c38966u3 = c38966u2;
            list3 = list2;
            c38966u2 = c38966u3;
            str2 = str;
            z4 = false;
            c17714c3 = c17714c2;
            c17716e3 = c17716e;
            c0330v1 = c0330v2;
            c38939r2 = c38939r1;
        }
        c0307l0 = c0330v1.f1156E.f150995l0;
        if (c0307l0 != null || (c37718g1 = c0307l0.f1058w) == null) {
            z13 = false;
        } else {
            C37734l1 c37734l1 = c17714c3.f68867f;
            c37734l1.getClass();
            if (c37734l1.m121148b(c37718g1).m77715b().m6861b()) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        enumC17715d = EnumC17715d.f68870w;
        if (str2 != null) {
            enumC17715d2 = enumC17715d;
        } else {
            enumC17715d2 = null;
        }
        if (c0330v1.f1156E.f150995l0 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        str3 = c17714c3.f68868g.f22386w;
        c38921p1 = c38966u2.f167723H;
        if (c38921p1 != null && (c38912o1 = c38921p1.f167545y) != null && (c38903n1 = c38912o1.f167499F) != null) {
            interfaceC38875k1 = c38903n1.f167472w;
        }
        if ((interfaceC38875k1 instanceof C38865j1) || !((C38865j1) interfaceC38875k1).f167299w) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z14 || AbstractC22676k.m65745e(c38966u2.f167721F.get(EnumC38948s1.ELEMENTS_ENABLE_LINK_SPM), Boolean.TRUE)) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z15 || !z16) {
            z17 = false;
        } else {
            z17 = true;
        }
        for (EnumC38930q1 enumC38930q1 : list3) {
            c38939r3 = c38966u2.f167722G;
            if (c38939r3 != null || (str4 = (String) c38939r3.f167624x.get(enumC38930q1)) == null) {
                str4 = "control";
            }
            String str5 = str3;
            c17714c3.f68862a.m63391k(new C17717f(c38939r2.f167623w, str4, enumC38930q1, z4, z13, enumC17715d2, c17716e3, z17, str5, z14, c38966u2.f167730O, c17714c3.f68864c));
            str3 = str5;
        }
        return C23454a0.f92919a;
        str = (String) obj;
        c17714c2.getClass();
        C16671i1 c16671i1 = c0330v2.f1157w.f102950E;
        c17716e = new C17716e((c16671i1 != null ? c16671i1.f64115x : null) != null, (c16671i1 != null ? c16671i1.f64116y : null) != null, (c16671i1 != null ? c16671i1.f64117z : null) != null);
        if (str != null) {
            String str6 = c38966u3.f167730O;
            c17713b.f68858w = c17714c2;
            c17713b.f68859x = c38966u3;
            c17713b.f68860y = c0330v2;
            c17713b.f68861z = list2;
            c17713b.f68852E = c38939r1;
            c17713b.f68853F = str;
            c17713b.f68854G = c17716e;
            c17713b.f68857J = 2;
            Object objM50709b = c17714c2.m50709b(str, str6, c17713b);
            if (objM50709b != enumC31071a) {
                list3 = list2;
                c38966u2 = c38966u3;
                str2 = str;
                c17716e2 = c17716e;
                c0330v1 = c0330v2;
                c38939r2 = c38939r1;
                obj2 = objM50709b;
                c17714c3 = c17714c2;
                if (((Boolean) obj2).booleanValue()) {
                    c17716e3 = c17716e2;
                    z4 = true;
                } else {
                    c17716e = c17716e2;
                    c38939r1 = c38939r2;
                    c17714c2 = c17714c3;
                    list2 = list3;
                    c0330v2 = c0330v1;
                    str = str2;
                    c38966u3 = c38966u2;
                    list3 = list2;
                    c38966u2 = c38966u3;
                    str2 = str;
                    z4 = false;
                    c17714c3 = c17714c2;
                    c17716e3 = c17716e;
                    c0330v1 = c0330v2;
                    c38939r2 = c38939r1;
                }
            }
            return enumC31071a;
        }
        list3 = list2;
        c38966u2 = c38966u3;
        str2 = str;
        z4 = false;
        c17714c3 = c17714c2;
        c17716e3 = c17716e;
        c0330v1 = c0330v2;
        c38939r2 = c38939r1;
        c0307l0 = c0330v1.f1156E.f150995l0;
        if (c0307l0 != null) {
            z13 = false;
        } else {
            z13 = false;
        }
        enumC17715d = EnumC17715d.f68870w;
        if (str2 != null) {
            enumC17715d2 = enumC17715d;
        } else {
            enumC17715d2 = null;
        }
        if (c0330v1.f1156E.f150995l0 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        str3 = c17714c3.f68868g.f22386w;
        c38921p1 = c38966u2.f167723H;
        if (c38921p1 != null) {
            interfaceC38875k1 = c38903n1.f167472w;
        }
        if (interfaceC38875k1 instanceof C38865j1) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (z14) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (z15) {
            z17 = false;
        } else {
            z17 = false;
        }
        while (r1.hasNext()) {
            c38939r3 = c38966u2.f167722G;
            if (c38939r3 != null) {
                str4 = "control";
            } else {
                str4 = "control";
            }
            String str7 = str3;
            c17714c3.f68862a.m63391k(new C17717f(c38939r2.f167623w, str4, enumC38930q1, z4, z13, enumC17715d2, c17716e3, z17, str7, z14, c38966u2.f167730O, c17714c3.f68864c));
            str3 = str7;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m50709b(String str, String str2, AbstractC32269c abstractC32269c) throws Throwable {
        C17712a c17712a;
        Object objM35125m;
        C17714c c17714c;
        if (abstractC32269c instanceof C17712a) {
            c17712a = (C17712a) abstractC32269c;
            int i13 = c17712a.f68851z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17712a.f68851z = i13 - Integer.MIN_VALUE;
            } else {
                c17712a = new C17712a(this, abstractC32269c);
            }
        } else {
            c17712a = new C17712a(this, abstractC32269c);
        }
        Object obj = c17712a.f68849x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c17712a.f68851z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c17712a.f68848w = this;
            c17712a.f68851z = 1;
            objM35125m = this.f68863b.m35125m(str, str2, c17712a);
            if (objM35125m == enumC31071a) {
                return enumC31071a;
            }
            c17714c = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c17714c = c17712a.f68848w;
            AbstractC34132o.m107864I(obj);
            objM35125m = ((C23468n) obj).f92940w;
        }
        if (!(objM35125m instanceof C23467m)) {
            objM35125m = Boolean.valueOf(((ConsumerSessionLookup) objM35125m).getExists());
        }
        Throwable thM68037a = C23468n.m68037a(objM35125m);
        if (thM68037a != null) {
            c17714c.f68869h.m94512b("Failed to check if user is returning", thM68037a);
        }
        AbstractC34132o.m107864I(objM35125m);
        return objM35125m;
    }
}
