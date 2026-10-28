package mk0;

import ge3.AbstractC15751g;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: mk0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m65681d2 = {"Lmk0/a;", "", "", "stepNumber", "", "failureDescription", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "toFailureMessage", "()Ljava/lang/String;", "I", "Ljava/lang/String;", "BLE_CONNECT_FAILED", "SERVICE_DISCOVERY_FAILED", "BLE_BONDING_FAILED", "CHARACTERISTIC_NOTIFICATIONS_EMPTY", "CHARACTERISTIC_NOTIFICATIONS_FAILED", "HELLO_PACKET_EXCHANGE_FAILED", "SET_RTC_FAILED", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC25628a {
    BLE_CONNECT_FAILED(1, "BLE Connect Failed"),
    SERVICE_DISCOVERY_FAILED(2, "BLE Service Discovery Failed"),
    BLE_BONDING_FAILED(3, "BLE Bonding Failed"),
    CHARACTERISTIC_NOTIFICATIONS_EMPTY(4, "No characteristics to register for notifications"),
    CHARACTERISTIC_NOTIFICATIONS_FAILED(4, "BLE Characteristic Notification Registration Failed"),
    HELLO_PACKET_EXCHANGE_FAILED(5, "BLE Synchronous send FAILED to get Hello Command Response Packet!"),
    SET_RTC_FAILED(6, "BLE Synchronous Clock Synchronization Failed!");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String failureDescription;
    private final int stepNumber;

    EnumC25628a(int i13, String str) {
        this.stepNumber = i13;
        this.failureDescription = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String toFailureMessage() {
        return AbstractC11266d.m30456j(this.stepNumber, "Connection Step: ", " ", this.failureDescription);
    }
}
