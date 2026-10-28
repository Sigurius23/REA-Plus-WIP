package a52;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: a52.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Ljava/nio/ByteBuffer;", "a", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "REVISION_ONE", "puffin_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0401h {

    /* JADX INFO: renamed from: a */
    private static final ByteBuffer f1382a;

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1).order(AbstractC24727d.m72403a());
        byteBufferOrder.put((byte) 1);
        f1382a = byteBufferOrder;
    }

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer m1097a() {
        return f1382a;
    }
}
