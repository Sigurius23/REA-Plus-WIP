package p580wd;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C37160m {

    /* JADX INFO: renamed from: a */
    public final String f158917a;

    /* JADX INFO: renamed from: b */
    public final EnumC37161n f158918b;

    /* JADX INFO: renamed from: c */
    public final String f158919c;

    /* JADX INFO: renamed from: d */
    public final String f158920d;

    public C37160m(String str, EnumC37161n enumC37161n, String str2, String str3) {
        this.f158917a = str;
        this.f158918b = enumC37161n;
        this.f158919c = str2;
        this.f158920d = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m119082a() {
        return this.f158920d;
    }

    /* JADX INFO: renamed from: b */
    public final String m119083b() {
        return this.f158917a;
    }

    /* JADX INFO: renamed from: c */
    public final String m119084c() {
        return this.f158919c;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC37161n m119085d() {
        return this.f158918b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37160m)) {
            return false;
        }
        C37160m c37160m = (C37160m) obj;
        return AbstractC22676k.m65745e(this.f158917a, c37160m.f158917a) && this.f158918b == c37160m.f158918b && AbstractC22676k.m65745e(this.f158919c, c37160m.f158919c) && AbstractC22676k.m65745e(this.f158920d, c37160m.f158920d);
    }

    public final int hashCode() {
        int iHashCode = this.f158917a.hashCode() * 31;
        EnumC37161n enumC37161n = this.f158918b;
        int iHashCode2 = (iHashCode + (enumC37161n == null ? 0 : enumC37161n.hashCode())) * 31;
        String str = this.f158919c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f158920d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RoleArn(roleArn=");
        sb4.append(this.f158917a);
        sb4.append(", source=");
        sb4.append(this.f158918b);
        sb4.append(", sessionName=");
        sb4.append(this.f158919c);
        sb4.append(", externalId=");
        return AbstractC25012a.m73377j(sb4, this.f158920d, ')');
    }
}
