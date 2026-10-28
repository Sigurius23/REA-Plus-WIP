package p390p1;

import bc3.AbstractC3006f0;
import bc3.C2986a0;
import bc3.C2996c2;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import hc3.C17171d;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p000.C17820i;
import p004a2.C0154c;
import p088dc.AbstractC11894a;
import p098dt.AbstractC12350b;
import q83.C30064k;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: p1.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28664s0 implements InterfaceC28691z1, CoroutineExceptionHandler {

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f115954w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC4351m f115955x;

    /* JADX INFO: renamed from: y */
    public final C17171d f115956y;

    /* JADX INFO: renamed from: z */
    public C2996c2 f115957z;

    public C28664s0(InterfaceC30063j interfaceC30063j, InterfaceC4351m interfaceC4351m) {
        this.f115954w = interfaceC30063j;
        this.f115955x = interfaceC4351m;
        this.f115956y = AbstractC3006f0.m8708b(interfaceC30063j.plus(interfaceC30063j.get(C0154c.f477x) != null ? this : C30064k.f122676w));
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: a */
    public final void mo15502a() {
        C2996c2 c2996c2 = this.f115957z;
        if (c2996c2 != null) {
            c2996c2.cancel(AbstractC11894a.m31955d("Old job was still running!", null));
        }
        this.f115957z = AbstractC3006f0.m8732z(this.f115956y, null, null, this.f115955x, 3);
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: c */
    public final void mo15503c() {
        C2996c2 c2996c2 = this.f115957z;
        if (c2996c2 != null) {
            c2996c2.mo8819p(new C28672u0());
        }
        this.f115957z = null;
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: d */
    public final void mo15504d() {
        C2996c2 c2996c2 = this.f115957z;
        if (c2996c2 != null) {
            c2996c2.mo8819p(new C28672u0());
        }
        this.f115957z = null;
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return AbstractC5583n.m16744C(this, obj, interfaceC4351m);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC5583n.m16745D(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return C2986a0.f11990w;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(InterfaceC30063j interfaceC30063j, Throwable th3) throws Throwable {
        C0154c c0154c = (C0154c) interfaceC30063j.get(C0154c.f477x);
        if (c0154c != null) {
            AbstractC12350b.m34576Y(th3, new C17820i(2, c0154c, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.f115954w.get(C2986a0.f11990w);
        if (coroutineExceptionHandler == null) {
            throw th3;
        }
        coroutineExceptionHandler.handleException(interfaceC30063j, th3);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC5583n.m16759S(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC5583n.m16761U(this, interfaceC30063j);
    }
}
