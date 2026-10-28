package mp;

import java.io.Serializable;
import java.util.Arrays;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: mp.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C25768g implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Object f101482w;

    public C25768g(Object obj) {
        this.f101482w = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25768g) {
            return AbstractC25753b.m75996h(this.f101482w, ((C25768g) obj).f101482w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f101482w});
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Suppliers.ofInstance(", this.f101482w.toString(), ")");
    }
}
