package p028b4;

import c93.InterfaceC4339a;
import com.mapbox.maps.renderer.RenderHandlerThread;
import com.mapbox.maps.threading.AnimationThreadController;
import com.whoop.community.presentation.p059ui.PillRadioGroup;

/* JADX INFO: renamed from: b4.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2690a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10587w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f10588x;

    public /* synthetic */ RunnableC2690a(InterfaceC4339a interfaceC4339a, int i13) {
        this.f10587w = i13;
        this.f10588x = interfaceC4339a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10587w) {
            case 0:
                this.f10588x.invoke();
                break;
            case 1:
                this.f10588x.invoke();
                break;
            case 2:
                this.f10588x.invoke();
                break;
            case 3:
                RenderHandlerThread.postDelayed$lambda$1$lambda$0(this.f10588x);
                break;
            case 4:
                AnimationThreadController.postOnAnimatorThread$lambda$3$lambda$2(this.f10588x);
                break;
            case 5:
                AnimationThreadController.postOnMainThread$lambda$1(this.f10588x);
                break;
            case 6:
                this.f10588x.invoke();
                break;
            case 7:
                this.f10588x.invoke();
                break;
            case 8:
                PillRadioGroup.m19540j(this.f10588x);
                break;
            default:
                this.f10588x.invoke();
                break;
        }
    }
}
