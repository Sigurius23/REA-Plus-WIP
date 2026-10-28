package wk2;

import android.os.SystemClock;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: wk2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lwk2/c;", "a", "Lwk2/c;", "c", "()Lwk2/c;", "SystemElapsedTimeSource", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37344e {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC37342c f159735a = new C37343d();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final long m119583b() {
        return SystemClock.elapsedRealtimeNanos();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC37342c m119584c() {
        return f159735a;
    }
}
