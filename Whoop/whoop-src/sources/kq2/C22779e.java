package kq2;

import c93.InterfaceC4339a;
import com.whoop.user.journey.view.UserJourneyFragment;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: kq2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C22779e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89697w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ UserJourneyFragment f89698x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28670t2 f89699y;

    public /* synthetic */ C22779e(UserJourneyFragment userJourneyFragment, InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f89697w = i13;
        this.f89698x = userJourneyFragment;
        this.f89699y = interfaceC28670t2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f89697w) {
            case 0:
                return UserJourneyFragment.m27776b0(this.f89698x, this.f89699y);
            case 1:
                return UserJourneyFragment.m27777c0(this.f89698x, this.f89699y);
            default:
                return UserJourneyFragment.m27785k0(this.f89698x, this.f89699y);
        }
    }
}
