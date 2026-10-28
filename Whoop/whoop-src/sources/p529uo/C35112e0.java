package p529uo;

import java.util.Arrays;

/* JADX INFO: renamed from: uo.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C35112e0 {

    /* JADX INFO: renamed from: a */
    public final String f148995a;

    /* JADX INFO: renamed from: b */
    public final String f148996b;

    /* JADX INFO: renamed from: c */
    public final boolean f148997c;

    public C35112e0(String str, boolean z4) {
        AbstractC35135w.m111092d(str);
        this.f148995a = str;
        AbstractC35135w.m111092d("com.google.android.gms");
        this.f148996b = "com.google.android.gms";
        this.f148997c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35112e0)) {
            return false;
        }
        C35112e0 c35112e0 = (C35112e0) obj;
        return AbstractC35135w.m111097i(this.f148995a, c35112e0.f148995a) && AbstractC35135w.m111097i(this.f148996b, c35112e0.f148996b) && AbstractC35135w.m111097i(null, null) && this.f148997c == c35112e0.f148997c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f148995a, this.f148996b, null, 4225, Boolean.valueOf(this.f148997c)});
    }

    public final String toString() {
        String str = this.f148995a;
        if (str != null) {
            return str;
        }
        AbstractC35135w.m111094f(null);
        throw null;
    }
}
