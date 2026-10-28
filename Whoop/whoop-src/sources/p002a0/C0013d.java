package p002a0;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C0013d implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: w */
    public int f31w;

    /* JADX INFO: renamed from: x */
    public int f32x = -1;

    /* JADX INFO: renamed from: y */
    public boolean f33y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0022g f34z;

    public C0013d(C0022g c0022g) {
        this.f34z = c0022g;
        this.f31w = c0022g.f50y - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f33y) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i13 = this.f32x;
        C0022g c0022g = this.f34z;
        return AbstractC22676k.m65745e(key, c0022g.m38g(i13)) && AbstractC22676k.m65745e(entry.getValue(), c0022g.m42k(this.f32x));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f33y) {
            return this.f34z.m38g(this.f32x);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f33y) {
            return this.f34z.m42k(this.f32x);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32x < this.f31w;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f33y) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i13 = this.f32x;
        C0022g c0022g = this.f34z;
        Object objM38g = c0022g.m38g(i13);
        Object objM42k = c0022g.m42k(this.f32x);
        return (objM38g == null ? 0 : objM38g.hashCode()) ^ (objM42k != null ? objM42k.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f32x++;
        this.f33y = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f33y) {
            throw new IllegalStateException();
        }
        this.f34z.mo40i(this.f32x);
        this.f32x--;
        this.f31w--;
        this.f33y = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f33y) {
            return this.f34z.mo41j(this.f32x, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
