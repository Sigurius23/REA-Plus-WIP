package l40;

import nh3.AbstractC26725a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C23328a {

    /* JADX INFO: renamed from: a */
    public final String f92491a;

    /* JADX INFO: renamed from: b */
    public final boolean f92492b;

    public C23328a(String str, boolean z4) {
        this.f92491a = str;
        this.f92492b = z4;
    }

    /* JADX INFO: renamed from: a */
    public static C23328a m67553a(String str, C23328a c23328a) {
        boolean z4 = c23328a.f92492b;
        c23328a.getClass();
        return new C23328a(str, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23328a)) {
            return false;
        }
        C23328a c23328a = (C23328a) obj;
        return AbstractC22676k.m65745e(this.f92491a, c23328a.f92491a) && this.f92492b == c23328a.f92492b;
    }

    public final int hashCode() {
        String str = this.f92491a;
        return Boolean.hashCode(this.f92492b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return AbstractC26725a.m79503g("FormFieldEntry(value=", this.f92491a, ", isComplete=", ")", this.f92492b);
    }
}
