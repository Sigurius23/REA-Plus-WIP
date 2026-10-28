package com.iterable.iterableapi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.h2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5332h2 extends WebView {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21706w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5332h2(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        this.f21706w = i13;
    }

    /* JADX INFO: renamed from: a */
    public void m16449a(C5379v0 c5379v0, String str) {
        C5336i2 c5336i2 = new C5336i2(0);
        c5336i2.f21712b = c5379v0;
        C5328g2 c5328g2 = new C5328g2();
        c5328g2.f21697b = c5379v0;
        setWebViewClient(c5336i2);
        setWebChromeClient(c5328g2);
        setOverScrollMode(2);
        setBackgroundColor(0);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setJavaScriptEnabled(false);
        try {
            C5381w c5381w = C5341k.f21742r.f21744b;
        } catch (Exception e5) {
            AbstractC12350b.m34581b0("IterableUtilImpl", "Failed to get configured WebView baseURL, using empty default", e5);
        }
        loadDataWithBaseURL("", str, MimeType.MIME_TYPE_HTML, "UTF-8", "");
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f21706w) {
            case 1:
                super.onTouchEvent(motionEvent);
                return false;
            case 2:
                super.onTouchEvent(motionEvent);
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        switch (this.f21706w) {
            case 1:
                super.performClick();
                return false;
            case 2:
                super.performClick();
                return false;
            default:
                return super.performClick();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5332h2(Context context) {
        super(context);
        this.f21706w = 0;
    }
}
