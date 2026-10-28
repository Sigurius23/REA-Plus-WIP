package v63;

import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import t63.AbstractC33559b;
import t63.C33558a;
import w63.C36866a;
import x63.AbstractC38032d;

/* JADX INFO: renamed from: v63.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C35748f extends AbstractC38032d {

    /* JADX INFO: renamed from: F */
    public final int f152027F;

    /* JADX INFO: renamed from: G */
    public final C33558a f152028G;

    public C35748f() {
        super(1000);
        this.f152027F = 4096;
        this.f152028G = C33558a.f140037a;
    }

    @Override // x63.AbstractC38032d
    /* JADX INFO: renamed from: i */
    public final Object mo113260i(Object obj) {
        C36866a c36866a = (C36866a) obj;
        c36866a.m118250m();
        c36866a.m118248k();
        return c36866a;
    }

    @Override // x63.AbstractC38032d
    /* JADX INFO: renamed from: k */
    public final void mo55797k(Object obj) {
        C36866a instance = (C36866a) obj;
        AbstractC22676k.m65750j(instance, "instance");
        ByteBuffer instance2 = (ByteBuffer) instance.f77291g;
        this.f152028G.getClass();
        AbstractC22676k.m65750j(instance2, "instance");
        if (!C36866a.f157700j.compareAndSet(instance, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        instance.m118244g();
    }

    @Override // x63.AbstractC38032d
    /* JADX INFO: renamed from: m */
    public final Object mo55798m() {
        this.f152028G.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f152027F);
        AbstractC22676k.m65749i(byteBufferAllocate, "allocate(size)");
        ByteBuffer byteBuffer = AbstractC33559b.f140038a;
        return new C36866a(byteBufferAllocate, this);
    }

    @Override // x63.AbstractC38032d
    /* JADX INFO: renamed from: x */
    public final void mo113261x(Object obj) {
        C36866a instance = (C36866a) obj;
        AbstractC22676k.m65750j(instance, "instance");
        ByteBuffer byteBuffer = (ByteBuffer) instance.f77291g;
        long jLimit = byteBuffer.limit();
        int i13 = this.f152027F;
        if (jLimit != i13) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Buffer size mismatch. Expected: ", ", actual: ");
            sbM30466t.append(byteBuffer.limit());
            throw new IllegalStateException(sbM30466t.toString().toString());
        }
        C36866a c36866a = C36866a.f157703m;
        if (instance == c36866a) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (instance == c36866a) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.m118246i() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.m118245h() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
    }
}
