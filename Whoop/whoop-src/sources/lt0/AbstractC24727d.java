package lt0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lt0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, m65681d2 = {"Ljava/nio/ByteBuffer;", "", "b", "(Ljava/nio/ByteBuffer;)Ljava/lang/Byte;", "Ljava/nio/ByteOrder;", "a", "Ljava/nio/ByteOrder;", "()Ljava/nio/ByteOrder;", "BYTE_ORDER", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24727d {

    /* JADX INFO: renamed from: a */
    private static final ByteOrder f96720a;

    static {
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        AbstractC22676k.m65749i(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        f96720a = LITTLE_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static final ByteOrder m72403a() {
        return f96720a;
    }

    /* JADX INFO: renamed from: b */
    public static final Byte m72404b(ByteBuffer byteBuffer) {
        AbstractC22676k.m65750j(byteBuffer, "<this>");
        if (byteBuffer.limit() > 0) {
            return Byte.valueOf(byteBuffer.get(0));
        }
        return null;
    }
}
