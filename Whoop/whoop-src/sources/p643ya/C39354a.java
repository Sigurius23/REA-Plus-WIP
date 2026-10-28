package p643ya;

import android.graphics.Rect;
import java.util.Arrays;
import p309lo.C24561s;

/* JADX INFO: renamed from: ya.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C39354a {

    /* JADX INFO: renamed from: b */
    public boolean f169397b;

    /* JADX INFO: renamed from: c */
    public boolean f169398c;

    /* JADX INFO: renamed from: d */
    public int[] f169399d;

    /* JADX INFO: renamed from: e */
    public int f169400e;

    /* JADX INFO: renamed from: f */
    public int f169401f;

    /* JADX INFO: renamed from: g */
    public Rect f169402g;

    /* JADX INFO: renamed from: a */
    public final int[] f169396a = new int[4];

    /* JADX INFO: renamed from: h */
    public int f169403h = -1;

    /* JADX INFO: renamed from: i */
    public int f169404i = -1;

    /* JADX INFO: renamed from: a */
    public static int m125488a(int[] iArr, int i13) {
        return (i13 < 0 || i13 >= iArr.length) ? iArr[0] : iArr[i13];
    }

    /* JADX INFO: renamed from: c */
    public static int m125489c(int i13, int i14) {
        return (i13 & 16777215) | ((i14 * 17) << 24);
    }

    /* JADX INFO: renamed from: b */
    public final void m125490b(C24561s c24561s, boolean z4, Rect rect, int[] iArr) {
        int i13;
        int i14;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i15 = !z4 ? 1 : 0;
        int i16 = i15 * iWidth;
        while (true) {
            int i17 = 0;
            do {
                int i18 = 1;
                int iM71632i = 0;
                while (true) {
                    if (iM71632i >= i18 || i18 > 64) {
                        i13 = iM71632i & 3;
                        if (iM71632i >= 4) {
                            i14 = iM71632i >> 2;
                            break;
                        } else {
                            i14 = iWidth;
                            break;
                        }
                    }
                    if (c24561s.m71625b() < 4) {
                        i13 = -1;
                        i14 = 0;
                        break;
                    } else {
                        iM71632i = (iM71632i << 4) | c24561s.m71632i(4);
                        i18 <<= 2;
                    }
                }
                int iMin = Math.min(i14, iWidth - i17);
                if (iMin > 0) {
                    int i19 = i16 + iMin;
                    Arrays.fill(iArr, i16, i19, this.f169396a[i13]);
                    i17 += iMin;
                    i16 = i19;
                }
            } while (i17 < iWidth);
            i15 += 2;
            if (i15 >= iHeight) {
                return;
            }
            i16 = i15 * iWidth;
            c24561s.m71626c();
        }
    }
}
