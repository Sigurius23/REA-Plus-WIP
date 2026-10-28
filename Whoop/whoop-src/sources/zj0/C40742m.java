package zj0;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wj0.AbstractC37317a;

/* JADX INFO: renamed from: zj0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lzj0/m;", "Lzj0/c;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "", "l", "I", "ALARM_ACTIVE_OFFSET", "", "d0", "()Z", "isAlarmActive", "K", "packetName", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40742m extends AbstractC40712c {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int ALARM_ACTIVE_OFFSET;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40742m(ByteBuffer payload) {
        super(payload, 1);
        AbstractC22676k.m65750j(payload, "payload");
        this.ALARM_ACTIVE_OFFSET = getREVISION_LENGTH() + getREVISION_OFFSET();
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K */
    public String getPacketName() {
        return "GetAlarmTimeResponsePacket";
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m132230d0() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119536a(byteBufferM132194S.get(this.ALARM_ACTIVE_OFFSET)) == 1;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return super.toString() + " isAlarmActive: " + m132230d0();
    }
}
