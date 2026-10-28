package com.whoop.data.local.room.dao.persistent;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6496g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25394w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ RawDataDao_Impl f25395x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f25396y;

    public /* synthetic */ C6496g(RawDataDao_Impl rawDataDao_Impl, List list, int i13) {
        this.f25394w = i13;
        this.f25395x = rawDataDao_Impl;
        this.f25396y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25394w) {
            case 0:
                return this.f25395x.lambda$insertList$0(this.f25396y, (InterfaceC33687a) obj);
            default:
                return this.f25395x.lambda$deleteByPacketsList$1(this.f25396y, (InterfaceC33687a) obj);
        }
    }
}
