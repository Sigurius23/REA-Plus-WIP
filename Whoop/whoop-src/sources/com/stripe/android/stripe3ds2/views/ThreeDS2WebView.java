package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iterable.iterableapi.C5336i2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t30.InterfaceC33524z;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "Landroid/webkit/WebView;", "Landroid/webkit/WebViewClient;", "client", "Ll83/a0;", "setWebViewClient", "(Landroid/webkit/WebViewClient;)V", "Lt30/z;", "listener", "setOnHtmlSubmitListener$3ds2sdk_release", "(Lt30/z;)V", "setOnHtmlSubmitListener", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ThreeDS2WebView extends WebView {

    /* JADX INFO: renamed from: w */
    public final C5336i2 f22463w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        C5336i2 c5336i2 = new C5336i2(2);
        this.f22463w = c5336i2;
        WebSettings settings = getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setBlockNetworkImage(true);
        settings.setBlockNetworkLoads(true);
        super.setWebViewClient(c5336i2);
    }

    public final void setOnHtmlSubmitListener$3ds2sdk_release(InterfaceC33524z listener) {
        this.f22463w.f21712b = listener;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient client) {
        AbstractC22676k.m65750j(client, "client");
    }
}
