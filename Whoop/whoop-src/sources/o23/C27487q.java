package o23;

import androidx.room.C1836v0;
import bc3.AbstractC3006f0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hc3.C17171d;
import live.hms.video.factories.C24148c;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p007a6.C0416e;
import p279kd.C22379f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o23.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C27487q implements InterfaceC27474d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC27474d f110722a;

    /* JADX INFO: renamed from: b */
    public final AbstractC32275i f110723b;

    /* JADX INFO: renamed from: c */
    public final C17171d f110724c;

    /* JADX WARN: Multi-variable type inference failed */
    public C27487q(InterfaceC27474d interfaceC27474d, InterfaceC2994c0 scope, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(scope, "scope");
        this.f110722a = interfaceC27474d;
        this.f110723b = (AbstractC32275i) interfaceC4351m;
        this.f110724c = AbstractC3006f0.m8696B(scope, new C3004e2(AbstractC3006f0.m8725s(scope.getCoroutineContext())));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [c93.m, s83.i] */
    /* JADX INFO: renamed from: a */
    public static final Object m82916a(C27487q c27487q, AbstractC26205h abstractC26205h, InterfaceC30057d interfaceC30057d) {
        c27487q.getClass();
        if (abstractC26205h instanceof C26204g) {
            return abstractC26205h;
        }
        if (abstractC26205h instanceof C26203f) {
            return c27487q.f110723b.invoke(((C26203f) abstractC26205h).f103918a, interfaceC30057d);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // o23.InterfaceC27474d
    public final Object await(InterfaceC30057d interfaceC30057d) {
        return C27473c.f110682a.m82902a(new C1836v0(2, this, C27487q.class, "map", "map(Lio/getstream/result/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12), new C0416e(this, null, 13), interfaceC30057d);
    }

    @Override // o23.InterfaceC27474d
    public final void cancel() {
        this.f110722a.cancel();
        AbstractC3006f0.m8718l(this.f110724c.f65971w);
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue(InterfaceC27471a interfaceC27471a) {
        AbstractC3006f0.m8732z(this.f110724c, null, null, new C27486p(this, interfaceC27471a, null, 0), 3);
    }

    @Override // o23.InterfaceC27474d
    public final AbstractC26205h execute() {
        return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C22379f(this, (InterfaceC30057d) null, 22));
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue() {
        enqueue(new C24148c(20));
    }
}
