package zj0;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wj0.AbstractC37317a;

/* JADX INFO: renamed from: zj0.k1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lzj0/k1;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "Lzj0/f;", "X", "()Lzj0/f;", "verifyResult", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40738k1 extends C40727h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40738k1(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: X */
    public final EnumC40721f m132227X() {
        ByteBuffer byteBufferM132194S = m132194S();
        if (byteBufferM132194S != null && byteBufferM132194S.limit() > 1) {
            return EnumC40721f.INSTANCE.m132189a(AbstractC37317a.m119536a(byteBufferM132194S.get(1)));
        }
        return EnumC40721f.UNKNOWN;
    }
}
