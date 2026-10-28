package zj0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.AbstractC35050d;
import wj0.AbstractC37317a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: zj0.t0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lzj0/t0;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "f", "I", "getRevision", "()I", "revision", "g", "getIndex", "index", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "isValidFFKey", "()Z", "", "X", "()Ljava/lang/String;", "featureFlagKey", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40757t0 extends C40727h {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int revision;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isValidFFKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40757t0(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        this.revision = AbstractC37317a.m119536a(byteBufferM132194S.get(0));
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        this.index = AbstractC37317a.m119536a(byteBufferM132194S2.get(1));
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        this.isValidFFKey = AbstractC37317a.m119536a(byteBufferM132194S3.get(2)) == 1;
    }

    /* JADX INFO: renamed from: X */
    public final String m132249X() {
        byte[] bArr = new byte[32];
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byteBufferM132194S.position(3);
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        byteBufferM132194S2.get(bArr, 0, 32);
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        byteBufferM132194S3.rewind();
        return AbstractC39414r.m125862H0(AbstractC35050d.m110789a(bArr), (char) 0);
    }
}
