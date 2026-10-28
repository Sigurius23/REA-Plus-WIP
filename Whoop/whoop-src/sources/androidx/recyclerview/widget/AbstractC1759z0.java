package androidx.recyclerview.widget;

import java.util.List;
import java.util.concurrent.Executors;
import qg3.C30352d;

/* JADX INFO: renamed from: androidx.recyclerview.widget.z0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1759z0 extends AbstractC1692i1 {
    final C1686h mDiffer;
    private final InterfaceC1678f mListener;

    public AbstractC1759z0(AbstractC1738u abstractC1738u) {
        C1755y0 c1755y0 = new C1755y0(this);
        this.mListener = c1755y0;
        C1665c c1665c = new C1665c(this);
        synchronized (AbstractC1670d.f6601a) {
            try {
                if (AbstractC1670d.f6602b == null) {
                    AbstractC1670d.f6602b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C1686h c1686h = new C1686h(c1665c, new C30352d(3, AbstractC1670d.f6602b, abstractC1738u));
        this.mDiffer = c1686h;
        c1686h.f6665d.add(c1755y0);
    }

    public final List<Object> getCurrentList() {
        return this.mDiffer.f6667f;
    }

    public final Object getItem(int i13) {
        return this.mDiffer.f6667f.get(i13);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemCount() {
        return this.mDiffer.f6667f.size();
    }

    public final void onCurrentListChanged(List<Object> list, List<Object> list2) {
    }

    public final void submitList(List<Object> list) {
        this.mDiffer.m5249b(list, null);
    }

    public final void submitList(List<Object> list, Runnable runnable) {
        this.mDiffer.m5249b(list, runnable);
    }
}
