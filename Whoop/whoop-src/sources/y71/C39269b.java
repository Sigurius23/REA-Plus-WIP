package y71;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y71.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C39269b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f168917w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f168918x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C39271d f168919y;

    public /* synthetic */ C39269b(Function1 function1, C39271d c39271d, int i13) {
        this.f168917w = i13;
        this.f168918x = function1;
        this.f168919y = c39271d;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f168917w) {
            case 0:
                return AbstractC39270c.m125114g(this.f168918x, this.f168919y);
            default:
                return AbstractC39270c.m125116i(this.f168918x, this.f168919y);
        }
    }
}
