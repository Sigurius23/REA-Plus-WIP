package dn2;

import c93.InterfaceC4339a;
import com.whoop.p069ui.onboarding.dayzero.DayZeroSplashDialogFragment;

/* JADX INFO: renamed from: dn2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12226a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40911w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DayZeroSplashDialogFragment f40912x;

    public /* synthetic */ C12226a(DayZeroSplashDialogFragment dayZeroSplashDialogFragment, int i13) {
        this.f40911w = i13;
        this.f40912x = dayZeroSplashDialogFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f40911w) {
            case 0:
                return DayZeroSplashDialogFragment.m27354D(this.f40912x);
            default:
                return DayZeroSplashDialogFragment.m27357G(this.f40912x);
        }
    }
}
