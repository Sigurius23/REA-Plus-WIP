package p141f9;

import java.util.Objects;

/* JADX INFO: renamed from: f9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C14264f {

    /* JADX INFO: renamed from: a */
    public final String f52087a;

    /* JADX INFO: renamed from: b */
    public final String f52088b;

    /* JADX INFO: renamed from: c */
    public final String f52089c;

    public C14264f(String str, String str2, String str3) {
        this.f52087a = str;
        this.f52088b = str2;
        this.f52089c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14264f.class == obj.getClass()) {
            C14264f c14264f = (C14264f) obj;
            if (Objects.equals(this.f52087a, c14264f.f52087a) && Objects.equals(this.f52088b, c14264f.f52088b) && Objects.equals(this.f52089c, c14264f.f52089c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f52087a.hashCode() * 31;
        String str = this.f52088b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f52089c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
