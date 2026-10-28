package androidx.fragment.app;

import androidx.core.app.ActivityOptionsCompat;
import java.util.concurrent.atomic.AtomicReference;
import p236j.AbstractC21065d;

/* JADX INFO: renamed from: androidx.fragment.app.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1272a0 extends AbstractC21065d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f5522a;

    public C1272a0(AtomicReference atomicReference) {
        this.f5522a = atomicReference;
    }

    @Override // p236j.AbstractC21065d
    /* JADX INFO: renamed from: a */
    public final void mo4052a(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        AbstractC21065d abstractC21065d = (AbstractC21065d) this.f5522a.get();
        if (abstractC21065d == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC21065d.mo4052a(obj, activityOptionsCompat);
    }

    @Override // p236j.AbstractC21065d
    /* JADX INFO: renamed from: b */
    public final void mo4053b() {
        AbstractC21065d abstractC21065d = (AbstractC21065d) this.f5522a.getAndSet(null);
        if (abstractC21065d != null) {
            abstractC21065d.mo4053b();
        }
    }
}
