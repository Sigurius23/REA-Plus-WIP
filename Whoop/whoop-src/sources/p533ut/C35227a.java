package p533ut;

import p108e4.AbstractC12682p;
import p319m4.AbstractC25012a;
import pa3.C29039b;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ut.a */
/* JADX INFO: loaded from: classes.dex */
public final class C35227a {

    /* JADX INFO: renamed from: a */
    public final String f149823a;

    /* JADX INFO: renamed from: b */
    public final int f149824b;

    /* JADX INFO: renamed from: c */
    public final String f149825c;

    /* JADX INFO: renamed from: d */
    public final String f149826d;

    /* JADX INFO: renamed from: e */
    public final long f149827e;

    /* JADX INFO: renamed from: f */
    public final long f149828f;

    /* JADX INFO: renamed from: g */
    public final String f149829g;

    public C35227a(String str, int i13, String str2, String str3, long j7, long j13, String str4) {
        this.f149823a = str;
        this.f149824b = i13;
        this.f149825c = str2;
        this.f149826d = str3;
        this.f149827e = j7;
        this.f149828f = j13;
        this.f149829g = str4;
    }

    /* JADX INFO: renamed from: a */
    public final C29039b m111610a() {
        C29039b c29039b = new C29039b();
        c29039b.f117523b = this.f149823a;
        c29039b.f117524c = this.f149824b;
        c29039b.f117525d = this.f149825c;
        c29039b.f117526e = this.f149826d;
        c29039b.f117527f = Long.valueOf(this.f149827e);
        c29039b.f117528g = Long.valueOf(this.f149828f);
        c29039b.f117529h = this.f149829g;
        return c29039b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C35227a)) {
            return false;
        }
        C35227a c35227a = (C35227a) obj;
        String str = c35227a.f149829g;
        String str2 = c35227a.f149826d;
        String str3 = c35227a.f149825c;
        String str4 = c35227a.f149823a;
        String str5 = this.f149823a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!AbstractC12682p.m35483c(this.f149824b, c35227a.f149824b)) {
            return false;
        }
        String str6 = this.f149825c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f149826d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f149827e != c35227a.f149827e || this.f149828f != c35227a.f149828f) {
            return false;
        }
        String str8 = this.f149829g;
        if (str8 == null) {
            return str == null;
        }
        return str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f149823a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC12682p.m35485e(this.f149824b)) * 1000003;
        String str2 = this.f149825c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f149826d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j7 = this.f149827e;
        int i13 = (iHashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j13 = this.f149828f;
        int i14 = (i13 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        String str4 = this.f149829g;
        return (str4 != null ? str4.hashCode() : 0) ^ i14;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb4.append(this.f149823a);
        sb4.append(", registrationStatus=");
        sb4.append(AbstractC33745d.m106641C(this.f149824b));
        sb4.append(", authToken=");
        sb4.append(this.f149825c);
        sb4.append(", refreshToken=");
        sb4.append(this.f149826d);
        sb4.append(", expiresInSecs=");
        sb4.append(this.f149827e);
        sb4.append(", tokenCreationEpochInSecs=");
        sb4.append(this.f149828f);
        sb4.append(", fisError=");
        return AbstractC25012a.m73376i(this.f149829g, "}", sb4);
    }
}
