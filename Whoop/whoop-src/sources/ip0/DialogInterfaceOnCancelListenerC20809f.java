package ip0;

import android.content.DialogInterface;
import kn2.C22605g;

/* JADX INFO: renamed from: ip0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC20809f implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78131w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f78132x;

    public /* synthetic */ DialogInterfaceOnCancelListenerC20809f(Object obj, int i13) {
        this.f78131w = i13;
        this.f78132x = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f78131w) {
            case 0:
                C20811h.m57378f((C20811h) this.f78132x, dialogInterface);
                break;
            default:
                C22605g.m65538f((C22605g) this.f78132x, dialogInterface);
                break;
        }
    }
}
