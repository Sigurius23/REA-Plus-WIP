package d53;

import androidx.room.AbstractC1772c1;
import bc3.C3004e2;
import bc3.C3023j1;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3045p;
import bc3.InterfaceC3052r;
import bc3.InterfaceC3056s0;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import lc3.InterfaceC23833c;
import p021av.C2088b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: d53.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11722c implements InterfaceC3061u {

    /* JADX INFO: renamed from: w */
    public final C3004e2 f37875w;

    /* JADX INFO: renamed from: x */
    public final C2088b f37876x;

    public C11722c(C3004e2 c3004e2, C2088b c2088b) {
        this.f37875w = c3004e2;
        this.f37876x = c2088b;
        AbstractC1772c1.m5382S(this, "Video:UserJob");
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3045p attachChild(InterfaceC3052r interfaceC3052r) {
        return this.f37875w.attachChild(new C11720a((String) this.f37876x.invoke(), interfaceC3052r));
    }

    @Override // bc3.InterfaceC3027k1
    public final void cancel(CancellationException cancellationException) {
        this.f37875w.cancel(cancellationException);
    }

    @Override // bc3.InterfaceC3061u
    public final boolean complete() {
        return this.f37875w.m8807L(C23454a0.f92919a);
    }

    @Override // bc3.InterfaceC3061u
    public final boolean completeExceptionally(Throwable exception) {
        AbstractC22676k.m65750j(exception, "exception");
        return this.f37875w.completeExceptionally(exception);
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return AbstractC12889b.m36238D(this, key);
    }

    @Override // bc3.InterfaceC3027k1
    public final CancellationException getCancellationException() {
        return this.f37875w.getCancellationException();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC38174i getChildren() {
        return this.f37875w.getChildren();
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return C3023j1.f12041w;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC23833c getOnJoin() {
        return this.f37875w.getOnJoin();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3027k1 getParent() {
        return this.f37875w.getParent();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(Function1 handler) {
        AbstractC22676k.m65750j(handler, "handler");
        return this.f37875w.invokeOnCompletion(handler);
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isActive() {
        return this.f37875w.isActive();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCancelled() {
        return this.f37875w.isCancelled();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCompleted() {
        return this.f37875w.isCompleted();
    }

    @Override // bc3.InterfaceC3027k1
    public final Object join(InterfaceC30057d interfaceC30057d) {
        return this.f37875w.join(interfaceC30057d);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return AbstractC12889b.m36251Q(this, key);
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3027k1 plus(InterfaceC3027k1 other) {
        AbstractC22676k.m65750j(other, "other");
        return other;
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean start() {
        return this.f37875w.start();
    }

    public final String toString() {
        return "UserJob(userId=" + ((Object) ((String) ((C11721b) this.f37876x.f8256x).f37874w.getValue())) + ")";
    }

    @Override // bc3.InterfaceC3027k1
    public final /* synthetic */ boolean cancel(Throwable th3) {
        this.f37875w.cancel(th3);
        return true;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(boolean z4, boolean z13, Function1 handler) {
        AbstractC22676k.m65750j(handler, "handler");
        return this.f37875w.invokeOnCompletion(z4, z13, handler);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        return AbstractC12889b.m36254T(this.f37875w, context);
    }

    @Override // bc3.InterfaceC3027k1
    public final /* synthetic */ void cancel() {
        this.f37875w.cancel((CancellationException) null);
    }
}
