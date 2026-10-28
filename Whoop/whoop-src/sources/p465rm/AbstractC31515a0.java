package p465rm;

import java.util.HashSet;

/* JADX INFO: renamed from: rm.a0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31515a0 {

    /* JADX INFO: renamed from: a */
    public static final HashSet f130019a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f130020b = "goog.exo.core";

    /* JADX INFO: renamed from: a */
    public static synchronized void m97109a(String str) {
        if (f130019a.add(str)) {
            String str2 = f130020b;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb4.append(str2);
            sb4.append(", ");
            sb4.append(str);
            f130020b = sb4.toString();
        }
    }
}
