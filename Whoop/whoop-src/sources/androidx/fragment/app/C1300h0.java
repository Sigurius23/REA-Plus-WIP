package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;
import p236j.AbstractC21071j;
import p236j.InterfaceC21063b;
import p267k.AbstractC22081b;
import p538v.InterfaceC35450a;

/* JADX INFO: renamed from: androidx.fragment.app.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1300h0 extends AbstractC1308j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC35450a f5619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f5620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC22081b f5621c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC21063b f5622d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractComponentCallbacksC1320m0 f5623e;

    public C1300h0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35450a interfaceC35450a, AtomicReference atomicReference, AbstractC22081b abstractC22081b, InterfaceC21063b interfaceC21063b) {
        this.f5623e = abstractComponentCallbacksC1320m0;
        this.f5619a = interfaceC35450a;
        this.f5620b = atomicReference;
        this.f5621c = abstractC22081b;
        this.f5622d = interfaceC21063b;
    }

    @Override // androidx.fragment.app.AbstractC1308j0
    /* JADX INFO: renamed from: a */
    public final void mo4065a() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5623e;
        this.f5620b.set(((AbstractC21071j) this.f5619a.apply(null)).m58913c(abstractComponentCallbacksC1320m0.generateActivityResultKey(), abstractComponentCallbacksC1320m0, this.f5621c, this.f5622d));
    }
}
