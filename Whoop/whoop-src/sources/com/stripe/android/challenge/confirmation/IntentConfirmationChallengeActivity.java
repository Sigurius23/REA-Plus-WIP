package com.stripe.android.challenge.confirmation;

import a20.C0162b;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1643y1;
import bc3.AbstractC3006f0;
import kotlin.C1991b1;
import p023ay.C2126b0;
import p023ay.C2137k;
import p023ay.C2140n;
import p023ay.C2141o;
import p024b0.C2178b;
import p179h.AbstractC16348f;
import p298l8.C23421d;
import p314m.AbstractActivityC24852m;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;", "Lm/m;", "<init>", "()V", "", "showProgressIndicator", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class IntentConfirmationChallengeActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f22141y = 0;

    /* JADX INFO: renamed from: w */
    public final C23421d f22142w;

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22143x;

    public IntentConfirmationChallengeActivity() {
        C2178b c2178b = new C2178b(2);
        C1991b1 c1991b1 = new C1991b1(17);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c2178b.m6855a(c22673i0.getOrCreateKotlinClass(C2126b0.class), c1991b1);
        this.f22142w = c2178b.m6857c();
        this.f22143x = new C1643y1(c22673i0.getOrCreateKotlinClass(C2126b0.class), new C2141o(this, 0), new C2137k(this, 0), new C2141o(this, 1));
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("intent_confirmation_challenge_args")) {
            finish();
        } else {
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C0162b(this, null, 4), 3);
            AbstractC16348f.m46559a(this, new C37816b(new C2140n(this, 0), true, -1767760193));
        }
    }
}
