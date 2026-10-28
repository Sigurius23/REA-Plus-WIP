package p529uo;

import android.content.Intent;
import to.InterfaceC33977i;

/* JADX INFO: renamed from: uo.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C35129q extends AbstractDialogInterfaceOnClickListenerC35130r {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Intent f149064w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC33977i f149065x;

    public C35129q(Intent intent, InterfaceC33977i interfaceC33977i) {
        this.f149064w = intent;
        this.f149065x = interfaceC33977i;
    }

    @Override // p529uo.AbstractDialogInterfaceOnClickListenerC35130r
    /* JADX INFO: renamed from: a */
    public final void mo111084a() {
        Intent intent = this.f149064w;
        if (intent != null) {
            this.f149065x.startActivityForResult(intent, 2);
        }
    }
}
