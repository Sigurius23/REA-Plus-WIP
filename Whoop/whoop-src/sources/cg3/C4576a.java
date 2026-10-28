package cg3;

import a33.C0352d;
import dg3.C12012a;
import dg3.InterfaceC12013b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kr.C22786e;
import u00.C34377e;

/* JADX INFO: renamed from: cg3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4576a implements Iterator {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0352d f18429E;

    /* JADX INFO: renamed from: w */
    public final CharSequence f18430w;

    /* JADX INFO: renamed from: x */
    public C12012a f18431x = null;

    /* JADX INFO: renamed from: y */
    public int f18432y = 0;

    /* JADX INFO: renamed from: z */
    public int f18433z = 0;

    public C4576a(C0352d c0352d, CharSequence charSequence) {
        this.f18429E = c0352d;
        this.f18430w = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        InterfaceC12013b interfaceC12013b;
        if (this.f18431x == null) {
            CharSequence charSequence = this.f18430w;
            int length = charSequence.length();
            while (true) {
                int i13 = this.f18432y;
                if (i13 >= length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i13);
                C0352d c0352d = this.f18429E;
                if (cCharAt == ':') {
                    interfaceC12013b = (C34377e) c0352d.f1237x;
                } else if (cCharAt == '@') {
                    interfaceC12013b = (C22786e) c0352d.f1239z;
                } else if (cCharAt != 'w') {
                    c0352d.getClass();
                    interfaceC12013b = null;
                } else {
                    interfaceC12013b = (C22786e) c0352d.f1238y;
                }
                if (interfaceC12013b != null) {
                    C12012a c12012aMo33146l = interfaceC12013b.mo33146l(charSequence, this.f18432y, this.f18433z);
                    if (c12012aMo33146l != null) {
                        this.f18431x = c12012aMo33146l;
                        int i14 = c12012aMo33146l.f39744y;
                        this.f18432y = i14;
                        this.f18433z = i14;
                        break;
                    }
                    this.f18432y++;
                } else {
                    this.f18432y++;
                }
            }
        }
        return this.f18431x != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C12012a c12012a = this.f18431x;
        this.f18431x = null;
        return c12012a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
