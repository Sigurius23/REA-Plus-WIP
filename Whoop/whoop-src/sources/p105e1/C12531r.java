package p105e1;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C12531r {

    /* JADX INFO: renamed from: a */
    public final String f42819a;

    /* JADX INFO: renamed from: b */
    public String f42820b;

    /* JADX INFO: renamed from: c */
    public boolean f42821c = false;

    /* JADX INFO: renamed from: d */
    public C12520g f42822d = null;

    public C12531r(String str, String str2) {
        this.f42819a = str;
        this.f42820b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12531r)) {
            return false;
        }
        C12531r c12531r = (C12531r) obj;
        return AbstractC22676k.m65745e(this.f42819a, c12531r.f42819a) && AbstractC22676k.m65745e(this.f42820b, c12531r.f42820b) && this.f42821c == c12531r.f42821c && AbstractC22676k.m65745e(this.f42822d, c12531r.f42822d);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.f42819a.hashCode() * 31, 31, this.f42820b), 31, this.f42821c);
        C12520g c12520g = this.f42822d;
        return iM8289b + (c12520g == null ? 0 : c12520g.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TextSubstitution(layoutCache=");
        sb4.append(this.f42822d);
        sb4.append(", isShowingSubstitution=");
        return AbstractC2875y.m8305r(sb4, this.f42821c, ')');
    }
}
