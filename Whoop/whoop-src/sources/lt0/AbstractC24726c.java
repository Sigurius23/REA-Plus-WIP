package lt0;

import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.nio.ByteBuffer;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import uk0.C35047a;

/* JADX INFO: renamed from: lt0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\bR$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Llt0/c;", "", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "O", "()Ljava/lang/String;", "toString", "a", "Ljava/nio/ByteBuffer;", "M", "()Ljava/nio/ByteBuffer;", "b", "Ljava/lang/String;", "K", "packetName", "Llt0/c$a;", "type", "L", "()Llt0/c$a;", "setPacketType", "(Llt0/c$a;)V", "packetType", "", "value", "N", "()B", "P", "(B)V", "sequenceNumber", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24726c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ByteBuffer payload;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String packetName;

    /* JADX INFO: renamed from: lt0.c$a */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m65681d2 = {"Llt0/c$a;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "", "byteValue", "B", "getByteValue", "()B", "Companion", "a", "COMMAND", "COMMAND_RESPONSE", "PUFFIN_COMMAND", "PUFFIN_COMMAND_RESPONSE", "REALTIME_DATA", "HISTORICAL_DATA", "REALTIME_RAW_DATA", "EVENT", "METADATA", "CONSOLE_LOGS", "REALTIME_IMU_DATA_STREAM", "HISTORICAL_IMU_DATA_STREAM", "RELATIVE_PUFFIN_EVENTS", "PUFFIN_EVENTS_FROM_STRAP", "RELATIVE_BATTERY_PACK_CONSOLE_LOGS", "PUFFIN_METADATA", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        COMMAND(35),
        COMMAND_RESPONSE(36),
        PUFFIN_COMMAND(37),
        PUFFIN_COMMAND_RESPONSE(38),
        REALTIME_DATA(40),
        HISTORICAL_DATA(47),
        REALTIME_RAW_DATA(43),
        EVENT(48),
        METADATA(49),
        CONSOLE_LOGS(50),
        REALTIME_IMU_DATA_STREAM(51),
        HISTORICAL_IMU_DATA_STREAM(52),
        RELATIVE_PUFFIN_EVENTS(53),
        PUFFIN_EVENTS_FROM_STRAP(54),
        RELATIVE_BATTERY_PACK_CONSOLE_LOGS(55),
        PUFFIN_METADATA(56);

        private final byte byteValue;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: lt0.c$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Llt0/c$a$a;", "", "<init>", "()V", "", "value", "Llt0/c$a;", "a", "(B)Llt0/c$a;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:11:0x0018  */
            /* JADX INFO: renamed from: a */
            public final a m72402a(byte value) throws IllegalArgumentException {
                for (a aVar : a.values()) {
                    if (aVar.getByteValue() == value) {
                        if (aVar != null) {
                            return aVar;
                        }
                        throw new IllegalArgumentException(AbstractC2875y.m8296i(value, "Value ", " is not a valid PacketType"));
                    }
                }
                aVar = null;
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalArgumentException(AbstractC2875y.m8296i(value, "Value ", " is not a valid PacketType"));
            }

            private Companion() {
            }
        }

        a(int i13) {
            this.byteValue = (byte) i13;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final byte getByteValue() {
            return this.byteValue;
        }
    }

    public AbstractC24726c(ByteBuffer payload) {
        AbstractC22676k.m65750j(payload, "payload");
        this.payload = payload;
        this.packetName = "BlePacket ".concat(getClass().getName());
        payload.order(AbstractC24727d.m72403a());
    }

    /* JADX INFO: renamed from: K */
    public abstract String getPacketName();

    /* JADX INFO: renamed from: L */
    public final a m72399L() {
        return a.INSTANCE.m72402a(this.payload.get(0));
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final ByteBuffer getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: N */
    public byte mo72387N() {
        return this.payload.get(1);
    }

    /* JADX INFO: renamed from: O */
    public final String m72401O() {
        byte[] bArrArray = this.payload.array();
        C35047a c35047a = C35047a.f148537a;
        AbstractC22676k.m65747g(bArrArray);
        return c35047a.m110781a(bArrArray);
    }

    /* JADX INFO: renamed from: P */
    public void mo72388P(byte b) {
        this.payload.put(1, b);
    }

    public String toString() {
        return AbstractC18489d0.m53370k(m72399L().name(), " - ", m72401O());
    }
}
