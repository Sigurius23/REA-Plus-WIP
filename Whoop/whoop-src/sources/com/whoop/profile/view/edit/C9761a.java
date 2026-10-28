package com.whoop.profile.view.edit;

import c93.InterfaceC4339a;
import java.util.List;
import r51.AbstractC30937e;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9761a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28388w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f28389x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f28390y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ List f28391z;

    public /* synthetic */ C9761a(String str, int i13, List list, List list2) {
        this.f28388w = i13;
        this.f28389x = str;
        this.f28390y = list;
        this.f28391z = list2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f28388w) {
            case 0:
                return CountrySelectionContentKt.CountrySelectionContent$lambda$5$0(this.f28389x, this.f28390y, this.f28391z);
            default:
                return AbstractC30937e.m95165s(this.f28389x, this.f28390y, this.f28391z);
        }
    }
}
