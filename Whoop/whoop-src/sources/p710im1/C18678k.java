package p710im1;

import b11.C2281h;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: im1.k */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18678k implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73285w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73286x;

    public /* synthetic */ C18678k(Object obj, int i13) {
        this.f73285w = i13;
        this.f73286x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73285w) {
            case 0:
                return AbstractC18682m.m54246i((Function1) this.f73286x, obj);
            case 1:
                return AbstractC18697t0.m54310Z0((Function1) this.f73286x, obj);
            case 2:
                return AbstractC18697t0.m54367s1((Function1) this.f73286x, (C2281h) obj);
            case 3:
                return AbstractC18697t0.m54336i0((Function1) this.f73286x, (C2281h) obj);
            default:
                return Integer.valueOf(AbstractC18697t0.m54319c1((InterfaceC39171c) this.f73286x, ((Integer) obj).intValue()));
        }
    }
}
