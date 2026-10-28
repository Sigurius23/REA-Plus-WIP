package p309lo;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: renamed from: lo.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C24564v {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f95864b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f95865a;

    public C24564v(Handler handler) {
        this.f95865a = handler;
    }

    /* JADX INFO: renamed from: b */
    public static C24563u m71648b() {
        C24563u c24563u;
        ArrayList arrayList = f95864b;
        synchronized (arrayList) {
            try {
                c24563u = arrayList.isEmpty() ? new C24563u() : (C24563u) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c24563u;
    }

    /* JADX INFO: renamed from: a */
    public final C24563u m71649a(int i13, Object obj) {
        C24563u c24563uM71648b = m71648b();
        c24563uM71648b.f95863a = this.f95865a.obtainMessage(i13, obj);
        return c24563uM71648b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m71650c(int i13) {
        return this.f95865a.sendEmptyMessage(i13);
    }
}
