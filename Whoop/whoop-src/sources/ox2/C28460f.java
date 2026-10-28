package ox2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import px2.InterfaceC29603f;

/* JADX INFO: renamed from: ox2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C28460f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114737w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f114738x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC29603f.a f114739y;

    public /* synthetic */ C28460f(Function1 function1, InterfaceC29603f.a aVar, int i13) {
        this.f114737w = i13;
        this.f114738x = function1;
        this.f114739y = aVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f114737w) {
            case 0:
                return AbstractC28462h.m86326K(this.f114738x, this.f114739y);
            case 1:
                return AbstractC28462h.m86340Y(this.f114738x, this.f114739y);
            default:
                return AbstractC28462h.m86367y(this.f114738x, this.f114739y);
        }
    }
}
