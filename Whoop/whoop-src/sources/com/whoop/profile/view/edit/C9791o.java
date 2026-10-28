package com.whoop.profile.view.edit;

import c93.InterfaceC4339a;
import l83.InterfaceC23462h;
import mr1.AbstractC25920j;
import p728ql2.Function0;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.o */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9791o implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28548w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23462h f28549x;

    public /* synthetic */ C9791o(InterfaceC23462h interfaceC23462h, int i13) {
        this.f28548w = i13;
        this.f28549x = interfaceC23462h;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f28548w) {
            case 0:
                return EditProfileScreenKt.EditProfileScreen$lambda$21$2$0(this.f28549x);
            case 1:
                return AbstractC25920j.m76665k(this.f28549x);
            case 2:
                return AbstractC25920j.m76666l(this.f28549x);
            case 3:
                return Function0.m93276w(this.f28549x);
            default:
                return Function0.m93275v(this.f28549x);
        }
    }
}
