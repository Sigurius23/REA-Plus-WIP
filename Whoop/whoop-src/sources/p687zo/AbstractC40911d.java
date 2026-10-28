package p687zo;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: zo.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC40911d {

    /* JADX INFO: renamed from: a */
    public static final Method f176326a;

    /* JADX INFO: renamed from: b */
    public static final Method f176327b;

    /* JADX INFO: renamed from: c */
    public static Boolean f176328c;

    static {
        Method method;
        Method method2;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f176326a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f176327b = method2;
        try {
            WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e5) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e5);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
        } catch (Exception e13) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e13);
        }
        try {
            WorkSource.class.getMethod("isEmpty", null).setAccessible(true);
        } catch (Exception unused6) {
        }
        f176328c = null;
    }
}
