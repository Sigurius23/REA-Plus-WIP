package p509u;

import java.util.Iterator;

/* JADX INFO: renamed from: u.d */
/* JADX INFO: loaded from: classes.dex */
public final class C34296d extends AbstractC34297e implements Iterator {

    /* JADX INFO: renamed from: w */
    public C34295c f144037w;

    /* JADX INFO: renamed from: x */
    public boolean f144038x = true;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C34298f f144039y;

    public C34296d(C34298f c34298f) {
        this.f144039y = c34298f;
    }

    @Override // p509u.AbstractC34297e
    /* JADX INFO: renamed from: a */
    public final void mo108608a(C34295c c34295c) {
        C34295c c34295c2 = this.f144037w;
        if (c34295c == c34295c2) {
            C34295c c34295c3 = c34295c2.f144036z;
            this.f144037w = c34295c3;
            this.f144038x = c34295c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f144038x) {
            return this.f144039y.f144040w != null;
        }
        C34295c c34295c = this.f144037w;
        return (c34295c == null || c34295c.f144035y == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f144038x) {
            this.f144038x = false;
            this.f144037w = this.f144039y.f144040w;
        } else {
            C34295c c34295c = this.f144037w;
            this.f144037w = c34295c != null ? c34295c.f144035y : null;
        }
        return this.f144037w;
    }
}
