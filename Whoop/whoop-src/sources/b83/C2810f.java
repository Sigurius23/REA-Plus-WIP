package b83;

import java.io.Serializable;

/* JADX INFO: renamed from: b83.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2810f implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Throwable f11001w;

    public C2810f(Throwable th3) {
        this.f11001w = th3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2810f)) {
            return false;
        }
        Object obj2 = ((C2810f) obj).f11001w;
        Throwable th3 = this.f11001w;
        if (th3 != obj2) {
            return th3 != null && th3.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return this.f11001w.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f11001w + "]";
    }
}
