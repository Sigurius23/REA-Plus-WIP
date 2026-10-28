package g40;

import p000.AbstractC11266d;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.n3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15396n3 implements InterfaceC15357g3 {

    /* JADX INFO: renamed from: a */
    public final String f57847a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41211c f57848b;

    /* JADX INFO: renamed from: c */
    public final int f57849c;

    /* JADX INFO: renamed from: d */
    public final boolean f57850d;

    public C15396n3(String id4, InterfaceC41211c interfaceC41211c, int i13, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f57847a = id4;
        this.f57848b = interfaceC41211c;
        this.f57849c = i13;
        this.f57850d = z4;
    }

    @Override // g40.InterfaceC15357g3
    /* JADX INFO: renamed from: a */
    public final boolean mo7513a() {
        return this.f57850d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15396n3)) {
            return false;
        }
        C15396n3 c15396n3 = (C15396n3) obj;
        return AbstractC22676k.m65745e(this.f57847a, c15396n3.f57847a) && AbstractC22676k.m65745e(this.f57848b, c15396n3.f57848b) && this.f57849c == c15396n3.f57849c && this.f57850d == c15396n3.f57850d;
    }

    @Override // g40.InterfaceC15357g3
    public final Integer getIcon() {
        return Integer.valueOf(this.f57849c);
    }

    @Override // g40.InterfaceC15357g3
    public final InterfaceC41211c getLabel() {
        return this.f57848b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57850d) + AbstractC11266d.m30448b(this.f57849c, (this.f57848b.hashCode() + (this.f57847a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Item(id=" + this.f57847a + ", label=" + this.f57848b + ", icon=" + this.f57849c + ", enabled=" + this.f57850d + ")";
    }
}
