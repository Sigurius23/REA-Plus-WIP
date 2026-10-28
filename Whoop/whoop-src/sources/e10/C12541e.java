package e10;

/* JADX INFO: renamed from: e10.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C12541e implements InterfaceC12549i {

    /* JADX INFO: renamed from: a */
    public final EnumC12557m f42851a;

    public C12541e(EnumC12557m enumC12557m) {
        this.f42851a = enumC12557m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12541e) && this.f42851a == ((C12541e) obj).f42851a;
    }

    public final int hashCode() {
        return this.f42851a.hashCode();
    }

    public final String toString() {
        return "Canceled(action=" + this.f42851a + ")";
    }
}
