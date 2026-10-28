package xp0;

import androidx.lifecycle.InterfaceC1633v0;
import com.whoop.community.CommunityPendingInviteFragment;

/* JADX INFO: renamed from: xp0.r */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38521r implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165789w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityPendingInviteFragment f165790x;

    public /* synthetic */ C38521r(CommunityPendingInviteFragment communityPendingInviteFragment, int i13) {
        this.f165789w = i13;
        this.f165790x = communityPendingInviteFragment;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        switch (this.f165789w) {
            case 0:
                CommunityPendingInviteFragment.m19095R(this.f165790x, (Boolean) obj);
                break;
            default:
                CommunityPendingInviteFragment.m19088K(this.f165790x, (Boolean) obj);
                break;
        }
    }
}
