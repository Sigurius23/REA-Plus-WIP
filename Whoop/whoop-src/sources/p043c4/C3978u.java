package p043c4;

import android.window.OnBackInvokedCallback;
import c93.InterfaceC4339a;
import er.InterfaceC13569b;
import p021av.C2088b;
import p314m.LayoutInflaterFactory2C24829a0;

/* JADX INFO: renamed from: c4.u */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C3978u implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f16200b;

    public /* synthetic */ C3978u(Object obj, int i13) {
        this.f16199a = i13;
        this.f16200b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f16199a) {
            case 0:
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f16200b;
                if (interfaceC4339a != null) {
                    interfaceC4339a.invoke();
                }
                break;
            case 1:
                ((InterfaceC13569b) this.f16200b).mo15711d();
                break;
            case 2:
                ((C2088b) this.f16200b).invoke();
                break;
            case 3:
                ((LayoutInflaterFactory2C24829a0) this.f16200b).m72790H();
                break;
            default:
                ((Runnable) this.f16200b).run();
                break;
        }
    }
}
