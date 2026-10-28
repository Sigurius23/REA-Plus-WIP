package mp;

/* JADX INFO: renamed from: mp.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C25783l extends AbstractC25788n {

    /* JADX INFO: renamed from: y */
    public final transient AbstractC25788n f101508y;

    public C25783l(AbstractC25788n abstractC25788n) {
        this.f101508y = abstractC25788n;
    }

    @Override // mp.AbstractC25788n, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f101508y.contains(obj);
    }

    @Override // mp.AbstractC25788n
    /* JADX INFO: renamed from: g */
    public final AbstractC25788n mo76021g() {
        return this.f101508y;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC25788n abstractC25788n = this.f101508y;
        AbstractC25753b.m75993e(i13, abstractC25788n.size());
        return abstractC25788n.get((abstractC25788n.size() - 1) - i13);
    }

    @Override // mp.AbstractC25788n, java.util.List
    public final int indexOf(Object obj) {
        AbstractC25788n abstractC25788n = this.f101508y;
        int iLastIndexOf = abstractC25788n.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC25788n.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // mp.AbstractC25788n, java.util.List
    /* JADX INFO: renamed from: j */
    public final AbstractC25788n subList(int i13, int i14) {
        AbstractC25788n abstractC25788n = this.f101508y;
        AbstractC25753b.m76001m(i13, i14, abstractC25788n.size());
        return abstractC25788n.subList(abstractC25788n.size() - i14, abstractC25788n.size() - i13).mo76021g();
    }

    @Override // mp.AbstractC25788n, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC25788n abstractC25788n = this.f101508y;
        int iIndexOf = abstractC25788n.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC25788n.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f101508y.size();
    }
}
