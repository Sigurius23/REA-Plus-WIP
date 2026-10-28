package io.getstream.chat.android.p226ui.utils;

import android.content.DialogInterface;
import com.whoop.community.CommunityAddMemberFragment;
import com.whoop.community.CommunityFragment;
import com.whoop.community.CommunityManageTeamFragment;
import com.whoop.community.CommunityRemoveMembersFragment;
import com.whoop.community.presentation.teams.TeamRemoveMembersActivity;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.utils.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19904c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74834w;

    public /* synthetic */ DialogInterfaceOnClickListenerC19904c(int i13) {
        this.f74834w = i13;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        switch (this.f74834w) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                dialogInterface.dismiss();
                break;
            case 2:
                dialogInterface.dismiss();
                break;
            case 3:
                TeamRemoveMembersActivity.m19467c0(dialogInterface, i13);
                break;
            case 4:
                TeamRemoveMembersActivity.m19469f0(dialogInterface, i13);
                break;
            case 5:
                CommunityAddMemberFragment.m18835v0(dialogInterface, i13);
                break;
            case 6:
                CommunityFragment.m18840A0(dialogInterface, i13);
                break;
            case 7:
                CommunityManageTeamFragment.m19064l0(dialogInterface, i13);
                break;
            case 8:
                CommunityRemoveMembersFragment.m19145o0(dialogInterface, i13);
                break;
            default:
                CommunityRemoveMembersFragment.m19149s0(dialogInterface, i13);
                break;
        }
    }
}
