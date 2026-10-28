package p561vt;

import p108e4.AbstractC12682p;
import p555vl.AbstractC36095b;

/* JADX INFO: renamed from: vt.a */
/* JADX INFO: loaded from: classes.dex */
public final class C36480a {

    /* JADX INFO: renamed from: a */
    public final String f155813a;

    /* JADX INFO: renamed from: b */
    public final String f155814b;

    /* JADX INFO: renamed from: c */
    public final String f155815c;

    /* JADX INFO: renamed from: d */
    public final C36481b f155816d;

    /* JADX INFO: renamed from: e */
    public final int f155817e;

    public C36480a(String str, String str2, String str3, C36481b c36481b, int i13) {
        this.f155813a = str;
        this.f155814b = str2;
        this.f155815c = str3;
        this.f155816d = c36481b;
        this.f155817e = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C36480a)) {
            return false;
        }
        C36480a c36480a = (C36480a) obj;
        int i13 = c36480a.f155817e;
        C36481b c36481b = c36480a.f155816d;
        String str = c36480a.f155815c;
        String str2 = c36480a.f155814b;
        String str3 = c36480a.f155813a;
        String str4 = this.f155813a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f155814b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f155815c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        C36481b c36481b2 = this.f155816d;
        if (c36481b2 == null) {
            if (c36481b != null) {
                return false;
            }
        } else if (!c36481b2.equals(c36481b)) {
            return false;
        }
        int i14 = this.f155817e;
        if (i14 == 0) {
            return i13 == 0;
        }
        return AbstractC12682p.m35483c(i14, i13);
    }

    public final int hashCode() {
        String str = this.f155813a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f155814b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f155815c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C36481b c36481b = this.f155816d;
        int iHashCode4 = (iHashCode3 ^ (c36481b == null ? 0 : c36481b.hashCode())) * 1000003;
        int i13 = this.f155817e;
        return (i13 != 0 ? AbstractC12682p.m35485e(i13) : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f155813a + ", fid=" + this.f155814b + ", refreshToken=" + this.f155815c + ", authToken=" + this.f155816d + ", responseCode=" + AbstractC36095b.m114698z(this.f155817e) + "}";
    }
}
