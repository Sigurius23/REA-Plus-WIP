package p555vl;

import java.util.Objects;
import org.joda.time.DateTimeConstants;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: vl.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C36097d {

    /* JADX INFO: renamed from: c */
    public static final C36097d f154318c = new C36097d(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f154319a;

    /* JADX INFO: renamed from: b */
    public final int f154320b;

    public C36097d(int i13, int i14) {
        this.f154319a = i13;
        this.f154320b = i14;
    }

    /* JADX INFO: renamed from: a */
    public final int m114699a() {
        return (this.f154320b * 60) + (this.f154319a * DateTimeConstants.SECONDS_PER_HOUR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C36097d.class == obj.getClass()) {
            C36097d c36097d = (C36097d) obj;
            if (this.f154319a == c36097d.f154319a && this.f154320b == c36097d.f154320b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f154319a), Integer.valueOf(this.f154320b));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TimezoneOffset{hours=");
        sb4.append(this.f154319a);
        sb4.append(", minutes=");
        return AbstractC11895b.m31999r(sb4, this.f154320b, '}');
    }
}
