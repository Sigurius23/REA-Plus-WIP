package o52;

import android.content.DialogInterface;
import com.whoop.realtime.presentation.StartActivityActivity;

/* JADX INFO: renamed from: o52.o0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC27570o0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111002w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StartActivityActivity f111003x;

    public /* synthetic */ DialogInterfaceOnClickListenerC27570o0(StartActivityActivity startActivityActivity, int i13) {
        this.f111002w = i13;
        this.f111003x = startActivityActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        switch (this.f111002w) {
            case 0:
                StartActivityActivity.m23925X1(this.f111003x, dialogInterface, i13);
                break;
            case 1:
                StartActivityActivity.m23928Y1(this.f111003x, dialogInterface, i13);
                break;
            case 2:
                StartActivityActivity.m23872F1(this.f111003x, dialogInterface, i13);
                break;
            case 3:
                StartActivityActivity.m23934a2(this.f111003x, dialogInterface, i13);
                break;
            case 4:
                StartActivityActivity.m23875G1(this.f111003x, dialogInterface, i13);
                break;
            default:
                StartActivityActivity.m23937b2(this.f111003x, dialogInterface, i13);
                break;
        }
    }
}
