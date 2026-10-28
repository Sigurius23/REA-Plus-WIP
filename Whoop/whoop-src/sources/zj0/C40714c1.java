package zj0;

import ba2.EnumC2901b;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: zj0.c1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lzj0/c1;", "Lzj0/b;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "f", "Ljava/lang/String;", "K", "packetName", "Lba2/b;", "Y", "()Lba2/b;", "tiaGain", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40714c1 extends AbstractC40709b {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String packetName;

    public C40714c1(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.packetName = "TiaGainGetResponsePacket";
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    /* JADX INFO: renamed from: Y */
    public final EnumC2901b m132187Y() {
        return EnumC2901b.INSTANCE.m8497a((byte) m132180X());
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return super.toString() + " (Gain:" + m132187Y() + ")";
    }
}
