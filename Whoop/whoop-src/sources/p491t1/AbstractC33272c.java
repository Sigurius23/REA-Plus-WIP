package p491t1;

import d93.InterfaceC11820a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m83.AbstractC25242e;
import p476s1.C32054a;

/* JADX INFO: renamed from: t1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC33272c extends AbstractC25242e implements List, Collection, InterfaceC11820a {
    /* JADX INFO: renamed from: c */
    public abstract AbstractC33272c mo105551c(int i13, Object obj);

    @Override // m83.AbstractC25234a, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC33272c mo105552d(Object obj);

    /* JADX INFO: renamed from: e */
    public AbstractC33272c mo105553e(Collection collection) {
        C33275f c33275fMo105554g = mo105554g();
        c33275fMo105554g.addAll(collection);
        return c33275fMo105554g.m105581d();
    }

    /* JADX INFO: renamed from: g */
    public abstract C33275f mo105554g();

    @Override // m83.AbstractC25242e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public abstract AbstractC33272c mo105555j(C33271b c33271b);

    /* JADX INFO: renamed from: l */
    public abstract AbstractC33272c mo105556l(int i13);

    @Override // m83.AbstractC25242e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: m */
    public abstract AbstractC33272c mo105557m(int i13, Object obj);

    @Override // m83.AbstractC25242e, java.util.List
    public final List subList(int i13, int i14) {
        return new C32054a(this, i13, i14);
    }
}
