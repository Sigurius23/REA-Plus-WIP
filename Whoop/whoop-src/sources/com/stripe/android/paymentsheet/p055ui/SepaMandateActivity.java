package com.stripe.android.paymentsheet.p055ui;

import android.content.Intent;
import android.os.Bundle;
import b30.C2643v5;
import b30.C2657x5;
import l83.C23467m;
import p179h.AbstractC16348f;
import p314m.AbstractActivityC24852m;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;", "Lm/m;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class SepaMandateActivity extends AbstractActivityC24852m {
    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object objM107888l;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            AbstractC22676k.m65749i(intent, "getIntent(...)");
            objM107888l = (C2657x5) intent.getParcelableExtra("extra_activity_args");
            if (objM107888l == null) {
                throw new IllegalArgumentException("SepaMandateActivity was started without arguments.");
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        C2657x5 c2657x5 = (C2657x5) objM107888l;
        String str = c2657x5 != null ? c2657x5.f10379w : null;
        if (str == null) {
            finish();
        } else {
            AbstractC29125c.m88513V(getWindow(), false);
            AbstractC16348f.m46559a(this, new C37816b(new C2643v5(this, str, 2), true, 2089289300));
        }
    }
}
