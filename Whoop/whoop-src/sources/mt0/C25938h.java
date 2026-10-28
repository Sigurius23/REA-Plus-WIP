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
import uk0.C35048b;

/* JADX INFO: renamed from: mt0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 <2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u001e\u0010$R\u001a\u0010*\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u0013R\u001a\u0010,\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b!\u0010$R\u001a\u0010/\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010\u0013R\u001a\u00102\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010\u0013R\u001a\u00104\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b3\u0010$R\u001a\u00107\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010$R$\u0010;\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00118P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b9\u0010$\"\u0004\b0\u0010:¨\u0006="}, m65681d2 = {"Lmt0/h;", "Llt0/i;", "Ljava/nio/ByteBuffer;", "data", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "dataArray", "([B)V", "Ll83/a0;", "o", "()V", "Lmt0/a;", "role", "p", "(Lmt0/a;)V", "l", "", "a", "()Ljava/lang/Integer;", "", "looseCheck", "Llt0/n;", "r", "(Z)Llt0/n;", "d", "Ljava/nio/ByteBuffer;", "getData", "()Ljava/nio/ByteBuffer;", "Ltr2/n;", "e", "Ltr2/n;", "logger", "f", "I", "getPayloadLength", "()I", "payloadLength", "g", "offsetFrame", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "v", "offsetRevision", "i", "offsetLength", "j", "u", "offsetDestination", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "offsetSource", "t", "offsetCrc", "m", "c", "frameLength", "value", "s", "(I)V", "crc", "n", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25938h extends AbstractC24732i {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ByteBuffer data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int payloadLength;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int offsetFrame;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int offsetRevision;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int offsetLength;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int offsetDestination;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int offsetSource;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int offsetCrc;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int frameLength;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25938h(ByteBuffer data) {
        super(data);
        AbstractC22676k.m65750j(data, "data");
        this.data = data;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("Rev2PacketFrame");
        this.payloadLength = 2;
        this.offsetRevision = getOffsetFrame() + 1;
        this.offsetLength = 2;
        this.offsetDestination = getOffsetLength() + 2;
        this.offsetSource = m76739u().intValue() + 1;
        this.offsetCrc = m76741w().intValue() + 1;
        this.frameLength = getOffsetCrc() + 2;
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: a */
    public Integer mo72410a() {
        C34158c c34158c = C34158c.f143182a;
        byte[] bArrArray = this.data.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return Integer.valueOf(c34158c.m107939b(bArrArray, 0, 6));
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

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getOffsetLength() {
        return this.offsetLength;
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: k */
    public void mo72420k(int i13) {
        this.data.putShort(getOffsetCrc(), (short) i13);
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: l */
    public void mo72421l(AbstractC25931a role) {
        AbstractC22676k.m65750j(role, "role");
        this.data.put(m76739u().intValue(), role.getByte());
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: o */
    public void mo72424o() {
        this.data.put(m76740v().intValue(), (byte) 2);
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: p */
    public void mo72425p(AbstractC25931a role) {
        AbstractC22676k.m65750j(role, "role");
        this.data.put(m76741w().intValue(), role.getByte());
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: r */
    public EnumC24737n mo72427r(boolean looseCheck) {
        if (this.data.limit() == 0) {
            if (!looseCheck) {
                this.logger.mo85222m("Rev2 packet frame has no data", new AbstractC30556a.a[0]);
            }
            return EnumC24737n.FAIL_OTHER;
        }
        if (m72411b() != getStartOfFrame()) {
            if (!looseCheck) {
                this.logger.mo85222m("Rev2 packet frame has an invalid SOF", new AbstractC30556a.a[0]);
            }
            return EnumC24737n.FAIL_OTHER;
        }
        if (this.data.limit() < getFrameLength()) {
            if (!looseCheck) {
                this.logger.mo85222m("Rev2 packet frame is too short", new AbstractC30556a.a[0]);
            }
            return EnumC24737n.FAIL_OTHER;
        }
        if (mo72410a().intValue() == m76737s()) {
            return EnumC24737n.SUCCESS;
        }
        if (!looseCheck) {
            this.logger.mo85222m("Rev2 packet frame invalid CRC16", new AbstractC30556a.a[0]);
        }
        return EnumC24737n.FAIL_CRC16;
    }

    /* JADX INFO: renamed from: s */
    public int m76737s() {
        return C35048b.f148538a.m110786e(this.data.getShort(getOffsetCrc()));
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public int getOffsetCrc() {
        return this.offsetCrc;
    }

    /* JADX INFO: renamed from: u */
    public Integer m76739u() {
        return Integer.valueOf(this.offsetDestination);
    }

    /* JADX INFO: renamed from: v */
    public Integer m76740v() {
        return Integer.valueOf(this.offsetRevision);
    }

    /* JADX INFO: renamed from: w */
    public Integer m76741w() {
        return Integer.valueOf(this.offsetSource);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C25938h(byte[] dataArray) {
        AbstractC22676k.m65750j(dataArray, "dataArray");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(dataArray).order(AbstractC24727d.m72403a());
        AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
        this(byteBufferOrder);
    }
}
