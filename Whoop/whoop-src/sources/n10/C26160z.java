package n10;

import am2.C1008b;
import b10.C2273z0;
import b10.InterfaceC2227c1;
import com.stripe.android.model.StripeIntent$Usage;
import com.stripe.android.paymentelement.confirmation.intent.CreateIntentCallbackFailureException;
import com.stripe.android.paymentelement.confirmation.intent.InvalidDeferredIntentUsageException;
import com.whoop.android.R;
import e10.C12533a;
import e10.C12535b;
import e10.C12537c;
import e10.C12571t;
import e10.C12572t0;
import e10.C12574u0;
import e10.InterfaceC12539d;
import e10.InterfaceC12576v0;
import h20.AbstractC16726r2;
import h20.C16633c;
import h20.C16639d;
import h20.C16714p2;
import h20.C16744u2;
import h20.EnumC16738t2;
import h20.InterfaceC16627b;
import h20.InterfaceC16645e;
import java.util.Locale;
import java.util.Map;
import l83.C23467m;
import l83.C23468n;
import m83.C25271y;
import m83.C25272z;
import org.json.JSONObject;
import p031b9.C2852m1;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p474s.AbstractC32004s;
import p477s2.AbstractC32073e;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32410a;
import x30.AbstractC37926s0;
import y00.AbstractC38833g;
import y00.AbstractC38970u5;
import y00.C38809d5;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38901n;
import y00.C38915o4;
import y00.C38919p;
import y00.C38983w0;
import y00.C39001y0;
import y00.EnumC38828f4;
import y00.EnumC38837g3;
import y00.EnumC38910o;
import y00.InterfaceC38802c8;
import y00.InterfaceC39010z0;

