package xj0;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: xj0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0003¨\u0006\b"}, m65681d2 = {"Ljava/nio/ByteBuffer;", "a", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "REVISION_ONE", "b", "getONE_AS_PAYLOAD", "ONE_AS_PAYLOAD", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38337c {

    /* JADX INFO: renamed from: a */
    private static final ByteBuffer f164258a;

    /* JADX INFO: renamed from: b */
    private static final ByteBuffer f164259b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        byteBufferAllocate.put((byte) 1);
        f164258a = byteBufferAllocate;
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1);
        byteBufferAllocate2.put((byte) 1);
        f164259b = byteBufferAllocate2;
    }

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer m122896a() {
        return f164258a;
    }
}
