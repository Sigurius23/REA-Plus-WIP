package p715kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C22689t implements InterfaceC22662d {

    /* JADX INFO: renamed from: w */
    public final Class f89344w;

    public C22689t(Class jClass, String str) {
        AbstractC22676k.m65750j(jClass, "jClass");
        this.f89344w = jClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22689t) {
            return AbstractC22676k.m65745e(this.f89344w, ((C22689t) obj).f89344w);
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22662d
    public final Class getJClass() {
        return this.f89344w;
    }

    public final int hashCode() {
        return this.f89344w.hashCode();
    }

    public final String toString() {
        return this.f89344w.toString() + " (Kotlin reflection is not available)";
    }
}
