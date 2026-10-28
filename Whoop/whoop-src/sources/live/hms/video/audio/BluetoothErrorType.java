package live.hms.video.audio;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Llive/hms/video/audio/BluetoothErrorType;", "", "description", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "NO_BLUETOOTH_PERMISSON", "NO_BLUETOOTH_CONNECT_PERMISSION", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public enum BluetoothErrorType {
    NO_BLUETOOTH_PERMISSON("No bluetooth permission was granted"),
    NO_BLUETOOTH_CONNECT_PERMISSION("BLUETOOTH_CONNECT, a dangerous level permission, is required on Android 12 and above to enable bluetooth devices to work");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String description;

    BluetoothErrorType(String str) {
        this.description = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getDescription() {
        return this.description;
    }
}
