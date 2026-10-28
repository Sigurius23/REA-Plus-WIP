package io.sentry.android.core.anr;

/* JADX INFO: renamed from: io.sentry.android.core.anr.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20054b {

    /* JADX INFO: renamed from: a */
    public final StackTraceElement[] f75346a;

    /* JADX INFO: renamed from: b */
    public final int f75347b;

    /* JADX INFO: renamed from: c */
    public final int f75348c;

    /* JADX INFO: renamed from: d */
    public final int f75349d;

    public C20054b(StackTraceElement[] stackTraceElementArr, int i13, int i14) {
        this.f75346a = stackTraceElementArr;
        this.f75347b = i13;
        this.f75348c = i14;
        int iHashCode = 1;
        while (i13 <= this.f75348c) {
            iHashCode = (iHashCode * 31) + this.f75346a[i13].hashCode();
            i13++;
        }
        this.f75349d = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20054b)) {
            return false;
        }
        C20054b c20054b = (C20054b) obj;
        int i13 = c20054b.f75347b;
        if (this.f75349d != c20054b.f75349d) {
            return false;
        }
        int i14 = this.f75348c;
        int i15 = this.f75347b;
        int i16 = (i14 - i15) + 1;
        if (i16 != (c20054b.f75348c - i13) + 1) {
            return false;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            if (!this.f75346a[i15 + i17].equals(c20054b.f75346a[i13 + i17])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f75349d;
    }
}
