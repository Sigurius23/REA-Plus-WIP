package x20;

import android.content.Intent;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: x20.g */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C37839g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162002w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PollingActivity f162003x;

    public /* synthetic */ C37839g(PollingActivity pollingActivity, int i13) {
        this.f162002w = i13;
        this.f162003x = pollingActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f162002w;
        PollingActivity pollingActivity = this.f162003x;
        switch (i13) {
            case 0:
                int i14 = PollingActivity.f22393z;
                Intent intent = pollingActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                C37843k c37843k = (C37843k) intent.getParcelableExtra("extra_args");
                if (c37843k != null) {
                    return c37843k;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                int i15 = PollingActivity.f22393z;
                String str = pollingActivity.m16866o().f162011w;
                Duration.Companion companion = Duration.INSTANCE;
                int i16 = pollingActivity.m16866o().f162013y;
                DurationUnit durationUnit = DurationUnit.SECONDS;
                return new C37851s(str, DurationKt.toDuration(i16, durationUnit), DurationKt.toDuration(pollingActivity.m16866o().f162014z, durationUnit), pollingActivity.m16866o().f162008E, pollingActivity.m16866o().f162009F, pollingActivity.m16866o().f162010G);
            default:
                return pollingActivity.f22395x;
        }
    }
}
