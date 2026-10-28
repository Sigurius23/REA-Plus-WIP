package yj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xj0.AbstractC38334b;

/* JADX INFO: renamed from: yj0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"Lyj0/b;", "Lxj0/b;", "", "patternId", "numberOfLoops", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "i", "I", "j", "k", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39588b extends AbstractC38334b {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int patternId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int numberOfLoops;

    /* JADX INFO: renamed from: yj0.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lyj0/b$a;", "", "<init>", "()V", "", "patternId", "numberOfLoops", "Ljava/nio/ByteBuffer;", "a", "(II)Ljava/nio/ByteBuffer;", "", "paddingByte", "B", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ByteBuffer m126471a(int patternId, int numberOfLoops) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(5).order(AbstractC24727d.m72403a());
            AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
            byteBufferOrder.put(0, (byte) patternId);
            byteBufferOrder.put(1, (byte) numberOfLoops);
            byteBufferOrder.put(2, (byte) 0);
            byteBufferOrder.put(3, (byte) 0);
            byteBufferOrder.put(4, (byte) 0);
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    public C39588b(int i13, int i14) {
        super(EnumC24728e.RUN_HAPTICS_PATTERN, INSTANCE.m126471a(i13, i14), null, 4, null);
        this.patternId = i13;
        this.numberOfLoops = i14;
    }

    @Override // xj0.AbstractC38334b, lt0.AbstractC24726c
    public String toString() {
        return AbstractC25012a.m73372e(this.patternId, this.numberOfLoops, "RunHapticsPatternCommandPacket(patternId=", ", numberOfLoops=", ")");
    }
}
