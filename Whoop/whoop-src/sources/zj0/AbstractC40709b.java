package zj0;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: zj0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lzj0/b;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "X", "()J", "responseValue", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40709b extends C40727h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC40709b(ByteBuffer byteBuffer) {
        super(byteBuffer, null, 2, 0 == true ? 1 : 0);
        AbstractC22676k.m65747g(byteBuffer);
    }

    /* JADX INFO: renamed from: X */
    public final long m132180X() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return C35048b.m110783d(byteBufferM132194S.getInt(0));
    }
}
