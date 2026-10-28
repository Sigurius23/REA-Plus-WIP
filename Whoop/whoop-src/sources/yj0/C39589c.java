package yj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xj0.AbstractC38334b;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yj0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m65681d2 = {"Lyj0/c;", "Lxj0/b;", "", "name", "<init>", "(Ljava/lang/String;)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39589c extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yj0.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"Lyj0/c$a;", "", "<init>", "()V", "", "name", "Ljava/nio/ByteBuffer;", "a", "(Ljava/lang/String;)Ljava/nio/ByteBuffer;", "", "REVISION_OFFSET_SIZE", "I", "PAYLOAD_OFFSET_SIZE", "NULL_TERMINATOR_OFFSET_SIZE", "TOTAL_OFFSET_SIZE", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ByteBuffer m126472a(String name) {
            AbstractC22676k.m65750j(name, "name");
            byte[] bArrM125919D = AbstractC39421y.m125919D(name);
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArrM125919D.length + 6).order(AbstractC24727d.m72403a());
            byteBufferOrder.put((byte) 1);
            byteBufferOrder.put((byte) bArrM125919D.length);
            byteBufferOrder.put(bArrM125919D);
            byteBufferOrder.putInt(0);
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39589c(String name) {
        super(EnumC24728e.SET_ADVERTISING_NAME_HARVARD, INSTANCE.m126472a(name), null, 4, null);
        AbstractC22676k.m65750j(name, "name");
    }
}
