package p291l0;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22985o1 {

    /* JADX INFO: renamed from: a */
    public float f90674a = 0.0f;

    /* JADX INFO: renamed from: b */
    public boolean f90675b = true;

    /* JADX INFO: renamed from: c */
    public AbstractC22953f f90676c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22985o1)) {
            return false;
        }
        C22985o1 c22985o1 = (C22985o1) obj;
        return Float.compare(this.f90674a, c22985o1.f90674a) == 0 && this.f90675b == c22985o1.f90675b && AbstractC22676k.m65745e(this.f90676c, c22985o1.f90676c);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Float.hashCode(this.f90674a) * 31, 31, this.f90675b);
        AbstractC22953f abstractC22953f = this.f90676c;
        return (iM8289b + (abstractC22953f == null ? 0 : abstractC22953f.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f90674a + ", fill=" + this.f90675b + ", crossAxisAlignment=" + this.f90676c + ", flowLayoutData=null)";
    }
}
