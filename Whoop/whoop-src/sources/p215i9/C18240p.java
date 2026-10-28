package p215i9;

import android.text.TextUtils;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: i9.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C18240p {

    /* JADX INFO: renamed from: a */
    public final String f71025a;

    /* JADX INFO: renamed from: b */
    public final boolean f71026b;

    /* JADX INFO: renamed from: c */
    public final boolean f71027c;

    public C18240p(String str, boolean z4, boolean z13) {
        this.f71025a = str;
        this.f71026b = z4;
        this.f71027c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C18240p.class) {
            C18240p c18240p = (C18240p) obj;
            if (TextUtils.equals(this.f71025a, c18240p.f71025a) && this.f71026b == c18240p.f71026b && this.f71027c == c18240p.f71027c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC11266d.m30450d(31, 31, this.f71025a) + (this.f71026b ? 1231 : 1237)) * 31) + (this.f71027c ? 1231 : 1237);
    }
}
