package kotlin;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: at2.o */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2020o implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8016w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f8017x;

    public /* synthetic */ C2020o(Function1 function1, int i13) {
        this.f8016w = i13;
        this.f8017x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8016w) {
            case 0:
                return AbstractC2036w.m6367G(this.f8017x);
            default:
                return AbstractC2003f1.m6161j(this.f8017x);
        }
    }
}
