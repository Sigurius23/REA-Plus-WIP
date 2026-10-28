package r53;

import android.graphics.Rect;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: r53.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC30942c implements Closeable {

    /* JADX INFO: renamed from: w */
    public ByteBuffer f127668w;

    /* JADX INFO: renamed from: x */
    public C30945f[] f127669x;

    /* JADX INFO: renamed from: y */
    public final Rect f127670y;

    /* JADX INFO: renamed from: z */
    public final AtomicReference f127671z;

    public AbstractC30942c(ByteBuffer byteBuffer, Rect rect, C30945f[] c30945fArr, Runnable runnable) {
        this.f127668w = byteBuffer;
        this.f127669x = c30945fArr;
        this.f127670y = rect;
        this.f127671z = new AtomicReference(runnable);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo95188b(int i13, int i14, int i15, int i16);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f127668w = null;
        Runnable runnable = (Runnable) this.f127671z.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        this.f127669x = new C30945f[0];
    }
}
