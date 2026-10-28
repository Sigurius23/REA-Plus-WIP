package p636y3;

import p000.AbstractC30802r;
import p670z3.InterfaceC40035a;

/* JADX INFO: renamed from: y3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C39182n implements InterfaceC40035a {

    /* JADX INFO: renamed from: a */
    public final float f168426a;

    public C39182n(float f13) {
        this.f168426a = f13;
    }

    @Override // p670z3.InterfaceC40035a
    /* JADX INFO: renamed from: a */
    public final float mo124801a(float f13) {
        return f13 / this.f168426a;
    }

    @Override // p670z3.InterfaceC40035a
    /* JADX INFO: renamed from: b */
    public final float mo124802b(float f13) {
        return f13 * this.f168426a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39182n) && Float.compare(this.f168426a, ((C39182n) obj).f168426a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f168426a);
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f168426a, ')');
    }
}
