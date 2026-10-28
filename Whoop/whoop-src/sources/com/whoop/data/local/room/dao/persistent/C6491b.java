package com.whoop.data.local.room.dao.persistent;

import com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao_Impl;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6491b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25379w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f25380x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f25381y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f25382z;

    public /* synthetic */ C6491b(int i13, long j7, long j13) {
        this.f25382z = i13;
        this.f25380x = j7;
        this.f25381y = j13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25379w) {
            case 0:
                return CachedMetricsDataDao_Impl.lambda$getHeartDataByTimeRanges$4(this.f25382z, this.f25380x, this.f25381y, (InterfaceC33687a) obj);
            default:
                return SmartAlarmDiagnosticDao_Impl.lambda$delete$2(this.f25380x, this.f25381y, this.f25382z, (InterfaceC33687a) obj);
        }
    }

    public /* synthetic */ C6491b(long j7, long j13, int i13) {
        this.f25380x = j7;
        this.f25381y = j13;
        this.f25382z = i13;
    }
}
