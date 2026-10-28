package p074cs;

import java.util.Arrays;

/* JADX INFO: renamed from: cs.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11096c {

    /* JADX INFO: renamed from: a */
    public static final byte[] f35196a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i13 = 0; i13 < 10; i13++) {
            bArr[i13 + 48] = (byte) i13;
        }
        for (int i14 = 0; i14 < 26; i14++) {
            byte b = (byte) (i14 + 10);
            bArr[i14 + 65] = b;
            bArr[i14 + 97] = b;
        }
        f35196a = bArr;
    }
}
