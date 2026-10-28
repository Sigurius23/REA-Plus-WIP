package p188ha;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: ha.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C17035d extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final String f65511b;

    /* JADX INFO: renamed from: c */
    public final boolean f65512c;

    /* JADX INFO: renamed from: d */
    public final boolean f65513d;

    /* JADX INFO: renamed from: e */
    public final String[] f65514e;

    /* JADX INFO: renamed from: f */
    public final AbstractC17041j[] f65515f;

    public C17035d(String str, boolean z4, boolean z13, String[] strArr, AbstractC17041j[] abstractC17041jArr) {
        super("CTOC");
        this.f65511b = str;
        this.f65512c = z4;
        this.f65513d = z13;
        this.f65514e = strArr;
        this.f65515f = abstractC17041jArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17035d.class == obj.getClass()) {
            C17035d c17035d = (C17035d) obj;
            if (this.f65512c == c17035d.f65512c && this.f65513d == c17035d.f65513d && Objects.equals(this.f65511b, c17035d.f65511b) && Arrays.equals(this.f65514e, c17035d.f65514e) && Arrays.equals(this.f65515f, c17035d.f65515f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (((527 + (this.f65512c ? 1 : 0)) * 31) + (this.f65513d ? 1 : 0)) * 31;
        String str = this.f65511b;
        return i13 + (str != null ? str.hashCode() : 0);
    }
}
