package cl1;

import c93.InterfaceC4339a;
import com.whoop.helpcenter.view.fragment.HelpCenterFragment;

/* JADX INFO: renamed from: cl1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C4798a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19784w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HelpCenterFragment f19785x;

    public /* synthetic */ C4798a(HelpCenterFragment helpCenterFragment, int i13) {
        this.f19784w = i13;
        this.f19785x = helpCenterFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f19784w) {
            case 0:
                return HelpCenterFragment.m21668E(this.f19785x);
            default:
                return HelpCenterFragment.m21671H(this.f19785x);
        }
    }
}
