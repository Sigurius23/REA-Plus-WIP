package mt0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.AbstractC24732i;
import lt0.EnumC24737n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import tt0.AbstractC34159d;
import tt0.C34158c;
import uk0.C35048b;
import yb0.AbstractC39383f;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: mt0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u0000 02\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR.\u0010(\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020)8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0011\u00101\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b0\u0010%¨\u00062"}, m65681d2 = {"Lmt0/b;", "", "Llt0/i;", "frame", "<init>", "(Llt0/i;)V", "", "i", "()Z", "Llt0/n;", "j", "()Llt0/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llt0/i;", "b", "()Llt0/i;", "I", "offsetData", "c", "minLength", "Ltr2/n;", "d", "Ltr2/n;", "logger", "Ljava/nio/ByteBuffer;", "value", "e", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "g", "(Ljava/nio/ByteBuffer;)V", "payload", "", "crc", "()J", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(J)V", "payloadCrc", "payloadCrcOffset", "f", "rawData", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25932b {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC24732i frame;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int offsetData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int minLength;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ByteBuffer payload;

    /* JADX INFO: renamed from: mt0.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lmt0/b$a;", "", "<init>", "()V", "Llt0/i;", "frame", "Lmt0/b;", "a", "(Llt0/i;)Lmt0/b;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C25932b m76714a(AbstractC24732i frame) {
            ByteBuffer byteBufferOrder;
            C25932b c25932b;
            AbstractC22676k.m65750j(frame, "frame");
            ByteBuffer byteBufferM72416g = frame.getData();
            int iMo72412c = frame.getFrameLength();
            if (AbstractC34159d.m107944c(byteBufferM72416g)) {
                byteBufferOrder = ByteBuffer.wrap(byteBufferM72416g.array()).order(AbstractC24727d.m72403a());
                AbstractC22676k.m65747g(byteBufferOrder);
            } else {
                byteBufferOrder = ByteBuffer.allocate(AbstractC34159d.m107942a(byteBufferM72416g.limit())).order(AbstractC24727d.m72403a());
                ByteBuffer byteBufferDuplicate = byteBufferM72416g.duplicate();
                byteBufferDuplicate.position(0);
                byteBufferOrder.put(byteBufferDuplicate);
                byteBufferOrder.rewind();
            }
            ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(byteBufferOrder.limit() + iMo72412c + 4).order(AbstractC24727d.m72403a());
            if (frame instanceof C25935e) {
                AbstractC22676k.m65747g(byteBufferOrder2);
                c25932b = new C25932b(new C25935e(byteBufferOrder2));
            } else if (frame instanceof C25934d) {
                AbstractC22676k.m65747g(byteBufferOrder2);
                c25932b = new C25932b(new C25934d(byteBufferOrder2));
            } else if (frame instanceof C25936f) {
                AbstractC22676k.m65747g(byteBufferOrder2);
                c25932b = new C25932b(new C25936f(byteBufferOrder2));
            } else if (frame instanceof C25938h) {
                AbstractC22676k.m65747g(byteBufferOrder2);
                c25932b = new C25932b(new C25938h(byteBufferOrder2));
            } else {
                AbstractC22676k.m65747g(byteBufferOrder2);
                c25932b = new C25932b(new C25933c(byteBufferOrder2));
            }
            c25932b.getFrame().m72422m();
            c25932b.getFrame().mo72424o();
            c25932b.getFrame().mo72425p(AbstractC25931a.b.f102398b);
            if (frame instanceof C25936f) {
                c25932b.getFrame().mo72421l(AbstractC25931a.a.f102397b);
            } else {
                c25932b.getFrame().mo72421l(AbstractC25931a.c.f102399b);
            }
            c25932b.getFrame().m72423n(byteBufferOrder.limit() + 4);
            c25932b.getFrame().m72419j();
            c25932b.m76711g(byteBufferOrder);
            byteBufferOrder.rewind();
            c25932b.m76707h(C34158c.f143182a.m107940c(byteBufferOrder));
            byteBufferOrder.rewind();
            return c25932b;
        }

        private Companion() {
        }
    }

    public C25932b(AbstractC24732i frame) {
        AbstractC22676k.m65750j(frame, "frame");
        this.frame = frame;
        int iMo72412c = frame.getFrameLength();
        this.offsetData = iMo72412c;
        this.minLength = iMo72412c + 4;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("FramedPacket");
    }

    /* JADX INFO: renamed from: d */
    private final long m76705d() {
        return C35048b.m110783d(m76710f().getInt(m76706e()));
    }

    /* JADX INFO: renamed from: e */
    private final int m76706e() {
        return m76710f().limit() - 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m76707h(long j7) {
        m76710f().putInt(m76706e(), C35048b.f148538a.m110785c(j7));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC24732i getFrame() {
        return this.frame;
    }

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m76709c() {
        ByteBuffer byteBuffer = this.payload;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        if (this.frame.getData().limit() <= this.minLength) {
            return null;
        }
        int iLimit = (this.frame.getData().limit() - this.offsetData) - 4;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iLimit).order(AbstractC24727d.m72403a());
        byteBufferOrder.put(ByteBuffer.wrap(this.frame.getData().array(), this.frame.getData().arrayOffset() + this.offsetData, iLimit));
        byteBufferOrder.rewind();
        this.payload = byteBufferOrder;
        return byteBufferOrder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C25932b) && AbstractC22676k.m65745e(this.frame, ((C25932b) other).frame);
    }

    /* JADX INFO: renamed from: f */
    public final ByteBuffer m76710f() {
        return this.frame.getData();
    }

    /* JADX INFO: renamed from: g */
    public final void m76711g(ByteBuffer byteBuffer) {
        this.payload = byteBuffer;
        AbstractC34159d.m107945d(this.frame.getData(), this.offsetData, byteBuffer);
    }

    public int hashCode() {
        return this.frame.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m76712i() {
        return m76713j() == EnumC24737n.SUCCESS;
    }

    /* JADX INFO: renamed from: j */
    public final EnumC24737n m76713j() {
        if (!this.frame.m72426q(false)) {
            this.logger.mo85222m("Packet validation failed: Frame validation failed", new AbstractC30556a.a[0]);
            EnumC24737n enumC24737nMo72427r = this.frame.mo72427r(false);
            return enumC24737nMo72427r == EnumC24737n.FAIL_OTHER ? EnumC24737n.FAIL_FRAME_INVALID : enumC24737nMo72427r;
        }
        if (m76710f().limit() < this.minLength) {
            this.logger.mo85222m("Packet validation failed: data too short", new AbstractC30556a.a[0]);
            return EnumC24737n.FAIL_TOO_SHORT;
        }
        if (!AbstractC34159d.m107943b(m76710f().limit())) {
            this.logger.mo85222m("Packet validation failed: data unaligned", new AbstractC30556a.a[0]);
            return EnumC24737n.FAIL_UNALIGNED;
        }
        if (m76709c() == null) {
            this.logger.mo85222m("Packet validation failed: no payload", new AbstractC30556a.a[0]);
            return EnumC24737n.FAIL_NO_PAYLOAD;
        }
        C34158c c34158c = C34158c.f143182a;
        ByteBuffer byteBufferM76709c = m76709c();
        AbstractC22676k.m65747g(byteBufferM76709c);
        if (c34158c.m107938a(byteBufferM76709c, m76705d())) {
            return EnumC24737n.SUCCESS;
        }
        ByteBuffer byteBufferM76709c2 = m76709c();
        AbstractC22676k.m65747g(byteBufferM76709c2);
        long jM107940c = c34158c.m107940c(byteBufferM76709c2);
        long jM76705d = m76705d();
        String strM131617b = AbstractC40586b.m131617b(m76710f());
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(jM107940c, "Payload validation failed: CRC failure. Computed: ", " Expected: ");
        sbM125596b.append(jM76705d);
        sbM125596b.append(" Full Packet: ");
        sbM125596b.append(strM131617b);
        interfaceC34116n.mo85222m(sbM125596b.toString(), new AbstractC30556a.a[0]);
        return EnumC24737n.FAIL_CRC32;
    }

    public String toString() {
        return "FramedPacket(frame=" + this.frame + ")";
    }
}
