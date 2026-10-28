package com.whoop.data.local.room.dao.wipeable;

import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.wipeable.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6515b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25404w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FeatureTeamDao_Impl f25405x;

    public /* synthetic */ C6515b(FeatureTeamDao_Impl featureTeamDao_Impl, int i13) {
        this.f25404w = i13;
        this.f25405x = featureTeamDao_Impl;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25404w) {
            case 0:
                return this.f25405x.lambda$getFeatureTeamData$3((InterfaceC33687a) obj);
            default:
                return this.f25405x.lambda$getFlowFeatureTeamData$4((InterfaceC33687a) obj);
        }
    }
}
