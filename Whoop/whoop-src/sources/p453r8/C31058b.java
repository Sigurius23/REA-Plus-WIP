package p453r8;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: r8.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C31058b {

    /* JADX INFO: renamed from: a */
    public String f128067a;

    /* JADX INFO: renamed from: b */
    public int f128068b;

    /* JADX INFO: renamed from: c */
    public int f128069c;

    public final boolean equals(Object obj) {
        int i13 = this.f128069c;
        String str = this.f128067a;
        int i14 = this.f128068b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31058b)) {
            return false;
        }
        C31058b c31058b = (C31058b) obj;
        int i15 = c31058b.f128069c;
        String str2 = c31058b.f128067a;
        int i16 = c31058b.f128068b;
        if (i14 < 0 || i16 < 0) {
            return TextUtils.equals(str, str2) && i13 == i15;
        }
        return TextUtils.equals(str, str2) && i14 == i16 && i13 == i15;
    }

    public final int hashCode() {
        return Objects.hash(this.f128067a, Integer.valueOf(this.f128069c));
    }
}
