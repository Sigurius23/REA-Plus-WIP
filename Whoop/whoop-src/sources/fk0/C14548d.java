package fk0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: fk0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, m65681d2 = {"Lfk0/d;", "Lfk0/g;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "R", "()Z", "", "J", "()Ljava/lang/Long;", "numPackets", "", "e", "()[B", "trimPage", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "wrapCount", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14548d extends AbstractC14551g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14548d(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: J */
    public final Long m41557J() {
        if (!m41558R()) {
            return null;
        }
        ByteBuffer byteBufferM41569Q = m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q);
        return Long.valueOf(C35048b.m110783d(byteBufferM41569Q.getInt(0)));
    }

    /* JADX INFO: renamed from: R */
    public final boolean m41558R() {
        if (m41569Q() == null) {
            return false;
        }
        ByteBuffer byteBufferM41569Q = m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q);
        return byteBufferM41569Q.limit() >= 12;
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m41559e() {
        if (!m41558R()) {
            return null;
        }
        ByteBuffer byteBufferM41569Q = m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q);
        byte[] bArr = new byte[4];
        byteBufferM41569Q.position(4);
        byteBufferM41569Q.get(bArr, 0, 4);
        byteBufferM41569Q.rewind();
        return bArr;
    }

    /* JADX INFO: renamed from: w */
    public final byte[] m41560w() {
        if (!m41558R()) {
            return null;
        }
        ByteBuffer byteBufferM41569Q = m41569Q();
        AbstractC22676k.m65747g(byteBufferM41569Q);
        byte[] bArr = new byte[4];
        byteBufferM41569Q.position(8);
        byteBufferM41569Q.get(bArr, 0, 4);
        return bArr;
    }
}
