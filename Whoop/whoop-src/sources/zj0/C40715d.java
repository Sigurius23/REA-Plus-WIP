package zj0;

import ba2.C2900a;
import java.nio.ByteBuffer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zj0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lzj0/d;", "Lzj0/b;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "f", "Ljava/lang/String;", "K", "packetName", "Lba2/a;", "Y", "()Lba2/a;", "biasOffset", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class C40715d extends AbstractC40709b {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String packetName;

    public C40715d(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.packetName = "BiasOffsetGetResponsePacket";
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    /* JADX INFO: renamed from: Y */
    public final C2900a m132188Y() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return new C2900a(byteBufferM132194S.getInt(0));
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return AbstractC11895b.m31997p(super.toString(), " (Offset:", m132188Y().m8495a(), ")");
    }
}
