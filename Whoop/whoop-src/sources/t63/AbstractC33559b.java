package t63;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t63.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC33559b {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f140038a;

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        AbstractC22676k.m65749i(byteBufferOrder, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f140038a = byteBufferOrder;
    }

    /* JADX INFO: renamed from: a */
    public static final void m105978a(ByteBuffer byteBuffer, ByteBuffer destination, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i13, destination.array(), destination.arrayOffset() + i15, i14);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i13);
        byteBufferDuplicate.limit(i13 + i14);
        ByteBuffer byteBufferDuplicate2 = destination.duplicate();
        byteBufferDuplicate2.position(i15);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }
}
