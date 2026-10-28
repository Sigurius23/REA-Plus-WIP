package vy0;

import p181h2.C16617b;
import p390p1.InterfaceC28690z0;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: vy0.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36585m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156714w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28690z0 f156715x;

    public /* synthetic */ C36585m(InterfaceC28690z0 interfaceC28690z0, int i13) {
        this.f156714w = i13;
        this.f156715x = interfaceC28690z0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f156714w) {
            case 0:
                return AbstractC36588p.a.m117500d(this.f156715x, (C16617b) obj);
            case 1:
                return AbstractC36588p.m117440d1(this.f156715x, (InterfaceC39147y) obj);
            default:
                return AbstractC36578h0.m117327E(this.f156715x, (InterfaceC39147y) obj);
        }
    }
}
