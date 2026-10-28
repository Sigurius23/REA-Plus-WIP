package td3;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: td3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C33735o extends AbstractC33729i {

    /* JADX INFO: renamed from: a */
    public final WeakReference f141115a;

    public C33735o(AbstractC33729i abstractC33729i) {
        this.f141115a = new WeakReference(abstractC33729i);
    }

    @Override // td3.AbstractC33729i
    /* JADX INFO: renamed from: a */
    public final void mo18123a(List list) {
        AbstractC33729i abstractC33729i = (AbstractC33729i) this.f141115a.get();
        if (abstractC33729i != null) {
            abstractC33729i.mo18123a(list);
        }
    }

    @Override // td3.AbstractC33729i
    /* JADX INFO: renamed from: b */
    public final void mo18124b(int i13) {
        AbstractC33729i abstractC33729i = (AbstractC33729i) this.f141115a.get();
        if (abstractC33729i != null) {
            abstractC33729i.mo18124b(i13);
        }
    }

    @Override // td3.AbstractC33729i
    /* JADX INFO: renamed from: c */
    public final void mo18125c(int i13, C33733m c33733m) {
        AbstractC33729i abstractC33729i = (AbstractC33729i) this.f141115a.get();
        if (abstractC33729i != null) {
            abstractC33729i.mo18125c(i13, c33733m);
        }
    }
}
