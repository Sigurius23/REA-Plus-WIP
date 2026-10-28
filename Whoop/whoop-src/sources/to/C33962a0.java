package to;

import android.app.Activity;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
import p073cq.C11040i;
import p073cq.C11052u;

/* JADX INFO: renamed from: to.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33962a0 extends AbstractDialogInterfaceOnCancelListenerC33996r0 {

    /* JADX INFO: renamed from: F */
    public C11040i f142396F;

    /* JADX INFO: renamed from: m */
    public static C33962a0 m107415m(Activity activity) {
        InterfaceC33977i interfaceC33977iM107437b = AbstractC33975h.m107437b(activity);
        C33962a0 c33962a0 = (C33962a0) interfaceC33977iM107437b.mo107444d(C33962a0.class, "GmsAvailabilityHelper");
        if (c33962a0 != null) {
            if (c33962a0.f142396F.f34644a.isComplete()) {
                c33962a0.f142396F = new C11040i();
            }
            return c33962a0;
        }
        C33962a0 c33962a1 = new C33962a0(interfaceC33977iM107437b, GoogleApiAvailability.getInstance());
        c33962a1.f142396F = new C11040i();
        interfaceC33977iM107437b.mo107446o("GmsAvailabilityHelper", c33962a1);
        return c33962a1;
    }

    @Override // to.AbstractC33975h
    /* JADX INFO: renamed from: e */
    public final void mo107416e() {
        this.f142396F.m29688c(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // to.AbstractDialogInterfaceOnCancelListenerC33996r0
    /* JADX INFO: renamed from: j */
    public final void mo107417j(C4969a c4969a, int i13) {
        String str = c4969a.f20482z;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        this.f142396F.m29686a(new ApiException(new Status(c4969a.f20480x, str, c4969a.f20481y, c4969a)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, to.i] */
    @Override // to.AbstractDialogInterfaceOnCancelListenerC33996r0
    /* JADX INFO: renamed from: k */
    public final void mo107418k() {
        Activity activityMo107445k = this.f142437w.mo107445k();
        if (activityMo107445k == null) {
            this.f142396F.m29688c(new ApiException(new Status(8, null, null, null)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.f142478E.isGooglePlayServicesAvailable(activityMo107445k);
        if (iIsGooglePlayServicesAvailable == 0) {
            this.f142396F.m29689d(null);
        } else {
            if (this.f142396F.f34644a.isComplete()) {
                return;
            }
            m107469l(new C4969a(iIsGooglePlayServicesAvailable, null), 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public final C11052u m107419n() {
        return this.f142396F.f34644a;
    }
}
