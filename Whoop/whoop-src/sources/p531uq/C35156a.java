package p531uq;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.whoop.community.CommunityManageTeamFragment;

/* JADX INFO: renamed from: uq.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C35156a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f149167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f149168b;

    public /* synthetic */ C35156a(Object obj, int i13) {
        this.f149167a = i13;
        this.f149168b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
        switch (this.f149167a) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f149168b).f20874I;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z4);
                }
                break;
            default:
                CommunityManageTeamFragment.m19020H0((CommunityManageTeamFragment) this.f149168b, compoundButton, z4);
                break;
        }
    }
}
