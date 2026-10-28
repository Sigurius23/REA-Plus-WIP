package p217ib;

import androidx.fragment.app.RunnableC1310j2;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.C1665c;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ib.p */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18319p extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a */
    final C18305c f71315a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC18303b f71316b;

    public AbstractC18319p(AbstractC1738u abstractC1738u) {
        C18318o c18318o = new C18318o(this);
        this.f71316b = c18318o;
        C18305c c18305c = new C18305c(this, abstractC1738u);
        this.f71315a = c18305c;
        c18305c.f71266c.add(c18318o);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m52732a(AbstractC18317n abstractC18317n) {
    }

    /* JADX INFO: renamed from: b */
    public void m52733b(AbstractC18317n abstractC18317n, AbstractC18317n abstractC18317n2) {
    }

    /* JADX INFO: renamed from: c */
    public void m52734c(AbstractC18317n abstractC18317n) {
        int size;
        C18305c c18305c = this.f71315a;
        C1665c c1665c = c18305c.f71264a;
        C18301a c18301a = c18305c.f71271h;
        if (abstractC18317n != null) {
            if (c18305c.f71268e == null && c18305c.f71269f == null) {
                c18305c.f71267d = abstractC18317n.mo52705j();
            } else if (abstractC18317n.mo52705j() != c18305c.f71267d) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i13 = c18305c.f71270g + 1;
        c18305c.f71270g = i13;
        AbstractC18317n abstractC18317n2 = c18305c.f71268e;
        if (abstractC18317n == abstractC18317n2) {
            return;
        }
        AbstractC18317n abstractC18317n3 = c18305c.f71269f;
        AbstractC18317n abstractC18317n4 = abstractC18317n3 != null ? abstractC18317n3 : abstractC18317n2;
        if (abstractC18317n == null) {
            if (abstractC18317n2 != null) {
                size = abstractC18317n2.f71313z.size();
            } else {
                size = abstractC18317n3 == null ? 0 : abstractC18317n3.f71313z.size();
            }
            AbstractC18317n abstractC18317n5 = c18305c.f71268e;
            if (abstractC18317n5 != null) {
                abstractC18317n5.m52731r(c18301a);
                c18305c.f71268e = null;
            } else if (c18305c.f71269f != null) {
                c18305c.f71269f = null;
            }
            c1665c.mo2215b(0, size);
            c18305c.m52709a(abstractC18317n4, null);
            return;
        }
        if (abstractC18317n2 == null && abstractC18317n3 == null) {
            c18305c.f71268e = abstractC18317n;
            abstractC18317n.m52726c(null, c18301a);
            c1665c.mo2214a(0, abstractC18317n.f71313z.size());
            c18305c.m52709a(null, abstractC18317n);
            return;
        }
        if (abstractC18317n2 != null) {
            abstractC18317n2.m52731r(c18301a);
            AbstractC18317n c18304b0 = c18305c.f71268e;
            if (!c18304b0.mo52707m()) {
                c18304b0 = new C18304b0(c18304b0);
            }
            c18305c.f71269f = c18304b0;
            c18305c.f71268e = null;
        }
        AbstractC18317n abstractC18317n6 = c18305c.f71269f;
        if (abstractC18317n6 == null || c18305c.f71268e != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        ((Executor) c18305c.f71265b.f124535x).execute(new RunnableC1310j2(c18305c, abstractC18317n6, abstractC18317n.mo52707m() ? abstractC18317n : new C18304b0(abstractC18317n), i13, abstractC18317n, 2));
    }

    public Object getItem(int i13) {
        C18305c c18305c = this.f71315a;
        AbstractC18317n abstractC18317n = c18305c.f71268e;
        if (abstractC18317n != null) {
            abstractC18317n.m52728n(i13);
            return c18305c.f71268e.get(i13);
        }
        AbstractC18317n abstractC18317n2 = c18305c.f71269f;
        if (abstractC18317n2 != null) {
            return abstractC18317n2.get(i13);
        }
        throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public int getItemCount() {
        C18305c c18305c = this.f71315a;
        AbstractC18317n abstractC18317n = c18305c.f71268e;
        if (abstractC18317n != null) {
            return abstractC18317n.f71313z.size();
        }
        AbstractC18317n abstractC18317n2 = c18305c.f71269f;
        if (abstractC18317n2 == null) {
            return 0;
        }
        return abstractC18317n2.f71313z.size();
    }
}
