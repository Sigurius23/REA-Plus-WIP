package ob3;

import java.util.ArrayList;

/* JADX INFO: renamed from: ob3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C27791a extends ArrayList implements InterfaceC27800j {
    public C27791a(int i13) {
        super(i13);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC27801k) {
            return super.contains((InterfaceC27801k) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC27801k) {
            return super.indexOf((InterfaceC27801k) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC27801k) {
            return super.lastIndexOf((InterfaceC27801k) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC27801k) {
            return super.remove((InterfaceC27801k) obj);
        }
        return false;
    }
}
