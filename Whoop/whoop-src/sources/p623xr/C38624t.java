package p623xr;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import ih0.AbstractC18489d0;
import java.util.IllegalFormatException;
import java.util.Locale;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: xr.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C38624t {

    /* JADX INFO: renamed from: a */
    public final String f166133a;

    public C38624t(String str) {
        this.f166133a = AbstractC25012a.m73372e(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m123816c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e5) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e5);
                str2 = AbstractC11895b.m31997p(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return AbstractC18489d0.m53370k(str, " : ", str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m123817a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m123816c(this.f166133a, str, objArr), remoteException);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m123818b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m123816c(this.f166133a, str, objArr));
        }
    }
}
