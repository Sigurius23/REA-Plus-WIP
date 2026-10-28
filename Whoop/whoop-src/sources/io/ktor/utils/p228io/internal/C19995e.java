package io.ktor.utils.p228io.internal;

import java.nio.ByteBuffer;
import p479s4.AbstractC32131l;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35743a;
import w63.C36866a;
import x63.InterfaceC38034f;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C19995e implements InterfaceC38034f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75047w;

    public /* synthetic */ C19995e(int i13) {
        this.f75047w = i13;
    }

    /* JADX INFO: renamed from: b */
    private final void m55793b() {
    }

    /* JADX INFO: renamed from: h */
    private final void m55794h() {
    }

    @Override // x63.InterfaceC38034f
    /* JADX INFO: renamed from: a1 */
    public void mo55795a1(Object instance) {
        switch (this.f75047w) {
            case 0:
                AbstractC22676k.m65750j(instance, "instance");
                return;
            case 1:
                C36866a instance2 = (C36866a) instance;
                AbstractC22676k.m65750j(instance2, "instance");
                if (instance2 != C36866a.f157703m) {
                    throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
                }
                return;
            default:
                C36866a instance3 = (C36866a) instance;
                AbstractC22676k.m65750j(instance3, "instance");
                AbstractC35743a.f152017a.mo55795a1(instance3);
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f75047w) {
            case 0:
                AbstractC32131l.m100074h(this);
                break;
            case 1:
                AbstractC32131l.m100074h(this);
                break;
            default:
                AbstractC32131l.m100074h(this);
                break;
        }
    }

    @Override // x63.InterfaceC38034f
    public final void dispose() {
        switch (this.f75047w) {
            case 0:
            case 1:
                break;
            default:
                AbstractC35743a.f152017a.dispose();
                break;
        }
    }

    @Override // x63.InterfaceC38034f
    /* JADX INFO: renamed from: t0 */
    public final Object mo55796t0() {
        switch (this.f75047w) {
            case 0:
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(AbstractC19997g.f75048a);
                AbstractC22676k.m65749i(byteBufferAllocateDirect, "allocateDirect(BUFFER_SIZE)");
                return new C20000j(byteBufferAllocateDirect, 8);
            case 1:
                return C36866a.f157703m;
            default:
                return (C36866a) AbstractC35743a.f152017a.mo55796t0();
        }
    }
}
