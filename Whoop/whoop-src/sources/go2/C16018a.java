package go2;

import c93.InterfaceC4339a;
import com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment;

/* JADX INFO: renamed from: go2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C16018a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60614w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ UniversalCartDialogFragment f60615x;

    public /* synthetic */ C16018a(UniversalCartDialogFragment universalCartDialogFragment, int i13) {
        this.f60614w = i13;
        this.f60615x = universalCartDialogFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f60614w) {
            case 0:
                return UniversalCartDialogFragment.m27665N(this.f60615x);
            case 1:
                return UniversalCartDialogFragment.m27679b0(this.f60615x);
            case 2:
                return UniversalCartDialogFragment.m27664M(this.f60615x);
            case 3:
                return UniversalCartDialogFragment.m27674W(this.f60615x);
            default:
                return UniversalCartDialogFragment.m27677Z(this.f60615x);
        }
    }
}
