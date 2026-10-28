package k01;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: k01.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22091c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85643w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22093e f85644x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f85645y;

    public /* synthetic */ C22091c(C22093e c22093e, Function1 function1, int i13) {
        this.f85643w = i13;
        this.f85644x = c22093e;
        this.f85645y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f85643w) {
            case 0:
                return AbstractC22092d.m63199y(this.f85644x, this.f85645y);
            default:
                return AbstractC22092d.m63190p(this.f85644x, this.f85645y);
        }
    }
}
