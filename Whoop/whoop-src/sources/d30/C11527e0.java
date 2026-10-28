package d30;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p181h2.C16617b;
import p181h2.C16618c;
import p636y3.C39180l;

/* JADX INFO: renamed from: d30.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11527e0 {

    /* JADX INFO: renamed from: a */
    public final long f37138a;

    /* JADX INFO: renamed from: b */
    public final long f37139b;

    /* JADX INFO: renamed from: c */
    public final C16618c f37140c;

    public C11527e0(long j7, long j13, C16618c c16618c) {
        this.f37138a = j7;
        this.f37139b = j13;
        this.f37140c = c16618c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11527e0)) {
            return false;
        }
        C11527e0 c11527e0 = (C11527e0) obj;
        return C16617b.m47187c(this.f37138a, c11527e0.f37138a) && C39180l.m124799a(this.f37139b, c11527e0.f37139b) && this.f37140c.equals(c11527e0.f37140c);
    }

    public final int hashCode() {
        return this.f37140c.hashCode() + AbstractC11266d.m30451e(Long.hashCode(this.f37138a) * 31, this.f37139b, 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CoordinateSnapshot(positionInWindow=", C16617b.m47194j(this.f37138a), ", size=", C39180l.m124800b(this.f37139b), ", boundsInWindow=");
        sbM32001t.append(this.f37140c);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
