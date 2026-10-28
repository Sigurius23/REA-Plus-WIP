package rq0;

import android.text.Editable;
import com.whoop.community.presentation.teams.TeamRemoveMembersActivity;
import p217ib.AbstractC18317n;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: rq0.d0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31658d0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130935w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TeamRemoveMembersActivity f130936x;

    public /* synthetic */ C31658d0(TeamRemoveMembersActivity teamRemoveMembersActivity, int i13) {
        this.f130935w = i13;
        this.f130936x = teamRemoveMembersActivity;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130935w) {
            case 0:
                return TeamRemoveMembersActivity.m19461V(this.f130936x, (C31676j0) obj);
            case 1:
                return TeamRemoveMembersActivity.m19463X(this.f130936x, (Editable) obj);
            case 2:
                return TeamRemoveMembersActivity.m19471h0(this.f130936x, (AbstractC18317n) obj);
            default:
                return TeamRemoveMembersActivity.m19465Z(this.f130936x, (AbstractC18317n) obj);
        }
    }
}
