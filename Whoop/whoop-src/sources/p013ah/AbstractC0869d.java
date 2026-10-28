package p013ah;

import java.util.Objects;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: ah.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC0869d {

    /* JADX INFO: renamed from: a */
    public final int f3161a;

    /* JADX INFO: renamed from: b */
    public C0878m f3162b;

    public AbstractC0869d(int i13) {
        this.f3161a = i13;
        if (i13 == 0) {
            throw new NullPointerException("majorType is null");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC0869d)) {
            return false;
        }
        AbstractC0869d abstractC0869d = (AbstractC0869d) obj;
        int i13 = abstractC0869d.f3161a;
        C0878m c0878m = this.f3162b;
        int i14 = this.f3161a;
        if (c0878m != null) {
            return c0878m.equals(abstractC0869d.f3162b) && i14 == i13;
        }
        return abstractC0869d.f3162b == null && i14 == i13;
    }

    public int hashCode() {
        return Objects.hash(AbstractC12682p.m35481a(this.f3161a), this.f3162b);
    }
}
