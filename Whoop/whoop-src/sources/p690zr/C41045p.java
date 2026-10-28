package p690zr;

import java.io.Serializable;
import java.util.Arrays;
import p658yr.InterfaceC39718e;

/* JADX INFO: renamed from: zr.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C41045p extends AbstractC41058v0 implements Serializable {

    /* JADX INFO: renamed from: w */
    public final InterfaceC39718e f177034w;

    /* JADX INFO: renamed from: x */
    public final AbstractC41058v0 f177035x;

    public C41045p(InterfaceC39718e interfaceC39718e, AbstractC41058v0 abstractC41058v0) {
        this.f177034w = interfaceC39718e;
        this.f177035x = abstractC41058v0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC39718e interfaceC39718e = this.f177034w;
        return this.f177035x.compare(interfaceC39718e.apply(obj), interfaceC39718e.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41045p) {
            C41045p c41045p = (C41045p) obj;
            if (this.f177034w.equals(c41045p.f177034w) && this.f177035x.equals(c41045p.f177035x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f177034w, this.f177035x});
    }

    public final String toString() {
        return this.f177035x + ".onResultOf(" + this.f177034w + ")";
    }
}
