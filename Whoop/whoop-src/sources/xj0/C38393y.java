package xj0;

import java.nio.ByteBuffer;
import l83.InterfaceC23457c;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uk0.C35048b;

/* JADX INFO: renamed from: xj0.y */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lxj0/y;", "Lxj0/b;", "", "index", "", "data", "<init>", "(J[B)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C38393y extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.y$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lxj0/y$a;", "", "<init>", "()V", "", "index", "", "data", "Ljava/nio/ByteBuffer;", "b", "(J[B)Ljava/nio/ByteBuffer;", "", "DATA_LENGTH", "S", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122963b(long index, byte[] data) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(229).order(AbstractC24727d.m72403a());
            C35048b c35048b = C35048b.f148538a;
            ByteBuffer byteBufferPut = byteBufferOrder.putInt(c35048b.m110785c(index)).put(c35048b.m110784a((short) 224)).put(data);
            byteBufferPut.rewind();
            return byteBufferPut;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38393y(long j7, byte[] data) {
        super(EnumC24728e.LOAD_FIRMWARE_DATA, INSTANCE.m122963b(j7, data), null, 4, null);
        AbstractC22676k.m65750j(data, "data");
    }
}
