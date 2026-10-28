package com.stripe.android.paymentsheet;

import a20.C0168h;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.lifecycle.C1643y1;
import b30.AbstractActivityC2546j;
import e93.AbstractC12889b;
import h20.AbstractC16632b4;
import h20.C16626a4;
import h20.C16686k4;
import h20.C16733s3;
import h20.C16745u3;
import h20.C16751v3;
import h20.C16757w3;
import h20.C16761x1;
import h20.C16763x3;
import io.sentry.config.AbstractC20301a;
import l83.C23465k;
import l83.C23470p;
import my.C26027a;
import p095dp.AbstractC12240d;
import p179h.AbstractC16348f;
import p522uf.AbstractC34870c0;
import p537ux.C35362x;
import p537ux.C35363y;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivity;", "Lb30/j;", "Lh20/b4;", "<init>", "()V", "", "isProcessing", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentSheetActivity extends AbstractActivityC2546j {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22370z = 0;

    /* JADX INFO: renamed from: w */
    public final C0168h f22371w = new C0168h(new C16733s3(this, 0), 5);

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22372x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16686k4.class), new C16751v3(this, 0), new C16733s3(this, 1), new C16751v3(this, 1));

    /* JADX INFO: renamed from: y */
    public final C23470p f22373y = AbstractC30060g.m92088H(new C16733s3(this, 2));

    @Override // b30.AbstractActivityC2546j, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C16757w3 c16757w3 = (C16757w3) this.f22373y.getValue();
        if (c16757w3 == null) {
            m16861r(new C16626a4(new IllegalArgumentException("PaymentSheet started without arguments.")));
            finish();
            return;
        }
        try {
            C16761x1 c16761x1 = c16757w3.f64383x;
            c16757w3.f64382w.mo829f();
            C26027a c26027aM56345m = AbstractC20301a.m56345m(c16761x1);
            C35363y c35363y = C35363y.f150632y;
            if (c35363y == null) {
                SharedPreferences sharedPreferences = new C35362x(this).f150631a;
                String string = sharedPreferences.getString("key_publishable_key", null);
                c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                if (c35363y == null) {
                    throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                }
                C35363y.f150632y = c35363y;
            }
            c26027aM56345m.m77435b(c16757w3.f64384y, !AbstractC39421y.m125930O(c35363y.f150633w, "pk_test", false));
            AbstractC34870c0.m109996f0(c16761x1.f64405H);
            C16686k4 c16686k4Mo7466o = mo7466o();
            c16686k4Mo7466o.f43006J.m51593a(this, this);
            c16686k4Mo7466o.f64175s0.m35250f(this, this);
            if (!AbstractC12240d.m34077n(this)) {
                mo7466o().f43021Y.m63401a();
            }
            AbstractC16348f.m46559a(this, new C37816b(new C16745u3(this, 2), true, 485212172));
        } catch (IllegalArgumentException e5) {
            m16861r(new C16626a4(e5));
            finish();
        }
    }

    @Override // b30.AbstractActivityC2546j
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final C16686k4 mo7466o() {
        return (C16686k4) this.f22372x.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final void m16861r(AbstractC16632b4 result) {
        AbstractC22676k.m65750j(result, "result");
        setResult(-1, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result", new C16763x3(result)))));
    }
}
