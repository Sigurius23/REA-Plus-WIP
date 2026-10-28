package p312lx;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import mx.AbstractC25990c;
import p129ex.C13724a;
import p264jx.C21997d;
import p264jx.InterfaceC21994a;
import p264jx.InterfaceC21996c;

/* JADX INFO: renamed from: lx.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24780a extends AbstractC25990c implements InterfaceC21996c {

    /* JADX INFO: renamed from: J */
    private List<Object> f96954J;

    public AbstractC24780a() {
        m72640Y(null);
    }

    @Override // mx.AbstractC25990c
    /* JADX INFO: renamed from: G */
    public void mo72637G() {
        m77100N();
    }

    /* JADX INFO: renamed from: W */
    public void m72638W(List<Object> list) {
        m72639X(list);
    }

    /* JADX INFO: renamed from: X */
    public void m72639X(List<Object> list) {
        m72641Z();
        if (list == null) {
            list = new LinkedList<>();
        }
        this.f96954J = list;
        m77097H();
    }

    /* JADX INFO: renamed from: Y */
    public void m72640Y(InterfaceC21996c interfaceC21996c) {
        if (interfaceC21996c != null) {
            InterfaceC21994a interfaceC21994aM62851p0 = interfaceC21996c.m62851p0();
            ((C13724a) ((C21997d) interfaceC21994aM62851p0).f85233a.f42881x).add(this.f102694H);
        }
        m72639X(interfaceC21996c);
    }

    /* JADX INFO: renamed from: Z */
    public void m72641Z() {
        List<Object> list = this.f96954J;
        if (list instanceof InterfaceC21996c) {
            InterfaceC21994a interfaceC21994aM62851p0 = ((InterfaceC21996c) list).m62851p0();
            ((C13724a) ((C21997d) interfaceC21994aM62851p0).f85233a.f42881x).remove(this.f102694H);
        }
    }

    @Override // java.util.List
    public void add(int i13, Object obj) {
        this.f96954J.add(i13, obj);
        m77104R(i13, 1);
    }

    @Override // java.util.List
    public boolean addAll(int i13, Collection<Object> collection) {
        if (!this.f96954J.addAll(i13, collection)) {
            return false;
        }
        m77104R(i13, collection.size());
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        int size = size();
        this.f96954J.clear();
        m77105S(0, size);
    }

    public boolean contains(Object obj) {
        return this.f96954J.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f96954J.containsAll(collection);
    }

    @Override // mx.AbstractC25990c
    /* JADX INFO: renamed from: f */
    public int mo72642f() {
        return this.f96954J.size();
    }

    @Override // mx.AbstractC25990c, java.util.List
    public Object get(int i13) {
        return this.f96954J.get(i13);
    }

    public int indexOf(Object obj) {
        return this.f96954J.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f96954J.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.f96954J.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f96954J.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return this.f96954J.listIterator();
    }

    @Override // java.util.List
    public Object remove(int i13) {
        Object objRemove = this.f96954J.remove(i13);
        m77105S(i13, 1);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = this.f96954J.removeAll(collection);
        if (zRemoveAll) {
            m77100N();
        }
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = this.f96954J.retainAll(collection);
        if (zRetainAll) {
            m77100N();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public Object set(int i13, Object obj) {
        Object obj2 = this.f96954J.set(i13, obj);
        if (!obj2.equals(obj)) {
            m77103Q(i13, 1);
        }
        return obj2;
    }

    public int size() {
        return this.f96954J.size();
    }

    @Override // java.util.List
    public List<Object> subList(int i13, int i14) {
        return this.f96954J.subList(i13, i14);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f96954J.toArray();
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i13) {
        return this.f96954J.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public <S> S[] toArray(S[] sArr) {
        return (S[]) this.f96954J.toArray(sArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        int size = this.f96954J.size();
        boolean zAdd = this.f96954J.add(obj);
        m77104R(size, 1);
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        int size = this.f96954J.size();
        if (!this.f96954J.addAll(collection)) {
            return false;
        }
        m77104R(size, collection.size());
        return true;
    }

    public boolean remove(Object obj) {
        int iIndexOf = this.f96954J.indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        this.f96954J.remove(iIndexOf);
        m77105S(iIndexOf, 1);
        return true;
    }
}
