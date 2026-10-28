package androidx.datastore.preferences.protobuf;

import hg3.AbstractC17269i;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1244p1 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC17269i f5450a;

    static {
        f5450a = (AbstractC1235m1.f5435e && AbstractC1235m1.f5434d && !AbstractC1203c.m3787a()) ? new C1238n1(1) : new C1238n1(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m3968a(String str) {
        int length = str.length();
        int i13 = 0;
        int i14 = 0;
        while (i14 < length && str.charAt(i14) < 128) {
            i14++;
        }
        int i15 = length;
        while (i14 < length) {
            char cCharAt = str.charAt(i14);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i14 < length2) {
                    char cCharAt2 = str.charAt(i14);
                    if (cCharAt2 < 2048) {
                        i13 += (127 - cCharAt2) >>> 31;
                    } else {
                        i13 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i14) < 65536) {
                                throw new C1241o1(i14, length2);
                            }
                            i14++;
                        }
                    }
                    i14++;
                }
                i15 += i13;
                break;
            }
            i15 += (127 - cCharAt) >>> 31;
            i14++;
        }
        if (i15 >= length) {
            return i15;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i15) + 4294967296L));
    }
}
