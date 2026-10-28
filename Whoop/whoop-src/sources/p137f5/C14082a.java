package p137f5;

/* JADX INFO: renamed from: f5.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14082a {

    /* JADX INFO: renamed from: e */
    public static final byte[] f50602e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f50603a;

    /* JADX INFO: renamed from: b */
    public final int f50604b;

    /* JADX INFO: renamed from: c */
    public int f50605c;

    /* JADX INFO: renamed from: d */
    public char f50606d;

    static {
        for (int i13 = 0; i13 < 1792; i13++) {
            f50602e[i13] = Character.getDirectionality(i13);
        }
    }

    public C14082a(CharSequence charSequence) {
        this.f50603a = charSequence;
        this.f50604b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m40113a() {
        int i13 = this.f50605c - 1;
        CharSequence charSequence = this.f50603a;
        char cCharAt = charSequence.charAt(i13);
        this.f50606d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f50605c);
            this.f50605c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f50605c--;
        char c3 = this.f50606d;
        return c3 < 1792 ? f50602e[c3] : Character.getDirectionality(c3);
    }
}
