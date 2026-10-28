package wa3;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: wa3.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C37016s extends AbstractList implements RandomAccess, InterfaceC37017t {

    /* JADX INFO: renamed from: x */
    public static final C37001j0 f158385x = new C37001j0(new C37016s());

    /* JADX INFO: renamed from: w */
    public final ArrayList f158386w;

    public C37016s() {
        this.f158386w = new ArrayList();
    }

    @Override // wa3.InterfaceC37017t
    /* JADX INFO: renamed from: S0 */
    public final void mo118812S0(C37018u c37018u) {
        this.f158386w.add(c37018u);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        this.f158386w.add(i13, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f158386w.size(), collection);
    }

    @Override // wa3.InterfaceC37017t
    /* JADX INFO: renamed from: b */
    public final List mo118813b() {
        return Collections.unmodifiableList(this.f158386w);
    }

    @Override // wa3.InterfaceC37017t
    /* JADX INFO: renamed from: b0 */
    public final AbstractC36990e mo118814b0(int i13) {
        AbstractC36990e c37018u;
        ArrayList arrayList = this.f158386w;
        Object obj = arrayList.get(i13);
        if (obj instanceof AbstractC36990e) {
            c37018u = (AbstractC36990e) obj;
        } else if (obj instanceof String) {
            try {
                c37018u = new C37018u(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e5) {
                throw new RuntimeException("UTF-8 not supported?", e5);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c37018u = new C37018u(bArr2);
        }
        if (c37018u != obj) {
            arrayList.set(i13, c37018u);
        }
        return c37018u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f158386w.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        ArrayList arrayList = this.f158386w;
        Object obj = arrayList.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC36990e) {
            AbstractC36990e abstractC36990e = (AbstractC36990e) obj;
            String strM118753q = abstractC36990e.m118753q();
            if (abstractC36990e.mo118748j()) {
                arrayList.set(i13, strM118753q);
            }
            return strM118753q;
        }
        byte[] bArr = (byte[]) obj;
        String strM118830b = AbstractC37015r.m118830b(bArr);
        if (AbstractC37015r.m118829a(bArr)) {
            arrayList.set(i13, strM118830b);
        }
        return strM118830b;
    }

    @Override // wa3.InterfaceC37017t
    /* JADX INFO: renamed from: k */
    public final C37001j0 mo118815k() {
        return new C37001j0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        Object objRemove = this.f158386w.remove(i13);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof AbstractC36990e ? ((AbstractC36990e) objRemove).m118753q() : AbstractC37015r.m118830b((byte[]) objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        Object obj2 = this.f158386w.set(i13, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof AbstractC36990e ? ((AbstractC36990e) obj2).m118753q() : AbstractC37015r.m118830b((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f158386w.size();
    }

    public C37016s(InterfaceC37017t interfaceC37017t) {
        this.f158386w = new ArrayList(interfaceC37017t.size());
        addAll(interfaceC37017t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        if (collection instanceof InterfaceC37017t) {
            collection = ((InterfaceC37017t) collection).mo118813b();
        }
        boolean zAddAll = this.f158386w.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
