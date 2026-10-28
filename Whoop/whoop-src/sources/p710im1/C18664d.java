package p710im1;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: im1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18664d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73229w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f73230x;

    public /* synthetic */ C18664d(Function1 function1, int i13) {
        this.f73229w = i13;
        this.f73230x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73229w) {
            case 0:
                return AbstractC18668f.m54185i(this.f73230x, obj);
            default:
                return AbstractC18657a1.m54103q(this.f73230x, obj);
        }
    }
}
