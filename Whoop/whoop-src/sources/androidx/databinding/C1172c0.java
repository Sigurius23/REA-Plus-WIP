package androidx.databinding;

import android.view.View;
import android.view.ViewStub;

/* JADX INFO: renamed from: androidx.databinding.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1172c0 {

    /* JADX INFO: renamed from: a */
    public ViewStub f5325a;

    /* JADX INFO: renamed from: b */
    public AbstractC1168a0 f5326b;

    /* JADX INFO: renamed from: c */
    public View f5327c;

    /* JADX INFO: renamed from: d */
    public ViewStub.OnInflateListener f5328d;

    /* JADX INFO: renamed from: e */
    public AbstractC1168a0 f5329e;

    public C1172c0(ViewStub viewStub) {
        ViewStubOnInflateListenerC1170b0 viewStubOnInflateListenerC1170b0 = new ViewStubOnInflateListenerC1170b0(this);
        this.f5325a = viewStub;
        viewStub.setOnInflateListener(viewStubOnInflateListenerC1170b0);
    }
}
