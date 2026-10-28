package p394p5;

import android.os.CancellationSignal;
import android.util.Log;

/* JADX INFO: renamed from: p5.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C28845b {
    /* JADX INFO: renamed from: a */
    public static boolean m87735a(CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            Log.i("PlayServicesImpl", "No cancellationSignal found");
            return false;
        }
        if (!cancellationSignal.isCanceled()) {
            return false;
        }
        Log.i("PlayServicesImpl", "the flow has been canceled");
        return true;
    }
}
