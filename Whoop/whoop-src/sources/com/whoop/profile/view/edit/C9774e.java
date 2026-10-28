package com.whoop.profile.view.edit;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import p163g1.C15199y3;
import p390p1.InterfaceC28601c1;
import yw1.AbstractC39822i;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9774e implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f28415E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28416w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f28417x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15199y3 f28418y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f28419z;

    public /* synthetic */ C9774e(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f28416w = 2;
        this.f28417x = interfaceC2994c0;
        this.f28419z = interfaceC28601c1;
        this.f28415E = interfaceC28601c2;
        this.f28418y = c15199y3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f28416w) {
            case 0:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$1$0$1(this.f28417x, this.f28418y, this.f28419z, this.f28415E);
            case 1:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$1$0$2(this.f28417x, this.f28418y, this.f28419z, this.f28415E);
            default:
                return AbstractC39822i.m127709r(this.f28417x, this.f28419z, this.f28415E, this.f28418y);
        }
    }

    public /* synthetic */ C9774e(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, int i13) {
        this.f28416w = i13;
        this.f28417x = interfaceC2994c0;
        this.f28418y = c15199y3;
        this.f28419z = interfaceC28601c1;
        this.f28415E = interfaceC28601c2;
    }
}
