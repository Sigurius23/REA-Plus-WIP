package com.whoop.profile.view.edit;

import c93.InterfaceC4351m;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import wi0.AbstractC37313e;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.p */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9792p implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28550w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f28551x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f28552y;

    public /* synthetic */ C9792p(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f28550w = i13;
        this.f28551x = interfaceC4351m;
        this.f28552y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28550w) {
            case 0:
                return EditProfileScreenKt.EditProfileScreen$lambda$22$1$0(this.f28551x, this.f28552y, (String) obj);
            default:
                return AbstractC37313e.m119527w(this.f28551x, this.f28552y, (String) obj);
        }
    }
}
