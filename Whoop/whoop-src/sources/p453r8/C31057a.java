package p453r8;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* JADX INFO: renamed from: r8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C31057a {

    /* JADX INFO: renamed from: a */
    public final C31058b f128066a;

    public C31057a(String str, int i13, int i14) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        C31058b c31058b = new C31058b();
        c31058b.f128067a = str;
        c31058b.f128068b = i13;
        c31058b.f128069c = i14;
        new MediaSessionManager.RemoteUserInfo(str, i13, i14);
        this.f128066a = c31058b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31057a)) {
            return false;
        }
        return this.f128066a.equals(((C31057a) obj).f128066a);
    }

    public final int hashCode() {
        return this.f128066a.hashCode();
    }
}
