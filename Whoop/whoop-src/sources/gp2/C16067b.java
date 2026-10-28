package gp2;

import c93.InterfaceC4339a;
import ep2.C13431c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gp2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C16067b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60762w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13431c.b f60763x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f60764y;

    public /* synthetic */ C16067b(C13431c.b bVar, Function1 function1, int i13) {
        this.f60762w = i13;
        this.f60763x = bVar;
        this.f60764y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f60762w) {
            case 0:
                return AbstractC16068c.m45372k(this.f60763x, this.f60764y);
            case 1:
                return AbstractC16068c.m45373l(this.f60763x, this.f60764y);
            case 2:
                return AbstractC16068c.m45374m(this.f60763x, this.f60764y);
            default:
                return AbstractC16068c.m45369h(this.f60763x, this.f60764y);
        }
    }
}
