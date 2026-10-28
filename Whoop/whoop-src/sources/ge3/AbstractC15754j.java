package ge3;

import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: ge3.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15754j {
    /* JADX INFO: renamed from: a */
    public static boolean m44474a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version == null) {
            return false;
        }
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }
}
