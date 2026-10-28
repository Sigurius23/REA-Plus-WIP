package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xj0.h0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lxj0/h0;", "Lxj0/b;", "Llt0/j;", "revision", "Lxj0/i0;", "params", "<init>", "(Llt0/j;Lxj0/i0;)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38353h0 extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.h0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lxj0/h0$a;", "", "<init>", "()V", "Lxj0/i0;", "params", "Llt0/j;", "revision", "Ljava/nio/ByteBuffer;", "b", "(Lxj0/i0;Llt0/j;)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: xj0.h0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42645a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f164272a;

            static {
                int[] iArr = new int[EnumC24733j.values().length];
                try {
                    iArr[EnumC24733j.REVISION_1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC24733j.REVISION_2.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f164272a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122909b(AbstractC38356i0 params, EnumC24733j revision) {
            int i13 = C42645a.f164272a[revision.ordinal()];
            if (i13 == 1) {
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(new byte[]{revision.getValue()}).order(AbstractC24727d.m72403a());
                AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
                return byteBufferOrder;
            }
            if (i13 != 2) {
                throw new IllegalArgumentException("Run alarm packet doesn't support " + revision);
            }
            AbstractC22676k.m65748h(params, "null cannot be cast to non-null type com.whoop.ble.packets.commandpackets.RunAlarmPacketParams.Rev2");
            ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(2).order(AbstractC24727d.m72403a());
            byteBufferOrder2.put(revision.getValue());
            byteBufferOrder2.put((byte) ((AbstractC38356i0.b) params).getStrapAlarmId());
            return byteBufferOrder2;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38353h0(EnumC24733j revision, AbstractC38356i0 params) {
        super(EnumC24728e.RUN_ALARM, INSTANCE.m122909b(params, revision), null, 4, null);
        AbstractC22676k.m65750j(revision, "revision");
        AbstractC22676k.m65750j(params, "params");
    }
}
