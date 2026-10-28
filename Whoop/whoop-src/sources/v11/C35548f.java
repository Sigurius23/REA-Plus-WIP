package v11;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: v11.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35548f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151224w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35544b f151225x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f151226y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f151227z;

    public /* synthetic */ C35548f(C35544b c35544b, InterfaceC4339a interfaceC4339a, Function1 function1, int i13) {
        this.f151224w = i13;
        this.f151225x = c35544b;
        this.f151226y = interfaceC4339a;
        this.f151227z = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f151224w) {
            case 0:
                return AbstractC35551i.m112708B(this.f151225x, this.f151226y, this.f151227z);
            default:
                return AbstractC35551i.m112711E(this.f151225x, this.f151226y, this.f151227z);
        }
    }
}
