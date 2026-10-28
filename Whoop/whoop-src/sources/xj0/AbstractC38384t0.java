package xj0;

import com.whoop.domain.model.haptics.AlarmHapticsPattern;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: xj0.t0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "Ljava/nio/ByteBuffer;", "b", "(Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38384t0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final ByteBuffer m122945b(AlarmHapticsPattern alarmHapticsPattern) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(AbstractC24727d.m72403a());
        byteBufferOrder.put((byte) alarmHapticsPattern.getWaveFormEffect1());
        byteBufferOrder.put((byte) alarmHapticsPattern.getWaveFormEffect2());
        byteBufferOrder.put((byte) alarmHapticsPattern.getWaveFormEffect3());
        byteBufferOrder.put((byte) alarmHapticsPattern.getWaveFormEffect4());
        byteBufferOrder.put((byte) alarmHapticsPattern.getWaveFormEffect5());
        byteBufferOrder.put((byte) alarmHapticsPattern.getWaveFormEffect6());
        byteBufferOrder.put((byte) alarmHapticsPattern.getWaveFormEffect7());
        byteBufferOrder.put((byte) alarmHapticsPattern.getWaveFormEffect8());
        byteBufferOrder.putShort(alarmHapticsPattern.getLoopControlForEffects());
        byteBufferOrder.put((byte) alarmHapticsPattern.getOverallWaveformLoopControl());
        byteBufferOrder.put((byte) alarmHapticsPattern.getAlarmDurationInSeconds());
        byteBufferOrder.flip();
        return byteBufferOrder;
    }
}
