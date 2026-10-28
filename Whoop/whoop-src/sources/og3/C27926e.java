package og3;

import com.squareup.wire.AbstractC5583n;
import java.io.Serializable;
import jg3.C21676c;
import jg3.C21678e;
import jg3.C21689p;

/* JADX INFO: renamed from: og3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C27926e implements Comparable, Serializable {

    /* JADX INFO: renamed from: w */
    public final C21678e f112634w;

    /* JADX INFO: renamed from: x */
    public final C21689p f112635x;

    /* JADX INFO: renamed from: y */
    public final C21689p f112636y;

    public C27926e(C21678e c21678e, C21689p c21689p, C21689p c21689p2) {
        this.f112634w = c21678e;
        this.f112635x = c21689p;
        this.f112636y = c21689p2;
    }

    private Object writeReplace() {
        return new C27922a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C27926e c27926e = (C27926e) obj;
        C21689p c21689p = this.f112635x;
        C21678e c21678e = this.f112634w;
        C21676c c21676cM60992q0 = C21676c.m60992q0(c21678e.m64905o0(c21689p), c21678e.f83247G.f83254I);
        C21678e c21678e2 = c27926e.f112634w;
        C21676c c21676cM60992q1 = C21676c.m60992q0(c21678e2.m64905o0(c27926e.f112635x), c21678e2.f83247G.f83254I);
        int iM16791q = AbstractC5583n.m16791q(c21676cM60992q0.f83235F, c21676cM60992q1.f83235F);
        return iM16791q != 0 ? iM16791q : c21676cM60992q0.f83236G - c21676cM60992q1.f83236G;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27926e) {
            C27926e c27926e = (C27926e) obj;
            if (this.f112634w.equals(c27926e.f112634w) && this.f112635x.equals(c27926e.f112635x) && this.f112636y.equals(c27926e.f112636y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f112634w.hashCode() ^ this.f112635x.f83282x) ^ Integer.rotateLeft(this.f112636y.f83282x, 16);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Transition[");
        C21689p c21689p = this.f112636y;
        int i13 = c21689p.f83282x;
        C21689p c21689p2 = this.f112635x;
        sb4.append(i13 > c21689p2.f83282x ? "Gap" : "Overlap");
        sb4.append(" at ");
        sb4.append(this.f112634w);
        sb4.append(c21689p2);
        sb4.append(" to ");
        sb4.append(c21689p);
        sb4.append(']');
        return sb4.toString();
    }

    public C27926e(long j7, C21689p c21689p, C21689p c21689p2) {
        this.f112634w = C21678e.m61019u0(j7, 0, c21689p);
        this.f112635x = c21689p;
        this.f112636y = c21689p2;
    }
}
