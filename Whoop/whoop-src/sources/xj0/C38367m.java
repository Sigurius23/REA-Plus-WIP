package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;

/* JADX INFO: renamed from: xj0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m65681d2 = {"Lxj0/m;", "Lxj0/b;", "Lst0/v;", "deviceType", "<init>", "(Lst0/v;)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38367m extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.m$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lxj0/m$a;", "", "<init>", "()V", "Lst0/v;", "deviceType", "Llt0/e;", "c", "(Lst0/v;)Llt0/e;", "Ljava/nio/ByteBuffer;", "d", "(Lst0/v;)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: xj0.m$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42647a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f164285a;

            static {
                int[] iArr = new int[EnumC32978v.values().length];
                try {
                    iArr[EnumC32978v.MONUMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC32978v.SYMPHONY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC32978v.GEN_4.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC32978v.MAVERICK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC32978v.GOOSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f164285a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final EnumC24728e m122927c(EnumC32978v deviceType) {
            int i13 = C42647a.f164285a[deviceType.ordinal()];
            if (i13 == 1 || i13 == 2) {
                return EnumC24728e.GET_CLOCK;
            }
            if (i13 == 3 || i13 == 4 || i13 == 5) {
                return EnumC24728e.GET_CLOCK_DEPRECATED;
            }
            throw new IllegalArgumentException("Unsupported device type: " + deviceType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final ByteBuffer m122928d(EnumC32978v deviceType) {
            int i13 = C42647a.f164285a[deviceType.ordinal()];
            if (i13 == 1 || i13 == 2) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(1).order(AbstractC24727d.m72403a());
                byteBufferOrder.put(EnumC24733j.REVISION_1.getValue());
                byteBufferOrder.rewind();
                return byteBufferOrder;
            }
            if (i13 == 3 || i13 == 4 || i13 == 5) {
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(0).order(AbstractC24727d.m72403a());
                AbstractC22676k.m65749i(byteBufferOrder2, "order(...)");
                return byteBufferOrder2;
            }
            throw new IllegalArgumentException("Unsupported device type: " + deviceType);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C38367m(EnumC32978v deviceType) {
        AbstractC22676k.m65750j(deviceType, "deviceType");
        Companion companion = INSTANCE;
        super(companion.m122927c(deviceType), companion.m122928d(deviceType), deviceType);
    }
}
