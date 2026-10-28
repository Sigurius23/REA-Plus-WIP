package com.whoop.profile.view;

import c93.InterfaceC4339a;
import p329n0.C26068u;
import p390p1.C28621h1;
import r71.AbstractC31052b;
import zr1.AbstractC41069c;

/* JADX INFO: renamed from: com.whoop.profile.view.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9749c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28376w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26068u f28377x;

    public /* synthetic */ C9749c(C26068u c26068u, int i13) {
        this.f28376w = i13;
        this.f28377x = c26068u;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f28376w) {
            case 0:
                return Float.valueOf(ProfileScreenContentKt.ProfileContentArea$lambda$2$0(this.f28377x));
            case 1:
                return Integer.valueOf(((C28621h1) this.f28377x.f103222e.f91958b).m87024x());
            case 2:
                return Integer.valueOf(AbstractC31052b.m95589p(this.f28377x));
            default:
                return Boolean.valueOf(AbstractC41069c.m133331A(this.f28377x));
        }
    }
}
