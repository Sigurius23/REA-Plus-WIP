package com.stripe.android.payments.paymentlauncher;

import a20.C0162b;
import a20.C0168h;
import al0.C0971f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1643y1;
import b10.C2222b;
import b20.C2321a;
import b20.EnumC2323c;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c20.AbstractC3877e;
import c20.C3873a;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.whoop.android.R;
import e10.C12566q0;
import e93.AbstractC12889b;
import g20.AbstractC15258d;
import g20.AbstractC15266l;
import g20.C15257c;
import g20.C15259e;
import g20.C15260f;
import g20.C15261g;
import g20.C15262h;
import g20.C15263i;
import g20.C15264j;
import g20.C15265k;
import g20.C15270p;
import g20.C15271q;
import g20.C15272r;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import l83.C23470p;
import m83.AbstractC25247g0;
import m83.C25235a0;
import m83.C25272z;
import n83.C26461d;
import o73.C27648a;
import p026b2.C2319y;
import p027b3.AbstractC2378g1;
import p163g1.C15160u4;
import p212i6.AbstractC18150c;
import p314m.AbstractActivityC24852m;
import p442qy.C30765d;
import p442qy.C30766e;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p664yy.C39865j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s40.C32132a;
import s93.AbstractC32309k;
import y00.InterfaceC38802c8;
import y00.InterfaceC38946s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;", "Lm/m;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentLauncherConfirmationActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22360z = 0;

    /* JADX INFO: renamed from: w */
    public final C23470p f22361w = AbstractC30060g.m92088H(new C15259e(this, 0));

    /* JADX INFO: renamed from: x */
    public final C0168h f22362x = new C0168h(new C15259e(this, 1), 3);

    /* JADX INFO: renamed from: y */
    public final C1643y1 f22363y = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15272r.class), new C15260f(this, 0), new C15259e(this, 2), new C15260f(this, 1));

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m16857o(AbstractC15258d abstractC15258d) {
        Intent intent = new Intent();
        abstractC15258d.getClass();
        setResult(-1, intent.putExtras(AbstractC12889b.m36273g(new C23465k("extra_args", abstractC15258d))));
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object objM107888l;
        String str;
        super.onCreate(bundle);
        setTitle(getResources().getString(R.string.stripe_confirming_transaction_status));
        try {
            objM107888l = (AbstractC15266l) this.f22361w.getValue();
            if (objM107888l == null) {
                throw new IllegalArgumentException("PaymentLauncherConfirmationActivity was started without arguments");
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        Map mapM7173b = C25272z.f99163w;
        ?? additionalNonPiiParams = 0;
        C30765d c30765d = C30766e.f126697b;
        C25235a0 c25235a0 = C25235a0.f99113w;
        if (thM68037a != null) {
            m16857o(new C15257c(thM68037a));
            Context applicationContext = getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            Context applicationContext2 = applicationContext.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext2, "getApplicationContext(...)");
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            AbstractC32309k.m100574c(executorC22364d);
            C39865j c39865j = new C39865j(c30765d, executorC22364d);
            C2222b c2222b = new C2222b(applicationContext2, c25235a0, new C0971f(applicationContext2, 1));
            EnumC2323c enumC2323c = EnumC2323c.PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS;
            int i13 = StripeException.f22154E;
            StripeException stripeExceptionM100024d = AbstractC32123d.m100024d(thM68037a);
            if ((4 & 2) != 0) {
                stripeExceptionM100024d = null;
            }
            additionalNonPiiParams = (4 & 4) != 0 ? mapM7173b : 0;
            AbstractC22676k.m65750j(additionalNonPiiParams, "additionalNonPiiParams");
            if (stripeExceptionM100024d != null) {
                mapM7173b = C2321a.m7173b(stripeExceptionM100024d);
            }
            c39865j.m127938a(c2222b.mo7052a(enumC2323c, AbstractC25247g0.m73995d0(mapM7173b, additionalNonPiiParams)));
            return;
        }
        AbstractC15266l abstractC15266l = (AbstractC15266l) objM107888l;
        Throwable thM68037a2 = C23468n.m68037a(abstractC15266l.mo43367x());
        if (thM68037a2 != null) {
            m16857o(new C15257c(thM68037a2));
            Context applicationContext3 = getApplicationContext();
            AbstractC22676k.m65749i(applicationContext3, "getApplicationContext(...)");
            Context applicationContext4 = applicationContext3.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext4, "getApplicationContext(...)");
            C22365e c22365e2 = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d2 = ExecutorC22364d.f87316w;
            AbstractC32309k.m100574c(executorC22364d2);
            C39865j c39865j2 = new C39865j(c30765d, executorC22364d2);
            C2222b c2222b2 = new C2222b(applicationContext4, c25235a0, new C0971f(applicationContext4, 1));
            EnumC2323c enumC2323c2 = EnumC2323c.PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS;
            int i14 = StripeException.f22154E;
            StripeException stripeExceptionM100024d2 = AbstractC32123d.m100024d(thM68037a2);
            if ((4 & 2) != 0) {
                stripeExceptionM100024d2 = null;
            }
            Map additionalNonPiiParams2 = (4 & 4) != 0 ? mapM7173b : null;
            AbstractC22676k.m65750j(additionalNonPiiParams2, "additionalNonPiiParams");
            if (stripeExceptionM100024d2 != null) {
                mapM7173b = C2321a.m7173b(stripeExceptionM100024d2);
            }
            c39865j2.m127938a(c2222b2.mo7052a(enumC2323c2, AbstractC25247g0.m73995d0(mapM7173b, additionalNonPiiParams2)));
            return;
        }
        C27648a.m83591n(getOnBackPressedDispatcher(), null, new C15160u4(6), 3);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C0162b(this, additionalNonPiiParams, 22), 3);
        C15272r c15272rM16858p = m16858p();
        C3873a c3873a = c15272rM16858p.f57357y;
        C15271q c15271q = new C15271q(c15272rM16858p, false ? 1 : 0);
        c3873a.getClass();
        ?? it = c3873a.m11854a().iterator();
        while (((AbstractC18150c) it).hasNext()) {
            ((AbstractC3877e) ((C26461d) it).next()).mo6696b(this, c15271q);
        }
        c3873a.f15853e = registerForActivityResult(new PaymentRelayContract(), c15271q);
        c3873a.f15854f = registerForActivityResult(new PaymentBrowserAuthContract(), c15271q);
        getLifecycle().mo4986a(new C12566q0(c15272rM16858p, 1));
        C32132a c32132a = new C32132a(this, abstractC15266l.mo43365k());
        if (abstractC15266l instanceof C15262h) {
            C15272r c15272rM16858p2 = m16858p();
            InterfaceC38946s confirmStripeIntentParams = ((C15262h) abstractC15266l).f57301F;
            AbstractC22676k.m65750j(confirmStripeIntentParams, "confirmStripeIntentParams");
            Boolean bool = (Boolean) c15272rM16858p2.f57351K.m5001b("key_has_started");
            if (bool != null ? bool.booleanValue() : false) {
                return;
            }
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c15272rM16858p2), null, null, new C2319y(c15272rM16858p2, confirmStripeIntentParams, c32132a, additionalNonPiiParams, 8), 3);
            return;
        }
        if (abstractC15266l instanceof C15261g) {
            C15272r c15272rM16858p3 = m16858p();
            Object obj = ((C23468n) ((C15261g) abstractC15266l).f57295G.getValue()).f92940w;
            C23465k c23465k = (C23465k) (obj instanceof C23467m ? null : obj);
            if (c23465k == null || (str = (String) c23465k.f92938x) == null) {
                str = "UNKNOWN";
            }
            c15272rM16858p3.m43370j(str, c32132a);
            return;
        }
        if (abstractC15266l instanceof C15263i) {
            m16858p().m43370j(((C15263i) abstractC15266l).f57308F, c32132a);
            return;
        }
        if (abstractC15266l instanceof C15264j) {
            m16858p().m43370j(((C15264j) abstractC15266l).f57315F, c32132a);
            return;
        }
        if (!(abstractC15266l instanceof C15265k)) {
            throw new NoWhenBranchMatchedException();
        }
        C15272r c15272rM16858p4 = m16858p();
        InterfaceC38802c8 intent = ((C15265k) abstractC15266l).f57322F;
        AbstractC22676k.m65750j(intent, "intent");
        Boolean bool2 = (Boolean) c15272rM16858p4.f57351K.m5001b("key_has_started");
        if (bool2 != null ? bool2.booleanValue() : false) {
            return;
        }
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c15272rM16858p4), null, null, new C15270p(c15272rM16858p4, intent, c32132a, (InterfaceC30057d) additionalNonPiiParams, 0), 3);
    }

    /* JADX INFO: renamed from: p */
    public final C15272r m16858p() {
        return (C15272r) this.f22363y.getValue();
    }
}
