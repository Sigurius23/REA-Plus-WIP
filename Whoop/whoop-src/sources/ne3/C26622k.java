package ne3;

import m83.AbstractC25260n;
import oe3.AbstractC27882b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: ne3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C26622k {
    /* JADX INFO: renamed from: a */
    public static C26624l m79240a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i13 * 2;
            bArr[i13] = (byte) (AbstractC27882b.m84151a(str.charAt(i14 + 1)) + (AbstractC27882b.m84151a(str.charAt(i14)) << 4));
        }
        return new C26624l(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static C26624l m79241b(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        C26624l c26624l = new C26624l(bytes);
        c26624l.f105885y = str;
        return c26624l;
    }

    /* JADX INFO: renamed from: c */
    public static C26624l m79242c(int i13, byte[] bArr) {
        AbstractC22676k.m65750j(bArr, "<this>");
        if (i13 == -1234567890) {
            i13 = bArr.length;
        }
        AbstractC26604b.m79160e(bArr.length, 0, i13);
        return new C26624l(AbstractC25260n.m74070k0(bArr, 0, i13));
    }
}
