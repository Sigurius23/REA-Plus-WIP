package com.iterable.iterableapi;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.iterable.iterableapi.g2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5328g2 extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21696a = 0;

    /* JADX INFO: renamed from: b */
    public Object f21697b;

    public /* synthetic */ C5328g2() {
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i13) {
        switch (this.f21696a) {
            case 0:
                if (i13 == 100) {
                    ((C5379v0) this.f21697b).m16535G();
                    return;
                }
                return;
            default:
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) this.f21697b;
                ProgressBar progressBar = financialConnectionsSheetLiteActivity.f22172x;
                if (progressBar == null) {
                    AbstractC22676k.m65757q("progressBar");
                    throw null;
                }
                progressBar.setVisibility(i13 < 100 ? 0 : 8);
                ProgressBar progressBar2 = financialConnectionsSheetLiteActivity.f22172x;
                if (progressBar2 != null) {
                    progressBar2.setProgress(i13);
                    return;
                } else {
                    AbstractC22676k.m65757q("progressBar");
                    throw null;
                }
        }
    }

    public C5328g2(FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity) {
        this.f21697b = financialConnectionsSheetLiteActivity;
    }
}
