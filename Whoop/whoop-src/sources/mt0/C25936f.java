package mt0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import l83.InterfaceC23462h;
import lt0.AbstractC24732i;
import lt0.EnumC24737n;
import mq2.C25888a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import tt0.C34158c;
import uk0.C35048b;

/* JADX INFO: renamed from: mt0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u001a\u0010&\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\u0010R\u001a\u0010)\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\"R\u001a\u0010+\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b \u0010\"R\u001a\u0010.\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010\u0010R\u001a\u00101\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u0010R\u001a\u00103\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b2\u0010\"R\u001a\u00106\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010\"R$\u0010:\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000e8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b8\u0010\"\"\u0004\b/\u00109¨\u0006;"}, m65681d2 = {"Lmt0/f;", "Llt0/i;", "Ljava/nio/ByteBuffer;", "data", "<init>", "(Ljava/nio/ByteBuffer;)V", "Ll83/a0;", "o", "()V", "Lmt0/a;", "role", "p", "(Lmt0/a;)V", "l", "", "a", "()Ljava/lang/Integer;", "", "looseCheck", "Llt0/n;", "r", "(Z)Llt0/n;", "d", "Ljava/nio/ByteBuffer;", "getData", "()Ljava/nio/ByteBuffer;", "Ltr2/n;", "e", "Ll83/h;", "u", "()Ltr2/n;", "logger", "f", "I", "()I", "offsetFrame", "g", "x", "offsetRevision", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getPayloadLength", "payloadLength", "i", "offsetLength", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "offsetDestination", "k", "y", "offsetSource", "v", "offsetCrc", "m", "c", "frameLength", "value", "t", "(I)V", "crc", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25936f extends AbstractC24732i {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ByteBuffer data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int offsetFrame;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int offsetRevision;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int payloadLength;

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
    public C25936f(ByteBuffer data) {
        super(data);
        AbstractC22676k.m65750j(data, "data");
        this.data = data;
        this.logger = AbstractC30060g.m92088H(new C25888a(8));
        this.offsetRevision = 1;
        this.payloadLength = 2;
        this.offsetLength = 2;
        this.offsetDestination = getOffsetLength() + 2;
        this.offsetSource = m76733w().intValue() + 1;
        this.offsetCrc = m76735y().intValue() + 1;
        this.frameLength = getOffsetCrc() + 2;
    }

    /* JADX INFO: renamed from: u */
    private final InterfaceC34116n m76729u() {
        return (InterfaceC34116n) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC34116n m76730z() {
        return InterfaceC34116n.INSTANCE.m107848a("PuffinPacketFrame");
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
        this.data.put(m76733w().intValue(), role.getByte());
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: o */
    public void mo72424o() {
        this.data.put(m76734x().intValue(), (byte) 1);
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: p */
    public void mo72425p(AbstractC25931a role) {
        AbstractC22676k.m65750j(role, "role");
        this.data.put(m76735y().intValue(), role.getByte());
    }

    @Override // lt0.AbstractC24732i
    /* JADX INFO: renamed from: r */
    public EnumC24737n mo72427r(boolean looseCheck) {
        if (this.data.limit() == 0) {
            if (!looseCheck) {
                m76729u().mo85222m("Packet Frame has no data", new AbstractC30556a.a[0]);
            }
            return EnumC24737n.FAIL_OTHER;
        }
        if (m72411b() != getStartOfFrame()) {
            if (!looseCheck) {
                m76729u().mo85222m("Packet Frame has an invalid SOF", new AbstractC30556a.a[0]);
            }
            return EnumC24737n.FAIL_OTHER;
        }
        if (this.data.limit() < getFrameLength()) {
            if (!looseCheck) {
                m76729u().mo85222m("Packet Frame is too short", new AbstractC30556a.a[0]);
            }
            return EnumC24737n.FAIL_OTHER;
        }
        if (mo72410a().intValue() == m76731t()) {
            return EnumC24737n.SUCCESS;
        }
        if (!looseCheck) {
            m76729u().mo85222m("Packet Frame invalid CRC", new AbstractC30556a.a[0]);
        }
        return EnumC24737n.FAIL_CRC16;
    }

    /* JADX INFO: renamed from: t */
    public int m76731t() {
        return C35048b.f148538a.m110786e(this.data.getShort(getOffsetCrc()));
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public int getOffsetCrc() {
        return this.offsetCrc;
    }

    /* JADX INFO: renamed from: w */
    public Integer m76733w() {
        return Integer.valueOf(this.offsetDestination);
    }

    /* JADX INFO: renamed from: x */
    public Integer m76734x() {
        return Integer.valueOf(this.offsetRevision);
    }

    /* JADX INFO: renamed from: y */
    public Integer m76735y() {
        return Integer.valueOf(this.offsetSource);
    }
}
