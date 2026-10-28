package kg3;

import java.io.Serializable;

/* JADX INFO: renamed from: kg3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C22466e extends AbstractC22465d implements Serializable {

    /* JADX INFO: renamed from: w */
    public static final C22466e f88015w = new C22466e();

    public static boolean isLeapYear(long j7) {
        if ((3 & j7) == 0) {
            return j7 % 100 != 0 || j7 % 400 == 0;
        }
        return false;
    }

    private Object readResolve() {
        return f88015w;
    }
}
