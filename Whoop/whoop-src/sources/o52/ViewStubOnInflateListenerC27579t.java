package o52;

import android.view.View;
import android.view.ViewStub;
import com.whoop.realtime.presentation.StartActivityActivity;

/* JADX INFO: renamed from: o52.t */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewStubOnInflateListenerC27579t implements ViewStub.OnInflateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f111037b;

    public /* synthetic */ ViewStubOnInflateListenerC27579t(Object obj, int i13) {
        this.f111036a = i13;
        this.f111037b = obj;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        switch (this.f111036a) {
            case 0:
                C27585w.m83340z0((C27585w) this.f111037b, viewStub, view);
                break;
            default:
                StartActivityActivity.m23977q1((StartActivityActivity) this.f111037b, viewStub, view);
                break;
        }
    }
}
