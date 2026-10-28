package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import d10.AbstractC11464a;
import h20.AbstractC16723r;
import h20.C16705o;
import h20.C16711p;
import h20.C16717q;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;", "Lm/m;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ExternalPaymentMethodProxyActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: w */
    public boolean f22365w;

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f22365w = bundle.getBoolean("has_confirm_started");
        }
        String stringExtra = getIntent().getStringExtra("external_payment_method_type");
        String stringExtra2 = getIntent().getStringExtra("payment_element_identifier");
        if (stringExtra == null || this.f22365w || stringExtra2 == null) {
            return;
        }
        this.f22365w = true;
        AbstractC11464a.m30761a(stringExtra2);
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("external_payment_method_type");
        AbstractC16723r abstractC16723r = (AbstractC16723r) getIntent().getParcelableExtra("external_payment_method_result");
        if (stringExtra == null && abstractC16723r == null) {
            finish();
            return;
        }
        if (abstractC16723r != null) {
            if (abstractC16723r instanceof C16711p) {
                setResult(-1);
            } else if (abstractC16723r instanceof C16705o) {
                setResult(0);
            } else {
                if (!(abstractC16723r instanceof C16717q)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intent intentPutExtra = new Intent().putExtra("external_payment_method_error_message", ((C16717q) abstractC16723r).f64255w);
                AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
                setResult(1, intentPutExtra);
            }
            finish();
        }
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC22676k.m65750j(outState, "outState");
        outState.putBoolean("has_confirm_started", this.f22365w);
        super.onSaveInstanceState(outState);
    }
}
