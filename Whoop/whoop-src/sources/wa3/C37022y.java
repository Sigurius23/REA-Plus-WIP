package wa3;

import af3.C0845u;
import androidx.datastore.preferences.protobuf.C1209e;
import java.util.Iterator;

/* JADX INFO: renamed from: wa3.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C37022y implements Iterator {

    /* JADX INFO: renamed from: w */
    public final C0845u f158389w;

    /* JADX INFO: renamed from: x */
    public C1209e f158390x;

    /* JADX INFO: renamed from: y */
    public int f158391y;

    public C37022y(C37023z c37023z) {
        C0845u c0845u = new C0845u(c37023z);
        this.f158389w = c0845u;
        this.f158390x = new C1209e(c0845u.m2060a());
        this.f158391y = c37023z.f158396x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f158391y > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f158390x.hasNext()) {
            this.f158390x = new C1209e(this.f158389w.m2060a());
        }
        this.f158391y--;
        return Byte.valueOf(this.f158390x.m3792a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
