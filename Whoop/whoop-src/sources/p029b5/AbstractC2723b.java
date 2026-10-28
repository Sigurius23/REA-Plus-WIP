package p029b5;

import android.os.Build;
import java.util.Locale;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: b5.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2723b {
    static {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            AbstractC2722a.m7675b(30);
        }
        if (i13 >= 30) {
            AbstractC2722a.m7675b(31);
        }
        if (i13 >= 30) {
            AbstractC2722a.m7675b(33);
        }
        if (i13 >= 30) {
            AbstractC2722a.m7675b(DurationKt.NANOS_IN_MILLIS);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m7688a() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 35) {
            return true;
        }
        if (i13 < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC22676k.m65749i(CODENAME, "CODENAME");
        if ("REL".equals(CODENAME)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = CODENAME.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = "VanillaIceCream".toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }
}
