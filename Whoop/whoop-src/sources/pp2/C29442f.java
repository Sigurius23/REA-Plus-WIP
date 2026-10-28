package pp2;

import c93.InterfaceC4339a;
import np2.C27036c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pp2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29442f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119571w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27036c.c f119572x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f119573y;

    public /* synthetic */ C29442f(C27036c.c cVar, Function1 function1, int i13) {
        this.f119571w = i13;
        this.f119572x = cVar;
        this.f119573y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f119571w) {
            case 0:
                return AbstractC29444h.m89869r(this.f119572x, this.f119573y);
            case 1:
                return AbstractC29444h.m89870s(this.f119572x, this.f119573y);
            case 2:
                return AbstractC29444h.m89871t(this.f119572x, this.f119573y);
            default:
                return AbstractC29444h.m89863l(this.f119572x, this.f119573y);
        }
    }
}
