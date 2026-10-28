package p309lo;

import p465rm.InterfaceC31582z0;

/* JADX INFO: renamed from: lo.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C24552j {

    /* JADX INFO: renamed from: a */
    public final Object f95820a;

    /* JADX INFO: renamed from: b */
    public C24547e f95821b = new C24547e(0);

    /* JADX INFO: renamed from: c */
    public boolean f95822c;

    /* JADX INFO: renamed from: d */
    public boolean f95823d;

    public C24552j(InterfaceC31582z0 interfaceC31582z0) {
        this.f95820a = interfaceC31582z0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24552j.class != obj.getClass()) {
            return false;
        }
        return this.f95820a.equals(((C24552j) obj).f95820a);
    }

    public final int hashCode() {
        return this.f95820a.hashCode();
    }
}
