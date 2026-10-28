package f01;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f01.j1 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13871j1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49455w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13877l1 f49456x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f49457y;

    public /* synthetic */ C13871j1(C13877l1 c13877l1, Function1 function1, int i13) {
        this.f49455w = i13;
        this.f49456x = c13877l1;
        this.f49457y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f49455w) {
            case 0:
                return AbstractC13874k1.m39342g(this.f49456x, this.f49457y);
            default:
                return AbstractC13874k1.m39344i(this.f49456x, this.f49457y);
        }
    }
}
