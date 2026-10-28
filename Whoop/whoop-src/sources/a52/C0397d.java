package a52;

import fk0.C14548d;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24735l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;
import wj0.EnumC37318b;
import xj0.AbstractC38334b;

/* JADX INFO: renamed from: a52.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m65681d2 = {"La52/d;", "Lxj0/b;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "i", "a", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0397d extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    private static final ByteBuffer f1380j;

    /* JADX INFO: renamed from: a52.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"La52/d$a;", "", "<init>", "()V", "Lfk0/d;", "endPacket", "La52/d;", "b", "(Lfk0/d;)La52/d;", "a", "()La52/d;", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "failurePayload", "Ljava/nio/ByteBuffer;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0397d m1093a() {
            ByteBuffer byteBuffer = C0397d.f1380j;
            AbstractC22676k.m65749i(byteBuffer, "access$getFailurePayload$cp(...)");
            return new C0397d(byteBuffer);
        }

        /* JADX INFO: renamed from: b */
        public final C0397d m1094b(C14548d endPacket) {
            byte[] bArrM41560w;
            AbstractC22676k.m65750j(endPacket, "endPacket");
            byte[] bArrM41559e = endPacket.m41559e();
            if (bArrM41559e == null || (bArrM41560w = endPacket.m41560w()) == null) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(9);
            byteBufferAllocate.order(AbstractC24727d.m72403a());
            byteBufferAllocate.put(EnumC37318b.SUCCESS.getByteValue());
            byteBufferAllocate.put(bArrM41559e);
            byteBufferAllocate.put(bArrM41560w);
            byteBufferAllocate.rewind();
            return new C0397d(byteBufferAllocate);
        }

        private Companion() {
        }
    }

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        byteBufferAllocate.order(AbstractC24727d.m72403a());
        byteBufferAllocate.put(EnumC37318b.FAILURE.getByteValue());
        byteBufferAllocate.rewind();
        f1380j = byteBufferAllocate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397d(ByteBuffer payload) {
        super(EnumC24735l.HISTORICAL_PULL_RESULT, payload, EnumC32978v.PUFFIN);
        AbstractC22676k.m65750j(payload, "payload");
    }
}
