package p188ha;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: ha.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C17034c extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final String f65505b;

    /* JADX INFO: renamed from: c */
    public final int f65506c;

    /* JADX INFO: renamed from: d */
    public final int f65507d;

    /* JADX INFO: renamed from: e */
    public final long f65508e;

    /* JADX INFO: renamed from: f */
    public final long f65509f;

    /* JADX INFO: renamed from: g */
    public final AbstractC17041j[] f65510g;

    public C17034c(String str, int i13, int i14, long j7, long j13, AbstractC17041j[] abstractC17041jArr) {
        super("CHAP");
        this.f65505b = str;
        this.f65506c = i13;
        this.f65507d = i14;
        this.f65508e = j7;
        this.f65509f = j13;
        this.f65510g = abstractC17041jArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17034c.class == obj.getClass()) {
            C17034c c17034c = (C17034c) obj;
            if (this.f65506c == c17034c.f65506c && this.f65507d == c17034c.f65507d && this.f65508e == c17034c.f65508e && this.f65509f == c17034c.f65509f && Objects.equals(this.f65505b, c17034c.f65505b) && Arrays.equals(this.f65510g, c17034c.f65510g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (((((((527 + this.f65506c) * 31) + this.f65507d) * 31) + ((int) this.f65508e)) * 31) + ((int) this.f65509f)) * 31;
        String str = this.f65505b;
        return i13 + (str != null ? str.hashCode() : 0);
    }
}
