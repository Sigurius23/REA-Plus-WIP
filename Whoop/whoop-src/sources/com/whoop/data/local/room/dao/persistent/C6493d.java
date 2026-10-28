package com.whoop.data.local.room.dao.persistent;

import androidx.compose.p018ui.Modifier;
import hy0.AbstractC17755i2;
import p270k2.InterfaceC22131e;
import p500tb.InterfaceC33687a;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p745y81.C39336i;
import t61.AbstractC33552b;
import w61.AbstractC36864d;
import wm1.AbstractC37389k;
import yt0.C39767f;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6493d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25387w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f25388x;

    public /* synthetic */ C6493d(long j7, int i13) {
        this.f25387w = i13;
        this.f25388x = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25387w) {
            case 0:
                return CachedMetricsDataDao_Impl.lambda$deleteAllHeartDataBeforeTimeStamp$5(this.f25388x, (InterfaceC33687a) obj);
            case 1:
                return Long.valueOf(this.f25388x);
            case 2:
                return AbstractC17755i2.m50936h(this.f25388x, (Modifier) obj);
            case 3:
                return AbstractC33552b.m105956k(this.f25388x, (InterfaceC22131e) obj);
            case 4:
                return AbstractC36864d.m118238d(this.f25388x, (C39336i) obj);
            case 5:
                return AbstractC37389k.m119732u(this.f25388x, (InterfaceC39171c) obj);
            case 6:
                return AbstractC37389k.m119698F(this.f25388x, (InterfaceC39171c) obj);
            default:
                return C39767f.m127309r(this.f25388x, (InterfaceC33687a) obj);
        }
    }
}
