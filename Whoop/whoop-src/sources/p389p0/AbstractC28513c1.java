package p389p0;

import android.os.Build;
import java.util.Locale;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p0.c1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC28513c1 {

    /* JADX INFO: renamed from: a */
    public static final C28510b1 f115409a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        f115409a = lowerCase.equals("robolectric") ? new C28510b1() : null;
    }
}
