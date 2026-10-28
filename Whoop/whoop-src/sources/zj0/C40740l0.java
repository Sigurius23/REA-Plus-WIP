package zj0;

import ck0.C4777a;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zj0.l0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, m65681d2 = {"Lzj0/l0;", "Lck0/a;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "k", "Ljava/lang/String;", "K", "packetName", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40740l0 extends C4777a {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String packetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40740l0(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.packetName = "Rev2HistoricalDataResultResponsePacket";
    }

    @Override // ck0.C4777a, zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return getPacketName() + " (Result: " + m132197V() + ")";
    }
}
