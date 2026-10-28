package g00;

import p490t0.C33252i;
import p636y3.C39174f;

/* JADX INFO: renamed from: g00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C14932c {

    /* JADX INFO: renamed from: a */
    public final C33252i f55688a;

    /* JADX INFO: renamed from: b */
    public final C33252i f55689b;

    /* JADX INFO: renamed from: c */
    public final C33252i f55690c;

    /* JADX INFO: renamed from: d */
    public final float f55691d;

    public C14932c(C33252i c33252i, C33252i c33252i2, C33252i c33252i3, float f13) {
        this.f55688a = c33252i;
        this.f55689b = c33252i2;
        this.f55690c = c33252i3;
        this.f55691d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14932c)) {
            return false;
        }
        C14932c c14932c = (C14932c) obj;
        return this.f55688a.equals(c14932c.f55688a) && this.f55689b.equals(c14932c.f55689b) && this.f55690c.equals(c14932c.f55690c) && C39174f.m124782b(this.f55691d, c14932c.f55691d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f55691d) + ((this.f55690c.hashCode() + ((this.f55689b.hashCode() + (this.f55688a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LinkShapes(extraSmall=" + this.f55688a + ", default=" + this.f55689b + ", primaryButton=" + this.f55690c + ", primaryButtonHeight=" + C39174f.m124783c(this.f55691d) + ")";
    }
}
