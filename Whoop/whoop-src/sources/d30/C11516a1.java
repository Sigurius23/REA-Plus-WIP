package d30;

import c93.InterfaceC4339a;
import h20.C16687l;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: d30.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11516a1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37090w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f37091x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16687l f37092y;

    public /* synthetic */ C11516a1(Function1 function1, C16687l c16687l, int i13) {
        this.f37090w = i13;
        this.f37091x = function1;
        this.f37092y = c16687l;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f37090w) {
            case 0:
                this.f37091x.invoke(this.f37092y);
                break;
            default:
                this.f37091x.invoke(this.f37092y);
                break;
        }
        return C23454a0.f92919a;
    }
}
