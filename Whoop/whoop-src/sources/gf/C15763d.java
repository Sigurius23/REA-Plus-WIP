package gf;

import d93.InterfaceC11823d;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C15763d implements Map.Entry, InterfaceC11823d {

    /* JADX INFO: renamed from: w */
    public final Object f59425w;

    /* JADX INFO: renamed from: x */
    public Object f59426x;

    public C15763d(String str, Object obj) {
        this.f59425w = str;
        this.f59426x = obj;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC22676k.m65745e(entry.getKey(), this.f59425w) && AbstractC22676k.m65745e(entry.getValue(), this.f59426x)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f59425w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f59426x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f59425w;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.f59426x;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f59426x = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f59425w);
        sb4.append('=');
        sb4.append(this.f59426x);
        return sb4.toString();
    }
}
