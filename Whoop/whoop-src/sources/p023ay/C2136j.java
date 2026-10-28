package p023ay;

import android.webkit.JavascriptInterface;
import b20.C2326f;
import b20.EnumC2325e;
import com.stripe.android.core.exception.StripeException;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import kr.C22786e;
import l83.C23468n;
import org.json.JSONException;
import org.json.JSONObject;
import p442qy.C30765d;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;
import u00.C34377e;

/* JADX INFO: renamed from: ay.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C2136j implements InterfaceC2135i {

    /* JADX INFO: renamed from: a */
    public final C22786e f8519a;

    /* JADX INFO: renamed from: b */
    public final C34377e f8520b;

    /* JADX INFO: renamed from: c */
    public final C2146t f8521c;

    /* JADX INFO: renamed from: d */
    public final C30765d f8522d;

    /* JADX INFO: renamed from: e */
    public final C2326f f8523e;

    /* JADX INFO: renamed from: f */
    public final C13096w1 f8524f;

    /* JADX INFO: renamed from: g */
    public final C13096w1 f8525g;

    public C2136j(C22786e c22786e, C34377e c34377e, C2146t c2146t, C30765d logger, C2326f c2326f) {
        AbstractC22676k.m65750j(logger, "logger");
        this.f8519a = c22786e;
        this.f8520b = c34377e;
        this.f8521c = c2146t;
        this.f8522d = logger;
        this.f8523e = c2326f;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.f8524f = c13096w1M36592b;
        this.f8525g = c13096w1M36592b;
    }

    /* JADX INFO: renamed from: a */
    public final void m6695a(String str) {
        this.f8522d.m94511a("[ConfirmationChallenge] " + str);
    }

    @Override // p023ay.InterfaceC2135i
    @JavascriptInterface
    public String getInitParams() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2146t c2146t = this.f8521c;
        jSONObject.put("publishableKey", c2146t.f8541w);
        jSONObject.put("clientSecret", c2146t.f8543y.getClientSecret());
        m6695a("Returning init params: " + jSONObject);
        String string = jSONObject.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    @Override // p023ay.InterfaceC2135i
    @JavascriptInterface
    public void onError(String errorMessage) {
        Object objM107888l;
        C13096w1 c13096w1 = this.f8524f;
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        m6695a("Error from bridge: ".concat(errorMessage));
        try {
            objM107888l = Boolean.valueOf(c13096w1.mo36564a(new C2131e(new C2123a(((C2127c) this.f8520b.mo8011m(new JSONObject(errorMessage))).f8510w))));
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            EnumC2325e enumC2325e = EnumC2325e.INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_ERROR_CALLBACK_PARAMS;
            int i13 = StripeException.f22154E;
            AbstractC35903f.m113990H(this.f8523e, enumC2325e, AbstractC32123d.m100024d(thM68037a), null, 4);
            c13096w1.mo36564a(new C2131e(thM68037a));
        }
    }

    @Override // p023ay.InterfaceC2135i
    @JavascriptInterface
    public void onReady() {
        m6695a("Bridge is ready");
        this.f8524f.mo36564a(C2132f.f8517a);
    }

    @Override // p023ay.InterfaceC2135i
    @JavascriptInterface
    public void onSuccess(String paymentIntentJson) {
        Object objM107888l;
        String clientSecret;
        C13096w1 c13096w1 = this.f8524f;
        AbstractC22676k.m65750j(paymentIntentJson, "paymentIntentJson");
        m6695a("Payment intent success: ".concat(paymentIntentJson));
        try {
            C2129d c2129d = (C2129d) this.f8519a.mo8011m(new JSONObject(paymentIntentJson));
            if (c2129d == null || (clientSecret = c2129d.f8513w) == null) {
                clientSecret = this.f8521c.f8543y.getClientSecret();
                if (clientSecret == null) {
                    throw new IllegalArgumentException("Missing client secret");
                }
            }
            objM107888l = Boolean.valueOf(c13096w1.mo36564a(new C2133g(clientSecret)));
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            EnumC2325e enumC2325e = EnumC2325e.INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_SUCCESS_CALLBACK_PARAMS;
            int i13 = StripeException.f22154E;
            AbstractC35903f.m113990H(this.f8523e, enumC2325e, AbstractC32123d.m100024d(thM68037a), null, 4);
            c13096w1.mo36564a(new C2131e(thM68037a));
        }
    }
}
