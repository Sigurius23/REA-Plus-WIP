package p216ia;

import java.util.Locale;
import java.util.Objects;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: ia.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C18289b {

    /* JADX INFO: renamed from: a */
    public final long f71154a;

    /* JADX INFO: renamed from: b */
    public final long f71155b;

    /* JADX INFO: renamed from: c */
    public final int f71156c;

    public C18289b(long j7, long j13, int i13) {
        AbstractC35849g.m113802d(j7 < j13);
        this.f71154a = j7;
        this.f71155b = j13;
        this.f71156c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18289b.class == obj.getClass()) {
            C18289b c18289b = (C18289b) obj;
            if (this.f71154a == c18289b.f71154a && this.f71155b == c18289b.f71155b && this.f71156c == c18289b.f71156c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f71154a), Long.valueOf(this.f71155b), Integer.valueOf(this.f71156c));
    }

    public final String toString() {
        int i13 = AbstractC38065t.f163031a;
        Locale locale = Locale.US;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(this.f71154a, "Segment: startTimeMs=", ", endTimeMs=");
        sbM125596b.append(this.f71155b);
        sbM125596b.append(", speedDivisor=");
        sbM125596b.append(this.f71156c);
        return sbM125596b.toString();
    }
}
