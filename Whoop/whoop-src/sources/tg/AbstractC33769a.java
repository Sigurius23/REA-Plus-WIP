package tg;

import p031b9.AbstractC2875y;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: tg.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33769a {

    /* JADX INFO: renamed from: a */
    public static final int[] f141346a;

    static {
        int[] iArr = new int[256];
        int i13 = 0;
        while (i13 < 256) {
            iArr[i13] = i13 == 61 ? 255 : AbstractC39414r.m125887f0("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i13, 0, false, 6);
            i13++;
        }
        f141346a = iArr;
    }

    /* JADX INFO: renamed from: a */
    public static final int m106775a(byte b) {
        int i13 = f141346a[b];
        if (i13 != -1) {
            return i13;
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(b, "decode base64: invalid input byte: "));
    }
}
