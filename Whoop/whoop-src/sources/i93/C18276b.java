package i93;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i93.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C18276b implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final int f71125w;

    /* JADX INFO: renamed from: x */
    public final int f71126x;

    /* JADX INFO: renamed from: y */
    public boolean f71127y;

    /* JADX INFO: renamed from: z */
    public int f71128z;

    public C18276b(char c3, char c7, int i13) {
        this.f71125w = i13;
        this.f71126x = c7;
        boolean z4 = false;
        if (i13 <= 0 ? AbstractC22676k.m65751k(c3, c7) >= 0 : AbstractC22676k.m65751k(c3, c7) <= 0) {
            z4 = true;
        }
        this.f71127y = z4;
        this.f71128z = z4 ? c3 : c7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71127y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f71128z;
        if (i13 != this.f71126x) {
            this.f71128z = this.f71125w + i13;
        } else {
            if (!this.f71127y) {
                throw new NoSuchElementException();
            }
            this.f71127y = false;
        }
        return Character.valueOf((char) i13);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
