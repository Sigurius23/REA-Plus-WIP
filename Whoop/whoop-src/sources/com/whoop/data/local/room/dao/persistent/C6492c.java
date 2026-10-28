package com.whoop.data.local.room.dao.persistent;

import hy0.AbstractC17766l1;
import p164g2.InterfaceC15250v;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6492c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25383w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f25384x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f25385y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f25386z;

    public /* synthetic */ C6492c(long j7, long j13, Object obj, int i13) {
        this.f25383w = i13;
        this.f25386z = obj;
        this.f25384x = j7;
        this.f25385y = j13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25383w) {
            case 0:
                return ((CachedMetricsDataDao_Impl) this.f25386z).lambda$getPacketRevisionThenHeartDataByTimeRanges$2(this.f25384x, this.f25385y, (InterfaceC30057d) obj);
            default:
                return AbstractC17766l1.m50965f((InterfaceC28601c1) this.f25386z, this.f25384x, this.f25385y, (InterfaceC15250v) obj);
        }
    }
}
