package p203hy;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: hy.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C17716e {

    /* JADX INFO: renamed from: a */
    public final boolean f68872a;

    /* JADX INFO: renamed from: b */
    public final boolean f68873b;

    /* JADX INFO: renamed from: c */
    public final boolean f68874c;

    public C17716e(boolean z4, boolean z13, boolean z14) {
        this.f68872a = z4;
        this.f68873b = z13;
        this.f68874c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17716e)) {
            return false;
        }
        C17716e c17716e = (C17716e) obj;
        return this.f68872a == c17716e.f68872a && this.f68873b == c17716e.f68873b && this.f68874c == c17716e.f68874c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68874c) + AbstractC2875y.m8289b(Boolean.hashCode(this.f68872a) * 31, 31, this.f68873b);
    }

    public final String toString() {
        return AbstractC18489d0.m53372m(AbstractC11895b.m32002u("ProvidedDefaultValues(email=", ", name=", ", phone=", this.f68872a, this.f68873b), this.f68874c, ")");
    }
}
