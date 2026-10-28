package gu;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import no.nordicsemi.android.dfu.DfuBaseService;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: gu.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16207a {

    /* JADX INFO: renamed from: g */
    public static final C16207a f61548g;

    /* JADX INFO: renamed from: a */
    public final int[] f61549a;

    /* JADX INFO: renamed from: b */
    public final int[] f61550b;

    /* JADX INFO: renamed from: c */
    public final C16208b f61551c;

    /* JADX INFO: renamed from: d */
    public final int f61552d;

    /* JADX INFO: renamed from: e */
    public final int f61553e;

    /* JADX INFO: renamed from: f */
    public final int f61554f;

    static {
        new C16207a(4201, 4096, 1);
        new C16207a(1033, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 1);
        new C16207a(67, 64, 1);
        new C16207a(19, 16, 1);
        f61548g = new C16207a(285, 256, 0);
        new C16207a(301, 256, 1);
    }

    public C16207a(int i13, int i14, int i15) {
        this.f61553e = i13;
        this.f61552d = i14;
        this.f61554f = i15;
        this.f61549a = new int[i14];
        this.f61550b = new int[i14];
        int i16 = 1;
        for (int i17 = 0; i17 < i14; i17++) {
            this.f61549a[i17] = i16;
            i16 <<= 1;
            if (i16 >= i14) {
                i16 = (i16 ^ i13) & (i14 - 1);
            }
        }
        for (int i18 = 0; i18 < i14 - 1; i18++) {
            this.f61550b[this.f61549a[i18]] = i18;
        }
        this.f61551c = new C16208b(this, new int[]{0});
    }

    /* JADX INFO: renamed from: a */
    public final int m45879a(int i13, int i14) {
        if (i13 == 0 || i14 == 0) {
            return 0;
        }
        int[] iArr = this.f61550b;
        return this.f61549a[(iArr[i13] + iArr[i14]) % (this.f61552d - 1)];
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GF(0x");
        sb4.append(Integer.toHexString(this.f61553e));
        sb4.append(DateTimeRange.lowerUpperDelimiter);
        return AbstractC11895b.m31999r(sb4, this.f61552d, ')');
    }
}
