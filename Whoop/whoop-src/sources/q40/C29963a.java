package q40;

import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28661r1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: q40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C29963a implements InterfaceC28661r1, InterfaceC28601c1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC28601c1 f122384w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC30063j f122385x;

    public C29963a(InterfaceC28601c1 state, InterfaceC30063j coroutineContext) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        this.f122384w = state;
        this.f122385x = coroutineContext;
    }

    @Override // p390p1.InterfaceC28601c1
    /* JADX INFO: renamed from: f */
    public final Function1 mo86980f() {
        return this.f122384w.mo86980f();
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f122385x;
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return this.f122384w.getValue();
    }

    @Override // p390p1.InterfaceC28601c1
    /* JADX INFO: renamed from: i */
    public final Object mo86981i() {
        return this.f122384w.mo86981i();
    }

    @Override // p390p1.InterfaceC28601c1
    public final void setValue(Object obj) {
        this.f122384w.setValue(obj);
    }
}
