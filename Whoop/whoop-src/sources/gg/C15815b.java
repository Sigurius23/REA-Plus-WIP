package gg;

/* JADX INFO: renamed from: gg.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C15815b extends AbstractC15818e {

    /* JADX INFO: renamed from: a */
    public final EnumC15819f f59707a;

    public C15815b(EnumC15819f enumC15819f) {
        this.f59707a = enumC15819f;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC15819f m44619a() {
        return this.f59707a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15815b) && this.f59707a == ((C15815b) obj).f59707a;
    }

    public final int hashCode() {
        return this.f59707a.hashCode();
    }

    public final String toString() {
        return "RetryError(reason=" + this.f59707a + ')';
    }
}
