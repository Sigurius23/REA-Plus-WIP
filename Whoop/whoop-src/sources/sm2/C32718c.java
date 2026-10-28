package sm2;

import c93.InterfaceC4339a;
import com.whoop.p069ui.home.HomeAuthWebViewFragment;

/* JADX INFO: renamed from: sm2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32718c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f136018w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HomeAuthWebViewFragment f136019x;

    public /* synthetic */ C32718c(HomeAuthWebViewFragment homeAuthWebViewFragment, int i13) {
        this.f136018w = i13;
        this.f136019x = homeAuthWebViewFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f136018w) {
            case 0:
                return HomeAuthWebViewFragment.m27227K(this.f136019x);
            default:
                return HomeAuthWebViewFragment.m27229M(this.f136019x);
        }
    }
}
