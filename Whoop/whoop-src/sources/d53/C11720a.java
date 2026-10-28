package d53;

import bc3.InterfaceC2992b2;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3045p;
import bc3.InterfaceC3052r;
import bc3.InterfaceC3056s0;
import c93.InterfaceC4351m;
import java.util.concurrent.CancellationException;
import lc3.InterfaceC23833c;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: d53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11720a implements InterfaceC3052r {

    /* JADX INFO: renamed from: w */
    public final String f37871w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC3052r f37872x;

    public C11720a(String str, InterfaceC3052r interfaceC3052r) {
        this.f37871w = str;
        this.f37872x = interfaceC3052r;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3045p attachChild(InterfaceC3052r child) {
        AbstractC22676k.m65750j(child, "child");
        return this.f37872x.attachChild(child);
    }

    @Override // bc3.InterfaceC3027k1
    public final /* synthetic */ void cancel() {
        this.f37872x.cancel();
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m operation) {
        AbstractC22676k.m65750j(operation, "operation");
        return this.f37872x.fold(obj, operation);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return this.f37872x.get(key);
    }

    @Override // bc3.InterfaceC3027k1
    public final CancellationException getCancellationException() {
        return this.f37872x.getCancellationException();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC38174i getChildren() {
        return this.f37872x.getChildren();
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return this.f37872x.getKey();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC23833c getOnJoin() {
        return this.f37872x.getOnJoin();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3027k1 getParent() {
        return this.f37872x.getParent();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(Function1 handler) {
        AbstractC22676k.m65750j(handler, "handler");
        return this.f37872x.invokeOnCompletion(handler);
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isActive() {
        return this.f37872x.isActive();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCancelled() {
        return this.f37872x.isCancelled();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCompleted() {
        return this.f37872x.isCompleted();
    }

    @Override // bc3.InterfaceC3027k1
    public final Object join(InterfaceC30057d interfaceC30057d) {
        return this.f37872x.join(interfaceC30057d);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return this.f37872x.minusKey(key);
    }

    @Override // bc3.InterfaceC3052r
    public final void parentCancelled(InterfaceC2992b2 parentJob) {
        AbstractC22676k.m65750j(parentJob, "parentJob");
        this.f37872x.parentCancelled(parentJob);
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3027k1 plus(InterfaceC3027k1 other) {
        AbstractC22676k.m65750j(other, "other");
        return this.f37872x.plus(other);
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean start() {
        return this.f37872x.start();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("UserChildJob(userId='", this.f37871w, "')");
    }

    @Override // bc3.InterfaceC3027k1
    public final void cancel(CancellationException cancellationException) {
        this.f37872x.cancel(cancellationException);
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(boolean z4, boolean z13, Function1 handler) {
        AbstractC22676k.m65750j(handler, "handler");
        return this.f37872x.invokeOnCompletion(z4, z13, handler);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        return this.f37872x.plus(context);
    }

    @Override // bc3.InterfaceC3027k1
    public final /* synthetic */ boolean cancel(Throwable th3) {
        return this.f37872x.cancel(th3);
    }
}
