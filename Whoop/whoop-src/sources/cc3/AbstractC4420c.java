package cc3;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import l83.C23467m;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cc3.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4420c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f17883a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objM107888l;
        try {
            objM107888l = new C4419b(m13865a(Looper.getMainLooper()));
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m13865a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
