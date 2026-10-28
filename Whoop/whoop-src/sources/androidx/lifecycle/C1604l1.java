package androidx.lifecycle;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1604l1 implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final C1619q1 f6274w;

    public C1604l1(C1619q1 c1619q1) {
        this.f6274w = c1619q1;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 source, EnumC1632v event) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_CREATE) {
            source.getLifecycle().mo4988d(this);
            this.f6274w.m5030b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
