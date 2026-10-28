package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uk0.C35048b;

/* JADX INFO: renamed from: xj0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"Lxj0/f;", "Lxj0/b;", "", "intervalSeconds", "durationSeconds", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "i", "I", "j", "k", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38346f extends AbstractC38334b {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int intervalSeconds;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int durationSeconds;

    /* JADX INFO: renamed from: xj0.f$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lxj0/f$a;", "", "<init>", "()V", "", "intervalSeconds", "durationSeconds", "Ljava/nio/ByteBuffer;", "a", "(II)Ljava/nio/ByteBuffer;", "PACKET_REV", "I", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ByteBuffer m122900a(int intervalSeconds, int durationSeconds) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(5).order(AbstractC24727d.m72403a());
            AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
            byteBufferOrder.put(0, (byte) 2);
            C35048b c35048b = C35048b.f148538a;
            byteBufferOrder.putShort(1, (short) c35048b.m110786e((short) intervalSeconds));
            byteBufferOrder.putShort(3, (short) c35048b.m110786e((short) durationSeconds));
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    public C38346f(int i13, int i14) {
        super(EnumC24728e.ENTER_HIGH_FREQ_SYNC, INSTANCE.m122900a(i13, i14), null, 4, null);
        this.intervalSeconds = i13;
        this.durationSeconds = i14;
    }

    @Override // xj0.AbstractC38334b, lt0.AbstractC24726c
    public String toString() {
        return AbstractC25012a.m73372e(this.intervalSeconds, this.durationSeconds, "EnterHighFreqSyncPacket(intervalSeconds = ", ", durationSeconds = ", ")");
    }
}
