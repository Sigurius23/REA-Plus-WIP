package mt0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.AbstractC24732i;
import lt0.EnumC24737n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import tt0.C34158c;

/* JADX INFO: renamed from: mt0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001dR\u001a\u0010-\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b%\u0010\u001dR\u001a\u0010/\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b(\u0010\u001dR\u001a\u00102\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010\u001dR\u001a\u00105\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\u001dR$\u0010:\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00118P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u00109¨\u0006;"}, m65681d2 = {"Lmt0/c;", "Llt0/i;", "Ljava/nio/ByteBuffer;", "data", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "dataArray", "([B)V", "Ll83/a0;", "o", "()V", "Lmt0/a;", "role", "p", "(Lmt0/a;)V", "l", "", "a", "()Ljava/lang/Integer;", "", "looseCheck", "Llt0/n;", "r", "(Z)Llt0/n;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/nio/ByteBuffer;", "Ltr2/n;", "e", "Ltr2/n;", "logger", "f", "I", "u", "payloadLength", "g", "offsetFrame", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "offsetLength", "i", "t", "offsetCrc", "j", "c", "frameLength", "value", "s", "k", "(I)V", "crc", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25933c extends AbstractC24732i {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ByteBuffer data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int payloadLength;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int offsetFrame;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int offsetLength;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int offsetCrc;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int frameLength;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25933c(ByteBuffer data) {
        super(data);
        AbstractC22676k.m65750j(data, "data");
        this.data = data;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("Gen4PacketFrame");
        this.payloadLength = 2;
        this.offsetLength = getOffsetFrame() + 1;
        this.offsetCrc = getPayloadLength() + getOffsetLength();
        this.frameLength = getOffsetCrc() + 1;
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: a */
    public Integer mo72410a() {
        return C34158c.f143182a.m107941d(this.data, getOffsetLength(), getPayloadLength());
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getFrameLength() {
        return this.frameLength;
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getOffsetFrame() {
        return this.offsetFrame;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C25933c) && AbstractC22676k.m65745e(this.data, ((C25933c) other).data);
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getOffsetLength() {
        return this.offsetLength;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: k */
    public void mo72420k(int i13) {
        this.data.put(getOffsetCrc(), (byte) i13);
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: l */
    public void mo72421l(AbstractC25931a role) {
        AbstractC22676k.m65750j(role, "role");
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: o */
    public void mo72424o() {
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: p */
    public void mo72425p(AbstractC25931a role) {
        AbstractC22676k.m65750j(role, "role");
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: r */
    public EnumC24737n mo72427r(boolean looseCheck) {
        if (this.data.limit() == 0) {
            if (!looseCheck) {
                this.logger.mo85222m("Packet Frame has no data", new AbstractC30556a.a[0]);
            }
            return EnumC24737n.FAIL_OTHER;
        }
        if (m72411b() != getStartOfFrame()) {
            if (!looseCheck) {
                this.logger.mo85222m("Packet Frame has an invalid SOF", new AbstractC30556a.a[0]);
            }
            return EnumC24737n.FAIL_OTHER;
        }
        if (this.data.limit() < getFrameLength()) {
            if (!looseCheck) {
                this.logger.mo85222m("Packet Frame is too short", new AbstractC30556a.a[0]);
            }
            return EnumC24737n.FAIL_OTHER;
        }
        Integer numMo72410a = mo72410a();
        if (numMo72410a != null) {
            if (numMo72410a.intValue() == m76715s()) {
                return EnumC24737n.SUCCESS;
            }
        }
        if (!looseCheck) {
            this.logger.mo85222m("Packet Frame invalid CRC", new AbstractC30556a.a[0]);
        }
        return EnumC24737n.FAIL_CRC8;
    }

    /* JADX INFO: renamed from: s */
    public int m76715s() {
        return this.data.get(getOffsetCrc());
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public int getOffsetCrc() {
        return this.offsetCrc;
    }

    public String toString() {
        return "Gen4PacketFrame(data=" + this.data + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public int getPayloadLength() {
        return this.payloadLength;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C25933c(byte[] dataArray) {
        AbstractC22676k.m65750j(dataArray, "dataArray");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(dataArray).order(AbstractC24727d.m72403a());
        AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
        this(byteBufferOrder);
    }
}
