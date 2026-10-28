package zj0;

import fk2.C14554a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import uk0.C35048b;

/* JADX INFO: renamed from: zj0.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0016\u0010$\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0011¨\u0006'"}, m65681d2 = {"Lzj0/p;", "Lzj0/h;", "Lzj0/g;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "b0", "()Z", "", "message", "Ll83/a0;", "a0", "(Ljava/lang/String;)V", "Lfk2/a;", "Z", "()Lfk2/a;", "toString", "()Ljava/lang/String;", "Ltr2/n;", "f", "Ltr2/n;", "logger", "g", "Lfk2/a;", "timeStamp", "", "X", "()J", "seconds", "Y", "subseconds", "K", "packetName", "getTime", "time", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40748p extends C40727h implements InterfaceC40724g {

    /* JADX INFO: renamed from: i */
    private static final int f175667i = 4;

    /* JADX INFO: renamed from: j */
    private static final int f175668j = 4;

    /* JADX INFO: renamed from: k */
    private static final int f175669k = 0;

    /* JADX INFO: renamed from: l */
    private static final int f175670l = f175669k + 4;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C14554a timeStamp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40748p(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
        this.logger = InterfaceC34116n.INSTANCE.m107848a("GetClockResponsePacket");
    }

    /* JADX INFO: renamed from: a0 */
    private final void m132236a0(String message) {
        this.logger.mo85222m(message, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: b0 */
    private final boolean m132237b0() {
        if (m132194S() == null) {
            return false;
        }
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return byteBufferM132194S.limit() >= f175670l + f175668j;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K */
    public String getPacketName() {
        return "GetClockResponsePacket";
    }

    /* JADX INFO: renamed from: X */
    public final long m132238X() {
        if (!m132237b0()) {
            m132236a0("Can't query seconds, packet seems invalid");
            return 0L;
        }
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return C35048b.m110783d(byteBufferM132194S.getInt(f175669k));
    }

    /* JADX INFO: renamed from: Y */
    public final long m132239Y() {
        if (!m132237b0()) {
            m132236a0("Can't query subseconds, packet seems invalid");
            return 0L;
        }
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return C35048b.m110783d(byteBufferM132194S.getInt(f175670l));
    }

    /* JADX INFO: renamed from: Z */
    public final C14554a m132240Z() {
        if (!m132237b0()) {
            m132236a0("Can't query time stamp, packet seems invalid");
            return null;
        }
        if (this.timeStamp == null) {
            this.timeStamp = new C14554a(m132238X(), m132239Y());
        }
        return this.timeStamp;
    }

    @Override // zj0.InterfaceC40724g
    public C14554a getTime() {
        return m132240Z();
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return super.toString() + " Time:" + m132240Z();
    }
}
