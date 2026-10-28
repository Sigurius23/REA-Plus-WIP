package p313lz;

import android.content.DialogInterface;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.whoop.community.CommunityFragment;
import com.whoop.community.CommunityManageTeamFragment;
import com.whoop.realtime.presentation.RealTimeFinishPromptActivity;

/* JADX INFO: renamed from: lz.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC24814k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97143w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f97144x;

    public /* synthetic */ DialogInterfaceOnClickListenerC24814k(Object obj, int i13) {
        this.f97143w = i13;
        this.f97144x = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        switch (this.f97143w) {
            case 0:
                ((FinancialConnectionsSheetLiteActivity) this.f97144x).finish();
                break;
            case 1:
                RealTimeFinishPromptActivity.m23750t0((RealTimeFinishPromptActivity) this.f97144x, dialogInterface, i13);
                break;
            case 2:
                CommunityFragment.m18893z0((CommunityFragment) this.f97144x, dialogInterface, i13);
                break;
            default:
                CommunityManageTeamFragment.m19063k0((CommunityManageTeamFragment) this.f97144x, dialogInterface, i13);
                break;
        }
    }
}
