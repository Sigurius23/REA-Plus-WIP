package wd3;

import ne3.AbstractC26604b;
import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26620j;
import ne3.InterfaceC26633p0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34799a1;
import ud3.C34818h0;

/* JADX INFO: renamed from: wd3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C37170d extends AbstractC34799a1 implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: y */
    public final C34818h0 f158955y;

    /* JADX INFO: renamed from: z */
    public final long f158956z;

    public C37170d(C34818h0 c34818h0, long j7) {
        this.f158955y = c34818h0;
        this.f158956z = j7;
    }

    @Override // ud3.AbstractC34799a1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC26620j mo1940d1() {
        return AbstractC26604b.m79158c(this);
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) {
        AbstractC22676k.m65750j(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: i */
    public final long mo1941i() {
        return this.f158956z;
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: k */
    public final C34818h0 mo1942k() {
        return this.f158955y;
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }
}
