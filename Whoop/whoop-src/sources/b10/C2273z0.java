package b10;

import a13.C0150h;
import a20.C0167g;
import android.content.Context;
import b01.C2185f;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.StripeIntent$Usage;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDeviceKt;
import java.io.IOException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kr.C22786e;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import m83.C25271y;
import m83.C25272z;
import n83.C26463f;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;
import p012ab.C0684i0;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p133f1.C13968p1;
import p442qy.C30762a;
import p442qy.C30764c;
import p442qy.C30765d;
import p442qy.C30766e;
import p442qy.C30767f;
import p474s.AbstractC32004s;
import p479s4.AbstractC32120a;
import p479s4.AbstractC32121b;
import p479s4.AbstractC32123d;
import p499t9.C33623c0;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p508ty.C34247a;
import p508ty.C34248b;
import p537ux.C35339j0;
import p537ux.EnumC35341k0;
import p547v8.AbstractC35785b;
import p565vy.InterfaceC36562b;
import p598wy.C37688a;
import p598wy.InterfaceC37689b;
import p664yy.AbstractC39877q;
import p664yy.C39857f;
import p664yy.C39858f0;
import p664yy.C39859g;
import p664yy.C39865j;
import p664yy.C39874n0;
import p664yy.EnumC39868k0;
import p695zx.C41179a;
import p695zx.C41193o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import so.C32800q;
import wb3.AbstractC37056f;
import y00.AbstractC38970u5;
import y00.AbstractC39006y5;
import y00.C38775a1;
import y00.C38809d5;
import y00.C38810d6;
import y00.C38827f3;
import y00.C38844h0;
import y00.C38854i0;
import y00.C38889l5;
import y00.C38892m;
import y00.C38893m0;
import y00.C38915o4;
import y00.C38928q;
import y00.C38937r;
import y00.C38976v2;
import y00.C38982w;
import y00.C38983w0;
import y00.C38984w1;
import y00.C38998x6;
import y00.C39011z1;
import y00.C39015z5;
import y00.C39016z6;
import y00.EnumC38817e3;
import y00.EnumC38828f4;
import y00.EnumC38862i8;
import y00.EnumC38922p2;
import y00.InterfaceC38786b2;
import y00.InterfaceC38920p0;
import y00.InterfaceC39010z0;
import z00.C39932a;
import z00.C39933b;
import z00.C39937f;
import z00.C39938g;

