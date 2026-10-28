package b10;

import com.stripe.android.networking.PaymentAnalyticsEvent;
import java.util.Set;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b10.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2232f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8880w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8881x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Set f8882y;

    public /* synthetic */ C2232f(C2273z0 c2273z0, Set set, int i13) {
        this.f8880w = i13;
        this.f8881x = c2273z0;
        this.f8882y = set;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8880w) {
            case 0:
                C2273z0 c2273z0 = this.f8881x;
                C2222b c2222b = c2273z0.f9019j;
                c2222b.getClass();
                Set productUsageTokens = this.f8882y;
                AbstractC22676k.m65750j(productUsageTokens, "productUsageTokens");
                c2273z0.f9017h.m127938a(C2222b.m7051c(c2222b, PaymentAnalyticsEvent.CustomerDetachPaymentMethod, productUsageTokens, null, null, null, 60));
                break;
            case 1:
                C2273z0 c2273z1 = this.f8881x;
                C2222b c2222b2 = c2273z1.f9019j;
                c2222b2.getClass();
                Set productUsageTokens2 = this.f8882y;
                AbstractC22676k.m65750j(productUsageTokens2, "productUsageTokens");
                c2273z1.f9017h.m127938a(C2222b.m7051c(c2222b2, PaymentAnalyticsEvent.CustomerDetachPaymentMethod, productUsageTokens2, null, null, null, 60));
                break;
            case 2:
                C2273z0 c2273z2 = this.f8881x;
                c2273z2.f9017h.m127938a(C2222b.m7051c(c2273z2.f9019j, PaymentAnalyticsEvent.CustomerRetrieve, this.f8882y, null, null, null, 60));
                break;
            default:
                C2273z0 c2273z3 = this.f8881x;
                c2273z3.f9017h.m127938a(C2222b.m7051c(c2273z3.f9019j, PaymentAnalyticsEvent.CustomerRetrievePaymentMethods, this.f8882y, null, null, null, 60));
                break;
        }
        return C23454a0.f92919a;
    }
}
