package com.stripe.android.link;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p217ib.C18312i;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/link/LinkForegroundActivity;", "Lm/m;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class LinkForegroundActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f22201x = 0;

    /* JADX INFO: renamed from: w */
    public boolean f22202w;

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22202w = bundle != null ? bundle.getBoolean("LinkHasLaunchedPopup") : false;
        Intent intent = getIntent();
        AbstractC22676k.m65749i(intent, "getIntent(...)");
        if (AbstractC22676k.m65745e(intent.getAction(), "LinkForegroundActivity.redirect")) {
            setResult(49871, intent);
            finish();
        }
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        super.onNewIntent(intent);
        if (AbstractC22676k.m65745e(intent.getAction(), "LinkForegroundActivity.redirect")) {
            setResult(49871, intent);
            finish();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onResume() {
        String string;
        super.onResume();
        if (isFinishing()) {
            return;
        }
        if (this.f22202w) {
            setResult(0);
            finish();
            return;
        }
        this.f22202w = true;
        Bundle extras = getIntent().getExtras();
        Uri uri = (extras == null || (string = extras.getString("LinkPopupUrl")) == null) ? null : Uri.parse(string);
        if (uri == null) {
            setResult(0);
            finish();
            return;
        }
        try {
            C18312i c18312i = new C18312i();
            c18312i.m52717d();
            c18312i.m52714a().m91499h(this, uri);
        } catch (ActivityNotFoundException e5) {
            setResult(91367, new Intent().putExtra("LinkFailure", e5));
            finish();
        }
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC22676k.m65750j(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("LinkHasLaunchedPopup", this.f22202w);
    }
}
