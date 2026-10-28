package io.ktor.utils.p228io;

import bc3.C2996c2;
import bc3.C3023j1;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3045p;
import bc3.InterfaceC3052r;
import bc3.InterfaceC3056s0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import java.util.concurrent.CancellationException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: io.ktor.utils.io.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C20027t implements InterfaceC3027k1 {

    /* JADX INFO: renamed from: w */
    public final C2996c2 f75134w;

    /* JADX INFO: renamed from: x */
    public final C20020m f75135x;

    public C20027t(C2996c2 c2996c2, C20020m c20020m) {
        this.f75134w = c2996c2;
        this.f75135x = c20020m;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3045p attachChild(InterfaceC3052r interfaceC3052r) {
        return this.f75134w.attachChild(interfaceC3052r);
    }

    @Override // bc3.InterfaceC3027k1
    public final void cancel(CancellationException cancellationException) {
        this.f75134w.cancel(cancellationException);
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return AbstractC12889b.m36236B(this.f75134w, obj, interfaceC4351m);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return AbstractC12889b.m36238D(this.f75134w, key);
    }

    @Override // bc3.InterfaceC3027k1
    public final CancellationException getCancellationException() {
        return this.f75134w.getCancellationException();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC38174i getChildren() {
        return this.f75134w.getChildren();
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return C3023j1.f12041w;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(Function1 function1) {
        return this.f75134w.invokeOnCompletion(function1);
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isActive() {
        return this.f75134w.isActive();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCancelled() {
        return this.f75134w.isCancelled();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCompleted() {
        return this.f75134w.isCompleted();
    }

    @Override // bc3.InterfaceC3027k1
    public final Object join(InterfaceC30057d interfaceC30057d) {
        return this.f75134w.join(interfaceC30057d);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return AbstractC12889b.m36251Q(this.f75134w, key);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        return AbstractC12889b.m36254T(this.f75134w, context);
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean start() {
        return this.f75134w.start();
    }

    public final String toString() {
        return "ChannelJob[" + this.f75134w + ']';
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(boolean z4, boolean z13, Function1 function1) {
        return this.f75134w.invokeOnCompletion(z4, z13, function1);
    }
}
