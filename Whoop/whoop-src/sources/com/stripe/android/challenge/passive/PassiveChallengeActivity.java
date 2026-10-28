package com.stripe.android.challenge.passive;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1643y1;
import bc3.AbstractC3006f0;
import p078d1.C11456i;
import p102dy.C12432a;
import p102dy.C12433b;
import p102dy.C12441j;
import p298l8.C23421d;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;", "Lm/m;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PassiveChallengeActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f22144y = 0;

    /* JADX INFO: renamed from: w */
    public final C23421d f22145w = C12441j.f42379E;

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22146x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12441j.class), new C12433b(this, 0), new C11456i(this, 10), new C12433b(this, 1));

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("passive_challenge_args")) {
            finish();
            return;
        }
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C12432a(this, interfaceC30057d, 0), 3);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C12432a(this, interfaceC30057d, 1), 3);
    }
}
