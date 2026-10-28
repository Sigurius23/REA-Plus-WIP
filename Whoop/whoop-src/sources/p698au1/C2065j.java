package p698au1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: au1.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2065j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8189w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f8190x;

    public /* synthetic */ C2065j(Function1 function1, int i13) {
        this.f8189w = i13;
        this.f8190x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8189w) {
            case 0:
                return Function1.m6510f(this.f8190x);
            default:
                return AbstractC2072q.m6555y(this.f8190x);
        }
    }
}
