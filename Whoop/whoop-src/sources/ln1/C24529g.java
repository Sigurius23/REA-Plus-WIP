package ln1;

import c93.InterfaceC4339a;
import in1.InterfaceC18724d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ln1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24529g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95695w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f95696x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC18724d.c f95697y;

    public /* synthetic */ C24529g(Function1 function1, InterfaceC18724d.c cVar, int i13) {
        this.f95695w = i13;
        this.f95696x = function1;
        this.f95697y = cVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95695w) {
            case 0:
                return AbstractC24533k.m71467u(this.f95696x, this.f95697y);
            default:
                return AbstractC24539q.m71514Y(this.f95696x, this.f95697y);
        }
    }
}
