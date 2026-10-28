package xj0;

import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xj0.g1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m65681d2 = {"Lxj0/g1;", "Lxj0/b;", "", "enabled", "<init>", "(Z)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38351g1 extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.g1$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lxj0/g1$a;", "", "<init>", "()V", "", NotificationCompat.CATEGORY_STATUS, "Ljava/nio/ByteBuffer;", "b", "(Z)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122905b(boolean status) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(2).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(EnumC24733j.REVISION_1.getValue());
            byteBufferOrder.put(status ? (byte) 1 : (byte) 0);
            byteBufferOrder.rewind();
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    public C38351g1(boolean z4) {
        super(EnumC24728e.ENABLE_OPTICAL_DATA, INSTANCE.m122905b(z4), null, 4, null);
    }
}
