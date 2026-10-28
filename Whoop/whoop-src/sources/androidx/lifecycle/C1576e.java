package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C1576e {

    /* JADX INFO: renamed from: a */
    public final int f6206a;

    /* JADX INFO: renamed from: b */
    public final Method f6207b;

    public C1576e(Method method, int i13) {
        this.f6206a = i13;
        this.f6207b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1576e)) {
            return false;
        }
        C1576e c1576e = (C1576e) obj;
        return this.f6206a == c1576e.f6206a && this.f6207b.getName().equals(c1576e.f6207b.getName());
    }

    public final int hashCode() {
        return this.f6207b.getName().hashCode() + (this.f6206a * 31);
    }
}
