package a00;

import p599wz.C37738n;

/* JADX INFO: renamed from: a00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C0067b implements InterfaceC0069d {

    /* JADX INFO: renamed from: a */
    public final C37738n f206a;

    public C0067b(C37738n c37738n) {
        this.f206a = c37738n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0067b) && this.f206a.equals(((C0067b) obj).f206a);
    }

    public final int hashCode() {
        return this.f206a.hashCode();
    }

    public final String toString() {
        return "Completed(linkActivityResult=" + this.f206a + ")";
    }
}
