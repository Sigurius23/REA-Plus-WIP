package p479s4;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import p006a4.AbstractC0354a;

/* JADX INFO: renamed from: s4.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C32127h {

    /* JADX INFO: renamed from: a */
    public final String f133151a;

    /* JADX INFO: renamed from: b */
    public final LocusId f133152b;

    public C32127h(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f133151a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f133152b = AbstractC0354a.m964d(str);
        } else {
            this.f133152b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final LocusId m100046a() {
        return this.f133152b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C32127h.class != obj.getClass()) {
            return false;
        }
        String str = ((C32127h) obj).f133151a;
        String str2 = this.f133151a;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f133151a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LocusIdCompat[");
        sb4.append(this.f133151a.length() + "_chars");
        sb4.append("]");
        return sb4.toString();
    }
}
