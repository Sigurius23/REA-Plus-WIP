package to;

import android.app.Dialog;
import p097ds.RunnableC12316s;

/* JADX INFO: renamed from: to.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33994q0 extends AbstractC34006y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Dialog f142475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC12316s f142476b;

    public C33994q0(RunnableC12316s runnableC12316s, Dialog dialog) {
        this.f142475a = dialog;
        this.f142476b = runnableC12316s;
    }

    @Override // to.AbstractC34006y
    /* JADX INFO: renamed from: a */
    public final void mo107467a() {
        AbstractDialogInterfaceOnCancelListenerC33996r0 abstractDialogInterfaceOnCancelListenerC33996r0 = (AbstractDialogInterfaceOnCancelListenerC33996r0) this.f142476b.f41247y;
        abstractDialogInterfaceOnCancelListenerC33996r0.f142480y.set(null);
        abstractDialogInterfaceOnCancelListenerC33996r0.mo107418k();
        Dialog dialog = this.f142475a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
