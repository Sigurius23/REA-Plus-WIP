package oq0;

import android.view.View;
import com.whoop.community.presentation.login.JoinTeamLandingActivity;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: oq0.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C28112i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f113713w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ JoinTeamLandingActivity f113714x;

    public /* synthetic */ C28112i(JoinTeamLandingActivity joinTeamLandingActivity, int i13) {
        this.f113713w = i13;
        this.f113714x = joinTeamLandingActivity;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f113713w) {
            case 0:
                return JoinTeamLandingActivity.m19374X(this.f113714x, (View) obj);
            case 1:
                return JoinTeamLandingActivity.m19375Y(this.f113714x, (View) obj);
            case 2:
                return JoinTeamLandingActivity.m19376Z(this.f113714x, (View) obj);
            case 3:
                return JoinTeamLandingActivity.m19381e0(this.f113714x, (C28116m) obj);
            case 4:
                return JoinTeamLandingActivity.m19384h0(this.f113714x, ((Integer) obj).intValue());
            case 5:
                return JoinTeamLandingActivity.m19385i0(this.f113714x, (Invitation) obj);
            default:
                return JoinTeamLandingActivity.m19386j0(this.f113714x, (DrawerDisplayInvite) obj);
        }
    }
}
