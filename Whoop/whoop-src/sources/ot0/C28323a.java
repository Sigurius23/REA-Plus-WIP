package ot0;

import fk2.C14554a;
import ge3.AbstractC15751g;
import java.nio.ByteBuffer;
import lt0.AbstractC24726c;
import lt0.AbstractC24727d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import uk0.C35048b;

/* JADX INFO: renamed from: ot0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m65681d2 = {"Lot0/a;", "Llt0/c;", "Lot0/b;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "Q", "()Ljava/nio/ByteBuffer;", "", "toString", "()Ljava/lang/String;", "c", "Ljava/nio/ByteBuffer;", "dataBuffer", "Lot0/a$b;", "R", "()Lot0/a$b;", "eventTypeEnum", "", "S", "()Ljava/lang/Integer;", "legacyGetEventType", "Lfk2/a;", "getTimestamp", "()Lfk2/a;", "timestamp", "d", "b", "a", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class C28323a extends AbstractC24726c implements InterfaceC28324b {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ByteBuffer dataBuffer;

    /* JADX INFO: renamed from: ot0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m65681d2 = {"Lot0/a$a;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "payload", "", "a", "(Ljava/nio/ByteBuffer;)Ljava/lang/Integer;", "OFFSET_EVENT_TYPE", "I", "OFFSET_TIMESTAMP_SECONDS", "OFFSET_TIMESTAMP_SUBSECONDS", "OFFSET_LENGTH", "OFFSET_EVENT_DATA", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Integer m85787a(ByteBuffer payload) {
            if (payload == null || payload.limit() <= 3) {
                return null;
            }
            return Integer.valueOf(C35048b.f148538a.m110786e(payload.getShort(2)));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ot0.a$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\bC\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bD¨\u0006E"}, m65681d2 = {"Lot0/a$b;", "", "", "intValue", "<init>", "(Ljava/lang/String;II)V", "I", "getIntValue", "()I", "Companion", "a", "UNDEFINED", "ERROR", "CONSOLE_OUTPUT", "BATTERY_LEVEL", "SYSTEM_CONTROL", "CHARGING_ON", "CHARGING_OFF", "WRIST_ON", "WRIST_OFF", "BLE_CONNECTION_UP", "BLE_CONNECTION_DOWN", "RTC_LOST", "DOUBLE_TAP", "BOOT", "SET_RTC", "TEMPERATURE_LEVEL", "PAIRING_MODE", "SERIAL_HEAD_CONNECTED", "SERIAL_HEAD_REMOVED", "BATTERY_PACK_CONNECTED", "BATTERY_PACK_REMOVED", "BLE_BONDED", "BLE_HR_PROFILE_ENABLED", "BLE_HR_PROFILE_DISABLED", "TRIM_ALL_DATA", "TRIM_ALL_DATA_ENDED", "FLASH_INIT_COMPLETE", "STRAP_CONDITION_REPORT", "BOOT_REPORT", "EXIT_VIRGIN_MODE", "CAPTOUCH_AUTOTHRESHOLD_ACTION", "BLE_REALTIME_HR_ON", "BLE_REALTIME_HR_OFF", "ACCELEROMETER_RESET", "AFE_RESET", "SHIP_MODE_ENABLED", "SHIP_MODE_DISABLED", "SHIP_MODE_BOOT", "CH1_SATURATION_DETECTED", "CH2_SATURATION_DETECTED", "ACCELEROMETER_SATURATION_DETECTED", "BLE_SYSTEM_RESET", "BLE_SYSTEM_ON", "BLE_SYSTEM_INITIALIZED", "RAW_DATA_COLLECTION_ON", "RAW_DATA_COLLECTION_OFF", "STRAP_DRIVEN_ALARM_SET", "STRAP_DRIVEN_ALARM_EXECUTED", "APP_DRIVEN_ALARM_EXECUTED", "STRAP_DRIVEN_ALARM_DISABLED", "HAPTICS_FIRED", "EXTENDED_BATTERY_INFORMATION", "HIGH_FREQ_SYNC_PROMPT", "HIGH_FREQ_SYNC_ENABLED", "HIGH_FREQ_SYNC_DISABLED", "HAPTICS_TERMINATED", "BATTERY_PACK_INFO", "GENERIC_FIRMWARE_EVENT", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        UNDEFINED(0),
        ERROR(1),
        CONSOLE_OUTPUT(2),
        BATTERY_LEVEL(3),
        SYSTEM_CONTROL(4),
        CHARGING_ON(7),
        CHARGING_OFF(8),
        WRIST_ON(9),
        WRIST_OFF(10),
        BLE_CONNECTION_UP(11),
        BLE_CONNECTION_DOWN(12),
        RTC_LOST(13),
        DOUBLE_TAP(14),
        BOOT(15),
        SET_RTC(16),
        TEMPERATURE_LEVEL(17),
        PAIRING_MODE(18),
        SERIAL_HEAD_CONNECTED(19),
        SERIAL_HEAD_REMOVED(20),
        BATTERY_PACK_CONNECTED(21),
        BATTERY_PACK_REMOVED(22),
        BLE_BONDED(23),
        BLE_HR_PROFILE_ENABLED(24),
        BLE_HR_PROFILE_DISABLED(25),
        TRIM_ALL_DATA(26),
        TRIM_ALL_DATA_ENDED(27),
        FLASH_INIT_COMPLETE(28),
        STRAP_CONDITION_REPORT(29),
        BOOT_REPORT(30),
        EXIT_VIRGIN_MODE(31),
        CAPTOUCH_AUTOTHRESHOLD_ACTION(32),
        BLE_REALTIME_HR_ON(33),
        BLE_REALTIME_HR_OFF(34),
        ACCELEROMETER_RESET(35),
        AFE_RESET(36),
        SHIP_MODE_ENABLED(37),
        SHIP_MODE_DISABLED(38),
        SHIP_MODE_BOOT(39),
        CH1_SATURATION_DETECTED(40),
        CH2_SATURATION_DETECTED(41),
        ACCELEROMETER_SATURATION_DETECTED(42),
        BLE_SYSTEM_RESET(43),
        BLE_SYSTEM_ON(44),
        BLE_SYSTEM_INITIALIZED(45),
        RAW_DATA_COLLECTION_ON(46),
        RAW_DATA_COLLECTION_OFF(47),
        STRAP_DRIVEN_ALARM_SET(56),
        STRAP_DRIVEN_ALARM_EXECUTED(57),
        APP_DRIVEN_ALARM_EXECUTED(58),
        STRAP_DRIVEN_ALARM_DISABLED(59),
        HAPTICS_FIRED(60),
        EXTENDED_BATTERY_INFORMATION(63),
        HIGH_FREQ_SYNC_PROMPT(96),
        HIGH_FREQ_SYNC_ENABLED(97),
        HIGH_FREQ_SYNC_DISABLED(98),
        HAPTICS_TERMINATED(100),
        BATTERY_PACK_INFO(109),
        GENERIC_FIRMWARE_EVENT(123);

        private final int intValue;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: ot0.a$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lot0/a$b$a;", "", "<init>", "()V", "", "value", "Lot0/a$b;", "a", "(I)Lot0/a$b;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m85788a(int value) {
                for (b bVar : b.values()) {
                    if (bVar.getIntValue() == value) {
                        return bVar;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        b(int i13) {
            this.intValue = i13;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final int getIntValue() {
            return this.intValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28323a(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: Q */
    public final ByteBuffer m85784Q() {
        if (this.dataBuffer == null && getPayload().limit() >= 12) {
            getPayload().position(12);
            this.dataBuffer = getPayload().slice().order(AbstractC24727d.m72403a());
            getPayload().rewind();
        }
        return this.dataBuffer;
    }

    /* JADX INFO: renamed from: R */
    public final b m85785R() {
        Integer numM85787a = INSTANCE.m85787a(getPayload());
        if (numM85787a != null) {
            return b.INSTANCE.m85788a(numM85787a.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final Integer m85786S() {
        return INSTANCE.m85787a(getPayload());
    }

    @Override // ot0.InterfaceC28324b
    public C14554a getTimestamp() {
        if (getPayload().limit() >= 10) {
            return new C14554a(C35048b.m110783d(getPayload().getInt(4)), C35048b.m110783d(getPayload().getShort(8)));
        }
        return null;
    }

    @Override // lt0.AbstractC24726c
    public String toString() {
        Object objM85786S;
        String simpleName = getClass().getSimpleName();
        b bVarM85785R = m85785R();
        if (bVarM85785R == null || (objM85786S = bVarM85785R.name()) == null) {
            objM85786S = m85786S();
        }
        return simpleName + " (Event: " + objM85786S + " Seq#: " + (mo72387N() & 255) + " )";
    }
}
