package n53;

import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3058t;
import bc3.InterfaceC2994c0;
import dc3.C11923h;
import ih0.AbstractC18489d0;
import java.util.concurrent.CancellationException;
import l83.C23467m;
import l83.C23468n;
import l83.C23470p;
import p000.AbstractC11266d;
import p133f1.C13965o1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n53.x1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26377x1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2994c0 f104816a;

    /* JADX INFO: renamed from: b */
    public final C11923h f104817b;

    /* JADX INFO: renamed from: c */
    public C2996c2 f104818c;

    /* JADX INFO: renamed from: d */
    public final C23470p f104819d;

    /* JADX INFO: renamed from: e */
    public int f104820e;

    /* JADX INFO: renamed from: f */
    public int f104821f;

    /* JADX INFO: renamed from: g */
    public int f104822g;

    public C26377x1(InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        this.f104816a = scope;
        this.f104817b = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
        this.f104819d = AbstractC1772c1.m5382S(this, "SerialProcessor");
    }

    /* JADX INFO: renamed from: a */
    public final C2345k m78093a() {
        return (C2345k) this.f104819d.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m78094b() {
        try {
            C2345k c2345kM78093a = m78093a();
            InterfaceC2339e interfaceC2339e = c2345kM78093a.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, c2345kM78093a.f9273a)) {
                InterfaceC2344j interfaceC2344j = c2345kM78093a.f9274b;
                String str = c2345kM78093a.f9273a;
                C2996c2 c2996c2 = this.f104818c;
                boolean z4 = false;
                if (c2996c2 != null && c2996c2.isActive()) {
                    z4 = true;
                }
                int i13 = this.f104820e;
                int i14 = this.f104821f;
                int i15 = this.f104822g;
                StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "SerialProcessor stats: submitted=", ", completed=", ", queued=");
                sbM30465s.append(i15);
                sbM30465s.append(", running=");
                sbM30465s.append(z4);
                interfaceC2344j.log(enumC2341g, str, "[stop] Stopping SerialProcessor - " + sbM30465s.toString(), null);
            }
            C2996c2 c2996c3 = this.f104818c;
            if (c2996c3 != null) {
                c2996c3.cancel((CancellationException) null);
            }
            this.f104818c = null;
            C2345k c2345kM78093a2 = m78093a();
            if (c2345kM78093a2.f9275c.isLoggable(enumC2341g, c2345kM78093a2.f9273a)) {
                c2345kM78093a2.f9274b.log(enumC2341g, c2345kM78093a2.f9273a, "[stop] SerialProcessor stopped", null);
            }
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Code duplicated, block: B:55:0x014d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0155  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c */
    public final Object m78095c(String str, Function1 function1, AbstractC32269c abstractC32269c) {
        C26374w1 c26374w1;
        C3058t c3058tM8707a;
        C26377x1 c26377x1;
        String str2;
        int i13;
        String str3;
        C26377x1 c26377x2;
        Object objM107888l;
        Throwable thM68037a;
        C2345k c2345kM78093a;
        InterfaceC2339e interfaceC2339e;
        String str4;
        EnumC2341g enumC2341g;
        Throwable thM68037a2;
        String message;
        C2345k c2345kM78093a2;
        InterfaceC2339e interfaceC2339e2;
        String str5;
        EnumC2341g enumC2341g2;
        if (abstractC32269c instanceof C26374w1) {
            c26374w1 = (C26374w1) abstractC32269c;
            int i14 = c26374w1.f104805G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c26374w1.f104805G = i14 - Integer.MIN_VALUE;
            } else {
                c26374w1 = new C26374w1(this, abstractC32269c);
            }
        } else {
            c26374w1 = new C26374w1(this, abstractC32269c);
        }
        Object objM8817m = c26374w1.f104803E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c26374w1.f104805G;
        if (i15 != 0) {
            if (i15 == 1) {
                i13 = c26374w1.f104809z;
                c3058tM8707a = c26374w1.f104808y;
                str2 = c26374w1.f104807x;
                c26377x1 = c26374w1.f104806w;
                AbstractC34132o.m107864I(objM8817m);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = c26374w1.f104809z;
                str3 = c26374w1.f104807x;
                c26377x2 = c26374w1.f104806w;
                AbstractC34132o.m107864I(objM8817m);
            }
            objM107888l = ((C23468n) objM8817m).f92940w;
            thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                objM107888l = AbstractC34132o.m107888l(thM68037a);
            }
            if (objM107888l instanceof C23467m) {
                c2345kM78093a = c26377x2.m78093a();
                interfaceC2339e = c2345kM78093a.f9275c;
                str4 = c2345kM78093a.f9273a;
                enumC2341g = EnumC2341g.WARN;
                if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                    InterfaceC2344j interfaceC2344j = c2345kM78093a.f9274b;
                    thM68037a2 = C23468n.m68037a(objM107888l);
                    if (thM68037a2 != null) {
                        message = thM68037a2.getMessage();
                    } else {
                        message = null;
                    }
                    StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "[submit] Job #", " '", str3, "' returned with failure: ");
                    sbM53373n.append(message);
                    interfaceC2344j.log(enumC2341g, str4, sbM53373n.toString(), null);
                }
            } else {
                c2345kM78093a2 = c26377x2.m78093a();
                interfaceC2339e2 = c2345kM78093a2.f9275c;
                str5 = c2345kM78093a2.f9273a;
                enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str5)) {
                    c2345kM78093a2.f9274b.log(enumC2341g2, str5, AbstractC30007c.m91838h(i13, "[submit] Job #", " '", str3, "' returned successfully"), null);
                    return objM107888l;
                }
            }
            return objM107888l;
        }
        AbstractC34132o.m107864I(objM8817m);
        int i16 = this.f104820e + 1;
        this.f104820e = i16;
        C2345k c2345kM78093a3 = m78093a();
        InterfaceC2339e interfaceC2339e3 = c2345kM78093a3.f9275c;
        String str6 = c2345kM78093a3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str6)) {
            InterfaceC2344j interfaceC2344j2 = c2345kM78093a3.f9274b;
            C2996c2 c2996c2 = this.f104818c;
            boolean z4 = false;
            if (c2996c2 != null && c2996c2.isActive()) {
                z4 = true;
            }
            interfaceC2344j2.log(enumC2341g3, str6, AbstractC18489d0.m53372m(AbstractC18489d0.m53373n(i16, "[submit] Job #", " '", str, "' submitted to SerialProcessor (worker running: "), z4, ")"), null);
        }
        if (this.f104818c == null) {
            C2345k c2345kM78093a4 = m78093a();
            InterfaceC2339e interfaceC2339e4 = c2345kM78093a4.f9275c;
            String str7 = c2345kM78093a4.f9273a;
            if (interfaceC2339e4.isLoggable(enumC2341g3, str7)) {
                c2345kM78093a4.f9274b.log(enumC2341g3, str7, "[submit] Starting SerialProcessor worker", null);
            }
            this.f104818c = AbstractC3006f0.m8732z(this.f104816a, null, null, new C13965o1(this, null), 3);
        }
        c3058tM8707a = AbstractC3006f0.m8707a();
        C11923h c11923h = this.f104817b;
        if (c11923h.m32222x()) {
            C2345k c2345kM78093a5 = m78093a();
            InterfaceC2339e interfaceC2339e5 = c2345kM78093a5.f9275c;
            String str8 = c2345kM78093a5.f9273a;
            EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
            if (interfaceC2339e5.isLoggable(enumC2341g4, str8)) {
                c2345kM78093a5.f9274b.log(enumC2341g4, str8, AbstractC30007c.m91838h(i16, "[submit] Job #", " '", str, "' failed - channel is closed"), null);
            }
            return AbstractC34132o.m107888l(new Exception("[SerialProcessor] Channel is closed"));
        }
        C26371v1 c26371v1 = new C26371v1(function1, c3058tM8707a, i16, str);
        c26374w1.f104806w = this;
        c26374w1.f104807x = str;
        c26374w1.f104808y = c3058tM8707a;
        c26374w1.f104809z = i16;
        c26374w1.f104805G = 1;
        if (c11923h.mo32219t(c26371v1, c26374w1) != enumC31071a) {
            c26377x1 = this;
            str2 = str;
            i13 = i16;
        }
        return enumC31071a;
        c26377x1.f104822g++;
        C2345k c2345kM78093a6 = c26377x1.m78093a();
        InterfaceC2339e interfaceC2339e6 = c2345kM78093a6.f9275c;
        String str9 = c2345kM78093a6.f9273a;
        EnumC2341g enumC2341g5 = EnumC2341g.DEBUG;
        if (interfaceC2339e6.isLoggable(enumC2341g5, str9)) {
            c2345kM78093a6.f9274b.log(enumC2341g5, str9, AbstractC18489d0.m53371l(AbstractC18489d0.m53373n(i13, "[submit] Job #", " '", str2, "' queued successfully (queued: "), c26377x1.f104822g, ")"), null);
        }
        c26374w1.f104806w = c26377x1;
        c26374w1.f104807x = str2;
        c26374w1.f104808y = null;
        c26374w1.f104809z = i13;
        c26374w1.f104805G = 2;
        objM8817m = c3058tM8707a.m8817m(c26374w1);
        if (objM8817m != enumC31071a) {
            str3 = str2;
            c26377x2 = c26377x1;
            objM107888l = ((C23468n) objM8817m).f92940w;
            thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                objM107888l = AbstractC34132o.m107888l(thM68037a);
            }
            if (objM107888l instanceof C23467m) {
                c2345kM78093a2 = c26377x2.m78093a();
                interfaceC2339e2 = c2345kM78093a2.f9275c;
                str5 = c2345kM78093a2.f9273a;
                enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str5)) {
                    c2345kM78093a2.f9274b.log(enumC2341g2, str5, AbstractC30007c.m91838h(i13, "[submit] Job #", " '", str3, "' returned successfully"), null);
                    return objM107888l;
                }
            } else {
                c2345kM78093a = c26377x2.m78093a();
                interfaceC2339e = c2345kM78093a.f9275c;
                str4 = c2345kM78093a.f9273a;
                enumC2341g = EnumC2341g.WARN;
                if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                    InterfaceC2344j interfaceC2344j3 = c2345kM78093a.f9274b;
                    thM68037a2 = C23468n.m68037a(objM107888l);
                    if (thM68037a2 != null) {
                        message = thM68037a2.getMessage();
                    } else {
                        message = null;
                    }
                    StringBuilder sbM53373n2 = AbstractC18489d0.m53373n(i13, "[submit] Job #", " '", str3, "' returned with failure: ");
                    sbM53373n2.append(message);
                    interfaceC2344j3.log(enumC2341g, str4, sbM53373n2.toString(), null);
                }
            }
            return objM107888l;
        }
        return enumC31071a;
    }
}
