package p310lp;

import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: lp.c */
/* JADX INFO: loaded from: classes.dex */
public final class C24624c extends AbstractC24626e {

    /* JADX INFO: renamed from: y */
    public final transient AbstractC24626e f96353y;

    public C24624c(AbstractC24626e abstractC24626e) {
        this.f96353y = abstractC24626e;
    }

    @Override // p310lp.AbstractC24626e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f96353y.contains(obj);
    }

    @Override // p310lp.AbstractC24626e
    /* JADX INFO: renamed from: f */
    public final AbstractC24626e mo71959f() {
        return this.f96353y;
    }

    @Override // p310lp.AbstractC24626e, java.util.List
    /* JADX INFO: renamed from: g */
    public final AbstractC24626e subList(int i13, int i14) {
        AbstractC24626e abstractC24626e = this.f96353y;
        AbstractC21598x.m60648D0(i13, i14, abstractC24626e.size());
        return abstractC24626e.subList(abstractC24626e.size() - i14, abstractC24626e.size() - i13).mo71959f();
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC24626e abstractC24626e = this.f96353y;
        AbstractC21598x.m60646C0(i13, abstractC24626e.size());
        return abstractC24626e.get((abstractC24626e.size() - 1) - i13);
    }

    @Override // p310lp.AbstractC24626e, java.util.List
    public final int indexOf(Object obj) {
        AbstractC24626e abstractC24626e = this.f96353y;
        int iLastIndexOf = abstractC24626e.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC24626e.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p310lp.AbstractC24626e, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC24626e abstractC24626e = this.f96353y;
        int iIndexOf = abstractC24626e.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC24626e.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f96353y.size();
    }
}
