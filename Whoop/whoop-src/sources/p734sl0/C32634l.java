package p734sl0;

import c93.InterfaceC4339a;
import nl0.C26804f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sl0.l */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32634l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135255w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f135256x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26804f f135257y;

    public /* synthetic */ C32634l(Function1 function1, C26804f c26804f) {
        this.f135255w = 3;
        this.f135257y = c26804f;
        this.f135256x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f135255w) {
            case 0:
                return AbstractC32654p.m102111o(this.f135256x, this.f135257y);
            case 1:
                return AbstractC32650o0.m102086x(this.f135256x, this.f135257y);
            case 2:
                return AbstractC32679u0.m102371e0(this.f135256x, this.f135257y);
            default:
                return AbstractC32679u0.m102405v0(this.f135257y, this.f135256x);
        }
    }

    public /* synthetic */ C32634l(Function1 function1, C26804f c26804f, int i13) {
        this.f135255w = i13;
        this.f135256x = function1;
        this.f135257y = c26804f;
    }
}
