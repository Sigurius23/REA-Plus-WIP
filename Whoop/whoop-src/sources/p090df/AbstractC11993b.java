package p090df;

import androidx.room.C1832u;
import cf.AbstractC4530e;
import cf.C4527b;
import cf.C4528c;
import p250jf.AbstractC21636e;
import p250jf.C21632a;

/* JADX INFO: renamed from: df.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11993b {

    /* JADX INFO: renamed from: a */
    public static final C21632a f39479a;

    /* JADX INFO: renamed from: b */
    public static final C21632a f39480b;

    static {
        AbstractC21636e.f83073b.invoke("sdk.maxAttempts", "SDK_MAX_ATTEMPTS");
        f39479a = new C21632a(C11992a.f39478w, "SDK_MIN_TLS", "sdk.minTls", null);
        f39480b = new C21632a(new C1832u(1, AbstractC4530e.f18265b, C4527b.class, "fromString", "fromString(Ljava/lang/String;)Laws/smithy/kotlin/runtime/client/LogMode;", 0, 9), "sdk.logMode", "SDK_LOG_MODE", C4528c.f18258d);
    }
}
