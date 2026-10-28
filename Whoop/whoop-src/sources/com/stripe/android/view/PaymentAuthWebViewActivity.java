package com.stripe.android.view;

import al0.C0971f;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1643y1;
import b10.C2222b;
import b20.EnumC2323c;
import b20.EnumC2325e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import java.util.Map;
import java.util.WeakHashMap;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23470p;
import m83.AbstractC25247g0;
import m83.C25235a0;
import m83.C25272z;
import o73.C27648a;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p235iz.C21040d;
import p314m.AbstractActivityC24852m;
import p442qy.C30765d;
import p442qy.C30766e;
import p663yx.C39838b;
import p664yy.C39849b;
import p664yy.C39865j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q00.C29718h0;
import q80.C30036h;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qa.C30097b;
import rq0.C31703x;
import s30.AbstractC32100b;
import s40.C32139c0;
import s40.C32170o0;
import s40.C32174q0;
import s40.C32178s0;
import s40.C32180t0;
import s40.C32182u0;
import s93.AbstractC32309k;
import v10.C35526b;
import y00.C38899m6;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivity;", "Lm/m;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentAuthWebViewActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ int f22551E = 0;

    /* JADX INFO: renamed from: w */
    public final C23470p f22552w;

    /* JADX INFO: renamed from: x */
    public final C23470p f22553x;

    /* JADX INFO: renamed from: y */
    public final C23470p f22554y;

    /* JADX INFO: renamed from: z */
    public final C1643y1 f22555z;

    public PaymentAuthWebViewActivity() {
        final int i13 = 0;
        this.f22552w = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: s40.p0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PaymentAuthWebViewActivity f133252x;

            {
                this.f133252x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = i13;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.f133252x;
                switch (i14) {
                    case 0:
                        int i15 = PaymentAuthWebViewActivity.f22551E;
                        return C21040d.m58781a(paymentAuthWebViewActivity.getLayoutInflater());
                    case 1:
                        int i16 = PaymentAuthWebViewActivity.f22551E;
                        Intent intent = paymentAuthWebViewActivity.getIntent();
                        AbstractC22676k.m65749i(intent, "getIntent(...)");
                        return (C39838b) intent.getParcelableExtra("extra_args");
                    case 2:
                        int i17 = PaymentAuthWebViewActivity.f22551E;
                        C39838b c39838b = (C39838b) paymentAuthWebViewActivity.f22553x.getValue();
                        return (c39838b == null || !c39838b.f172016F) ? C30766e.f126697b : C30766e.f126696a;
                    default:
                        int i18 = PaymentAuthWebViewActivity.f22551E;
                        Application application = paymentAuthWebViewActivity.getApplication();
                        AbstractC22676k.m65749i(application, "getApplication(...)");
                        C30765d c30765dM16919p = paymentAuthWebViewActivity.m16919p();
                        C39838b c39838b2 = (C39838b) paymentAuthWebViewActivity.f22553x.getValue();
                        if (c39838b2 != null) {
                            return new C32176r0(application, c30765dM16919p, c39838b2);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i14 = 1;
        this.f22553x = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: s40.p0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PaymentAuthWebViewActivity f133252x;

            {
                this.f133252x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i15 = i14;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.f133252x;
                switch (i15) {
                    case 0:
                        int i16 = PaymentAuthWebViewActivity.f22551E;
                        return C21040d.m58781a(paymentAuthWebViewActivity.getLayoutInflater());
                    case 1:
                        int i17 = PaymentAuthWebViewActivity.f22551E;
                        Intent intent = paymentAuthWebViewActivity.getIntent();
                        AbstractC22676k.m65749i(intent, "getIntent(...)");
                        return (C39838b) intent.getParcelableExtra("extra_args");
                    case 2:
                        int i18 = PaymentAuthWebViewActivity.f22551E;
                        C39838b c39838b = (C39838b) paymentAuthWebViewActivity.f22553x.getValue();
                        return (c39838b == null || !c39838b.f172016F) ? C30766e.f126697b : C30766e.f126696a;
                    default:
                        int i19 = PaymentAuthWebViewActivity.f22551E;
                        Application application = paymentAuthWebViewActivity.getApplication();
                        AbstractC22676k.m65749i(application, "getApplication(...)");
                        C30765d c30765dM16919p = paymentAuthWebViewActivity.m16919p();
                        C39838b c39838b2 = (C39838b) paymentAuthWebViewActivity.f22553x.getValue();
                        if (c39838b2 != null) {
                            return new C32176r0(application, c30765dM16919p, c39838b2);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i15 = 2;
        this.f22554y = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: s40.p0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PaymentAuthWebViewActivity f133252x;

            {
                this.f133252x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i16 = i15;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.f133252x;
                switch (i16) {
                    case 0:
                        int i17 = PaymentAuthWebViewActivity.f22551E;
                        return C21040d.m58781a(paymentAuthWebViewActivity.getLayoutInflater());
                    case 1:
                        int i18 = PaymentAuthWebViewActivity.f22551E;
                        Intent intent = paymentAuthWebViewActivity.getIntent();
                        AbstractC22676k.m65749i(intent, "getIntent(...)");
                        return (C39838b) intent.getParcelableExtra("extra_args");
                    case 2:
                        int i19 = PaymentAuthWebViewActivity.f22551E;
                        C39838b c39838b = (C39838b) paymentAuthWebViewActivity.f22553x.getValue();
                        return (c39838b == null || !c39838b.f172016F) ? C30766e.f126697b : C30766e.f126696a;
                    default:
                        int i110 = PaymentAuthWebViewActivity.f22551E;
                        Application application = paymentAuthWebViewActivity.getApplication();
                        AbstractC22676k.m65749i(application, "getApplication(...)");
                        C30765d c30765dM16919p = paymentAuthWebViewActivity.m16919p();
                        C39838b c39838b2 = (C39838b) paymentAuthWebViewActivity.f22553x.getValue();
                        if (c39838b2 != null) {
                            return new C32176r0(application, c30765dM16919p, c39838b2);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i16 = 3;
        this.f22555z = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32180t0.class), new C32174q0(this, 0), new InterfaceC4339a(this) { // from class: s40.p0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PaymentAuthWebViewActivity f133252x;

            {
                this.f133252x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i17 = i16;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.f133252x;
                switch (i17) {
                    case 0:
                        int i18 = PaymentAuthWebViewActivity.f22551E;
                        return C21040d.m58781a(paymentAuthWebViewActivity.getLayoutInflater());
                    case 1:
                        int i19 = PaymentAuthWebViewActivity.f22551E;
                        Intent intent = paymentAuthWebViewActivity.getIntent();
                        AbstractC22676k.m65749i(intent, "getIntent(...)");
                        return (C39838b) intent.getParcelableExtra("extra_args");
                    case 2:
                        int i110 = PaymentAuthWebViewActivity.f22551E;
                        C39838b c39838b = (C39838b) paymentAuthWebViewActivity.f22553x.getValue();
                        return (c39838b == null || !c39838b.f172016F) ? C30766e.f126697b : C30766e.f126696a;
                    default:
                        int i111 = PaymentAuthWebViewActivity.f22551E;
                        Application application = paymentAuthWebViewActivity.getApplication();
                        AbstractC22676k.m65749i(application, "getApplication(...)");
                        C30765d c30765dM16919p = paymentAuthWebViewActivity.m16919p();
                        C39838b c39838b2 = (C39838b) paymentAuthWebViewActivity.f22553x.getValue();
                        if (c39838b2 != null) {
                            return new C32176r0(application, c30765dM16919p, c39838b2);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        }, new C32174q0(this, 1));
    }

    /* JADX INFO: renamed from: o */
    public final void m16918o() {
        C32180t0 c32180t0M16921s = m16921s();
        Intent intent = new Intent();
        String str = c32180t0M16921s.m100108g().f151153w;
        C39838b c39838b = c32180t0M16921s.f133272w;
        int i13 = c39838b.f172020J ? 3 : 0;
        StripeException stripeException = c32180t0M16921s.m100108g().f151155y;
        boolean z4 = c39838b.f172019I;
        String str2 = c32180t0M16921s.m100108g().f151150E;
        c32180t0M16921s.m100108g();
        Intent intentPutExtras = intent.putExtras(new C35526b(str, i13, stripeException, z4, str2, (C38899m6) null, c32180t0M16921s.m100108g().f151152G).m112682b());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        setResult(-1, intentPutExtras);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r6v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC29125c.m88513V(getWindow(), false);
        CoordinatorLayout coordinatorLayout = m16920r().f79773a;
        C30097b c30097b = new C30097b(28);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(coordinatorLayout, c30097b);
        C39838b c39838b = (C39838b) this.f22553x.getValue();
        int i13 = 1;
        C25272z c25272z = C25272z.f99163w;
        ?? additionalNonPiiParams = 0;
        C30765d c30765d = C30766e.f126697b;
        C25235a0 c25235a0 = C25235a0.f99113w;
        if (c39838b == null) {
            setResult(0);
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
            EnumC2323c enumC2323c = EnumC2323c.AUTH_WEB_VIEW_NULL_ARGS;
            C25272z additionalNonPiiParams2 = (6 & 4) != 0 ? c25272z : null;
            AbstractC22676k.m65750j(additionalNonPiiParams2, "additionalNonPiiParams");
            c39865j.m127938a(c2222b.mo7052a(enumC2323c, AbstractC25247g0.m73995d0(c25272z, additionalNonPiiParams2)));
            return;
        }
        m16919p().m94511a("PaymentAuthWebViewActivity#onCreate()");
        setContentView(m16920r().f79773a);
        setSupportActionBar(m16920r().f79775c);
        m16919p().m94511a("PaymentAuthWebViewActivity#customizeToolbar()");
        C32178s0 c32178s0 = m16921s().f133270F;
        if (c32178s0 != null) {
            m16919p().m94511a("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            m16920r().f79775c.setTitle(AbstractC32100b.m99858c(this, c32178s0.f133265a, c32178s0.f133266b));
        }
        String str = m16921s().f133271G;
        if (str != null) {
            m16919p().m94511a("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
            int color = Color.parseColor(str);
            m16920r().f79775c.setBackgroundColor(color);
            if (Build.VERSION.SDK_INT <= 34) {
                getWindow().setStatusBarColor(color);
            }
        }
        C27648a.m83591n(getOnBackPressedDispatcher(), null, new C31703x(this, 9), 3);
        String str2 = c39838b.f172028y;
        Intent intentPutExtras = new Intent().putExtras(m16921s().m100108g().m112682b());
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        setResult(-1, intentPutExtras);
        if (AbstractC39414r.m125890i0(str2)) {
            m16919p().m94511a("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
            Context applicationContext3 = getApplicationContext();
            AbstractC22676k.m65749i(applicationContext3, "getApplicationContext(...)");
            Context applicationContext4 = applicationContext3.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext4, "getApplicationContext(...)");
            C22365e c22365e2 = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d2 = ExecutorC22364d.f87316w;
            AbstractC32309k.m100574c(executorC22364d2);
            C39865j c39865j2 = new C39865j(c30765d, executorC22364d2);
            C2222b c2222b2 = new C2222b(applicationContext4, c25235a0, new C0971f(applicationContext4, i13));
            EnumC2325e enumC2325e = EnumC2325e.AUTH_WEB_VIEW_BLANK_CLIENT_SECRET;
            additionalNonPiiParams = (6 & 4) != 0 ? c25272z : 0;
            AbstractC22676k.m65750j(additionalNonPiiParams, "additionalNonPiiParams");
            c39865j2.m127938a(c2222b2.mo7052a(enumC2325e, AbstractC25247g0.m73995d0(c25272z, additionalNonPiiParams)));
            return;
        }
        m16919p().m94511a("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C32139c0(c13045h2M36593c, this, (InterfaceC30057d) additionalNonPiiParams, i13), 3);
        int i14 = 0;
        int i15 = 1;
        C32182u0 c32182u0 = new C32182u0(m16919p(), c13045h2M36593c, str2, c39838b.f172015E, new C29718h0(i15, this, PaymentAuthWebViewActivity.class, "startActivity", "startActivity(Landroid/content/Intent;)V", i14, 6), new C29718h0(i15, this, PaymentAuthWebViewActivity.class, "onAuthComplete", "onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V", i14, 7));
        m16920r().f79776d.setOnLoadBlank$payments_core_release(new C30036h(c32182u0, 27));
        m16920r().f79776d.setWebViewClient(c32182u0);
        m16920r().f79776d.setWebChromeClient(new C32170o0(this, m16919p()));
        C32180t0 c32180t0M16921s = m16921s();
        C39849b c39849bM7051c = C2222b.m7051c(c32180t0M16921s.f133274y, PaymentAnalyticsEvent.Auth3ds1ChallengeStart, null, null, null, null, 62);
        C39865j c39865j3 = c32180t0M16921s.f133273x;
        c39865j3.m127938a(c39849bM7051c);
        c39865j3.m127938a(C2222b.m7051c(c32180t0M16921s.f133274y, PaymentAnalyticsEvent.AuthWithWebView, null, null, null, null, 62));
        m16920r().f79776d.loadUrl(c39838b.f172029z, (Map) m16921s().f133275z.getValue());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        m16919p().m94511a("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(R.menu.stripe_payment_auth_web_view_menu, menu);
        String str = m16921s().f133269E;
        if (str != null) {
            m16919p().m94511a("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            menu.findItem(R.id.action_close).setTitle(str);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onDestroy() {
        m16920r().f79777e.removeAllViews();
        m16920r().f79776d.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        AbstractC22676k.m65750j(item, "item");
        m16919p().m94511a("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (item.getItemId() != R.id.action_close) {
            return super.onOptionsItemSelected(item);
        }
        m16918o();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final C30765d m16919p() {
        return (C30765d) this.f22554y.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final C21040d m16920r() {
        return (C21040d) this.f22552w.getValue();
    }

    /* JADX INFO: renamed from: s */
    public final C32180t0 m16921s() {
        return (C32180t0) this.f22555z.getValue();
    }
}
