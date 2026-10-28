package p163g1;

import p127ev.AbstractC13673n;
import p636y3.C39174f;

/* JADX INFO: renamed from: g1.w7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15183w7 {

    /* JADX INFO: renamed from: a */
    public final float f56983a;

    /* JADX INFO: renamed from: b */
    public final float f56984b;

    public C15183w7(float f13, float f14) {
        this.f56983a = f13;
        this.f56984b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15183w7)) {
            return false;
        }
        C15183w7 c15183w7 = (C15183w7) obj;
        return C39174f.m124782b(this.f56983a, c15183w7.f56983a) && C39174f.m124782b(this.f56984b, c15183w7.f56984b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f56984b) + (Float.hashCode(this.f56983a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TabPosition(left=");
        float f13 = this.f56983a;
        AbstractC13673n.m38572s(f13, ", right=", sb4);
        float f14 = this.f56984b;
        sb4.append((Object) C39174f.m124783c(f13 + f14));
        sb4.append(", width=");
        sb4.append((Object) C39174f.m124783c(f14));
        sb4.append(')');
        return sb4.toString();
    }
}
