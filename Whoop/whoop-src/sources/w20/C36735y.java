package w20;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w20.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C36735y {

    /* JADX INFO: renamed from: a */
    public final String f157236a;

    /* JADX INFO: renamed from: b */
    public final boolean f157237b;

    /* JADX INFO: renamed from: c */
    public final C36736z f157238c;

    /* JADX INFO: renamed from: d */
    public final boolean f157239d;

    public C36735y(String lastFour, boolean z4, C36736z c36736z, boolean z13) {
        AbstractC22676k.m65750j(lastFour, "lastFour");
        this.f157236a = lastFour;
        this.f157237b = z4;
        this.f157238c = c36736z;
        this.f157239d = z13;
    }

    /* JADX INFO: renamed from: a */
    public static C36735y m117842a(C36735y c36735y, C36736z c36736z, boolean z4, int i13) {
        String lastFour = c36735y.f157236a;
        boolean z13 = c36735y.f157237b;
        if ((i13 & 4) != 0) {
            c36736z = c36735y.f157238c;
        }
        if ((i13 & 8) != 0) {
            z4 = c36735y.f157239d;
        }
        c36735y.getClass();
        AbstractC22676k.m65750j(lastFour, "lastFour");
        return new C36735y(lastFour, z13, c36736z, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36735y)) {
            return false;
        }
        C36735y c36735y = (C36735y) obj;
        return AbstractC22676k.m65745e(this.f157236a, c36735y.f157236a) && this.f157237b == c36735y.f157237b && AbstractC22676k.m65745e(this.f157238c, c36735y.f157238c) && this.f157239d == c36735y.f157239d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157239d) + ((this.f157238c.hashCode() + AbstractC2875y.m8289b(this.f157236a.hashCode() * 31, 31, this.f157237b)) * 31);
    }

    public final String toString() {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("CvcRecollectionViewState(lastFour=", this.f157236a, ", isTestMode=", ", cvcState=", this.f157237b);
        sbM73379l.append(this.f157238c);
        sbM73379l.append(", isEnabled=");
        sbM73379l.append(this.f157239d);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
