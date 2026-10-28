package ls;

import com.google.crypto.tink.internal.C5101l0;
import ih0.AbstractC18489d0;
import java.util.Objects;
import p154fs.AbstractC14733k;

/* JADX INFO: renamed from: ls.d */
/* JADX INFO: loaded from: classes.dex */
public final class C24707d extends AbstractC14733k {

    /* JADX INFO: renamed from: a */
    public final int f96635a;

    /* JADX INFO: renamed from: b */
    public final C24706c f96636b;

    public C24707d(int i13, C24706c c24706c) {
        this.f96635a = i13;
        this.f96636b = c24706c;
    }

    /* JADX INFO: renamed from: b */
    public static C5101l0 m72316b() {
        C5101l0 c5101l0 = new C5101l0(26, false);
        c5101l0.f21443x = null;
        c5101l0.f21444y = C24706c.f96633d;
        return c5101l0;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f96636b != C24706c.f96633d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24707d)) {
            return false;
        }
        C24707d c24707d = (C24707d) obj;
        return c24707d.f96635a == this.f96635a && c24707d.f96636b == this.f96636b;
    }

    public final int hashCode() {
        return Objects.hash(C24707d.class, Integer.valueOf(this.f96635a), this.f96636b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AesSiv Parameters (variant: ");
        sb4.append(this.f96636b);
        sb4.append(", ");
        return AbstractC18489d0.m53371l(sb4, this.f96635a, "-byte key)");
    }
}
