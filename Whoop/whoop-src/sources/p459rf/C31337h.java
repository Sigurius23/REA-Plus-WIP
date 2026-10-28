package p459rf;

import gf.C15762c;
import ne3.AbstractC26604b;
import ne3.InterfaceC26620j;
import p424qg.C30335d;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34799a1;
import ud3.C34818h0;

/* JADX INFO: renamed from: rf.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C31337h extends AbstractC34799a1 {

    /* JADX INFO: renamed from: E */
    public final C15762c f128951E;

    /* JADX INFO: renamed from: y */
    public final AbstractC34799a1 f128952y;

    /* JADX INFO: renamed from: z */
    public final C30335d f128953z;

    public C31337h(AbstractC34799a1 delegate, C30335d counter, C15762c c15762c) {
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(counter, "counter");
        this.f128952y = delegate;
        this.f128953z = counter;
        this.f128951E = c15762c;
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC26620j mo1940d1() {
        return AbstractC26604b.m79158c(new C31339j(this.f128952y.mo1940d1(), this.f128953z, this.f128951E));
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: i */
    public final long mo1941i() {
        return this.f128952y.mo1941i();
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: k */
    public final C34818h0 mo1942k() {
        return this.f128952y.mo1942k();
    }
}
