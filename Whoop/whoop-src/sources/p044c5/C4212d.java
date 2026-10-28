package p044c5;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: c5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4212d {

    /* JADX INFO: renamed from: a */
    public final String f17080a;

    /* JADX INFO: renamed from: b */
    public final String f17081b;

    /* JADX INFO: renamed from: c */
    public final String f17082c;

    /* JADX INFO: renamed from: d */
    public final List f17083d;

    /* JADX INFO: renamed from: e */
    public final String f17084e;

    public C4212d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f17080a = str;
        str2.getClass();
        this.f17081b = str2;
        this.f17082c = str3;
        list.getClass();
        this.f17083d = list;
        this.f17084e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("FontRequest {mProviderAuthority: " + this.f17080a + ", mProviderPackage: " + this.f17081b + ", mQuery: " + this.f17082c + ", mCertificates:");
        int i13 = 0;
        while (true) {
            List list = this.f17083d;
            if (i13 >= list.size()) {
                sb4.append("}mCertificatesArray: 0");
                return sb4.toString();
            }
            sb4.append(" [");
            List list2 = (List) list.get(i13);
            for (int i14 = 0; i14 < list2.size(); i14++) {
                sb4.append(" \"");
                sb4.append(Base64.encodeToString((byte[]) list2.get(i14), 0));
                sb4.append("\"");
            }
            sb4.append(" ]");
            i13++;
        }
    }
}
