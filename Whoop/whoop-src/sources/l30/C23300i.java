package l30;

import android.os.Build;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: l30.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C23300i extends AbstractC23304m {

    /* JADX INFO: renamed from: b */
    public static final C23306o f92343b = new C23306o("SW02", "An emulator is being used to run the App.", EnumC23305n.f92350x);

    @Override // l30.AbstractC23304m
    /* JADX INFO: renamed from: a */
    public final boolean mo67390a() {
        String FINGERPRINT = Build.FINGERPRINT;
        AbstractC22676k.m65749i(FINGERPRINT, "FINGERPRINT");
        if (AbstractC39421y.m125930O(FINGERPRINT, "generic", false) || AbstractC39421y.m125930O(FINGERPRINT, "unknown", false)) {
            return true;
        }
        String MODEL = Build.MODEL;
        AbstractC22676k.m65749i(MODEL, "MODEL");
        if (AbstractC39414r.m125876U(MODEL, "Emulator", false) || AbstractC39414r.m125876U(MODEL, "Android SDK built for x86", false) || AbstractC39414r.m125876U(MODEL, "google_sdk", false)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC22676k.m65749i(MANUFACTURER, "MANUFACTURER");
        if (AbstractC39414r.m125876U(MANUFACTURER, "Genymotion", false)) {
            return true;
        }
        String BRAND = Build.BRAND;
        AbstractC22676k.m65749i(BRAND, "BRAND");
        if (AbstractC39421y.m125930O(BRAND, "generic", false)) {
            String DEVICE = Build.DEVICE;
            AbstractC22676k.m65749i(DEVICE, "DEVICE");
            if (AbstractC39421y.m125930O(DEVICE, "generic", false)) {
                return true;
            }
        }
        return "google_sdk".equals(Build.PRODUCT);
    }
}
