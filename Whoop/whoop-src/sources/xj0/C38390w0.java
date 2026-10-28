package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uk0.AbstractC35050d;

/* JADX INFO: renamed from: xj0.w0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m65681d2 = {"Lxj0/w0;", "Lxj0/b;", "", "deviceConfig", "deviceConfigValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38390w0 extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.w0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lxj0/w0$a;", "", "<init>", "()V", "", "deviceConfig", "deviceConfigValue", "Ljava/nio/ByteBuffer;", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/nio/ByteBuffer;", "originalBuffer", "c", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122955b(String deviceConfig, String deviceConfigValue) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(65).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(EnumC24733j.REVISION_1.getValue());
            ByteBuffer byteBufferM122956c = m122956c(AbstractC35050d.m110790b(deviceConfig));
            byteBufferOrder.put(byteBufferM122956c.array(), 0, byteBufferM122956c.array().length);
            ByteBuffer byteBufferM122956c2 = m122956c(AbstractC35050d.m110790b(deviceConfigValue));
            byteBufferOrder.put(byteBufferM122956c2.array(), 0, byteBufferM122956c2.array().length);
            return byteBufferOrder;
        }

        /* JADX INFO: renamed from: c */
        private final ByteBuffer m122956c(ByteBuffer originalBuffer) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32);
            originalBuffer.rewind();
            byteBufferAllocate.put(originalBuffer);
            return byteBufferAllocate;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38390w0(String deviceConfig, String deviceConfigValue) {
        super(EnumC24728e.SET_DEVICE_CONFIG_VALUE, INSTANCE.m122955b(deviceConfig, deviceConfigValue), null, 4, null);
        AbstractC22676k.m65750j(deviceConfig, "deviceConfig");
        AbstractC22676k.m65750j(deviceConfigValue, "deviceConfigValue");
    }
}
