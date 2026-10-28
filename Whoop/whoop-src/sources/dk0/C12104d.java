package dk0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: dk0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0019"}, m65681d2 = {"Ldk0/d;", "Ldk0/i;", "Ldk0/c;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "T", "()Z", "", "J", "()Ljava/lang/Long;", "numPackets", "", "e", "()[B", "trimPage", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "wrapCount", "n", "trimPageLittleEndian", "z", "wrapCountLittleEndian", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12104d extends AbstractC12109i implements InterfaceC12103c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12104d(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: J */
    public Long mo33433J() {
        if (m33438T()) {
            return Long.valueOf(C35048b.m110783d(m33453R().getInt(0)));
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m33438T() {
        return m33453R().limit() > 12;
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: e */
    public byte[] mo33434e() {
        if (!m33438T()) {
            return null;
        }
        ByteBuffer byteBufferM33453R = m33453R();
        byte[] bArr = new byte[4];
        byteBufferM33453R.position(4);
        byteBufferM33453R.get(bArr, 0, 4);
        byteBufferM33453R.rewind();
        return bArr;
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: n */
    public byte[] mo33435n() {
        if (!m33438T()) {
            return null;
        }
        ByteBuffer byteBufferM33453R = m33453R();
        byte[] bArr = new byte[4];
        byteBufferM33453R.position(4);
        byteBufferM33453R.get(bArr, 0, 4).order(AbstractC24727d.m72403a());
        byteBufferM33453R.rewind();
        return AbstractC25260n.m74035K0(bArr);
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: w */
    public byte[] mo33436w() {
        if (!m33438T()) {
            return null;
        }
        ByteBuffer byteBufferM33453R = m33453R();
        byte[] bArr = new byte[4];
        byteBufferM33453R.position(8);
        byteBufferM33453R.get(bArr, 0, 4);
        return bArr;
    }

    @Override // dk0.InterfaceC12103c
    /* JADX INFO: renamed from: z */
    public byte[] mo33437z() {
        if (!m33438T()) {
            return null;
        }
        ByteBuffer byteBufferM33453R = m33453R();
        byte[] bArr = new byte[4];
        byteBufferM33453R.position(8);
        byteBufferM33453R.get(bArr, 0, 4).order(AbstractC24727d.m72403a());
        byteBufferM33453R.rewind();
        return AbstractC25260n.m74035K0(bArr);
    }
}
