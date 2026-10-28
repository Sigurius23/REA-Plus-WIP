package com.whoop.profile.view;

import c93.InterfaceC4339a;
import com.whoop.profile.p067di.ProfileModule;

/* JADX INFO: renamed from: com.whoop.profile.view.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9811g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28558w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Integer f28559x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Integer f28560y;

    public /* synthetic */ C9811g(Integer num, Integer num2, int i13) {
        this.f28558w = i13;
        this.f28559x = num;
        this.f28560y = num2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f28558w) {
            case 0:
                return ProfileScreenKt.ProfileScreen$lambda$0$0(this.f28559x, this.f28560y);
            default:
                return ProfileModule.define$lambda$0$10$0(this.f28559x, this.f28560y);
        }
    }
}
