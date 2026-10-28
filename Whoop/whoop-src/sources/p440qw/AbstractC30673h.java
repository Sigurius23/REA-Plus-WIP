package p440qw;

/* JADX INFO: renamed from: qw.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30673h {

    /* JADX INFO: renamed from: a */
    public static final int f126217a;

    static {
        int i13;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]", 3);
            i13 = Integer.parseInt(strArrSplit[0]);
            if (i13 == 1 && strArrSplit.length > 1) {
                i13 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i13 = -1;
        }
        if (i13 == -1) {
            try {
                StringBuilder sb4 = new StringBuilder();
                for (int i14 = 0; i14 < property.length(); i14++) {
                    char cCharAt = property.charAt(i14);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb4.append(cCharAt);
                }
                i13 = Integer.parseInt(sb4.toString());
            } catch (NumberFormatException unused2) {
                i13 = -1;
            }
        }
        if (i13 == -1) {
            i13 = 6;
        }
        f126217a = i13;
    }
}
