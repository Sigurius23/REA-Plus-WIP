package p358o6;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o6.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C27598f {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f111088a;

    public C27598f(LinkedHashMap linkedHashMap) {
        this.f111088a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C27598f) {
            return this.f111088a.equals(((C27598f) obj).f111088a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f111088a.hashCode();
    }

    public final String toString() {
        return this.f111088a.toString();
    }
}
