package yj0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: yj0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0011\u0010\u0003\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m65681d2 = {"Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "payload", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39591e {
    /* JADX INFO: renamed from: a */
    public static final ByteBuffer m126473a() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) 2);
        return byteBufferOrder;
    }
}
