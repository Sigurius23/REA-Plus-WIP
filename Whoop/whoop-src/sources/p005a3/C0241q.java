package p005a3;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p603x2.AbstractC37831a;
import p636y3.C39174f;

/* JADX INFO: renamed from: a3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C0241q {

    /* JADX INFO: renamed from: a */
    public final float f826a;

    /* JADX INFO: renamed from: b */
    public final float f827b;

    /* JADX INFO: renamed from: c */
    public final float f828c;

    /* JADX INFO: renamed from: d */
    public final float f829d;

    public C0241q(float f13, float f14, float f15, float f16) {
        this.f826a = f13;
        this.f827b = f14;
        this.f828c = f15;
        this.f829d = f16;
        if (f13 < 0.0f) {
            AbstractC37831a.m121373a("Left must be non-negative");
        }
        if (f14 < 0.0f) {
            AbstractC37831a.m121373a("Top must be non-negative");
        }
        if (f15 < 0.0f) {
            AbstractC37831a.m121373a("Right must be non-negative");
        }
        if (f16 >= 0.0f) {
            return;
        }
        AbstractC37831a.m121373a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0241q)) {
            return false;
        }
        C0241q c0241q = (C0241q) obj;
        return C39174f.m124782b(this.f826a, c0241q.f826a) && C39174f.m124782b(this.f827b, c0241q.f827b) && C39174f.m124782b(this.f828c, c0241q.f828c) && C39174f.m124782b(this.f829d, c0241q.f829d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC11266d.m30447a(this.f829d, AbstractC11266d.m30447a(this.f828c, AbstractC11266d.m30447a(this.f827b, Float.hashCode(this.f826a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DpTouchBoundsExpansion(start=");
        AbstractC13673n.m38572s(this.f826a, ", top=", sb4);
        AbstractC13673n.m38572s(this.f827b, ", end=", sb4);
        AbstractC13673n.m38572s(this.f828c, ", bottom=", sb4);
        sb4.append((Object) C39174f.m124783c(this.f829d));
        sb4.append(", isLayoutDirectionAware=true)");
        return sb4.toString();
    }
}
