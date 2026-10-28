package to1;

import ad3.AbstractC0757c;
import jb1.C21536b;
import oo1.AbstractC28062h;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: to1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34014g implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f142572E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f142573w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC0757c f142574x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC28062h.a f142575y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f142576z;

    public /* synthetic */ C34014g(AbstractC0757c abstractC0757c, AbstractC28062h.a aVar, boolean z4, boolean z13, int i13) {
        this.f142573w = i13;
        this.f142574x = abstractC0757c;
        this.f142575y = aVar;
        this.f142576z = z4;
        this.f142572E = z13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f142573w) {
            case 0:
                return AbstractC34019l.m107534Q(this.f142574x, this.f142575y, this.f142576z, this.f142572E, (C21536b) obj);
            default:
                return AbstractC34019l.m107535R(this.f142574x, this.f142575y, this.f142576z, this.f142572E, (C23749z0) obj);
        }
    }
}
