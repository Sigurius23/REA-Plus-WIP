package q30;

import bc3.AbstractC3034m0;
import java.util.concurrent.TimeUnit;
import l83.C23468n;
import n30.C26212c;
import n30.InterfaceC26213d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r30.C30897b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: q30.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C29911j implements InterfaceC29913k {

    /* JADX INFO: renamed from: e */
    public static final long f122195e = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a */
    public final C30897b f122196a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC26213d f122197b;

    /* JADX INFO: renamed from: c */
    public final C29932t0 f122198c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30063j f122199d;

    public C29911j(C30897b creqData, InterfaceC26213d errorReporter, C29928r0 creqExecutorFactory, InterfaceC30063j workContext) {
        AbstractC22676k.m65750j(creqData, "creqData");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(creqExecutorFactory, "creqExecutorFactory");
        AbstractC22676k.m65750j(workContext, "workContext");
        C29932t0 c29932t0M91522a = creqExecutorFactory.m91522a(errorReporter, workContext);
        this.f122196a = creqData;
        this.f122197b = errorReporter;
        this.f122198c = c29932t0M91522a;
        this.f122199d = workContext;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0078, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static final Object m91517a(C29911j c29911j, C30897b c30897b, AbstractC32269c abstractC32269c) {
        C29909i c29909i;
        C29911j c29911j2;
        C30897b c30897b2;
        Object objM107888l;
        Throwable thM68037a;
        Throwable thM68037a2;
        c29911j.getClass();
        if (abstractC32269c instanceof C29909i) {
            c29909i = (C29909i) abstractC32269c;
            int i13 = c29909i.f122185E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c29909i.f122185E = i13 - Integer.MIN_VALUE;
            } else {
                c29909i = new C29909i(c29911j, abstractC32269c);
            }
        } else {
            c29909i = new C29909i(c29911j, abstractC32269c);
        }
        Object objM91524b = c29909i.f122188y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c29909i.f122185E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM91524b);
                c29909i.f122186w = c29911j;
                c29909i.f122187x = c30897b;
                c29909i.f122185E = 1;
                if (AbstractC3034m0.m8782b(f122195e, c29909i) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c30897b2 = c29909i.f122187x;
                c29911j2 = c29909i.f122186w;
                try {
                    AbstractC34132o.m107864I(objM91524b);
                    objM107888l = (AbstractC29931t) objM91524b;
                } catch (Throwable th3) {
                    th = th3;
                    objM107888l = AbstractC34132o.m107888l(th);
                }
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    InterfaceC26213d interfaceC26213d = c29911j2.f122197b;
                    c30897b2.getClass();
                    ((C26212c) interfaceC26213d).m77828c(new RuntimeException(AbstractC39415s.m125909s("\n                            Failed to execute challenge request.\n\n                            CReq = " + C30897b.m95018b(c30897b2, null, null, null, 3935) + "\n                        "), thM68037a));
                }
                thM68037a2 = C23468n.m68037a(objM107888l);
                if (thM68037a2 == null) {
                    return objM107888l;
                }
                return new C29925q(thM68037a2);
            }
            c30897b = c29909i.f122187x;
            c29911j = c29909i.f122186w;
            AbstractC34132o.m107864I(objM91524b);
            C29932t0 c29932t0 = c29911j.f122198c;
            c29909i.f122186w = c29911j;
            c29909i.f122187x = c30897b;
            c29909i.f122185E = 2;
            objM91524b = c29932t0.m91524b(c30897b, c29909i);
            if (objM91524b != enumC31071a) {
                C30897b c30897b3 = c30897b;
                c29911j2 = c29911j;
                c30897b2 = c30897b3;
                objM107888l = (AbstractC29931t) objM91524b;
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    InterfaceC26213d interfaceC26213d2 = c29911j2.f122197b;
                    c30897b2.getClass();
                    ((C26212c) interfaceC26213d2).m77828c(new RuntimeException(AbstractC39415s.m125909s("\n                            Failed to execute challenge request.\n\n                            CReq = " + C30897b.m95018b(c30897b2, null, null, null, 3935) + "\n                        "), thM68037a));
                }
                thM68037a2 = C23468n.m68037a(objM107888l);
                if (thM68037a2 == null) {
                    return objM107888l;
                }
                return new C29925q(thM68037a2);
            }
            return enumC31071a;
        } catch (Throwable th4) {
            th = th4;
            C30897b c30897b4 = c30897b;
            c29911j2 = c29911j;
            c30897b2 = c30897b4;
            objM107888l = AbstractC34132o.m107888l(th);
        }
    }
}
