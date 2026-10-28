package p188ha;

import java.util.Objects;

/* JADX INFO: renamed from: ha.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C17043l extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final String f65530b;

    /* JADX INFO: renamed from: c */
    public final String f65531c;

    /* JADX INFO: renamed from: d */
    public final String f65532d;

    public C17043l(String str, String str2, String str3) {
        super("----");
        this.f65530b = str;
        this.f65531c = str2;
        this.f65532d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17043l.class == obj.getClass()) {
            C17043l c17043l = (C17043l) obj;
            if (Objects.equals(this.f65531c, c17043l.f65531c) && Objects.equals(this.f65530b, c17043l.f65530b) && Objects.equals(this.f65532d, c17043l.f65532d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f65530b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65531c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f65532d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p188ha.AbstractC17041j
    public final String toString() {
        return this.f65528a + ": domain=" + this.f65530b + ", description=" + this.f65531c;
    }
}
