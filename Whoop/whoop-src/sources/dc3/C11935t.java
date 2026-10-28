package dc3;

import bc3.AbstractC2985a;
import bc3.AbstractC3006f0;
import bc3.C3060t1;
import fc3.C14384o;
import hc3.C17191x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobCancellationException;
import p581we.C37199o;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: dc3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C11935t extends AbstractC2985a implements InterfaceC11936u, InterfaceC11927l {

    /* JADX INFO: renamed from: z */
    public final C11923h f39041z;

    public C11935t(InterfaceC30063j interfaceC30063j, C11923h c11923h, boolean z4, boolean z13) {
        super(interfaceC30063j, z4, z13);
        this.f39041z = c11923h;
    }

    @Override // bc3.AbstractC2985a
    /* JADX INFO: renamed from: Z */
    public final void mo8674Z(Throwable th3, boolean z4) {
        if (this.f39041z.m32207h(th3, false) || z4) {
            return;
        }
        AbstractC3006f0.m8727u(this.f11989y, th3);
    }

    @Override // dc3.InterfaceC11938w
    /* JADX INFO: renamed from: a */
    public final Object mo32203a(C14384o c14384o) {
        C11923h c11923h = this.f39041z;
        c11923h.getClass();
        Object objM32189C = C11923h.m32189C(c11923h, c14384o);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM32189C;
    }

    @Override // bc3.AbstractC2985a
    /* JADX INFO: renamed from: a0 */
    public final void mo8675a0(Object obj) {
        this.f39041z.mo32217r(null);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m32235c0(C11934s c11934s) {
        C11923h c11923h = this.f39041z;
        c11923h.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11923h.f39002J;
        while (!atomicReferenceFieldUpdater.compareAndSet(c11923h, null, c11934s)) {
            if (atomicReferenceFieldUpdater.get(c11923h) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(c11923h);
                    C17191x c17191x = AbstractC11925j.f39024q;
                    if (obj != c17191x) {
                        if (obj == AbstractC11925j.f39025r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    C17191x c17191x2 = AbstractC11925j.f39025r;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c11923h, c17191x, c17191x2)) {
                            c11934s.invoke(c11923h.m32213n());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(c11923h) == c17191x);
                }
            }
        }
    }

    @Override // bc3.C3060t1, bc3.InterfaceC3027k1
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo8677u(), null, this);
        }
        mo8819p(cancellationException);
    }

    @Override // dc3.InterfaceC11938w
    /* JADX INFO: renamed from: d */
    public final C37199o mo32204d() {
        return this.f39041z.mo32204d();
    }

    @Override // dc3.InterfaceC11938w
    /* JADX INFO: renamed from: f */
    public final Object mo32205f() {
        return this.f39041z.mo32205f();
    }

    @Override // dc3.InterfaceC11938w
    /* JADX INFO: renamed from: i */
    public final Object mo32208i(InterfaceC30057d interfaceC30057d) {
        return this.f39041z.mo32208i(interfaceC30057d);
    }

    @Override // dc3.InterfaceC11938w
    public final C11918c iterator() {
        C11923h c11923h = this.f39041z;
        c11923h.getClass();
        return new C11918c(c11923h);
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: p */
    public final void mo8819p(CancellationException cancellationException) {
        CancellationException cancellationExceptionM8800W = C3060t1.m8800W(this, cancellationException);
        this.f39041z.m32207h(cancellationExceptionM8800W, true);
        m8818o(cancellationExceptionM8800W);
    }

    @Override // dc3.InterfaceC11939x
    /* JADX INFO: renamed from: r */
    public boolean mo32217r(Throwable th3) {
        return this.f39041z.m32207h(th3, false);
    }

    @Override // dc3.InterfaceC11939x
    /* JADX INFO: renamed from: s */
    public Object mo32218s(Object obj) {
        return this.f39041z.mo32218s(obj);
    }

    @Override // dc3.InterfaceC11939x
    /* JADX INFO: renamed from: t */
    public Object mo32219t(Object obj, InterfaceC30057d interfaceC30057d) {
        return this.f39041z.mo32219t(obj, interfaceC30057d);
    }

    @Override // bc3.C3060t1, bc3.InterfaceC3027k1
    public final /* synthetic */ void cancel() {
        mo8819p(new JobCancellationException(mo8677u(), null, this));
    }

    @Override // bc3.C3060t1, bc3.InterfaceC3027k1
    public final /* synthetic */ boolean cancel(Throwable th3) {
        mo8819p(new JobCancellationException(mo8677u(), null, this));
        return true;
    }
}
