package xj0;

import com.whoop.service.network.model.UserSessionDto;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uk0.AbstractC35050d;

/* JADX INFO: renamed from: xj0.x0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lxj0/x0;", "Lxj0/b;", "", "featureFlag", "", "featureFlagValue", "<init>", "(Ljava/lang/String;Z)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38392x0 extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.x0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lxj0/x0$a;", "", "<init>", "()V", "", "featureFlag", "", "featureFlagValue", "Ljava/nio/ByteBuffer;", "c", "(Ljava/lang/String;Z)Ljava/nio/ByteBuffer;", "originalBuffer", "b", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final ByteBuffer m122960b(ByteBuffer originalBuffer) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32);
            originalBuffer.rewind();
            byteBufferAllocate.put(originalBuffer);
            return byteBufferAllocate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final ByteBuffer m122961c(String featureFlag, boolean featureFlagValue) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(65).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(EnumC24733j.REVISION_1.getValue());
            ByteBuffer byteBufferM122960b = m122960b(AbstractC35050d.m110790b(featureFlag));
            byteBufferOrder.put(byteBufferM122960b.array(), 0, byteBufferM122960b.array().length);
            ByteBuffer byteBufferM122960b2 = m122960b(AbstractC35050d.m110790b(featureFlagValue ? UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE : "2"));
            byteBufferOrder.put(byteBufferM122960b2.array(), 0, byteBufferM122960b2.array().length);
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38392x0(String featureFlag, boolean z4) {
        super(EnumC24728e.SET_FF_VALUE, INSTANCE.m122961c(featureFlag, z4), null, 4, null);
        AbstractC22676k.m65750j(featureFlag, "featureFlag");
    }
}
