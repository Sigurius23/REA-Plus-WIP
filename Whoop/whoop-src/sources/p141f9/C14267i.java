package p141f9;

import java.util.Objects;

/* JADX INFO: renamed from: f9.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C14267i {

    /* JADX INFO: renamed from: a */
    public final String f52098a;

    /* JADX INFO: renamed from: b */
    public final String f52099b;

    /* JADX INFO: renamed from: c */
    public final String f52100c;

    /* JADX INFO: renamed from: d */
    public final String f52101d;

    /* JADX INFO: renamed from: e */
    public final String f52102e;

    public C14267i(String str, String str2, String str3, String str4, String str5) {
        this.f52098a = str;
        this.f52099b = str2;
        this.f52100c = str3;
        this.f52101d = str4;
        this.f52102e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14267i)) {
            return false;
        }
        C14267i c14267i = (C14267i) obj;
        return Objects.equals(this.f52098a, c14267i.f52098a) && Objects.equals(this.f52099b, c14267i.f52099b) && Objects.equals(this.f52100c, c14267i.f52100c) && Objects.equals(this.f52101d, c14267i.f52101d) && Objects.equals(this.f52102e, c14267i.f52102e);
    }

    public final int hashCode() {
        String str = this.f52098a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f52099b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f52100c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f52101d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f52102e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
