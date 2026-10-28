package androidx.lifecycle;

import p027b3.C2472z1;
import p399pb.C29047d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1607m1 implements InterfaceC1577e0, AutoCloseable {

    /* JADX INFO: renamed from: w */
    public final String f6278w;

    /* JADX INFO: renamed from: x */
    public final C1601k1 f6279x;

    /* JADX INFO: renamed from: y */
    public boolean f6280y;

    public C1607m1(String str, C1601k1 c1601k1) {
        this.f6278w = str;
        this.f6279x = c1601k1;
    }

    /* JADX INFO: renamed from: b */
    public final void m5006b(AbstractC1638x lifecycle, C29047d registry) {
        AbstractC22676k.m65750j(registry, "registry");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        if (this.f6280y) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f6280y = true;
        lifecycle.mo4986a(this);
        registry.m88293c(this.f6278w, (C2472z1) this.f6279x.f6269b.f2199f);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 source, EnumC1632v event) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_DESTROY) {
            this.f6280y = false;
            source.getLifecycle().mo4988d(this);
        }
    }
}
