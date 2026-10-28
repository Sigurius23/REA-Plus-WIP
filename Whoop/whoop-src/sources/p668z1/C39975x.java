package p668z1;

import d93.InterfaceC11823d;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z1.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C39975x implements Map.Entry, InterfaceC11823d {

    /* JADX INFO: renamed from: w */
    public final Object f172507w;

    /* JADX INFO: renamed from: x */
    public Object f172508x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C39976y f172509y;

    public C39975x(C39976y c39976y) {
        this.f172509y = c39976y;
        Map.Entry entry = c39976y.f172515z;
        AbstractC22676k.m65747g(entry);
        this.f172507w = entry.getKey();
        Map.Entry entry2 = c39976y.f172515z;
        AbstractC22676k.m65747g(entry2);
        this.f172508x = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f172507w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f172508x;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C39976y c39976y = this.f172509y;
        if (c39976y.f172512w.m128194b().f172476d != c39976y.f172514y) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f172508x;
        c39976y.f172512w.put(this.f172507w, obj);
        this.f172508x = obj;
        return obj2;
    }
}
