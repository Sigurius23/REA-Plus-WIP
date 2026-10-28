package sx;

import j93.InterfaceC21484q;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m83.AbstractC25250i;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sx.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C33056b extends AbstractC25250i {

    /* JADX INFO: renamed from: w */
    public final List f137849w;

    /* JADX INFO: renamed from: x */
    public final Object[] f137850x;

    public C33056b(List parameterKeys, Object[] objArr) {
        AbstractC22676k.m65750j(parameterKeys, "parameterKeys");
        this.f137849w = parameterKeys;
        this.f137850x = objArr;
    }

    @Override // m83.AbstractC25250i
    /* JADX INFO: renamed from: a */
    public final Set mo74009a() {
        List list = this.f137849w;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new AbstractMap.SimpleEntry((InterfaceC21484q) obj, this.f137850x[i13]));
            i13 = i14;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj2 : arrayList) {
            if (((AbstractMap.SimpleEntry) obj2).getValue() != AbstractC33058d.f137851a) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj instanceof InterfaceC21484q) && this.f137850x[((InterfaceC21484q) obj).getIndex()] != AbstractC33058d.f137851a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if ((obj instanceof InterfaceC21484q) && (obj2 = this.f137850x[((InterfaceC21484q) obj).getIndex()]) != AbstractC33058d.f137851a) {
            return obj2;
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC21484q) ? obj2 : super.getOrDefault((InterfaceC21484q) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        InterfaceC21484q key = (InterfaceC21484q) obj;
        AbstractC22676k.m65750j(key, "key");
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof InterfaceC21484q) {
            return super.remove((InterfaceC21484q) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof InterfaceC21484q) {
            return super.remove((InterfaceC21484q) obj, obj2);
        }
        return false;
    }
}
