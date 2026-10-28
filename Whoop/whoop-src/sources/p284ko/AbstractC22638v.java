package p284ko;

import android.system.ErrnoException;
import android.system.OsConstants;

/* JADX INFO: renamed from: ko.v */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22638v {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m65585b(Throwable th3) {
        return (th3 instanceof ErrnoException) && ((ErrnoException) th3).errno == OsConstants.EACCES;
    }
}
