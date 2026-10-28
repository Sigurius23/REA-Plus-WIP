package p029b5;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* JADX INFO: renamed from: b5.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2732k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10742a = 0;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e5) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e5);
            }
        }
    }
}
