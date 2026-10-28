package androidx.datastore.preferences.protobuf;

import androidx.health.platform.client.proto.C1546w2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1208d1 implements Iterator {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractMap f5379E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5380w;

    /* JADX INFO: renamed from: x */
    public int f5381x = -1;

    /* JADX INFO: renamed from: y */
    public boolean f5382y;

    /* JADX INFO: renamed from: z */
    public Iterator f5383z;

    public /* synthetic */ C1208d1(AbstractMap abstractMap, int i13) {
        this.f5380w = i13;
        this.f5379E = abstractMap;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m3791a() {
        switch (this.f5380w) {
            case 0:
                if (this.f5383z == null) {
                    this.f5383z = ((C1202b1) this.f5379E).f5357x.entrySet().iterator();
                }
                break;
            default:
                if (this.f5383z == null) {
                    this.f5383z = ((C1546w2) this.f5379E).f6137y.entrySet().iterator();
                }
                break;
        }
        return this.f5383z;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5380w) {
            case 0:
                int i13 = this.f5381x + 1;
                C1202b1 c1202b1 = (C1202b1) this.f5379E;
                if (i13 >= c1202b1.f5356w.size()) {
                    return !c1202b1.f5357x.isEmpty() && m3791a().hasNext();
                }
                return true;
            default:
                int i14 = this.f5381x + 1;
                C1546w2 c1546w2 = (C1546w2) this.f5379E;
                if (i14 >= c1546w2.f6136x.size()) {
                    return !c1546w2.f6137y.isEmpty() && m3791a().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5380w) {
            case 0:
                this.f5382y = true;
                int i13 = this.f5381x + 1;
                this.f5381x = i13;
                C1202b1 c1202b1 = (C1202b1) this.f5379E;
                return i13 < c1202b1.f5356w.size() ? (Map.Entry) c1202b1.f5356w.get(this.f5381x) : (Map.Entry) m3791a().next();
            default:
                this.f5382y = true;
                int i14 = this.f5381x + 1;
                this.f5381x = i14;
                C1546w2 c1546w2 = (C1546w2) this.f5379E;
                return i14 < c1546w2.f6136x.size() ? (Map.Entry) c1546w2.f6136x.get(this.f5381x) : (Map.Entry) m3791a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i13 = this.f5380w;
        AbstractMap abstractMap = this.f5379E;
        switch (i13) {
            case 0:
                C1202b1 c1202b1 = (C1202b1) abstractMap;
                if (!this.f5382y) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f5382y = false;
                int i14 = C1202b1.f5354F;
                c1202b1.m3781b();
                if (this.f5381x >= c1202b1.f5356w.size()) {
                    m3791a().remove();
                    return;
                }
                int i15 = this.f5381x;
                this.f5381x = i15 - 1;
                c1202b1.m3786i(i15);
                return;
            default:
                C1546w2 c1546w2 = (C1546w2) abstractMap;
                if (!this.f5382y) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f5382y = false;
                int i16 = C1546w2.f6132G;
                c1546w2.m4929b();
                if (this.f5381x >= c1546w2.f6136x.size()) {
                    m3791a().remove();
                    return;
                }
                int i17 = this.f5381x;
                this.f5381x = i17 - 1;
                c1546w2.m4934h(i17);
                return;
        }
    }
}
