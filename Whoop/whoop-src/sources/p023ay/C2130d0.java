package p023ay;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p012ab.C0680g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ay.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2130d0 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final String f8514a = "https://b.stripecdn.com/mobile-confirmation-challenge/assets/index.html?v=1";

    /* JADX INFO: renamed from: b */
    public final C0680g0 f8515b;

    public C2130d0(C0680g0 c0680g0) {
        this.f8515b = c0680g0;
    }

    /* JADX INFO: renamed from: a */
    public static Uri m6693a(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        String strM125872R0 = AbstractC39414r.m125872R0(path, '/');
        if (AbstractC22676k.m65745e(strM125872R0, path)) {
            return uri;
        }
        Uri uriBuild = uri.buildUpon().path(strM125872R0).build();
        AbstractC22676k.m65747g(uriBuild);
        return uriBuild;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6694b(String str, String str2) {
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        AbstractC22676k.m65749i(uri, "parse(...)");
        Uri uriM6693a = m6693a(uri);
        Uri uri2 = Uri.parse(str2);
        AbstractC22676k.m65749i(uri2, "parse(...)");
        return uriM6693a.equals(m6693a(uri2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri url;
        CharSequence description;
        Uri url2;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String string = null;
        if (m6694b((webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.toString(), this.f8514a)) {
            if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                string = description.toString();
            }
            if (webResourceError != null) {
                webResourceError.getErrorCode();
            }
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                url.toString();
            }
            this.f8515b.m1680d(new C2123a(string, "generic_resource_error"));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Uri url;
        Uri url2;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (m6694b((webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.toString(), this.f8514a)) {
            String reasonPhrase = webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null;
            if (webResourceResponse != null) {
                webResourceResponse.getStatusCode();
            }
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                url.toString();
            }
            this.f8515b.m1680d(new C2123a(reasonPhrase, "http_error"));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
        if (sslError != null) {
            sslError.getPrimaryError();
        }
        if (sslError != null) {
            sslError.getUrl();
        }
        this.f8515b.m1680d(new C2123a("received ssl error", "ssl_error"));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView != null) {
            webView.getUrl();
        }
        this.f8515b.m1680d(new C2123a("render process crashed", "render_process_gone"));
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i13, String str, String str2) {
        super.onReceivedError(webView, i13, str, str2);
        if (m6694b(str2, this.f8514a)) {
            this.f8515b.m1680d(new C2123a(str, "generic_resource_error"));
        }
    }
}
