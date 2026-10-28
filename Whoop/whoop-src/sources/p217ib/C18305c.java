package p217ib;

import androidx.recyclerview.widget.AbstractC1670d;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.C1665c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import qg3.C30352d;

/* JADX INFO: renamed from: ib.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C18305c {

    /* JADX INFO: renamed from: a */
    public final C1665c f71264a;

    /* JADX INFO: renamed from: b */
    public final C30352d f71265b;

    /* JADX INFO: renamed from: d */
    public boolean f71267d;

    /* JADX INFO: renamed from: e */
    public AbstractC18317n f71268e;

    /* JADX INFO: renamed from: f */
    public AbstractC18317n f71269f;

    /* JADX INFO: renamed from: g */
    public int f71270g;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f71266c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h */
    public final C18301a f71271h = new C18301a(this);

    public C18305c(AbstractC18319p abstractC18319p, AbstractC1738u abstractC1738u) {
        this.f71264a = new C1665c(abstractC18319p);
        synchronized (AbstractC1670d.f6601a) {
            try {
                if (AbstractC1670d.f6602b == null) {
                    AbstractC1670d.f6602b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f71265b = new C30352d(3, AbstractC1670d.f6602b, abstractC1738u);
    }

    /* JADX INFO: renamed from: a */
    public final void m52709a(AbstractC18317n abstractC18317n, AbstractC18317n abstractC18317n2) {
        Iterator it = this.f71266c.iterator();
        while (it.hasNext()) {
            AbstractC18319p abstractC18319p = ((C18318o) ((InterfaceC18303b) it.next())).f71314a;
            abstractC18319p.m52732a(abstractC18317n2);
            abstractC18319p.m52733b(abstractC18317n, abstractC18317n2);
        }
    }
}
