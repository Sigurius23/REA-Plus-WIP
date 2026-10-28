package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xj0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\t¨\u0006\f"}, m65681d2 = {"Lxj0/j;", "Lxj0/b;", "Llt0/j;", "revision", "<init>", "(Llt0/j;)V", "rev", "", "alarmId", "(Llt0/j;I)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38358j extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.j$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lxj0/j$a;", "", "<init>", "()V", "Llt0/j;", "revision", "", "alarmId", "Ljava/nio/ByteBuffer;", "c", "(Llt0/j;I)Ljava/nio/ByteBuffer;", "", "b", "(BB)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: xj0.j$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42646a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f164278a;

            static {
                int[] iArr = new int[EnumC24733j.values().length];
                try {
                    iArr[EnumC24733j.REVISION_1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC24733j.REVISION_4.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f164278a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final ByteBuffer m122915b(byte revision, byte alarmId) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(2).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(revision);
            byteBufferOrder.put(alarmId);
            return byteBufferOrder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final ByteBuffer m122916c(EnumC24733j revision, int alarmId) {
            int i13 = C42646a.f164278a[revision.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    return m122915b(revision.getValue(), (byte) alarmId);
                }
                throw new IllegalArgumentException(AbstractC2875y.m8296i(revision.getValue(), "0x43 (GetAlarmTime) of revision ", " is not valid!"));
            }
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(new byte[]{revision.getValue()}).order(AbstractC24727d.m72403a());
            AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38358j(EnumC24733j revision) {
        super(EnumC24728e.GET_ALARM_TIME, INSTANCE.m122916c(revision, 0), null, 4, null);
        AbstractC22676k.m65750j(revision, "revision");
        if (revision != EnumC24733j.REVISION_1) {
            throw new IllegalArgumentException("Only packet revision 1 can call this constructor");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38358j(EnumC24733j rev, int i13) {
        super(EnumC24728e.GET_ALARM_TIME, INSTANCE.m122916c(rev, i13), null, 4, null);
        AbstractC22676k.m65750j(rev, "rev");
        if (rev != EnumC24733j.REVISION_4) {
            throw new IllegalArgumentException("Only packet revision 4 can call this constructor");
        }
    }
}
