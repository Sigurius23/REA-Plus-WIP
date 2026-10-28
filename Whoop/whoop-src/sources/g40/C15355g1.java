package g40;

import java.util.List;
import p031b9.AbstractC2875y;
import p035bp.AbstractC3511b;
import p696zy.C41210b;

/* JADX INFO: renamed from: g40.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15355g1 implements InterfaceC15361h1 {

    /* JADX INFO: renamed from: a */
    public final int f57728a;

    public C15355g1(int i13) {
        this.f57728a = i13;
    }

    @Override // g40.InterfaceC15361h1
    /* JADX INFO: renamed from: a */
    public final List mo43555a() {
        return null;
    }

    @Override // g40.InterfaceC15361h1
    /* JADX INFO: renamed from: b */
    public final C41210b mo43556b() {
        return AbstractC3511b.m10393v(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15355g1) && this.f57728a == ((C15355g1) obj).f57728a;
    }

    @Override // g40.InterfaceC15361h1
    public final int getMessage() {
        return this.f57728a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57728a) * 31;
    }

    public final String toString() {
        return AbstractC2875y.m8296i(this.f57728a, "Warning(message=", ", formatArgs=null)");
    }
}
