package tk;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import p031b9.C2817b;

/* JADX INFO: renamed from: tk.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C33872c {

    /* JADX INFO: renamed from: a */
    public final String f141870a;

    /* JADX INFO: renamed from: b */
    public final long[] f141871b;

    /* JADX INFO: renamed from: c */
    public final File[] f141872c;

    /* JADX INFO: renamed from: d */
    public final File[] f141873d;

    /* JADX INFO: renamed from: e */
    public boolean f141874e;

    /* JADX INFO: renamed from: f */
    public C2817b f141875f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C33873d f141876g;

    public C33872c(C33873d c33873d, String str) {
        this.f141876g = c33873d;
        this.f141870a = str;
        int i13 = c33873d.f141879G;
        File file = c33873d.f141887w;
        this.f141871b = new long[i13];
        this.f141872c = new File[i13];
        this.f141873d = new File[i13];
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append('.');
        int length = sb4.length();
        for (int i14 = 0; i14 < i13; i14++) {
            sb4.append(i14);
            this.f141872c[i14] = new File(file, sb4.toString());
            sb4.append(".tmp");
            this.f141873d[i14] = new File(file, sb4.toString());
            sb4.setLength(length);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m107105h(C33872c c33872c, String[] strArr) throws IOException {
        if (strArr.length != c33872c.f141876g.f141879G) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
        for (int i13 = 0; i13 < strArr.length; i13++) {
            try {
                c33872c.f141871b[i13] = Long.parseLong(strArr[i13]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final File m107106i(int i13) {
        return this.f141872c[i13];
    }

    /* JADX INFO: renamed from: j */
    public final File m107107j(int i13) {
        return this.f141873d[i13];
    }

    /* JADX INFO: renamed from: k */
    public final String m107108k() {
        StringBuilder sb4 = new StringBuilder();
        for (long j7 : this.f141871b) {
            sb4.append(' ');
            sb4.append(j7);
        }
        return sb4.toString();
    }
}
