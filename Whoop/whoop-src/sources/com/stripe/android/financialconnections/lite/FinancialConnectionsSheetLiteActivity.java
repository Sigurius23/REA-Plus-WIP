package com.stripe.android.financialconnections.lite;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1643y1;
import bc3.AbstractC3006f0;
import com.iterable.iterableapi.C5328g2;
import com.iterable.iterableapi.C5336i2;
import com.whoop.android.R;
import java.util.WeakHashMap;
import kz.AbstractC22907d;
import kz.EnumC22912i;
import live.hms.video.factories.C24148c;
import lt2.C24738a;
import p161g.AbstractActivityC14909l;
import p161g.C14895a0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p279kd.C22379f;
import p313lz.AbstractC24813j;
import p313lz.C24812i;
import p313lz.C24815l;
import p479s4.AbstractC32122c;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;", "Lg/l;", "<init>", "()V", "financial-connections-lite_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class FinancialConnectionsSheetLiteActivity extends AbstractActivityC14909l {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22170z = 0;

    /* JADX INFO: renamed from: w */
    public WebView f22171w;

    /* JADX INFO: renamed from: x */
    public ProgressBar f22172x;

    /* JADX INFO: renamed from: y */
    public final C1643y1 f22173y;

    public FinancialConnectionsSheetLiteActivity() {
        super(0);
        this.f22173y = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24812i.class), new C24815l(this, 0), new C24738a(3), new C24815l(this, 1));
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        int i13;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            int i14 = 1;
            if (extras.containsKey("FinancialConnectionsSheetActivityArgs")) {
                setContentView(R.layout.stripe_activity_lite);
                this.f22171w = (WebView) findViewById(R.id.webView);
                this.f22172x = (ProgressBar) findViewById(R.id.progressBar);
                int i15 = 2;
                if (Build.VERSION.SDK_INT >= 30) {
                    AbstractC29125c.m88513V(getWindow(), false);
                    View viewFindViewById = findViewById(android.R.id.content);
                    C24148c c24148c = new C24148c(i15);
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    AbstractC16877h0.m47517l(viewFindViewById, c24148c);
                }
                Intent intent2 = getIntent();
                AbstractC22676k.m65749i(intent2, "getIntent(...)");
                AbstractC22907d abstractC22907d = (AbstractC22907d) intent2.getParcelableExtra("FinancialConnectionsSheetActivityArgs");
                InterfaceC30057d interfaceC30057d = null;
                EnumC22912i enumC22912iM108206N = abstractC22907d != null ? AbstractC34235f.m108206N(abstractC22907d) : null;
                int i16 = enumC22912iM108206N == null ? -1 : AbstractC24813j.f97142a[enumC22912iM108206N.ordinal()];
                if (i16 == -1 || i16 == 1 || i16 == 2) {
                    i13 = R.color.stripe_financial_connections;
                } else {
                    if (i16 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = R.color.stripe_link;
                }
                int color = AbstractC32122c.getColor(this, i13);
                ProgressBar progressBar = this.f22172x;
                if (progressBar == null) {
                    AbstractC22676k.m65757q("progressBar");
                    throw null;
                }
                progressBar.getProgressDrawable().setTint(color);
                ProgressBar progressBar2 = this.f22172x;
                if (progressBar2 == null) {
                    AbstractC22676k.m65757q("progressBar");
                    throw null;
                }
                progressBar2.getIndeterminateDrawable().setTint(color);
                ProgressBar progressBar3 = this.f22172x;
                if (progressBar3 == null) {
                    AbstractC22676k.m65757q("progressBar");
                    throw null;
                }
                progressBar3.setVisibility(0);
                WebView webView = this.f22171w;
                if (webView == null) {
                    AbstractC22676k.m65757q("webView");
                    throw null;
                }
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.setWebChromeClient(new C5328g2(this));
                webView.setWebViewClient(new C5336i2(this));
                getOnBackPressedDispatcher().m43015a(this, new C14895a0(this, i14));
                AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C22379f(this, interfaceC30057d, 8), 3);
                return;
            }
        }
        finish();
    }
}
