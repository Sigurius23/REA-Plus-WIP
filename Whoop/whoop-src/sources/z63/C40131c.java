package z63;

import java.util.HashMap;
import p171g9.C15594k;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: z63.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C40131c {

    /* JADX INFO: renamed from: a */
    public final String f173182a;

    public C40131c(String str) {
        this.f173182a = str;
    }

    /* JADX INFO: renamed from: a */
    public final Object m128674a(C15594k c15594k) {
        Object obj = c15594k.f58544a.get(this);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(this.f173182a);
    }

    /* JADX INFO: renamed from: b */
    public final void m128675b(C15594k c15594k, Object obj) {
        HashMap map = c15594k.f58544a;
        if (obj == null) {
            map.remove(this);
        } else {
            map.put(this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C40131c.class != obj.getClass()) {
            return false;
        }
        return this.f173182a.equals(((C40131c) obj).f173182a);
    }

    public final int hashCode() {
        return this.f173182a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f173182a, "'}", new StringBuilder("Prop{name='"));
    }
}