/* JADX INFO: renamed from: b10.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2273z0 implements InterfaceC2227c1 {

    /* JADX INFO: renamed from: b */
    public final Context f9011b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4339a f9012c;

    /* JADX INFO: renamed from: d */
    public final EnumC2228d f9013d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC30063j f9014e;

    /* JADX INFO: renamed from: f */
    public final Set f9015f;

    /* JADX INFO: renamed from: g */
    public final C0684i0 f9016g;

    /* JADX INFO: renamed from: h */
    public final C39865j f9017h;

    /* JADX INFO: renamed from: i */
    public final C34247a f9018i;

    /* JADX INFO: renamed from: j */
    public final C2222b f9019j;

    /* JADX INFO: renamed from: k */
    public final C33647p f9020k;

    /* JADX INFO: renamed from: l */
    public final C29938w0 f9021l;

    public C2273z0(Context context, InterfaceC4339a publishableKeyProvider, EnumC2228d requestSurface, C30765d logger, InterfaceC30063j workContext, Set productUsageTokens, C39865j analyticsRequestExecutor, C2222b paymentAnalyticsRequestFactory, Set set, int i13) {
        if ((i13 & 8) != 0) {
            String str = C35339j0.f150551c;
        }
        logger = (i13 & 16) != 0 ? C30766e.f126697b : logger;
        if ((i13 & 32) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            workContext = ExecutorC22364d.f87316w;
        }
        int i14 = i13 & 64;
        C25235a0 c25235a0 = C25235a0.f99113w;
        productUsageTokens = i14 != 0 ? c25235a0 : productUsageTokens;
        C0684i0 c0684i0 = new C0684i0(workContext, logger, 14);
        analyticsRequestExecutor = (i13 & 256) != 0 ? new C39865j(logger, workContext) : analyticsRequestExecutor;
        C34247a c34247aM100021a = AbstractC32123d.m100021a(context, workContext);
        new C41193o(context, productUsageTokens, requestSurface, analyticsRequestExecutor);
        paymentAnalyticsRequestFactory = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new C2222b(context, productUsageTokens, publishableKeyProvider) : paymentAnalyticsRequestFactory;
        int i15 = 2;
        C33647p c33647p = new C33647p(i15);
        Set set2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c25235a0 : set;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            ((EnumC35341k0) it.next()).getClass();
            arrayList.add("wechat_pay_beta=v1");
        }
        String apiVersion = new C30762a(0, AbstractC25265s.m74103I1(arrayList)).m94509a();
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(requestSurface, "requestSurface");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(productUsageTokens, "productUsageTokens");
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC22676k.m65750j(apiVersion, "apiVersion");
        this.f9011b = context;
        this.f9012c = publishableKeyProvider;
        this.f9013d = requestSurface;
        this.f9014e = workContext;
        this.f9015f = productUsageTokens;
        this.f9016g = c0684i0;
        this.f9017h = analyticsRequestExecutor;
        this.f9018i = c34247aM100021a;
        this.f9019j = paymentAnalyticsRequestFactory;
        this.f9020k = c33647p;
        this.f9021l = new C29938w0((C30764c) null, apiVersion, "AndroidBindings/22.6.1");
        m7102y();
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(workContext), null, null, new C0150h(this, null, i15), 3);
    }

    /* JADX INFO: renamed from: l */
    public static LinkedHashMap m7054l(String str, List list) {
        return AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("client_secret", str), C22786e.m65995b(list));
    }

    /* JADX INFO: renamed from: A */
    public final String m7055A(Object obj) {
        C39874n0 c39874n0 = (C39874n0) (obj instanceof C23467m ? null : obj);
        Throwable thM68037a = C23468n.m68037a(obj);
        if (thM68037a != null) {
            return AbstractC32121b.m100006k(thM68037a);
        }
        if (c39874n0 == null || !c39874n0.f172190e) {
            return null;
        }
        try {
            m7057C(c39874n0);
            throw null;
        } catch (Throwable th3) {
            Throwable thM68037a2 = C23468n.m68037a(AbstractC34132o.m107888l(th3));
            if (thM68037a2 != null) {
                return AbstractC32121b.m100006k(thM68037a2);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m7056B(C38976v2 c38976v2, Set set, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2231e0 c2231e0;
        Object objM7100w;
        if (abstractC32269c instanceof C2231e0) {
            c2231e0 = (C2231e0) abstractC32269c;
            int i13 = c2231e0.f8879y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2231e0.f8879y = i13 - Integer.MIN_VALUE;
            } else {
                c2231e0 = new C2231e0(this, abstractC32269c);
            }
        } else {
            c2231e0 = new C2231e0(this, abstractC32269c);
        }
        Object obj = c2231e0.f8877w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2231e0.f8879y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C39859g c39859gM91542m = C29938w0.m91542m(this.f9021l, C22786e.m65997j("payment_methods"), c39857f, c38976v2.mo124325c0(), 8);
            InterfaceC37689b c39937f = new C39937f();
            Function1 c2232f = new C2232f(this, set, 3);
            c2231e0.f8879y = 1;
            objM7100w = m7100w(c39859gM91542m, c39937f, c2232f, c2231e0);
            if (objM7100w == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM7100w = ((C23468n) obj).f92940w;
        }
        return !(objM7100w instanceof C23467m) ? ((C39015z5) objM7100w).f167923w : objM7100w;
    }

    /* JADX INFO: renamed from: C */
    public final void m7057C(C39874n0 c39874n0) throws CardException, InvalidRequestException, PermissionException, RateLimitException, APIException, AuthenticationException {
        C39858f0 c39858f0 = c39874n0.f172191f;
        String str = c39858f0 != null ? c39858f0.f172131a : null;
        int i13 = c39874n0.f172186a;
        C30767f c30767fM121114b = C37688a.m121114b(AbstractC39877q.m127952i(c39874n0));
        Context context = this.f9011b;
        AbstractC22676k.m65750j(context, "context");
        C30767f c30767f = new C30767f(c30767fM121114b.f126702w, AbstractC35785b.m113428w(context, c30767fM121114b.f126703x, c30767fM121114b.f126704y, c30767fM121114b.f126698E), c30767fM121114b.f126704y, c30767fM121114b.f126705z, c30767fM121114b.f126698E, c30767fM121114b.f126699F, c30767fM121114b.f126700G, c30767fM121114b.f126701H);
        if (i13 == 429) {
            throw new RateLimitException(c30767f, str, 12);
        }
        switch (i13) {
            case 400:
            case 404:
                throw new InvalidRequestException(i13, 24, str, null, null, c30767f);
            case 401:
                throw new AuthenticationException(c30767f, str);
            case 402:
                throw new CardException(402, 24, str, null, null, c30767f);
            case 403:
                throw new PermissionException(c30767f, str);
            default:
                throw new APIException(i13, 24, str, null, null, c30767f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D */
    public final Object m7058D(String str, Set set, AbstractC32269c abstractC32269c, C39857f c39857f) {
        C2233f0 c2233f0;
        if (abstractC32269c instanceof C2233f0) {
            c2233f0 = (C2233f0) abstractC32269c;
            int i13 = c2233f0.f8885y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2233f0.f8885y = i13 - Integer.MIN_VALUE;
            } else {
                c2233f0 = new C2233f0(this, abstractC32269c);
            }
        } else {
            c2233f0 = new C2233f0(this, abstractC32269c);
        }
        Object obj = c2233f0.f8883w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2233f0.f8885y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65997j("consumers/payment_details/list"), c39857f, AbstractC25247g0.m73990Y(new C23465k("request_surface", this.f9013d.f8870w), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str)), new C23465k("types", AbstractC25265s.m74093D1(set))), 8);
        InterfaceC37689b interfaceC37689b = C39932a.f172379x;
        c2233f0.f8885y = 1;
        Object objM7100w = m7100w(c39859gM91543n, interfaceC37689b, new C2185f(12), c2233f0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: E */
    public final Object m7059E(String str, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2235g0 c2235g0;
        if (abstractC32269c instanceof C2235g0) {
            c2235g0 = (C2235g0) abstractC32269c;
            int i13 = c2235g0.f8889y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2235g0.f8889y = i13 - Integer.MIN_VALUE;
            } else {
                c2235g0 = new C2235g0(this, abstractC32269c);
            }
        } else {
            c2235g0 = new C2235g0(this, abstractC32269c);
        }
        Object obj = c2235g0.f8887w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2235g0.f8889y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65997j("consumers/shipping_addresses/list"), c39857f, AbstractC25247g0.m73990Y(new C23465k("request_surface", this.f9013d.f8870w), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str))), 8);
        InterfaceC37689b interfaceC37689b = C39932a.f172375E;
        c2235g0.f8889y = 1;
        Object objM7100w = m7100w(c39859gM91543n, interfaceC37689b, new C2185f(12), c2235g0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public final Object m7060F(String str, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2237h0 c2237h0;
        if (abstractC32269c instanceof C2237h0) {
            c2237h0 = (C2237h0) abstractC32269c;
            int i13 = c2237h0.f8893y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2237h0.f8893y = i13 - Integer.MIN_VALUE;
            } else {
                c2237h0 = new C2237h0(this, abstractC32269c);
            }
        } else {
            c2237h0 = new C2237h0(this, abstractC32269c);
        }
        Object obj = c2237h0.f8891w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2237h0.f8893y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65997j("consumers/sessions/log_out"), c39857f, AbstractC25247g0.m73990Y(new C23465k("request_surface", this.f9013d.f8870w), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str))), 8);
        InterfaceC37689b c39933b = new C39933b();
        c2237h0.f8893y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39933b, new C2185f(12), c2237h0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m7061G(C39859g c39859g, Function1 function1, AbstractC32269c abstractC32269c) throws Throwable {
        C2239i0 c2239i0;
        Object objM107888l;
        AbstractC2238i abstractC2238i;
        C2273z0 c2273z0;
        Object objM1727r;
        Object objM107888l2;
        Throwable thM68037a;
        C39874n0 c39874n0;
        String str;
        if (abstractC32269c instanceof C2239i0) {
            c2239i0 = (C2239i0) abstractC32269c;
            int i13 = c2239i0.f8896G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2239i0.f8896G = i13 - Integer.MIN_VALUE;
            } else {
                c2239i0 = new C2239i0(this, abstractC32269c);
            }
        } else {
            c2239i0 = new C2239i0(this, abstractC32269c);
        }
        Object obj = c2239i0.f8894E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c2239i0.f8896G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                String property = Security.getProperty("networkaddress.cache.ttl");
                Security.setProperty("networkaddress.cache.ttl", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
                objM107888l = new C2236h(property);
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            if (objM107888l instanceof C23467m) {
                objM107888l = C2234g.f8886a;
            }
            abstractC2238i = (AbstractC2238i) objM107888l;
            try {
                C0684i0 c0684i0 = this.f9016g;
                c2239i0.f8897w = this;
                c2239i0.f8898x = c39859g;
                c2239i0.f8899y = function1;
                c2239i0.f8900z = abstractC2238i;
                c2239i0.f8896G = 1;
                objM1727r = c0684i0.m1727r(c39859g, c2239i0);
                if (objM1727r == enumC31071a) {
                    return enumC31071a;
                }
                c2273z0 = this;
                objM107888l2 = (C39874n0) objM1727r;
            } catch (Throwable th4) {
                th = th4;
                c2273z0 = this;
                objM107888l2 = AbstractC34132o.m107888l(th);
                function1.invoke(new C23468n(objM107888l2));
                thM68037a = C23468n.m68037a(objM107888l2);
                if (thM68037a != null) {
                    if (!(thM68037a instanceof IOException)) {
                        throw thM68037a;
                    }
                    int i15 = APIConnectionException.f22150F;
                    throw AbstractC32120a.m99975a((IOException) thM68037a, c39859g.f172133b);
                }
                c39874n0 = (C39874n0) objM107888l2;
                if (c39874n0.f172190e) {
                    c2273z0.m7057C(c39874n0);
                    throw null;
                }
                c2273z0.getClass();
                if (abstractC2238i instanceof C2236h) {
                    str = ((C2236h) abstractC2238i).f8890a;
                    if (str == null) {
                        str = WhoopLabsHrDeviceKt.NO_HR_DEVICE_ID;
                    }
                    Security.setProperty("networkaddress.cache.ttl", str);
                }
                return c39874n0;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2238i abstractC2238i2 = c2239i0.f8900z;
            function1 = c2239i0.f8899y;
            C39859g c39859g2 = c2239i0.f8898x;
            C2273z0 c2273z1 = c2239i0.f8897w;
            try {
                AbstractC34132o.m107864I(obj);
                abstractC2238i = abstractC2238i2;
                c39859g = c39859g2;
                c2273z0 = c2273z1;
                objM1727r = obj;
                try {
                    objM107888l2 = (C39874n0) objM1727r;
                } catch (Throwable th5) {
                    th = th5;
                    objM107888l2 = AbstractC34132o.m107888l(th);
                }
            } catch (Throwable th6) {
                abstractC2238i = abstractC2238i2;
                c39859g = c39859g2;
                c2273z0 = c2273z1;
                th = th6;
                objM107888l2 = AbstractC34132o.m107888l(th);
                function1.invoke(new C23468n(objM107888l2));
                thM68037a = C23468n.m68037a(objM107888l2);
                if (thM68037a != null) {
                    if (!(thM68037a instanceof IOException)) {
                        throw thM68037a;
                    }
                    int i16 = APIConnectionException.f22150F;
                    throw AbstractC32120a.m99975a((IOException) thM68037a, c39859g.f172133b);
                }
                c39874n0 = (C39874n0) objM107888l2;
                if (c39874n0.f172190e) {
                    c2273z0.m7057C(c39874n0);
                    throw null;
                }
                c2273z0.getClass();
                if (abstractC2238i instanceof C2236h) {
                    str = ((C2236h) abstractC2238i).f8890a;
                    if (str == null) {
                        str = WhoopLabsHrDeviceKt.NO_HR_DEVICE_ID;
                    }
                    Security.setProperty("networkaddress.cache.ttl", str);
                }
                return c39874n0;
            }
        }
        function1.invoke(new C23468n(objM107888l2));
        thM68037a = C23468n.m68037a(objM107888l2);
        if (thM68037a != null) {
            if (!(thM68037a instanceof IOException)) {
                throw thM68037a;
            }
            int i17 = APIConnectionException.f22150F;
            throw AbstractC32120a.m99975a((IOException) thM68037a, c39859g.f172133b);
        }
        c39874n0 = (C39874n0) objM107888l2;
        if (c39874n0.f172190e) {
            c2273z0.m7057C(c39874n0);
            throw null;
        }
        c2273z0.getClass();
        if (abstractC2238i instanceof C2236h) {
            str = ((C2236h) abstractC2238i).f8890a;
            if (str == null) {
                str = WhoopLabsHrDeviceKt.NO_HR_DEVICE_ID;
            }
            Security.setProperty("networkaddress.cache.ttl", str);
        }
        return c39874n0;
    }

    /* JADX INFO: renamed from: H */
    public final Map m7062H(Map map, C38809d5 c38809d5, C38998x6 c38998x6) {
        Set setM124342h;
        Object obj = map.get("payment_method_data");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Set set = C25235a0.f99113w;
        if (map2 != null) {
            if (c38809d5 != null && (setM124342h = c38809d5.m124342h()) != null) {
                set = setM124342h;
            }
            return AbstractC25247g0.m73996e0(map, new C23465k("payment_method_data", AbstractC25247g0.m73996e0(map2, m7082d(set))));
        }
        Object obj2 = map.get("source_data");
        Map map3 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map3 == null) {
            return map;
        }
        if (c38998x6 != null) {
            set = c38998x6.f167857J;
        }
        return AbstractC25247g0.m73996e0(map, new C23465k("source_data", AbstractC25247g0.m73996e0(map3, m7082d(set))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: I */
    public final Object m7063I(C38928q c38928q, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2241j0 c2241j0;
        C38809d5 c38809d5;
        Object objM7093p;
        C38928q c38928q2 = c38928q;
        if (abstractC32269c instanceof C2241j0) {
            c2241j0 = (C2241j0) abstractC32269c;
            int i13 = c2241j0.f8907z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2241j0.f8907z = i13 - Integer.MIN_VALUE;
            } else {
                c2241j0 = new C2241j0(this, abstractC32269c);
            }
        } else {
            c2241j0 = new C2241j0(this, abstractC32269c);
        }
        Object obj = c2241j0.f8905x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2241j0.f8907z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!c39857f.m127935h() || (c38809d5 = c38928q2.f167576w) == null) {
                return c38928q2;
            }
            c2241j0.f8904w = c38928q2;
            c2241j0.f8907z = 1;
            objM7093p = m7093p(c38809d5, c39857f, c2241j0);
            if (objM7093p == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38928q2 = c2241j0.f8904w;
            AbstractC34132o.m107864I(obj);
            objM7093p = ((C23468n) obj).f92940w;
        }
        if (objM7093p instanceof C23467m) {
            return objM7093p;
        }
        try {
            String clientSecret = c38928q2.f167561E;
            String paymentMethodId = ((C38915o4) objM7093p).f167527w;
            AbstractC38970u5 abstractC38970u5 = c38928q2.f167565I;
            AbstractC22676k.m65750j(clientSecret, "clientSecret");
            AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
            C38889l5 c38889l5 = abstractC38970u5 instanceof C38889l5 ? (C38889l5) abstractC38970u5 : null;
            C38889l5 c38889l6 = new C38889l5(c38889l5 != null ? c38889l5.f167406z : null);
            C33623c0 c33623c0 = EnumC38828f4.f167088G;
            return new C38928q(null, paymentMethodId, clientSecret, Boolean.FALSE, c38889l6, null, null, null, null, "card", null, null, null, 491053);
        } catch (Throwable th3) {
            return AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: J */
    public final Object m7064J(C38937r c38937r, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2243k0 c2243k0;
        C38809d5 c38809d5;
        Object objM7093p;
        C38937r c38937r2 = c38937r;
        if (abstractC32269c instanceof C2243k0) {
            c2243k0 = (C2243k0) abstractC32269c;
            int i13 = c2243k0.f8914z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2243k0.f8914z = i13 - Integer.MIN_VALUE;
            } else {
                c2243k0 = new C2243k0(this, abstractC32269c);
            }
        } else {
            c2243k0 = new C2243k0(this, abstractC32269c);
        }
        Object obj = c2243k0.f8912x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2243k0.f8914z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!c39857f.m127935h() || (c38809d5 = c38937r2.f167620y) == null) {
                return c38937r2;
            }
            c2243k0.f8911w = c38937r2;
            c2243k0.f8914z = 1;
            objM7093p = m7093p(c38809d5, c39857f, c2243k0);
            if (objM7093p == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38937r2 = c2243k0.f8911w;
            AbstractC34132o.m107864I(obj);
            objM7093p = ((C23468n) obj).f92940w;
        }
        if (objM7093p instanceof C23467m) {
            return objM7093p;
        }
        try {
            String clientSecret = c38937r2.f167618w;
            String paymentMethodId = ((C38915o4) objM7093p).f167527w;
            AbstractC38970u5 abstractC38970u5 = c38937r2.f167614J;
            AbstractC22676k.m65750j(clientSecret, "clientSecret");
            AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
            C38889l5 c38889l5 = abstractC38970u5 instanceof C38889l5 ? (C38889l5) abstractC38970u5 : null;
            C38889l5 c38889l6 = new C38889l5(c38889l5 != null ? c38889l5.f167406z : null);
            C33623c0 c33623c0 = EnumC38828f4.f167088G;
            return new C38937r(clientSecret, paymentMethodId, null, null, true, null, null, null, "card", c38889l6, null, null, null, 7404);
        } catch (Throwable th3) {
            return AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: K */
    public final Object m7065K(String str, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2245l0 c2245l0;
        Object objM107888l;
        if (abstractC32269c instanceof C2245l0) {
            c2245l0 = (C2245l0) abstractC32269c;
            int i13 = c2245l0.f8920y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2245l0.f8920y = i13 - Integer.MIN_VALUE;
            } else {
                c2245l0 = new C2245l0(this, abstractC32269c);
            }
        } else {
            c2245l0 = new C2245l0(this, abstractC32269c);
        }
        Object obj = c2245l0.f8918w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2245l0.f8920y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        try {
            objM107888l = new C38827f3(str).f167087b;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(thM68037a);
        }
        String paymentIntentId = (String) objM107888l;
        m7102y();
        AbstractC22676k.m65750j(paymentIntentId, "paymentIntentId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("payment_intents/%s/refresh", paymentIntentId), c39857f, m7054l(str, C25271y.f99162w), 8);
        InterfaceC37689b c39932a = new C39932a(28);
        Function1 c2230e = new C2230e(this, 2);
        c2245l0.f8920y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c2230e, c2245l0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: L */
    public final Object m7066L(String str, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2247m0 c2247m0;
        Object objM107888l;
        if (abstractC32269c instanceof C2247m0) {
            c2247m0 = (C2247m0) abstractC32269c;
            int i13 = c2247m0.f8926y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2247m0.f8926y = i13 - Integer.MIN_VALUE;
            } else {
                c2247m0 = new C2247m0(this, abstractC32269c);
            }
        } else {
            c2247m0 = new C2247m0(this, abstractC32269c);
        }
        Object obj = c2247m0.f8924w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2247m0.f8926y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        try {
            objM107888l = new C38810d6(str).f167032b;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(thM68037a);
        }
        String paymentIntentId = (String) objM107888l;
        m7102y();
        AbstractC22676k.m65750j(paymentIntentId, "paymentIntentId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("setup_intents/%s/refresh", paymentIntentId), c39857f, m7054l(str, C25271y.f99162w), 8);
        InterfaceC37689b c39938g = new C39938g(1);
        Function1 c2230e = new C2230e(this, 1);
        c2247m0.f8926y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39938g, c2230e, c2247m0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M */
    public final Object m7067M(C39857f c39857f, Map map, AbstractC32269c abstractC32269c) {
        C2249n0 c2249n0;
        if (abstractC32269c instanceof C2249n0) {
            c2249n0 = (C2249n0) abstractC32269c;
            int i13 = c2249n0.f8932y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2249n0.f8932y = i13 - Integer.MIN_VALUE;
            } else {
                c2249n0 = new C2249n0(this, abstractC32269c);
            }
        } else {
            c2249n0 = new C2249n0(this, abstractC32269c);
        }
        Object obj = c2249n0.f8930w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2249n0.f8932y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91542m = C29938w0.m91542m(this.f9021l, "https://merchant-ui-api.stripe.com/elements/mobile-card-element-config", c39857f, map, 8);
        InterfaceC37689b c39932a = new C39932a(12);
        c2249n0.f8932y = 1;
        Object objM7100w = m7100w(c39859gM91542m, c39932a, new C2185f(12), c2249n0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: N */
    public final Object m7068N(String customerId, Set set, AbstractC32269c abstractC32269c, C39857f c39857f) {
        C2251o0 c2251o0;
        if (abstractC32269c instanceof C2251o0) {
            c2251o0 = (C2251o0) abstractC32269c;
            int i13 = c2251o0.f8941y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2251o0.f8941y = i13 - Integer.MIN_VALUE;
            } else {
                c2251o0 = new C2251o0(this, abstractC32269c);
            }
        } else {
            c2251o0 = new C2251o0(this, abstractC32269c);
        }
        Object obj = c2251o0.f8939w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2251o0.f8941y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC22676k.m65750j(customerId, "customerId");
        C39859g c39859gM91542m = C29938w0.m91542m(this.f9021l, C22786e.m65998n("customers/%s", customerId), c39857f, null, 12);
        InterfaceC37689b c39932a = new C39932a(9);
        Function1 c2232f = new C2232f(this, set, 2);
        c2251o0.f8941y = 1;
        Object objM7100w = m7100w(c39859gM91542m, c39932a, c2232f, c2251o0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: O */
    public final Object m7069O(InterfaceC38786b2 interfaceC38786b2, C39857f c39857f, AbstractC32269c abstractC32269c) throws Throwable {
        C2253p0 c2253p0;
        if (abstractC32269c instanceof C2253p0) {
            c2253p0 = (C2253p0) abstractC32269c;
            int i13 = c2253p0.f8947y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2253p0.f8947y = i13 - Integer.MIN_VALUE;
            } else {
                c2253p0 = new C2253p0(this, abstractC32269c);
            }
        } else {
            c2253p0 = new C2253p0(this, abstractC32269c);
        }
        Object obj = c2253p0.f8945w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2253p0.f8947y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        c2253p0.f8947y = 1;
        Object objM7070P = m7070P(interfaceC38786b2, c39857f, c2253p0);
        return objM7070P == obj2 ? obj2 : objM7070P;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final Object m7070P(InterfaceC38786b2 interfaceC38786b2, C39857f c39857f, AbstractC32269c abstractC32269c) throws Throwable {
        C2255q0 c2255q0;
        Throwable th3;
        Long lValueOf;
        C38983w0 c38983w0;
        Object obj;
        C38983w0 c38983w1;
        Object objM99544m;
        Map mapM74000i0;
        String str;
        C38983w0 c38983w2;
        EnumC38817e3 enumC38817e3;
        C38983w0 c38983w3;
        if (abstractC32269c instanceof C2255q0) {
            c2255q0 = (C2255q0) abstractC32269c;
            int i13 = c2255q0.f8956y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2255q0.f8956y = i13 - Integer.MIN_VALUE;
            } else {
                c2255q0 = new C2255q0(this, abstractC32269c);
            }
        } else {
            c2255q0 = new C2255q0(this, abstractC32269c);
        }
        Object obj2 = c2255q0.f8954w;
        Object obj3 = EnumC31071a.f128113w;
        int i14 = c2255q0.f8956y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj2);
            return ((C23468n) obj2).f92940w;
        }
        AbstractC34132o.m107864I(obj2);
        if (c39857f.m127935h()) {
            return AbstractC34132o.m107888l(new IllegalArgumentException("Invalid API key"));
        }
        m7102y();
        InterfaceC37689b c13968p1 = new C13968p1(interfaceC38786b2, c39857f.m127934f());
        C26463f c26463f = new C26463f();
        c26463f.put("type", interfaceC38786b2.getType());
        c26463f.put("mobile_app_id", interfaceC38786b2.mo124320r0());
        String clientSecret = interfaceC38786b2.getClientSecret();
        if (clientSecret != null) {
            c26463f.put("client_secret", clientSecret);
        }
        c26463f.put("locale", interfaceC38786b2.mo124321s0());
        String strMo124313E = interfaceC38786b2.mo124313E();
        if (strMo124313E != null) {
            c26463f.put("customer_session_client_secret", strMo124313E);
        }
        String strMo124318l = interfaceC38786b2.mo124318l();
        if (strMo124318l != null) {
            c26463f.put("legacy_customer_ephemeral_key", strMo124318l);
        }
        List listMo124319r = interfaceC38786b2.mo124319r();
        if (listMo124319r.isEmpty()) {
            listMo124319r = null;
        }
        if (listMo124319r != null) {
            c26463f.put("external_payment_methods", listMo124319r);
        }
        List listMo124323t0 = interfaceC38786b2.mo124323t0();
        if (listMo124323t0.isEmpty()) {
            listMo124323t0 = null;
        }
        if (listMo124323t0 != null) {
            c26463f.put("custom_payment_methods", listMo124323t0);
        }
        String strMo124314Q = interfaceC38786b2.mo124314Q();
        if (strMo124314Q != null) {
            if (strMo124314Q.length() <= 0) {
                strMo124314Q = null;
            }
            if (strMo124314Q != null) {
                c26463f.put("mobile_session_id", strMo124314Q);
            }
        }
        String strMo124322t = interfaceC38786b2.mo124322t();
        if (strMo124322t != null) {
            c26463f.put("client_default_payment_method", strMo124322t);
        }
        C39011z1 c39011z1Mo124316W = interfaceC38786b2.mo124316W();
        if (c39011z1Mo124316W != null) {
            c26463f.putAll(AbstractC25247g0.m73990Y(new C23465k("seller_details[network_id]", c39011z1Mo124316W.f167907w), new C23465k("seller_details[external_id]", c39011z1Mo124316W.f167908x)));
        }
        C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(interfaceC38786b2.mo124315U().f167840w);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        Iterator it = c25263qM74105J1.iterator();
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                break;
            }
            C25239c0 c25239c0 = (C25239c0) c25241d0.next();
            int i15 = c25239c0.f99117a;
            linkedHashMap.put("link[disallow_funding_source_creation][" + i15 + "]", (String) c25239c0.f99118b);
        }
        c26463f.putAll(linkedHashMap);
        String strMo124324u0 = interfaceC38786b2.mo124324u0();
        if (strMo124324u0 != null) {
            c26463f.put("country_override", strMo124324u0);
        }
        C38984w1 c38984w1 = interfaceC38786b2 instanceof C38984w1 ? (C38984w1) interfaceC38786b2 : null;
        if (c38984w1 != null) {
            C38775a1 c38775a1 = c38984w1.f167813x;
            InterfaceC39010z0 interfaceC39010z0 = c38775a1.f166898w;
            C23465k c23465k = new C23465k("deferred_intent[mode]", interfaceC39010z0.mo124403v());
            boolean z4 = interfaceC39010z0 instanceof C38983w0;
            C38983w0 c38983w4 = z4 ? (C38983w0) interfaceC39010z0 : null;
            if (c38983w4 != null) {
                th3 = null;
                lValueOf = Long.valueOf(c38983w4.f167800w);
                interfaceC39010z0 = interfaceC39010z0;
            } else {
                th3 = null;
                lValueOf = null;
            }
            C23465k c23465k2 = new C23465k("deferred_intent[amount]", lValueOf);
            C23465k c23465k3 = new C23465k("deferred_intent[currency]", interfaceC39010z0.mo124402k0());
            StripeIntent$Usage stripeIntent$UsageMo124401D = interfaceC39010z0.mo124401D();
            C23465k c23465k4 = new C23465k("deferred_intent[setup_future_usage]", stripeIntent$UsageMo124401D != null ? stripeIntent$UsageMo124401D.f22258w : th3);
            if (z4) {
                c38983w3 = (C38983w0) interfaceC39010z0;
            } else {
                c38983w0 = th3;
            }
            if (c38983w0 == 0 || (enumC38817e3 = c38983w0.f167803z) == null) {
                c38983w0 = c38983w3;
                c38983w0 = c38983w3;
                obj = th3;
            } else {
                c38983w0 = c38983w3;
                obj = enumC38817e3.f167065w;
            }
            C23465k c23465k5 = new C23465k("deferred_intent[capture_method]", obj);
            C23465k c23465k6 = new C23465k("deferred_intent[payment_method_configuration][id]", c38775a1.f166900y);
            C23465k c23465k7 = new C23465k("deferred_intent[on_behalf_of]", c38775a1.f166901z);
            if (z4) {
                c38983w2 = (C38983w0) interfaceC39010z0;
            } else {
                c38983w1 = th3;
            }
            if (c38983w1 == 0 || (str = c38983w1.f167799E) == null) {
                c38983w1 = c38983w2;
                c38983w1 = c38983w2;
                objM99544m = th3;
            } else {
                c38983w1 = c38983w2;
                objM99544m = AbstractC32004s.m99544m(new JSONObject(str));
            }
            Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, c23465k7, new C23465k("deferred_intent[payment_method_options]", objM99544m));
            List list = c38775a1.f166899x;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            int i16 = 0;
            for (Object obj4 : list) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw th3;
                }
                arrayList.add(new C23465k(AbstractC2875y.m8296i(i16, "deferred_intent[payment_method_types][", "]"), (String) obj4));
                i16 = i17;
            }
            if (mapM73990Y.isEmpty()) {
                mapM74000i0 = AbstractC25247g0.m74000i0(arrayList);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapM73990Y);
                AbstractC25247g0.m73998g0(linkedHashMap2, arrayList);
                mapM74000i0 = linkedHashMap2;
            }
            c26463f.putAll(mapM74000i0);
        }
        C39859g c39859gM91542m = C29938w0.m91542m(this.f9021l, C22786e.m65997j("elements/sessions"), c39857f, AbstractC25247g0.m73995d0(c26463f.m78380b(), C22786e.m65995b(interfaceC38786b2.mo124317f0())), 8);
        Function1 c2185f = new C2185f(this);
        c2255q0.f8956y = 1;
        Object objM7100w = m7100w(c39859gM91542m, c13968p1, c2185f, c2255q0);
        return objM7100w == obj3 ? obj3 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q */
    public final Object m7071Q(String str, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C2257r0 c2257r0;
        Object objM107888l;
        if (abstractC32269c instanceof C2257r0) {
            c2257r0 = (C2257r0) abstractC32269c;
            int i13 = c2257r0.f8962y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2257r0.f8962y = i13 - Integer.MIN_VALUE;
            } else {
                c2257r0 = new C2257r0(this, abstractC32269c);
            }
        } else {
            c2257r0 = new C2257r0(this, abstractC32269c);
        }
        Object obj = c2257r0.f8960w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2257r0.f8962y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        try {
            objM107888l = new C38827f3(str).f167087b;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(thM68037a);
        }
        String paymentIntentId = (String) objM107888l;
        Map mapM65995b = c39857f.m127935h() ? C22786e.m65995b(list) : m7054l(str, list);
        m7102y();
        AbstractC22676k.m65750j(paymentIntentId, "paymentIntentId");
        C39859g c39859gM91542m = C29938w0.m91542m(this.f9021l, C22786e.m65998n("payment_intents/%s", paymentIntentId), c39857f, mapM65995b, 8);
        InterfaceC37689b c39932a = new C39932a(28);
        Function1 c2230e = new C2230e(this, 7);
        c2257r0.f8962y = 1;
        Object objM7100w = m7100w(c39859gM91542m, c39932a, c2230e, c2257r0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: R */
    public final Object m7072R(String str, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C2259s0 c2259s0;
        Object objM107888l;
        if (abstractC32269c instanceof C2259s0) {
            c2259s0 = (C2259s0) abstractC32269c;
            int i13 = c2259s0.f8968y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2259s0.f8968y = i13 - Integer.MIN_VALUE;
            } else {
                c2259s0 = new C2259s0(this, abstractC32269c);
            }
        } else {
            c2259s0 = new C2259s0(this, abstractC32269c);
        }
        Object obj = c2259s0.f8966w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2259s0.f8968y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        try {
            objM107888l = new C38810d6(str).f167032b;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(thM68037a);
        }
        String setupIntentId = (String) objM107888l;
        Map mapM65995b = c39857f.m127935h() ? C22786e.m65995b(list) : m7054l(str, list);
        m7102y();
        AbstractC22676k.m65750j(setupIntentId, "setupIntentId");
        C39859g c39859gM91542m = C29938w0.m91542m(this.f9021l, C22786e.m65998n("setup_intents/%s", setupIntentId), c39857f, mapM65995b, 8);
        InterfaceC37689b c39938g = new C39938g(1);
        Function1 c2230e = new C2230e(this, 6);
        c2259s0.f8968y = 1;
        Object objM7100w = m7100w(c39859gM91542m, c39938g, c2230e, c2259s0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: S */
    public final Object m7073S(String value, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C2261t0 c2261t0;
        if (abstractC32269c instanceof C2261t0) {
            c2261t0 = (C2261t0) abstractC32269c;
            int i13 = c2261t0.f8974y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2261t0.f8974y = i13 - Integer.MIN_VALUE;
            } else {
                c2261t0 = new C2261t0(this, abstractC32269c);
            }
        } else {
            c2261t0 = new C2261t0(this, abstractC32269c);
        }
        Object obj = c2261t0.f8972w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2261t0.f8974y;
        if (i14 != 0) {
            if (i14 == 1) {
                AbstractC34132o.m107864I(obj);
                return ((C23468n) obj).f92940w;
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        Pattern pattern = C38827f3.f167085c;
        AbstractC22676k.m65750j(value, "value");
        if (C38827f3.f167085c.matcher(value).matches()) {
            c2261t0.f8974y = 1;
            Object objM7071Q = m7071Q(value, c39857f, list, c2261t0);
            if (objM7071Q != obj2) {
                return objM7071Q;
            }
        } else {
            Pattern pattern2 = C38810d6.f167030c;
            if (!C38810d6.f167030c.matcher(value).matches()) {
                return AbstractC34132o.m107888l(new IllegalStateException("Invalid client secret."));
            }
            c2261t0.f8974y = 2;
            Object objM7072R = m7072R(value, c39857f, list, c2261t0);
            if (objM7072R != obj2) {
                return objM7072R;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: T */
    public final Object m7074T(String customerId, String str, AbstractC32269c abstractC32269c, C39857f c39857f) {
        C2263u0 c2263u0;
        if (abstractC32269c instanceof C2263u0) {
            c2263u0 = (C2263u0) abstractC32269c;
            int i13 = c2263u0.f8980y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2263u0.f8980y = i13 - Integer.MIN_VALUE;
            } else {
                c2263u0 = new C2263u0(this, abstractC32269c);
            }
        } else {
            c2263u0 = new C2263u0(this, abstractC32269c);
        }
        Object obj = c2263u0.f8978w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2263u0.f8980y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC22676k.m65750j(customerId, "customerId");
        String strM65997j = C22786e.m65997j("elements/customers/" + customerId + "/set_default_payment_method");
        if (str == null) {
            str = "";
        }
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, strM65997j, c39857f, AbstractC31061c.m95645u("payment_method", str), 8);
        InterfaceC37689b c39932a = new C39932a(9);
        c2263u0.f8980y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, new C2185f(12), c2263u0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: U */
    public final Object m7075U(String str, String str2, LinkedHashMap linkedHashMap, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2265v0 c2265v0;
        Map map;
        Object objM7100w;
        if (abstractC32269c instanceof C2265v0) {
            c2265v0 = (C2265v0) abstractC32269c;
            int i13 = c2265v0.f8986y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2265v0.f8986y = i13 - Integer.MIN_VALUE;
            } else {
                c2265v0 = new C2265v0(this, abstractC32269c);
            }
        } else {
            c2265v0 = new C2265v0(this, abstractC32269c);
        }
        Object obj = c2265v0.f8984w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2265v0.f8986y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String strM65997j = C22786e.m65997j("consumers/payment_details/share");
            Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("request_surface", this.f9013d.f8870w), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str)), new C23465k("id", str2), m7082d(C25235a0.f99113w));
            if (linkedHashMap == null) {
                map = linkedHashMap;
                map = C25272z.f99163w;
            }
            map = linkedHashMap;
            C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, strM65997j, c39857f, AbstractC25247g0.m73995d0(mapM73990Y, map), 8);
            InterfaceC37689b interfaceC37689b = C39932a.f172380y;
            c2265v0.f8986y = 1;
            objM7100w = m7100w(c39859gM91543n, interfaceC37689b, new C2185f(12), c2265v0);
            if (objM7100w == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM7100w = ((C23468n) obj).f92940w;
        }
        return !(objM7100w instanceof C23467m) ? ((C38844h0) objM7100w).f167216w : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    public final Object m7076V(C39016z6 c39016z6, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2267w0 c2267w0;
        if (abstractC32269c instanceof C2267w0) {
            c2267w0 = (C2267w0) abstractC32269c;
            int i13 = c2267w0.f8995y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2267w0.f8995y = i13 - Integer.MIN_VALUE;
            } else {
                c2267w0 = new C2267w0(this, abstractC32269c);
            }
        } else {
            c2267w0 = new C2267w0(this, abstractC32269c);
        }
        Object obj = c2267w0.f8993w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2267w0.f8995y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65997j("3ds2/authenticate"), c39857f, c39016z6.mo124325c0(), 8);
        InterfaceC37689b c39938g = new C39938g(4);
        Function1 c2230e = new C2230e(this, 5);
        c2267w0.f8995y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39938g, c2230e, c2267w0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: W */
    public final Object m7077W(String str, C38854i0 c38854i0, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2269x0 c2269x0;
        if (abstractC32269c instanceof C2269x0) {
            c2269x0 = (C2269x0) abstractC32269c;
            int i13 = c2269x0.f9001y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2269x0.f9001y = i13 - Integer.MIN_VALUE;
            } else {
                c2269x0 = new C2269x0(this, abstractC32269c);
            }
        } else {
            c2269x0 = new C2269x0(this, abstractC32269c);
        }
        Object obj = c2269x0.f8999w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2269x0.f9001y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        String paymentDetailsId = c38854i0.f167264w;
        AbstractC22676k.m65750j(paymentDetailsId, "paymentDetailsId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65997j("consumers/payment_details/".concat(paymentDetailsId)), c39857f, AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("request_surface", this.f9013d.f8870w), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str))), c38854i0.mo124325c0()), 8);
        InterfaceC37689b interfaceC37689b = C39932a.f172379x;
        c2269x0.f9001y = 1;
        Object objM7100w = m7100w(c39859gM91543n, interfaceC37689b, new C2185f(12), c2269x0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X */
    public final Object m7078X(String paymentMethodId, AbstractC39006y5 abstractC39006y5, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2271y0 c2271y0;
        if (abstractC32269c instanceof C2271y0) {
            c2271y0 = (C2271y0) abstractC32269c;
            int i13 = c2271y0.f9007y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2271y0.f9007y = i13 - Integer.MIN_VALUE;
            } else {
                c2271y0 = new C2271y0(this, abstractC32269c);
            }
        } else {
            c2271y0 = new C2271y0(this, abstractC32269c);
        }
        Object obj = c2271y0.f9005w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2271y0.f9007y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        m7102y();
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65997j("payment_methods/".concat(paymentMethodId)), c39857f, abstractC39006y5.mo124325c0(), 8);
        InterfaceC37689b c39932a = new C39932a(29);
        Function1 c0167g = new C0167g(22, this, abstractC39006y5);
        c2271y0.f9007y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c0167g, c2271y0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7079a(String str, String paymentIntentId, String financialConnectionsSessionId, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C2240j c2240j;
        if (abstractC32269c instanceof C2240j) {
            c2240j = (C2240j) abstractC32269c;
            int i13 = c2240j.f8903y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2240j.f8903y = i13 - Integer.MIN_VALUE;
            } else {
                c2240j = new C2240j(this, abstractC32269c);
            }
        } else {
            c2240j = new C2240j(this, abstractC32269c);
        }
        Object obj = c2240j.f8901w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2240j.f8903y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC22676k.m65750j(paymentIntentId, "paymentIntentId");
        AbstractC22676k.m65750j(financialConnectionsSessionId, "financialConnectionsSessionId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("payment_intents/%s/link_account_sessions/%s/attach", paymentIntentId, financialConnectionsSessionId), c39857f, AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("client_secret", str), C22786e.m65995b(list)), 8);
        InterfaceC37689b c39932a = new C39932a(28);
        Function1 c2185f = new C2185f(12);
        c2240j.f8903y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c2185f, c2240j);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7080b(String str, String setupIntentId, String financialConnectionsSessionId, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C2242k c2242k;
        if (abstractC32269c instanceof C2242k) {
            c2242k = (C2242k) abstractC32269c;
            int i13 = c2242k.f8910y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2242k.f8910y = i13 - Integer.MIN_VALUE;
            } else {
                c2242k = new C2242k(this, abstractC32269c);
            }
        } else {
            c2242k = new C2242k(this, abstractC32269c);
        }
        Object obj = c2242k.f8908w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2242k.f8910y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC22676k.m65750j(setupIntentId, "setupIntentId");
        AbstractC22676k.m65750j(financialConnectionsSessionId, "financialConnectionsSessionId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("setup_intents/%s/link_account_sessions/%s/attach", setupIntentId, financialConnectionsSessionId), c39857f, AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("client_secret", str), C22786e.m65995b(list)), 8);
        InterfaceC37689b c39938g = new C39938g(1);
        Function1 c2185f = new C2185f(12);
        c2242k.f8910y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39938g, c2185f, c2242k);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX INFO: renamed from: c */
    public final String m7081c(Set attribution) {
        AbstractC22676k.m65750j(attribution, "attribution");
        return AbstractC25265s.m74110N0(AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34570S("stripe-android/22.6.1"), this.f9015f), attribution), ";", null, null, null, 62);
    }

    /* JADX INFO: renamed from: d */
    public final C23465k m7082d(Set set) {
        return new C23465k("payment_user_agent", m7081c(set));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m7083e(String paymentIntentId, String str, AbstractC32269c abstractC32269c, C39857f c39857f) {
        C2244l c2244l;
        if (abstractC32269c instanceof C2244l) {
            c2244l = (C2244l) abstractC32269c;
            int i13 = c2244l.f8917y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2244l.f8917y = i13 - Integer.MIN_VALUE;
            } else {
                c2244l = new C2244l(this, abstractC32269c);
            }
        } else {
            c2244l = new C2244l(this, abstractC32269c);
        }
        Object obj = c2244l.f8915w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2244l.f8917y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        m7102y();
        AbstractC22676k.m65750j(paymentIntentId, "paymentIntentId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("payment_intents/%s/source_cancel", paymentIntentId), c39857f, AbstractC31061c.m95645u("source", str), 8);
        InterfaceC37689b c39932a = new C39932a(28);
        Function1 c2230e = new C2230e(this, 4);
        c2244l.f8917y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c2230e, c2244l);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m7084f(String setupIntentId, String str, AbstractC32269c abstractC32269c, C39857f c39857f) {
        C2246m c2246m;
        if (abstractC32269c instanceof C2246m) {
            c2246m = (C2246m) abstractC32269c;
            int i13 = c2246m.f8923y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2246m.f8923y = i13 - Integer.MIN_VALUE;
            } else {
                c2246m = new C2246m(this, abstractC32269c);
            }
        } else {
            c2246m = new C2246m(this, abstractC32269c);
        }
        Object obj = c2246m.f8921w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2246m.f8923y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC22676k.m65750j(setupIntentId, "setupIntentId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("setup_intents/%s/source_cancel", setupIntentId), c39857f, AbstractC31061c.m95645u("source", str), 8);
        InterfaceC37689b c39938g = new C39938g(1);
        Function1 c2230e = new C2230e(this, 0);
        c2246m.f8923y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39938g, c2230e, c2246m);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m7085g(String str, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2248n c2248n;
        if (abstractC32269c instanceof C2248n) {
            c2248n = (C2248n) abstractC32269c;
            int i13 = c2248n.f8929y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2248n.f8929y = i13 - Integer.MIN_VALUE;
            } else {
                c2248n = new C2248n(this, abstractC32269c);
            }
        } else {
            c2248n = new C2248n(this, abstractC32269c);
        }
        Object obj = c2248n.f8927w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2248n.f8929y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65997j("3ds2/challenge_complete"), c39857f, AbstractC31061c.m95645u("source", str), 8);
        InterfaceC37689b c39938g = new C39938g(4);
        c2248n.f8929y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39938g, new C2185f(12), c2248n);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m7086h(C38928q c38928q, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C2250o c2250o;
        Object objM7063I;
        C2273z0 c2273z0;
        if (abstractC32269c instanceof C2250o) {
            c2250o = (C2250o) abstractC32269c;
            int i13 = c2250o.f8934F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2250o.f8934F = i13 - Integer.MIN_VALUE;
            } else {
                c2250o = new C2250o(this, abstractC32269c);
            }
        } else {
            c2250o = new C2250o(this, abstractC32269c);
        }
        Object obj = c2250o.f8938z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c2250o.f8934F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c2250o.f8935w = this;
            c2250o.f8936x = c39857f;
            c2250o.f8937y = list;
            c2250o.f8934F = 1;
            objM7063I = m7063I(c38928q, c39857f, c2250o);
            if (objM7063I != enumC31071a) {
                c2273z0 = this;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        list = c2250o.f8937y;
        c39857f = c2250o.f8936x;
        c2273z0 = c2250o.f8935w;
        AbstractC34132o.m107864I(obj);
        objM7063I = ((C23468n) obj).f92940w;
        Throwable thM68037a = C23468n.m68037a(objM7063I);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(thM68037a);
        }
        c2250o.f8935w = null;
        c2250o.f8936x = null;
        c2250o.f8937y = null;
        c2250o.f8934F = 2;
        Object objM7087i = c2273z0.m7087i((C38928q) objM7063I, c39857f, list, c2250o);
        return objM7087i == enumC31071a ? enumC31071a : objM7087i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m7087i(C38928q c38928q, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C2252p c2252p;
        Object objM107888l;
        if (abstractC32269c instanceof C2252p) {
            c2252p = (C2252p) abstractC32269c;
            int i13 = c2252p.f8944y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2252p.f8944y = i13 - Integer.MIN_VALUE;
            } else {
                c2252p = new C2252p(this, abstractC32269c);
            }
        } else {
            c2252p = new C2252p(this, abstractC32269c);
        }
        Object obj = c2252p.f8942w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2252p.f8944y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        Map mapMo124325c0 = c38928q.mo124325c0();
        if (c39857f.m127935h()) {
            mapMo124325c0 = AbstractC25247g0.m73991Z("client_secret", mapMo124325c0);
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(m7062H(mapMo124325c0, c38928q.f167576w, c38928q.f167578y), C22786e.m65995b(list));
        C34248b c34248bM108289a = this.f9018i.m108289a();
        this.f9020k.getClass();
        Map mapM106265f = C33647p.m106265f(linkedHashMapM73995d0, c34248bM108289a);
        try {
            objM107888l = new C38827f3(c38928q.f167561E).f167087b;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(thM68037a);
        }
        String paymentIntentId = (String) objM107888l;
        m7102y();
        AbstractC22676k.m65750j(paymentIntentId, "paymentIntentId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("payment_intents/%s/confirm", paymentIntentId), c39857f, mapM106265f, 8);
        InterfaceC37689b c39932a = new C39932a(28);
        Function1 c0167g = new C0167g(25, c38928q, this);
        c2252p.f8944y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c0167g, c2252p);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m7088j(C38937r c38937r, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C2254q c2254q;
        Object objM7064J;
        C2273z0 c2273z0;
        if (abstractC32269c instanceof C2254q) {
            c2254q = (C2254q) abstractC32269c;
            int i13 = c2254q.f8949F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2254q.f8949F = i13 - Integer.MIN_VALUE;
            } else {
                c2254q = new C2254q(this, abstractC32269c);
            }
        } else {
            c2254q = new C2254q(this, abstractC32269c);
        }
        Object obj = c2254q.f8953z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c2254q.f8949F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c2254q.f8950w = this;
            c2254q.f8951x = c39857f;
            c2254q.f8952y = list;
            c2254q.f8949F = 1;
            objM7064J = m7064J(c38937r, c39857f, c2254q);
            if (objM7064J != enumC31071a) {
                c2273z0 = this;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        list = c2254q.f8952y;
        c39857f = c2254q.f8951x;
        c2273z0 = c2254q.f8950w;
        AbstractC34132o.m107864I(obj);
        objM7064J = ((C23468n) obj).f92940w;
        Throwable thM68037a = C23468n.m68037a(objM7064J);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(thM68037a);
        }
        c2254q.f8950w = null;
        c2254q.f8951x = null;
        c2254q.f8952y = null;
        c2254q.f8949F = 2;
        Object objM7089k = c2273z0.m7089k((C38937r) objM7064J, c39857f, list, c2254q);
        return objM7089k == enumC31071a ? enumC31071a : objM7089k;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m7089k(C38937r c38937r, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C2256r c2256r;
        Object objM107888l;
        if (abstractC32269c instanceof C2256r) {
            c2256r = (C2256r) abstractC32269c;
            int i13 = c2256r.f8959y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2256r.f8959y = i13 - Integer.MIN_VALUE;
            } else {
                c2256r = new C2256r(this, abstractC32269c);
            }
        } else {
            c2256r = new C2256r(this, abstractC32269c);
        }
        Object obj = c2256r.f8957w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2256r.f8959y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        try {
            objM107888l = new C38810d6(c38937r.f167618w).f167032b;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(thM68037a);
        }
        String setupIntentId = (String) objM107888l;
        m7102y();
        AbstractC22676k.m65750j(setupIntentId, "setupIntentId");
        String strM65998n = C22786e.m65998n("setup_intents/%s/confirm", setupIntentId);
        Map mapMo124325c0 = c38937r.mo124325c0();
        if (c39857f.m127935h()) {
            mapMo124325c0 = AbstractC25247g0.m73991Z("client_secret", mapMo124325c0);
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(m7062H(mapMo124325c0, c38937r.f167620y, null), C22786e.m65995b(list));
        C34248b c34248bM108289a = this.f9018i.m108289a();
        this.f9020k.getClass();
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, strM65998n, c39857f, C33647p.m106265f(linkedHashMapM73995d0, c34248bM108289a), 8);
        InterfaceC37689b c39938g = new C39938g(1);
        Function1 c0167g = new C0167g(23, this, c38937r);
        c2256r.f8959y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39938g, c0167g, c2256r);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m7090m(C38982w c38982w, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2258s c2258s;
        if (abstractC32269c instanceof C2258s) {
            c2258s = (C2258s) abstractC32269c;
            int i13 = c2258s.f8965y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2258s.f8965y = i13 - Integer.MIN_VALUE;
            } else {
                c2258s = new C2258s(this, abstractC32269c);
            }
        } else {
            c2258s = new C2258s(this, abstractC32269c);
        }
        Object obj = c2258s.f8963w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2258s.f8965y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65997j("confirmation_tokens"), c39857f, m7062H(c38982w.mo124325c0(), c38982w.f167796x, null), 8);
        InterfaceC37689b c39932a = new C39932a(8);
        Function1 c0167g = new C0167g(21, this, c38982w);
        c2258s.f8965y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c0167g, c2258s);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: n */
    public final Object m7091n(C38893m0 c38893m0, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2260t c2260t;
        if (abstractC32269c instanceof C2260t) {
            c2260t = (C2260t) abstractC32269c;
            int i13 = c2260t.f8971y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2260t.f8971y = i13 - Integer.MIN_VALUE;
            } else {
                c2260t = new C2260t(this, abstractC32269c);
            }
        } else {
            c2260t = new C2260t(this, abstractC32269c);
        }
        Object obj = c2260t.f8969w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2260t.f8971y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        String strM65997j = C22786e.m65997j("connections/link_account_sessions_for_deferred_payment");
        C23465k c23465k = new C23465k("unique_id", c38893m0.f167428a);
        C23465k c23465k2 = new C23465k("initial_institution", null);
        C23465k c23465k3 = new C23465k("manual_entry_only", null);
        C23465k c23465k4 = new C23465k("search_session", null);
        EnumC38862i8 enumC38862i8 = EnumC38862i8.Automatic;
        C23465k c23465k5 = new C23465k("verification_method", "automatic");
        C23465k c23465k6 = new C23465k("customer", c38893m0.f167430c);
        C23465k c23465k7 = new C23465k("on_behalf_of", c38893m0.f167431d);
        C23465k c23465k8 = new C23465k("hosted_surface", c38893m0.f167429b);
        EnumC38922p2 enumC38922p2 = c38893m0.f167432e;
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, strM65997j, c39857f, AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, c23465k7, c23465k8, new C23465k("link_mode", enumC38922p2 != null ? enumC38922p2.f167549w : "LINK_DISABLED"), new C23465k("amount", c38893m0.f167434g), new C23465k("currency", c38893m0.f167435h), new C23465k("product", c38893m0.f167433f)), 8);
        InterfaceC37689b c39932a = new C39932a(11);
        Function1 c2185f = new C2185f(12);
        c2260t.f8971y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c2185f, c2260t);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m7092o(String paymentIntentId, InterfaceC38920p0 interfaceC38920p0, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2262u c2262u;
        if (abstractC32269c instanceof C2262u) {
            c2262u = (C2262u) abstractC32269c;
            int i13 = c2262u.f8977y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2262u.f8977y = i13 - Integer.MIN_VALUE;
            } else {
                c2262u = new C2262u(this, abstractC32269c);
            }
        } else {
            c2262u = new C2262u(this, abstractC32269c);
        }
        Object obj = c2262u.f8975w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2262u.f8977y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC22676k.m65750j(paymentIntentId, "paymentIntentId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("payment_intents/%s/link_account_sessions", paymentIntentId), c39857f, interfaceC38920p0.toMap(), 8);
        InterfaceC37689b c39932a = new C39932a(11);
        Function1 c2185f = new C2185f(12);
        c2262u.f8977y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c2185f, c2262u);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m7093p(C38809d5 c38809d5, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2264v c2264v;
        if (abstractC32269c instanceof C2264v) {
            c2264v = (C2264v) abstractC32269c;
            int i13 = c2264v.f8983y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2264v.f8983y = i13 - Integer.MIN_VALUE;
            } else {
                c2264v = new C2264v(this, abstractC32269c);
            }
        } else {
            c2264v = new C2264v(this, abstractC32269c);
        }
        Object obj = c2264v.f8981w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2264v.f8983y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        m7102y();
        String strM65997j = C22786e.m65997j("payment_methods");
        Map mapM73996e0 = AbstractC25247g0.m73996e0(c38809d5.mo124325c0(), m7082d(c38809d5.m124342h()));
        C34248b c34248bM108289a = this.f9018i.m108289a();
        Map mapM108291b = c34248bM108289a != null ? c34248bM108289a.m108291b() : null;
        if (mapM108291b == null) {
            mapM108291b = C25272z.f99163w;
        }
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, strM65997j, c39857f, AbstractC25247g0.m73995d0(mapM73996e0, mapM108291b), 8);
        InterfaceC37689b c39932a = new C39932a(29);
        Function1 c0167g = new C0167g(24, this, c38809d5);
        c2264v.f8983y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c0167g, c2264v);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #1 {all -> 0x0045, blocks: (B:19:0x0041, B:31:0x006b, B:32:0x006e, B:33:0x0075), top: B:56:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:19:0x0041, B:31:0x006b, B:32:0x006e, B:33:0x0075), top: B:56:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        if (r8 == r1) goto L44;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7094q(java.lang.String r8, p664yy.C39857f r9, s83.AbstractC32269c r10) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b10.C2273z0.m7094q(java.lang.String, yy.f, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m7095r(String setupIntentId, InterfaceC38920p0 interfaceC38920p0, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2268x c2268x;
        if (abstractC32269c instanceof C2268x) {
            c2268x = (C2268x) abstractC32269c;
            int i13 = c2268x.f8998y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2268x.f8998y = i13 - Integer.MIN_VALUE;
            } else {
                c2268x = new C2268x(this, abstractC32269c);
            }
        } else {
            c2268x = new C2268x(this, abstractC32269c);
        }
        Object obj = c2268x.f8996w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2268x.f8998y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC22676k.m65750j(setupIntentId, "setupIntentId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("setup_intents/%s/link_account_sessions", setupIntentId), c39857f, interfaceC38920p0.toMap(), 8);
        InterfaceC37689b c39932a = new C39932a(11);
        Function1 c2185f = new C2185f(12);
        c2268x.f8998y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c2185f, c2268x);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m7096s(C38892m c38892m, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2270y c2270y;
        if (abstractC32269c instanceof C2270y) {
            c2270y = (C2270y) abstractC32269c;
            int i13 = c2270y.f9004y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2270y.f9004y = i13 - Integer.MIN_VALUE;
            } else {
                c2270y = new C2270y(this, abstractC32269c);
            }
        } else {
            c2270y = new C2270y(this, abstractC32269c);
        }
        Object obj = c2270y.f9002w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2270y.f9004y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        m7102y();
        String strM65997j = C22786e.m65997j("tokens");
        Map mapM73996e0 = AbstractC25247g0.m73996e0(c38892m.mo124325c0(), m7082d(c38892m.f167424w));
        C34248b c34248bM108289a = this.f9018i.m108289a();
        Map mapM108291b = c34248bM108289a != null ? c34248bM108289a.m108291b() : null;
        if (mapM108291b == null) {
            mapM108291b = C25272z.f99163w;
        }
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, strM65997j, c39857f, AbstractC25247g0.m73995d0(mapM73996e0, mapM108291b), 8);
        InterfaceC37689b c39938g = new C39938g(5);
        Function1 c0167g = new C0167g(26, this, c38892m);
        c2270y.f9004y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39938g, c0167g, c2270y);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: t */
    public final Object m7097t(String str, String paymentDetailsId, AbstractC32269c abstractC32269c, C39857f options) {
        C2272z c2272z;
        if (abstractC32269c instanceof C2272z) {
            c2272z = (C2272z) abstractC32269c;
            int i13 = c2272z.f9010y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2272z.f9010y = i13 - Integer.MIN_VALUE;
            } else {
                c2272z = new C2272z(this, abstractC32269c);
            }
        } else {
            c2272z = new C2272z(this, abstractC32269c);
        }
        Object obj = c2272z.f9008w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2272z.f9010y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C29938w0 c29938w0 = this.f9021l;
                AbstractC22676k.m65750j(paymentDetailsId, "paymentDetailsId");
                String url = C22786e.m65997j("consumers/payment_details/".concat(paymentDetailsId));
                Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("request_surface", this.f9013d.f8870w), new C23465k("credentials", AbstractC25247g0.m73989X(new C23465k("consumer_session_client_secret", str))));
                c29938w0.getClass();
                AbstractC22676k.m65750j(url, "url");
                AbstractC22676k.m65750j(options, "options");
                C39859g c39859g = new C39859g(EnumC39868k0.DELETE, url, mapM73990Y, options, (C30764c) c29938w0.f122261y, (String) c29938w0.f122260x, (String) c29938w0.f122262z);
                Function1 c2185f = new C2185f(12);
                c2272z.f9010y = 1;
                if (m7061G(c39859g, c2185f, c2272z) == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            return AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m7098u(String paymentMethodId, Set set, AbstractC32269c abstractC32269c, C39857f c39857f) {
        C2220a0 c2220a0;
        if (abstractC32269c instanceof C2220a0) {
            c2220a0 = (C2220a0) abstractC32269c;
            int i13 = c2220a0.f8845y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2220a0.f8845y = i13 - Integer.MIN_VALUE;
            } else {
                c2220a0 = new C2220a0(this, abstractC32269c);
            }
        } else {
            c2220a0 = new C2220a0(this, abstractC32269c);
        }
        Object obj = c2220a0.f8843w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2220a0.f8845y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("payment_methods/%s/detach", paymentMethodId), c39857f, null, 12);
        InterfaceC37689b c39932a = new C39932a(29);
        Function1 c2232f = new C2232f(this, set, 0);
        c2220a0.f8845y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c2232f, c2220a0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m7099v(String str, Set set, String paymentMethodId, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2223b0 c2223b0;
        if (abstractC32269c instanceof C2223b0) {
            c2223b0 = (C2223b0) abstractC32269c;
            int i13 = c2223b0.f8858y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2223b0.f8858y = i13 - Integer.MIN_VALUE;
            } else {
                c2223b0 = new C2223b0(this, abstractC32269c);
            }
        } else {
            c2223b0 = new C2223b0(this, abstractC32269c);
        }
        Object obj = c2223b0.f8856w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c2223b0.f8858y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        C39859g c39859gM91543n = C29938w0.m91543n(this.f9021l, C22786e.m65998n("elements/payment_methods/%s/detach", paymentMethodId), c39857f, AbstractC31061c.m95645u("customer_session_client_secret", str), 8);
        InterfaceC37689b c39932a = new C39932a(29);
        Function1 c2232f = new C2232f(this, set, 1);
        c2223b0.f8858y = 1;
        Object objM7100w = m7100w(c39859gM91543n, c39932a, c2232f, c2223b0);
        return objM7100w == obj2 ? obj2 : objM7100w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: w */
    public final Object m7100w(C39859g c39859g, InterfaceC37689b interfaceC37689b, Function1 function1, AbstractC32269c abstractC32269c) {
        C2226c0 c2226c0;
        if (abstractC32269c instanceof C2226c0) {
            c2226c0 = (C2226c0) abstractC32269c;
            int i13 = c2226c0.f8866z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2226c0.f8866z = i13 - Integer.MIN_VALUE;
            } else {
                c2226c0 = new C2226c0(this, abstractC32269c);
            }
        } else {
            c2226c0 = new C2226c0(this, abstractC32269c);
        }
        Object objM7061G = c2226c0.f8864x;
        Object obj = EnumC31071a.f128113w;
        int i14 = c2226c0.f8866z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM7061G);
                c2226c0.f8863w = interfaceC37689b;
                c2226c0.f8866z = 1;
                objM7061G = m7061G(c39859g, function1, c2226c0);
                if (objM7061G == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC37689b = c2226c0.f8863w;
                AbstractC34132o.m107864I(objM7061G);
            }
            InterfaceC36562b interfaceC36562bMo8011m = interfaceC37689b.mo8011m(AbstractC39877q.m127952i((C39874n0) objM7061G));
            if (interfaceC36562bMo8011m != null) {
                return interfaceC36562bMo8011m;
            }
            throw new APIException(0, 23, null, "Unable to parse response with ".concat(interfaceC37689b.getClass().getSimpleName()), null, null);
        } catch (Throwable th3) {
            return AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m7101x(PaymentAnalyticsEvent paymentAnalyticsEvent) {
        this.f9017h.m127938a(C2222b.m7051c(this.f9019j, paymentAnalyticsEvent, null, null, null, null, 62));
    }

    /* JADX INFO: renamed from: y */
    public final void m7102y() {
        this.f9018i.m108290b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: z */
    public final Object m7103z(C41179a bin, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C2229d0 c2229d0;
        Object objM7100w;
        C2273z0 c2273z0;
        if (abstractC32269c instanceof C2229d0) {
            c2229d0 = (C2229d0) abstractC32269c;
            int i13 = c2229d0.f8874z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2229d0.f8874z = i13 - Integer.MIN_VALUE;
            } else {
                c2229d0 = new C2229d0(this, abstractC32269c);
            }
        } else {
            c2229d0 = new C2229d0(this, abstractC32269c);
        }
        Object obj = c2229d0.f8872x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c2229d0.f8874z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C39859g c39859gM91542m = C29938w0.m91542m(this.f9021l, "https://api.stripe.com/edge-internal/card-metadata", C39857f.m127933b(c39857f, null, 5), AbstractC25247g0.m73990Y(new C23465k("key", c39857f.f172128w), new C23465k("bin_prefix", bin.f177688w)), 8);
            AbstractC22676k.m65750j(bin, "bin");
            C32800q c32800q = new C32800q();
            c32800q.f136504w = bin;
            c32800q.f136505x = new C39932a(7);
            c2229d0.f8871w = this;
            c2229d0.f8874z = 1;
            objM7100w = m7100w(c39859gM91542m, c32800q, new C2185f(12), c2229d0);
            if (objM7100w == enumC31071a) {
                return enumC31071a;
            }
            c2273z0 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2273z0 = c2229d0.f8871w;
            AbstractC34132o.m107864I(obj);
            objM7100w = ((C23468n) obj).f92940w;
        }
        if (C23468n.m68037a(objM7100w) != null) {
            c2273z0.m7101x(PaymentAnalyticsEvent.CardMetadataLoadFailure);
        }
        return objM7100w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2273z0(Context appContext, InterfaceC4339a publishableKeyProvider, EnumC2228d requestSurface, InterfaceC30063j workContext, Set productUsageTokens, C2222b paymentAnalyticsRequestFactory, C39865j analyticsRequestExecutor, C30765d logger) {
        this(appContext, publishableKeyProvider, requestSurface, logger, workContext, productUsageTokens, analyticsRequestExecutor, paymentAnalyticsRequestFactory, null, 63112);
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(requestSurface, "requestSurface");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(productUsageTokens, "productUsageTokens");
        AbstractC22676k.m65750j(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(logger, "logger");
    }
}