/* JADX INFO: renamed from: n10.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C26160z implements InterfaceC26133i0 {

    /* JADX INFO: renamed from: a */
    public final C16744u2 f103658a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC16627b f103659b;

    /* JADX INFO: renamed from: c */
    public final C38901n f103660c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2227c1 f103661d;

    /* JADX INFO: renamed from: e */
    public final C39857f f103662e;

    /* JADX INFO: renamed from: f */
    public final boolean f103663f;

    /* JADX INFO: renamed from: g */
    public final C2852m1 f103664g;

    public C26160z(C16744u2 intentConfiguration, InterfaceC16627b createIntentCallback, C38901n clientAttributionMetadata, InterfaceC2227c1 stripeRepository, C39857f requestOptions, boolean z4) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        AbstractC22676k.m65750j(createIntentCallback, "createIntentCallback");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(requestOptions, "requestOptions");
        this.f103658a = intentConfiguration;
        this.f103659b = createIntentCallback;
        this.f103660c = clientAttributionMetadata;
        this.f103661d = stripeRepository;
        this.f103662e = requestOptions;
        this.f103663f = z4;
        this.f103664g = new C2852m1(requestOptions.m127934f(), 3);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC12539d m77691f(InterfaceC38802c8 interfaceC38802c8, C38915o4 c38915o4) {
        Object objM107888l;
        try {
            AbstractC32073e.m99751j0(interfaceC38802c8, c38915o4);
            objM107888l = new C12537c(new C26125e0(interfaceC38802c8), false, EnumC26121c0.Server);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (C23468n.m68037a(objM107888l) != null) {
            objM107888l = new C12535b(new InvalidDeferredIntentUsageException(), AbstractC32128i.m100064s(R.string.stripe_paymentsheet_invalid_deferred_intent_usage, new Object[0], C25271y.f99162w), C12571t.f42932a);
        }
        return (InterfaceC12539d) objM107888l;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m77692h(AbstractC38970u5 abstractC38970u5, C16744u2 c16744u2) {
        EnumC16738t2 enumC16738t2;
        EnumC38910o enumC38910oM124348d;
        if (abstractC38970u5 == null || (enumC38910oM124348d = AbstractC38833g.m124348d(abstractC38970u5)) == null || !AbstractC11894a.m31936D(enumC38910oM124348d)) {
            AbstractC16726r2 abstractC16726r2 = c16744u2.f64308w;
            C16714p2 c16714p2 = abstractC16726r2 instanceof C16714p2 ? (C16714p2) abstractC16726r2 : null;
            if (c16714p2 == null || (enumC16738t2 = c16714p2.f64249y) == null || !AbstractC11894a.m31936D(AbstractC37926s0.m121457I(enumC16738t2))) {
                return false;
            }
        }
        return true;
    }

    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: a */
    public final Object mo77680a(InterfaceC38802c8 interfaceC38802c8, C12574u0 c12574u0, C38919p c38919p, InterfaceC30057d interfaceC30057d) {
        C16744u2 c16744u2 = this.f103658a;
        C12574u0 c12574u0Mo35254Z = c12574u0.mo35254Z(c16744u2);
        return m77693c(interfaceC38802c8, c16744u2, c12574u0Mo35254Z, c12574u0.f42940w, m77692h(c12574u0Mo35254Z.f42941x, c16744u2), c38919p, c12574u0.f42943z, c12574u0.f42939E, (AbstractC32269c) interfaceC30057d);
    }

    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: b */
    public final Object mo77681b(InterfaceC38802c8 interfaceC38802c8, C12572t0 c12572t0, C38919p c38919p, InterfaceC30057d interfaceC30057d) {
        C16744u2 intentConfiguration = this.f103658a;
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        C38809d5 c38809d5M121460L = AbstractC37926s0.m121460L(c12572t0.f42935w, intentConfiguration);
        return m77696g(intentConfiguration, interfaceC38802c8, C12572t0.m35252b(c12572t0, c38809d5M121460L, AbstractC37926s0.m121459K(c12572t0.f42936x, c38809d5M121460L.f167026w, intentConfiguration), 60), c38919p, c12572t0.f42938z, (AbstractC32269c) interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c */
    public final Object m77693c(InterfaceC38802c8 interfaceC38802c8, C16744u2 c16744u2, InterfaceC12576v0 interfaceC12576v0, C38915o4 c38915o4, boolean z4, C38919p c38919p, String str, String str2, AbstractC32269c abstractC32269c) {
        C26157w c26157w;
        InterfaceC12576v0 interfaceC12576v1;
        String str3;
        C38915o4 c38915o5;
        C38919p c38919p2;
        InterfaceC38802c8 interfaceC38802c9;
        String str4;
        C16744u2 c16744u3;
        Object obj;
        C26160z c26160z;
        if (abstractC32269c instanceof C26157w) {
            c26157w = (C26157w) abstractC32269c;
            int i13 = c26157w.f103633K;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26157w.f103633K = i13 - Integer.MIN_VALUE;
            } else {
                c26157w = new C26157w(this, abstractC32269c);
            }
        } else {
            c26157w = new C26157w(this, abstractC32269c);
        }
        Object obj2 = c26157w.f103631I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26157w.f103633K;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            c26157w.f103634w = this;
            c26157w.f103635x = interfaceC38802c8;
            c26157w.f103636y = c16744u2;
            interfaceC12576v1 = interfaceC12576v0;
            c26157w.f103637z = interfaceC12576v1;
            c26157w.f103627E = c38915o4;
            c26157w.f103628F = c38919p;
            str3 = str;
            c26157w.f103629G = str3;
            c26157w.f103630H = str2;
            c26157w.f103633K = 1;
            Object objMo43523a = this.f103659b.mo43523a(c38915o4, z4, c26157w);
            if (objMo43523a != enumC31071a) {
                c38915o5 = c38915o4;
                c38919p2 = c38919p;
                interfaceC38802c9 = interfaceC38802c8;
                str4 = str2;
                c16744u3 = c16744u2;
                obj = objMo43523a;
                c26160z = this;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj2);
            return obj2;
        }
        String str5 = c26157w.f103630H;
        String str6 = c26157w.f103629G;
        C38919p c38919p3 = c26157w.f103628F;
        c38915o5 = c26157w.f103627E;
        InterfaceC12576v0 interfaceC12576v2 = c26157w.f103637z;
        c16744u3 = c26157w.f103636y;
        interfaceC38802c9 = c26157w.f103635x;
        c26160z = c26157w.f103634w;
        AbstractC34132o.m107864I(obj2);
        str4 = str5;
        c38919p2 = c38919p3;
        interfaceC12576v1 = interfaceC12576v2;
        str3 = str6;
        obj = obj2;
        InterfaceC16645e interfaceC16645e = (InterfaceC16645e) obj;
        if (!(interfaceC16645e instanceof C16639d)) {
            if (!(interfaceC16645e instanceof C16633c)) {
                throw new NoWhenBranchMatchedException();
            }
            C16633c c16633c = (C16633c) interfaceC16645e;
            CreateIntentCallbackFailureException createIntentCallbackFailureException = new CreateIntentCallbackFailureException(c16633c.f63977a);
            String str7 = c16633c.f63978b;
            return new C12535b(createIntentCallbackFailureException, str7 != null ? AbstractC32128i.m100055i(str7) : AbstractC37926s0.m121456H(createIntentCallbackFailureException), C12571t.f42932a);
        }
        C16639d c16639d = (C16639d) interfaceC16645e;
        if (AbstractC22676k.m65745e(c16639d.f63990a, "COMPLETE_WITHOUT_CONFIRMING_INTENT")) {
            return new C12533a(interfaceC38802c9, EnumC26121c0.None, true);
        }
        String str8 = c16639d.f63990a;
        c26157w.f103634w = null;
        c26157w.f103635x = null;
        c26157w.f103636y = null;
        c26157w.f103637z = null;
        c26157w.f103627E = null;
        c26157w.f103628F = null;
        c26157w.f103629G = null;
        c26157w.f103630H = null;
        c26157w.f103633K = 2;
        C26160z c26160z2 = c26160z;
        Object objM77694d = c26160z2.m77694d(str8, c16744u3, interfaceC12576v1, c38915o5, c38919p2, str3, str4, c26157w);
        return objM77694d == enumC31071a ? enumC31071a : objM77694d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public final Object m77694d(String str, C16744u2 c16744u2, InterfaceC12576v0 interfaceC12576v0, C38915o4 c38915o4, C38919p c38919p, String str2, String str3, AbstractC32269c abstractC32269c) {
        C26158x c26158x;
        InterfaceC12576v0 interfaceC12576v1;
        C38915o4 c38915o5;
        C38919p c38919p2;
        String str4;
        String str5;
        String str6;
        C26160z c26160z;
        C16744u2 c16744u3;
        Object obj;
        Object objM107888l;
        if (abstractC32269c instanceof C26158x) {
            c26158x = (C26158x) abstractC32269c;
            int i13 = c26158x.f103644K;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26158x.f103644K = i13 - Integer.MIN_VALUE;
            } else {
                c26158x = new C26158x(this, abstractC32269c);
            }
        } else {
            c26158x = new C26158x(this, abstractC32269c);
        }
        Object obj2 = c26158x.f103642I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26158x.f103644K;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            c26158x.f103645w = this;
            c26158x.f103646x = str;
            c26158x.f103647y = c16744u2;
            c26158x.f103648z = interfaceC12576v0;
            c26158x.f103638E = c38915o4;
            c26158x.f103639F = c38919p;
            c26158x.f103640G = str2;
            c26158x.f103641H = str3;
            c26158x.f103644K = 1;
            Object objM7073S = ((C2273z0) this.f103661d).m7073S(str, this.f103662e, C25271y.f99162w, c26158x);
            if (objM7073S == enumC31071a) {
                return enumC31071a;
            }
            interfaceC12576v1 = interfaceC12576v0;
            c38915o5 = c38915o4;
            c38919p2 = c38919p;
            str4 = str2;
            str5 = str3;
            str6 = str;
            c26160z = this;
            c16744u3 = c16744u2;
            obj = objM7073S;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str7 = c26158x.f103641H;
            String str8 = c26158x.f103640G;
            C38919p c38919p3 = c26158x.f103639F;
            C38915o4 c38915o6 = c26158x.f103638E;
            InterfaceC12576v0 interfaceC12576v2 = c26158x.f103648z;
            C16744u2 c16744u4 = c26158x.f103647y;
            String str9 = c26158x.f103646x;
            C26160z c26160z2 = c26158x.f103645w;
            AbstractC34132o.m107864I(obj2);
            obj = ((C23468n) obj2).f92940w;
            str5 = str7;
            str4 = str8;
            c38919p2 = c38919p3;
            c38915o5 = c38915o6;
            interfaceC12576v1 = interfaceC12576v2;
            str6 = str9;
            c26160z = c26160z2;
            c16744u3 = c16744u4;
        }
        if (!(obj instanceof C23467m)) {
            try {
                InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) obj;
                if (interfaceC38802c8.mo124334j0()) {
                    c26160z.getClass();
                    if (interfaceC12576v1.mo35253V() && !c26160z.f103662e.m127934f()) {
                        throw new IllegalStateException("(Test-mode only error) The default payment methods feature is not yet supported with deferred server-side confirmation. Please contact us if you'd like to use this feature via a Github issue on stripe-android.");
                    }
                    objM107888l = new C12533a(interfaceC38802c8, EnumC26121c0.Server, true);
                } else if (interfaceC38802c8.mo124339z()) {
                    c26160z.getClass();
                    objM107888l = m77691f(interfaceC38802c8, c38915o5);
                } else {
                    objM107888l = c26160z.m77695e(str6, interfaceC38802c8, c16744u3, interfaceC12576v1, c38915o5, c38919p2, str4, str5);
                }
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            obj = objM107888l;
        }
        Throwable thM68037a = C23468n.m68037a(obj);
        return thM68037a == null ? obj : new C12535b(thM68037a, AbstractC37926s0.m121456H(thM68037a), C12571t.f42932a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0154  */
    /* JADX WARN: Code duplicated, block: B:97:0x0160  */
    /* JADX INFO: renamed from: e */
    public final InterfaceC12539d m77695e(String str, InterfaceC38802c8 interfaceC38802c8, C16744u2 intentConfiguration, InterfaceC12576v0 interfaceC12576v0, C38915o4 paymentMethod, C38919p c38919p, String str2, String str3) {
        String lowerCase;
        String str4;
        Map mapM99544m;
        String str5;
        boolean zM65745e;
        String str6;
        Object obj;
        String str7;
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        InterfaceC39010z0 interfaceC39010z0 = AbstractC32410a.m101031g0(intentConfiguration).f166898w;
        String lowerCase2 = null;
        if (interfaceC38802c8 instanceof C38887l3) {
            C38983w0 c38983w0 = interfaceC39010z0 instanceof C38983w0 ? (C38983w0) interfaceC39010z0 : null;
            if (c38983w0 == null) {
                throw new IllegalArgumentException("You returned a PaymentIntent client secret but used a PaymentSheet.IntentConfiguration in setup mode.");
            }
            String str8 = c38983w0.f167801x;
            Locale locale = Locale.ROOT;
            String lowerCase3 = str8.toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
            C38887l3 c38887l3 = (C38887l3) interfaceC38802c8;
            StripeIntent$Usage stripeIntent$Usage = c38887l3.f167383R;
            String str9 = c38887l3.f167376K;
            if (str9 != null) {
                lowerCase = str9.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (!lowerCase3.equals(lowerCase)) {
                if (str9 != null) {
                    lowerCase2 = str9.toLowerCase(locale);
                    AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                }
                String lowerCase4 = str8.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase4, "toLowerCase(...)");
                StringBuilder sb4 = new StringBuilder("Your PaymentIntent currency (");
                sb4.append(lowerCase2);
                sb4.append(") does not match the PaymentSheet.IntentConfiguration currency (");
                throw new IllegalArgumentException(AbstractC25012a.m73376i(lowerCase4, ").", sb4).toString());
            }
            EnumC38837g3 enumC38837g3 = c38887l3.f167373H;
            if (enumC38837g3 == EnumC38837g3.Manual && !this.f103663f) {
                throw new IllegalArgumentException(("Your PaymentIntent confirmationMethod (" + enumC38837g3 + ") can only be used with PaymentSheet.FlowController.").toString());
            }
            EnumC38828f4 enumC38828f4 = paymentMethod.f167511E;
            if (enumC38828f4 == null || (str7 = enumC38828f4.f167132w) == null) {
                str4 = null;
            } else {
                Object obj2 = c38887l3.mo124326G().get(str7);
                Map map = obj2 instanceof Map ? (Map) obj2 : null;
                Object obj3 = map != null ? map.get("setup_future_usage") : null;
                if (obj3 instanceof String) {
                    str4 = (String) obj3;
                } else {
                    str4 = null;
                }
            }
            String str10 = c38983w0.f167799E;
            if (str10 == null || (mapM99544m = AbstractC32004s.m99544m(new JSONObject(str10))) == null) {
                mapM99544m = C25272z.f99163w;
            }
            if (mapM99544m.isEmpty() || stripeIntent$Usage != null || str4 != null) {
                StripeIntent$Usage stripeIntent$Usage2 = c38983w0.f167802y;
                if ((stripeIntent$Usage2 == null) != (stripeIntent$Usage == null)) {
                    throw new IllegalArgumentException(("Your PaymentIntent setupFutureUsage (" + stripeIntent$Usage + ") does not match the PaymentSheet.IntentConfiguration setupFutureUsage (" + stripeIntent$Usage2 + ").").toString());
                }
                if (enumC38828f4 == null || (str6 = enumC38828f4.f167132w) == null || (obj = mapM99544m.get(str6)) == null) {
                    str5 = null;
                } else {
                    Map map2 = obj instanceof Map ? (Map) obj : null;
                    Object obj4 = map2 != null ? map2.get("setup_future_usage") : null;
                    if (obj4 instanceof String) {
                        str5 = (String) obj4;
                    } else {
                        str5 = null;
                    }
                }
                if (str4 != null) {
                    int iHashCode = str4.hashCode();
                    if (iHashCode != -1541412810) {
                        if (iHashCode != -91162682) {
                            if (iHashCode == 3387192 && str4.equals("none")) {
                                zM65745e = AbstractC22676k.m65745e(str5, "none");
                            }
                        } else if (str4.equals("off_session")) {
                            if (!AbstractC22676k.m65745e(str5, "on_session") || AbstractC22676k.m65745e(str5, "off_session")) {
                                zM65745e = true;
                            }
                        }
                        zM65745e = false;
                    } else {
                        if (str4.equals("on_session")) {
                            if (!AbstractC22676k.m65745e(str5, "on_session")) {
                            }
                            zM65745e = true;
                        }
                        zM65745e = false;
                    }
                } else if (str5 == null) {
                    zM65745e = true;
                } else {
                    zM65745e = false;
                }
                if (!zM65745e) {
                    StringBuilder sbM32001t = AbstractC11895b.m32001t("Your PaymentIntent payment_method_options[", enumC38828f4 != null ? enumC38828f4.f167132w : null, "][setup_future_usage] value ", str4, " does not match the IntentConfiguration value ");
                    sbM32001t.append(str5);
                    throw new IllegalArgumentException(sbM32001t.toString().toString());
                }
            }
        } else {
            if (!(interfaceC38802c8 instanceof C38840g6)) {
                throw new NoWhenBranchMatchedException();
            }
            C39001y0 c39001y0 = interfaceC39010z0 instanceof C39001y0 ? (C39001y0) interfaceC39010z0 : null;
            if (c39001y0 == null) {
                throw new IllegalArgumentException("You returned a SetupIntent client secret but used a PaymentSheet.IntentConfiguration in payment mode.");
            }
            boolean z4 = c39001y0.f167871x == null;
            StripeIntent$Usage stripeIntent$Usage3 = ((C38840g6) interfaceC38802c8).f167173L;
            if (!(z4 == (stripeIntent$Usage3 == null))) {
                throw new IllegalArgumentException(("Your SetupIntent usage (" + stripeIntent$Usage3 + ") does not match the PaymentSheet.IntentConfiguration usage (" + stripeIntent$Usage3 + ").").toString());
            }
        }
        return this.f103664g.m8247b(str, interfaceC38802c8, c38919p, true, new C1008b(paymentMethod, interfaceC12576v0, intentConfiguration, str2, str3, this, 15));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (r1 == r2) goto L31;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m77696g(h20.C16744u2 r14, y00.InterfaceC38802c8 r15, e10.C12572t0 r16, y00.C38919p r17, boolean r18, s83.AbstractC32269c r19) {
        /*
            r13 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof n10.C26159y
            if (r2 == 0) goto L18
            r2 = r1
            n10.y r2 = (n10.C26159y) r2
            int r3 = r2.f103653I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f103653I = r3
        L16:
            r12 = r2
            goto L1e
        L18:
            n10.y r2 = new n10.y
            r2.<init>(r13, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r12.f103651G
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r12.f103653I
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L54
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            p505ts.AbstractC34132o.m107864I(r1)
            goto Lae
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L39:
            boolean r14 = r12.f103650F
            y00.p r0 = r12.f103649E
            e10.t0 r3 = r12.f103657z
            y00.c8 r6 = r12.f103656y
            h20.u2 r7 = r12.f103655x
            n10.z r8 = r12.f103654w
            p505ts.AbstractC34132o.m107864I(r1)
            l83.n r1 = (l83.C23468n) r1
            java.lang.Object r1 = r1.f92940w
            r9 = r7
            r7 = r14
            r14 = r9
            r9 = r6
            r6 = r3
            r3 = r9
            r9 = r0
            goto L7c
        L54:
            p505ts.AbstractC34132o.m107864I(r1)
            y00.d5 r1 = r0.f42935w
            r12.f103654w = r13
            r12.f103655x = r14
            r12.f103656y = r15
            r12.f103657z = r0
            r6 = r17
            r12.f103649E = r6
            r7 = r18
            r12.f103650F = r7
            r12.f103653I = r5
            b10.c1 r8 = r13.f103661d
            b10.z0 r8 = (b10.C2273z0) r8
            yy.f r9 = r13.f103662e
            java.lang.Object r1 = r8.m7093p(r1, r9, r12)
            if (r1 != r2) goto L78
            goto Lad
        L78:
            r8 = r13
            r3 = r15
            r9 = r6
            r6 = r0
        L7c:
            java.lang.Throwable r0 = l83.C23468n.m68037a(r1)
            if (r0 != 0) goto Lb1
            y00.o4 r1 = (y00.C38915o4) r1
            if (r7 != 0) goto L93
            y00.u5 r0 = r6.f42936x
            r8.getClass()
            boolean r0 = m77692h(r0, r14)
            if (r0 == 0) goto L92
            goto L93
        L92:
            r5 = 0
        L93:
            r0 = 0
            r12.f103654w = r0
            r12.f103655x = r0
            r12.f103656y = r0
            r12.f103657z = r0
            r12.f103649E = r0
            r12.f103653I = r4
            r10 = 0
            r11 = 0
            r7 = r1
            r4 = r3
            r3 = r8
            r8 = r5
            r5 = r14
            java.lang.Object r1 = r3.m77693c(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r2) goto Lae
        Lad:
            return r2
        Lae:
            e10.d r1 = (e10.InterfaceC12539d) r1
            return r1
        Lb1:
            e10.b r14 = new e10.b
            zy.c r1 = x30.AbstractC37926s0.m121456H(r0)
            e10.t r2 = e10.C12571t.f42932a
            r14.<init>(r0, r1, r2)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: n10.C26160z.m77696g(h20.u2, y00.c8, e10.t0, y00.p, boolean, s83.c):java.lang.Object");
    }
}
