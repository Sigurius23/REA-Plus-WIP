package p555vl;

import java.util.Arrays;
import java.util.Optional;

/* JADX INFO: renamed from: vl.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C36096c {

    /* JADX INFO: renamed from: c */
    public static final char[] f154313c;

    /* JADX INFO: renamed from: d */
    public static final char[] f154314d;

    /* JADX INFO: renamed from: e */
    public static final C36096c f154315e;

    /* JADX INFO: renamed from: a */
    public final char[] f154316a;

    /* JADX INFO: renamed from: b */
    public final char[] f154317b;

    static {
        char[] cArr = {'T', 't', ' '};
        f154313c = cArr;
        char[] cArr2 = {'.'};
        f154314d = cArr2;
        f154315e = new C36096c(cArr, cArr2);
        new C36096c(new char[]{'T'}, cArr2);
    }

    public C36096c(char[] cArr, char[] cArr2) {
        this.f154316a = (char[]) Optional.ofNullable(cArr).orElse(f154313c);
        this.f154317b = (char[]) Optional.ofNullable(cArr2).orElse(f154314d);
    }

    public final String toString() {
        return "ParseConfig{dateTimeSeparators=" + Arrays.toString(this.f154316a) + ", fractionSeparators=" + Arrays.toString(this.f154317b) + '}';
    }
}
