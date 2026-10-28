package w83;

/* JADX INFO: renamed from: w83.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC36949a {

    /* JADX INFO: renamed from: a */
    public static final Integer f158107a;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f158107a = num2;
    }
}
