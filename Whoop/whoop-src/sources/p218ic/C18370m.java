package p218ic;

import android.app.Notification;

/* JADX INFO: renamed from: ic.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C18370m {

    /* JADX INFO: renamed from: a */
    public final int f71509a;

    /* JADX INFO: renamed from: b */
    public final int f71510b;

    /* JADX INFO: renamed from: c */
    public final Notification f71511c;

    public C18370m(int i13, Notification notification) {
        this(i13, notification, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18370m.class != obj.getClass()) {
            return false;
        }
        C18370m c18370m = (C18370m) obj;
        if (this.f71509a == c18370m.f71509a && this.f71510b == c18370m.f71510b) {
            return this.f71511c.equals(c18370m.f71511c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f71511c.hashCode() + (((this.f71509a * 31) + this.f71510b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f71509a + ", mForegroundServiceType=" + this.f71510b + ", mNotification=" + this.f71511c + '}';
    }

    public C18370m(int i13, Notification notification, int i14) {
        this.f71509a = i13;
        this.f71511c = notification;
        this.f71510b = i14;
    }
}
