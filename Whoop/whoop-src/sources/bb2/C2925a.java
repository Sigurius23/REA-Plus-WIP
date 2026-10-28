package bb2;

import bm0.AbstractC3398a;
import com.whoop.data.local.room.dao.wipeable.GpsDao_Impl;
import p134f2.C14015d;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p730qt2.AbstractC30609o;
import u41.AbstractC34535c;
import vs2.AbstractC36479e;

/* JADX INFO: renamed from: bb2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C2925a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11791w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f11792x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f11793y;

    public /* synthetic */ C2925a(long j7, long j13, int i13) {
        this.f11791w = i13;
        this.f11792x = j7;
        this.f11793y = j13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11791w) {
            case 0:
                return AbstractC2926b.m8536f(this.f11792x, this.f11793y, (InterfaceC22129c) obj);
            case 1:
                return AbstractC3398a.m9780d(this.f11792x, this.f11793y, (InterfaceC22131e) obj);
            case 2:
                return GpsDao_Impl.lambda$getGpsLiveData$4(this.f11792x, this.f11793y, (InterfaceC33687a) obj);
            case 3:
                return GpsDao_Impl.lambda$removeGpsData$7(this.f11792x, this.f11793y, (InterfaceC33687a) obj);
            case 4:
                return GpsDao_Impl.lambda$getGpsData$3(this.f11792x, this.f11793y, (InterfaceC33687a) obj);
            case 5:
                return AbstractC30609o.m93935h(this.f11792x, this.f11793y, (C14015d) obj);
            case 6:
                return AbstractC34535c.m109128e(this.f11792x, this.f11793y, (InterfaceC22131e) obj);
            default:
                return AbstractC36479e.m116855Q(this.f11792x, this.f11793y, (C14015d) obj);
        }
    }
}
