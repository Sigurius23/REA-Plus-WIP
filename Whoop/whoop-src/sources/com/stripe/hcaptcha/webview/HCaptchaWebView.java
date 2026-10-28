package com.stripe.hcaptcha.webview;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.webkit.WebView;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "hcaptcha_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class HCaptchaWebView extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCaptchaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        if (AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper())) {
            return super.onCheckIsTextEditor();
        }
        return false;
    }

    @Override // android.view.View
    public final ContentInfo onReceiveContent(ContentInfo payload) {
        AbstractC22676k.m65750j(payload, "payload");
        Log.d("TEST", "got content");
        return super.onReceiveContent(payload);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return false;
    }
}
