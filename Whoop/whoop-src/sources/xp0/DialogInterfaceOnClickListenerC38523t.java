package xp0;

import android.content.DialogInterface;
import com.whoop.community.CommunityRemoveMembersFragment;
import com.whoop.domain.model.teams.TeamUser;

/* JADX INFO: renamed from: xp0.t */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC38523t implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165793w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityRemoveMembersFragment f165794x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TeamUser f165795y;

    public /* synthetic */ DialogInterfaceOnClickListenerC38523t(CommunityRemoveMembersFragment communityRemoveMembersFragment, TeamUser teamUser, int i13) {
        this.f165793w = i13;
        this.f165794x = communityRemoveMembersFragment;
        this.f165795y = teamUser;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        switch (this.f165793w) {
            case 0:
                CommunityRemoveMembersFragment.m19144n0(this.f165794x, this.f165795y, dialogInterface, i13);
                break;
            default:
                CommunityRemoveMembersFragment.m19148r0(this.f165794x, this.f165795y, dialogInterface, i13);
                break;
        }
    }
}
