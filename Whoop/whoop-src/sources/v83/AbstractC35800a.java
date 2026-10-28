package v83;

/* JADX INFO: renamed from: v83.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC35800a {

    /* JADX INFO: renamed from: a */
    public static final Integer f152284a;

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
        f152284a = num2;
    }
}
