package js2;

import c93.InterfaceC4339a;
import hs2.C17611e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: js2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C21924b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84680w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17611e.a f84681x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f84682y;

    public /* synthetic */ C21924b(C17611e.a aVar, Function1 function1, int i13) {
        this.f84680w = i13;
        this.f84681x = aVar;
        this.f84682y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f84680w) {
            case 0:
                return AbstractC21925c.m62424m(this.f84681x, this.f84682y);
            case 1:
                return AbstractC21925c.m62425n(this.f84681x, this.f84682y);
            case 2:
                return AbstractC21925c.m62426o(this.f84681x, this.f84682y);
            default:
                return AbstractC21925c.m62420i(this.f84681x, this.f84682y);
        }
    }
}
