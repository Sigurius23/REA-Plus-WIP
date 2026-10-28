package com.stripe.android.attestation;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1643y1;
import bc3.AbstractC3006f0;
import p298l8.C23421d;
import p314m.AbstractActivityC24852m;
import p597wx.C37672a;
import p597wx.C37681j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import sz.C33151q;
import vv1.C36532c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/attestation/AttestationActivity;", "Lm/m;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AttestationActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f22138y = 0;

    /* JADX INFO: renamed from: w */
    public final C23421d f22139w = C37681j.f161439F;

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22140x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37681j.class), new C37672a(this, 0), new C36532c(this, 15), new C37672a(this, 1));

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("attestation_args")) {
            finish();
        } else {
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C33151q(this, null, 14), 3);
        }
    }
}
