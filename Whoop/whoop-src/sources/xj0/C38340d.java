package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xj0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m65681d2 = {"Lxj0/d;", "Lxj0/b;", "Llt0/j;", "revision", "<init>", "(Llt0/j;)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38340d extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lxj0/d$a;", "", "<init>", "()V", "Llt0/j;", "revision", "Ljava/nio/ByteBuffer;", "c", "(Llt0/j;)Ljava/nio/ByteBuffer;", "", "alarmId", "b", "(BB)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: xj0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42644a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f164261a;

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
                f164261a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final ByteBuffer m122898b(byte revision, byte alarmId) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(2).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(revision);
            byteBufferOrder.put(alarmId);
            return byteBufferOrder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final ByteBuffer m122899c(EnumC24733j revision) {
            int i13 = C42644a.f164261a[revision.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    return m122898b(revision.getValue(), (byte) -1);
                }
                throw new IllegalArgumentException(AbstractC2875y.m8296i(revision.getValue(), "0x45 (DisableAlarmPacket) of revision ", " is not valid!"));
            }
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(new byte[]{revision.getValue()}).order(AbstractC24727d.m72403a());
            AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38340d(EnumC24733j revision) {
        super(EnumC24728e.DISABLE_ALARM, INSTANCE.m122899c(revision), null, 4, null);
        AbstractC22676k.m65750j(revision, "revision");
    }
}
