package oq0;

import android.net.Uri;
import android.view.View;
import com.whoop.community.presentation.login.InviteCodeActivity;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: oq0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C28104a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f113661w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InviteCodeActivity f113662x;

    public /* synthetic */ C28104a(InviteCodeActivity inviteCodeActivity, int i13) {
        this.f113661w = i13;
        this.f113662x = inviteCodeActivity;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f113661w) {
            case 0:
                return InviteCodeActivity.m19320i0(this.f113662x, (View) obj);
            case 1:
                return InviteCodeActivity.m19333v0(this.f113662x, (Uri) obj);
            case 2:
                return InviteCodeActivity.m19321j0(this.f113662x, (View) obj);
            case 3:
                return InviteCodeActivity.m19326o0(this.f113662x, (C28110g) obj);
            case 4:
                return InviteCodeActivity.m19329r0(this.f113662x, ((Integer) obj).intValue());
            case 5:
                return InviteCodeActivity.m19330s0(this.f113662x, (Invitation) obj);
            case 6:
                return InviteCodeActivity.m19331t0(this.f113662x, (DrawerDisplayInvite) obj);
            default:
                return InviteCodeActivity.m19332u0(this.f113662x, (DrawerDisplayInvite) obj);
        }
    }
}
