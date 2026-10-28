package p390p1;

import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: p1.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28665s1 implements InterfaceC28661r1, InterfaceC28601c1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC28601c1 f115958w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC30063j f115959x;

    public C28665s1(InterfaceC28601c1 interfaceC28601c1, InterfaceC30063j interfaceC30063j) {
        this.f115958w = interfaceC28601c1;
        this.f115959x = interfaceC30063j;
    }

    @Override // p390p1.InterfaceC28601c1
    /* JADX INFO: renamed from: f */
    public final Function1 mo86980f() {
        return this.f115958w.mo86980f();
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f115959x;
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return this.f115958w.getValue();
    }

    @Override // p390p1.InterfaceC28601c1
    /* JADX INFO: renamed from: i */
    public final Object mo86981i() {
        return this.f115958w.mo86981i();
    }

    @Override // p390p1.InterfaceC28601c1
    public final void setValue(Object obj) {
        this.f115958w.setValue(obj);
    }
}
