package c20;

import b10.C2222b;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.stripe.android.model.StripeIntent$NextActionType;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p078d1.C11457j;
import p479s4.AbstractC32126g;
import p505ts.AbstractC34132o;
import p537ux.C35357s0;
import p664yy.C39857f;
import p664yy.C39865j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s40.C32132a;
import s83.AbstractC32269c;
import v10.C35525a;
import y00.C38851h7;
import y00.C38871j7;
import y00.C38945r7;
import y00.C38999x7;
import y00.InterfaceC38802c8;
import y00.InterfaceC38936q7;

/* JADX INFO: renamed from: c20.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C3886n extends AbstractC3877e {

    /* JADX INFO: renamed from: a */
    public final Function1 f15905a;

    /* JADX INFO: renamed from: b */
    public final C39865j f15906b;

    /* JADX INFO: renamed from: c */
    public final C2222b f15907c;

    /* JADX INFO: renamed from: d */
    public final boolean f15908d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC30063j f15909e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4339a f15910f;

    /* JADX INFO: renamed from: g */
    public final boolean f15911g;

    /* JADX INFO: renamed from: h */
    public final C35525a f15912h;

    /* JADX INFO: renamed from: i */
    public final C11457j f15913i;

    public C3886n(Function1 paymentBrowserAuthStarterFactory, C39865j analyticsRequestExecutor, C2222b paymentAnalyticsRequestFactory, boolean z4, InterfaceC30063j uiContext, InterfaceC4339a publishableKeyProvider, boolean z13, C35525a defaultReturnUrl, C11457j redirectResolver) {
        AbstractC22676k.m65750j(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC22676k.m65750j(uiContext, "uiContext");
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(defaultReturnUrl, "defaultReturnUrl");
        AbstractC22676k.m65750j(redirectResolver, "redirectResolver");
        this.f15905a = paymentBrowserAuthStarterFactory;
        this.f15906b = analyticsRequestExecutor;
        this.f15907c = paymentAnalyticsRequestFactory;
        this.f15908d = z4;
        this.f15909e = uiContext;
        this.f15910f = publishableKeyProvider;
        this.f15911g = z13;
        this.f15912h = defaultReturnUrl;
        this.f15913i = redirectResolver;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // c20.AbstractC3877e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object mo6697d(C32132a c32132a, InterfaceC38802c8 interfaceC38802c8, C39857f c39857f, InterfaceC30057d interfaceC30057d) throws Throwable {
        C3884l c3884l;
        C39857f c39857f2;
        C3882j c3882j;
        C3886n c3886n;
        InterfaceC38802c8 interfaceC38802c9;
        C32132a c32132a2;
        C3882j c3882j2;
        C32132a c32132a3;
        C3886n c3886n2;
        String clientSecret;
        Object objM8705K;
        InterfaceC38802c8 interfaceC38802c10 = interfaceC38802c8;
        if (interfaceC30057d instanceof C3884l) {
            c3884l = (C3884l) interfaceC30057d;
            int i13 = c3884l.f15896G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3884l.f15896G = i13 - Integer.MIN_VALUE;
            } else {
                c3884l = new C3884l(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c3884l = new C3884l(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM11859f = c3884l.f15894E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3884l.f15896G;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM11859f);
            Object objMo124335m = interfaceC38802c10.mo124335m();
            if (objMo124335m instanceof C38945r7) {
                c3884l.f15897w = this;
                c32132a3 = c32132a;
                c3884l.f15898x = c32132a3;
                c3884l.f15899y = interfaceC38802c10;
                c39857f2 = c39857f;
                c3884l.f15900z = c39857f2;
                c3884l.f15896G = 1;
                objM11859f = m11859f((C38945r7) objMo124335m, interfaceC38802c10, c3884l);
                if (objM11859f != enumC31071a) {
                    c3886n2 = this;
                }
            } else {
                c39857f2 = c39857f;
                if (objMo124335m instanceof C38851h7) {
                    C38851h7 c38851h7 = (C38851h7) objMo124335m;
                    this.f15906b.m127938a(C2222b.m7051c(this.f15907c, PaymentAnalyticsEvent.AuthRedirect, null, null, null, null, 62));
                    String string = c38851h7.f167231y.toString();
                    AbstractC22676k.m65749i(string, "toString(...)");
                    c3882j = new C3882j(60, string, c38851h7.f167232z, null);
                } else if (objMo124335m instanceof InterfaceC38936q7) {
                    String strMo124358b = ((InterfaceC38936q7) objMo124335m).mo124358b();
                    AbstractC22676k.m65747g(strMo124358b);
                    if (strMo124358b.length() <= 0) {
                        strMo124358b = null;
                    }
                    if (strMo124358b == null) {
                        StripeIntent$NextActionType stripeIntent$NextActionTypeMo124328O = interfaceC38802c10.mo124328O();
                        throw new IllegalArgumentException(AbstractC11266d.m30461o("null hostedVoucherUrl for ", stripeIntent$NextActionTypeMo124328O != null ? stripeIntent$NextActionTypeMo124328O.f22242w : null));
                    }
                    c3882j = new C3882j(52, strMo124358b, null, null);
                } else {
                    boolean z4 = objMo124335m instanceof C38871j7;
                    C35525a c35525a = this.f15912h;
                    if (z4) {
                        c3882j = new C3882j(52, ((C38871j7) objMo124335m).f167318w, c35525a.m112681a(), null);
                    } else {
                        if (!(objMo124335m instanceof C38999x7)) {
                            throw new IllegalArgumentException("WebAuthenticator can't process nextActionData: " + objMo124335m);
                        }
                        c3882j = new C3882j(52, ((C38999x7) objMo124335m).f167862w, c35525a.m112681a(), null);
                    }
                }
                c3886n = this;
                interfaceC38802c9 = interfaceC38802c10;
                c32132a2 = c32132a;
                c3882j2 = c3882j;
                List list = C35357s0.f150612l;
                int iM100044i = AbstractC32126g.m100044i(interfaceC38802c9);
                clientSecret = interfaceC38802c9.getClientSecret();
                if (clientSecret == null) {
                    clientSecret = "";
                }
                String str = clientSecret;
                String str2 = c3882j2.f15878a;
                String str3 = c39857f2.f172129x;
                String str4 = c3882j2.f15879b;
                boolean z13 = c3882j2.f15880c;
                String str5 = c3882j2.f15881d;
                boolean z14 = c3882j2.f15882e;
                c3884l.f15897w = null;
                c3884l.f15898x = null;
                c3884l.f15899y = null;
                c3884l.f15900z = null;
                c3884l.f15896G = 2;
                objM8705K = AbstractC3006f0.m8705K(c3886n.f15909e, new C3883k(c3886n, c32132a2, interfaceC38802c9, iM100044i, str, str2, str4, str3, z13, str5, z14, null), c3884l);
                if (objM8705K != enumC31071a) {
                    objM8705K = c23454a0;
                }
                if (objM8705K != enumC31071a) {
                    return c23454a0;
                }
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM11859f);
            return c23454a0;
        }
        C39857f c39857f3 = c3884l.f15900z;
        InterfaceC38802c8 interfaceC38802c11 = c3884l.f15899y;
        C32132a c32132a4 = c3884l.f15898x;
        C3886n c3886n3 = c3884l.f15897w;
        AbstractC34132o.m107864I(objM11859f);
        c39857f2 = c39857f3;
        interfaceC38802c10 = interfaceC38802c11;
        c32132a3 = c32132a4;
        c3886n2 = c3886n3;
        c3882j2 = (C3882j) objM11859f;
        interfaceC38802c9 = interfaceC38802c10;
        c32132a2 = c32132a3;
        c3886n = c3886n2;
        List list2 = C35357s0.f150612l;
        int iM100044i2 = AbstractC32126g.m100044i(interfaceC38802c9);
        clientSecret = interfaceC38802c9.getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        String str6 = clientSecret;
        String str7 = c3882j2.f15878a;
        String str8 = c39857f2.f172129x;
        String str9 = c3882j2.f15879b;
        boolean z15 = c3882j2.f15880c;
        String str10 = c3882j2.f15881d;
        boolean z16 = c3882j2.f15882e;
        c3884l.f15897w = null;
        c3884l.f15898x = null;
        c3884l.f15899y = null;
        c3884l.f15900z = null;
        c3884l.f15896G = 2;
        objM8705K = AbstractC3006f0.m8705K(c3886n.f15909e, new C3883k(c3886n, c32132a2, interfaceC38802c9, iM100044i2, str6, str7, str9, str8, z15, str10, z16, null), c3884l);
        if (objM8705K != enumC31071a) {
            objM8705K = c23454a0;
        }
        if (objM8705K != enumC31071a) {
            return enumC31071a;
        }
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r2 == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r2 == r4) goto L31;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11859f(y00.C38945r7 r17, y00.InterfaceC38802c8 r18, s83.AbstractC32269c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c20.C3886n.m11859f(y00.r7, y00.c8, s83.c):java.lang.Object");
    }
}
