package p489t;

import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ExecutorC1651b;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public final class C33242a extends AbstractC34132o {

    /* JADX INFO: renamed from: b */
    public static volatile C33242a f138636b;

    /* JADX INFO: renamed from: c */
    public static final ExecutorC1651b f138637c = new ExecutorC1651b(1);

    /* JADX INFO: renamed from: d */
    public static final ExecutorC1651b f138638d = new ExecutorC1651b(2);

    /* JADX INFO: renamed from: a */
    public final C33243b f138639a = new C33243b();

    /* JADX INFO: renamed from: V */
    public static C33242a m105474V() {
        if (f138636b != null) {
            return f138636b;
        }
        synchronized (C33242a.class) {
            try {
                if (f138636b == null) {
                    f138636b = new C33242a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f138636b;
    }

    /* JADX INFO: renamed from: W */
    public final void m105475W(Runnable runnable) {
        C33243b c33243b = this.f138639a;
        if (c33243b.f138642c == null) {
            synchronized (c33243b.f138640a) {
                try {
                    if (c33243b.f138642c == null) {
                        c33243b.f138642c = Handler.createAsync(Looper.getMainLooper());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        c33243b.f138642c.post(runnable);
    }
}
