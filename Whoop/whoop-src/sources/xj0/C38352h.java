package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xj0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m65681d2 = {"Lxj0/h;", "Lxj0/b;", "", "trimPage", "wrapCount", "<init>", "(II)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38352h extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.h$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lxj0/h$a;", "", "<init>", "()V", "", "trimPage", "wrapCount", "Ljava/nio/ByteBuffer;", "b", "(II)Ljava/nio/ByteBuffer;", "Lxj0/h;", "a", "()Lxj0/h;", "trimAllPacket", "TRIM_ALL", "I", "UNTRIM_ALL", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C38352h m122906a() {
            return new C38352h(-16843010, -16843010);
        }

        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122907b(int trimPage, int wrapCount) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(AbstractC24727d.m72403a());
            byteBufferOrder.putInt(trimPage);
            byteBufferOrder.putInt(wrapCount);
            byteBufferOrder.rewind();
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    public C38352h(int i13, int i14) {
        super(EnumC24728e.FORCE_TRIM, INSTANCE.m122907b(i13, i14), null, 4, null);
    }
}
