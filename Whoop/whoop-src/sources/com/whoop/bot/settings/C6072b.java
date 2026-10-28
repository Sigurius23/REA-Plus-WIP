package com.whoop.bot.settings;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: com.whoop.bot.settings.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6072b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f24107w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CoachSettingsFragment f24108x;

    public /* synthetic */ C6072b(CoachSettingsFragment coachSettingsFragment, int i13) {
        this.f24107w = i13;
        this.f24108x = coachSettingsFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f24107w) {
            case 0:
                return CoachSettingsFragment.onCreateView$lambda$0$2$0(this.f24108x);
            case 1:
                return CoachSettingsFragment.onCreateView$lambda$0$3$0(this.f24108x);
            default:
                return CoachSettingsFragment.appNavigator_delegate$lambda$0(this.f24108x);
        }
    }
}
