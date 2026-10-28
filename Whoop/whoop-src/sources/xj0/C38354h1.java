package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;

/* JADX INFO: renamed from: xj0.h1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lxj0/h1;", "Lxj0/b;", "", "enabled", "Lst0/v;", "deviceType", "<init>", "(ZLst0/v;)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38354h1 extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.h1$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lxj0/h1$a;", "", "<init>", "()V", "", "enabled", "Ljava/nio/ByteBuffer;", "a", "(Z)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ByteBuffer m122910a(boolean enabled) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(2).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(EnumC24733j.REVISION_1.getValue());
            byteBufferOrder.put(enabled ? (byte) 1 : (byte) 0);
            byteBufferOrder.rewind();
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C38354h1(boolean z4, EnumC32978v enumC32978v, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? EnumC32978v.MAVERICK : enumC32978v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38354h1(boolean z4, EnumC32978v deviceType) {
        super(EnumC24728e.TOGGLE_IMU_MODE, INSTANCE.m122910a(z4), deviceType);
        AbstractC22676k.m65750j(deviceType, "deviceType");
    }
}
