package zj0;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: zj0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lzj0/e;", "Lzj0/d;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "g", "Ljava/lang/String;", "K", "()Ljava/lang/String;", "packetName", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40718e extends C40715d {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String packetName;

    public C40718e(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.packetName = "BiasOffsetSetResponsePacket";
    }

    @Override // zj0.C40715d, zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }
}
