package hy0;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hy0.w0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17798w0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69224w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f69225x;

    public /* synthetic */ C17798w0(Object obj, int i13) {
        this.f69224w = i13;
        this.f69225x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f69224w) {
            case 0:
                return AbstractC17795v0.b.m51141h((InterfaceC28670t2) this.f69225x);
            default:
                return AbstractC17795v0.m51137t((Function1) this.f69225x);
        }
    }
}
