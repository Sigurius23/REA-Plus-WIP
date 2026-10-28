package p607x8;

import android.os.Handler;
import java.util.ArrayList;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: x8.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C38063r {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f163025b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f163026a;

    public C38063r(Handler handler) {
        this.f163026a = handler;
    }

    /* JADX INFO: renamed from: b */
    public static C38062q m121877b() {
        C38062q c38062q;
        ArrayList arrayList = f163025b;
        synchronized (arrayList) {
            try {
                c38062q = arrayList.isEmpty() ? new C38062q() : (C38062q) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c38062q;
    }

    /* JADX INFO: renamed from: a */
    public final C38062q m121878a(int i13, Object obj) {
        C38062q c38062qM121877b = m121877b();
        c38062qM121877b.f163024a = this.f163026a.obtainMessage(i13, obj);
        return c38062qM121877b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m121879c(Runnable runnable) {
        return this.f163026a.post(runnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m121880d(int i13) {
        AbstractC35849g.m113802d(i13 != 0);
        this.f163026a.removeMessages(i13);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m121881e(int i13) {
        return this.f163026a.sendEmptyMessage(i13);
    }
}
