package i93;

import d93.InterfaceC11820a;
import j93.AbstractC21478l0;
import java.util.Iterator;

/* JADX INFO: renamed from: i93.h */
/* JADX INFO: loaded from: classes5.dex */
public class C18282h implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final int f71133w;

    /* JADX INFO: renamed from: x */
    public final int f71134x;

    /* JADX INFO: renamed from: y */
    public final int f71135y;

    public C18282h(int i13, int i14, int i15) {
        if (i15 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i15 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f71133w = i13;
        this.f71134x = AbstractC21478l0.m60400F(i13, i14, i15);
        this.f71135y = i15;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18282h)) {
            return false;
        }
        if (isEmpty() && ((C18282h) obj).isEmpty()) {
            return true;
        }
        C18282h c18282h = (C18282h) obj;
        return this.f71133w == c18282h.f71133w && this.f71134x == c18282h.f71134x && this.f71135y == c18282h.f71135y;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f71133w * 31) + this.f71134x) * 31) + this.f71135y;
    }

    public boolean isEmpty() {
        int i13 = this.f71135y;
        int i14 = this.f71134x;
        int i15 = this.f71133w;
        if (i13 > 0) {
            return i15 > i14;
        }
        return i15 < i14;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C18283i(this.f71133w, this.f71134x, this.f71135y);
    }

    public String toString() {
        StringBuilder sb4;
        int i13 = this.f71134x;
        int i14 = this.f71133w;
        int i15 = this.f71135y;
        if (i15 > 0) {
            sb4 = new StringBuilder();
            sb4.append(i14);
            sb4.append("..");
            sb4.append(i13);
            sb4.append(" step ");
            sb4.append(i15);
        } else {
            sb4 = new StringBuilder();
            sb4.append(i14);
            sb4.append(" downTo ");
            sb4.append(i13);
            sb4.append(" step ");
            sb4.append(-i15);
        }
        return sb4.toString();
    }
}
