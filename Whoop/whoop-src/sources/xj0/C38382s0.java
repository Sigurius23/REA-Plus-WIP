package xj0;

import com.whoop.domain.model.haptics.AlarmHapticsPattern;
import fk2.C14554a;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uk0.C35048b;

/* JADX INFO: renamed from: xj0.s0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m65681d2 = {"Lxj0/s0;", "Lxj0/b;", "", "strapAlarmId", "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "alarmHapticsPattern", "", "alarmTimeMillis", "<init>", "(ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)V", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38382s0 extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: xj0.s0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lxj0/s0$a;", "", "<init>", "()V", "", "strapAlarmId", "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "alarmHapticsPattern", "", "alarmTimeMillis", "Ljava/nio/ByteBuffer;", "b", "(ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;J)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122943b(int strapAlarmId, AlarmHapticsPattern alarmHapticsPattern, long alarmTimeMillis) {
            C14554a c14554a = new C14554a(alarmTimeMillis, C14554a.c.MILLIS);
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(21).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(EnumC24733j.REVISION_4.getValue());
            byteBufferOrder.put((byte) strapAlarmId);
            C35048b c35048b = C35048b.f148538a;
            byteBufferOrder.putInt(c35048b.m110785c(c14554a.m41580f()));
            byteBufferOrder.putShort((short) c35048b.m110786e((short) c14554a.m41579e()));
            byteBufferOrder.put(AbstractC38384t0.m122945b(alarmHapticsPattern));
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38382s0(int i13, AlarmHapticsPattern alarmHapticsPattern, long j7) {
        super(EnumC24728e.SET_ALARM_TIME, INSTANCE.m122943b(i13, alarmHapticsPattern, j7), null, 4, null);
        AbstractC22676k.m65750j(alarmHapticsPattern, "alarmHapticsPattern");
    }
}
