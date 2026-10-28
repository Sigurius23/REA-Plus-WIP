package p002a0;

import androidx.datastore.preferences.protobuf.C1202b1;
import androidx.datastore.preferences.protobuf.C1208d1;
import androidx.health.platform.client.proto.C1546w2;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: a0.a */
/* JADX INFO: loaded from: classes5.dex */
public class C0004a extends AbstractSet {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Map f10x;

    public /* synthetic */ C0004a(Map map, int i13) {
        this.f9w = i13;
        this.f10x = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f9w) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C1202b1) this.f10x).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C1546w2) this.f10x).m4933g((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f9w) {
            case 1:
                ((C1202b1) this.f10x).clear();
                break;
            case 2:
                ((C1546w2) this.f10x).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f9w) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C1202b1) this.f10x).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C1546w2) this.f10x).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f9w) {
            case 0:
                return new C0013d((C0022g) this.f10x);
            case 1:
                return new C1208d1((C1202b1) this.f10x, 0);
            default:
                return new C1208d1((C1546w2) this.f10x, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f9w) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C1202b1) this.f10x).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C1546w2) this.f10x).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f9w) {
            case 0:
                return ((C0022g) this.f10x).f50y;
            case 1:
                return ((C1202b1) this.f10x).size();
            default:
                return ((C1546w2) this.f10x).size();
        }
    }
}
