package p031b9;

import android.text.TextUtils;
import p000.AbstractC11266d;
import p516u8.C34610p;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C2835h {

    /* JADX INFO: renamed from: a */
    public final String f11183a;

    /* JADX INFO: renamed from: b */
    public final C34610p f11184b;

    /* JADX INFO: renamed from: c */
    public final C34610p f11185c;

    /* JADX INFO: renamed from: d */
    public final int f11186d;

    /* JADX INFO: renamed from: e */
    public final int f11187e;

    public C2835h(String str, C34610p c34610p, C34610p c34610p2, int i13, int i14) {
        AbstractC35849g.m113802d(i13 == 0 || i14 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f11183a = str;
        c34610p.getClass();
        this.f11184b = c34610p;
        c34610p2.getClass();
        this.f11185c = c34610p2;
        this.f11186d = i13;
        this.f11187e = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2835h.class == obj.getClass()) {
            C2835h c2835h = (C2835h) obj;
            if (this.f11186d == c2835h.f11186d && this.f11187e == c2835h.f11187e && this.f11183a.equals(c2835h.f11183a) && this.f11184b.equals(c2835h.f11184b) && this.f11185c.equals(c2835h.f11185c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11185c.hashCode() + ((this.f11184b.hashCode() + AbstractC11266d.m30450d((((527 + this.f11186d) * 31) + this.f11187e) * 31, 31, this.f11183a)) * 31);
    }
}
