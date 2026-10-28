package x43;

import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x43.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C37985q {

    /* JADX INFO: renamed from: a */
    public final int f162643a;

    /* JADX INFO: renamed from: b */
    public final List f162644b;

    public C37985q(int i13, List list) {
        this.f162643a = i13;
        this.f162644b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37985q)) {
            return false;
        }
        C37985q c37985q = (C37985q) obj;
        return this.f162643a == c37985q.f162643a && AbstractC22676k.m65745e(this.f162644b, c37985q.f162644b);
    }

    public final int hashCode() {
        return this.f162644b.hashCode() + (Integer.hashCode(this.f162643a) * 31);
    }

    public final String toString() {
        return "VideoErrorDetail(code=" + this.f162643a + ", messages=" + this.f162644b + ")";
    }
}
