package ak0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wj0.AbstractC37317a;
import zj0.C40727h;

/* JADX INFO: renamed from: ak0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lak0/i;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "f", "I", "REVISION_LENGTH", "g", "REVISION_OFFSET", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "TIMEOUT_OFFSET", "i", "getRevision", "()I", "revision", "", "X", "()J", "timeout", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class C0947i extends C40727h {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int REVISION_LENGTH;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int REVISION_OFFSET;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int TIMEOUT_OFFSET;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int revision;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0947i(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
        this.REVISION_LENGTH = 1;
        this.TIMEOUT_OFFSET = this.REVISION_OFFSET + 1;
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        this.revision = AbstractC37317a.m119536a(byteBufferM132194S.get(this.REVISION_OFFSET));
    }

    /* JADX INFO: renamed from: X */
    public final long m2382X() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119538c(byteBufferM132194S.getInt(this.TIMEOUT_OFFSET));
    }
}
