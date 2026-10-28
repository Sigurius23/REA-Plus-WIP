package ek0;

import bg3.C3237a;
import com.whoop.connectivityCore.batteryPack.models.BatteryPackType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lt0.AbstractC24727d;
import m83.AbstractC25265s;
import ot0.C28323a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pt0.EnumC29510a;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import uk0.AbstractC35050d;
import ws0.AbstractC37606b;
import ws0.C37605a;
import yb3.AbstractC39414r;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: ek0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010$\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010&\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010(\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0014\u0010*\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u0014\u0010,\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u0014\u0010.\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0017\u00102\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b/\u0010\u0019\u001a\u0004\b0\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0011\u0010F\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bE\u0010\bR\u0011\u0010H\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bG\u0010\b¨\u0006I"}, m65681d2 = {"Lek0/d;", "Lot0/a;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "Ltr2/n;", "e", "Ltr2/n;", "logger", "Lrr2/c;", "f", "Ll83/h;", "U", "()Lrr2/c;", "crashReporter", "kotlin.jvm.PlatformType", "g", "Ljava/nio/ByteBuffer;", "cachedPayload", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "revisionLength", "i", "btAddressLength", "j", "deviceNameLength", "k", "batteryLevelLength", "l", "colorwayLength", "m", "revisionOffset", "n", "btAddressOffset", "o", "deviceNameOffset", "p", "batteryLevelOffset", "q", "colorWayOffset", "r", "hardwareFamilyOffset", "s", "getRevision", "()I", "revision", "Lws0/a;", "t", "Lws0/a;", "getBatteryLevel", "()Lws0/a;", "batteryLevel", "Lpt0/a;", "u", "Lpt0/a;", "getColorWay", "()Lpt0/a;", "colorWay", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "v", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "W", "()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "hardwareFamily", "T", "btAddress", "V", "deviceName", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13277d extends C28323a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ByteBuffer cachedPayload;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int revisionLength;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int btAddressLength;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int deviceNameLength;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int batteryLevelLength;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int colorwayLength;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int revisionOffset;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int btAddressOffset;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int deviceNameOffset;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int batteryLevelOffset;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int colorWayOffset;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int hardwareFamilyOffset;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int revision;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C37605a batteryLevel;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final EnumC29510a colorWay;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final BatteryPackType hardwareFamily;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13277d(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        this.logger = InterfaceC34116n.INSTANCE.m107848a("BatteryPackInfo");
        this.crashReporter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C3237a(0));
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        ByteBuffer byteBufferOrder = byteBufferM85784Q.duplicate().order(AbstractC24727d.m72403a());
        this.cachedPayload = byteBufferOrder;
        this.revisionLength = 1;
        this.btAddressLength = 6;
        this.deviceNameLength = 16;
        this.batteryLevelLength = 2;
        this.colorwayLength = 1;
        int i13 = this.revisionOffset;
        this.btAddressOffset = i13 + 1;
        this.deviceNameOffset = i13 + 7;
        int i14 = i13 + 23;
        this.batteryLevelOffset = i14;
        int i15 = i13 + 25;
        this.colorWayOffset = i15;
        int i16 = i13 + 26;
        this.hardwareFamilyOffset = i16;
        this.revision = byteBufferOrder.get(i13);
        this.batteryLevel = new C37605a(AbstractC37606b.m120660a(byteBufferOrder.getShort(i14)));
        this.colorWay = EnumC29510a.INSTANCE.m90157a(byteBufferOrder.get(i15));
        this.hardwareFamily = BatteryPackType.INSTANCE.m19627a(byteBufferOrder.get(i16));
    }

    /* JADX INFO: renamed from: U */
    private final InterfaceC31766c m37331U() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: renamed from: T */
    public final String m37332T() {
        byte[] bArr = new byte[this.btAddressLength];
        ByteBuffer cachedPayload = this.cachedPayload;
        AbstractC22676k.m65749i(cachedPayload, "cachedPayload");
        synchronized (cachedPayload) {
            this.cachedPayload.position(this.btAddressOffset);
            this.cachedPayload.get(bArr, 0, this.btAddressLength);
            this.cachedPayload.rewind();
        }
        return AbstractC25265s.m74110N0(AbstractC39414r.m125873S(AbstractC40586b.m131620e(bArr)), ":", null, null, null, 62);
    }

    /* JADX INFO: renamed from: V */
    public final String m37333V() {
        byte[] bArr = new byte[this.deviceNameLength];
        this.logger.mo85219j(AbstractC11266d.m30461o("Device name: ", AbstractC40586b.m131617b(this.cachedPayload)), new AbstractC30556a.a[0]);
        ByteBuffer cachedPayload = this.cachedPayload;
        AbstractC22676k.m65749i(cachedPayload, "cachedPayload");
        synchronized (cachedPayload) {
            this.cachedPayload.position(this.deviceNameOffset);
            this.cachedPayload.get(bArr, 0, this.deviceNameLength);
            this.cachedPayload.rewind();
        }
        return AbstractC39414r.m125862H0(AbstractC35050d.m110789a(bArr), (char) 0);
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final BatteryPackType getHardwareFamily() {
        return this.hardwareFamily;
    }

    @Override // ot0.C28323a, lt0.AbstractC24726c
    public String toString() {
        this.logger.mo85219j(AbstractC11266d.m30461o("BatteryPack Payload: ", AbstractC40586b.m131617b(this.cachedPayload)), new AbstractC30556a.a[0]);
        try {
            StringBuilder sb4 = new StringBuilder("BatteryPackInfo:");
            sb4.append("\nRevision: " + this.revision);
            sb4.append("\nBT address: " + m37332T());
            sb4.append("\nDevice name: " + m37333V());
            sb4.append("\nBattery level: " + this.batteryLevel);
            sb4.append("\nColorWay: " + this.colorWay);
            sb4.append("\nHW family: " + this.hardwareFamily);
            return sb4.toString();
        } catch (BufferUnderflowException e5) {
            this.logger.mo85222m("Error converting BatteryPackInfo to string: " + e5, new AbstractC30556a.a[0]);
            m37331U().mo98631p(e5);
            return "BatteryPackInfo: Error converting to string";
        }
    }
}
