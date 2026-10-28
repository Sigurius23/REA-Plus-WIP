package xp0;

import c93.InterfaceC4339a;
import com.whoop.community.CommunityAddMemberFragment;

/* JADX INFO: renamed from: xp0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38500b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165472w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityAddMemberFragment f165473x;

    public /* synthetic */ C38500b(CommunityAddMemberFragment communityAddMemberFragment, int i13) {
        this.f165472w = i13;
        this.f165473x = communityAddMemberFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f165472w) {
            case 0:
                return CommunityAddMemberFragment.m18821h0(this.f165473x);
            default:
                return CommunityAddMemberFragment.m18791A0(this.f165473x);
        }
    }
}
