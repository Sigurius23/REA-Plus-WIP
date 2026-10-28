package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1720p1 {

    /* JADX INFO: renamed from: a */
    public InterfaceC1712n1 f6802a;

    /* JADX INFO: renamed from: b */
    public ArrayList f6803b;

    /* JADX INFO: renamed from: c */
    public long f6804c;

    /* JADX INFO: renamed from: d */
    public long f6805d;

    /* JADX INFO: renamed from: e */
    public long f6806e;

    /* JADX INFO: renamed from: f */
    public long f6807f;

    /* JADX INFO: renamed from: b */
    public static void m5295b(AbstractC1717o2 abstractC1717o2) {
        int i13 = abstractC1717o2.mFlags;
        if (!abstractC1717o2.isInvalid() && (i13 & 4) == 0) {
            abstractC1717o2.getOldPosition();
            abstractC1717o2.getAbsoluteAdapterPosition();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo5296a(AbstractC1717o2 abstractC1717o2, AbstractC1717o2 abstractC1717o3, C1716o1 c1716o1, C1716o1 c1716o2);

    /* JADX INFO: renamed from: c */
    public final void m5297c(AbstractC1717o2 abstractC1717o2) {
        InterfaceC1712n1 interfaceC1712n1 = this.f6802a;
        if (interfaceC1712n1 != null) {
            RecyclerView recyclerView = ((C1684g1) interfaceC1712n1).f6659a;
            abstractC1717o2.setIsRecyclable(true);
            if (abstractC1717o2.mShadowedHolder != null && abstractC1717o2.mShadowingHolder == null) {
                abstractC1717o2.mShadowedHolder = null;
            }
            abstractC1717o2.mShadowingHolder = null;
            if (abstractC1717o2.shouldBeKeptAsChild() || recyclerView.removeAnimatingView(abstractC1717o2.itemView) || !abstractC1717o2.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(abstractC1717o2.itemView, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo5298d(AbstractC1717o2 abstractC1717o2);

    /* JADX INFO: renamed from: e */
    public abstract void mo5299e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo5300f();
}
