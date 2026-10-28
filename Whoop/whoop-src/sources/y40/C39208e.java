package y40;

import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y40.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C39208e extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC22676k.m65750j(consoleMessage, "consoleMessage");
        Log.d("hCaptchaWebView", "[webview] onConsoleMessage " + consoleMessage.message());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView view, int i13) {
        AbstractC22676k.m65750j(view, "view");
        Log.d("hCaptchaWebView", "[webview] onProgressChanged " + i13 + "%");
    }
}
