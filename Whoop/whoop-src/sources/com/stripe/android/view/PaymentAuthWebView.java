package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p664yy.AbstractC39856e0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rx0.C31901f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/stripe/android/view/PaymentAuthWebView;", "Landroid/webkit/WebView;", "Lkotlin/Function0;", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lc93/a;", "getOnLoadBlank$payments_core_release", "()Lc93/a;", "setOnLoadBlank$payments_core_release", "(Lc93/a;)V", "onLoadBlank", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentAuthWebView extends WebView {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f22549x = 0;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public InterfaceC4339a onLoadBlank;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        this.onLoadBlank = new C31901f(25);
        String str = AbstractC39856e0.f172127a;
        String strConcat = "Stripe/v1 ".concat("AndroidBindings/22.6.1");
        WebSettings settings = getSettings();
        String userAgentString = getSettings().getUserAgentString();
        settings.setUserAgentString((userAgentString == null ? "" : userAgentString) + " [" + strConcat + "]");
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowContentAccess(false);
        getSettings().setDomStorageEnabled(true);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        clearHistory();
        this.onLoadBlank.invoke();
        loadUrl("about:blank");
        onPause();
        removeAllViews();
        destroyDrawingCache();
        super.destroy();
    }

    /* JADX INFO: renamed from: getOnLoadBlank$payments_core_release, reason: from getter */
    public final InterfaceC4339a getOnLoadBlank() {
        return this.onLoadBlank;
    }

    public final void setOnLoadBlank$payments_core_release(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.onLoadBlank = interfaceC4339a;
    }
}
