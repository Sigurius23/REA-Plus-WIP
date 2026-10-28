package p002a0;

import d93.InterfaceC11820a;
import java.util.Map;

/* JADX INFO: renamed from: a0.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0008b0 implements Map.Entry, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final Object f21w;

    /* JADX INFO: renamed from: x */
    public final Object f22x;

    public C0008b0(Object obj, Object obj2) {
        this.f21w = obj;
        this.f22x = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22x;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
