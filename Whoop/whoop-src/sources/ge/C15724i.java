package ge;

import p715kotlin.jvm.internal.AbstractC22676k;
import vg.EnumC35964k;

/* JADX INFO: renamed from: ge.i */
/* JADX INFO: loaded from: classes.dex */
public final class C15724i {

    /* JADX INFO: renamed from: a */
    public final EnumC35964k f59233a;

    /* JADX INFO: renamed from: b */
    public final String f59234b;

    public C15724i(EnumC35964k enumC35964k, String str) {
        this.f59233a = enumC35964k;
        this.f59234b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15724i)) {
            return false;
        }
        C15724i c15724i = (C15724i) obj;
        return this.f59233a == c15724i.f59233a && AbstractC22676k.m65745e(this.f59234b, c15724i.f59234b);
    }

    public final int hashCode() {
        int iHashCode = this.f59233a.hashCode() * 31;
        String str = this.f59234b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int[] iArr = AbstractC15723h.f59232a;
        EnumC35964k enumC35964k = this.f59233a;
        return AbstractC15719d.m44301b("os", iArr[enumC35964k.ordinal()] == 1 ? "other" : enumC35964k.toString(), this.f59234b);
    }
}
