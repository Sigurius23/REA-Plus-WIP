package lt0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import mt0.AbstractC25931a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.InterfaceC34116n;
import uk0.C35048b;

/* JADX INFO: renamed from: lt0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H ¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\bJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H$¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010&R\u0011\u0010-\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001fR$\u00103\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010&\"\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b4\u0010&R\u001c\u00108\u001a\u00020\u00108 @ X \u000e¢\u0006\f\u001a\u0004\b6\u0010&\"\u0004\b7\u00102¨\u00069"}, m65681d2 = {"Llt0/i;", "", "Ljava/nio/ByteBuffer;", "data", "<init>", "(Ljava/nio/ByteBuffer;)V", "Ll83/a0;", "m", "()V", "o", "Lmt0/a;", "role", "p", "(Lmt0/a;)V", "l", "j", "", "a", "()Ljava/lang/Integer;", "", "looseCheck", "q", "(Z)Z", "Llt0/n;", "r", "(Z)Llt0/n;", "Ljava/nio/ByteBuffer;", "", "b", "B", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()B", "startOfFrame", "Ltr2/n;", "c", "Ltr2/n;", "logger", "e", "()I", "offsetFrame", "f", "offsetLength", "frameLength", "g", "()Ljava/nio/ByteBuffer;", "rawBuffer", "frameByte", "value", "d", "n", "(I)V", "length", "i", "totalLength", "getCrc$connectivity_core_release", "k", "crc", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24732i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ByteBuffer data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte startOfFrame;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public AbstractC24732i(ByteBuffer data) {
        AbstractC22676k.m65750j(data, "data");
        this.data = data;
        this.startOfFrame = (byte) -86;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("PacketFrame");
    }

    /* JADX INFO: renamed from: a */
    public abstract Integer mo72410a();

    /* JADX INFO: renamed from: b */
    public final byte m72411b() {
        return this.data.get(getOffsetFrame());
    }

    /* JADX INFO: renamed from: c */
    public abstract int getFrameLength();

    /* JADX INFO: renamed from: d */
    public final int m72413d() {
        return C35048b.f148538a.m110786e(this.data.getShort(getOffsetLength()));
    }

    /* JADX INFO: renamed from: e */
    public abstract int getOffsetFrame();

    /* JADX INFO: renamed from: f */
    public abstract int getOffsetLength();

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ByteBuffer getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public byte getStartOfFrame() {
        return this.startOfFrame;
    }

    /* JADX INFO: renamed from: i */
    public final int m72418i() {
        return getFrameLength() + m72413d();
    }

    /* JADX INFO: renamed from: j */
    public final void m72419j() {
        Integer numMo72410a = mo72410a();
        AbstractC22676k.m65747g(numMo72410a);
        mo72420k(numMo72410a.intValue());
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo72420k(int i13);

    /* JADX INFO: renamed from: l */
    public abstract void mo72421l(AbstractC25931a role);

    /* JADX INFO: renamed from: m */
    public final void m72422m() {
        this.data.put(getOffsetFrame(), getStartOfFrame());
    }

    /* JADX INFO: renamed from: n */
    public final void m72423n(int i13) {
        this.data.putShort(getOffsetLength(), (short) i13);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo72424o();

    /* JADX INFO: renamed from: p */
    public abstract void mo72425p(AbstractC25931a role);

    /* JADX INFO: renamed from: q */
    public final boolean m72426q(boolean looseCheck) {
        return mo72427r(looseCheck) == EnumC24737n.SUCCESS;
    }

    /* JADX INFO: renamed from: r */
    public abstract EnumC24737n mo72427r(boolean looseCheck);
}
