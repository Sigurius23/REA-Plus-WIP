package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import com.stripe.android.core.exception.StripeException;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import v10.C35526b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/view/PaymentRelayActivity;", "Lm/m;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentRelayActivity extends AbstractActivityC24852m {
    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C35526b c35526b;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (c35526b = (C35526b) intent.getParcelableExtra("extra_args")) == null) {
            c35526b = new C35526b((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127);
        }
        setResult(-1, new Intent().putExtras(c35526b.m112682b()));
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
