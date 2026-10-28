package p184h5;

import android.view.MenuItem;
import androidx.fragment.app.C1289e1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: h5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C16894n {

    /* JADX INFO: renamed from: a */
    public final Runnable f64845a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f64846b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final HashMap f64847c = new HashMap();

    public C16894n(Runnable runnable) {
        this.f64845a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47563a(MenuItem menuItem) {
        Iterator it = this.f64846b.iterator();
        while (it.hasNext()) {
            if (((C1289e1) ((InterfaceC16897o) it.next())).f5593a.m4185p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m47564b(InterfaceC16897o interfaceC16897o) {
        this.f64846b.remove(interfaceC16897o);
        C16891m c16891m = (C16891m) this.f64847c.remove(interfaceC16897o);
        if (c16891m != null) {
            c16891m.m47560a();
        }
        this.f64845a.run();
    }
}
