package live.hms.video.sdk;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import live.hms.video.sdk.models.enums.HMSAnalyticsEventLevel;

/* JADX INFO: renamed from: live.hms.video.sdk.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24264e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95253w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SDKDelegate f95254x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f95255y;

    public /* synthetic */ C24264e(SDKDelegate sDKDelegate, Object obj, int i13) {
        this.f95253w = i13;
        this.f95254x = sDKDelegate;
        this.f95255y = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95253w) {
            case 0:
                return SDKDelegate.C242342.AnonymousClass1.invokeSuspend$lambda$3$lambda$0(this.f95254x, (InterfaceC2994c0) this.f95255y);
            default:
                return SDKDelegate.transportLayer_delegate$lambda$9(this.f95254x, (HMSAnalyticsEventLevel) this.f95255y);
        }
    }
}
