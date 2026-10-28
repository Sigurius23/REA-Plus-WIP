package hy0;

import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hy0.t0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17789t0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69163w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f69164x;

    public /* synthetic */ C17789t0(Function1 function1, int i13) {
        this.f69163w = i13;
        this.f69164x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f69163w) {
            case 0:
                return AbstractC17795v0.m51129l(this.f69164x, (String) obj);
            case 1:
                return AbstractC17781q1.m51083k(this.f69164x, (InterfaceC39147y) obj);
            default:
                return AbstractC17763k2.m50958f(this.f69164x, ((Float) obj).floatValue());
        }
    }
}
