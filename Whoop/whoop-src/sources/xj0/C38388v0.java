package xj0;

import fk2.C14554a;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;
import uk0.C35048b;

/* JADX INFO: renamed from: xj0.v0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lxj0/v0;", "Lxj0/b;", "Lfk2/a;", "time", "Lst0/v;", "deviceType", "<init>", "(Lfk2/a;Lst0/v;)V", "", "toString", "()Ljava/lang/String;", "i", "Lfk2/a;", "j", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38388v0 extends AbstractC38334b {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C14554a time;

    /* JADX INFO: renamed from: xj0.v0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m65681d2 = {"Lxj0/v0$a;", "", "<init>", "()V", "Lst0/v;", "deviceType", "Llt0/e;", "c", "(Lst0/v;)Llt0/e;", "Lfk2/a;", "timeStamp", "Ljava/nio/ByteBuffer;", "d", "(Lfk2/a;Lst0/v;)Ljava/nio/ByteBuffer;", "", "LENGTH_REVISION", "I", "LENGTH_EPOCH_SECONDS", "LENGTH_EPOCH_SUBSECONDS", "OFFSET_REVISION", "OFFSET_EPOCH_SECONDS", "OFFSET_EPOCH_SUBSECONDS", "LENGTH_BODY", "OFFSET_DEPRECATED_EPOCH_SECONDS", "OFFSET_DEPRECATED_SUB_SECOND", "LENGTH_DEPRECATED_BODY", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: xj0.v0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C42648a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f164302a;

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
                f164302a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final EnumC24728e m122952c(EnumC32978v deviceType) {
            int i13 = C42648a.f164302a[deviceType.ordinal()];
            if (i13 == 1 || i13 == 2) {
                return EnumC24728e.SET_CLOCK;
            }
            if (i13 == 3 || i13 == 4 || i13 == 5) {
                return EnumC24728e.SET_CLOCK_DEPRECATED;
            }
            throw new IllegalArgumentException("Unsupported device type: " + deviceType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final ByteBuffer m122953d(C14554a timeStamp, EnumC32978v deviceType) {
            int i13 = C42648a.f164302a[deviceType.ordinal()];
            if (i13 == 1 || i13 == 2) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(7).order(AbstractC24727d.m72403a());
                byteBufferOrder.put(0, EnumC24733j.REVISION_1.getValue());
                byteBufferOrder.putInt(1, C35048b.f148538a.m110785c(timeStamp.m41580f()));
                byteBufferOrder.putShort(5, (short) timeStamp.m41579e());
                return byteBufferOrder;
            }
            if (i13 != 3 && i13 != 4 && i13 != 5) {
                throw new IllegalArgumentException("Unsupported device type: " + deviceType);
            }
            ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(8).order(AbstractC24727d.m72403a());
            C35048b c35048b = C35048b.f148538a;
            byteBufferOrder2.putInt(0, c35048b.m110785c(timeStamp.m41580f()));
            byteBufferOrder2.putInt(4, c35048b.m110785c(timeStamp.m41579e()));
            return byteBufferOrder2;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C38388v0(C14554a time, EnumC32978v deviceType) {
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(deviceType, "deviceType");
        Companion companion = INSTANCE;
        super(companion.m122952c(deviceType), companion.m122953d(time, deviceType), deviceType);
        this.time = time;
    }

    @Override // xj0.AbstractC38334b, lt0.AbstractC24726c
    public String toString() {
        return "SetClockPacket (" + this.time + ")";
    }
}
