package com.whoop.p069ui;

import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import com.whoop.community.CommunityAddMemberFragment;
import com.whoop.community.CommunityShowInviteFragment;
import com.whoop.p069ui.teams.TeamsShowInviteActivity;
import p217ib.AbstractC18317n;

/* JADX INFO: renamed from: com.whoop.ui.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C10460a implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f31638w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f31639x;

    public /* synthetic */ C10460a(Object obj, int i13) {
        this.f31638w = i13;
        this.f31639x = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        switch (this.f31638w) {
            case 0:
                C10462b.a.m26723b((C10462b) this.f31639x, (InterfaceC1585g0) obj);
                break;
            case 1:
                C10464d.a.m26735b((C10464d) this.f31639x, (InterfaceC1585g0) obj);
                break;
            case 2:
                TeamsShowInviteActivity.m27386U((TeamsShowInviteActivity) this.f31639x, (AbstractC18317n) obj);
                break;
            case 3:
                CommunityAddMemberFragment.m18839z0((CommunityAddMemberFragment) this.f31639x, (AbstractC18317n) obj);
                break;
            default:
                CommunityShowInviteFragment.m19175b0((CommunityShowInviteFragment) this.f31639x, (AbstractC18317n) obj);
                break;
        }
    }
}
