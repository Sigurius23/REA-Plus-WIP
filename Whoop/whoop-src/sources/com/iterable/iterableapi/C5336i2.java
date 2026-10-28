package com.iterable.iterableapi;

import android.net.Uri;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.RunnableC1319m;
import com.google.crypto.tink.internal.C5101l0;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import java.util.Locale;
import java.util.Objects;
import l83.C23454a0;
import l83.C23468n;
import lq0.C24656d;
import org.json.JSONException;
import org.json.JSONObject;
import p098dt.AbstractC12350b;
import p313lz.C24812i;
import p465rm.C31559p;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import qg3.C30352d;
import r80.AbstractC31061c;
import t30.C33520v;
import t30.InterfaceC33524z;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.iterable.iterableapi.i2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5336i2 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21711a;

    /* JADX INFO: renamed from: b */
    public Object f21712b;

    /* JADX INFO: renamed from: a */
    public void m16452a(Uri uri) {
        InterfaceC33524z interfaceC33524z;
        String string = uri.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Locale locale = Locale.ENGLISH;
        if (!AbstractC39421y.m125930O(AbstractC31061c.m95641q(locale, "ENGLISH", string, locale, "toLowerCase(...)"), "https://emv3ds/challenge", false) || (interfaceC33524z = (InterfaceC33524z) this.f21712b) == null) {
            return;
        }
        String query = uri.getQuery();
        C33520v c33520v = (C33520v) ((C31559p) interfaceC33524z).f130337x;
        if (query == null) {
            query = "";
        }
        c33520v.f139941x = query;
        View.OnClickListener onClickListener = c33520v.f139942y;
        if (onClickListener != null) {
            onClickListener.onClick(c33520v);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f21711a) {
            case 0:
                C5379v0 c5379v0 = (C5379v0) this.f21712b;
                c5379v0.f21872x = true;
                Objects.requireNonNull(c5379v0);
                webView.postDelayed(new RunnableC1319m(c5379v0, 14), 100L);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        switch (this.f21711a) {
            case 2:
                AbstractC22676k.m65750j(view, "view");
                AbstractC22676k.m65750j(request, "request");
                Uri url = request.getUrl();
                AbstractC22676k.m65749i(url, "getUrl(...)");
                m16452a(url);
                Uri url2 = request.getUrl();
                AbstractC22676k.m65749i(url2, "getUrl(...)");
                return URLUtil.isDataUrl(url2.toString()) ? super.shouldInterceptRequest(view, request) : new WebResourceResponse(null, null, null);
            default:
                return super.shouldInterceptRequest(view, request);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f21711a) {
            case 0:
                C5379v0 c5379v0 = (C5379v0) this.f21712b;
                c5379v0.getClass();
                C5341k c5341k = C5341k.f21742r;
                String str2 = c5379v0.f21863F;
                C5388y0 c5388y0 = C5379v0.f21861P;
                c5341k.getClass();
                AbstractC12350b.m34557F();
                C5339j1 c5339j1M16421d = c5341k.m16486e().m16421d(str2);
                if (c5339j1M16421d != null) {
                    if (c5341k.m16482a()) {
                        C5101l0 c5101l0 = c5341k.f21752j;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            c5101l0.m16027B(jSONObject);
                            jSONObject.put("messageId", c5339j1M16421d.f21720a);
                            jSONObject.put("clickedUrl", str);
                            jSONObject.put("messageContext", C5101l0.m16025Q(c5339j1M16421d, c5388y0));
                            jSONObject.put("deviceInfo", c5101l0.m16036O());
                            c5101l0.m16055f0("events/trackInAppClick", jSONObject);
                        } catch (JSONException e5) {
                            e5.printStackTrace();
                        }
                    }
                    break;
                } else {
                    c5341k.m16493n(str2, str);
                }
                C5341k.f21742r.m16494o(c5379v0.f21863F, str, EnumC5342k0.f21761x, C5379v0.f21861P);
                C30352d c30352d = C5379v0.f21860O;
                if (c30352d != null) {
                    c30352d.m92816p(Uri.parse(str));
                }
                c5379v0.m16534F();
                c5379v0.m16533E();
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public C5336i2(FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity) {
        this.f21711a = 1;
        this.f21712b = financialConnectionsSheetLiteActivity;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Object objM107888l;
        switch (this.f21711a) {
            case 1:
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) this.f21712b;
                Uri url = request != null ? request.getUrl() : null;
                int i13 = FinancialConnectionsSheetLiteActivity.f22170z;
                if (url == null) {
                    return false;
                }
                C24812i c24812i = (C24812i) financialConnectionsSheetLiteActivity.f22173y.getValue();
                String string = url.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                C24656d c24656d = new C24656d(string, c24812i);
                try {
                    Object value = c24812i.f97137G.getValue();
                    if (value != null) {
                        c24656d.invoke(value);
                        objM107888l = C23454a0.f92919a;
                        Throwable thM68037a = C23468n.m68037a(objM107888l);
                        if (thM68037a == null) {
                            return true;
                        }
                        c24812i.m72715g("State is null", thM68037a);
                        return true;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                break;
            case 2:
                AbstractC22676k.m65750j(view, "view");
                AbstractC22676k.m65750j(request, "request");
                Uri url2 = request.getUrl();
                AbstractC22676k.m65749i(url2, "getUrl(...)");
                m16452a(url2);
                return true;
            default:
                return super.shouldOverrideUrlLoading(view, request);
        }
    }
}
