package v03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: v03.i */
/* JADX INFO: loaded from: classes11.dex */
public final class C35522i implements InterfaceC35517d {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f151140y = 0;

    /* JADX INFO: renamed from: w */
    public final List f151141w;

    /* JADX INFO: renamed from: x */
    public final List f151142x;

    static {
        C35518e.m112679a(Collections.EMPTY_SET);
    }

    public C35522i(List list, List list2) {
        this.f151141w = list;
        this.f151142x = list2;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        List list = this.f151141w;
        int size = list.size();
        List list2 = this.f151142x;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Collection collection = (Collection) ((InterfaceC35521h) list2.get(i13)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i14 = 0; i14 < size3; i14++) {
            Object obj = ((InterfaceC35521h) list.get(i14)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i15 = 0; i15 < size4; i15++) {
            for (Object obj2 : (Collection) arrayList.get(i15)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
