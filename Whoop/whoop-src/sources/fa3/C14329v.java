package fa3;

import java.util.Map;
import m83.C25272z;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: fa3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C14329v {

    /* JADX INFO: renamed from: a */
    public final EnumC14304b0 f52300a;

    /* JADX INFO: renamed from: b */
    public final EnumC14304b0 f52301b;

    /* JADX INFO: renamed from: c */
    public final Map f52302c = C25272z.f99163w;

    /* JADX INFO: renamed from: d */
    public final boolean f52303d;

    public C14329v(EnumC14304b0 enumC14304b0, EnumC14304b0 enumC14304b1) {
        this.f52300a = enumC14304b0;
        this.f52301b = enumC14304b1;
        AbstractC30060g.m92088H(new C14328u(this, 0));
        EnumC14304b0 enumC14304b2 = EnumC14304b0.IGNORE;
        this.f52303d = enumC14304b0 == enumC14304b2 && enumC14304b1 == enumC14304b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14329v)) {
            return false;
        }
        C14329v c14329v = (C14329v) obj;
        return this.f52300a == c14329v.f52300a && this.f52301b == c14329v.f52301b && AbstractC22676k.m65745e(this.f52302c, c14329v.f52302c);
    }

    public final int hashCode() {
        int iHashCode = this.f52300a.hashCode() * 31;
        EnumC14304b0 enumC14304b0 = this.f52301b;
        return this.f52302c.hashCode() + ((iHashCode + (enumC14304b0 == null ? 0 : enumC14304b0.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Jsr305Settings(globalLevel=");
        sb4.append(this.f52300a);
        sb4.append(", migrationLevel=");
        sb4.append(this.f52301b);
        sb4.append(", userDefinedLevelForSpecificAnnotation=");
        return AbstractC30802r.m94764m(sb4, this.f52302c, ')');
    }
}
