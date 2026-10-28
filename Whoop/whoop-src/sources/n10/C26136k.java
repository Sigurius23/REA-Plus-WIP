package n10;

import b10.C2273z0;
import b10.InterfaceC2227c1;
import e10.C12535b;
import e10.C12567r;
import e10.C12574u0;
import l83.C23468n;
import la.C23548b;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qg3.C30352d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v00.C35493u;
import x30.AbstractC37926s0;
import y00.C38809d5;
import y00.C38901n;
import y00.C38919p;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: n10.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C26136k implements InterfaceC26133i0 {

    /* JADX INFO: renamed from: a */
    public final C38901n f103543a;

    /* JADX INFO: renamed from: b */
    public final C35493u f103544b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2227c1 f103545c;

    /* JADX INFO: renamed from: d */
    public final C39857f f103546d;

    /* JADX INFO: renamed from: e */
    public final C30352d f103547e;

    /* JADX INFO: renamed from: f */
    public final C23548b f103548f;

    /* JADX INFO: renamed from: g */
    public final C30765d f103549g;

    public C26136k(C38901n clientAttributionMetadata, C35493u integrationMetadata, InterfaceC2227c1 stripeRepository, C39857f requestOptions, C30352d setupIntentInterceptorFactory, C23548b attachPaymentMethodInterceptorFactory, C30765d logger) {
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        AbstractC22676k.m65750j(integrationMetadata, "integrationMetadata");
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(requestOptions, "requestOptions");
        AbstractC22676k.m65750j(setupIntentInterceptorFactory, "setupIntentInterceptorFactory");
        AbstractC22676k.m65750j(attachPaymentMethodInterceptorFactory, "attachPaymentMethodInterceptorFactory");
        AbstractC22676k.m65750j(logger, "logger");
        this.f103543a = clientAttributionMetadata;
        this.f103544b = integrationMetadata;
        this.f103545c = stripeRepository;
        this.f103546d = requestOptions;
        this.f103547e = setupIntentInterceptorFactory;
        this.f103548f = attachPaymentMethodInterceptorFactory;
        this.f103549g = logger;
    }

    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: a */
    public final Object mo77680a(InterfaceC38802c8 interfaceC38802c8, C12574u0 c12574u0, C38919p c38919p, InterfaceC30057d interfaceC30057d) {
        IllegalStateException illegalStateException = new IllegalStateException("Cannot use CustomerSheetConfirmationInterceptor with saved payment methods!");
        return new C12535b(illegalStateException, AbstractC37926s0.m121456H(illegalStateException), C12567r.f42912a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r11 == r0) goto L53;
     */
    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo77681b(y00.InterfaceC38802c8 r8, e10.C12572t0 r9, y00.C38919p r10, q83.InterfaceC30057d r11) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n10.C26136k.mo77681b(y00.c8, e10.t0, y00.p, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m77686c(C38809d5 c38809d5, AbstractC32269c abstractC32269c) {
        C26132i c26132i;
        Object objM7093p;
        C26136k c26136k;
        if (abstractC32269c instanceof C26132i) {
            c26132i = (C26132i) abstractC32269c;
            int i13 = c26132i.f103531E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26132i.f103531E = i13 - Integer.MIN_VALUE;
            } else {
                c26132i = new C26132i(this, abstractC32269c);
            }
        } else {
            c26132i = new C26132i(this, abstractC32269c);
        }
        Object obj = c26132i.f103534y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26132i.f103531E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c26132i.f103532w = this;
            c26132i.f103533x = c38809d5;
            c26132i.f103531E = 1;
            objM7093p = ((C2273z0) this.f103545c).m7093p(c38809d5, this.f103546d, c26132i);
            if (objM7093p == enumC31071a) {
                return enumC31071a;
            }
            c26136k = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38809d5 = c26132i.f103533x;
            c26136k = c26132i.f103532w;
            AbstractC34132o.m107864I(obj);
            objM7093p = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM7093p);
        if (thM68037a != null) {
            c26136k.f103549g.m94512b("Failed to create payment method for " + c38809d5.f167026w, thM68037a);
        }
        AbstractC34132o.m107864I(objM7093p);
        return objM7093p;
    }
}
