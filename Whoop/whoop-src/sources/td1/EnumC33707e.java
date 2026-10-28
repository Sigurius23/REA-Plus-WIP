package td1;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: td1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Ltd1/e;", "", "<init>", "(Ljava/lang/String;I)V", "", "isReady", "()Z", "CONNECTION_FAILED", "NONE", "BONDING", "CONNECTING", "REGISTERING", "INITIALIZING", "LOCKED", "READY", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC33707e {
    CONNECTION_FAILED,
    NONE,
    BONDING,
    CONNECTING,
    REGISTERING,
    INITIALIZING,
    LOCKED,
    READY;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final boolean isReady() {
        return this == READY;
    }
}
