package androidx.health.platform.client.proto;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1557z0 extends AbstractC1438b implements InterfaceC1435a1, RandomAccess {

    /* JADX INFO: renamed from: x */
    public final ArrayList f6167x;

    static {
        new C1557z0(10).f6021w = false;
    }

    public C1557z0(int i13) {
        this(new ArrayList(i13));
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1435a1
    /* JADX INFO: renamed from: M0 */
    public final void mo4565M0(C1468h c1468h) {
        m4569a();
        this.f6167x.add(c1468h);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        m4569a();
        this.f6167x.add(i13, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.AbstractC1438b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f6167x.size(), collection);
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1435a1
    /* JADX INFO: renamed from: b */
    public final List mo4566b() {
        return Collections.unmodifiableList(this.f6167x);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1438b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m4569a();
        this.f6167x.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        ArrayList arrayList = this.f6167x;
        Object obj = arrayList.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C1468h)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, AbstractC1549x0.f6150a);
            if (AbstractC1517q3.f6107a.m4967r(bArr, 0, bArr.length)) {
                arrayList.set(i13, str);
            }
            return str;
        }
        C1468h c1468h = (C1468h) obj;
        String str2 = c1468h.size() == 0 ? "" : new String(c1468h.f6047x, c1468h.mo4610e(), c1468h.size(), AbstractC1549x0.f6150a);
        int iMo4610e = c1468h.mo4610e();
        if (AbstractC1517q3.f6107a.m4967r(c1468h.f6047x, iMo4610e, c1468h.size() + iMo4610e)) {
            arrayList.set(i13, str2);
        }
        return str2;
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1544w0
    /* JADX INFO: renamed from: i */
    public final InterfaceC1544w0 mo4923i(int i13) {
        ArrayList arrayList = this.f6167x;
        if (i13 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i13);
        arrayList2.addAll(arrayList);
        return new C1557z0(arrayList2);
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1435a1
    /* JADX INFO: renamed from: k */
    public final InterfaceC1435a1 mo4567k() {
        return this.f6021w ? new C1477i3(this) : this;
    }

    @Override // androidx.health.platform.client.proto.AbstractC1438b, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        m4569a();
        Object objRemove = this.f6167x.remove(i13);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C1468h)) {
            return new String((byte[]) objRemove, AbstractC1549x0.f6150a);
        }
        C1468h c1468h = (C1468h) objRemove;
        return c1468h.size() == 0 ? "" : new String(c1468h.f6047x, c1468h.mo4610e(), c1468h.size(), AbstractC1549x0.f6150a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        m4569a();
        Object obj2 = this.f6167x.set(i13, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C1468h)) {
            return new String((byte[]) obj2, AbstractC1549x0.f6150a);
        }
        C1468h c1468h = (C1468h) obj2;
        return c1468h.size() == 0 ? "" : new String(c1468h.f6047x, c1468h.mo4610e(), c1468h.size(), AbstractC1549x0.f6150a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6167x.size();
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1435a1
    /* JADX INFO: renamed from: x */
    public final Object mo4568x(int i13) {
        return this.f6167x.get(i13);
    }

    public C1557z0(ArrayList arrayList) {
        this.f6167x = arrayList;
    }

    @Override // androidx.health.platform.client.proto.AbstractC1438b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        m4569a();
        if (collection instanceof InterfaceC1435a1) {
            collection = ((InterfaceC1435a1) collection).mo4566b();
        }
        boolean zAddAll = this.f6167x.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
