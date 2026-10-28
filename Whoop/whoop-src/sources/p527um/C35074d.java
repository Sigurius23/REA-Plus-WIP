package p527um;

import android.text.TextUtils;
import p000.AbstractC11266d;
import p309lo.AbstractC24543a;
import p465rm.C31521c0;

/* JADX INFO: renamed from: um.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35074d {

    /* JADX INFO: renamed from: a */
    public final String f148802a;

    /* JADX INFO: renamed from: b */
    public final C31521c0 f148803b;

    /* JADX INFO: renamed from: c */
    public final C31521c0 f148804c;

    /* JADX INFO: renamed from: d */
    public final int f148805d;

    /* JADX INFO: renamed from: e */
    public final int f148806e;

    public C35074d(String str, C31521c0 c31521c0, C31521c0 c31521c1, int i13, int i14) {
        AbstractC24543a.m71569e(i13 == 0 || i14 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f148802a = str;
        c31521c0.getClass();
        this.f148803b = c31521c0;
        c31521c1.getClass();
        this.f148804c = c31521c1;
        this.f148805d = i13;
        this.f148806e = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C35074d.class == obj.getClass()) {
            C35074d c35074d = (C35074d) obj;
            if (this.f148805d == c35074d.f148805d && this.f148806e == c35074d.f148806e && this.f148802a.equals(c35074d.f148802a) && this.f148803b.equals(c35074d.f148803b) && this.f148804c.equals(c35074d.f148804c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f148804c.hashCode() + ((this.f148803b.hashCode() + AbstractC11266d.m30450d((((527 + this.f148805d) * 31) + this.f148806e) * 31, 31, this.f148802a)) * 31);
    }
}
