package eu;

import android.content.Context;
import androidx.lifecycle.AbstractC1638x;
import p390p1.InterfaceC28620h0;

/* JADX INFO: renamed from: eu.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C13629p implements InterfaceC28620h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1638x f48307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13620k f48308b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f48309c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ComponentCallbacksC13632s f48310d;

    public C13629p(AbstractC1638x abstractC1638x, C13620k c13620k, Context context, ComponentCallbacksC13632s componentCallbacksC13632s) {
        this.f48307a = abstractC1638x;
        this.f48308b = c13620k;
        this.f48309c = context;
        this.f48310d = componentCallbacksC13632s;
    }

    @Override // p390p1.InterfaceC28620h0
    public final void dispose() {
        this.f48307a.mo4988d(this.f48308b);
        this.f48309c.unregisterComponentCallbacks(this.f48310d);
    }
}
