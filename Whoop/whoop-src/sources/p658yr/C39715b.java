package p658yr;

/* JADX INFO: renamed from: yr.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39715b extends AbstractC39714a {

    /* JADX INFO: renamed from: w */
    public final char f170954w;

    public C39715b(char c3) {
        this.f170954w = c3;
    }

    @Override // p658yr.AbstractC39714a
    /* JADX INFO: renamed from: a */
    public final boolean mo127095a(char c3) {
        return c3 == this.f170954w;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c3 = this.f170954w;
        for (int i13 = 0; i13 < 4; i13++) {
            cArr[5 - i13] = "0123456789ABCDEF".charAt(c3 & 15);
            c3 = (char) (c3 >> 4);
        }
        sb4.append(String.copyValueOf(cArr));
        sb4.append("')");
        return sb4.toString();
    }
}
