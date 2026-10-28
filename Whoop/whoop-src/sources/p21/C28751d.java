package p21;

import mh.C25540h;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import uu2.AbstractC35252g0;

/* JADX INFO: renamed from: p21.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C28751d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116447w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f116448x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f116449y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f116450z;

    public /* synthetic */ C28751d(int i13, int i14, InterfaceC28601c1 interfaceC28601c1, int i15) {
        this.f116447w = i15;
        this.f116448x = i13;
        this.f116449y = i14;
        this.f116450z = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116447w) {
            case 0:
                return AbstractC28752e.m87508t(this.f116448x, this.f116449y, this.f116450z, (C25540h) obj);
            default:
                return AbstractC35252g0.m111712l(this.f116448x, this.f116449y, this.f116450z, (C25540h) obj);
        }
    }
}
