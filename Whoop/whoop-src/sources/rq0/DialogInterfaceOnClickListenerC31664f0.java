package rq0;

import android.content.DialogInterface;
import com.whoop.community.presentation.teams.TeamRemoveMembersActivity;
import com.whoop.domain.model.teams.TeamUser;

/* JADX INFO: renamed from: rq0.f0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC31664f0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130985w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TeamRemoveMembersActivity f130986x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TeamUser f130987y;

    public /* synthetic */ DialogInterfaceOnClickListenerC31664f0(TeamRemoveMembersActivity teamRemoveMembersActivity, TeamUser teamUser, int i13) {
        this.f130985w = i13;
        this.f130986x = teamRemoveMembersActivity;
        this.f130987y = teamUser;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        switch (this.f130985w) {
            case 0:
                TeamRemoveMembersActivity.m19466b0(this.f130986x, this.f130987y, dialogInterface, i13);
                break;
            default:
                TeamRemoveMembersActivity.m19468e0(this.f130986x, this.f130987y, dialogInterface, i13);
                break;
        }
    }
}
