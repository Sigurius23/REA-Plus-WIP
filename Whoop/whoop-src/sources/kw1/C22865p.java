package kw1;

import c93.InterfaceC4339a;
import com.whoop.membership.extensions.view.MembershipExtensionsFragment;

/* JADX INFO: renamed from: kw1.p */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22865p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90130w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MembershipExtensionsFragment f90131x;

    public /* synthetic */ C22865p(MembershipExtensionsFragment membershipExtensionsFragment, int i13) {
        this.f90130w = i13;
        this.f90131x = membershipExtensionsFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f90130w) {
            case 0:
                return MembershipExtensionsFragment.m22698q0(this.f90131x);
            case 1:
                return MembershipExtensionsFragment.m22661F0(this.f90131x);
            case 2:
                return MembershipExtensionsFragment.m22694m0(this.f90131x);
            case 3:
                return MembershipExtensionsFragment.m22653B0(this.f90131x);
            case 4:
                return Boolean.valueOf(MembershipExtensionsFragment.m22691j0(this.f90131x));
            case 5:
                return Boolean.valueOf(MembershipExtensionsFragment.m22693l0(this.f90131x));
            case 6:
                return MembershipExtensionsFragment.m22659E0(this.f90131x);
            case 7:
                return MembershipExtensionsFragment.m22651A0(this.f90131x);
            case 8:
                return Boolean.valueOf(MembershipExtensionsFragment.m22689h0(this.f90131x));
            default:
                return MembershipExtensionsFragment.m22695n0(this.f90131x);
        }
    }
}
