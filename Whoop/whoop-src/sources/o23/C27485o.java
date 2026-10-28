package o23;

import ac3.C0745a;
import bc3.AbstractC3006f0;
import l83.C23465k;
import live.hms.video.factories.C24148c;
import n20.C26175j;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p047c9.C4312c;
import p23.AbstractC28757a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: o23.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C27485o implements InterfaceC27474d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110715a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC27474d f110716b;

    /* JADX INFO: renamed from: c */
    public final C0745a f110717c;

    /* JADX INFO: renamed from: d */
    public final Object f110718d;

    public C27485o(InterfaceC27474d call, Function1 function1) {
        this.f110715a = 0;
        AbstractC22676k.m65750j(call, "call");
        this.f110716b = call;
        this.f110718d = function1;
        this.f110717c = new C0745a();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC26205h m82915a(AbstractC26205h abstractC26205h, AbstractC26205h abstractC26205h2) {
        return ((abstractC26205h instanceof C26204g) && (abstractC26205h2 instanceof C26204g)) ? new C26204g(new C23465k(((C26204g) abstractC26205h).f103919a, ((C26204g) abstractC26205h2).f103919a)) : new C26203f(new C26198a("Cannot combine results because one of them failed."));
    }

    @Override // o23.InterfaceC27474d
    public final Object await(InterfaceC30057d interfaceC30057d) {
        switch (this.f110715a) {
            case 0:
                return AbstractC3006f0.m8705K(AbstractC28757a.f116491b, new C27484n(this, null, 0), interfaceC30057d);
            default:
                return AbstractC3006f0.m8705K(AbstractC28757a.f116491b, new C26175j(this, (InterfaceC30057d) null, 8), interfaceC30057d);
        }
    }

    @Override // o23.InterfaceC27474d
    public final void cancel() {
        switch (this.f110715a) {
            case 0:
                this.f110717c.m1813b();
                this.f110716b.cancel();
                break;
            default:
                this.f110717c.m1813b();
                this.f110716b.cancel();
                ((InterfaceC27474d) this.f110718d).cancel();
                break;
        }
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue(InterfaceC27471a interfaceC27471a) {
        switch (this.f110715a) {
            case 0:
                this.f110716b.enqueue(new C4312c(27, this, interfaceC27471a));
                break;
            default:
                this.f110716b.enqueue(new C4312c(29, this, interfaceC27471a));
                break;
        }
    }

    @Override // o23.InterfaceC27474d
    public final AbstractC26205h execute() {
        switch (this.f110715a) {
            case 0:
                return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C27484n(this, null, 1));
            default:
                return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C27490t(this, null, 2));
        }
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue() {
        switch (this.f110715a) {
            case 0:
                enqueue(new C24148c(20));
                break;
            default:
                enqueue(new C24148c(20));
                break;
        }
    }

    public C27485o(InterfaceC27474d interfaceC27474d, InterfaceC27474d interfaceC27474d2) {
        this.f110715a = 1;
        this.f110716b = interfaceC27474d;
        this.f110718d = interfaceC27474d2;
        this.f110717c = new C0745a();
    }
}
