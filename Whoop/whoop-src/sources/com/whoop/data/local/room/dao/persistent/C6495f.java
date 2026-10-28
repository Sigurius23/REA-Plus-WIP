package com.whoop.data.local.room.dao.persistent;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6495f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25391w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ OptimalStrainMappingDao_Impl f25392x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f25393y;

    public /* synthetic */ C6495f(OptimalStrainMappingDao_Impl optimalStrainMappingDao_Impl, List list, int i13) {
        this.f25391w = i13;
        this.f25392x = optimalStrainMappingDao_Impl;
        this.f25393y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25391w) {
            case 0:
                return this.f25392x.lambda$replaceAll$2(this.f25393y, (InterfaceC30057d) obj);
            default:
                return this.f25392x.lambda$insertAll$1(this.f25393y, (InterfaceC33687a) obj);
        }
    }
}
