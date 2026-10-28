package androidx.databinding;

import android.view.View;
import android.view.ViewStub;

/* JADX INFO: renamed from: androidx.databinding.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewStubOnInflateListenerC1170b0 implements ViewStub.OnInflateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1172c0 f5319a;

    public ViewStubOnInflateListenerC1170b0(C1172c0 c1172c0) {
        this.f5319a = c1172c0;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        C1172c0 c1172c0 = this.f5319a;
        c1172c0.f5327c = view;
        c1172c0.f5329e.getClass();
        c1172c0.f5326b = AbstractC1177g.f5333a.getDataBinder((InterfaceC1176f) null, view, viewStub.getLayoutResource());
        c1172c0.f5325a = null;
        ViewStub.OnInflateListener onInflateListener = c1172c0.f5328d;
        if (onInflateListener != null) {
            onInflateListener.onInflate(viewStub, view);
            c1172c0.f5328d = null;
        }
        c1172c0.f5329e.invalidateAll();
        c1172c0.f5329e.forceExecuteBindings();
    }
}
