package p314m;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: renamed from: m.t */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC24861t {
    /* JADX INFO: renamed from: a */
    public static boolean m72885a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* JADX INFO: renamed from: b */
    public static String m72886b(Locale locale) {
        return locale.toLanguageTag();
    }
}
