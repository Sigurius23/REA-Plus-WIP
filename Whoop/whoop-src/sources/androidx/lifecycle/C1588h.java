package androidx.lifecycle;

import androidx.fragment.app.RunnableC1319m;
import p127ev.C13668i;
import p489t.C33242a;

/* JADX INFO: renamed from: androidx.lifecycle.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C1588h extends AbstractC1615p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13668i f6238a;

    public C1588h(C13668i c13668i) {
        this.f6238a = c13668i;
    }

    @Override // androidx.lifecycle.AbstractC1615p0
    public final void onActive() {
        C33242a.m105474V().f138639a.f138641b.execute((RunnableC1319m) this.f6238a.f48457d);
    }
}
