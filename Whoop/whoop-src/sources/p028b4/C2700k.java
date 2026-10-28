package p028b4;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b4.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C2700k extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10619w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC2701l f10620x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2700k(AbstractC2701l abstractC2701l, int i13) {
        super(0);
        this.f10619w = i13;
        this.f10620x = abstractC2701l;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f10619w) {
            case 0:
                this.f10620x.getLayoutNode().m598P();
                break;
            default:
                AbstractC2701l abstractC2701l = this.f10620x;
                if (abstractC2701l.f10621E && abstractC2701l.isAttachedToWindow() && abstractC2701l.getView().getParent() == abstractC2701l) {
                    abstractC2701l.getSnapshotObserver().m457a(abstractC2701l, C2692c.f10592x, abstractC2701l.getUpdate());
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
