package g40;

import java.util.List;
import p035bp.AbstractC3511b;
import p696zy.C41210b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.f1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15349f1 implements InterfaceC15361h1 {

    /* JADX INFO: renamed from: a */
    public final int f57682a;

    /* JADX INFO: renamed from: b */
    public final List f57683b;

    public C15349f1(int i13, List list) {
        this.f57682a = i13;
        this.f57683b = list;
    }

    @Override // g40.InterfaceC15361h1
    /* JADX INFO: renamed from: a */
    public final List mo43555a() {
        return this.f57683b;
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
        if (!(obj instanceof C15349f1)) {
            return false;
        }
        C15349f1 c15349f1 = (C15349f1) obj;
        return this.f57682a == c15349f1.f57682a && AbstractC22676k.m65745e(this.f57683b, c15349f1.f57683b);
    }

    @Override // g40.InterfaceC15361h1
    public final int getMessage() {
        return this.f57682a;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f57682a) * 31;
        List list = this.f57683b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Error(message=" + this.f57682a + ", formatArgs=" + this.f57683b + ")";
    }
}
