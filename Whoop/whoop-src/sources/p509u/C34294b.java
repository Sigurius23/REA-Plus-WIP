package p509u;

import java.util.Iterator;

/* JADX INFO: renamed from: u.b */
/* JADX INFO: loaded from: classes.dex */
public final class C34294b extends AbstractC34297e implements Iterator {

    /* JADX INFO: renamed from: w */
    public C34295c f144030w;

    /* JADX INFO: renamed from: x */
    public C34295c f144031x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f144032y;

    public C34294b(C34295c c34295c, C34295c c34295c2, int i13) {
        this.f144032y = i13;
        this.f144030w = c34295c2;
        this.f144031x = c34295c;
    }

    @Override // p509u.AbstractC34297e
    /* JADX INFO: renamed from: a */
    public final void mo108608a(C34295c c34295c) {
        C34295c c34295c2;
        C34295c c34295cM108609b = null;
        if (this.f144030w == c34295c && c34295c == this.f144031x) {
            this.f144031x = null;
            this.f144030w = null;
        }
        C34295c c34295c3 = this.f144030w;
        if (c34295c3 == c34295c) {
            switch (this.f144032y) {
                case 0:
                    c34295c2 = c34295c3.f144036z;
                    break;
                default:
                    c34295c2 = c34295c3.f144035y;
                    break;
            }
            this.f144030w = c34295c2;
        }
        C34295c c34295c4 = this.f144031x;
        if (c34295c4 == c34295c) {
            C34295c c34295c5 = this.f144030w;
            if (c34295c4 != c34295c5 && c34295c5 != null) {
                c34295cM108609b = m108609b(c34295c4);
            }
            this.f144031x = c34295cM108609b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C34295c m108609b(C34295c c34295c) {
        switch (this.f144032y) {
            case 0:
                return c34295c.f144035y;
            default:
                return c34295c.f144036z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f144031x != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C34295c c34295c = this.f144031x;
        C34295c c34295c2 = this.f144030w;
        this.f144031x = (c34295c == c34295c2 || c34295c2 == null) ? null : m108609b(c34295c);
        return c34295c;
    }
}
