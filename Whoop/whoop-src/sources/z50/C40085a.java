package z50;

import com.whoop.access.omronauth.view.OmronAuthFragment;
import p715kotlin.jvm.functions.Function1;
import x50.InterfaceC37986a;

/* JADX INFO: renamed from: z50.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C40085a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172999w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ OmronAuthFragment f173000x;

    public /* synthetic */ C40085a(OmronAuthFragment omronAuthFragment, int i13) {
        this.f172999w = i13;
        this.f173000x = omronAuthFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f172999w) {
            case 0:
                return OmronAuthFragment.m16966H(this.f173000x, (String) obj);
            default:
                return OmronAuthFragment.m16967I(this.f173000x, (InterfaceC37986a.j) obj);
        }
    }
}
