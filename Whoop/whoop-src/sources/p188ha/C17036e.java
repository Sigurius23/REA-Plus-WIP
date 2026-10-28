package p188ha;

import java.util.Objects;

/* JADX INFO: renamed from: ha.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C17036e extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final String f65516b;

    /* JADX INFO: renamed from: c */
    public final String f65517c;

    /* JADX INFO: renamed from: d */
    public final String f65518d;

    public C17036e(String str, String str2, String str3) {
        super("COMM");
        this.f65516b = str;
        this.f65517c = str2;
        this.f65518d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17036e.class == obj.getClass()) {
            C17036e c17036e = (C17036e) obj;
            if (Objects.equals(this.f65517c, c17036e.f65517c) && Objects.equals(this.f65516b, c17036e.f65516b) && Objects.equals(this.f65518d, c17036e.f65518d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f65516b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65517c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f65518d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p188ha.AbstractC17041j
    public final String toString() {
        return this.f65528a + ": language=" + this.f65516b + ", description=" + this.f65517c + ", text=" + this.f65518d;
    }
}
