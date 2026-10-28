package o63;

import d93.InterfaceC11823d;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o63.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C27619j implements Map.Entry, InterfaceC11823d {

    /* JADX INFO: renamed from: w */
    public final Object f111154w;

    /* JADX INFO: renamed from: x */
    public Object f111155x;

    public C27619j(Object obj, Object obj2) {
        this.f111154w = obj;
        this.f111155x = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC22676k.m65745e(entry.getKey(), this.f111154w) && AbstractC22676k.m65745e(entry.getValue(), this.f111155x)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f111154w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f111155x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f111154w;
        AbstractC22676k.m65747g(obj);
        int iHashCode = obj.hashCode() + 527;
        Object obj2 = this.f111155x;
        AbstractC22676k.m65747g(obj2);
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f111155x = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f111154w);
        sb4.append('=');
        sb4.append(this.f111155x);
        return sb4.toString();
    }
}
