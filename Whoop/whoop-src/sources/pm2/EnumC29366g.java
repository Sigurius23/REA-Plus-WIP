package pm2;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: pm2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lpm2/g;", "", "", "eventType", "<init>", "(Ljava/lang/String;II)V", "I", "getEventType", "()I", "FIRMWARE_SHOW_UPDATE_DIALOG", "FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED", "CHARGE_STRAP_PROMPT", "NO_NETWORK_CONNECTED_PROMPT", "NO_STRAP_CONNECTED", "FIRMWARE_HIDE_COMPOSE_DIALOG", "FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATE_STARTED", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC29366g {
    FIRMWARE_SHOW_UPDATE_DIALOG(0),
    FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED(1),
    CHARGE_STRAP_PROMPT(3),
    NO_NETWORK_CONNECTED_PROMPT(4),
    NO_STRAP_CONNECTED(5),
    FIRMWARE_HIDE_COMPOSE_DIALOG(6),
    FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATE_STARTED(7);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final int eventType;

    EnumC29366g(int i13) {
        this.eventType = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getEventType() {
        return this.eventType;
    }
}
