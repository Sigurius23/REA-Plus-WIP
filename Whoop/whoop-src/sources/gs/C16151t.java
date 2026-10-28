package gs;

import com.google.crypto.tink.internal.C5101l0;
import ih0.AbstractC18489d0;
import java.util.Objects;

/* JADX INFO: renamed from: gs.t */
/* JADX INFO: loaded from: classes.dex */
public final class C16151t extends AbstractC16127d {

    /* JADX INFO: renamed from: a */
    public final int f61364a;

    /* JADX INFO: renamed from: b */
    public final C16139j f61365b;

    public C16151t(int i13, C16139j c16139j) {
        this.f61364a = i13;
        this.f61365b = c16139j;
    }

    /* JADX INFO: renamed from: b */
    public static C5101l0 m45694b() {
        C5101l0 c5101l0 = new C5101l0(13, false);
        c5101l0.f21443x = null;
        c5101l0.f21444y = C16139j.f61312s;
        return c5101l0;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f61365b != C16139j.f61312s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16151t)) {
            return false;
        }
        C16151t c16151t = (C16151t) obj;
        return c16151t.f61364a == this.f61364a && c16151t.f61365b == this.f61365b;
    }

    public final int hashCode() {
        return Objects.hash(C16151t.class, Integer.valueOf(this.f61364a), this.f61365b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb4.append(this.f61365b);
        sb4.append(", ");
        return AbstractC18489d0.m53371l(sb4, this.f61364a, "-byte key)");
    }
}
