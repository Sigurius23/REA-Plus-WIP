package gt0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: gt0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lgt0/b;", "", "", "category", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "BINARY_DOWNLOAD", "BINARY_TRANSFER", "REBOOT", "PROMPT", "NOTIFICATION", "LIVE_FEATURE", "FW_UPDATE_TIME", "AUTO_INSTALL", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC16180b {
    BINARY_DOWNLOAD("binary_download"),
    BINARY_TRANSFER("binary_transfer"),
    REBOOT("reboot"),
    PROMPT("prompt"),
    NOTIFICATION("notification"),
    LIVE_FEATURE("live_feature"),
    FW_UPDATE_TIME("firmware_update_time"),
    AUTO_INSTALL("auto_install");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String category;

    EnumC16180b(String str) {
        this.category = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getCategory() {
        return this.category;
    }
}
