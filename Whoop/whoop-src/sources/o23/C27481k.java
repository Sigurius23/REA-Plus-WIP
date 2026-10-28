package o23;

import androidx.room.C1778e;
import bc3.AbstractC3006f0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hc3.C17171d;
import live.hms.video.factories.C24148c;
import n20.C26175j;
import n23.AbstractC26205h;
import p007a6.C0416e;
import p279kd.C22379f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o23.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C27481k implements InterfaceC27474d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110701a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC27474d f110702b;

    /* JADX INFO: renamed from: c */
    public final AbstractC32275i f110703c;

    /* JADX INFO: renamed from: d */
    public final C17171d f110704d;

    /* JADX WARN: Multi-variable type inference failed */
    public C27481k(InterfaceC27474d originalCall, InterfaceC2994c0 scope, InterfaceC4351m interfaceC4351m) {
        this.f110701a = 0;
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(scope, "scope");
        this.f110702b = originalCall;
        this.f110703c = (AbstractC32275i) interfaceC4351m;
        this.f110704d = AbstractC3006f0.m8696B(scope, new C3004e2(AbstractC3006f0.m8725s(scope.getCoroutineContext())));
    }

    @Override // o23.InterfaceC27474d
    public final Object await(InterfaceC30057d interfaceC30057d) {
        switch (this.f110701a) {
            case 0:
                return C27473c.m82901b(new C0416e(this, null, 11), interfaceC30057d);
            case 1:
                return C27473c.m82901b(new C0416e(this, null, 12), interfaceC30057d);
            default:
                return C27473c.m82901b(new C0416e(this, null, 14), interfaceC30057d);
        }
    }

    @Override // o23.InterfaceC27474d
    public final void cancel() {
        switch (this.f110701a) {
            case 0:
                this.f110702b.cancel();
                AbstractC3006f0.m8718l(this.f110704d.f65971w);
                break;
            case 1:
                this.f110702b.cancel();
                AbstractC3006f0.m8718l(this.f110704d.f65971w);
                break;
            default:
                this.f110702b.cancel();
                AbstractC3006f0.m8718l(this.f110704d.f65971w);
                break;
        }
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue(InterfaceC27471a callback) {
        switch (this.f110701a) {
            case 0:
                AbstractC22676k.m65750j(callback, "callback");
                AbstractC3006f0.m8732z(this.f110704d, null, null, new C1778e(this, callback, null, 29), 3);
                break;
            case 1:
                AbstractC3006f0.m8732z(this.f110704d, null, null, new C26175j(this, callback, (InterfaceC30057d) null, 5), 3);
                break;
            default:
                AbstractC3006f0.m8732z(this.f110704d, null, null, new C26175j(this, callback, (InterfaceC30057d) null, 7), 3);
                break;
        }
    }

    @Override // o23.InterfaceC27474d
    public final AbstractC26205h execute() {
        switch (this.f110701a) {
            case 0:
                return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C22379f(this, (InterfaceC30057d) null, 20));
            case 1:
                return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C27482l(this, null, 1));
            default:
                return (AbstractC26205h) AbstractC3006f0.m8699E(C30064k.f122676w, new C27489s(this, null, 1));
        }
    }

    @Override // o23.InterfaceC27474d
    public final void enqueue() {
        switch (this.f110701a) {
            case 0:
                enqueue(new C24148c(20));
                break;
            case 1:
                enqueue(new C24148c(20));
                break;
            default:
                enqueue(new C24148c(20));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27481k(InterfaceC27474d originalCall, InterfaceC2994c0 scope, Function1 function1, int i13) {
        this.f110701a = i13;
        switch (i13) {
            case 2:
                AbstractC22676k.m65750j(originalCall, "originalCall");
                AbstractC22676k.m65750j(scope, "scope");
                this.f110702b = originalCall;
                this.f110703c = (AbstractC32275i) function1;
                this.f110704d = AbstractC3006f0.m8696B(scope, new C3004e2(AbstractC3006f0.m8725s(scope.getCoroutineContext())));
                break;
            default:
                AbstractC22676k.m65750j(originalCall, "originalCall");
                AbstractC22676k.m65750j(scope, "scope");
                this.f110702b = originalCall;
                this.f110703c = (AbstractC32275i) function1;
                this.f110704d = AbstractC3006f0.m8696B(scope, new C3004e2(AbstractC3006f0.m8725s(scope.getCoroutineContext())));
                break;
        }
    }
}
