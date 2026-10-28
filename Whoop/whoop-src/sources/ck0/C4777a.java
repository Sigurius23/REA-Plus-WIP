package ck0;

import fk2.C14554a;
import hk0.C17367b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;
import uk0.C35048b;
import wj0.EnumC37318b;
import zj0.C40727h;

/* JADX INFO: renamed from: ck0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, m65681d2 = {"Lck0/a;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "f", "Ljava/lang/String;", "K", "()Ljava/lang/String;", "packetName", "Lhk0/b;", "g", "Lhk0/b;", "header", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "getCommandId", "()I", "commandId", "i", "Y", "state", "X", "()Ljava/nio/ByteBuffer;", "", "a0", "()Z", "isSuccess", "Lfk2/a;", "Z", "()Lfk2/a;", "timeStamp", "j", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class C4777a extends C40727h {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String packetName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C17367b header;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int commandId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4777a(ByteBuffer buffer) {
        super(buffer, EnumC32978v.MONUMENT);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.packetName = "Rev2CommandResponsePacket";
        this.header = new C17367b(buffer);
        this.commandId = C35048b.f148538a.m110786e(buffer.getShort(20));
        this.state = buffer.get(26) & 255;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    /* JADX INFO: renamed from: X */
    public final ByteBuffer m15046X() {
        return getPayload();
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: Z */
    public final C14554a m15048Z() {
        return this.header.m49180X();
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m15049a0() {
        return m132197V() == EnumC37318b.SUCCESS;
    }
}
