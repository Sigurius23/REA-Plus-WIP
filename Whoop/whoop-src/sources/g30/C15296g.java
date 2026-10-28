package g30;

import cz.C11194d;
import e00.C12478a;
import e00.C12492o;
import e00.C12498u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.C25272z;
import n83.C26463f;
import p012ab.C0684i0;
import p442qy.C30764c;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p598wy.C37688a;
import p664yy.AbstractC39877q;
import p664yy.C39857f;
import p664yy.C39859g;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import y00.C38880k6;
import y00.EnumC38796c2;
import y00.EnumC38872j8;
import y00.EnumC38922p2;
import y00.InterfaceC38834g0;
import z00.C39932a;
import z00.C39933b;
import z00.C39934c;

/* JADX INFO: renamed from: g30.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C15296g {

    /* JADX INFO: renamed from: a */
    public final C0684i0 f57453a;

    /* JADX INFO: renamed from: b */
    public final C37688a f57454b;

    /* JADX INFO: renamed from: c */
    public final C29938w0 f57455c;

    public C15296g(C0684i0 c0684i0, String apiVersion) {
        AbstractC22676k.m65750j(apiVersion, "apiVersion");
        this.f57453a = c0684i0;
        this.f57454b = new C37688a();
        this.f57455c = new C29938w0((C30764c) null, apiVersion, "AndroidBindings/22.6.1");
    }

    /* JADX INFO: renamed from: a */
    public final Object m43401a(String str, String str2, String str3, Boolean bool, C39857f c39857f, C12478a c12478a) {
        EnumC38872j8[] enumC38872j8Arr = EnumC38872j8.f167319w;
        String strConcat = "https://api.stripe.com/v1/".concat("consumers/sessions/confirm_verification");
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("request_surface", str3), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str)), new C23465k("type", "SMS"), new C23465k("code", str2), new C23465k("consent_granted", bool));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM73990Y.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC39877q.m127948e(this.f57453a, this.f57454b, C29938w0.m91543n(this.f57455c, strConcat, c39857f, linkedHashMap, 8), new C39933b(), c12478a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m43402b(String str, String str2, EnumC38922p2 enumC38922p2, String str3, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C15290a c15290a;
        if (abstractC32269c instanceof C15290a) {
            c15290a = (C15290a) abstractC32269c;
            int i13 = c15290a.f57437y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15290a.f57437y = i13 - Integer.MIN_VALUE;
            } else {
                c15290a = new C15290a(this, abstractC32269c);
            }
        } else {
            c15290a = new C15290a(this, abstractC32269c);
        }
        Object obj = c15290a.f57435w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15290a.f57437y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f57455c, "https://api.stripe.com/v1/".concat("consumers/link_account_sessions"), c39857f, AbstractC25247g0.m73990Y(new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str)), new C23465k("intent_token", str2), new C23465k("link_mode", enumC38922p2 != null ? enumC38922p2.f167549w : null), new C23465k("request_surface", str3)), 8);
        C39932a c39932a = C39932a.f172376F;
        c15290a.f57437y = 1;
        Object objM127949f = AbstractC39877q.m127949f(this.f57453a, this.f57454b, c39859gM91543n, c39932a, c15290a);
        return objM127949f == enumC31071a ? enumC31071a : objM127949f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m43403c(String str, InterfaceC38834g0 interfaceC38834g0, String str2, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C15291b c15291b;
        if (abstractC32269c instanceof C15291b) {
            c15291b = (C15291b) abstractC32269c;
            int i13 = c15291b.f57440y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15291b.f57440y = i13 - Integer.MIN_VALUE;
            } else {
                c15291b = new C15291b(this, abstractC32269c);
            }
        } else {
            c15291b = new C15291b(this, abstractC32269c);
        }
        Object obj = c15291b.f57438w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15291b.f57440y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f57455c, "https://api.stripe.com/v1/".concat("consumers/payment_details"), c39857f, AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("request_surface", str2), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str))), interfaceC38834g0.mo124325c0()), 8);
        C39932a c39932a = C39932a.f172379x;
        c15291b.f57440y = 1;
        Object objM127949f = AbstractC39877q.m127949f(this.f57453a, this.f57454b, c39859gM91543n, c39932a, c15291b);
        return objM127949f == enumC31071a ? enumC31071a : objM127949f;
    }

    /* JADX INFO: renamed from: d */
    public final Object m43404d(String str, String str2, String str3, String str4, boolean z4, C39857f c39857f, String str5, AbstractC32275i abstractC32275i) {
        String lowerCase;
        Map mapM114688p = z4 ? AbstractC36095b.m114688p(Boolean.TRUE, "do_not_log_consumer_funnel_event") : C25272z.f99163w;
        String strConcat = "https://api.stripe.com/v1/".concat("consumers/sessions/lookup");
        C23465k c23465k = new C23465k("request_surface", str3);
        C23465k c23465k2 = new C23465k("session_id", str4);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k("email_address", lowerCase), new C23465k("link_auth_intent_id", str2), new C23465k("customer_id", str5));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM73990Y.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC39877q.m127948e(this.f57453a, this.f57454b, C29938w0.m91543n(this.f57455c, strConcat, c39857f, AbstractC25247g0.m73995d0(linkedHashMap, mapM114688p), 8), new C39934c(0), abstractC32275i);
    }

    /* JADX INFO: renamed from: e */
    public final Object m43405e(String str, EnumC38796c2 enumC38796c2, String str2, String str3, String str4, String str5, List list, C39857f c39857f, String str6, String str7, String str8, C12492o c12492o) {
        String lowerCase;
        String str9;
        String strConcat = "https://api.stripe.com/v1/".concat("consumers/mobile/sessions/lookup");
        C23465k c23465k = new C23465k("request_surface", str3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            str9 = null;
        } else {
            lowerCase = null;
            str9 = null;
        }
        C23465k c23465k2 = new C23465k("email_address", lowerCase);
        String str10 = str9;
        C23465k c23465k3 = new C23465k("link_auth_intent_id", str2);
        C23465k c23465k4 = new C23465k("android_verification_token", str4);
        C23465k c23465k5 = new C23465k("session_id", str6);
        if (enumC38796c2 != null) {
            str10 = enumC38796c2.f166972w;
        }
        Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, new C23465k("email_source", str10), new C23465k("app_id", str5), new C23465k("customer_id", str7), new C23465k("supported_verification_types", list), new C23465k("link_auth_token_client_secret", str8));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM73990Y.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC39877q.m127948e(this.f57453a, this.f57454b, C29938w0.m91543n(this.f57455c, strConcat, c39857f, linkedHashMap, 8), new C39934c(0), c12492o);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m43406f(C38880k6 c38880k6, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C15292c c15292c;
        if (abstractC32269c instanceof C15292c) {
            c15292c = (C15292c) abstractC32269c;
            int i13 = c15292c.f57443y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15292c.f57443y = i13 - Integer.MIN_VALUE;
            } else {
                c15292c = new C15292c(this, abstractC32269c);
            }
        } else {
            c15292c = new C15292c(this, abstractC32269c);
        }
        Object obj = c15292c.f57441w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15292c.f57443y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f57455c, "https://api.stripe.com/v1/".concat("consumers/mobile/sign_up"), c39857f, c38880k6.m124357a(), 8);
        C39932a c39932a = C39932a.f172381z;
        c15292c.f57443y = 1;
        Object objM127949f = AbstractC39877q.m127949f(this.f57453a, this.f57454b, c39859gM91543n, c39932a, c15292c);
        return objM127949f == enumC31071a ? enumC31071a : objM127949f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m43407g(String str, boolean z4, String str2, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C15293d c15293d;
        if (abstractC32269c instanceof C15293d) {
            c15293d = (C15293d) abstractC32269c;
            int i13 = c15293d.f57446y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15293d.f57446y = i13 - Integer.MIN_VALUE;
            } else {
                c15293d = new C15293d(this, abstractC32269c);
            }
        } else {
            c15293d = new C15293d(this, abstractC32269c);
        }
        Object obj = c15293d.f57444w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15293d.f57446y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f57455c, "https://api.stripe.com/v1/".concat("consumers/sessions/consent_update"), c39857f, AbstractC25247g0.m73990Y(new C23465k("request_surface", str2), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str)), new C23465k("consent_granted", Boolean.valueOf(z4))), 8);
        c15293d.f57446y = 1;
        Object objM127947d = AbstractC39877q.m127947d(this.f57453a, this.f57454b, c39859gM91543n, c15293d);
        return objM127947d == enumC31071a ? enumC31071a : objM127947d;
    }

    /* JADX INFO: renamed from: h */
    public final Object m43408h(String str, String str2, List list, String str3, C39857f c39857f, C11194d c11194d) {
        return AbstractC39877q.m127948e(this.f57453a, this.f57454b, C29938w0.m91543n(this.f57455c, "https://api.stripe.com/v1/".concat("consumers/sessions/refresh"), c39857f, AbstractC25247g0.m73990Y(new C23465k("app_id", str), new C23465k("request_surface", str3), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str2)), new C23465k("supported_verification_types", list)), 8), new C39934c(1), c11194d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m43409i(String str, String str2, String str3, String str4, String str5, C39857f c39857f, LinkedHashMap linkedHashMap, AbstractC32269c abstractC32269c) {
        C15294e c15294e;
        if (abstractC32269c instanceof C15294e) {
            c15294e = (C15294e) abstractC32269c;
            int i13 = c15294e.f57449y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15294e.f57449y = i13 - Integer.MIN_VALUE;
            } else {
                c15294e = new C15294e(this, abstractC32269c);
            }
        } else {
            c15294e = new C15294e(this, abstractC32269c);
        }
        Object obj = c15294e.f57447w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15294e.f57449y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f57455c, "https://api.stripe.com/v1/".concat("consumers/payment_details/share"), c39857f, AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("request_surface", str5), new C23465k("id", str2), new C23465k("expected_payment_method_type", str3), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", str)), new C23465k("billing_phone", str4)), linkedHashMap), 8);
        C39932a c39932a = C39932a.f172378H;
        c15294e.f57449y = 1;
        Object objM127949f = AbstractC39877q.m127949f(this.f57453a, this.f57454b, c39859gM91543n, c39932a, c15294e);
        return objM127949f == enumC31071a ? enumC31071a : objM127949f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m43410j(C38880k6 c38880k6, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C15295f c15295f;
        if (abstractC32269c instanceof C15295f) {
            c15295f = (C15295f) abstractC32269c;
            int i13 = c15295f.f57452y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15295f.f57452y = i13 - Integer.MIN_VALUE;
            } else {
                c15295f = new C15295f(this, abstractC32269c);
            }
        } else {
            c15295f = new C15295f(this, abstractC32269c);
        }
        Object obj = c15295f.f57450w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15295f.f57452y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39859g c39859gM91543n = C29938w0.m91543n(this.f57455c, "https://api.stripe.com/v1/".concat("consumers/accounts/sign_up"), c39857f, c38880k6.m124357a(), 8);
        C39932a c39932a = C39932a.f172381z;
        c15295f.f57452y = 1;
        Object objM127949f = AbstractC39877q.m127949f(this.f57453a, this.f57454b, c39859gM91543n, c39932a, c15295f);
        return objM127949f == enumC31071a ? enumC31071a : objM127949f;
    }

    /* JADX INFO: renamed from: k */
    public final Object m43411k(String str, Locale locale, String str2, C39857f c39857f, boolean z4, C12498u c12498u) {
        EnumC38872j8[] enumC38872j8Arr = EnumC38872j8.f167319w;
        String strConcat = "https://api.stripe.com/v1/".concat("consumers/sessions/start_verification");
        C26463f c26463f = new C26463f();
        c26463f.put("request_surface", str2);
        c26463f.put("credentials", AbstractC25247g0.m73989X(new C23465k("consumer_session_client_secret", str)));
        c26463f.put("type", "SMS");
        c26463f.put("locale", locale.toLanguageTag());
        if (z4) {
            c26463f.put("is_resend_sms_code", Boolean.TRUE);
        }
        return AbstractC39877q.m127948e(this.f57453a, this.f57454b, C29938w0.m91543n(this.f57455c, strConcat, c39857f, c26463f.m78380b(), 8), new C39933b(), c12498u);
    }
}
