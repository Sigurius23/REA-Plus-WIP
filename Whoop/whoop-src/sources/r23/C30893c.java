package r23;

import ac3.C0745a;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import java.util.concurrent.CancellationException;
import live.hms.video.factories.C24148c;
import n20.C26175j;
import n23.AbstractC26205h;
import o23.InterfaceC27471a;
import o23.InterfaceC27474d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q83.C30064k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: r23.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C30893c implements InterfaceC27474d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC27474d f127377a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2994c0 f127378b;

    /* JADX INFO: renamed from: c */
    public final C29938w0 f127379c;

    /* JADX INFO: renamed from: d */
    public C2996c2 f127380d;

    /* JADX INFO: renamed from: e */
    public final C0745a f127381e;

    public C30893c(InterfaceC27474d originalCall, InterfaceC2994c0 scope, C29938w0 c29938w0) {
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(scope, "scope");
        this.f127377a = originalCall;
        this.f127378b = scope;
        this.f127379c = c29938w0;
        this.f127381e = new C0745a();
    }

    @Override // o23.InterfaceC27474d
    public final Object await(InterfaceC30057d interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.f127378b.getCoroutineContext(), new C30892b(this, null, 0), interfaceC30057d);
    }

    @Override // o23.InterfaceC27474d
    public final void cancel() {
        this.f127381e.m1813b();
        this.f127377a.cancel();
        C2996c2 c2996c2 = this.f127380d;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue(InterfaceC27471a interfaceC27471a) {
        this.f127380d = AbstractC3006f0.m8732z(this.f127378b, null, null, new C26175j(this, interfaceC27471a, (InterfaceC30057d) null, 23), 3);
    }

    @Override // o23.InterfaceC27474d
    public final AbstractC26205h execute() {
        return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C30892b(this, null, 1));
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue() {
        enqueue(new C24148c(20));
    }
}
