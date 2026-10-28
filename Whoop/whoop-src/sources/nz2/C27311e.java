package nz2;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nz2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\b\u0010\u0019J-\u0010\n\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\n\u0010\u001cR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R%\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 ¨\u0006)"}, m65681d2 = {"Lnz2/e;", "Landroid/webkit/WebViewClient;", "Lkotlin/Function1;", "", "Ll83/a0;", "onOpenExternalUrl", "Lkotlin/Function0;", "onPageLoaded", "onReceivedError", "", "onReceivedHttpError", "<init>", "(Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/webkit/WebView;", ProfileAnalyticsKt.VIEW, "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "finishedUrl", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceError;", "error", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/WebResourceResponse;", "errorResponse", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "a", "Lkotlin/jvm/functions/Function1;", "getOnOpenExternalUrl", "()Lkotlin/jvm/functions/Function1;", "b", "Lc93/a;", "getOnPageLoaded", "()Lc93/a;", "c", "getOnReceivedError", "d", "getOnReceivedHttpError", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27311e extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onOpenExternalUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a onPageLoaded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 onReceivedError;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1 onReceivedHttpError;

    public C27311e(Function1 onOpenExternalUrl, InterfaceC4339a onPageLoaded, Function1 onReceivedError, Function1 onReceivedHttpError) {
        AbstractC22676k.m65750j(onOpenExternalUrl, "onOpenExternalUrl");
        AbstractC22676k.m65750j(onPageLoaded, "onPageLoaded");
        AbstractC22676k.m65750j(onReceivedError, "onReceivedError");
        AbstractC22676k.m65750j(onReceivedHttpError, "onReceivedHttpError");
        this.onOpenExternalUrl = onOpenExternalUrl;
        this.onPageLoaded = onPageLoaded;
        this.onReceivedError = onReceivedError;
        this.onReceivedHttpError = onReceivedHttpError;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String finishedUrl) {
        super.onPageFinished(view, finishedUrl);
        this.onPageLoaded.invoke();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(error, "error");
        if (request.isForMainFrame() || error.getErrorCode() == -6 || error.getErrorCode() == -2) {
            view.stopLoading();
            this.onReceivedError.invoke(error.getDescription().toString());
        }
        super.onReceivedError(view, request, error);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        if (request == null || !request.isForMainFrame()) {
            return;
        }
        if (AbstractC22676k.m65745e(request.getUrl().toString(), String.valueOf(view != null ? view.getUrl() : null))) {
            if (errorResponse == null || errorResponse.getStatusCode() != 200) {
                this.onReceivedHttpError.invoke(errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri url;
        if (request == null || (url = request.getUrl()) == null) {
            return false;
        }
        Function1 function1 = this.onOpenExternalUrl;
        String string = url.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        function1.invoke(string);
        return true;
    }
}
