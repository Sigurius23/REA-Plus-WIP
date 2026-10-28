package zj0;

import com.whoop.domain.model.haptics.HapticsAlarmStatusMessage;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wj0.AbstractC37317a;

/* JADX INFO: renamed from: zj0.v0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lzj0/v0;", "Lzj0/c;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "d0", "()Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;", "statusMessage", "", "K", "()Ljava/lang/String;", "packetName", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40761v0 extends AbstractC40712c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40761v0(ByteBuffer payload) {
        super(payload, 0, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K */
    public String getPacketName() {
        return "SetAlarmTimeResponsePacket";
    }

    /* JADX INFO: renamed from: d0 */
    public final HapticsAlarmStatusMessage m132256d0() {
        if (getRevision() != 3) {
            return HapticsAlarmStatusMessage.UNKNOWN;
        }
        HapticsAlarmStatusMessage.Companion companion = HapticsAlarmStatusMessage.INSTANCE;
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return companion.fromCode(AbstractC37317a.m119536a(byteBufferM132194S.get(1)));
    }
}
