package ke2;

import je2.InterfaceC21624c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ke2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C22422b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87742w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC21624c.b f87743x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f87744y;

    public /* synthetic */ C22422b(InterfaceC21624c.b bVar, Function1 function1) {
        this.f87743x = bVar;
        this.f87744y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f87742w) {
            case 0:
                return AbstractC22423c.m64574K(this.f87744y, this.f87743x, ((Boolean) obj).booleanValue());
            default:
                return AbstractC22423c.m64575L(this.f87743x, this.f87744y, obj);
        }
    }

    public /* synthetic */ C22422b(Function1 function1, InterfaceC21624c.b bVar) {
        this.f87744y = function1;
        this.f87743x = bVar;
    }
}
