package af3;

import ih0.AbstractC18489d0;
import java.util.Objects;

/* JADX INFO: renamed from: af3.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C0849y {

    /* JADX INFO: renamed from: a */
    public final int f3049a;

    /* JADX INFO: renamed from: b */
    public final int f3050b;

    /* JADX INFO: renamed from: c */
    public final int f3051c;

    public C0849y(int i13, int i14, int i15) {
        this.f3049a = i13;
        this.f3050b = i14;
        this.f3051c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0849y.class == obj.getClass()) {
            C0849y c0849y = (C0849y) obj;
            if (this.f3049a == c0849y.f3049a && this.f3050b == c0849y.f3050b && this.f3051c == c0849y.f3051c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3049a), Integer.valueOf(this.f3050b), Integer.valueOf(this.f3051c));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SourceSpan{line=");
        sb4.append(this.f3049a);
        sb4.append(", column=");
        sb4.append(this.f3050b);
        sb4.append(", length=");
        return AbstractC18489d0.m53371l(sb4, this.f3051c, "}");
    }
}
