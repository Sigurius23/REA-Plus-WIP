package p670z3;

import java.util.Arrays;
import p652yl.C39617c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C40037c implements InterfaceC40035a {

    /* JADX INFO: renamed from: a */
    public final float[] f172749a;

    /* JADX INFO: renamed from: b */
    public final float[] f172750b;

    public C40037c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f172749a = fArr;
        this.f172750b = fArr2;
    }

    @Override // p670z3.InterfaceC40035a
    /* JADX INFO: renamed from: a */
    public final float mo124801a(float f13) {
        return C39617c.m126593a(f13, this.f172750b, this.f172749a);
    }

    @Override // p670z3.InterfaceC40035a
    /* JADX INFO: renamed from: b */
    public final float mo124802b(float f13) {
        return C39617c.m126593a(f13, this.f172749a, this.f172750b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C40037c)) {
            return false;
        }
        C40037c c40037c = (C40037c) obj;
        return Arrays.equals(this.f172749a, c40037c.f172749a) && Arrays.equals(this.f172750b, c40037c.f172750b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f172750b) + (Arrays.hashCode(this.f172749a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f172749a);
        AbstractC22676k.m65749i(string, "toString(...)");
        sb4.append(string);
        sb4.append(", toDpValues=");
        String string2 = Arrays.toString(this.f172750b);
        AbstractC22676k.m65749i(string2, "toString(...)");
        sb4.append(string2);
        sb4.append('}');
        return sb4.toString();
    }
}
