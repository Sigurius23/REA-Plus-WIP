package ey0;

import c93.InterfaceC4339a;
import cy0.C11184c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ey0.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13738e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49002w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f49003x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11184c.b f49004y;

    public /* synthetic */ C13738e(Function1 function1, C11184c.b bVar, int i13) {
        this.f49002w = i13;
        this.f49003x = function1;
        this.f49004y = bVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f49002w) {
            case 0:
                return AbstractC13740g.m39025D(this.f49003x, this.f49004y);
            default:
                return AbstractC13740g.m39022A(this.f49003x, this.f49004y);
        }
    }
}
