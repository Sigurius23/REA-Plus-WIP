package xj0;

import fk2.C14554a;
import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uk0.C35048b;

/* JADX INFO: renamed from: xj0.u0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m65681d2 = {"Lxj0/u0;", "Lxj0/b;", "Lfk2/a;", "time", "<init>", "(Lfk2/a;)V", "", "toString", "()Ljava/lang/String;", "i", "Lfk2/a;", "j", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38386u0 extends AbstractC38334b {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C14554a time;

    /* JADX INFO: renamed from: xj0.u0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lxj0/u0$a;", "", "<init>", "()V", "Lfk2/a;", "timeStamp", "Ljava/nio/ByteBuffer;", "b", "(Lfk2/a;)Ljava/nio/ByteBuffer;", "", "SET_ALARM_PACKET_REV", "I", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122949b(C14554a timeStamp) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(7).order(AbstractC24727d.m72403a());
            AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
            byteBufferOrder.put(0, (byte) 1);
            C35048b c35048b = C35048b.f148538a;
            byteBufferOrder.putInt(1, c35048b.m110785c(timeStamp.m41580f()));
            byteBufferOrder.putShort(5, (short) c35048b.m110786e((short) timeStamp.m41579e()));
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38386u0(C14554a time) {
        super(EnumC24728e.SET_ALARM_TIME, INSTANCE.m122949b(time), null, 4, null);
        AbstractC22676k.m65750j(time, "time");
        this.time = time;
    }

    @Override // xj0.AbstractC38334b, lt0.AbstractC24726c
    public String toString() {
        return "SetAlarmTime(time=" + this.time + ")";
    }
}
