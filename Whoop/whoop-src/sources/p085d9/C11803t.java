package p085d9;

import android.os.SystemClock;
import java.io.Serializable;

/* JADX INFO: renamed from: d9.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C11803t {

    /* JADX INFO: renamed from: a */
    public long f38324a = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public long f38325b = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public Serializable f38326c;

    /* JADX INFO: renamed from: a */
    public void m31627a(Exception exc) throws Exception {
        boolean z4;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f38326c) == null) {
            this.f38326c = exc;
        }
        if (this.f38324a == -9223372036854775807L) {
            synchronized (C11807x.f38334j0) {
                z4 = C11807x.f38336l0 > 0;
            }
            if (!z4) {
                this.f38324a = 200 + jElapsedRealtime;
            }
        }
        long j7 = this.f38324a;
        if (j7 == -9223372036854775807L || jElapsedRealtime < j7) {
            this.f38325b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f38326c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f38326c;
        this.f38326c = null;
        this.f38324a = -9223372036854775807L;
        this.f38325b = -9223372036854775807L;
        throw exc3;
    }
}
