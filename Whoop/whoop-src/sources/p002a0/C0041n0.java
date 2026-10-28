package p002a0;

import d93.InterfaceC11820a;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: a0.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0041n0 implements ListIterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125w;

    /* JADX INFO: renamed from: x */
    public final Object f126x;

    /* JADX INFO: renamed from: y */
    public int f127y;

    public C0041n0(List list, int i13, int i14) {
        this.f125w = i14;
        switch (i14) {
            case 1:
                this.f126x = list;
                this.f127y = i13;
                break;
            default:
                this.f126x = list;
                this.f127y = i13 - 1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f125w) {
            case 0:
                int i13 = this.f127y + 1;
                this.f127y = i13;
                this.f126x.add(i13, obj);
                break;
            default:
                this.f126x.add(this.f127y, obj);
                this.f127y++;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f125w) {
            case 0:
                return this.f127y < this.f126x.size() - 1;
            default:
                return this.f127y < this.f126x.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f125w) {
            case 0:
                return this.f127y >= 0;
            default:
                return this.f127y > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f125w) {
            case 0:
                int i13 = this.f127y + 1;
                this.f127y = i13;
                return this.f126x.get(i13);
            default:
                int i14 = this.f127y;
                this.f127y = i14 + 1;
                return this.f126x.get(i14);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f125w) {
            case 0:
                return this.f127y + 1;
            default:
                return this.f127y;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f125w) {
            case 0:
                int i13 = this.f127y;
                this.f127y = i13 - 1;
                return this.f126x.get(i13);
            default:
                int i14 = this.f127y - 1;
                this.f127y = i14;
                return this.f126x.get(i14);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f125w) {
            case 0:
                return this.f127y;
            default:
                return this.f127y - 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f125w) {
            case 0:
                this.f126x.remove(this.f127y);
                this.f127y--;
                break;
            default:
                int i13 = this.f127y - 1;
                this.f127y = i13;
                this.f126x.remove(i13);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f125w) {
            case 0:
                this.f126x.set(this.f127y, obj);
                break;
            default:
                this.f126x.set(this.f127y, obj);
                break;
        }
    }
}
