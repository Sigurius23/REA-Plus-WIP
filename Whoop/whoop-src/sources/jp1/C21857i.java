package jp1;

import c93.InterfaceC4339a;
import com.whoop.hormonalinsights.postpartum.view.PostPartumFragment;

/* JADX INFO: renamed from: jp1.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21857i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84429w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PostPartumFragment f84430x;

    public /* synthetic */ C21857i(PostPartumFragment postPartumFragment, int i13) {
        this.f84429w = i13;
        this.f84430x = postPartumFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f84429w) {
            case 0:
                return PostPartumFragment.m22114O(this.f84430x);
            case 1:
                return PostPartumFragment.m22108I(this.f84430x);
            default:
                return PostPartumFragment.m22113N(this.f84430x);
        }
    }
}
