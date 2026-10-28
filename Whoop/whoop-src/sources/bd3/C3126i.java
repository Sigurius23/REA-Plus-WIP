package bd3;

/* JADX INFO: renamed from: bd3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C3126i {

    /* JADX INFO: renamed from: a */
    public static final char[] f12265a = new char[117];

    /* JADX INFO: renamed from: b */
    public static final byte[] f12266b = new byte[126];

    static {
        for (int i13 = 0; i13 < 32; i13++) {
        }
        m8986a(8, 'b');
        m8986a(9, 't');
        m8986a(10, 'n');
        m8986a(12, 'f');
        m8986a(13, 'r');
        m8986a(47, '/');
        m8986a(34, '\"');
        m8986a(92, '\\');
        byte[] bArr = f12266b;
        for (int i14 = 0; i14 < 33; i14++) {
            bArr[i14] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* JADX INFO: renamed from: a */
    public static void m8986a(int i13, char c3) {
        if (c3 != 'u') {
            f12265a[c3] = (char) i13;
        }
    }
}
