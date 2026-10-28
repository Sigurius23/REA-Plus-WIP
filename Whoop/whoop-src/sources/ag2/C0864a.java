package ag2;

import c93.InterfaceC4339a;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.archv2.feature.view.GenericFragment;
import com.whoop.sms.settings.view.SmsSettingsFragment;
import ni0.C26732c;

/* JADX INFO: renamed from: ag2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0864a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3155w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ScreenAnalyticEventModel f3156x;

    public /* synthetic */ C0864a(ScreenAnalyticEventModel screenAnalyticEventModel, int i13) {
        this.f3155w = i13;
        this.f3156x = screenAnalyticEventModel;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f3155w) {
            case 0:
                return SmsSettingsFragment.m25967E(this.f3156x);
            case 1:
                return C26732c.m79564h0(this.f3156x);
            default:
                return GenericFragment.m18066Q(this.f3156x);
        }
    }
}
