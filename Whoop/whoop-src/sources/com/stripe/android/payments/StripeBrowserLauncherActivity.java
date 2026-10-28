package com.stripe.android.payments;

import al0.C0971f;
import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.lifecycle.C1643y1;
import b10.C2222b;
import b20.C2321a;
import b20.EnumC2323c;
import bc3.AbstractC3050q0;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import java.util.Map;
import java.util.WeakHashMap;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.AbstractC25247g0;
import m83.C25235a0;
import m83.C25272z;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p217ib.C18312i;
import p236j.AbstractC21065d;
import p314m.AbstractActivityC24852m;
import p442qy.C30765d;
import p442qy.C30766e;
import p472ry.EnumC31905a;
import p479s4.AbstractC32123d;
import p537ux.C35331f0;
import p600x.C37786a;
import p663yx.C39838b;
import p664yy.C39865j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import s93.AbstractC32309k;
import ut2.C35231a;
import v10.C35526b;
import v10.C35540p;
import v10.C35541q;
import v10.C35542r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherActivity;", "Lm/m;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class StripeBrowserLauncherActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f22350x = 0;

    /* JADX INFO: renamed from: w */
    public final C1643y1 f22351w = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35542r.class), new C35541q(this, 0), new C35231a(21), new C35541q(this, 1));

    /* JADX INFO: renamed from: o */
    public final void m16855o(C39838b c39838b) {
        Uri uri = Uri.parse(c39838b.f172029z);
        Intent intent = new Intent();
        String str = c39838b.f172028y;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String str2 = c39838b.f172018H;
        Intent intentPutExtras = intent.putExtras(new C35526b(str, 0, (StripeException) null, c39838b.f172019I, lastPathSegment, str2, 38).m112682b());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        setResult(-1, intentPutExtras);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        Intent intent;
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        AbstractC22676k.m65749i(intent2, "getIntent(...)");
        C39838b c39838b = (C39838b) intent2.getParcelableExtra("extra_args");
        int i13 = 1;
        Map mapM7173b = C25272z.f99163w;
        C30765d c30765d = C30766e.f126697b;
        C25235a0 c25235a0 = C25235a0.f99113w;
        if (c39838b == null) {
            finish();
            Context applicationContext = getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            Context applicationContext2 = applicationContext.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext2, "getApplicationContext(...)");
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            AbstractC32309k.m100574c(executorC22364d);
            C39865j c39865j = new C39865j(c30765d, executorC22364d);
            C2222b c2222b = new C2222b(applicationContext2, c25235a0, new C0971f(applicationContext2, i13));
            EnumC2323c enumC2323c = EnumC2323c.BROWSER_LAUNCHER_NULL_ARGS;
            Map additionalNonPiiParams = (6 & 4) != 0 ? mapM7173b : null;
            AbstractC22676k.m65750j(additionalNonPiiParams, "additionalNonPiiParams");
            c39865j.m127938a(c2222b.mo7052a(enumC2323c, AbstractC25247g0.m73995d0(mapM7173b, additionalNonPiiParams)));
            return;
        }
        C1643y1 c1643y1 = this.f22351w;
        Boolean bool = (Boolean) ((C35542r) c1643y1.getValue()).f151203E.m5001b("has_launched");
        if (bool != null ? bool.booleanValue() : false) {
            m16855o(c39838b);
        } else {
            AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new C35540p(0, this, c39838b));
            C35542r c35542r = (C35542r) c1643y1.getValue();
            String str = c39838b.f172029z;
            Uri uri = Uri.parse(str);
            EnumC31905a enumC31905a = c35542r.f151206y;
            int iOrdinal = enumC31905a.ordinal();
            if (iOrdinal == 0) {
                paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithCustomTabs;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithDefaultBrowser;
            }
            c35542r.f151204w.m127938a(C2222b.m7051c(c35542r.f151205x, paymentAnalyticsEvent, null, null, null, null, 62));
            int iOrdinal2 = enumC31905a.ordinal();
            if (iOrdinal2 == 0) {
                AbstractC22676k.m65747g(uri);
                Integer num = c39838b.f172021K;
                C37786a c37786a = num != null ? new C37786a(Integer.valueOf(num.intValue() | (-16777216))) : null;
                C18312i c18312i = new C18312i();
                c18312i.m52717d();
                if (c37786a != null) {
                    c18312i.f71291f = c37786a.m121288c();
                }
                intent = (Intent) c18312i.m52714a().f122095w;
                intent.setData(uri);
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                intent = new Intent("android.intent.action.VIEW", uri);
            }
            try {
                abstractC21065dRegisterForActivityResult.mo4052a(intent, null);
                ((C35542r) c1643y1.getValue()).f151203E.m5004e(Boolean.TRUE, "has_launched");
            } catch (ActivityNotFoundException e5) {
                Context applicationContext3 = getApplicationContext();
                AbstractC22676k.m65749i(applicationContext3, "getApplicationContext(...)");
                Context applicationContext4 = applicationContext3.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext4, "getApplicationContext(...)");
                C22365e c22365e2 = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d2 = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d2);
                C39865j c39865j2 = new C39865j(c30765d, executorC22364d2);
                C2222b c2222b2 = new C2222b(applicationContext4, c25235a0, new C0971f(applicationContext4, i13));
                EnumC2323c enumC2323c2 = EnumC2323c.BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND;
                int i14 = StripeException.f22154E;
                StripeException stripeExceptionM100024d = AbstractC32123d.m100024d(e5);
                if ((4 & 2) != 0) {
                    stripeExceptionM100024d = null;
                }
                Map additionalNonPiiParams2 = (4 & 4) != 0 ? mapM7173b : null;
                AbstractC22676k.m65750j(additionalNonPiiParams2, "additionalNonPiiParams");
                if (stripeExceptionM100024d != null) {
                    mapM7173b = C2321a.m7173b(stripeExceptionM100024d);
                }
                c39865j2.m127938a(c2222b2.mo7052a(enumC2323c2, AbstractC25247g0.m73995d0(mapM7173b, additionalNonPiiParams2)));
                C35542r c35542r2 = (C35542r) c1643y1.getValue();
                Uri uri2 = Uri.parse(str);
                LocalStripeException localStripeException = new LocalStripeException(c35542r2.f151207z, "failedBrowserLaunchError");
                Intent intent3 = new Intent();
                String str2 = c39838b.f172028y;
                String lastPathSegment = uri2.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "";
                }
                Intent intentPutExtras = intent3.putExtras(new C35526b(str2, 2, localStripeException, c39838b.f172019I, lastPathSegment, c39838b.f172018H, 32).m112682b());
                AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
                setResult(-1, intentPutExtras);
                finish();
            }
        }
        AbstractC29125c.m88513V(getWindow(), false);
        View viewFindViewById = findViewById(R.id.content);
        C35331f0 c35331f0 = new C35331f0(1);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(viewFindViewById, c35331f0);
    }
}
