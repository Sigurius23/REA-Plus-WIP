package p217ib;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: ib.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18317n extends AbstractList {

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ int f71303K = 0;

    /* JADX INFO: renamed from: E */
    public int f71304E = 0;

    /* JADX INFO: renamed from: F */
    public Object f71305F = null;

    /* JADX INFO: renamed from: G */
    public int f71306G = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: H */
    public int f71307H = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: I */
    public final AtomicBoolean f71308I = new AtomicBoolean(false);

    /* JADX INFO: renamed from: J */
    public final ArrayList f71309J = new ArrayList();

    /* JADX INFO: renamed from: w */
    public final Executor f71310w;

    /* JADX INFO: renamed from: x */
    public final Executor f71311x;

    /* JADX INFO: renamed from: y */
    public final C18316m f71312y;

    /* JADX INFO: renamed from: z */
    public final C18321r f71313z;

    public AbstractC18317n(C18321r c18321r, Executor executor, Executor executor2, C18316m c18316m) {
        this.f71313z = c18321r;
        this.f71310w = executor;
        this.f71311x = executor2;
        this.f71312y = c18316m;
        int i13 = c18316m.f71300b;
    }

    /* JADX INFO: renamed from: a */
    public void mo52711a(int i13, int i14) {
        m52729p(i13, i14);
    }

    /* JADX INFO: renamed from: c */
    public final void m52726c(List list, C18301a c18301a) {
        if (list != null && list != this) {
            if (list.isEmpty()) {
                C18321r c18321r = this.f71313z;
                if (!c18321r.isEmpty()) {
                    c18301a.f71260a.f71264a.mo2214a(0, c18321r.size());
                }
            } else {
                mo52702e((AbstractC18317n) list, c18301a);
            }
        }
        ArrayList arrayList = this.f71309J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C18301a) ((WeakReference) arrayList.get(size)).get()) == null) {
                arrayList.remove(size);
            }
        }
        arrayList.add(new WeakReference(c18301a));
    }

    /* JADX INFO: renamed from: d */
    public final void m52727d() {
        this.f71308I.set(true);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo52702e(AbstractC18317n abstractC18317n, C18301a c18301a);

    /* JADX INFO: renamed from: f */
    public abstract AbstractC18313j mo52703f();

    /* JADX INFO: renamed from: g */
    public abstract Object mo52704g();

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        Object obj = this.f71313z.get(i13);
        if (obj != null) {
            this.f71305F = obj;
        }
        return obj;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo52705j();

    /* JADX INFO: renamed from: l */
    public boolean mo52706l() {
        return this.f71308I.get();
    }

    /* JADX INFO: renamed from: m */
    public boolean mo52707m() {
        return mo52706l();
    }

    /* JADX INFO: renamed from: n */
    public final void m52728n(int i13) {
        C18321r c18321r = this.f71313z;
        if (i13 < 0 || i13 >= c18321r.size()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index: ", ", Size: ");
            sbM30466t.append(c18321r.size());
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
        this.f71304E = c18321r.f71325z + i13;
        mo52708o(i13);
        this.f71306G = Math.min(this.f71306G, i13);
        this.f71307H = Math.max(this.f71307H, i13);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo52708o(int i13);

    /* JADX INFO: renamed from: p */
    public final void m52729p(int i13, int i14) {
        if (i14 != 0) {
            ArrayList arrayList = this.f71309J;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C18301a c18301a = (C18301a) ((WeakReference) arrayList.get(size)).get();
                if (c18301a != null) {
                    c18301a.f71260a.f71264a.mo2216c(i13, i14, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m52730q(int i13, int i14) {
        if (i14 != 0) {
            ArrayList arrayList = this.f71309J;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C18301a c18301a = (C18301a) ((WeakReference) arrayList.get(size)).get();
                if (c18301a != null) {
                    c18301a.f71260a.f71264a.mo2214a(i13, i14);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m52731r(C18301a c18301a) {
        ArrayList arrayList = this.f71309J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C18301a c18301a2 = (C18301a) ((WeakReference) arrayList.get(size)).get();
            if (c18301a2 == null || c18301a2 == c18301a) {
                arrayList.remove(size);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f71313z.size();
    }
}
