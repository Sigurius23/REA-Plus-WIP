package p529uo;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;

/* JADX INFO: renamed from: uo.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C35128p extends AbstractDialogInterfaceOnClickListenerC35130r {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f149060w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Intent f149061x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f149062y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f149063z;

    public /* synthetic */ C35128p(Intent intent, Object obj, int i13, int i14) {
        this.f149060w = i14;
        this.f149061x = intent;
        this.f149063z = obj;
        this.f149062y = i13;
    }

    @Override // p529uo.AbstractDialogInterfaceOnClickListenerC35130r
    /* JADX INFO: renamed from: a */
    public final void mo111084a() {
        switch (this.f149060w) {
            case 0:
                Intent intent = this.f149061x;
                if (intent != null) {
                    ((Activity) this.f149063z).startActivityForResult(intent, this.f149062y);
                }
                break;
            default:
                Intent intent2 = this.f149061x;
                if (intent2 != null) {
                    ((AbstractComponentCallbacksC1320m0) this.f149063z).startActivityForResult(intent2, this.f149062y);
                }
                break;
        }
    }
}
