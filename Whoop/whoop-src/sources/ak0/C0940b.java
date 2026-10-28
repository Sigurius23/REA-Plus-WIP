package ak0;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zj0.C40727h;

/* JADX INFO: renamed from: ak0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lak0/b;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "f", "Ljava/lang/String;", "K", "()Ljava/lang/String;", "packetName", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0940b extends C40727h {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String packetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0940b(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
        this.packetName = "EnterHighFreqSyncResponsePacket";
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }
}
