package xj0;

import com.whoop.domain.model.haptics.NotificationHapticsPattern;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24733j;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: xj0.k0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;", "Ljava/nio/ByteBuffer;", "b", "(Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38362k0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final ByteBuffer m122920b(NotificationHapticsPattern notificationHapticsPattern) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(AbstractC24727d.m72403a());
        byteBufferOrder.put(EnumC24733j.REVISION_1.getValue());
        byteBufferOrder.put((byte) notificationHapticsPattern.getWaveFormEffect1());
        byteBufferOrder.put((byte) notificationHapticsPattern.getWaveFormEffect2());
        byteBufferOrder.put((byte) notificationHapticsPattern.getWaveFormEffect3());
        byteBufferOrder.put((byte) notificationHapticsPattern.getWaveFormEffect4());
        byteBufferOrder.put((byte) notificationHapticsPattern.getWaveFormEffect5());
        byteBufferOrder.put((byte) notificationHapticsPattern.getWaveFormEffect6());
        byteBufferOrder.put((byte) notificationHapticsPattern.getWaveFormEffect7());
        byteBufferOrder.put((byte) notificationHapticsPattern.getWaveFormEffect8());
        byteBufferOrder.putShort(notificationHapticsPattern.getLoopControlForEffects());
        byteBufferOrder.put((byte) notificationHapticsPattern.getOverallWaveformLoopControl());
        byteBufferOrder.flip();
        return byteBufferOrder;
    }
}
