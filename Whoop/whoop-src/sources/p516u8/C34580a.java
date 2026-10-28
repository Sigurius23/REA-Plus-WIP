package p516u8;

import android.net.Uri;
import java.util.Arrays;
import p607x8.AbstractC38065t;
import te0.AbstractC33745d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: u8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C34580a {

    /* JADX INFO: renamed from: a */
    public final int f145601a;

    /* JADX INFO: renamed from: b */
    public final int f145602b;

    /* JADX INFO: renamed from: c */
    public final Uri[] f145603c;

    /* JADX INFO: renamed from: d */
    public final C34626x[] f145604d;

    /* JADX INFO: renamed from: e */
    public final int[] f145605e;

    /* JADX INFO: renamed from: f */
    public final long[] f145606f;

    /* JADX INFO: renamed from: g */
    public final String[] f145607g;

    static {
        AbstractC33745d.m106663v(0, 1, 2, 3, 4);
        AbstractC33745d.m106663v(5, 6, 7, 8, 9);
        AbstractC38065t.m121892F(10);
    }

    public C34580a(int i13, int i14, int[] iArr, C34626x[] c34626xArr, long[] jArr, String[] strArr) {
        Uri uri;
        int i15 = 0;
        AbstractC35849g.m113802d(iArr.length == c34626xArr.length);
        this.f145601a = i13;
        this.f145602b = i14;
        this.f145605e = iArr;
        this.f145604d = c34626xArr;
        this.f145606f = jArr;
        this.f145603c = new Uri[c34626xArr.length];
        while (true) {
            Uri[] uriArr = this.f145603c;
            if (i15 >= uriArr.length) {
                this.f145607g = strArr;
                return;
            }
            C34626x c34626x = c34626xArr[i15];
            if (c34626x == null) {
                uri = null;
            } else {
                C34620u c34620u = c34626x.f145867b;
                c34620u.getClass();
                uri = c34620u.f145852a;
            }
            uriArr[i15] = uri;
            i15++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m109361a(int i13) {
        int i14;
        int i15 = i13 + 1;
        while (true) {
            int[] iArr = this.f145605e;
            if (i15 >= iArr.length || (i14 = iArr[i15]) == 0 || i14 == 1) {
                break;
            }
            i15++;
        }
        return i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34580a.class != obj.getClass()) {
            return false;
        }
        C34580a c34580a = (C34580a) obj;
        return this.f145601a == c34580a.f145601a && this.f145602b == c34580a.f145602b && Arrays.equals(this.f145604d, c34580a.f145604d) && Arrays.equals(this.f145605e, c34580a.f145605e) && Arrays.equals(this.f145606f, c34580a.f145606f) && Arrays.equals(this.f145607g, c34580a.f145607g);
    }

    public final int hashCode() {
        int i13 = ((this.f145601a * 31) + this.f145602b) * 31;
        int i14 = (int) 0;
        return (((((Arrays.hashCode(this.f145606f) + ((Arrays.hashCode(this.f145605e) + ((Arrays.hashCode(this.f145604d) + ((i13 + i14) * 31)) * 31)) * 31)) * 31) + i14) * 961) + Arrays.hashCode(this.f145607g)) * 31;
    }
}
