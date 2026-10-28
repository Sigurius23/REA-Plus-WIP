package p690zr;

import java.io.Serializable;

/* JADX INFO: renamed from: zr.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41011c0 extends AbstractC41039m implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Object f176970w;

    /* JADX INFO: renamed from: x */
    public final Object f176971x;

    public C41011c0(Object obj, Object obj2) {
        this.f176970w = obj;
        this.f176971x = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f176970w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f176971x;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
