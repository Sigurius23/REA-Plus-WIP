package p707gt1;

import c93.InterfaceC4339a;
import ft1.InterfaceC14770c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gt1.k */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16197k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61503w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC14770c f61504x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f61505y;

    public /* synthetic */ C16197k(InterfaceC14770c interfaceC14770c, Function1 function1) {
        this.f61504x = interfaceC14770c;
        this.f61505y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f61503w) {
            case 0:
                return AbstractC16198l.m45805v(this.f61505y, this.f61504x);
            default:
                return AbstractC16198l.m45806w(this.f61504x, this.f61505y);
        }
    }

    public /* synthetic */ C16197k(Function1 function1, InterfaceC14770c interfaceC14770c) {
        this.f61505y = function1;
        this.f61504x = interfaceC14770c;
    }
}
