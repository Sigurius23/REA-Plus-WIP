package hy0;

import p163g1.C15093n7;
import p208i2.AbstractC17911t;
import p270k2.InterfaceC22129c;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hy0.l */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17764l implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69080w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f69081x;

    public /* synthetic */ C17764l(Object obj, int i13) {
        this.f69080w = i13;
        this.f69081x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f69080w) {
            case 0:
                return AbstractC17770n.m50987O((String) this.f69081x, (Throwable) obj);
            case 1:
                return AbstractC17726b1.m50795m((C15093n7) this.f69081x, (InterfaceC39171c) obj);
            case 2:
                return AbstractC17746g1.m50881q((AbstractC17911t) this.f69081x, (InterfaceC22129c) obj);
            default:
                return AbstractC17790t1.m51112g((C17720a) this.f69081x, obj);
        }
    }
}
