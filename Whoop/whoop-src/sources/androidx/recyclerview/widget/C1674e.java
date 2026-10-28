package androidx.recyclerview.widget;

import androidx.fragment.app.RunnableC1310j2;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C1674e extends AbstractC1670d {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RunnableC1310j2 f6635d;

    public C1674e(RunnableC1310j2 runnableC1310j2) {
        this.f6635d = runnableC1310j2;
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: a */
    public final boolean mo5216a(int i13, int i14) {
        RunnableC1310j2 runnableC1310j2 = this.f6635d;
        Object obj = runnableC1310j2.f5659y.get(i13);
        Object obj2 = runnableC1310j2.f5660z.get(i14);
        if (obj != null && obj2 != null) {
            return ((AbstractC1738u) ((C1686h) runnableC1310j2.f5656F).f6663b.f124536y).areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: b */
    public final boolean mo5217b(int i13, int i14) {
        RunnableC1310j2 runnableC1310j2 = this.f6635d;
        Object obj = runnableC1310j2.f5659y.get(i13);
        Object obj2 = runnableC1310j2.f5660z.get(i14);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ((AbstractC1738u) ((C1686h) runnableC1310j2.f5656F).f6663b.f124536y).areItemsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: g */
    public final Object mo5218g(int i13, int i14) {
        RunnableC1310j2 runnableC1310j2 = this.f6635d;
        Object obj = runnableC1310j2.f5659y.get(i13);
        Object obj2 = runnableC1310j2.f5660z.get(i14);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((AbstractC1738u) ((C1686h) runnableC1310j2.f5656F).f6663b.f124536y).getChangePayload(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: h */
    public final int mo5219h() {
        return this.f6635d.f5660z.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: i */
    public final int mo5220i() {
        return this.f6635d.f5659y.size();
    }
}
