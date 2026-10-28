package androidx.recyclerview.widget;

import androidx.fragment.app.RunnableC1310j2;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import qg3.C30352d;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C1686h {

    /* JADX INFO: renamed from: h */
    public static final ExecutorC1682g f6661h = new ExecutorC1682g();

    /* JADX INFO: renamed from: a */
    public final C1665c f6662a;

    /* JADX INFO: renamed from: b */
    public final C30352d f6663b;

    /* JADX INFO: renamed from: e */
    public List f6666e;

    /* JADX INFO: renamed from: g */
    public int f6668g;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f6665d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public List f6667f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public final ExecutorC1682g f6664c = f6661h;

    public C1686h(C1665c c1665c, C30352d c30352d) {
        this.f6662a = c1665c;
        this.f6663b = c30352d;
    }

    /* JADX INFO: renamed from: a */
    public final void m5248a(Runnable runnable) {
        Iterator it = this.f6665d.iterator();
        while (it.hasNext()) {
            AbstractC1759z0 abstractC1759z0 = ((C1755y0) ((InterfaceC1678f) it.next())).f6940a;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5249b(List list, Runnable runnable) {
        int i13 = this.f6668g + 1;
        this.f6668g = i13;
        List list2 = this.f6666e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        C1665c c1665c = this.f6662a;
        if (list == null) {
            int size = list2.size();
            this.f6666e = null;
            this.f6667f = Collections.EMPTY_LIST;
            c1665c.mo2215b(0, size);
            m5248a(runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.f6663b.f124535x).execute(new RunnableC1310j2(this, list2, list, i13, runnable, 1));
            return;
        }
        this.f6666e = list;
        this.f6667f = Collections.unmodifiableList(list);
        c1665c.mo2214a(0, list.size());
        m5248a(runnable);
    }
}
