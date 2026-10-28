package o23;

import ac3.C0746b;
import bc3.AbstractC3006f0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import e53.C12745d;
import hc3.C17171d;
import live.hms.video.factories.C24148c;
import n20.C26175j;
import n23.AbstractC26205h;
import p007a6.C0416e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: o23.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C27480j implements InterfaceC27474d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4339a f110696a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f110697b;

    /* JADX INFO: renamed from: c */
    public final C17171d f110698c;

    /* JADX INFO: renamed from: d */
    public final C12745d f110699d;

    /* JADX INFO: renamed from: e */
    public final C0746b f110700e;

    public C27480j(InterfaceC2994c0 scope, InterfaceC4339a callBuilder, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(callBuilder, "callBuilder");
        this.f110696a = callBuilder;
        this.f110697b = interfaceC4339a;
        this.f110698c = AbstractC3006f0.m8696B(scope, new C3004e2(AbstractC3006f0.m8725s(scope.getCoroutineContext())));
        C12745d c12745d = new C12745d();
        c12745d.f43626a = null;
        this.f110699d = c12745d;
        this.f110700e = new C0746b(null);
    }

    @Override // o23.InterfaceC27474d
    public final Object await(InterfaceC30057d interfaceC30057d) {
        return C27473c.m82901b(new C0416e(this, null, 10), interfaceC30057d);
    }

    @Override // o23.InterfaceC27474d
    public final void cancel() {
        InterfaceC27474d interfaceC27474d = (InterfaceC27474d) this.f110700e.m1814a();
        if (interfaceC27474d != null) {
            interfaceC27474d.cancel();
        }
        AbstractC3006f0.m8718l(this.f110698c.f65971w);
        C12745d c12745d = this.f110699d;
        Object obj = c12745d.f43626a;
        c12745d.f43626a = null;
        if (obj != null) {
            this.f110697b.invoke();
        }
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue(InterfaceC27471a interfaceC27471a) {
        AbstractC3006f0.m8732z(this.f110698c, null, null, new C26175j(this, interfaceC27471a, (InterfaceC30057d) null, 3), 3);
    }

    @Override // o23.InterfaceC27474d
    public final AbstractC26205h execute() {
        return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C27479i(this, null, 1));
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue() {
        enqueue(new C24148c(20));
    }
}
