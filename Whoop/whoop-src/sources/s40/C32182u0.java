package s40;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ec3.C13045h2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25260n;
import p098dt.AbstractC12350b;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: s40.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32182u0 extends WebViewClient {

    /* JADX INFO: renamed from: h */
    public static final Set f133283h = AbstractC12350b.m34570S("https://hooks.stripe.com/three_d_secure/authenticate");

    /* JADX INFO: renamed from: i */
    public static final Set f133284i = AbstractC25260n.m74059b1(new String[]{"https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete"});

    /* JADX INFO: renamed from: a */
    public final C30765d f133285a;

    /* JADX INFO: renamed from: b */
    public final C13045h2 f133286b;

    /* JADX INFO: renamed from: c */
    public final String f133287c;

    /* JADX INFO: renamed from: d */
    public final Function1 f133288d;

    /* JADX INFO: renamed from: e */
    public final Function1 f133289e;

    /* JADX INFO: renamed from: f */
    public final Uri f133290f;

    /* JADX INFO: renamed from: g */
    public boolean f133291g;

    public C32182u0(C30765d logger, C13045h2 c13045h2, String clientSecret, String str, Function1 function1, Function1 function2) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f133285a = logger;
        this.f133286b = c13045h2;
        this.f133287c = clientSecret;
        this.f133288d = function1;
        this.f133289e = function2;
        this.f133290f = str != null ? Uri.parse(str) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m100109a(Intent intent) {
        Object objM107888l;
        C30765d c30765d = this.f133285a;
        c30765d.m94511a("PaymentAuthWebViewClient#openIntent()");
        try {
            this.f133288d.invoke(intent);
            objM107888l = C23454a0.f92919a;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            c30765d.m94512b("Failed to start Intent.", thM68037a);
            if (AbstractC22676k.m65745e(intent.getScheme(), "alipays")) {
                return;
            }
            c30765d.m94511a("PaymentAuthWebViewClient#onAuthCompleted()");
            this.f133289e.invoke(thM68037a);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String str) {
        AbstractC22676k.m65750j(view, "view");
        C30765d c30765d = this.f133285a;
        c30765d.m94511a("PaymentAuthWebViewClient#onPageFinished() - " + str);
        super.onPageFinished(view, str);
        if (!this.f133291g) {
            c30765d.m94511a("PaymentAuthWebViewClient#hideProgressBar()");
            Boolean bool = Boolean.TRUE;
            C13045h2 c13045h2 = this.f133286b;
            c13045h2.getClass();
            c13045h2.m36571k(null, bool);
        }
        if (str != null) {
            Set set = f133284i;
            if ((set instanceof Collection) && set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC39421y.m125930O(str, (String) it.next(), false)) {
                    c30765d.m94511a(str.concat(" is a completion URL"));
                    c30765d.m94511a("PaymentAuthWebViewClient#onAuthCompleted()");
                    this.f133289e.invoke(null);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        String queryParameter;
        Object objM107888l;
        String queryParameter2;
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(request, "request");
        Uri url = request.getUrl();
        C30765d c30765d = this.f133285a;
        c30765d.m94511a("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        AbstractC22676k.m65747g(url);
        c30765d.m94511a("PaymentAuthWebViewClient#updateCompletionUrl()");
        String string = url.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Set set = f133283h;
        boolean zM65745e = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    queryParameter = null;
                    break;
                }
                if (AbstractC39421y.m125930O(string, (String) it.next(), false)) {
                    queryParameter = url.getQueryParameter("return_url");
                    break;
                }
            }
        } else {
            queryParameter = null;
            break;
        }
        if (queryParameter != null) {
            AbstractC39414r.m125890i0(queryParameter);
        }
        c30765d.m94511a("PaymentAuthWebViewClient#isReturnUrl()");
        if ("stripejs://use_stripe_sdk/return_url".equals(url.toString())) {
            zM65745e = true;
        } else {
            String string2 = url.toString();
            AbstractC22676k.m65749i(string2, "toString(...)");
            if (AbstractC39421y.m125930O(string2, "stripesdk://payment_return_url/", false)) {
                zM65745e = true;
            } else {
                Uri uri = this.f133290f;
                if (uri != null) {
                    if (uri.getScheme() != null && AbstractC22676k.m65745e(uri.getScheme(), url.getScheme()) && uri.getHost() != null && AbstractC22676k.m65745e(uri.getHost(), url.getHost())) {
                        zM65745e = true;
                    }
                } else if (!url.isOpaque()) {
                    Set<String> queryParameterNames = url.getQueryParameterNames();
                    if (queryParameterNames.contains("payment_intent_client_secret")) {
                        queryParameter2 = url.getQueryParameter("payment_intent_client_secret");
                    } else {
                        queryParameter2 = queryParameterNames.contains("setup_intent_client_secret") ? url.getQueryParameter("setup_intent_client_secret") : null;
                    }
                    zM65745e = AbstractC22676k.m65745e(this.f133287c, queryParameter2);
                }
            }
        }
        Function1 function1 = this.f133289e;
        if (zM65745e) {
            c30765d.m94511a("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            c30765d.m94511a("PaymentAuthWebViewClient#onAuthCompleted()");
            function1.invoke(null);
            return true;
        }
        if (!"intent".equalsIgnoreCase(url.getScheme())) {
            if (URLUtil.isNetworkUrl(url.toString())) {
                return super.shouldOverrideUrlLoading(view, request);
            }
            m100109a(new Intent("android.intent.action.VIEW", url));
            return true;
        }
        c30765d.m94511a("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            Intent uri2 = Intent.parseUri(url.toString(), 1);
            AbstractC22676k.m65749i(uri2, "parseUri(...)");
            m100109a(uri2);
            objM107888l = C23454a0.f92919a;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            c30765d.m94512b("Failed to start Intent.", thM68037a);
            c30765d.m94511a("PaymentAuthWebViewClient#onAuthCompleted()");
            function1.invoke(thM68037a);
        }
        return true;
    }
}
