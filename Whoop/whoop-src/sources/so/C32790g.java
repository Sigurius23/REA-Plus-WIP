package so;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: so.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C32790g extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z4) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z4);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return C32791h.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return C32791h.class;
    }
}
