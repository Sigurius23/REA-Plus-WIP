package y40;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.RunnableC1283d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m83.AbstractC25265s;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import u40.C34530f;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: y40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C39209f extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final Handler f168501a;

    /* JADX INFO: renamed from: b */
    public final C34530f f168502b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29938w0 f168503c;

    public C39209f(C29938w0 c29938w0, Handler handler, C34530f c34530f) {
        this.f168503c = c29938w0;
        this.f168501a = handler;
        this.f168502b = c34530f;
    }

    /* JADX INFO: renamed from: a */
    public static String m124889a(String str) {
        List listM118958J;
        Collection collectionM74156w1;
        if (str == null) {
            return "null";
        }
        Pattern patternCompile = Pattern.compile("[?#]");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        AbstractC39414r.m125903v0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listM118958J = arrayList;
        } else {
            listM118958J = AbstractC37056f.m118958J(str.toString());
        }
        if (!listM118958J.isEmpty()) {
            ListIterator listIterator = listM118958J.listIterator(listM118958J.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionM74156w1 = C25271y.f99162w;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionM74156w1 = AbstractC25265s.m74156w1(listM118958J, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            collectionM74156w1 = C25271y.f99162w;
            break;
        }
        String strM8299l = AbstractC2875y.m8299l(((String[]) collectionM74156w1.toArray(new String[0]))[0], "...");
        return strM8299l == null ? "null" : strM8299l;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Log.d("hCaptchaWebView", "[webview] onLoadResource ".concat(m124889a(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Log.d("hCaptchaWebView", "[webview] onPageFinished ".concat(m124889a(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Log.d("hCaptchaWebView", "[webview] onPageStarted ".concat(m124889a(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC22676k.m65750j(view, "view");
        super.onReceivedError(view, webResourceRequest, webResourceError);
        CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
        Log.d("hCaptchaWebView", "[webview] onReceivedError \"" + ((Object) description) + "\" (" + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null) + ")");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Log.d("hCaptchaWebView", "[webview] onReceivedHttpError");
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(request, "request");
        Uri url = request.getUrl();
        if (url != null && url.getScheme() != null && AbstractC22676k.m65745e(url.getScheme(), "http")) {
            this.f168501a.post(new RunnableC1283d(this.f168503c, this, url, 22));
        }
        return super.shouldInterceptRequest(view, request);
    }
}
