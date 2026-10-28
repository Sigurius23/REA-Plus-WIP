package kq2;

import c93.InterfaceC4339a;
import com.whoop.user.journey.view.UserJourneyFragment;

/* JADX INFO: renamed from: kq2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C22777c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89693w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ UserJourneyFragment f89694x;

    public /* synthetic */ C22777c(UserJourneyFragment userJourneyFragment, int i13) {
        this.f89693w = i13;
        this.f89694x = userJourneyFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f89693w) {
            case 0:
                return UserJourneyFragment.m27773Y(this.f89694x);
            case 1:
                return UserJourneyFragment.m27787m0(this.f89694x);
            case 2:
                return UserJourneyFragment.m27780f0(this.f89694x);
            case 3:
                return UserJourneyFragment.m27782h0(this.f89694x);
            case 4:
                return UserJourneyFragment.m27784j0(this.f89694x);
            default:
                return UserJourneyFragment.m27786l0(this.f89694x);
        }
    }
}
