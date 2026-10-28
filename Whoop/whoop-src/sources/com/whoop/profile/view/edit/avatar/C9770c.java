package com.whoop.profile.view.edit.avatar;

import c93.InterfaceC4352n;
import p181h2.C16617b;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.avatar.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9770c implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC28690z0 f28399w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f28400x;

    public /* synthetic */ C9770c(InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c1) {
        this.f28399w = interfaceC28690z0;
        this.f28400x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float fFloatValue = ((Float) obj3).floatValue();
        float fFloatValue2 = ((Float) obj4).floatValue();
        return AvatarEditBottomSheetKt$PhotoCropDisplay$4$1$1$1.invoke$lambda$0(this.f28399w, this.f28400x, (C16617b) obj, (C16617b) obj2, fFloatValue, fFloatValue2);
    }
}
