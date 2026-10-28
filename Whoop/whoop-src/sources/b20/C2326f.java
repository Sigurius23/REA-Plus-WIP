package b20;

import com.stripe.android.core.exception.StripeException;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25272z;
import p664yy.AbstractC39851c;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C2326f {

    /* JADX INFO: renamed from: a */
    public final C39865j f9228a;

    /* JADX INFO: renamed from: b */
    public final AbstractC39851c f9229b;

    public C2326f(C39865j analyticsRequestExecutor, AbstractC39851c analyticsRequestFactory) {
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(analyticsRequestFactory, "analyticsRequestFactory");
        this.f9228a = analyticsRequestExecutor;
        this.f9229b = analyticsRequestFactory;
    }

    /* JADX INFO: renamed from: a */
    public final void m7175a(InterfaceC2322b errorEvent, StripeException stripeException, Map additionalNonPiiParams) {
        AbstractC22676k.m65750j(errorEvent, "errorEvent");
        AbstractC22676k.m65750j(additionalNonPiiParams, "additionalNonPiiParams");
        this.f9228a.m127938a(this.f9229b.mo7052a(errorEvent, AbstractC25247g0.m73995d0(stripeException == null ? C25272z.f99163w : C2321a.m7173b(stripeException), additionalNonPiiParams)));
    }
}
