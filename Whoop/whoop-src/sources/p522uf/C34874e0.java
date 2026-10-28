package p522uf;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: uf.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C34874e0 implements InterfaceC34878g0 {

    /* JADX INFO: renamed from: a */
    public final int f146904a;

    /* JADX INFO: renamed from: b */
    public final String f146905b;

    public C34874e0(int i13) {
        this.f146904a = i13;
        this.f146905b = AbstractC2875y.m8295h(i13, "Attempt #");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34874e0) && this.f146904a == ((C34874e0) obj).f146904a;
    }

    @Override // p522uf.InterfaceC34878g0
    public final String getDescription() {
        return this.f146905b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f146904a);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("Attempt(attempt="), this.f146904a, ')');
    }
}
