package com.stripe.android.paymentelement.confirmation.cpms;

import android.content.Intent;
import android.os.Bundle;
import c10.AbstractC3830m;
import c10.C3827j;
import c10.C3828k;
import c10.C3829l;
import com.stripe.android.core.exception.LocalStripeException;
import d10.AbstractC11464a;
import e93.AbstractC12889b;
import h20.C16767y1;
import i10.C17854d;
import i10.C17855e;
import i10.C17856f;
import l83.C23465k;
import p098dt.AbstractC12350b;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;", "Lm/m;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CustomPaymentMethodProxyActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: w */
    public boolean f22329w;

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f22329w = bundle.getBoolean("has_confirm_started");
        }
        Bundle extras = getIntent().getExtras();
        C16767y1 c16767y1 = extras != null ? (C16767y1) AbstractC12350b.m34600u(extras, C16767y1.class, "extra_custom_method_type") : null;
        String stringExtra = getIntent().getStringExtra("payment_element_identifier");
        if (extras != null) {
        }
        if (c16767y1 == null || this.f22329w || stringExtra == null) {
            return;
        }
        this.f22329w = true;
        AbstractC11464a.m30761a(stringExtra);
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onResume() {
        Object c17856f;
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        C16767y1 c16767y1 = (C16767y1) AbstractC12350b.m34600u(extras, C16767y1.class, "extra_custom_method_type");
        AbstractC3830m abstractC3830m = (AbstractC3830m) AbstractC12350b.m34600u(extras, AbstractC3830m.class, "custom_payment_method_result");
        if (c16767y1 == null && abstractC3830m == null) {
            finish();
            return;
        }
        if (abstractC3830m != null) {
            if (abstractC3830m instanceof C3828k) {
                c17856f = C17855e.f69477w;
            } else if (abstractC3830m instanceof C3827j) {
                c17856f = C17854d.f69476w;
            } else {
                if (!(abstractC3830m instanceof C3829l)) {
                    throw new NoWhenBranchMatchedException();
                }
                c17856f = new C17856f(new LocalStripeException(((C3829l) abstractC3830m).f15666w, "customPaymentMethodFailure"));
            }
            setResult(-1, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("CUSTOM_PAYMENT_METHOD_RESULT", c17856f))));
            finish();
        }
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC22676k.m65750j(outState, "outState");
        outState.putBoolean("has_confirm_started", this.f22329w);
        super.onSaveInstanceState(outState);
    }
}
