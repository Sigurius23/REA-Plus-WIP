package fk0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: fk0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b!\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, m65681d2 = {"Lfk0/b;", "", "", "intValue", "<init>", "(Ljava/lang/String;II)V", "I", "getIntValue", "()I", "Companion", "a", "ERROR", "STATE_OF_CHARGE", "USB_CONNECTED", "USB_DISCONNECTED", "CHARGING_ON", "CHARGING_OFF", "BLE_CONNECTED", "BLE_DISCONNECTED", "DOUBLE_TAP", "STRAP_DETECTED", "STRAP_REMOVED", "TRIM_ALL_DATA_START", "TRIM_ALL_DATA_END", "BOOT_REPORT", "SHIPMODE_SET", "SHIPMODE_CLEAR", "EXTENDED_FG_INFO", "BPK_BATTERY_HEALTH", "WPT_HEALTH", "BPK_HW_INFO", "REBOOT_REASON", "MODULE_FAILURE_REASON", "WPT_RESET", "PUFF_LOG_PACKET", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC14546b {
    ERROR(1),
    STATE_OF_CHARGE(2),
    USB_CONNECTED(3),
    USB_DISCONNECTED(4),
    CHARGING_ON(5),
    CHARGING_OFF(6),
    BLE_CONNECTED(7),
    BLE_DISCONNECTED(8),
    DOUBLE_TAP(9),
    STRAP_DETECTED(10),
    STRAP_REMOVED(11),
    TRIM_ALL_DATA_START(12),
    TRIM_ALL_DATA_END(13),
    BOOT_REPORT(14),
    SHIPMODE_SET(15),
    SHIPMODE_CLEAR(16),
    EXTENDED_FG_INFO(17),
    BPK_BATTERY_HEALTH(18),
    WPT_HEALTH(19),
    BPK_HW_INFO(20),
    REBOOT_REASON(21),
    MODULE_FAILURE_REASON(22),
    WPT_RESET(23),
    PUFF_LOG_PACKET(50);

    private final int intValue;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fk0.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lfk0/b$a;", "", "<init>", "()V", "", "value", "Lfk0/b;", "a", "(I)Lfk0/b;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC14546b m41556a(int value) {
            for (EnumC14546b enumC14546b : EnumC14546b.values()) {
                if (enumC14546b.getIntValue() == value) {
                    return enumC14546b;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    EnumC14546b(int i13) {
        this.intValue = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
