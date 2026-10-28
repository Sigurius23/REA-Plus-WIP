package bk0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import oh2.C27940c;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pt0.EnumC29510a;
import uk0.C35048b;
import ws0.C37605a;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import zj0.C40727h;

/* JADX INFO: renamed from: bk0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 42\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010\bR\u0011\u00103\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b2\u0010\b¨\u00065"}, m65681d2 = {"Lbk0/a;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "G", "()Ljava/lang/String;", "toString", "Lpt0/a;", "f", "Lpt0/a;", "Y", "()Lpt0/a;", "colorWay", "", "g", "J", "getBoardId", "()J", "boardId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/String;", "getVersionHash", "versionHash", "", "b0", "()S", "revision", "Lws0/a;", "X", "()Lws0/a;", "batteryLevel", "", "d0", "()Z", "isCharging", "c0", "isBeingCharged", "Loh2/c;", "a", "()Loh2/c;", "hardwareVersion", "Loh2/b;", "d", "()Loh2/b;", "firmwareVersion", "Z", "deviceName", "a0", "deviceSerial", "i", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3347a extends C40727h {

    /* JADX INFO: renamed from: i */
    private static final a f12997i = new a(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC29510a colorWay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long boardId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String versionHash;

    /* JADX INFO: renamed from: bk0.a$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0006¨\u0006#"}, m65681d2 = {"Lbk0/a$a;", "", "<init>", "()V", "", "LENGTH_REVISION", "I", "LENGTH_BATTERY_LEVEL", "LENGTH_COLORWAY", "LENGTH_IS_CHARGING", "LENGTH_IS_BEING_CHARGED", "LENGTH_BOARD_ID", "LENGTH_HARDWARE_FAMILY", "LENGTH_FW_MAJOR", "LENGTH_FW_MINOR", "LENGTH_FW_PATCH", "LENGTH_FW_EXTRA", "LENGTH_VERSION_HASH", "LENGTH_DEVICE_NAME", "LENGTH_DEVICE_SERIAL", "OFFSET_REVISION", "OFFSET_BATTERY_LEVEL", "OFFSET_COLORWAY", "OFFSET_IS_CHARGING", "OFFSET_IS_BEING_CHARGED", "OFFSET_BOARD_ID", "OFFSET_HARDWARE_FAMILY", "OFFSET_FW_MAJOR", "OFFSET_FW_MINOR", "OFFSET_FW_PATCH", "OFFSET_FW_EXTRA", "OFFSET_VERSION_HASH", "OFFSET_DEVICE_NAME", "OFFSET_DEVICE_SERIAL", "MIN_BATTERY_LEVEL", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3347a(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
        EnumC29510a.Companion companion = EnumC29510a.INSTANCE;
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        this.colorWay = companion.m90157a(byteBufferM132194S.get(2));
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        this.boardId = C35048b.m110782b(byteBufferM132194S2.get(5));
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        byte[] bArrArray = byteBufferM132194S3.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        ByteBuffer byteBufferM132194S4 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S4);
        this.versionHash = AbstractC39414r.m125862H0(new String(bArrArray, byteBufferM132194S4.arrayOffset() + 29, 25, AbstractC39397a.f169546a), (char) 0);
    }

    /* JADX INFO: renamed from: G */
    private final String m9658G() {
        StringBuilder sb4 = new StringBuilder("Puffin HelloResponsePacket:");
        sb4.append("\nRevision: " + ((int) m9664b0()));
        sb4.append("\nBattery Level: " + m9659X().getLevel());
        sb4.append("\nColorWay: " + this.colorWay);
        sb4.append("\nisCharging: " + m9667d0());
        sb4.append("\nisBeingCharged: " + m9665c0());
        sb4.append("\nHardware Version: " + m9662a().m84332d());
        sb4.append("\nFirmware Version: " + m9666d().mo84319a());
        sb4.append("\nVersion Hash: " + this.versionHash);
        sb4.append("\nDeviceName: " + m9661Z());
        sb4.append("\nDeviceSerial: " + m9663a0());
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: X */
    public final C37605a m9659X() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return new C37605a(Math.max((int) byteBufferM132194S.get(1), 1));
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final EnumC29510a getColorWay() {
        return this.colorWay;
    }

    /* JADX INFO: renamed from: Z */
    public final String m9661Z() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byte[] bArrArray = byteBufferM132194S.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        return AbstractC39414r.m125862H0(new String(bArrArray, byteBufferM132194S2.arrayOffset() + 54, 16, AbstractC39397a.f169546a), (char) 0);
    }

    /* JADX INFO: renamed from: a */
    public final C27940c m9662a() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byteBufferM132194S.position(9);
        C27940c.Companion companion = C27940c.INSTANCE;
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        C27940c c27940cM84338b = companion.m84338b(byteBufferM132194S2);
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        byteBufferM132194S3.rewind();
        return c27940cM84338b;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m9663a0() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byte[] bArrArray = byteBufferM132194S.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        return AbstractC39414r.m125862H0(new String(bArrArray, byteBufferM132194S2.arrayOffset() + 70, 16, AbstractC39397a.f169546a), (char) 0);
    }

    /* JADX INFO: renamed from: b0 */
    public final short m9664b0() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return C35048b.m110782b(byteBufferM132194S.get(0));
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m9665c0() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return byteBufferM132194S.get(4) == 1;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC27939b m9666d() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        long jM110782b = C35048b.m110782b(byteBufferM132194S.get(13));
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        long jM110782b2 = C35048b.m110782b(byteBufferM132194S2.get(17));
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        long jM110782b3 = C35048b.m110782b(byteBufferM132194S3.get(21));
        ByteBuffer byteBufferM132194S4 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S4);
        return new InterfaceC27939b.b(jM110782b, jM110782b2, jM110782b3, C35048b.m110783d(byteBufferM132194S4.getInt(25)));
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m9667d0() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return byteBufferM132194S.get(3) == 1;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return m9658G();
    }
}
