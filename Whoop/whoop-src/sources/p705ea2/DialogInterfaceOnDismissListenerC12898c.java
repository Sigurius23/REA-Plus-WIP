package p705ea2;

import android.content.DialogInterface;
import bc3.C2996c2;
import com.whoop.realtime.presentation.RealTimeFinishPromptActivity;
import com.whoop.settings.DebugFragment;
import p031b9.C2817b;
import p309lo.C24560r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ea2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC12898c implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44395w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f44396x;

    public /* synthetic */ DialogInterfaceOnDismissListenerC12898c(Object obj, int i13) {
        this.f44395w = i13;
        this.f44396x = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44395w) {
            case 0:
                DebugFragment.m24967g4((C2996c2) this.f44396x, dialogInterface);
                break;
            case 1:
                C2817b this$0 = (C2817b) this.f44396x;
                AbstractC22676k.m65750j(this$0, "this$0");
                ((C24560r) this$0.f11024y).getClass();
                break;
            default:
                RealTimeFinishPromptActivity.m23744n0((RealTimeFinishPromptActivity) this.f44396x, dialogInterface);
                break;
        }
    }
}
