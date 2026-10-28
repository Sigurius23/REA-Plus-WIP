package b10;

import com.stripe.android.networking.PaymentAnalyticsEvent;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b10.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2230e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8875w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8876x;

    public /* synthetic */ C2230e(C2273z0 c2273z0, int i13) {
        this.f8875w = i13;
        this.f8876x = c2273z0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8875w) {
            case 0:
                this.f8876x.m7101x(PaymentAnalyticsEvent.SetupIntentCancelSource);
                break;
            case 1:
                C2273z0 c2273z0 = this.f8876x;
                c2273z0.f9017h.m127938a(C2222b.m7051c(c2273z0.f9019j, PaymentAnalyticsEvent.SetupIntentRefresh, null, null, null, null, 62));
                break;
            case 2:
                C2273z0 c2273z1 = this.f8876x;
                c2273z1.f9017h.m127938a(C2222b.m7051c(c2273z1.f9019j, PaymentAnalyticsEvent.PaymentIntentRefresh, null, null, null, null, 62));
                break;
            case 3:
                C2273z0 c2273z2 = this.f8876x;
                c2273z2.f9017h.m127938a(C2222b.m7051c(c2273z2.f9019j, PaymentAnalyticsEvent.RadarSessionCreate, null, null, null, null, 62));
                break;
            case 4:
                this.f8876x.m7101x(PaymentAnalyticsEvent.PaymentIntentCancelSource);
                break;
            case 5:
                C2273z0 c2273z3 = this.f8876x;
                c2273z3.f9017h.m127938a(C2222b.m7051c(c2273z3.f9019j, PaymentAnalyticsEvent.Auth3ds2Start, null, null, null, null, 62));
                break;
            case 6:
                C2273z0 c2273z4 = this.f8876x;
                c2273z4.f9017h.m127938a(C2222b.m7051c(c2273z4.f9019j, PaymentAnalyticsEvent.SetupIntentRetrieve, null, null, null, null, 62));
                break;
            default:
                C2273z0 c2273z5 = this.f8876x;
                c2273z5.f9017h.m127938a(C2222b.m7051c(c2273z5.f9019j, PaymentAnalyticsEvent.PaymentIntentRetrieve, null, null, null, null, 62));
                break;
        }
        return C23454a0.f92919a;
    }
}
