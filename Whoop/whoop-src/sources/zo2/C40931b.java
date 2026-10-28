package zo2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import xo2.C38497c;

/* JADX INFO: renamed from: zo2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40931b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176590w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38497c.b f176591x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f176592y;

    public /* synthetic */ C40931b(C38497c.b bVar, Function1 function1, int i13) {
        this.f176590w = i13;
        this.f176591x = bVar;
        this.f176592y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f176590w) {
            case 0:
                return AbstractC40932c.m132803k(this.f176591x, this.f176592y);
            case 1:
                return AbstractC40932c.m132804l(this.f176591x, this.f176592y);
            case 2:
                return AbstractC40932c.m132805m(this.f176591x, this.f176592y);
            default:
                return AbstractC40932c.m132800h(this.f176591x, this.f176592y);
        }
    }
}
