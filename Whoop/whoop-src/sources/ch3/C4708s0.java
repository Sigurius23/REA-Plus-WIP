package ch3;

import bh3.InterfaceC3254a;
import com.google.crypto.tink.internal.C5101l0;
import xg3.AbstractC38283j;
import xg3.AbstractC38292s;
import xg3.C38280g;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4708s0 extends AbstractC38292s implements InterfaceC3254a {

    /* JADX INFO: renamed from: E */
    public final AbstractC38292s f19270E;

    /* JADX INFO: renamed from: F */
    public final boolean f19271F;

    /* JADX INFO: renamed from: G */
    public final AbstractC38283j f19272G;

    /* JADX INFO: renamed from: H */
    public C38280g f19273H;

    /* JADX INFO: renamed from: I */
    public Thread f19274I;

    public C4708s0(AbstractC38292s abstractC38292s, boolean z4, AbstractC38283j abstractC38283j, C38280g c38280g) {
        this.f19270E = abstractC38292s;
        this.f19271F = z4;
        this.f19272G = abstractC38283j;
        this.f19273H = c38280g;
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        C38280g c38280g = this.f19273H;
        this.f19273H = null;
        this.f19274I = Thread.currentThread();
        c38280g.m122671W(this);
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: f */
    public final void mo14765f(InterfaceC38282i interfaceC38282i) {
        this.f19270E.mo14765f(new C5101l0(7, this, interfaceC38282i));
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        AbstractC38283j abstractC38283j = this.f19272G;
        try {
            this.f19270E.onCompleted();
        } finally {
            abstractC38283j.mo14750b();
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        AbstractC38283j abstractC38283j = this.f19272G;
        try {
            this.f19270E.onError(th3);
        } finally {
            abstractC38283j.mo14750b();
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        this.f19270E.onNext(obj);
    }
}
