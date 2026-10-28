package zj0;

import com.whoop.connectivityCore.batteryPack.models.BatteryPackType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pt0.EnumC29510a;
import uk0.AbstractC35050d;
import uk0.C35048b;
import yb3.AbstractC39414r;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: zj0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006\""}, m65681d2 = {"Lzj0/o;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "f", "S", "getRevision", "()S", "revision", "", "g", "Z", "isBatteryPackInstalled", "()Z", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "hardwareFamily", "Lpt0/a;", "i", "Lpt0/a;", "getColorWay", "()Lpt0/a;", "colorWay", "", "X", "()Ljava/lang/String;", "btAddress", "Y", "deviceName", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40746o extends C40727h {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final short revision;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isBatteryPackInstalled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final BatteryPackType hardwareFamily;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC29510a colorWay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40746o(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        this.revision = C35048b.m110782b(byteBufferM132194S.get(0));
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        this.isBatteryPackInstalled = byteBufferM132194S2.get(1) == 1;
        BatteryPackType.Companion companion = BatteryPackType.INSTANCE;
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        this.hardwareFamily = companion.m19627a(byteBufferM132194S3.get(26));
        EnumC29510a.Companion companion2 = EnumC29510a.INSTANCE;
        ByteBuffer byteBufferM132194S4 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S4);
        this.colorWay = companion2.m90157a(byteBufferM132194S4.get(27));
    }

    /* JADX INFO: renamed from: X */
    public final String m132233X() {
        byte[] bArr = new byte[6];
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byteBufferM132194S.position(2);
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        byteBufferM132194S2.get(bArr, 0, 6);
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        byteBufferM132194S3.rewind();
        return AbstractC25265s.m74110N0(AbstractC39414r.m125873S(AbstractC40586b.m131620e(bArr)), ":", null, null, null, 62);
    }

    /* JADX INFO: renamed from: Y */
    public final String m132234Y() {
        byte[] bArr = new byte[16];
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byteBufferM132194S.position(8);
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        byteBufferM132194S2.get(bArr, 0, 16);
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        byteBufferM132194S3.rewind();
        return AbstractC39414r.m125862H0(AbstractC35050d.m110789a(bArr), (char) 0);
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final BatteryPackType getHardwareFamily() {
        return this.hardwareFamily;
    }
}
