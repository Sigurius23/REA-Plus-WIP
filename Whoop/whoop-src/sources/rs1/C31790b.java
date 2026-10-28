package rs1;

import c93.InterfaceC4339a;
import com.whoop.labrador.LabradorResultsFragment;

/* JADX INFO: renamed from: rs1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C31790b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131607w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ LabradorResultsFragment f131608x;

    public /* synthetic */ C31790b(LabradorResultsFragment labradorResultsFragment, int i13) {
        this.f131607w = i13;
        this.f131608x = labradorResultsFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f131607w) {
            case 0:
                return LabradorResultsFragment.m22413I(this.f131608x);
            case 1:
                return LabradorResultsFragment.m22412H(this.f131608x);
            default:
                return LabradorResultsFragment.m22416L(this.f131608x);
        }
    }
}
