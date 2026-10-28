package com.stripe.android.financialconnections.lite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p161g.AbstractActivityC14909l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteRedirectActivity;", "Lg/l;", "<init>", "()V", "financial-connections-lite_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class FinancialConnectionsSheetLiteRedirectActivity extends AbstractActivityC14909l {
    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent flags;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            Class<FinancialConnectionsSheetLiteActivity> cls = !AbstractC22676k.m65745e(data.getScheme(), "stripe") ? null : FinancialConnectionsSheetLiteActivity.class;
            Intent intent = cls != null ? new Intent(this, cls) : null;
            if (intent == null || (flags = intent.setFlags(603979776)) == null) {
                return;
            }
            flags.setData(data);
            startActivity(flags);
        }
    }
}
