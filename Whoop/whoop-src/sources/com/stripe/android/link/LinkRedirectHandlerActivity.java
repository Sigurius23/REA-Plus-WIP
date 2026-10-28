package com.stripe.android.link;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/link/LinkRedirectHandlerActivity;", "Lm/m;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class LinkRedirectHandlerActivity extends AbstractActivityC24852m {
    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        Intent intent = new Intent(this, (Class<?>) LinkForegroundActivity.class);
        intent.setAction("LinkForegroundActivity.redirect");
        intent.setData(data);
        intent.addFlags(603979776);
        startActivity(intent);
        finish();
    }
}
