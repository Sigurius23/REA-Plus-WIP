package p511u1;

import d93.InterfaceC11820a;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u1.a */
/* JADX INFO: loaded from: classes.dex */
public class C34394a implements Map.Entry, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final Object f144597w;

    /* JADX INFO: renamed from: x */
    public final Object f144598x;

    public C34394a(Object obj, Object obj2) {
        this.f144597w = obj;
        this.f144598x = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC22676k.m65745e(entry.getKey(), this.f144597w) && AbstractC22676k.m65745e(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f144597w;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f144598x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f144597w;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f144597w);
        sb4.append('=');
        sb4.append(getValue());
        return sb4.toString();
    }
}
